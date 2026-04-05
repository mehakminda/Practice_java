package com.test.designPattern.interview.DesignBookMyShow;

import com.test.designPattern.interview.DesignBookMyShow.controllers.BookingController;
import com.test.designPattern.interview.DesignBookMyShow.controllers.TheatreController;
import com.test.designPattern.interview.DesignBookMyShow.entities.*;
import com.test.designPattern.interview.DesignBookMyShow.enums.City;
import com.test.designPattern.interview.DesignBookMyShow.enums.SeatType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BookMyShowApp {
    private TheatreController theatreController;
    private BookingController bookingController;

    public static void main(String[] args) {
        BookMyShowApp app = new BookMyShowApp();
        app.initialize();
        app.userFlow();
    }

    private void initialize() {
        theatreController = new TheatreController();
        bookingController = new BookingController();


        /*
         * 1. Create Movies
         */
        Movie baahubali = new Movie("BAAHUBALI");
        Movie avengers = new Movie("AVENGERS");


        /*
         * 2. Create Theatre -> Screen -> Seats
         */
        Screen inoxScreen1 = new Screen(1,createSeats());
        Theatre inoxTheatreBanglore = new Theatre("INOX",  List.of(inoxScreen1), City.BANGALORE);

        Screen pvrScreen1 = new Screen(1, createSeats());
        Screen pvrScreen2 = new Screen(2, createSeats());
        Theatre pvrTheatreDelhi = new Theatre("PVR", List.of(pvrScreen2,pvrScreen1), City.DELHI);

        theatreController.addThreatre(pvrTheatreDelhi);
        theatreController.addThreatre(inoxTheatreBanglore);

        /*
         * 3. Create Shows
         */
        Show inoxMorningShowToday = new Show(
                baahubali,
                inoxScreen1,
                LocalDate.now(),
                LocalTime.of(8, 0)
        );

        Show inoxAfternoonShowToday = new Show(
                baahubali,
                inoxScreen1,
                LocalDate.now(),
                LocalTime.of(15, 0)
        );

        Show inoxEveningShowToday = new Show(
                avengers,
                inoxScreen1,
                LocalDate.now(),
                LocalTime.of(18, 0)
        );


        Show pvrMorningShowTomorrow = new Show(
                baahubali,
                pvrScreen1,
                LocalDate.now().plusDays(1),
                LocalTime.of(9, 0)
        );

        // Attach shows to screens
        inoxScreen1.addShow(inoxMorningShowToday);
        inoxScreen1.addShow(inoxAfternoonShowToday);
        inoxScreen1.addShow(inoxEveningShowToday);
        pvrScreen1.addShow(pvrMorningShowTomorrow);

    }

    private List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            seats.add(new Seat(i, SeatType.SILVER));
        }
        return seats;
    }

    /*
     * USER FLOW (END TO END)
     */
    private void userFlow() {

        // User enters system
        User user = new User("U1", "Mehak");

        System.out.println("User logged in: Mehak");

        // 1. User selects city
        City selectedCity = City.BANGALORE;
        System.out.println("Selected City: " + selectedCity);

        // 2. for specific date, Show movies running in city
        LocalDate selectedDate = LocalDate.now();
        System.out.println("Selected Date: " + selectedDate);

        Set<Movie> movies = theatreController.getMovies(selectedCity, selectedDate);
        System.out.println("Movies available:");
        movies.forEach(m -> System.out.println(" - " + m.getName()));

        // 3. User selects movie
        Movie selectedMovie = movies.iterator().next(); //selecting first movie
        System.out.println("Selected Movie: " + selectedMovie.getName());


        // 4. Show theatres and show times in city
        List<Theatre> theatres = theatreController.getThreatre(selectedCity, selectedMovie, selectedDate);
        System.out.println("Theatres available:");
        theatres.forEach(t -> System.out.println(" - " + t.getName()));

        // 6. User selects theatre
        Theatre selectedTheatre = theatres.get(0);
        System.out.println("Selected Theatre: " + selectedTheatre.getName());

        // 7. Show running shows for movie + date + theatre
        List<Show> shows =
                theatreController.getShows(
                        selectedTheatre,
                        selectedDate,
                        selectedMovie
                );

        System.out.println("Shows available:");
        shows.forEach(s ->
                System.out.println(" - " + s.getShowTime())
        );

        // 8. User selects show
        Show selectedShow = shows.get(0);
        System.out.println("Selected Show Time: " + selectedShow.getShowTime());

        // 9. User selects seats
        List<Integer> selectedSeats = List.of(1, 2, 3);
        System.out.println("Selected Seats: " + selectedSeats);

        // 10. Booking + Payment
        Booking booking =
                bookingController.createBooking(
                        user,
                        selectedShow,
                        selectedSeats
                );

        System.out.println("BOOKING SUCCESSFUL");
        System.out.println("Booking ID: " + booking.getBookingID());
    }



}

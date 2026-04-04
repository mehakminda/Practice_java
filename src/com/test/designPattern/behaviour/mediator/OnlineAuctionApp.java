package com.test.designPattern.behaviour.mediator;

public class OnlineAuctionApp {
    static void main() {
        // Create a Mediator for 2 different auction
        AutionMediator mediator1 =new AuctionHouse("Auction-1",100);
        AutionMediator mediator2 =new AuctionHouse("Auction-2",5000);

        //create bidder
        IColleague bidder1 =new Bidder("Bidder-1",mediator1);
        IColleague bidder2 =new Bidder("Bidder-2",mediator1);
        IColleague bidder3 =new Bidder("Bidder-3",mediator1);

        IColleague bidder4 =new Bidder("Bidder-4",mediator2);
        IColleague bidder5 =new Bidder("Bidder-5",mediator2);

        // Register Colleagues/Components with Mediator - AuctionHouse Constructor

        // Use Colleagues/Components
        bidder1.placeBid(200);
        bidder2.placeBid(400);
        bidder2.placeBid(300); //bid will not be accepted
        // Admin closes the auction1
        mediator1.closeAuction();

        System.out.println("-----------------------------------------");
        bidder4.placeBid(10000);

        // Admin closes the auction2
        mediator2.closeAuction();

    }
}

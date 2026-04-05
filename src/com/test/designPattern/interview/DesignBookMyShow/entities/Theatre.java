package com.test.designPattern.interview.DesignBookMyShow.entities;

import com.test.designPattern.interview.DesignBookMyShow.enums.City;

import java.util.List;

public class Theatre {
   private final String name;
   private final List<Screen> screens;
   private final City city;

   public Theatre(String name, List<Screen> screens, City city) {
      this.name = name;
      this.screens = screens;
      this.city = city;
   }

   public String getName() {
      return name;
   }

   public List<Screen> getScreens() {
      return screens;
   }

   public City getCity() {
      return city;
   }
}

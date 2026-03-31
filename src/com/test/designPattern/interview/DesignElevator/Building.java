package com.test.designPattern.interview.DesignElevator;

import java.util.List;

public class Building {
    public final List<Floors> floorsList;

    public Building(List<Floors> floorsList) {
        this.floorsList = floorsList;
    }
}

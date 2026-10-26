package com.navigation.strategy;

import com.navigation.Route;

public class CycleStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KMH = 15.0;

    @Override
    public Route planRoute(String from, String to) {
        double distance = distanceEstimate(from, to) * 1.1; // bike lanes detour
        int minutes = (int) Math.round(distance / AVERAGE_SPEED_KMH * 60);
        return new Route("Cycling route: " + from + " -> " + to + " via bike lanes", distance, minutes);
    }

    @Override
    public String name() {
        return "Cycle";
    }

    private double distanceEstimate(String from, String to) {
        return Math.abs(from.hashCode() % 100) + Math.abs(to.hashCode() % 100);
    }
}

package com.navigation.strategy;

import com.navigation.Route;

public class WalkStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KMH = 5.0;

    @Override
    public Route planRoute(String from, String to) {
        double distance = distanceEstimate(from, to); // pedestrian shortcuts
        int minutes = (int) Math.round(distance / AVERAGE_SPEED_KMH * 60);
        return new Route("Walking route: " + from + " -> " + to + " via footpaths", distance, minutes);
    }

    @Override
    public String name() {
        return "Walk";
    }

    private double distanceEstimate(String from, String to) {
        return Math.abs(from.hashCode() % 100) + Math.abs(to.hashCode() % 100);
    }
}


package com.navigation;

public final class Route {

    private final String description;
    private final double distanceKm;
    private final int estimatedMinutes;

    public Route(String description, double distanceKm, int estimatedMinutes) {
        this.description = description;
        this.distanceKm = distanceKm;
        this.estimatedMinutes = estimatedMinutes;
    }

    public String description() { return description; }
    public double distanceKm() { return distanceKm; }
    public int estimatedMinutes() { return estimatedMinutes; }

    @Override
    public String toString() {
        return String.format("%s (%.1f km, ~%d min)", description, distanceKm, estimatedMinutes);
    }
}
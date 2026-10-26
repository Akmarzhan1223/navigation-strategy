package com.navigation.strategy;

import com.navigation.Route;

public interface RouteStrategy {
    Route planRoute(String from, String to);
    String name();
}

package com.navigation;

import com.navigation.strategy.RouteStrategy;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy must not be null");
        }
        this.strategy = strategy;
    }

    public Route buildRoute(String from, String to) {
        return strategy.planRoute(from, to);
    }

    public String currentStrategyName() {
        return strategy.name();
    }
}
package com.navigation;

import com.navigation.strategy.CarStrategy;
import com.navigation.strategy.CycleStrategy;
import com.navigation.strategy.RouteStrategy;
import com.navigation.strategy.WalkStrategy;

public class Main {

    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarStrategy());
        System.out.println("Strategy: " + navigator.currentStrategyName());
        System.out.println(navigator.buildRoute("Home", "Office"));

        navigator.setStrategy(new WalkStrategy());
        System.out.println("Strategy: " + navigator.currentStrategyName());
        System.out.println(navigator.buildRoute("Home", "Office"));

        navigator.setStrategy(new CycleStrategy());
        System.out.println("Strategy: " + navigator.currentStrategyName());
        System.out.println(navigator.buildRoute("Home", "Office"));
    }
}
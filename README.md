# Navigation Strategy Pattern

This project is a Java implementation of the **Strategy Design Pattern** applied to a Navigation/Route Planning system. It demonstrates how to define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

## Domain
A `Navigator` context plans routes using interchangeable algorithms (Car, Walk, Cycle). Instead of using long `if-else` or `switch` statements to determine which routing algorithm to use, the `Navigator` delegates the execution to a `RouteStrategy` interface. The client selects and configures the appropriate strategy at runtime.

## Project Structure
```text
src
 └── com.navigation
      ├── Main.java              # Client: selects and switches strategies
      ├── Navigator.java         # Context: delegates execution to a strategy
      ├── Route.java             # Model: immutable value object for route data
      └── strategy
           ├── RouteStrategy.java # Strategy Interface
           ├── CarStrategy.java   # Concrete Strategy
           ├── WalkStrategy.java  # Concrete Strategy
           └── CycleStrategy.java # Concrete Strategy
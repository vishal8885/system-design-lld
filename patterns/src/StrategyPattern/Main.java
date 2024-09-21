package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
        vehicle = new NormalVehicle();
        vehicle.drive();
    }
}

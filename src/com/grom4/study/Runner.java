package com.grom4.study.car;

public class Runner {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Land Rover", "Range Rover Sport", 2016, "Black", 48000.00, "HH3337HH"),
                new Car("Volkswagen", "Passat", 2022, "Blue", 35000.00, "AA0001AA"),
                new Car("Skoda", "Octavia", 2022, "White", 40000.00, "AE7770AE"),
                new Car("Volkswagen", "Tiguan", 2022, "Black", 110200.00, "KE9669AE"),
                new Car("Mercedes", "C", 2016, "Red", 30900.00, "KA0010AK"),
                new Car("BMW", "M5", 2013, "White", 37000.00, "AA3232KA")
                    };

                     CarProcessor processor = new CarProcessor();
                     processor.searchByBrand(cars, "Land Rover");
                     processor.searchByModel(cars, "M5", 8 );
                     processor.searchByYear(cars, 2022, 30000.00);
    }
}

package com.grom4.study.car;

public class CarProcessor {
    public void searchByBrand(Car[] cars, String brand) {
            int carNumber = 1;
                 System.out.println("Search for cars with a brand " + brand + ":");
                    for (int i = 0; i < cars.length; i++) {
                         if (cars[i].brand.equals(brand)) {
                             System.out.println(carNumber + ") " + "Brand: " + cars[i].brand + "; " +
                                     "Model: " + cars[i].model + "; " +
                                     "Year: " + cars[i].year + "; " +
                                     "Color: " + cars[i].color + "; " +
                                     "Price: " + cars[i].price + " EURO; " +
                                     "Registration : " + cars[i].registration + ";");
                             carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not Available");
        }
        System.out.println();
    }

        public void searchByModel(Car[] cars, String model, int yearsOperation) {
          int currentYear = 2022;
            int carNumber = 1;
                System.out.println("Search for cars with a model " + model + ", that has been in use more than "
                + yearsOperation + " years:");
                     for (int i = 0; i < cars.length; i++) {
                         if (cars[i].model.equals(model) && yearsOperation < currentYear - cars[i].year) {
                            System.out.println(carNumber + ") " + "Brand: " + cars[i].brand + "; " +
                                    "Model: " + cars[i].model + "; " +
                                     "Year: " + cars[i].year + "; " +
                                    "Color: " + cars[i].color + "; " +
                                    "Price: " + cars[i].price + " EURO; " +
                                    "Registration: " + cars[i].registration + ";");
                            carNumber++;
                         }
        }
        if (carNumber == 1) {
            System.out.println("Not Available");
        }
        System.out.println();
    }

    public void searchByYear(Car[] cars, int year, double price) {
         int carNumber = 1;
             System.out.println("Look for a car made in " + year +
                ", whose price is more than " + price + " EURO:");
                 for (int i = 0; i < cars.length; i++) {
                      if (cars[i].year == year && cars[i].price > price) {
                        System.out.println(carNumber + ") " + "Brand: " + cars[i].brand + "; " +
                             "Model: " + cars[i].model + "; " +
                             "Year: " + cars[i].year + "; " +
                             "Color: " + cars[i].color + "; " +
                             "Price: " + cars[i].price + " EURO; " +
                             "Registration: " + cars[i].registration + ";");
                        carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("Not Available");
        }
        System.out.println();
    }
}

package CarMangement;

import java.util.Scanner;

public class Car extends Showroom implements utility {
    String car_name;
    String car_color;
    int car_price;
    String car_fuel_type;
    String car_type;
    String car_transmission;
    public void get_details(){
        System.out.println("Name: "+ car_name);
        System.out.println("Color:"+car_color);
        System.out.println("Price: "+ car_price);
        System.out.println("Car fuel type:"+car_fuel_type);
        System.out.println("Car type: "+ car_type);
        System.out.println("Transmission: "+car_transmission);
    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------*** PLEASE ENTER THE CAR DETAILS ***----------");
        System.out.print("Name: ");
        car_name = sc.next();
        System.out.print("Color:");
        car_color = sc.next();
        System.out.print("Price");
        car_price = sc.nextInt();
        System.out.print("Car fuel type:");
        car_fuel_type = sc.next();
        System.out.print("Car type: ");
        car_type = sc.next();
        System.out.print("Transmission");
        car_transmission = sc.next();
        total_car_in_stock++;
    }
}

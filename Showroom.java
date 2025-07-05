package CarMangement;

import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_car_in_stock;
    String manager_name;
    public void get_details(){

        System.out.println("Showroom name: "+showroom_name);
        System.out.println("Showroom address:"+showroom_address);
        System.out.println("Manager name :"+ manager_name);
        System.out.println("Total employees:"+total_employees);
        System.out.println("Total car in stock:"+total_car_in_stock);
    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-------*** ENTER SHOWROOM DETAILS ***--------");
        System.out.println();
        System.out.print("SHOWROOM NAME:");
        showroom_name = sc.nextLine();
        System.out.print("SHOWROOM ADDRESS:");
        showroom_address = sc.nextLine();
        System.out.print("MANAGER NAME:");
        manager_name = sc.nextLine();
        System.out.print("TOTAL NUMBER OF EMPLOYEES:");
        total_employees = sc.nextInt();
        System.out.print("TOTAL CAR IN STOCK:");
        total_car_in_stock = sc.nextInt();
    }
}

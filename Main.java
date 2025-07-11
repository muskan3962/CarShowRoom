package CarMangement;

import java.util.Scanner;

interface utility{
    public void get_details();
    public void set_details();
}

public class Main {
     static void main_menu(){
         System.out.println();
         System.out.println("------- *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** --------");
         System.out.println();
         System.out.println("--------***  ENTER YOUR CHOICE  ***--------");
         System.out.println();
         System.out.println("1]. ADD SHOWROOM \t\t\t 2].ADD EMPLOYEES \t\t\t  3]. ADD CAR");
         System.out.println("4].GET SHOWROOM \t\t\t    5]. GET EMPLOYEES\t\t\t 6].GET CAR");
         System.out.println();
         System.out.println("------- *** ENTER 0 TO EXIT *** --------");
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employs employees[] = new Employs[5];
        Car car[]= new Car[5];
        int car_counter =0;
        int showroom_counter =0;
        int employees_counter =0;
        int choice =100;
        while(choice!=0){

            main_menu();
            choice = sc.nextInt();
            while(choice!=9 && choice!=0){
                switch(choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println("1].Add new showroom");
                        System.out.println("9]. Go back to main menu");
                        choice =sc.nextInt();
                        break;
                    case 2:
                        employees[employees_counter] = new Employs();
                        employees[employees_counter].set_details();
                        employees_counter++;
                        System.out.println("2].Add new employees");
                        System.out.println("9]. Go back to main menu");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Car();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println("3].Add new car");
                        System.out.println("9]. Go back to main menu");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for(int i=0;i<showroom_counter;i++){
                            showroom[i].get_details();
                            System.out.println("\n");
                        }
                        System.out.println();
                        System.out.println("9]. Go back to main menu");
                        System.out.println("0]. Exit");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for(int i=0;i<employees_counter;i++){
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. Go back to main menu");
                        System.out.println("0]. Exit");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for(int i=0;i<car_counter;i++){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. Go back to main menu");
                        System.out.println("0]. Exit");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("Enter valid choice");
                        break;
                }
            }
        }
    }

}

package CarMangement;

import java.util.Scanner;
import java.util.UUID;

public class Employs extends Showroom implements utility {
    String employ_name;
    String employ_id;
    String employ_post;
    int employ_salary;
    int employ_age;
    public void get_details(){
        System.out.println("Id:");
        System.out.println("Name:"+employ_name);
        System.out.println("Post:"+employ_post);
        System.out.println("Salary :"+employ_salary);
        System.out.println("Age: "+employ_age);
        System.out.println("Showroom Name: "+showroom_name);
    }
    public void set_details(){

        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        employ_id = String.valueOf(uuid);
        System.out.println("-------*** PLEASE ENTER THE EMPLOYEES DETAILS ***----------\n");
        System.out.println();

        System.out.print("Name:");
        employ_name = sc.nextLine();

        System.out.print("Post:");
        employ_post =sc.nextLine();

        System.out.print("Salary :");
        employ_salary =sc.nextInt();

        System.out.print("Age:");
        employ_age =sc.nextInt();

        System.out.print("showroom Name:");
        showroom_name = sc.nextLine();



    }
}

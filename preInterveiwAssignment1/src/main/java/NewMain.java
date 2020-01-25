/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arda
 */
import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        greeting();
    }
    public static void greeting()   {
    Scanner scanner1 = new Scanner(System.in);
    System.out.println("What is your first name?");
    String firstName = scanner1.nextLine();
    System.out.println("What is your last name?");
    String lastName = scanner1.nextLine();
    System.out.println("Hello " + firstName + " " + lastName);
    
    }
}

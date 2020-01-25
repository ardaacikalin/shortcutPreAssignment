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
public class NewMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        currentAge();
    }
    
    public static void currentAge(){
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("What is your birth year?");
        int birthYear = Integer.parseInt(scanner1.nextLine());
        System.out.println("What is the current year?");
        int currentYear = Integer.parseInt(scanner1.nextLine());
        System.out.println("You are " + (currentYear-birthYear) + " years old!");
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caalculator;
public class Main{
    public static double divission (double first, double second){
        if (second == 0) {
            System.out.println("Error");
            return 0;
        }
        return first/second;
    }

    public static double substraction (double first, double second){
        return first-second;
    }

    public static double addition (double first, double second){
        return first+second;
    }

    public static double multiplication (double first, double second){
        return first*second;
    }
    public static void main(String[] args) {
        double first = 264.4;
        double second = 45.3;
        System.out.println(divission(first, second));
        System.out.println(substraction(first, second)); //we add a breakpoint
        System.out.println(addition(first, second)); // and we can desplay all statment
        System.out.println(multiplication(first, second));
    }


    
}

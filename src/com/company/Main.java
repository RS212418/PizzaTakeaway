package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Here are your choices of pizzas");
        String[] pizzas = {"Small", "Medium", "Large"};
        double [] prices = {7.99,10.99,13.99};
        System.out.println(Arrays.deepToString(pizzas));
        System.out.println(Arrays.toString(prices));
        final double smallprice = 7.99;
        final double mediumprice = 10.99;
        final double largeprice = 13.99;
        double totalpizzaprice = 0;



        try{
            System.out.println("What size pizza would you like small[1], medium[2], large[3]?");
            int size = input.nextInt();
            if (size == 1){
                 totalpizzaprice = 7.99;
            }else if (size == 2){
                 totalpizzaprice = 10.99;
            }else if (size ==3){
                 totalpizzaprice = 13.99;
            }
            System.out.println("What two toppings would you like");
            String topping1 = input.next();
            String topping2 = input.next();

            System.out.println("How many additional toppings would you like would you like, no more than 3?");
            int numberofadditionaltoppings = input.nextInt();
            System.out.println("What additional toppings would you like?");

            double totalcostoftoppings = (numberofadditionaltoppings * 1.25);
            double totalcost = (totalcostoftoppings + totalpizzaprice);
            System.out.println("Your total cost is £" + totalcost);
            System.out.println("Your toppings are" + topping1 + topping2);
        }
        catch (Exception e){
            System.out.println("Exception occured" + e);
            input.next();
        }
    }
}


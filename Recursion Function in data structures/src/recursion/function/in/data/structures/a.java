/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion.function.in.data.structures;

/**
 *
 * @author Mohamed Abu Jalhoum
 */

import java.util.Scanner;

public class a
{
    
            static void DisplayMenu()
        {
            System.out.println("Welcome to our Pizza restaurant!!!");
            System.out.println("Please select one of items");
            System.out.println("1- SUPPER SUPREME    - S=50      / M=75.5     / L=100");
            System.out.println("2- CHECKEN SUPREME   - S=45      / M=73.88    / L=97.99");
            System.out.println("3- MARGHERETA        - S=35      / M=70       / L=95");
            System.out.println("4- CHEESE LOVERS     - S=60      / M=87.75    / L=113.16");
            System.out.println("5- SEA FOOD LOVERS   - S=64      / M=94.3     / L=123.25");
            System.out.println();             
        }

    public static String DisplaySelection(int pizza)
        {
           String selectedPizza = "";
            switch(pizza)
            {
                case 1:
                    selectedPizza = "SUPPER SUPREME";
                    break;
                case 2:
                    selectedPizza = "CHECKEN SUPREME";
                    break;
                case 3:                    
                    selectedPizza = "MARGHERETA";
                    break;
                case 4:
                    selectedPizza = "CHEESE LOVERS";
                    break;
                case 5:
                    selectedPizza = "SEA FOOD LOVERS";
                    break;
            }

            return selectedPizza;
        }

 public static double GetPizzaPrice(int pizza,String size)
        {
            double price = 0;
            switch(pizza)
            {
                case 1:
                    if (size.equals( "S"))
                        price = 50;
                    if (size.equals( "M"))
                        price = 75.5;
                    if(size.equals( "L"))
                        price =100;
                    break;
                case 2:
                   if (size.equals("S"))
                        price = 45;
                  if (size .equals( "M"))
                        price = 73.88;
                  if(size .equals( "L"))
                        price = 97.99;
                    break;
                case 3:
                    if (size .equals( "S"))
                        price = 35;
                   if (size .equals( "M"))
                        price = 70;
                   if(size .equals( "L"))
                        price = 95;
                    break;
                case 4:
                   if (size .equals( "S"))
                        price = 60.96;
                   if (size .equals( "M"))
                        price = 87.75;
                   if(size .equals( "L"))
                        price = 11.16;
                    break;
                case 5:
                   if (size .equals( "S"))
                        price = 64.47;
                   if (size .equals( "M"))
                        price = 94.30;
                   if(size .equals( "L"))
                        price = 123.25;
                    break;                    
            }

            return price;
        }

        static int GetToppingPrice(String topping)
        {
            int price = 0;
            switch (topping)
            {
                case "mashroom":
                    price = 10;
                    break;
                case "onion":
                    price = 5;
                    break;
                case "sausage":
                    price = 10;
                    break;
            }

            return price;
        }

public static void main(String[] args) {
              a n = new a();
              n.DisplayMenu();
              String p = n.DisplaySelection(2);
              System.out.println(p);
              System.out.println(n.GetPizzaPrice(1, "M"));
            Scanner keyboard = new Scanner (System.in);
            String in2;

            int pizza;
            int quantity;
            String pizzaSize;
            String topping = "";
            String print="";
            String needTopping;

            double pizzaPrice = 0;
                    
            double totalPrice = 0;

            do{
                pizza = 0;
                topping = "";

                //1- Display Menu
                DisplayMenu();
                
                //2- Get order
                pizza =keyboard.nextInt();
               System.out.print("You Select ");
                System.out.println(DisplaySelection(pizza));
                System.out.println();
    
                //3- Get Quantity
                System.out.println("Enter your quantity");
                quantity =keyboard.nextInt();             

                //4- Get Pizza Size
                System.out.println("Enter Size");
                pizzaSize =keyboard.next();

                //5- Ask for topping
                System.out.println("Do you want extra topping?");
                needTopping = keyboard.next();
                
                String toppingWord = "";
                
                if(needTopping .equals( "Yes"))
                {
                    System.out.println("Please select one (mushroom = 10, onion = 5, sausage = 10)");
                    topping =keyboard.next();
                }

                //6- Get Prices
                pizzaPrice = GetPizzaPrice(pizza, pizzaSize);
               int toppingPrice  = GetToppingPrice(topping);

                if(needTopping.equals( "Yes")){
                    toppingWord = "+" + toppingPrice ;
                }else {
                    toppingWord = "";
                }
                
                totalPrice += quantity * (pizzaPrice + toppingPrice);
                print += "(" + quantity +"*(" +pizzaPrice + toppingWord +")" + ")";

                //6- Ask reorder
                System.out.println();
                System.out.println("Do you want another item?");
                in2 = keyboard.next();
                if(in2.equals("Yes")){
                    print+="+";
                }
            }
            while (in2.equals( "Yes"));

            System.out.print("Thank you for using our application. Your bill = ");
          
             System.out.print(totalPrice + " " );
              System.out.print(print);
        }
}
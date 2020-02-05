package com.qa.peers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorials {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the number:");
            int number = sc.nextInt();
            System.out.println("You entered "+number);
            if(number<1)
            throw new InputMismatchException();
            else if(number==1){
                System.out.println("0! is "+number+" and 1! is "+number);
               System.exit(0);
                sc.close();
            }
            int NUMBER = number;
            int i = 2;
            for(;;i++){
                number/=i;
                if(number==1){
                    System.out.println(i+"! is "+NUMBER);
                    break;
                }
                else if(number==0){
                    System.out.println("No factorial is "+NUMBER);
                    break;
                }
            }
        }
        catch(InputMismatchException e){
            System.out.println("\nError: "+e);
        }
        finally{
            sc.close();
        }
    }

}

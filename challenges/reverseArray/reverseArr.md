# Reverse an Array
The code fellows asked us to Write a function called reverseArray which takes an array as an argument. Without utilizing any of the built-in methods available to your language, return an array with elements in reversed order.

## Whiteboard Process
![Reverse Array Callenge](reverseArray.png)

## Approach & Efficiency
Using For Loop.

## Code

public class Main{

    public static void main(String[] args) {

    Integer[] intArray = [1,2,3,4];

        System.out.println("Original Array:");

    for(int i=0;i<intArray.length;i++)

         System.out.print(intArray[i] + "  ");
     
    System.out.println();

   System.out.println("Original Array printed in reverse order:");

         for(int i=intArray.length-1;i>=0;i--)

         System.out.print(intArray[i] + "  ");

    }
    
}
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Insertion.Sort;
import java.util.Arrays;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        int[] array = {8,4,23,42,16,15};
       System.out.println(Arrays.toString(insertionSort(array)));
    }
    public static int[] insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int j = i-1;
            int temp = array[i];

            while (j>=0 && temp<array[j]){
                array[j+1] = array[j];
                j-1;
            }
            array[j+1] = temp;
        }
        return array;
    }
}

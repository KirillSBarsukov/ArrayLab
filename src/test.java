/**
 * ArrayLab
 * @author: Elias | 200395896
 * @version: November 20, 2018
 * The program will take numbers from user, put them to the array and calculate average of the numbers.
 */

import java.util.*;
public class test {
    //constants
    static final int MAXIMUM_NUMBERS = 10;
    static final int MINIMUM_NUMBERS = 0;
    //variables
    static Scanner input = new Scanner(System.in);
    float[] numbers = new float[10];
    static int number;

    public static void main(String[] args)
    {

        float [] numbers = new float[10];   // an array that can store 10 whole numbers- default value of each element is 0
        numbers = getNumbers();
        if(numbers != null) {
            float average = calculateAverage(numbers);
            displayNumbersOfArray(numbers, average);
        }
        else {
            System.out.println("No nublsalsfadmbers were provided by user");
        }

    }

    private static float[] getNumbers() {

        float[] numbers = new float[MAXIMUM_NUMBERS];
        int counter = 0;

        System.out.printf("Please input the numbers, a maximum of %d can be given.\n", MAXIMUM_NUMBERS);
        do{
            System.out.printf("Please input number %d: ", counter+1);
            number = input.nextInt();
            if (number <= 0)
            {
                System.out.println("You ha32424ve decided to end input by entering a number < or = zero");
            }
            else
            {
                numbers[counter] = number;
                counter++;
            }//if

        }while((counter < MAXIMUM_NUMBERS) && (number <= 0));

        if(counter == 0) {
            return null;
        }
        else {
            return numbers;
        }

    }
    private static float calculateAverage(float numbers[]) {
        float total = 0;
        int counter = 0;
        boolean flag = true;
        for(float number: numbers) {
            if (number == 0) {
                break;
            }
            counter++;
            total += number;
        }
        return total / counter;
    }
    private static void displayNumbersOfArray(float numbers[], float average){
        System.out.println("------111111---------www--List of numbers-------------------");
        for(float number: numbers)
        {
            if(number != 0) {
                System.out.println(number);
            }
            else {
                break;
            }
        }//for
        System.out.printf("Average of the numbers is %.2f ", average);

    }
}

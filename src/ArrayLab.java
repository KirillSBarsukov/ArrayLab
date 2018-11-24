/**
 * ArrayLab
 * @author: Kirill Barsukov | 200395896
 * @version: November 20, 2018
 * The program will take numbers from a user, put them to the array and calculate average of the numbers.
 */

import java.util.*;
public class ArrayLab {
    //a constant
    static private final int MAXIMUM_NUMBERS = 10;

    //variables
    static private Scanner input = new Scanner(System.in);


    /**
     * if the array is empty, a message "No numbers were provided by a user" will be printed and the program
     * will not calculate the average number and display it.
     */
    public static void main(String[] args)
    {

        float [] numbers = new float[MAXIMUM_NUMBERS];   // an array that can store 10 whole numbers- default value of each element is 0
        numbers = getNumbers(numbers);
        if(numbers != null) {
            float average = calculateAverage(numbers);
            displayNumbersOfArray(numbers, average);
        }
        else {
            System.out.println("No numbers were provided by user");
        }
    }

    /**
     * Take numbers from a user
     */
    private static float[] getNumbers(float numbers[]) {
        int number;
        int counter = 0;
        System.out.printf("Please input the numbers, a maximum of %d can be given. Enter 0 to calculate an average number\n", MAXIMUM_NUMBERS);
        do{
            System.out.printf("Please input number %d: ", counter+1);
            number = input.nextInt();
            //if number is less or equals 0, the message You have decided to end input by entering a number < or = zero" will be printed
            if (number <= 0)
            {
                System.out.println("You have decided to end input by entering zero");
            }
            else
            {
                numbers[counter] = number;
                counter++;
            }//if
        }while((counter < MAXIMUM_NUMBERS) && number != 0);
        //until the counter is less than 10(MAXIMUM_NUMBERS) OR number NOT equals 0
        // the program is demonstrating the prompt and asking a user input numbers

        //if the counter equals 0 it means that the array is empty
        if(counter == 0) {
            return null;
        }
        else {
            return numbers;
        }

    }//end of getNumbers method

    /**
     * The method calculates an average number from numbers in the array
     */
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
    }//end of calculateAverage

    /**
     * The method displays numbers from the array
     */
    private static void displayNumbersOfArray(float numbers[], float average){
        System.out.println("-----------------List of numbers-------------------");
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
    }//end of displayNumbersOfArray
}

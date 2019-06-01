package com.js.codejam.practice.number_guessing;

import java.util.Scanner;

class Solution {

    //*******************
    // Private Members **
    //*******************
    private enum Result {NONE, TOO_BIG, TOO_SMALL, CORRECT}
    private Scanner mScanner;

    /**
     * Solution class
     *
     * @param args -
     */
    public static void main(String[] args)
    {
        // run the example
        new Solution().run();
    }

    /**
     * Run the task
     */
    private void run()
    {
        final int NUMBER_TESTS = readInt();

        for(int i = 1; i <= NUMBER_TESTS; i++) {
            Result result = Result.NONE;

            // read the two numbers
            int min = readInt();
            int max = readInt();

            int tries = readInt();

            do {
                int guess = min + (int)Math.round((max - min) / 2.0);

                System.out.println(guess);

                result = Result.valueOf(readString());

                max = result == Result.TOO_BIG ? guess : max;
                min = result == Result.TOO_SMALL ? guess : min;

            } while(result != Result.CORRECT)   ;

        }
    }

    //*********************
    // Protected Methods **
    //*********************

    /**
     * Get the next string from the scanner
     *
     * @return - the next string
     */
    protected String readString()
    {
        // place holder for the result
        String result = "";

        // while there is no result
        while(result.isEmpty()) {
            // get the next line
            result = scanner().nextLine();
        }

        // return the line
        return result;
    }

    /**
     * Get the next int from the scanner
     *
     * @return - the int
     */
    protected int readInt() { return scanner().nextInt(); }

    //*******************
    // Private Members **
    //*******************

    /**
     * Create the scanner
     *
     * @return - the scanner
     */
    private Scanner scanner() { return mScanner == null ? mScanner = new Scanner(System.in) : mScanner; }

}

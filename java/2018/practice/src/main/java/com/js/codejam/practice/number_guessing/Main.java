package com.js.codejam.practice.number_guessing;

import com.js.codejam.utils.CodeJam;

public class Main  extends CodeJam {

    //*******************
    // Private Members **
    //*******************
    private enum Result {NONE, TOO_BIG, TOO_SMALL, CORRECT}

    /**
     * Main class
     *
     * @param args -
     */
    public static void main(String[] args)
    {
        // run the example
        new Main().run();
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

            } while(!(result == Result.CORRECT));

        }
    }
}

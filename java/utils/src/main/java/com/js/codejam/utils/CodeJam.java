package com.js.codejam.utils;

import java.util.Scanner;

public class CodeJam {

    //*******************
    // Private Members **
    //*******************
    private Scanner mScanner;

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

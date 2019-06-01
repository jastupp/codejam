package com.js.codejam.practice.senate;


import com.js.codejam.utils.CodeJam;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution extends CodeJam {

    //*******************
    // Private Members **
    //*******************
    private Scanner mScanner;

    /**
     * Main Method
     *
     * @param args -
     */
    public static void main(String[] args)
    {
        new Solution().run();
    }

    private void run()
    {
        final int NUMBER_TESTS = readInt();

        // loop for the number tests
        for(int i = 1; i <= NUMBER_TESTS; i++) {
            // get the number of parties
            int parties = readInt();

            SortedSet<Party> set = new TreeSet<>();

            // loop for the number of parties
            for(int j = 1; j <= parties; j++) {
                set.add(new Party(j, readInt()));
            }

            String out = total(set) % 2 == 0 ? "" : next(set) + " ";

            while(!set.isEmpty()) {
                // get the next pair
                out += next(set) + next(set) + " ";
            }

            System.out.println("Case #" + i + ": " + out.trim());
        }
    }

    private long total(SortedSet<Party> set)
    {
        long total = 0;

        for(Party next : set) {
            total += next.number();
        }

        return total;
    }


    private String next(SortedSet<Party> set)
    {
        // get the first
        Party next = set.last();

        // remove the item
        set.remove(next);

        // remove one
        next.subtract();

        // add the item
        if(next.number() > 0) { set.add(next); };

        // return the name
        return next.name();
    }
}

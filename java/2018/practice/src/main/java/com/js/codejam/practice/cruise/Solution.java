package com.js.codejam.practice.cruise;

import com.js.codejam.utils.CodeJam;

public class Solution extends CodeJam {

    public static void main(String[] args)
    {
        new Solution().run();
    }

    public void run()
    {
        int numberTests = readInt();

        // loop for the number tests
        for(int i = 1; i <= numberTests; i++) {
            int distance = readInt();
            int horses = readInt();

            double max = 0.0;

            for(int j = 0; j < horses; j++) {
                // read the position
                int position = readInt();
                int speed = readInt();

                double time = (distance - position) / (double)speed;

                max = Math.max(max, time);
            }

            System.out.println("Case #" + i + ": " + (distance / max));
        }

    }
}

package com.company;

import java.util.Scanner;

public class Main
    {

        public static void main(String[] args)
            {
                Scanner intScan = new Scanner(System.in);

                System.out.println("Enter an integer.");
                int discs = intScan.nextInt();
                System.out.println("Total Number of Moves : " + (int)(Math.pow(2,discs)-1));
                TowerSolver.Solve(discs, 1, 2, 3);
                System.out.println("Done. Enjoy moving gold discs for eternity.");
            }
    }

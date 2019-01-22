package com.company;

public class TowerSolver
    {

        public static int count = 1;

        public static void Solve(int n, int startPole, int otherPole, int endPole)
            {
                if (n == 0)
                    {
                        return;
                    }
                Solve(n - 1, startPole, endPole, otherPole);
                System.out.println("Move " + count + " : Move disc #" + n + " from tower #" + startPole + " to tower #" + endPole);
                count++;
                Solve(n - 1, startPole, endPole, otherPole);
            }

    }

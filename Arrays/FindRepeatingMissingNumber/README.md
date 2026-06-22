# 37. Find the repeating and missing numbers

## Difficulty
Hard

## Problem
 Given an integer array nums of size n containing values from [1, n] and each value appears exactly once in the array, except for A, which appears twice and B which is missing.
Return the values A and B, as an array of size 2, where A appears in the 0-th index and B in the 1st index.

## Approach
First, calculate the sum of all elements in the given array, denoted as S, and the sum of natural numbers from 1 to N, denoted as Sn. The formula for Sn is (N * (N + 1)) / 2.
Now calculate S - Sn. This gives us X - Y, where X is the repeating number and Y is the missing number.
Next, calculate the sum of squares of all elements in the array, denoted as S2, and the sum of squares of the first N numbers, denoted as S2n. The formula for S2n is (N * (N + 1) * (2N + 1)) / 6.
Now calculate S2 - S2n. This gives us X2 - Y2.
From the equations S - Sn = X - Y and S2 - S2n = X2 - Y2, we can compute X + Y by the formula (S2 - S2n) / (S - Sn).
Using the values of X + Y and X - Y, we can solve for X and Y through simple addition and subtraction.
Finally, return the values of X (the repeating number) and Y (the missing number).
## Time Complexity
O(N)

## Space Complexity
O(1)
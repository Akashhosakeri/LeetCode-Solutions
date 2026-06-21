# 34. Count the number of subarrays with given xor K

## Difficulty
Hard

## Problem
 Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.

## Approach
The brute force approach checks all possible subarrays and computes their XOR, but this quickly becomes inefficient for large arrays because it requires checking every pair of indices. Instead, we can make use of prefix XORs. A prefix XOR at index i represents the XOR of all elements from the start up to i. Using this, the XOR of any subarray can be derived by taking the XOR of two prefix XOR values.

Now, to find whether a subarray ending at the current position has XOR equal to k, we only need to check if there was an earlier prefix XOR such that when we combine it with the current prefix XOR, the result is k. In other words, the condition becomes prefixXor[r] ^ prefixXor[l-1] = k.

- We keep track of how many times each prefix XOR has appeared using a hashmap (or dictionary).  - Whenever we find one that matches, we increase our count. This way, instead of checking all subarrays, we just use the hashmap and solve it much faster.
- Initialize a hashmap to store how many times each prefix XOR has appeared.
- Keep a variable to store the current prefix XOR as we move through the array.
- Keep another variable to count the total number of subarrays with XOR equal to k.
- For each element in the array, update the prefix XOR by combining it with the current element.
- If the prefix XOR itself is equal to k, increase the count by one.
- Check if there exists a prefix XOR seen before that can make the subarray XOR equal to k, and if yes, add its frequency from the hashmap to the count.
- Store or update the frequency of the current prefix XOR in the hashmap.
- After processing all elements, the count will be the total number of subarrays with XOR equal to k.
## Time Complexity
O(N)

## Space Complexity
O(N)
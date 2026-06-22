# 36. Merge two Sorted Arrays Without Extra Space

## Difficulty
Hard

## Problem
 Given two sorted integer arrays nums1 and nums2, merge both the arrays into a single array sorted in non-decreasing order.
The final sorted array should be stored inside the array nums1 and it should be done in-place.
Array nums1 has a length of m + n, where the first m elements denote the elements of nums1 and rest are 0s whereas nums2 has a length of n.

## Approach
We are given two sorted arrays nums1 and nums2 and nums1 has enough space at the end (filled with zeros) to accommodate all elements from nums2. Now, if we try to insert elements from nums2 into nums1 from the beginning, we would need to shift elements in nums1 every time to make room which becomes time consuming and inefficient.

- Since both arrays are sorted in non-decreasing order, the largest elements will be at the end of each array. If we start comparing elements from the back of both arrays and place the largest one at the end of nums1, we won't need to shift anything.

- To efficiently insert elements at the end, we will use three pointers.
- Initialize three pointers: One points at the last valid index (excluding zeros) of nums1, one points at the last valid index of nums2 andd the last pointer points to last index of nums1.
- Compare the elements pointed by the first two pointers and whichever is larger, place it at the third pointer's index.
- Move the respective pointer one step back and also move the third pointer one step back.
- If there are any remaining elements in nums2, then copy them in nums1. If any elements remain in nums1, they’re already in place
- The result is a fully merged and sorted array stored in nums1 itself.
## Time Complexity
O(N+M)

## Space Complexity
O(1)
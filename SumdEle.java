/*
You are given an array arr. Find the sum of distinct elements in an array.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 15
Explanation: Distinct elements are 1, 2, 3, 4, 5. So sum is 15.
Input: arr[] = [5, 5, 5, 5, 5]
Output: 5
Explanation: Only Distinct element is 5. So sum is 5.
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 105
*/

import java.util.HashSet;

class SumdEle {
    int findSum(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        //hashset stores distinct elements 
        int sum = 0;
        
        for (int num : arr) {
            if (!set.contains(num)) {
                sum += num;
                set.add(num);
            }
        }
        
        return sum;
    }
}

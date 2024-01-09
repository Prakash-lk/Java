Problem statement
Given an array 'v' of 'n' numbers.

Your task is to find and return the highest and lowest frequency elements.

If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.

Example:
Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
Output: 1 2

Explanation: The element having the highest frequency is '1', and the frequency is 3. The elements with the lowest frequencies are '2', '3', and '4'. Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].

  #Code

  import java.util.*;
public class Solution {
    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int n = v.length;

        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            freq.put(v[i], freq.getOrDefault(v[i], 0) + 1);
        }

        int maxFreq = 0, minFreq = v.length;
        int maxElement = 0, minElement =1000000001;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxElement = element;
                maxFreq = count;
            } else if (count == maxFreq) {
                maxElement = Math.min(maxElement, element);
            }

            if (count < minFreq) {
                minElement = element;
                minFreq = count;
            } else if (count == minFreq) {
                minElement = Math.min(minElement, element);
            }
        }

        int []ans = new int[]{maxElement, minElement};
        return ans;
    }
}



class Solution {
    public int totalFruit(int[] fruits) {
        // This map stores fruit type → count in current window
        Map<Integer, Integer> basket = new HashMap<>();
        
        int left = 0; // Start of sliding window
        int maxFruits = 0; // Result: max length of subarray with at most 2 fruit types

        // Move right pointer to expand the window
        for (int right = 0; right < fruits.length; right++) {
            int fruit = fruits[right];
            // Add current fruit to basket (increase count)
            basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);

            // If we have more than 2 types of fruits, shrink window from left
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1); // reduce count

                // If no more leftFruit in the basket, remove it
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }

                // Move the left pointer to shrink the window
                left++;
            }

            // Update maxFruits if current window is larger
            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }
}

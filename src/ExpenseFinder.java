import java.util.*;

public class ExpenseFinder {

    public static void main(String[] args) {
        int[] expenses = {1721, 979, 366, 299, 675, 1456}; // Example expenses
        int targetSum = 2020; // Target sum

        int result = findThreeExpenses(expenses, targetSum);

        if (result != -1) {
            System.out.println("Product of three expenses: " + result);
        } else {
            System.out.println("No combination of three expenses found that sum up to the target value.");
        }
    }

    public static int findThreeExpenses(int[] expenses, int target) {
        Arrays.sort(expenses); // Sorting the array for efficient search

        for (int i = 0; i < expenses.length - 2; i++) {
            int left = i + 1; // Pointer of the element after expenses
            int right = expenses.length - 1; // Pointer of last element in the array

            while (left < right) {
                int sum = expenses[i] + expenses[left] + expenses[right]; // Sum of three elements
                if (sum == target) { // Checks if the sum matches the target
                    return expenses[i] * expenses[left] * expenses[right];
                } else if (sum < target) { // Checks if the sum is less than the target
                    left++;
                } else { // Checks if the sum is more than the target
                    right--;
                }
            }
        }
        return -1; //Return -1 if no combination / No combination of three expenses found......
    }
}

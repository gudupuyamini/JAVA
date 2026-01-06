import java.util.Arrays;

class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {15, 7, 22, 9, 3, 55, 12, 8};
        System.out.println("Array elements: " + Arrays.toString(numbers));
        if (numbers.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        int maxElement = numbers[0];
        int minElement = numbers[0];

        
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            
            
            if (current > maxElement) {
                maxElement = current;
            }
            
             
            if (current < minElement) {
                minElement = current;
            }
        }
 
        System.out.println("\n--- Results ---");
        System.out.println("Maximum Element: " + maxElement);
        System.out.println("Minimum Element: " + minElement); 
    }
}
class PrimeNumbers {
    public static void main(String[] args) {
        
        for (int num = 1; num <= 100; num++) {
            int count = 0;
            
           
            for (int i = 1; i <= num; i++) {
                // If 'num' is perfectly divisible by 'i', it is a divisor
                if (num % i == 0) {
                    count++;
                }
            }
            
            // A prime number has exactly two divisors: 1 and itself.
            if (count == 2) {
                // CORRECTED: 'System' must be capitalized in Java
                System.out.println(num);
            }
        }
    }
}
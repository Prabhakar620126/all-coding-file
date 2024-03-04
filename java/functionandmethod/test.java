public class test {
    public class UniqueDigitsNumbers {
        public static void main(String[] args) {
            int count = 0;
    
            for (int number = 1000; number <= 8000; number++) {
                if (hasUniqueDigits(number)) {
                    count++;
                    // You can print the number if you want
                    // System.out.println(number);
                }
            }
    
            System.out.println("Number of unique digits numbers between 1000 and 8000: " + count);
        }
    
        // Function to check if a number has all unique digits
        
    }
    
    
}

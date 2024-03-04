public class butterfly {
    
        public static void main(String[] args) {
            int n = 4; // You can adjust this value to control the size of the pattern
            
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (j <= i || j >= 2 * n - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= 2 * n - 1; j++) {
                    if (j <= i || j >= 2 * n - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    
    
    
}

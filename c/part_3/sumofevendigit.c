#include <stdio.h>

int main() {
    int num, digit, sum = 0;

    printf("Enter a number: ");
    scanf("%d", &num);
    digit = 1; 

    while (num > 0) {
        int i = num%10;
        if (digit % 2 == 0) { 
            sum += i; 
        }
        num /= 10;
        digit ++;
    }

    printf("Sum of even digits: %d\n", sum);

    // chat gpt code
    
    // int num, digit, position = 1, sum = 0;

    // printf("Enter a number: ");
    // scanf("%d", &num);

    // while (num > 0) {
    //     digit = num % 10; // Extract the last digit
    //     if (position % 2 == 0) { // Check if the position is even
    //         sum += digit; // Add the digit in even position to the sum
    //     }
    //     num /= 10; // Remove the last digit
    //     position++; // Move to the next position
    // }

    // printf("Sum of digits in even positions: %d\n", sum);

    // by for loop
    // int num, digit, sum = 0;

    // printf("Enter a number: ");
    // scanf("%d", &num);

    // for (  int position = 1;num > 0; num /= 10, position++) {
    //     digit = num % 10; // Extract the last digit
    //     if (position % 2 == 0) { // Check if the position is even
    //         sum += digit; // Add the digit in even position to the sum
    //     }
    // }

    // printf("Sum of digits in even positions: %d\n", sum);

    return 0;
}
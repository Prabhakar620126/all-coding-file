#include <stdio.h>
#include <math.h>

int main() {
    int number, originalNumber, sum = 0, numDigits = 0, digit;

    printf("Enter a number: ");
    scanf("%d", &number);
    

    originalNumber = number;
    

    // Calculate the number of digits
    while (number != 0) {
        number /= 10;
        numDigits++;
    }printf(" number of digit %d \n",numDigits);

    number = originalNumber; // Reset number to its original value

    //Calculate the sum of digits raised to the power of numDigits
    while (number != 0) {
        digit = number % 10;
        sum += pow(digit, numDigits);
        number /= 10;
        int x = pow(digit, numDigits);
        printf("digit %d\n",digit);
        printf("digit power %d\n",x);
        printf("sum %d\n",sum);
         printf("_________________\n");
        printf("number %d\n",number);
       

    } printf(" sum of digit to its power of number of digit %d \n",sum);

    // Check if it's an Armstrong number
    if (sum == originalNumber) {
        printf("%d is an Armstrong number.\n", originalNumber);
    } else {
        printf("%d is not an Armstrong number.\n", originalNumber);
    }

    return 0;
}

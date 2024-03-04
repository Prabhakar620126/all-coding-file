#include <stdio.h>
#include <math.h>
double derivative(double x) {
    double en = exp(-x);
    return -en / pow(1.0 + en, 2);
}

int main() {
    double x = 0.4;
    double y=1.0 / (1.0 + exp(-x));
    double result = derivative(x);
    printf("The derivative at x = %f is %f\n", x, result);

    return 0;
}

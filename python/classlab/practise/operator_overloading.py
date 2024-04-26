class ComplexNumber:
    def __init__(self, real, imag):
        self.real = real
        self.imag = imag

    def __add__(self, other):
        # Adding the real parts and imaginary parts separately
        real_sum = self.real + other.real
        imag_sum = self.imag + other.imag
        return ComplexNumber(real_sum, imag_sum)

    def __str__(self):
        # Representing the complex number as a string
        return f"{self.real} + {self.imag}i"

# Creating two complex numbers
num1 = ComplexNumber(2, 3)
num2 = ComplexNumber(-1, 5)

# Adding two complex numbers using overloaded '+' operator
result = num1 + num2

# Displaying the result
print("Result:", result)

# Write a program to sum two numbers using classes and objects.

class sum():
    def __init__(self , n1, n2):
        self.n1=n1
        self.n2= n2

    def add(self):
        return self.n1+self.n2

a= float(input("Enter the first number : "))
b= float(input("Enter the second number : "))

p=sum(a,b)
print("Sum of two number ",a," and ",b, " is: ", p.add())


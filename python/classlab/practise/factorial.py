# write the programm to calculate factorial of number enter by user 

def factorial(n):
    if n==1:
        return 1
    return n*factorial(n-1)
a=int(input("enter number for factorial :"))
print(factorial(a))
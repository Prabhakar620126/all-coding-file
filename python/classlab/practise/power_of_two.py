# write a program to take input and check wheather this is power of two or not
import math
x= int(input("Enter number "))
if x&x-1==0:
    print("number is power of two")
else:
    print("number is not power of two")



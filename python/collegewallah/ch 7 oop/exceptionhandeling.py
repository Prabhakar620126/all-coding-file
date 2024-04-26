a= int(input("enter a:"))
b= int(input("enter b:"))
 
try:
    result=a/b
except ZeroDivisionError:
    result= None
    print("Error : cannot divide by zero ")
finally:
    print("Division  operation completed :", result)


number= int(input("Enter the number: "))

if number>=0:
    print("The number is positive :")
    
else:
    print("The number is negative :")
    

if number%2==0:
    print("Number is even ")
else:
    print(" number is odd ")

a= int(input("Enter the number1 "))
b= int(input("Enter the number2 "))
c= int(input("Enter the number3 "))
if(a>b and a>c):
    print("a is the greatest ")
elif(b>c and b>a):
    print("b is the greatest")
else:
    print("c is the greatest")        

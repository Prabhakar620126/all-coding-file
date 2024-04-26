def summation(n):
    sum=0
    for i in range(0,n+1):
        sum+=i

    return sum
# n= int(input("enter numbwer:"))
# print(summation(n))
def add(n1=0,n2=1):
    sum=n1+n2
    return sum
# positional argument 
print(add(5,3))

# keyword argument
print("the sum of ", add(n2=5,n1=6))

# default argument 
print("the sum of ", add(6))

#arbitary arguments 
def add_all_number(*args):
    sum=0
    for i in args:
        sum+=i
    return sum
print(add_all_number(1,2,7,10))    

#arbitary arguments  with keyword pair

def studentInfo(**kwargs):
    for x,y in kwargs.items():
        print (x,"is ", y)

studentInfo(name="prabhakar", age=20, city="delhi")
studentInfo(name="sherya", age=18, state="bihar")

def outer_function():
    x=1 # variable in the outer function 
    def inner_function():
        y=2
        result= x+y
        return result+10
    return inner_function()

output=outer_function()+2
print(output)
# pass by value 
def swap(a,b):
    temp=a
    a=b
    b=temp
    #print( "A= ",a,"and B= ",b)
a= 4
b=7
print( "A= ",a,"and B= ",b)
swap(a,b)
print( "A= ",a,"and B= ",b)

# pass by reference 
def modify_list(list):
    list.append(4)
    print("inside function ",list)

li=[2,3,65]
modify_list(li)
print("outside list :",li)

def factorial(n):
    if n==0:
        return 1
    else:
        return n*factorial(n-1)
    

def factorial1(n):
    ans=1
    for i in range(1,n+1):
        ans*=i
        
    return ans

print(factorial1(5))
print(factorial(5))
x=50
def fun(x):
    x=2
fun(x)
print("x is now ",x)











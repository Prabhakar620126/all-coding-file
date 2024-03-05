# def modify(list):
#     print(list)
#     list=[1,2,3,4,5]
#     print(list)
# list=[10,20,30,40]
# modify(list)
# print(list)
a=1
def myfun():
    global a
    print('a=',a)
    b=2
    a=10
    print('a=',a)
    print('b=',b)
    
myfun()
print('a=',a)
# write the programm to calculate factorial of number enter by user 

def factorial(n):
    if n==1:
        return 1
    return n*factorial(n-1)
a=int(input("enter number for factorial :"))
print(factorial(a))





def factorial(n):
    if n==0:
        return 1
    else:
        return n*factorial(n-1)
    

print(factorial(6))

# print from n to 1 

def count(n):
    if n==0:
        return 1
    print(n)
    return count(n-1)
count(10)

def count(n):
    if n==0:
        return 
    
    count(n-1)
    print(n)
count(10)


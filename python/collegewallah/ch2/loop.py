for i in range(0,3):
    print("hello world")
    print("This is DON")

for _ in range(0,3):
    print("hello world")
    print("This is DON")

list = [10,20,5,24,56,64,24,55,87,2]
fruit =["apple", "mango", "banana" ,"orange" ]
for i in list:
    print(i)
for i in fruit:
    print(i)

# while loops
i=0
while i<10:
    print(i)
    i = i+1

x=4
y=0
while x>=0:
    x -= 1
    y+=1
    if x==y:
        continue
    else:
        print( x,y)

n= int(input("Enter n: "))

for _ in range(n):
    print("*"*5)

for i in range(n):
    for j in range (1,n+1): 
        print(j ,end=" ")
    print()
# number triangle 
for i in range(1,n+1):
    for j in range (1,i+1): 
        print(j ,end=" ")
    print()
# alphabet triangle
for i in range(65,65+n+1):
    for j in range (65,i+1): 
        print(chr(j) ,end=" ")
    print()

# number pyrmid
for i in range(1, n+1):
    print("_"*(n-i), end="")
    for j in range(1, 2*i):
        print(j, end="")
    print()


# downward triangle  number
for i in range(1,n+1):
    for j in range(1,2*i-2):
        print(j, end="")
    print()






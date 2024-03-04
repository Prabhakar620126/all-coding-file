# creating tuple 
colour =("red", "yellow","green")

#creating a tuple with 1 item

fruit =("apple",)
friend = tuple("prabhakar")

#check type of tuple
print(type(fruit))
print(type(friend))
print(len(colour))
print(colour[0])
print(colour[1])
print(colour[2])
print(colour)

for i in colour:
    print(i )


# acceessing item in tuple:
print(colour[1])    # positive indexing 
print(colour[-1])   #negative indexing 

print(colour[1:3])   # range indexing 

# problem 
A=('z','a','d','f','g','e','e','k')
for i in reversed(A):
    print(i ,end=" ")

print()

input_tuple= (7,6,5,4,3,2,1)
list=[]
for i in input_tuple:
    list.append(i)
print(list)
print(tuple(list))

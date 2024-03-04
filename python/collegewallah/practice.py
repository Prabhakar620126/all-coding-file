x=5
y="2"
print(x+int(y))

a= 8//3+4%2
print(a)

d=2/7
print(d)
x = ("apple", "banana", "cherry")
print(type(x))
x = {"name" : "John", "age" : 36}
print(type(x))
x = True
print(type(x))

#problem on set
l1=[1,5,5,10]
l2=[3,4,5,5,10]
l3=[5,5,10,20]

# type casting into set
s1=set(l1)
s2=set(l2)
s3=set(l3)

#join using intersection
s1s2= s1.intersection(s2)
final_set=s1s2.intersection(s3)
print(final_set)
final_list=list(final_set)
print(final_list)
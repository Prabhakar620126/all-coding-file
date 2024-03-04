#creating  a set
names = {"sia ", "mia", "tia"}

#print set
print(names)

#cheking length of set
print(len(names))


#checking datatypes
print(type(names))

#accessing item of set 
for x in names:
    print(x, end=" ")

names_list = ["ria", "kia"]
names.update(names_list)
print(names)
names.remove("ria")# this show error when element is not in set 
print(names)
names.discard("ria")# this not show error when element is in set or not
print(names)
# joining  2 sets
s1={'a','b','c','d'}
print(len(s1))
s2= {'v','f','e','g','a'}
print(len(s2))
s3=s1.union(s2)
print(s3)
print(len(s3))
#s1.intersection_update(s2) # only common in both set is print
#print(s1)
s1.symmetric_difference_update(s2) #  all element rest of common in both set print 
print(s1)

# list item

friend = ["prabhakar", "shubham", "manish", "aryan", "atul","pranav", "sanidhaya"]
# indexed 
print(friend[0])
print(friend[1])
print(friend[2])
print(friend[3])
print(friend[4])
print(friend)

# ordered
# ordered are fixed
print(friend)

# mutable  --> can be change 
friend[6]= "prabhakar"
print(friend)

#  dublicate can be allowed 
# list can be any data types 
friend[5]=7632957592
print(friend)


list1= [ "prabhakar", 22036142, friend[3], 5>3,9<1,"done" ]
print(list1)
print(type(list1))
print(len(list1))
print(len(friend))
if "atul" in friend:
    print("present in list ")
if "22036142" not in friend:
    print("absent in list ")


# Accessing items of a list 
    #indexing 

print(friend[-1])
print(friend[-2])
print(friend[-3])
print(friend[-4])
print(friend[-5])

# range of indexes
print(list1[0:5])

print(list1[-5:-1])


# adding element to a list 
# append() function

friend.append("Sherya ")
print(friend)

# insert() function
friend.insert(6,"saurav")
print(friend)

# extend() function 
friend.extend(list1)
print(friend)
print(list1)

#removing elements from a list
list1.remove("aryan")
list1.pop(1)
list1.pop()
print(list1)

# changing item in list

list1[2]=6
print(list1)
list1[1:3]= ["hdkdikj", "kdjndi"]
print(list1)

list1.sort()
print(list1)
list1.sort(reverse=True)
print(list1)

friend.reverse()
print(friend)

#list comprehension
new_list =[list1 for  list1 in list1 if "j" in list1 ]
print(new_list)

# copy list
new_friend= friend.copy()
print(new_friend)

#nested list 
list = [10,20,[30,40,50],30,32,25]
print(list[2])
print(list[2][0])
for _ in reversed(list):
    print(_ , end="  ")
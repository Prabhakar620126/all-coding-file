name = "college wallah"
name1 = 'college wallah'
name2=''' this is 
prabhakar'''
print(name)
print(name1)
print(name2)
print(type(name))
print(type(name1))
print(type(name2))

# indexing 
for i in range(0,len(name)):
    print(name[i])

for i in name2:
    print(i)

print(len(name2))
print(name2.find('kar'))

print(name[2:7])

# modify string
str1= "Prabhakar"
str2= str1.upper()
print(str1)
print(str2)
str3= str1.lower()
print(str3)

# capitalising the string
st= 'go there'
st1=st.capitalize()
print(st1)

# replacing the old with new leter
s='''Good afternoon, 
Dear Students,
 Please check your final Marks of Mathematics-III. If any mistake, inform me upto 3:00 P. M. today only .'''

s1=s.replace(' ','_')
print(s)
print(s1)
s2=s.split("_")
print(s2)

# concanate the two string 
stri=" hellow "
stri1= "prabhakar"
print(stri+stri1)
# string formatting 
student_name= "Pallavi"
student_marks=98
str1 = "The student name is {s} and \nmark is {m}".format(s= student_name , m= student_marks)
print(str1)

# creating a dictonary
phones = {
    "prabhakar":7632957592,
    "shubham":9334809208,
    "manish":7352921821,
    "atul":9329885424
}
print(phones)
print(type(phones))
print(len(phones))

print(phones["manish"])
print(phones.get("atul"))
print(phones.keys())
#update value in dict
#phones["prabhakar"]=8252414410
print(phones)
phones["prabhat"]=8252414410
print(phones)
more_phone ={"m":456485,"p":46785}
phones.update(more_phone)
print(more_phone)
print(phones)

#phones.clear() # this will claer the whole item
#print("hi")
phones.pop("m") # this will remove the mention item

print(phones)
phones.popitem() # this will remove last item 
print(phones) 
for i,j in phones.items():
    print(i,j)

# nested dictionary 
    
student={
    "prabhakar":42,
    "pranav":43,
    "manish":39,
    "stu1":{
        "a":2,
        "b":56,
        "d":45
    }
}
print(student)
print(student["pranav"])
print(student["stu1"]["b"])

s={
   " a":100,
   "v":200,
   "h":2356

}
print(sum(s.values()))
# problem on dictionary 
input_string = input("enter string :")
n= int(input(" Enter n: "))


alphabet='abcdefghijklmnopqrstuvwxyz'
reverse_alphabet= alphabet[::-1]
dict1=dict(zip(alphabet,reverse_alphabet))
#finding the part of string on which we will do mirror operation 
prefix = input_string[0:n-1]
suffix = input_string[n-1:]

#finding the mirror string
mirror =""
for i in range(0,len(suffix)):
    mirror= mirror+dict1[suffix[i]]

# creating the final string 
res= prefix+ mirror
print("The result is : ", res)





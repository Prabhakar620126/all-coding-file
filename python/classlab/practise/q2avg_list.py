#  write programm to calculate sum and average of list of number
a=int(input("enter the range of list :"))
l1=[]
for i in range(a):
    b=int(input(" Enter the  element of list  :"))
    l1.append(b)
    

print(l1)
sum=0
for i in range(len(l1)):
    sum=sum+l1[i]

print("sum of list ",sum)    

av=sum/len(l1)
print("Avarage of list = ",av)


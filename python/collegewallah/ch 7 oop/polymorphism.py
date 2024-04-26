# polymorphism 
# allow object of different classes to behave as object of thr same super class 

# compile time polymorphism

#method overloading 
class add:
    def sum(self, a,b):
        print (a+b)

    def sum(self, a,b,c):
        print(a+b+c)

a1=add()
a1.sum(8,9,5)
a1.sum(8,9,11)
# OPERATOR OVER LOADING 

class complexnumber:
    def __init__(self, real,img):
        self.real=real
        self.img=img

    def __add__(self,other):
        return complexnumber(self.real+other.real, self.img+ other.img)
c1= complexnumber(1,2)
c2= complexnumber(3,4)
c3= c1+c2
print(c3.real, " + i",c3.img)
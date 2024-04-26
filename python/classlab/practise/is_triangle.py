# write a python  function that accept length of three side of a triangle as input and also write the main program for the sake . program output should indicate either or not the triangle is right triangle 
def max(a,b,c):
    if(a>b):
        if(a>c):
            return a
        else:
            return c
    elif(b>a):
        if(b>c):
            return b
        else:
            return c
        
def is_valid(a,b,c):
    if(a==max(a,b,c)):
        if(a*a==(b*b+c*c)):
            return True
        else :
            return False
    elif(b==max(a,b,c)):
        if(b*b==(a*a+c*c)):
            return True
        else :
            return False
    elif(c==max(a,b,c)):
        if(c*c==(a*a+b*b)):
            return True
        else :
            return False

x=int(input(" Enter the first side of triangle :"))
y=int(input(" Enter the second side of triangle :"))
z=int(input(" Enter the third side of triangle :"))
a=is_valid(x,y,z)
print(a)

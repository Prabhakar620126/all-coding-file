class rectangle:
    def __init__(self,length=0 ,breadth=0) :
        print(f"A rectangle is created with length : {length} and width: {breadth}")
        self.length=length
        self.breadth=breadth
        
    
    def area(self):
        print("area of rectangle :") 
        return self.length* self.breadth
    
    def perimeter(self):
        print("perimeter of rectangle : ")
    
        return 2*(self.length+ self.breadth)


r1= rectangle(8,11)

print(r1.area())
print(r1.perimeter())
r2= rectangle(6,5) 
print(r2.area())
print(r2.perimeter())


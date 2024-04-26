class student:
    def set_name(self, name):
        self.name= name

    def get_name(self):
        return self.name
    
student1 = student()
student1.set_name("prabhakar")
print(student1.name)
print(student1.get_name()) 
student2 = student()
student2.set_name("Sherya")
print(student2.name)
print(student2.get_name()) 

class rectangle:
    def set_dimension(self, length, breadth):
        self.length=length
        self.breadth=breadth
    def area(self):
        print("area of rectangle :") 
        return self.length* self.breadth
    
    def perimeter(self):
        print("perimeter of rectangle : ")
    
        return 2*(self.length+ self.breadth)


r1= rectangle()
r1.set_dimension(5,7)
print(r1.area())
print(r1.perimeter())
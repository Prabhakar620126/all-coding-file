# Parent class
class Shape:
    def __init__(self, color):
        self.color = color

    def display_color(self):
        print("The color of the shape is ",self.color)

# Child class inheriting from Shape
class Rectangle(Shape):
    def __init__(self, color, width, height):
        # Calling the constructor of the parent class
        super().__init__(color)
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height


rectangle = Rectangle("Blue", 5, 10)
rectangle.display_color()  
print("The area of the rectangle is ",rectangle.area()," square units")  

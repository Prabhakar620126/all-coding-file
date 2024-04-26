# Parent class 1
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display_info(self):
        print(f"Name: {self.name}, Age: {self.age}")

# Parent class 2
class Student:
    def __init__(self, student_id, department):
        self.student_id = student_id
        self.department = department

    def display_info(self):
        print (f"Student ID: {self.student_id}, Department: {self.department}")



# Child class inheriting from both Person and Student
class CollegeStudent(Person, Student):
    def __init__(self, name, age, student_id, department, year):
        # Calling the constructors of both parent classes
        Person.__init__(self, name, age)
        Student.__init__(self, student_id, department)
        self.year = year

    def display_info(self):
        # Call the display_info method of both parent classes
        person_info = super().display_info()
        student_info = super(Student).display_info()
        print (f"{person_info}, {student_info}, Year: {self.year}")

# p1=Person("prabhakar", 20)

# p1.display_info()
# s1=Student(22036142," IT")
# s1.display_info()
c1=CollegeStudent("Prabhakar",20,22036142,"IT", 2)
c1.display_info()
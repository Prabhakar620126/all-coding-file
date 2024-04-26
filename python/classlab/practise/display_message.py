# Write a python program to display "Welcome to Program" using classes and objects.

class message():

    def __init__(self , mess):
        self.m= mess

    def display_message(self):
        print(self.m)

m= message("Welcome to Program")
m.display_message()
    
    


# public modifier
class abc:
    def __init__(self,a):
        self.v=a
    def square(self):
        return self.v*self.v
# private modifier
class ABC:
    def __init__(self,a):
        self.v=a
    def __square(self):
        return (self.v * self.v)
    def display(self):
        print ("the square of  number is ",self.__square())

a= abc(6)
print(a.square())
A=ABC(9)
print(A.display())

# procted modifier
class Abc:
    def __init__(self,a):
        self.v=a
    def _square(self):
        return (self.v * self.v)
    def display(self):
        print ("the square of  number is ",self._square())

a= abc(6)
print(a.square())
A=Abc(9)
A._square()
A.display()

    
        
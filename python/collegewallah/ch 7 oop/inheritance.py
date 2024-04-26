 
class parent:
    def __init__(selt):
        print("this is the parent class :")

class child(parent):
    def __init__(selt):
        super().__init__()
        print("this is child class :")

child1 = child()


class vehile_class:
    def __init__(self, capicity) :
        self.capicity= capicity

    def get_fare(self):
        return  self.capicity* 100
    





class bus_class(vehile_class):
    def __init__(self, capicity):
        super().__init__(capicity)

    def get_fare(self):
        vehicle_fare=super().get_fare()
        maintenance_fare=0.1*vehicle_fare
        total_fare = vehicle_fare+ maintenance_fare

        return total_fare
vehicle1=vehile_class(50 )
print(vehicle1.get_fare())
bus1= bus_class(50)
print(bus1.get_fare())

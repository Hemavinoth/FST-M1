#Create a car class with attributes manufacturer, model, and year.
class Car:
    def __init__(self,manufacturer,model,year):
        self.manufacturer=manufacturer
        self.model=model
        self.year=year
#Methods: accelerate(), stop()
    def accelerate(self):
        print(f"The {self.manufacturer} {self.model} is accelerating.")     
    def stop(self):
        print(f"The {self.manufacturer} {self.model} has stopped.") 
#Create an object of the Car class and demonstrate the use of its methods.
	
car1 = Car("Toyota", "Corolla", "2015", "Manual", "White")
car2 = Car("Maruti", "800", "2013", "Manual", "Red")
car3 = Car("Suzuki", "Swift", "2017", "Automatic", "Black")   
car1.accelerate()
car1.stop()


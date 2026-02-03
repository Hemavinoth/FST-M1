'''
Docstring for Acitivity16
Create a car class with the following details:

Properties: manufacturer, model, make, transmission, color

Methods: accelerate(), stop()

accelerate() should print "{Manufacturer} {Model} is moving"

stop() should print "{Manufacturer} {Model} has stopped"

 

Using this car class, create 3 different car objects.
'''
class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")
# Creating 3 different car objects
car1 = Car("Toyota", "Camry", 2020, "Automatic", "Blue")
car2 = Car("Honda", "Civic", 2019, "Manual", "Red")
car3 = Car("Ford", "Mustang", 2021, "Automatic", "Black")
# Demonstrating the methods
car1.accelerate()
car1.stop()
car2.accelerate()
car2.stop()
car3.accelerate()
car3.stop()

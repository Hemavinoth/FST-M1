'''
Docstring for Activity11
Create a Python dictionary that contains a bunch of fruits and their prices.

Write a program that checks if a certain fruit is available or not.
'''
fruits_prices = {
    "apple": 0.5,   
    "banana": 0.3,  
    "orange": 0.7,  
    "grape": 1.0,    
    "mango": 1.5
}

fruit_to_check = input("Enter the name of the fruit you want to check: ").lower()
if fruit_to_check in fruits_prices:
    print(f"{fruit_to_check.capitalize()} is available at ${fruits_prices[fruit_to_check]:.2f} per unit.")
else:
    print(f"Sorry, {fruit_to_check} is not available.")
    

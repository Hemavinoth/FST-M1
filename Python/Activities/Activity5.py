"""
Docstring for Activity5
Write a Python program to create the multiplication table (from 1 to 10) of a number.
Ask the user for a number and print the multiplication table for that number.
"""

number=int(input("Enter the number to print multiplication table: "))
for i in range(1,11):
    result=number*i
    print(f"{number} x {i} = {result}")
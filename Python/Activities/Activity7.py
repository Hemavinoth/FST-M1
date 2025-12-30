"""Write a Python program to calculate the sum of all the elements in a list.

Bonus points if you can make the user enter their own list."""

user_input = input("Enter numbers separated by spaces: ")
number_list = [int(num) for num in user_input.split()]  
total_sum = sum(number_list)
print("The sum of all elements in the list is:", total_sum)

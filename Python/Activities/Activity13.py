'''
Adding List Numbers

Activity 13

Write a function sum() such that it can accept a list of elements and print the sum of all elements
'''
def sum_of_list(elements):
    total = 0
    for element in elements:
        total += element
    return total
# Example usage
example_list = [5, 15, 9, 30, 0, 45, 7, 6]
print("The sum of all elements in the list is:", sum_of_list(example_list))


'''
Write a Python program that throws a NameError.

Handle the error so it doesn't halt execution.
'''
try:
    print(undefined_variable)
except NameError:
    print("A NameError occurred: The variable is not defined.")
print("Program continues execution after handling the error.")

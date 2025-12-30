'''
Docstring for Activity14
Using Recursion:

Write a program that asks the user how many Fibonnaci numbers to generate and then generates them.

 
Hint: The Fibonnaci seqence is a sequence of numbers where the next number in the sequence is the sum of the previous two numbers in the sequence. The sequence looks like this: 1, 1, 2, 3, 5, 8, 13, …

'''
def fibonacci(n):
    if n <= 0:
        return []
    elif n == 1:
        return [1]
    elif n == 2:
        return [1, 1]
    else:
        fib_sequence = fibonacci(n - 1)
        next_value = fib_sequence[-1] + fib_sequence[-2]
        fib_sequence.append(next_value)
        return fib_sequence
num = int(input("How many Fibonacci numbers would you like to generate? "))
fib_numbers = fibonacci(num)
print(f"The first {num} Fibonacci numbers are: {fib_numbers}")  

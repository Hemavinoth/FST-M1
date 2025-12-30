'''
Docstring for Activity12
Write a recursive function to calculate the sum of numbers from 0 to 10
'''
def recursive_sum(n):
    if n == 0:
        return 0
    else:
        return n + recursive_sum(n - 1) 

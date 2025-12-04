"""
Docstring for Activity6
Write a Python program to construct the following pattern, using a nested loop number.
1
22
333
4444
55555
666666
7777777
88888888
999999999
"""
number=int(input("Enter the number of rows: "))
for i in range(1,number+1):
    for j in range(i):
        print(i,end="")
   
'''
Docstring for tests.Activity18
Using Pandas:

Read the CSV made in the previous program:

Print the values only in the Usernames column
Print the username and password of the second row
Sort the Usernames column data in ascending order and print data
Sort the Passwords column in descending order and print data
Hint: You can use DataFrame.sort_values("column") to sort your data

Hint: You can use DataFrame.sort_values("column", ascending=false) to sort your data in descending order.
'''
import pandas as pd
df = pd.read_csv("user_credentials.csv")
print("Usernames column values:")
print(df["Usernames"])
print("\nUsername and password of the second row:")
second_row = df.iloc[1]
print(f"Username: {second_row['Usernames']}, Password: {second_row['Passwords']}")
print("\nUsernames sorted in ascending order:")
sorted_usernames = df.sort_values("Usernames")
print(sorted_usernames)
print("\nPasswords sorted in descending order:")
sorted_passwords = df.sort_values("Passwords", ascending=False)
print(sorted_passwords)

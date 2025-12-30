'''
Docstring for tests.Activity20
Using Pandas:

Use pandas to read data the Excel file

Print the number of rows and columns
Print the data in the emails column only
Sort the data based on FirstName in ascending order and print the data
 

Hint: You can use DataFrame.shape to get the number of rows and columns
'''
import pandas as pd
df = pd.read_excel("user_data.xlsx")
rows, columns = df.shape
print(f"Number of rows: {rows}, Number of columns: {columns}")
print("\nEmails column data:")
print(df["Email"])
print("\nData sorted by FirstName in ascending order:")
sorted_df = df.sort_values("FirstName")
print(sorted_df)

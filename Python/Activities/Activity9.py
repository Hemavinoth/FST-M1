first_num=[1,2,4,3,5,6]
second_num=[7,8,9,10,11,12]
new_list=[]
for i in first_num:
    if i%2!=0:
        new_list.append(i)
for j in second_num:
    if j%2==0:
        new_list.append(j)
print("The new list with odd numbers from first list and even numbers from second list is:",new_list)       


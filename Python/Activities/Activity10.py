exmple_tuples=(5,15,9,30,0,45,7,6)

for i in range(len(exmple_tuples)):
    if exmple_tuples[i]%5==0:
        print("Divisible by 5:",exmple_tuples[i])
    else:    
        print("Not Divisible by 5:",exmple_tuples[i])
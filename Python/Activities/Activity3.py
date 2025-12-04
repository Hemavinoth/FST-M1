"""
Make a two-player Rock-Paper-Scissors game.
Remember the rules:
Rock beats scissors
Scissors beats paper
Paper beats rock
"""

player1=input("Enter the player1: ")
player2=input("Enter the player2: ")

player1_answer=input(player1 + "player1 can shoose rock,paper,scissers").lower()
player2_answer=input(player2 + "player1 can shoose rock,paper,scissers").lower()

if player1_answer==player2_answer:
    print("its a tie")
elif player1_answer=="rock":
    if player2_answer=="scisser":
        print("Rock wins")
    else:
        print("paper wins")

elif player1_answer=="paper":
    if player2_answer=="scisser":
        print("scisser wins")
    else:
        print("Rock wins")

elif player1_answer=="paper":
    if player2_answer=="rock":
        print("paper wins")
    else :
        print("scissers wins")
else:
    print("Invalid input")
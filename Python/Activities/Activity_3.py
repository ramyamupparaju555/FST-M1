usr1 = input("What is Player 1's name: ")
usr2 = input("What is Player 2's name: ")

usr1_ans = input(usr1 + ", do you want to choose rock, paper or scissors? ").lower()
usr2_ans = input(usr2 + ", do you want to choose rock, paper or scissors? ").lower()

if usr1_ans == usr2_ans:
    print("It's a tie!")
elif usr1_ans == 'rock':
    if usr2_ans == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif usr1_ans == 'scissors':
    if usr2_ans == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif usr1_ans == 'paper':
    if usr2_ans == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
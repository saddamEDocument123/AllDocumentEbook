#Randint function from random module

#Modules
#import modules and used ther functions
#Random modules
#genaret any random number between your initial and end value
#

import random
#print(random.randint(0,100))

#Guessing Game
#
print " Guessing Game "

comGuess = random.randint(0,100)
while True:
    userGuess = input("Guess a number between 0 to 100 : ")
    if userGuess>comGuess:
        print("Guess lower")
    elif userGuess<comGuess:
        print "Guess higher"
    else:
        print "congrats, you've guessed the correct number"
        break
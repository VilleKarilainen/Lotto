The Lotto game
This is my first ever project using java, which I did for schoolwork. The program basically calculates how long it would take for you to win the lottery. I am also new to Github, so I may make some beginner mistakes while trying to upload this. The program asks the user the length of the lottery, or how many numbers will be asked, the range of numbers to be used, and in how many years must you win the lottery to win the game. It then creates arrays with the given parameters and calculates how long it would take to get a match for each number asked. One attempt is one week in game time. If all numbers matched, and the time it took to achieve that was less than the years asked form the player, the game is won. The game will redo the calculation process until the game is ultimately won by the player.
Initially the plan was to ask the user for exactly 7 unique numbers, ranging from 1 to 40, and the player beat the game if the lottery was won within a lifetime, or roughly 120 years. I decided to change the program so that the game so is customisable by the player.
Here is how the code works:

https://github.com/VilleKarilainen/Lotto/blob/main/UserInput.PNG

In this step the parameters of the game are asked from the user. It asks the user for integers amount, limit, and years. At the top is also the integer week, which is used to count the time. I'll tell about how the time is counted in detail a little later. It uses my method named readInt to ask the user the right amount of integers, and then puts them in an array.


https://github.com/VilleKarilainen/Lotto/blob/main/readInt.PNG


https://github.com/VilleKarilainen/Lotto/blob/main/CalculationAndResultStep.PNG

This is the fun part. This is where the results for each match in each attempt is calculated, and the time is counted. I used a few do- while loops to repeat the steps until the game is won. I also use a method calculateLotto to create new random arrays to be compared to the users input. 

https://github.com/VilleKarilainen/Lotto/blob/main/CalculateLottoMethod.PNG


## **LONELY GAME**
A lost childhood friend is playing a game by his own. The game is pretty simple. He will say a random number. If the number is prime, he shouts 'Yaayy'. If no, he will 'Sigh'. He will win if he says more prime number.

Just print out when will he win or not. And add extra message as follows:
- 'I WIN myself' if he win.
- 'I LOSE myself' if he loses.
- 'I DRAW myself' if he draws

## **Input format (prime.txt):**
- The first line of input will contain a single integer T, denoting the number of test cases.
- Each of the next T lines contains an integer N which has to be tested for primality.

## **Output format**
- T strings of either 'Sigh' or 'Yaayy' based on the primality of the number.
- Extra message string based on the game result.

## **Notes**
**Only use looping and branching to solve this problem** <br>
But you can start experimenting with arrays, you will need them.

## **Sample**

#### prime.txt:
```
10
10
9
8
7
6
5
4
3
2
1
```

#### Expected output:
````
Sigh
Sigh
Sigh
Yaayy
Sigh
Yaayy
Sigh
Yaayy
Yaayy
Sigh
I LOSE myself
```
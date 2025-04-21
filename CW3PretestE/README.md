### PROBLEM: SPACE RABBIT

Four childhood friends are still on a mission to find their lost friend in the bizarre dream world of HEADSPACE. Their journey has arrived at the space forest. Unfortunately, they encounter the SPACE RABBIT  — a deceptively powerful creature. In each round, the SPACE RABBIT attacks, and the adventurers must respond with their combined strength. But the forest’s magical aura alters their power each round through a chaos multiplier. They also possess toys that grant a boost to their attack.

You must determine the outcome of each round:
- If the party’s adjusted power is less than the rabbit’s power: BUNNY STRIKES BACK
- If the power is equal → CLASH
- If the power is greater → RABBIT DEFEATED, and the battle ends immediately. Then print: WINNER: ADVENTURERS DEFEATED THE RABBIT

Input (rabbit.txt):
- The first line contains a single integer:
rabbitPower — the constant power of the Feral Forest Rabbit.
- The second line contains a single integer:
R — the number of battle rounds.
Each of the next R pairs of lines contains:
A line with two values: chaosMultiplier and boost.
A line with four integers representing the power of the four friends.

Expected output:
```
Round 1: BUNNY STRIKES BACK
Round 2: CLASH
Round 3: BUNNY STRIKES BACK
Round 4: RABBIT DEFEATED
WINNER: ADVENTURERS DEFEATED THE RABBIT
```

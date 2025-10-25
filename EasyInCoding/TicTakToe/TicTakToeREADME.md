# 🎮 Tic Tac Toe – Machine Coding Round (Java)

A clean, object-oriented implementation of the **Tic Tac Toe** game in Java — designed as it would be in a **machine coding interview**.  
This project focuses on writing maintainable, extensible, and modular code, following **SOLID principles** and clean architecture practices.

---

## 🚀 Problem Statement

Design and implement a **Tic Tac Toe** game that can be played between two players on the console.

### Requirements:
1. The game should support an `N x N` board (default 3x3).
2. Two players take alternate turns.
3. Detect the winner or a draw.
4. Prevent invalid moves (cell already occupied).
5. Allow replay or exit after a game ends.

---

## 🧱 Class Design Overview

The design is based on **Object-Oriented Design principles** to keep the code modular and extensible.

### Main Classes:

| Class | Responsibility |
|-------|----------------|
| `Game` | Orchestrates the flow of the game – manages turns, board, and winner logic. |
| `Board` | Holds the grid and provides methods to place marks, check validity, and display state. |
| `Player` | Represents a player with a name and symbol (X / O). |
| `Cell` | Represents an individual cell on the board. |
| `GameStatus` | Enum defining states like `IN_PROGRESS`, `WIN`, or `DRAW`. |

---

## ⚙️ How to Run

### 1️⃣ Clone the repo
```bash
git clone https://github.com/kshitizhacoder/machine-coding-java.git
cd machine-coding-java/TicTacToe
javac src/*.java
java src.Main


### Sample Output 

Enter name for Player 1:
Kshitiz 
Enter symbol for Player 1:
X
Enter name for Player 2:
Utkarsh
Enter symbol for Player 2:
O
Game Start!
| | | |
-------
| | | |
-------
| | | |
-------
Kshitiz 's turn (X)
Enter row and column (0-indexed): 0 1
| |X| |
-------
| | | |
-------
| | | |
-------
Utkarsh's turn (O)
Enter row and column (0-indexed): 1 0
| |X| |
-------
|O| | |
-------
| | | |
-------
Kshitiz 's turn (X)
Enter row and column (0-indexed): 2 1
| |X| |
-------
|O| | |
-------
| |X| |
-------
Utkarsh's turn (O)
Enter row and column (0-indexed): 0 2
| |X|O|
-------
|O| | |
-------
| |X| |
-------
Kshitiz 's turn (X)
Enter row and column (0-indexed): 1 1
| |X|O|
-------
|O|X| |
-------
| |X| |
-------
Kshitiz  wins!
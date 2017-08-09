package tictactoe.game;
import java.util.Random;

public abstract class Player {

	private char playerMark;
	private boolean turn;

	// ctor 1
	Player(int pri, char mk) {
		// who goes first
		if (pri == 1) {
			this.turn = true;
		}
		else {
			this.turn = false;
		}

		// setting player's mark
		if (mk == 'X' || mk == 'O') {
			this.playerMark = mk;
		}
		else {
			System.out.println("U r bad at choices. you get X.");
		 	this.playerMark = 'X';
		}
	}

	// ctor 2
	Player(boolean tf, char mk) {
		this.turn = tf;
		this.playerMark = mk;
	}

	// ctor 3
	/** Anti-clone ctor! */
	Player(Player p) {
		this(!p.getTurn(), (p.getPlayerMark()=='X') ? ('O') : ('X'));
	}


	// 	Requires: Square at input id is empty.
	// 	Modifies: The value of the square at input id.
	/** Change the value of one of the squares on the board. */
	int move(int id) {
		return id;
		// setMark(id, this.playerMark);
	}

	void setPlayerMark(char mk) {
		this.playerMark = mk;
	}

	char getPlayerMark() {
		return this.playerMark;
	}

	void setTurn(boolean tf) {
		if (tf) {this.turn = true;}
		else this.turn = false;
	}

	boolean getTurn() {
		return this.turn;
	}

}

/////////////////////////////////////////////////

class HumanPlayer extends Player {
	HumanPlayer(int pri, char mk) {
		super(pri, mk);
	}

	HumanPlayer(boolean tf, char mk) {
		super(tf, mk);
	}

	HumanPlayer(Player p) {
		super(p);
	}

}

class ComputerPlayer extends Player {
	private int difficulty; // levels  1-3
	private Random r;

	ComputerPlayer(int pri, char mk, int dif) {
		super(pri, mk);
		this.difficulty = dif;
		this.r = new Random();
	}

	int getDifficulty() {
		return difficulty;
	}


	// make computer move using strategies based on difficulty
	int move() {
		// Temp
		//return 1;

		int dif = this.getDifficulty();

		switch (dif) {
			case 1:
				// easy: random unassigned placement
				return r.nextInt(9) + 1;
				break;
			case 2:
				// medium: some algorithm that attempts to win in one or two directions, then random if not possible.

				break;
			case 3:
				// hard: There's totally a way to win or tie every time. Ask Kara or the internet.

				break;
			default: return 1;
		}
		return 1;	// shouldn't be necessary after filling in the switch cases.
	}

}


/////////////////////////////////////////////////

class NotImplementedException extends Exception {
	// Check throwable class for defined fields to use.

	String message = "Warning: this function not implemented!";
}

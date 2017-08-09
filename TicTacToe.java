package tictactoe.game;

public class TicTacToe {

	public static void main(String[] args) {
		Comms io = new Comms();
		Game game = new Game();

		// State: Initialization
		// Who goes first?
		initialization();


		// State: Game
		// while not(game_over) alternate turns


		// State: endGame
		// You won/lost!!!
		// Want to play another round?

	}

	void initialization() {
		int priority;
		char mark;
		io.out("Welcome to Tic-Tac-Toe!")

		// Get player's priority
		io.out("Do you want to play first? (y/n)");
		char userResponse = io.inChar();
		if (userResponse == 'y') { priority = 1; }// game.setTurn(game.hp); }
		else if (userResponse == 'n') { priority = 2; }// game.setTurn(game.cp); }

		// Get player's mark
		io.out("Would you like your mark to be X or O? (x/o)");
		userResponse = io.inChar();
		if (userResponse == 'x') { mark = 'X'; }// game.hp.setPlayerMark}
		else if (userResponse == 'o') { mark = 'O'; }

		// Get player's difficulty
		io.out("What level of computer would you like to play? (1 = easy, 2 = medium, 3 = hard)");
		char userResponse = io.inChar();
		if (userResponse == '1') { difficulty = 1; }
		else if (userResponse == '2') { difficulty = 2; }
		else if (userResponse == '3') { difficulty = 3;	}


		// construct players
		game.hp = new HumanPlayer(priority, mark);
		game.cp = new ComputerPlayer(hp);	// hope conversion works
	}

	void game() {
		// TODO: write game procedure
		// loop through game.getTurn and
	}

	void endGame() {
		// TODO: write endGame procedure
	}
}






class Game {
	HumanPlayer hp = new HumanPlayer();
	ComputerPlayer cp = new ComputerPlayer();
	Player[] players = {hp, cp};
	GameGrid gg = new GameGrid();

	void setTurn(player p) {
		boolean isMember = false;
		for (x : players) {
			if (x.equals(p)) {
				isMember = true;
				p.setTurn(true);
			}
		}
		if (isMember) {
			for(x : players) {
				if (!x.equals(p)) {
					x.setTurn(false);
				}
			}
		}
		else io.out("Player problem!!!!!!!!");
	}

	Player getTurn() {
		for (x : players) {
			if (x.getTurn()) {
				return x;
			}
		}
	}

}

// Data structure (grid)

// TODO: Player interface
// TODO: Human player implementation
// TODO: AI player implementation

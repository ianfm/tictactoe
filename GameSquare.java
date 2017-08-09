package tictactoe.game;

public class GameSquare {
/** A GameSquare is one of the 9 squares in a tictactoe
	GameGrid. It contains a Mark, representing the X or
	O that players make during the game, but which is 
	empty until marked by a player.
	It must comply with the following:
	 - contain X, O, or nothing (space char.)
	 - be mutable only when empty
	 	* operation setX()
	 	* operation setY()
	 - contents accessible from GameGrid (getMark())
*/
	// Fields
	Mark mark = Mark.empty;	// default val.

	// constructors
	GameSquare() {
		// default ctor is only one needed.
		mark = Mark.empty;
	}

	// Methods
	char getMark() {
		return mark.entry();
	}
	void setX() {
		mark = Mark.ex;
	}
	void setO() {
		mark = Mark.oh;
	}
}


enum Mark {
	ex('X'),
	oh('O'),
	empty(' ');

	// Fields
	private char entry;

	// ctors
	Mark(char entry) {
		this.entry = entry;
	}

	// methods
	char entry() { return this.entry; }
}	
	
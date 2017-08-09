package tictactoe.game;

public class GameGrid {
/** A GameGrid is the grid of boxes that players use to play tictactoe.
	It consists of a 3 x 3 matrix of GameSquares, each with valid
	contents.
	It must comply with the following:
	 - be able to access and modify GameSquares
	 - supply a method of printing an ascii representation of the board
	 - ?
*/

	// Fields
	Grid grid;

	// Constructors
	GameGrid() {
		this.grid = new Grid();
	}

	// Methods
	char getMark(int id) {
		return this.grid.getMark(id);
	}

	void setMark(int id, char mark) {
		this.grid.setMark(id, mark);
	}

	void setX(int id) {
		this.grid.setX(id);
	}

	void setO(int id) {
		this.grid.setO(id);
	}

	void print() {
	/** A GameSquare is 7w x 5h chars, not including the borders.
		Therefore, the Mark will be at position (4,3) in each square.
	*/
		int NUM_LINES = 17;
		for (int lnCount = 1; lnCount <= NUM_LINES; ++lnCount) {
			if ((lnCount % 3) == 0) {
				if (lnCount==6 || lnCount==12) { printBorder(); }
				// Shitty hardcoding below: vvv
				// * Rows defined 0,1,2*
				else if (lnCount==3) { printMarked(0); }
				else if (lnCount==9) { printMarked(1); }
				else if (lnCount==15) {printMarked(2); }
			}
			else { printFiller(); }
		}
		System.out.println();
	}

	private void printFiller() {
		String fillerRow = "       #       #       ";
		System.out.println(fillerRow);
	}

	/** I'm a fuck and hardcoded the rows in based on lnCount */
	private void printMarked(int row) {
		int baseId = (row==0) ? (1) :
										(row==1) ? (4) : (7);
		String markedRow = "   %c   #   %c   #   %c   \n";
		System.out.printf(markedRow, 	this.grid.getMark(baseId + 0),
										this.grid.getMark(baseId + 1),
										this.grid.getMark(baseId + 2));
	}

	private void printBorder() {
		String borderRow = "#######################";
		System.out.println(borderRow);
	}
}



class Grid {
	// grid of spaces
	private char[][] grid;

	Grid() {
		this.grid = new char[3][3];
	}


	/** returns row given input id */
	private int findRow(int id) {
		int row = -1;	// bogus init value
		if (id >= 1 && id <= 3) {row = 0;}
		else if (id >= 4 && id <= 6) {row = 1;}
		else if (id >= 7 && id <= 9) {row = 2;}
		return row;
	}

	/** returns col given input id */
	private int findCol(int id) {
		int rem = id % 3;
		int col = (rem == 1) ? (0) :
								 (rem == 2) ? (1) : (2);
		return col;
	}

	/** Requires:	id is a valid square identifier (1-9)
		Modifies:	nothing.
		Effects:	Returns the mark in the spec'd square	*/
	protected char getMark(int id) {
		return this.grid[findRow(id)][findCol(id)];
	}

	/** Returns true is square is empty */
	private boolean isEmpty(int id) {
		return (getMark(id)!='X' && getMark(id)!='O');
	}

	/** Template for setX and setO */
	protected void setMark(int id, char mark) {
		//if (!isEmpty(id)) {exit();}
		grid[findRow(id)][findCol(id)] = mark;
	}

	public void setX(int id) { setMark(id, 'X'); }

	public void setO(int id) { setMark(id, 'O'); }
}

// C++ Ternary:
// var = (cond. expr) ? (valIfTrue) : (valIfFalse)

// Cascaded Ternary:
// var = (cond. expr) ? (valIfTrue) :
//									  (2nd cond. expr) ? (val2) : (val3)

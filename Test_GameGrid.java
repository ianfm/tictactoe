package tictactoe.game;

public class Test_GameGrid {
	GameGrid gg = new GameGrid();

// GRID TESTS
	void T_getMark() {
		System.out.println("Below should be blank space.");
		System.out.println(gg.getMark(1));
	}

	void T_setX() {
		gg.setX(1);
		System.out.println("Below should be char X.");
		System.out.println(gg.getMark(1));
	}

	void T_setO() {
		gg.setO(1);
		//System.out.println("Below should be char O.");
		//System.out.println(gg.getMark(1));
		System.out.println("Below should be a grid with top left = O");
		gg.print();
	}


// GAMEGRID TESTS
	void T_print() {
		gg.print();
	}

	void demoFillX() {
		for (int i=2; i <= 9; ++i) {
			gg.setX(i);
		}
		System.out.println("Below should be a grid with top left = O and all others = X.");
		gg.print();
	}

}

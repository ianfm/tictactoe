package tictactoe.game;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("Beginning TestMain:\n");

		System.out.println("1 - TestPlayer:\n");
		TestPlayer tp = new TestPlayer();
		tp.runTests();
		System.out.println("TestPlayer Successful!\n\n");

		System.out.println("2 - TestGrid:\n");
		TestGrid();
		System.out.println("TestGrid Successful!\n\n");

		System.out.println("TestMain Complete!");

	}

	static void TestGrid() {
		System.out.println("Beginning Test_GameGrid...");
		Test_GameGrid testgrid = new Test_GameGrid();
		testgrid.T_getMark();
		testgrid.T_setX();
		testgrid.T_setO();
		System.out.println();
		testgrid.demoFillX();
	}
}


/*
Test using:

javac -g -d . TestMain.java Test_GameSquare.java GameSquare.java
java tictactoe.game.TestMain

Both from C:\...\PracticePrograms\
*/

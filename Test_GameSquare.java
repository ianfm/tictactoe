package tictactoe.game;

public class Test_GameSquare {

	GameSquare gs = new GameSquare();

	// Test_GameSquare() {
	// 	this.gs = new GameSquare();
	// }


	// void print(String func) {

	// }

	// Test default ctor
	void testDefault() {
		String func = new String();
		func = "testDefault";
		// gs untouched right now.
		System.out.printf("The entry in GameSquare for %s is: %c \n", func, gs.getMark());
		assert (gs.getMark()==' ') : "Failure: testDefault has failed.";
	}

	// test setX()
	void testEx() {
		String func = "testEx";
		gs.setX();
		// gs modified: should have X
		System.out.printf("The entry in GameSquare for %s is: %c\n", func, gs.getMark());
		assert (gs.getMark()=='X') : "Failure: testEx has failed.";
	}


	// test setX()
	void testOh() {
		String func = "testOh";
		gs.setO();
		// gs modified: should have X
		System.out.printf("The entry in GameSquare for %s is: %c\n", func, gs.getMark());
		assert (gs.getMark()=='O') : "Failure: testOh has failed.";
	}
}
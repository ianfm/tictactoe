package tictactoe.game;

public interface Testable {

	public void checkFields(Player p);
	public Player[] createInstances();
	public void testInstances(Player[] instances);

}
package tictactoe.game;

public class TestPlayer implements Testable {

	public Player[] createInstances() {
		Player firstX = new HumanPlayer(1,'X');
		Player secondO = new HumanPlayer(false,'O');
		Player anti_firstX = new HumanPlayer(firstX);

		Player cpuFirstXeasy = new ComputerPlayer(1,'X',1);
		Player cpuFirstXmed = new ComputerPlayer(1,'X',2);
		Player cpuFirstXhard = new ComputerPlayer(1,'X',3);

		Player[] instances = {firstX, secondO, anti_firstX, cpuFirstXeasy, cpuFirstXmed, cpuFirstXhard};
		return instances;
	}

	public void checkFields(Player somePlayer) {
		System.out.println("Priority:");
		System.out.println(somePlayer.getTurn());
		System.out.println("Mark:");
		System.out.println(somePlayer.getPlayerMark());
	}

	public void testInstances(Player[] instances) {
		for (Player p : instances) {
			this.checkFields(p);
		}

		System.out.println("Instances tested.");
	}

	public void runTests() {
		Player[] players = this.createInstances();
		this.testInstances(players);
	}

}

//TODO: write more/better player tests. wtf do these even do?

package tictactoe.game;
import java.io.*;

public class Comms {
	String inStr() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

	char inChar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return (char) br.read();
	}

	void outStr(String output) {
		System.out.println(output);
	}
}
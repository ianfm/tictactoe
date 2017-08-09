/** test a ranged RNG using random().
selects a number from the range 0-8 and increases it by 1 to yield
a number in the effective range of 1-9.*/
import java.util.Random;
class RandDemo {
	public static void main(String[] args) {
		Random r = new Random();

		for (int i=0 ; i<50 ; ++i) {
			System.out.println(r.nextInt(9) + 1);
		}
	}
}

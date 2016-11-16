import java.io.IOException;
/** Experimentation with integers
*/

public class PowerTour{
	private static void powerTour(int x) throws IOException{
		long acc = x;
		while (true){
			System.out.println(acc);
			System.in.read();
			acc = acc * x;
		}
	}

	public static void main(String [] args) throws IOException{
		powerTour(5);
	}
} 
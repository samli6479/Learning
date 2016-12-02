import javax.sound.midi.MidiUnavailableException;

public class test{
	private int score;

	public test(int s){
		score = s;
	}

	public void show(){
		System.out.println("Test Score is " + score);
	}

	public void discuss(){
		if (score > 50){
			System.out.println("We are great!");
		}
		else {
			try {throw new MidiUnavailableException("Test score too low.");
				} catch (Exception e){
					System.out.println("Got it");
				}
		}
	}

	public void talk() throws MidiUnavailableException{
		if (score >100){
			throw new MidiUnavailableException("Score should never be more than 100");
		}
		else {
			this.discuss();
		}

	}

	public static void main(String[] args){
		test t = new test(10);
		t.show();
		t.discuss();
		t.score = 101;

		try {
			t.talk();
		} catch (Exception e){
			System.out.println(
				"Tried to run: " + e);
		}
		System.out.println(t.score);
	}

}


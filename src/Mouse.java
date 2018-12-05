
public class Mouse extends Animal {

	public Mouse() {
		super();
	}

	@Override
	public void makeNoise() {
		System.out.println("MOUSE squeaks.");
	}

	@Override
	public void eat() {
		System.out.println("MOUSE messily consumes MOLDY CHEDDAR.");
	}

}

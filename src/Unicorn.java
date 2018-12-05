
public class Unicorn extends Animal {

	public Unicorn() {
		super();
	}

	@Override
	public void makeNoise() {
		System.out.println("UNICORN snorts and huffs.");
	}
	
	@Override
	public void eat() {
		System.out.println("UNICORN wreaks havoc on a SPRINKLER SYSTEM.");
		System.out.println("UNICORN sees a RAINBOW come from the SPRINKLER SYSTEM.");
		System.out.println("UNICORN eats the RAINBOW.");
	}
	
}
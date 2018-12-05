import java.util.ArrayList;

public class Farm {

	public Farm() {
		
	}

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		farm.add(new Unicorn());
		farm.add(new Wolf());
		farm.add(new Cat());
		farm.add(new Cat());
		farm.add(new Mouse());
		farm.add(new Mouse());
		
		for (Animal a : farm) {
			System.out.println("Here's " + a.getClass().getName().toUpperCase() + "!");
			a.makeNoise();
			System.out.println("Here's " + a.getClass().getName().toUpperCase() + "!");
			a.eat();
		}
	}

}

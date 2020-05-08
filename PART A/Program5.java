import java.util.*;

public interface Animal {
	void eat();
	void sound();
}

public interface Tired_Animal extends Animal {
	void tired();
}

public class snake implements Animal, TiredAnimal {
	public void eat() {
		System.out.println("Snake eats smaller animals like rats and frogs");
	}

	public void tired() {
		System.out.println("Snake is never lazy");
	}

	public void sound() {
		System.out.println("Snake makes a hissing sound");
	}
}

public class lion implements Animal, TiredAnimal {

	public void tired() {
		System.out.println("Lion most of the time is lazy");
	}

	public void eat() {
		System.out.println("Lion eats other bigger animals like deer");
	}

	public void sound() {
		System.out.println("Lion makes a roaring sound");
	}
}

public class Program5 {
	public static void main(String[] args) {
		snake sam = new snake();
		lion leo = new lion();
		sam.eat();
		sam.sound();
		sam.tired();

		leo.eat();
		leo.sound();
		leo.tired();

	}
}

package source0708;

public class Animal {
	String name;
	
	void nature() {
		System.out.println("Animal nature() called");
	}

}

class Fish extends Animal {
	String color;
	
	void nature() {
		System.out.println("Fish nature() called");
	}
	
}

class Human extends Animal {
	void nature() {
		System.out.println("Human nature() called");
	}
}

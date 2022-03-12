import impl.FlyToMoonImpl;

public class main {

	public static void main(String[] args) {
		// Interface with different implementation.
		// Polymorphism for duck

		Duck rubberDuck = new RubberDuck();
		rubberDuck.setFlyBehaviour(new FlyToMoonImpl());
		rubberDuck.performFly();
		rubberDuck.performQuack();
		rubberDuck.performSwim();
	}
}

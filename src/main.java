import classes.Character;
import classes.Duck;
import classes.King;
import classes.RubberDuck;
import impl.BowAndArrowBehaviourImpl;
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

		Character chara = new King();
		chara.fight();
		chara.setWeapon(new BowAndArrowBehaviourImpl());
		chara.fight();
	}
}

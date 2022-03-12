package classes;
import inter.FlyBehaviour;
import inter.QuackBehaviour;

public abstract class Duck {

	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public Duck() {
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performSwim() {
		System.out.println("All ducks can swim.");
	}

	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}

	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}
}

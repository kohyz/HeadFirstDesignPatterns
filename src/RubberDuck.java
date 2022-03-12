import impl.NoFlyingImpl;
import impl.QuackImpl;

public class RubberDuck extends Duck {
	public RubberDuck() {
		quackBehaviour = new QuackImpl();
		flyBehaviour = new NoFlyingImpl();
	}
}

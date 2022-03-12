package classes;
import impl.SwordBehaviourImpl;

public class King extends Character {
	public King() {
		weaponBehaviour = new SwordBehaviourImpl();
	}
}

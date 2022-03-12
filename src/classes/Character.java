package classes;
import inter.WeaponBehaviour;

public abstract class Character {
	WeaponBehaviour weaponBehaviour;

	public Character() {
	}

	public void fight() {
		weaponBehaviour.useWeapon();
	}

	public void setWeapon(WeaponBehaviour wep) {
		this.weaponBehaviour = wep;
	}
}

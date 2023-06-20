package warriors;

import armors.Armor;
import weapons.Weapon;
import weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee, Armor>{
    public Infantryman(String name, int healthPoint, Melee weapon, Armor armor) {
        super(name, healthPoint, weapon, armor);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}

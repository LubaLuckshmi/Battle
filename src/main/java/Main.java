import armors.Hauberk;
import armors.Shield;
import warriors.Archer;
import warriors.Infantryman;
import warriors.Warrior;
import weapons.meleeWeapon.Axe;
import weapons.meleeWeapon.Sword;
import weapons.rangedWeapon.Bow;
import weapons.rangedWeapon.CrossBow;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow(), new Hauberk()));
        team1.add(new Infantryman("John", 150, new Axe(), new Hauberk()));

        Team<Archer> team2 = new Team<>();
        team2.add(new Archer("Jimmy", 100, new CrossBow(), new Hauberk()));
        team2.add(new Archer("Peter", 100, new Bow(), new Hauberk()));

        Team<Infantryman> team3 = new Team<>();
        team3.add(new Infantryman("James", 150, new Sword(), new Shield()));
        team3.add(new Infantryman("Archi", 100, new Sword(), new Shield()));

        System.out.println(team1);
        System.out.println("----------------");
        System.out.println(team2);
        System.out.println("----------------");
        System.out.println(team3);
        System.out.println("----------------");



        Battle battle1 = new Battle(new Infantryman("John", 150, new Axe(), new Hauberk()),
                new Archer("Robin", 100, new Bow(), new Shield()));
        battle1.fight();
    }
}

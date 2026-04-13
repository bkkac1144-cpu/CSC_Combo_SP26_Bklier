package time;

public class PersonPilot {

	public static void main(String[] args) {
		Person hero = new Person();
		hero.setHealth(100);
		hero.setStrength(25);
		System.out.println(hero);
		hero.setName("Balls");
		hero.setWeapon("BaseBallBat", 15);
		Person Villain = new Person(100, 35, "Tickler", "Confetti shotgun", 20);
		System.out.println(Villain);

		while (hero.getHealth() > 0 && Villain.getHealth() > 0) {
			int hDamage = 0;
			int vDamage = 0;
			if (hero.getHealth() > 0) {
				hero.hit(Villain);
				hDamage = hero.hit(Villain);
				System.out.println(hero.getName() + " hits " + Villain.getName() + " for " + hDamage + " points");
				if(hDamage > 60) System.out.println("Crit");
			}
			if (Villain.getHealth() > 0) {
				vDamage = Villain.hit(hero);

				Villain.hit(hero);
				System.out.println(Villain.getName() + " hits " + hero.getName() + " for " + vDamage + " points");
				if(vDamage > 60) System.out.println("Crit");
			}
		}
		if (hero.getHealth() > 0)
			System.out.println(hero.getName() + " Wins!");
		else
			System.out.println(Villain.getName() + " Wins!");
		
	}

}

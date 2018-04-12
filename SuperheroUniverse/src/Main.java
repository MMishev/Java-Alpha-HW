import org.omg.PortableServer.POA;

public class Main {
    public static void main(String[] args) throws Exception {
        Superhero professorChaos = new Superhero("Proffesor Chaos","Butters Stotch",Alignment.EVIL);
        Power minionAttack = new Power("Minion Atack",PowerType.OTHER,100);
        professorChaos.addPower(minionAttack);
        professorChaos.addImmunity(PowerType.MUSCLE);

        Superhero batman = new Superhero("Batman", "Bruce Wayne", Alignment.GOOD);
        Power kryptonite = new Power("Kryptonite", PowerType.CHEMICAL,20);
        batman.addPower(kryptonite);

        Superhero superman = new Superhero("Superman", "Clark Kent", Alignment.GOOD);
        Power punch = new Power("Punch", PowerType.MUSCLE,100);
        superman.addPower(punch);

        Superhero suckaberg = new Superhero("Suckaberg","Mark Zuckerberg",Alignment.EVIL);
        Power scam = new Power("Scam",PowerType.MAGIC,100);
        suckaberg.addPower(scam);

        Superhero normalPerson = new Superhero("Pesho","Pesho Peshov",Alignment.NEUTRAL);
        Power riot = new Power("Riot", PowerType.MUSCLE,0);
        normalPerson.addPower(scam);

//        batman.attack(superman, kryptonite);
        superman.attack(professorChaos,punch);
        professorChaos.attack(superman,minionAttack);
        batman.attack(superman,punch);
//        superman.attack(batman,punch);

//        superman.getPowers();
//        System.out.printf("Batman's hit points are %d",batman.getHitPoints());

    }


}

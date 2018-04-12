import java.util.ArrayList;
import java.util.List;

public class Superhero {
    private String name;
    private String secretIdentity;
    private Alignment alignment;
    private int hitPoints;
    private List<PowerType> immunities;
    private List<Power> powers;

    public Superhero(String name, String secretIdentity, Alignment alignment) {

        this.name = name;
        this.secretIdentity = secretIdentity;
        this.alignment = alignment;
        this.hitPoints = 100;
        this.immunities = new ArrayList<PowerType>();
        this.powers =  new ArrayList<Power>();

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if (name.length() > 3 && name.length() < 60) {
            this.name = name;
        }
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        if (name.length() > 3 && name.length() < 60) {
            this.secretIdentity = secretIdentity;
        }
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints >= 0 && hitPoints <= 100) {
            this.hitPoints = hitPoints;
        }
    }

    public void getPowers(){
        for(Power p : powers){
            System.out.printf("%s, ",p.getName());
        }
    }

    public void addPower(Power power){
        powers.add(power);

    }

    public void addImmunity(PowerType immunity){
        immunities.add(immunity);
    }

    public void attack(Superhero enemy, Power power){
        if (powers.contains(power)) {
            System.out.printf("%s attacked %s with %s!\n", name, enemy.getName(), power.getName());
            if (enemy.immunities.contains(power.getType())) {
                System.out.printf("%s is immune to %s!\n", enemy.getName(), power.getName());
                System.out.printf("%s's hit points remain intact!\n\n", enemy.getName());
            } else {
                enemy.setHitPoints(enemy.getHitPoints() - power.getDamage());
                // System.out.printf("%s attacked %s with %s!\n",name,enemy.getName(),power.getName());
                if (enemy.getHitPoints() == 0) {
                    System.out.printf("%s has fainted!\n\n", enemy.getName());
                } else {
                    System.out.printf("%s's hit points are down to %d!\n\n", enemy.getName(), enemy.getHitPoints());
                }
            }
        }
        else{
            System.out.printf("%s doesn't know how to use %s, %s was unharmed!\n\n",name,power.getName(),enemy.getName());
        }

    }

}

public class Power {
    private String name;
    private PowerType type;
    int damage;

    public Power(String name, PowerType type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 3 && name.length() < 20) {
            this.name = name;
        }
    }

    public PowerType getType() {
        return type;
    }

    public void setType(PowerType type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage > 0 && damage <= 100) {
            this.damage = damage;
        }
    }
}

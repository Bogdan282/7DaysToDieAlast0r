package app;

public class Entity {
    private String name;
    private int health;
    private Weapon weapon;
    private Protection protection;

    public Entity(String name, int health, Weapon weapon, Protection protection) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }
}

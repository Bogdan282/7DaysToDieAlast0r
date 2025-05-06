package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("7DaysToDieAlast0r V1!");

        Entity player = new Entity("Игрок", 100, new Weapon("noWeapon", 20), new Protection("noProtection", 0));

        System.out.println(player.getWeapon().getDamage());
        System.out.println(player.getProtection().getName());
    }
}
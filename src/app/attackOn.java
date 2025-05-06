package app;

import java.util.Scanner;

public class attackOn {
    private String mobName;
    private int damage;
    private int heath;
    private Entity player;

    public attackOn(String mobName, int damage, int heath) {
        this.mobName = mobName;
        this.damage = damage;
        this.heath = heath;
    }

    public boolean startAttack(attackOn attackOn, Entity player) {
        String win = "";
        Scanner scn1 = new Scanner(System.in);
        boolean shield = false;
        while(win.isEmpty()) {
            System.out.println();
            System.out.println("Ваше здоровье - " + player.getHealth() + ". Атакуем или защищаемся?");
            String attack = scn1.nextLine();
            if(attack.equalsIgnoreCase("Атакуем")) {
                attackOn.heath = attackOn.heath - player.getWeapon().getDamage();
                System.out.println("Вы нанесли противнику " + player.getWeapon().getDamage() + " урона. В общем у него осталось" + attackOn.heath + " здоровья.");
                if(attackOn.getHeath() <= 0) {
                    win = "true";
                }
            } else if(attack.equalsIgnoreCase("Защищаемся")) {
                System.out.println("Защищаемся");
                shield = true;
            }
            System.out.println("Противник атакует.");

            if(!shield){
                player.setHealth(player.getHealth() - attackOn.getDamage() + player.getProtection().getProtectNum());
                System.out.println("Вас атаковали. Сейчас у вас " + player.getHealth() + " здоровья.");
                if(player.getHealth() <= 0) {
                    win = "false";
                }
            } else if(shield){
                System.out.println("Противник пытался вас блокировали удар.");
                shield = false;
            }
        }
        if(win.equalsIgnoreCase("true")){
            System.out.println("Вы победили! Вы нашли остатки еды и восстановили здоровье.");
            player.setHealth(100);
            return  true;
        } else{
            System.out.printf("Вы проиграли.");
            return false;
        }
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeath() {
        return heath;
    }

    public void setHeath(int heath) {
        this.heath = heath;
    }

    public Entity getPlayer() {
        return player;
    }

    public void setPlayer(Entity player) {
        this.player = player;
    }
}

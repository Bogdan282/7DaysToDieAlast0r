package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("7DaysToDieAlast0r V1!");
        Scanner scn = new Scanner(System.in);

        Entity player = new Entity("Игрок", 100, new Weapon("noWeapon", 20), new Protection("noProtection", 0));

        DayEvent day1 = new DayEvent(1, "Мусорка") {
            @Override
            public void eventStart() {
                System.out.println("День: 1. Вы появились в лесу и начали изучать местность. Вы увидели мусорку. \n" +
                        "Хотите её посетить? Возможно там будет что-то что поможет выжить, а может и нет.");
                String wantAttend = scn.nextLine();
                if(wantAttend.equalsIgnoreCase("Да")) {
                    System.out.println("Вы увидели что на мусорке нахожится злая собака возле каких-то вещей. \n" +
                            "Хотите попытаться атаковать чтоб осмотртеь лут?");
                    String wantAttack = scn.nextLine();
                    if(wantAttend.equalsIgnoreCase("Да")) {
                        System.out.printf("Вы решили атаковать.");
                        attackOn dog = new attackOn("Собака", 5, 30);
                        if(dog.startAttack(dog, player)){
                            System.out.println("Вы пережили день и идёте спать в ожидании следующего дня.");
                        } else {
                            System.out.println("Вы проиграли.");
                        }
                    } else if(wantAttend.equalsIgnoreCase("Нет")) {
                        day1Sceep(player);
                    }
                } else {
                    day1Sceep(player);
                }
            }
        };
        day1.eventStart();
        if(player.getHealth() > 0) {
            // day2
        } else {
            System.out.println("Вы проиграли.");
        }
        };
    public static void day1Sceep(Entity player) {
        System.out.println("Вы простояли весь день и остались голодными и потеряли 20 очков здоровья.");
        player.setHealth(player.getHealth() - 20);
        System.out.println("Сейчас у вас " + player.getHealth() + " очков здоровья.");
    }
}
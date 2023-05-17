package Tugas;

public class App{
    public static void main(String[] args) {
        // A. Static polymorphism pada class Hero dan static polymorphism pada class Enemy
        System.out.println("\nCHARACTER 1");
        Hero ch1 = new Hero("Layla", "Up, Down, advance, and back off");
        ch1.name();
        ch1.move();
        ch1.move("Left");
        
        System.out.println("\nCHARACTER 2");
        Enemy ch2 = new Enemy("Syaitonn","Up, advance, and back off");
        ch2.name();
        ch2.move();
        ch2.move(1);
        System.out.println("-----------------------------");


        // B. Dynamic polymorphism sebuah referensi dari class Character ke objek class: Hero, Enemy, Witch, dan Fighter 
        Character hero1 = new Hero("\nLayla", "Up and Down ");
        hero1.move();
        Character fighter1 = new Fighter("Up and Down","Magic Shoot");
        fighter1.move();

        Character enemy1 = new Enemy("Syaitonn","Up");
        enemy1.move();
        Character witch1 = new Witch("Down", "Black win");
        witch1.move();
        System.out.println("-----------------------------");
 
        // C. Dynamic polymorphism sebuah referensi dari class Character ke objek Witch yang berubah (di-cast) menjadi objek Fighter
        Character obj = new Witch("Up","Black win");
        obj.move();

        if(obj instanceof Fighter){
            Fighter fighter = (Fighter) obj;
        }
        
        //Atau
        obj = (Fighter) obj;
        obj.move();
    }
}
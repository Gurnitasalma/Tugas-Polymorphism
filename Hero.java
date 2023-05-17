package Tugas;

public class Hero extends Character {
    public String name;

    Hero( String name, String move) {
        super(move);
        this.name = name;
        //TODO Auto-generated constructor stub
    }
    
    public void name(){
        System.out.println("Hero name      : " + this.name);
    }

    @Override
    public void move(){
        System.out.println("Hero can move  : " + this.move);
    }

    public void move(String direction){
        System.out.println("Direction      : " + direction);
    }
}

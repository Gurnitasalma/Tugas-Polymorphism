package Tugas;

public class Enemy extends Character{
    public String name;

    Enemy(String name, String move) {
        super(move);
        this.name = name;
        //TODO Auto-generated constructor stub
    }

    public void name(){
        System.out.println("Enemy name     : " + this.name);
    }

    @Override
    public void move(){
        System.out.println("Enemy can move : " + this.move);
    }
    public void move(int step){
        System.out.println("Step           : " + step );
    }
}

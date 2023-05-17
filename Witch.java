package Tugas;

public class Witch extends Hero{
    private String witch;

    Witch(String move, String witch) {
        super(move, move);
        this.witch = witch;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void move(){
        System.out.println("This Witch have Black win !!!");
    }

    
}

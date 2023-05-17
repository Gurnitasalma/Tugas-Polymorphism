package Tugas;

public class Fighter extends Hero{
   private String fighter;
    
    Fighter(String move, String fighter) {
        super(move, move);
        this.fighter = fighter;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void move(){
        System.out.println("This Fighter have Magic Shoot !!!\n");
    }
    public void move(String fighter){
        System.out.println("I want to kill you with" + fighter);
    }
    
}

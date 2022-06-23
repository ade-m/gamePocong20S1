package model;

public class Pocong extends Enemy{
    //samuel : buat kelas baru - poin 
    @Override
    public void attack(){
        super.attack();
        super.hp-=1;
        //ini keterangan
    }
    public void jump(){
        System.out.println("Pocong Loncat - loncat");
        
    } 
}

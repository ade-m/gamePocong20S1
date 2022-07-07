package model;

public class Pocong extends Musuh implements JubahIronman,GauntletThanos{
    //samuel : buat kelas baru - poin 
    @Override
    public void attack(){
        System.out.print("Pocong ");
        //super.attack();
        super.hp-=1;
        //ini keterangan
    }
    public void jump(){
        System.out.println("Pocong Loncat - loncat");
        
    }
    @Override
    public void menghindar() {
        // TODO Auto-generated method stub
        System.out.print("Menghindar");
    }
    @Override
    public void tembakleser() {
        // TODO Auto-generated method stub
        System.out.println("------------->");
    }
    @Override
    public void jarvis() {
        // TODO Auto-generated method stub
        System.out.println("hai");
        
    }
    @Override
    public void teleport() {
        // TODO Auto-generated method stub
        System.out.println("pocong teleport");
    }
    @Override
    public void snap() {
        // TODO Auto-generated method stub
        System.out.println("pocong snap");
    } 
}

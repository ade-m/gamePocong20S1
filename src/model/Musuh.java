package model;

public abstract class Musuh {
    public int hp=0;
    //attack, walk
    public abstract void attack();

    public int walk(){
        return 1;
    }
    //menghindar
    public abstract void menghindar();
}

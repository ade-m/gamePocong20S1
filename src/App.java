import model.Burung;
import model.Enemy;
import model.Musuh;
import model.Pocong;
import model.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
        Util.bacaFile();
       Zombie a = new Zombie();
       Pocong b = new Pocong();
       Burung c = new Burung();
        Enemy lawan;

       Enemy[] musuh = {new Zombie(),new Zombie(),new Burung()};
       
       musuh[0].attack();
       musuh[1].attack();
       musuh[2].attack();
       a.attack();
       b.attack();
       c.attack();

       a.walk();
       b.jump();
       c.fly();

       c.jump();
       lawan = getEnemy(2);
       lawan.attack();
       //methos balikin nilai, jika 1 burung, jika 2 pocong jika 3 zombie
       int pilihan=0;
       Enemy ax = new Enemy();
        Musuh AE = new Pocong();
    }
    public static Enemy getEnemy(int pilihan){

       if(pilihan==1) return new Zombie();
       else if(pilihan==2) return new Zombie();
       else return new Burung();
    }
}

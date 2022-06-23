import model.Burung;
import model.Pocong;
import model.Zombie;

public class App {
    public static void main(String[] args) throws Exception {
       Zombie a = new Zombie();
       Pocong b = new Pocong();
       Burung c = new Burung();

       a.attack();
       b.attack();
       c.attack();

       a.walk();
       b.jump();
       c.fly();

       c.jump();
    }
}

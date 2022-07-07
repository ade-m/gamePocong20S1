import java.io.BufferedReader;
import java.io.FileReader;

public class Util {
    static String lokasiFile= "/Users/admin/Documents/GitHub/PBO20S1/gamePocong20S1/README.md";
    //windows gunakan \\
    public static void bacaFile(){
        String data;
        FileReader fin=null;
        try {
            fin = new FileReader(lokasiFile);
            BufferedReader br = new BufferedReader(fin);
            do{
                data = br.readLine();
                if(data!=null) 
                    System.out.println(data);
            }while(data!=null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }
        finally{
            if(fin!=null){
                try {
                    fin.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    public void tulisFile(){

    }
}

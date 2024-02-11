package SinavCalismalari;
import java.io.File;


public class DosyaIslemleri {
    public static void createNewFile(){
        File file=new File("C:\\Users\\emrcn\\IdeaProjects\\files\\metin.txt");
        try{
            file.createNewFile();
            System.out.println("Dosya oluşturuldu!");
        }catch (Exception e){
            System.out.println("Dosya zaten var!");
        }
    }

}

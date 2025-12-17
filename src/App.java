import java.nio.file.Paths;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "spotify_2023.csv";
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
        while(fileReader.hasNextLine()){
            System.out.println(fileReader.nextLine());
        }

       }catch(Exception e){
        System.out.println("error");
       }
       
    }
}

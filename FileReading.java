import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReading {
    
    public static void main(String[] args){

        File textFile = new File("main.txt");

        try{

            Scanner scan = new Scanner(textFile);

            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();

        } catch(IOException e){
            System.out.println("nag error siya");
        }
        
    }

}

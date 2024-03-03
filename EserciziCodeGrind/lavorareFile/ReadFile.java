package EserciziCodeGrind.lavorareFile;
import java.io.*;
public class ReadFile {

    public static void main(String[] args) throws Exception{
        File text = new File("EserciziCodeGrind/lavorareFile/file/file.txt");

        BufferedReader object = new BufferedReader(new FileReader(text));

        String stringa;
        while ((stringa = object.readLine()) != null) { System.out.println(stringa) ;}

    }

}

import java.io.*;
import java.util.ArrayList;

public class MasterMind {
    public static void main(String[] args) {
        ArrayList<String> lines= getLines(args[0]);
        ArrayList<String> twoCharacterWords= wordsWithSizeTwo(lines);





        }

        public static String randomword(ArrayList twoCharacterWords) {
            twoCharacterWords.get((int)(Math.random(twoCharacterWords.length()));
            return
        }




    public static ArrayList<String> getLines (String filename){
        File f = new File(filename);
        BufferedReader br = null;
        ArrayList<String> lineArray = new ArrayList<>();
        try{
            FileReader fr = new FileReader(f);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                lineArray.add(line);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("error");
        }
        catch (IOException e){
            System.out.println("can't read");
        }
        try{
            br.close();
        }
        catch(IOException e){
            System.out.println("can't close");
        }
        catch(NullPointerException e){
            System.out.println("File never opened");
        }
        return lineArray;
    }
    public static ArrayList<String> wordsWithSizeTwo(ArrayList<String> words) {
               ArrayList<String> TwoCharacterWords = new ArrayList<>();
                 for(String Character : words) {
                        if (Character.length() == 2)
                              TwoCharacterWords.add(Character);
                   }
                 return  TwoCharacterWords;


         }

}



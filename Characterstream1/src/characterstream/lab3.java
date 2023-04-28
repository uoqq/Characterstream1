package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab3 {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("lab3.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println("47.9");
            output.println("175");
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            String s;
            FileReader file = new FileReader("lab3.txt");
            BufferedReader input = new BufferedReader(file);
            while ((s = input.readLine()) != null)
                System.out.println(s);
        } catch (FileNotFoundException ex){
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

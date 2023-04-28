package characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

// แปลง type ก่อนค่อยคำนวณ
public class lab4 {
    public static void main(String[] args) {
        try{
            PrintWriter output = new PrintWriter("lab4.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println("47.9");
            output.println("175");
            output.close();
        } catch (FileNotFoundException ex){
            Logger.getLogger(lab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("lab4.txt");
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            System.out.println(name); // Harry Potter
            int age = input.nextInt();
            System.out.println(age); // 19
            double weight = input.nextDouble();
            System.out.println(weight); // 47.9
            double height = input.nextDouble();
            System.out.println(height); // 175.0
        } catch (FileNotFoundException ex){
            Logger.getLogger(lab4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}

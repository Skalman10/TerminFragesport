import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Frågesport {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("src", "input"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner xd = new Scanner(System.in);
        int fel = 0;
        String [] questions = new String[6];
        String [] correct = new String[questions.length];
        for (int i = 0;in.hasNext();i++){
            questions[i] = in.nextLine();
            correct[i] = in.nextLine();
        }
        String answer = "";
        for (int i2 = 0; i2< questions.length;i2++) {
                System.out.println(questions[i2]);
            answer = xd.next();
            if (correct[i2].contains(answer.toUpperCase())) {
                System.out.println("Du hade rätt");
                } else {
                fel++;
                System.out.println("Du hade fel");
        }
            }
        System.out.println("Du hade "+fel+" fel");
        }
    }

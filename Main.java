import java.util.Scanner;


/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(){
        System.out.print('\u000C');             // clear screen
        Scanner input = new Scanner(System.in);
        
        System.out.println("What's your name?");
        String name = input.next();
        
        if (name.equals("Alice") || name.equals("Bob"))
            System.out.println("Hey " + name + "!");
        else
            System.out.println("You are not Alice or Bob. You are "
            + name + ".");
        
    }
}
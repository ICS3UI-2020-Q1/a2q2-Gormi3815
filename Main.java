import java.util.Scanner;
/**
 * this program will tell the user which of the two numbers they put in is bigger
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println ("Please enter an integer");
    int first_Number = input.nextInt();
    System.out.println("Please enter a second integer");
    int second_Number = input.nextInt();

    if (first_Number > second_Number) {
      System.out.println (+ first_Number + " is bigger than " + second_Number + ".");
    }
      else if (first_Number < second_Number) {
        System.out.println (+ second_Number + " is bigger than " + first_Number + "." );
      }
        else if (first_Number == second_Number) {
          System.out.println (+ first_Number + " is equal to " + second_Number + ".");
        }

      }
    }

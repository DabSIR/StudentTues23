package studenttues23;
import java.util.Scanner;
/**
 *
 * @author Dylan
 */
public class ReverseWord {

    public static void main(String[] args) {
//        char[] myArray = new char[7];
//        myArray[0] = 's';
//        myArray[1] = 't';
//        myArray[2] = 'u';
//        myArray[3] = 'd';
//        myArray[4] = 'e';
//        myArray[5] = 'n';
//        myArray[6] = 't';
//        
//        for (int i = 0; i < myArray.length; i++) {
//            System.out.print(myArray[i]);
//        }
//         System.out.println("");
           Scanner scan = new Scanner(System.in);
           System.out.println("Enter word: ");
           String word = scan.nextLine();
           char[] myLetter = new char[word.length()];
           
           
           for (int i = 0; i < myLetter.length; i++) {
               myLetter[i] = word.charAt(i);
               System.out.println(myLetter[i]);
           }
           
           System.out.println("REVERSE: ");
           
           for (int i = myLetter.length-1; i >= 0; i--) {
               myLetter[i] = word.charAt(i);
               System.out.println(myLetter[i]);
           }
    }
}

import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Program{    
    boolean success = false;

    static final int MAX_NUMBER_OF_ELEMENTS = 20;
    

    PrintStream out;
    
    /*
    boolean askSet (Scanner input, String question, Set set) {
        do {out.printf("%s", question);
            if (! input.hasNextLine()) {
                out.printf("\n"); // otherwise line with ^D will be overwritten
                return false;
                }
            } while (! inputContainsCorrectSet(input, set));
        return true;
    }
    */

    boolean askBothSets (Scanner input, Set set1, Set set2) {
        return askSet(input, "Give first set : ", set1) &&
               askSet(input, "Give second set : ", set2);
    }
    
    /*
    void start () {
        Scanner in = new Scanner(System.in);
        Set set1 = new Set(),
            set2 = new Set();
        while (askBothSets(in, set1, set2)) {
            calculateAndGiveOutput(set1, set2);
        }
    }
    */
   
      
}

import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Program{    
   
    void run () {
        Scanner in = new Scanner(System.in);
        
        Set set1 = new Set(),
            set2 = new Set(); 

            getSets(in, set1, set2);
        /*
        while (getSets(in, set1, set2)) {
            calculateAndGiveOutput(set1, set2);
        }    
        */
    }
    

    boolean getSets (Scanner input, Set set1, Set set2) {
        return getSet(input, "Give first set : ", set1) && 
               getSet(input, "Give second set : ", set2);
    }
    
    
    boolean getSet (Scanner input, String question, Set set) {
        
        do {
            System.out.printf(question);
            if (! input.hasNextLine()) {
                System.out.printf("\n");
                return false;
            }
        } while (! validSet(input, set));         

        return true;
    }
    
    boolean validSet(Scanner input, Set set) {
        boolean valid = true;
        //call function to check errors
        if(valid) {
        }
        
        return valid; //assume it's valid
    }

    void calculateAndGiveOutput(Set set1, Set set2) {
        System.out.println("Finished");
    }
}

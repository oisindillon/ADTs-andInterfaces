import java.util.Scanner;

public class Program{    

    void run () {
        Scanner in = new Scanner(System.in);

        String input1 = "";
        String input2 = "";

        
        while (getSets(in, input1, input2)) {
            //calculateAndGiveOutput(set1, set2);
            System.out.println("Inputs are correct.");
        }  

    }
    

    boolean getSets (Scanner input, String input1, String input2) {
        return getSet(input, "Give first set : ", input1) && 
               getSet(input, "Give second set : ", input2);
    }
    
    
    boolean getSet (Scanner in, String question, String input) {
        String setToValidate = "";

        do {
            System.out.printf(question);
            if (in.hasNextLine()) {
                setToValidate = in.nextLine();
            } else {
                System.out.println("\n");
                return false;
            }
        } while (! validSet(in, setToValidate));         
     
        
        return true;
    }
    
    boolean validSet(Scanner input, String setToValidate) {
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

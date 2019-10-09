import java.util.Scanner;

public class Program{ 
    

    void run () {        
        
        Scanner input = new Scanner(System.in); 

        Set set1 = new Set(),
            set2 = new Set();

        while (getSets(input, set1, set2)) {
            calculate(set1, set2);
        }  
        

    }
    
    boolean getSets (Scanner input, Set set1, Set set2) {
        return getSet(input, "Give first set : ", set1) && 
               getSet(input, "Give second set : ", set2);
    }
       
     
    boolean getSet (Scanner input, String question, Set set) {

        // check the input char by char 
        input.useDelimiter("");

        // Start the process of checking input to create a set
        System.out.printf(question);
        try{  

            // initialize the set
            set.init();

            // check if the set starts with '{'
            Syntax.isOpen(input);

            while (! Syntax.nextCharIsClose(input)) {
                
                // if there are more spaces between the identifiers, skip them
                while (Syntax.nextCharIsSpace(input)) {
                    Syntax.isSpace(input);
                }

                // create a new identifier
                Identifier identifier = new Identifier();
                identifier.create(input);

                // add the identifier to the set
                set.addIdentifier(identifier);
                
            }
            
            // check if set terminates with '}'
            Syntax.isClose(input);

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        input.nextLine();
        return true;
        


        /*
        do {
            System.out.printf("%s", question);
            
            if (! input.hasNextLine()) {
                System.out.printf("\n"); 
                return false;
            }
        } while (! validSet(input, set));
        */
        
    }
    
    boolean validSet(Scanner input, Set setToValidate) {
        boolean valid = true;
        //call function to check errors
        if(valid) {
            System.out.println("Input is: " + input);
        }
        
        return valid; //assume it's valid
    }

    void calculate(Set set1, Set set2) {
        System.out.println("difference = " + set1.difference(set2).printSet());
        System.out.println("intersection = " + set1.intersection(set2).printSet());
        
        try {
            System.out.println("union = " + set1.union(set2).printSet());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("sym. diff. = " + set1.symmetricDifference(set2).printSet());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("\n");
    }
}

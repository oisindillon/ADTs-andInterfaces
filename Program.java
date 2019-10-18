import java.util.Iterator;
import java.util.Scanner;

public class Program{ 
    
	public static void main(String[] args) {
		new Program().run();
	}
	
    void run () {        
        
        Scanner input = new Scanner(System.in); 

        SetInterface set1 = new Set(),
                     set2 = new Set();

        while (getSets(input, set1, set2)) {
            calculate(set1, set2);
        }  
        

    }
    
    boolean getSets (Scanner input, SetInterface set1, SetInterface set2) {
        return getSet(input, "Give first set : ", set1) && 
               getSet(input, "Give second set : ", set2);
    }
       
     
    boolean getSet (Scanner input, String question, SetInterface set) {

        // check the input char by char 
        input.useDelimiter("");

        // Start the process of checking input to create a set
        System.out.printf(question);
        
        try{  

            // initialize the set
            set.init();

            // Skip spaces that may precede beginning of the set
    		Syntax.skipSpaces(input);
    		
            // Check if the set starts with '{'
            Syntax.isOpen(input);
            
            // Retrieve the set
            getSet(input, set);
            
            // Check if set terminates with '}'
            Syntax.isClose(input);
            
            // Check if there are any character after the '}' 
            Syntax.eoln(input);   
           
            input.nextLine();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            input.nextLine();

            // if an error occurs, repeat the function until no errors found
            getSet(input, question, set);
        }

        return true;
        
    }
    
    // Set = '{' rowOfIdentifiers '}'
    SetInterface getSet (Scanner s, SetInterface set) throws Exception {
    	    	
    	// Skip whitespaces if any exist
		Syntax.skipSpaces(s);
    	
		while (!Syntax.nextCharIsClose(s)) {
        
    		IdentifierInterface identifier = getIdentifier(s);
    		
            // add the identifier to the set
    		set.addIdentifier(identifier);
            
        }
		    	
    	return set;
    }
    
    // Identifier = letter{letter|number}
    IdentifierInterface getIdentifier (Scanner s) throws Exception {
    	
		// Initialize the identifier
		Identifier identifier = new Identifier(s.next().toString().charAt(0));
		
		// Append succeeding characters if any
		while (Syntax.nextCharIsAlphanumeric(s)) {
			identifier.addChar(s.next().toString().charAt(0));
		}
		
		// Skip whitespaces if any exist
		Syntax.skipSpaces(s);
		
		return identifier;
    }
     

    void calculate(SetInterface set1, SetInterface set2) {
    	
      
        System.out.print("difference = ");
        printSet(set1.difference(set2));
        
        
        System.out.print("intersection = ");
        printSet(set1.intersection(set2));
        
    
        try {
            System.out.print("union = ");
            printSet(set1.union(set2));
        } catch (Exception e) {
        	e.getMessage();
        }

        try {
            System.out.print("sym. diff. = ");
            printSet(set1.symmetricDifference(set2));
        } catch (Exception e) {
        	e.getMessage();
        }
       

  
        System.out.print("\n");
    }
    
    
    public void printSet (SetInterface set) {
    	
    	Iterator<IdentifierInterface> iterator = set.iterator();
    	
    	System.out.print("{");

    	while (iterator.hasNext()) {
    		System.out.print((iterator.next()).getContent());
    		
    		if (iterator.hasNext()) {
    			System.out.print(" ");
    		}
    	}
    	
    	System.out.println("}");

    }
}

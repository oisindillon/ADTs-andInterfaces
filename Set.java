import java.util.Scanner;
import java.util.regex.Pattern;

public class Set implements SetInterface {

    private Identifier[] elements;

    
    Scanner input;
    char c;

    public Set(){
    }

    // Method to read 1 character. 
    char nextChar (int index){
        return input.next().charAt(index);
    }

    // Method to check if the next character to be read when
    // calling nextChar() is equal to the provided character.
    boolean nextCharIsClose(char c){
        return input.hasNext(Pattern.quote(c+"}")); 
    }

    boolean nextCharIsOpen(char c){
        return input.hasNext(Pattern.quote(c+"{")); 
    }

    // Method to check if the next character to be read when 
    // calling nextChar() is a digit.
    boolean nextCharIsDigit(){
        return input.hasNext("[0-9]");
    }

    // Method to check if the next character to be read when 
    // calling nextChar() is a letter.
    boolean nextCharIsLetter(){ 
        return input.hasNext("[a-zA-Z]");
    }

    boolean nextCharIsSpace(char c){
        return input.hasNext(Pattern.quote(c+" ")); 
    }

    String errorCheck(){
        if(!nextCharIsOpen(c)){
            return "You have to open the set with '{' ";        //error checks the first opening of the set
        }
        //init set
        int i=0;
        while(i<20){
            identErrorCheck();              //error checks up to 20 identifiers
            i++;
        }
        if(i>20){
            return "There are too many elements in your set";   //makes sure correct number of identifiers are allowed in set
        }
        if(!nextCharIsClose(c)){                            //error checks set closing
            return "You have to close the set with '}' ";
        }
        
        return "";
    }

    String identErrorCheck(){
        if(!nextCharIsLetter()){
            return "First character of each element has to be from the alphabet";       //checks first letter of identifer
            //init identifier and add character to identifier
            
        }
        else{                                           //checks the following identifier characters
            boolean end = false;
            while(end == false){
                if(!nextCharIsDigit() && !nextCharIsLetter()){
                    return "All characters in Identifiers have to be alphanumeric";
                }
                if(nextCharIsSpace(c)){                                 //ends identifier and starts new one
                    end = true;
                    return null;
                    //stop characters saving to identifier and leave identifier

                }
                else{
                    //save specified character to an identifier
                }
            }
        }
        return null;
    }


	public void init() {
		// TODO Auto-generated method stub
		
	}

	public void remove(IdentifierInterface identifier) {
		// TODO Auto-generated method stub
		
	}

	public IdentifierInterface get() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean contains(IdentifierInterface identifier) {
		// TODO Auto-generated method stub
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addIdentifier(IdentifierInterface identifier) {
		// TODO Auto-generated method stub
		
	}

	public SetInterface difference(SetInterface set) {
		// TODO Auto-generated method stub
		return null;
	}

	public SetInterface intersection(SetInterface set) {
		// TODO Auto-generated method stub
		return null;
	}

	public SetInterface union(SetInterface set) {
		// TODO Auto-generated method stub
		return null;
	}

	public SetInterface symmetricDifference(SetInterface set) {
		// TODO Auto-generated method stub
		return null;
	}

    
}
import java.util.regex.Pattern;

public class Set extends Setable{
    
    Scanner input;

    Set(){
        Scanner input = new Scanner(System.in);
    }

    Exception errorCheck(){
       try{
        nextCharIsOpen(c);
       }catch(Exception e){
           System.out.println("Missing "+"{"+" to open a set");
       }
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

    boolean nextCharIsSpace(char c){
        return input.hasNext(Pattern.quote(c+" ")); 
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

    
}
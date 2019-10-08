import java.util.regex.Pattern;
import java.util.Scanner;

public class Identifier implements IdentifierInterface {

    String content;

    public void addChar(char c) {
        String character = "";
        character = character.valueOf(c);
        Scanner scanner = new Scanner(character);

        if (content != null && Syntax.nextCharIsAlphanumeric(scanner)) {
            this.content += c;
        } 
    }

    public void init(char c) throws Exception {
        if (! Character.isLetter(c)) {
            if (c == '}') {
                throw new Exception("Syntax error: There should be no spaces after the last identifier.");
            } else {
                throw new Exception("Syntax error: An identifier must start with a letter.");
            }
        } 

        this.content = content.valueOf(c);
    }
    
    public IdentifierInterface copy() {
        Identifier copiedIdentifier = new Identifier();
        copiedIdentifier.content = this.content;
        return copiedIdentifier;
    }

    
    public boolean equals(IdentifierInterface id) {
        if (this.content.equals(id.getContent())) {
            return true;
        }
        return false;
    }


    public char atIndex(int index) {
        if (index > this.content.length() && content != null) {
            return 'd';
        }
  
        char c = this.content.charAt(index);
        return c;
    }

    public String getContent() {
        if (content == null) {
            return null;
        }
        return this.content;
    }

    public int size() {
        return this.content.length();
    }

    public boolean create (Scanner input) throws Exception {
        
        try {
            char c;

            // initialize the identifier with with the first character
            c = Syntax.getContent(input);
            init(c);
            
            // if more characters follow, append them to the identifier
            while (Syntax.nextCharIsAlphanumeric(input)) {
                c = Syntax.getContent(input);
                addChar(c);
            }      
            
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        return true;
    }
}
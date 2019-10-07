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
            throw new Exception("Syntax error: An identifier must start with a letter.");
        } 

        this.content = content.valueOf(c);
    }
    
    public IdentifierInterface copy() {
        Identifier copyIdentifier = new Identifier();
        copyIdentifier.content = this.content;
        return copyIdentifier;
    }

    
    public boolean equals(IdentifierInterface id) {
        // TODO Auto-generated method stub
        return false;
    }


    public char atIndex(int index) {
        if (index > this.content.length() && content != null) {
            return 'd';
        }
  
        char c = this.content.charAt(index);
        return c;
    }

    public String getIdentifier() {
        return this.content;
    }

    public int size() {
        return this.content.length();
    }

    public String get() {
        if (content == null) {
            return null;
        }
        return this.content;
    }

    public void set(String content) {
        this.content = content;
    }

    public boolean identifier (Scanner input) throws Exception {
        
        char c;

        try {

            c = Syntax.getContent(input);
            init(c);
            
            while (Syntax.nextCharIsAlphanumeric(input)) {
                c = Syntax.getContent(input);
                System.out.print(c + " is alphanumeric");
                addChar(c);
            }          

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

        System.out.println(get());
        return true;
        
    }
}
public class Set implements SetInterface {    
    Scanner input;
    char c;

    public Set(){
        Scanner input = new Scanner(System.in);
        input.close();
    }

    /*
    Exception errorCheck(){
       try{
        nextCharIsOpen(c);
       }catch(Exception e){
           System.out.println("Missing "+"{"+" to open a set");
       }
    }
    */

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
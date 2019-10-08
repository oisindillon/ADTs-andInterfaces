import java.util.*;

public class Set implements SetInterface {

	LinkedList<IdentifierInterface> identifiers = new LinkedList<IdentifierInterface>();

    IdentifierInterface[] elements;
    IdentifierInterface test;

    public Set(){
		//System.out.println("Set created ewf ewg");
	}
	
	public void outputSet(){
		System.out.println("The set is:");
		Iterator iterator = identifiers.iterator();
		

        while(iterator.hasNext()){
			System.out.println(iterator.next());
            //String value = (it.next()).elements;
            //System.out.println(value);
        }
    }

    // INTEFACE METHODS
    public void init() {
		this.identifiers.clear();		
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
		return identifiers.size();
	}

	public void addIdentifier(IdentifierInterface identifier) { 
    	this.identifiers.add(identifier);
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
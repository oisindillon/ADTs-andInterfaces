import java.util.*;

public class Set implements SetInterface {

	private LinkedList<IdentifierInterface> elements = new LinkedList<IdentifierInterface>();


    public Set(){
	}


    // INTEFACE METHODS
    public void init() {
		this.elements.clear();		
	}

	public LinkedList<IdentifierInterface> getSet() {
		return this.elements;
	}

	public void remove(IdentifierInterface identifier) {
		elements.remove(identifier);		
	}

	public IdentifierInterface get() {
		// Do we need to implement this? 
		
		return null;
	}

	public boolean contains(IdentifierInterface compareIdentifier) {
		for (IdentifierInterface identifier : elements) {
			if (identifier.getContent().equals(compareIdentifier.getContent())) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return elements.size();
	}

	public void addIdentifier(IdentifierInterface identifier) { 
		if (!this.contains(identifier)) {
			this.elements.add(identifier);
		}
    }


	// SET OPERATIONS 

	public Set difference(Set set) {
		Set resultSet = new Set();

		for (IdentifierInterface identifier : this.elements) {
			if (! set.contains(identifier)) {
				resultSet.addIdentifier(identifier);
			}
		}

		return resultSet;
	}

	public Set intersection(Set set) {
		Set resultSet = new Set();

		for (IdentifierInterface identifier : this.elements) {
			if (set.contains(identifier)) {
				resultSet.addIdentifier(identifier);
			}
		}

		return resultSet;
	}

	public Set union(Set set) throws Exception {

		Set resultSet = new Set();

		// add all elements of the first set
		for (IdentifierInterface identifier : this.elements) {
			resultSet.addIdentifier(identifier);
		}
		
		// add all elements of the second set (add operations doesn't change the set if the identifier exists in pre- set)
		for (IdentifierInterface identifier : set.elements) {
			resultSet.addIdentifier(identifier);
		}

		if (resultSet.size() > MAX_SET_LENGTH) {
			throw new Exception("Union of the sets exceeds " + MAX_SET_LENGTH + " elements.");
		}
	
		return resultSet;
	}

	public Set symmetricDifference(Set set) throws Exception {

		Set resultSet = new Set(); 
		
		// Get A / B
		Set difference1 = this.difference(set);

		// Get B / A
		Set difference2 = set.difference(this);

		// Add the resulting sets
		try {
			resultSet = difference1.union(difference2);
		} catch (Exception e) {
			throw new Exception("Symmetric difference of the sets exceeds " + MAX_SET_LENGTH + " elements.");
		}


		return resultSet;
    }


	// ADDITIONAL METHODS
	
	public String printSet(){
		
		String set = "";
		int i = 0;

		set += '{';

		while (i < this.size()) {
			set += elements.get(i).getContent();

			if (i != this.size() - 1) {
				set += (' ');
			}

			i++;
		}

		set += '}';

		return set;

    }
	
}
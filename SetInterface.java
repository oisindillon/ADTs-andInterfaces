public interface SetInterface{

    public static final int MAX_SET_LENGTH = 20; //How to deal with union when it turns out to be too big?

/* 
 * 
 * Elements: Objects of type Identfier
 * Structure: non-linear 
 * Domain: Rows of objects of type Identifier not exceeding 20 elements
 * 
 * constructors
 * 
 * Set();
 *   PRE  -
 *   POST - A new Set-object has been created and contains an empty set
 * 
 * Set (Set src);
 *   PRE  -
 *   POST - A new Set-object has been created and contains a copy of src
 * 
 */

void init();
/*  PRE  - 
 *  POST - The set is empty.
 */

void remove (IdentifierInterface identifier);
/*  PRE    - The identifier must exist in the set
    POST   - The identifier is removed from the set
*/ 

boolean contains (IdentifierInterface identifier);
/*  PRE    - The set must be not empty
    POST   - true:  The set does contain the identifier
             false: The set does not contain the identifier
*/ 

int size();
/*  PRE    - 
    POST   - The amount of elements of the set is returned
*/ 

void addIdentifier (IdentifierInterface identifier);
/*  PRE    - The set must contain less than 20 elements and the set doesn't contain the identifier
    POST   - The identifier is added to the set
*/ 

SetInterface difference (SetInterface set); 
/*  PRE  -  
    POST - a new set that is the difference of both sets is returned
*/ 

SetInterface intersection (SetInterface set); 
/*  PRE  -  
    POST - a new set that is the intersection of both sets is returned
*/ 

SetInterface union (SetInterface set); 
/*  PRE  - the union of both sets can't exceed 20 elements (Need to perform the function to check the pre-condition, wrong?)
    POST - a new set that is the union of both sets is returned
*/ 

SetInterface symmetricDifference (SetInterface set); 
/*  PRE  -  the symmetric difference of both sets can't exceed 20 elements (Need to perform the function to check the pre-condition, wrong?)
    POST -  a new set that is the symmetric difference of both sets is returned
*/

}
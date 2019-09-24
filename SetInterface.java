public interface SetInterface{
    public static final int MAX_SET_LENGTH = 10;
    public static final String END = "}";
    public static final String START = "{";
/*
 *
 * Only identifiers, following the restrictions used in this assignments, are allowed as elements of a set.
 * 
 */

/*
 *
 * The four operations on sets are defined as follows:
 * 1. dierence: all elements contained in the 1st but not the 2nd set.
 * 2. intersection: all elements contained in both sets.
 * 3. union: all elements of both sets. (N.B. sets do not contain duplicate elements per definition.)
 * 4. symmetric dierence: all elements of both sets that are not contained in the intersection.
 * 
 */

 // Write the conditions here:

/* 
 * 
 * Elements: Identifiers
 * Structure: non-linear 
 * Domain: ???
 */

void init();
/*  PRE  - 
*   POST - Set is empty.
*/
void addIdentifier (IdentifierInterface identifier1, SetInterface set1);
/*   PRE    - Set needs to be less than 10 elements in it.
 *   POST   - Identifier added to set
 * 
 * 
 */ 
SetInterface difference (SetInterface set1, SetInterface set2); 
 /*  PRE  -  
 *   POST - all elements contained in the 1st but not the 2nd set.
 *
 */ 
SetInterface intersection (SetInterface set1, SetInterface set2); 
 /*  PRE  -  
 *   POST - all elements contained in both sets.
 */ 
SetInterface union (SetInterface set1, SetInterface set2); 
 /*  PRE  -  
 *   POST - all elements of both sets. (N.B. sets do not contain duplicate elements per definition.)
 */ 
SetInterface symmetricDifference (SetInterface set1, SetInterface set2); 
 /*  PRE  -  
 *   POST -  all elements of both sets that are not contained in the intersection.
 * 
 */


}
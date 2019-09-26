public interface IdentifierInterface{

/*
 *
 * • Only alphanumeric characters are allowed as elements of an identifier.
 * • An identifier begins with a letter.
 * • Identifiers have a length of at least 1 character
 * 
 */

// Write the conditions here:

/* 
 * 
 * Elements: characters
 * Structure: linear
 * Domain: rows of characters
 * 
 * Identifier();
 *    PRE - 
 *    POST - A new Identifier-object has been created and contains an empty set
 * 
 * Identifier (Identifier src);
 *   PRE- 
 *   POST- A new Identifier-object has been created and contains a copy of src
 * 
 */

 IdentifierInterface createIdentifier(String stringIdentifier);
 /*
 *  PRE - 
 *  POST - Identifer is created with correct syntax
 */

IdentifierInterface addChar(Char charInput);
 /*
 *  PRE - if charInput is valid
 *  POST - A new identifier replaces the old identifier but with another char appended to it
 */

IdentifierInterface copy();
 /*
 *  PRE - 
 *  POST - A new identifier with the same elements
 */
boolean equals(IdentifierInterface id);
 /*
 *  PRE - 
 *  POST - Returns true if this is equal to identifier chosen
 */
void init();
 /*
 *  PRE - 
 *  POST - The identifier is empty
 */
char atIndex(int index);
/*
 *  PRE - identifier is not empty and index exists
 *  POST - gives char from desired index given
 */
int size();
/*
 *  PRE-
 *  POST - number of elements in identifier is given
 */
}
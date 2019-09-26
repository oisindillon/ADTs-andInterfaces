public interface IdentifierInterface{

/* 
 * 
 * Elements: alphanumeric characters
 * Structure: linear
 * Domain: array of alphanumeric characters with a length greater than 0
 * 
 * Make default constructor private (has no default constructor)
 * 
 * Identifier (Identifier src);
 *   PRE- 
 *   POST- A new Identifier-object has been created and contains a copy of src
 * 
 */

IdentifierInterface addChar(char charInput);
 /*
 *  PRE -  char is alphanumeric
 *         first character is a letter
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
 *  PRE - identifier is not empty and index is not greater than this.size()
 *  POST - gives char from desired index given
 */
String getIdentifier();
/*
 *  PRE - 
 *  POST - returns the whole identifier as a string
 */
int size();
/*
 *  PRE-
 *  POST - number of elements in identifier is given
 */
}
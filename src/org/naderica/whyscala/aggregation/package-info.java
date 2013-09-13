/**
 * The package illustrates how aggregation of different entities can be done in Java and Scala.
 * 
 * <p>Note that all the classes are made as immutable.  Immutability is a well-know pattern to build 
 * scalable and robust applications as immutable objects have built-in thread-safety as 
 * dictated by Java Memory Model.
 * 
 * <p>Note that Java examples all override <code>hashCode</code> and <code>equals</code> methods.  
 * This is to ensure that different objects with represent the same entity are treated as equal.  Not doing so results in well-known widespread bugs. 
 * Furthermore, they override <code>toString</code> method.
 * When attributes are added or removed, the Java developer has to manually update the code.  On the other hand, Scala case classes automatically provide these methods.
 * Adding or removing attributes is therefore very simple in Scala.
 * 
 *   
 */
package org.naderica.whyscala.aggregation;


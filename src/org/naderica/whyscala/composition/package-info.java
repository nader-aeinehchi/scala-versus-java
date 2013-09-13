/**
 * The package illustrates how composition of different entities can be done in Java and Scala.
 * 
 * <p>The is centered around a doctor who treats a patient.  To cure a patient, the doctor asks the hospital to treat the patient.
 * There are old and new doctor/hospital classes to illustrate different scenarios.  The doctor can also get paid.
 * 
 * <p>Here, doctor composes patient, hospital and payment classes.
 * 
 * <p>Scala version uses traits which are interfaces with implementation.  Java 8 is going to provide a similar functionality.  Traits are abstract entities
 * and cannot assign values to the attributes before they are mixed by a concrete class.
 * 
 * <p>Note that all the classes are made as immutable.  Immutability is a well-know pattern to build 
 * scalable and robust applications as immutable objects have built-in thread-safety as 
 * dictated by Java Memory Model.
 * 
 * <p>Note that Java examples all override <code>hashCode</code> and <code>equals</code> methods.  
 * This is to ensure that different objects with represent the same entity are treated as equal.  Not doing so results in well-known widespread bugs. 
 * Furthermore, they override <code>toString</code> method.
 * When attributes are added or removed, the developer has to manually update the code.  On the other hand, Scala case classes automatically provide these methods.
 * Adding or removing attributes is therefore very simple in Scala.
 * 
 *   
 */
package org.naderica.whyscala.composition;


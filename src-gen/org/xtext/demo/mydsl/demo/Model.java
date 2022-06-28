/**
 * generated by Xtext 2.26.0
 */
package org.xtext.demo.mydsl.demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.demo.mydsl.demo.Model#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.demo.mydsl.demo.DemoPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.demo.mydsl.demo.Image}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.demo.mydsl.demo.DemoPackage#getModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Image> getElements();

} // Model

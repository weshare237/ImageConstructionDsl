/**
 * generated by Xtext 2.26.0
 */
package org.xtext.demo.mydsl.demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal parameter list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.demo.mydsl.demo.formal_parameter_list#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.xtext.demo.mydsl.demo.DemoPackage#getformal_parameter_list()
 * @model
 * @generated
 */
public interface formal_parameter_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' attribute list.
   * @see org.xtext.demo.mydsl.demo.DemoPackage#getformal_parameter_list_Parameter()
   * @model unique="false"
   * @generated
   */
  EList<String> getParameter();

} // formal_parameter_list

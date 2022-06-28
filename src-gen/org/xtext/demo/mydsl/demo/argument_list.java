/**
 * generated by Xtext 2.26.0
 */
package org.xtext.demo.mydsl.demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>argument list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.demo.mydsl.demo.argument_list#getArgument <em>Argument</em>}</li>
 * </ul>
 *
 * @see org.xtext.demo.mydsl.demo.DemoPackage#getargument_list()
 * @model
 * @generated
 */
public interface argument_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Argument</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' attribute list.
   * @see org.xtext.demo.mydsl.demo.DemoPackage#getargument_list_Argument()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getArgument();

} // argument_list
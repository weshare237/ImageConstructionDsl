/**
 * generated by Xtext 2.26.0
 */
package org.xtext.demo.mydsl.demo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.demo.mydsl.demo.Turn#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see org.xtext.demo.mydsl.demo.DemoPackage#getTurn()
 * @model
 * @generated
 */
public interface Turn extends Inst
{
  /**
   * Returns the value of the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre</em>' attribute.
   * @see #setNombre(int)
   * @see org.xtext.demo.mydsl.demo.DemoPackage#getTurn_Nombre()
   * @model
   * @generated
   */
  int getNombre();

  /**
   * Sets the value of the '{@link org.xtext.demo.mydsl.demo.Turn#getNombre <em>Nombre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre</em>' attribute.
   * @see #getNombre()
   * @generated
   */
  void setNombre(int value);

} // Turn

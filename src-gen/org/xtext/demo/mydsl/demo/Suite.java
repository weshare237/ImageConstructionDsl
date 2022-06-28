/**
 * generated by Xtext 2.26.0
 */
package org.xtext.demo.mydsl.demo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Suite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.demo.mydsl.demo.Suite#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.xtext.demo.mydsl.demo.Suite#getSuite_inst <em>Suite inst</em>}</li>
 * </ul>
 *
 * @see org.xtext.demo.mydsl.demo.DemoPackage#getSuite()
 * @model
 * @generated
 */
public interface Suite extends EObject
{
  /**
   * Returns the value of the '<em><b>Instruction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instruction</em>' containment reference.
   * @see #setInstruction(Inst)
   * @see org.xtext.demo.mydsl.demo.DemoPackage#getSuite_Instruction()
   * @model containment="true"
   * @generated
   */
  Inst getInstruction();

  /**
   * Sets the value of the '{@link org.xtext.demo.mydsl.demo.Suite#getInstruction <em>Instruction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instruction</em>' containment reference.
   * @see #getInstruction()
   * @generated
   */
  void setInstruction(Inst value);

  /**
   * Returns the value of the '<em><b>Suite inst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suite inst</em>' containment reference.
   * @see #setSuite_inst(Suite)
   * @see org.xtext.demo.mydsl.demo.DemoPackage#getSuite_Suite_inst()
   * @model containment="true"
   * @generated
   */
  Suite getSuite_inst();

  /**
   * Sets the value of the '{@link org.xtext.demo.mydsl.demo.Suite#getSuite_inst <em>Suite inst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suite inst</em>' containment reference.
   * @see #getSuite_inst()
   * @generated
   */
  void setSuite_inst(Suite value);

} // Suite
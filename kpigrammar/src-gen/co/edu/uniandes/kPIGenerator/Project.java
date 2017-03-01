/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.kPIGenerator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co.edu.uniandes.kPIGenerator.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link co.edu.uniandes.kPIGenerator.Project#getPhases <em>Phases</em>}</li>
 * </ul>
 *
 * @see co.edu.uniandes.kPIGenerator.KPIGeneratorPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject
{
  /**
   * Returns the value of the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project Name</em>' attribute.
   * @see #setProjectName(String)
   * @see co.edu.uniandes.kPIGenerator.KPIGeneratorPackage#getProject_ProjectName()
   * @model
   * @generated
   */
  String getProjectName();

  /**
   * Sets the value of the '{@link co.edu.uniandes.kPIGenerator.Project#getProjectName <em>Project Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project Name</em>' attribute.
   * @see #getProjectName()
   * @generated
   */
  void setProjectName(String value);

  /**
   * Returns the value of the '<em><b>Phases</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.kPIGenerator.Phase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Phases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Phases</em>' containment reference list.
   * @see co.edu.uniandes.kPIGenerator.KPIGeneratorPackage#getProject_Phases()
   * @model containment="true"
   * @generated
   */
  EList<Phase> getPhases();

} // Project

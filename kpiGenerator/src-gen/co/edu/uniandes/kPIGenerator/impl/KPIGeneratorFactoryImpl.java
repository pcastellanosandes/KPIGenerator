/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.kPIGenerator.impl;

import co.edu.uniandes.kPIGenerator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KPIGeneratorFactoryImpl extends EFactoryImpl implements KPIGeneratorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KPIGeneratorFactory init()
  {
    try
    {
      KPIGeneratorFactory theKPIGeneratorFactory = (KPIGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(KPIGeneratorPackage.eNS_URI);
      if (theKPIGeneratorFactory != null)
      {
        return theKPIGeneratorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KPIGeneratorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIGeneratorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KPIGeneratorPackage.TASK: return createTask();
      case KPIGeneratorPackage.STATUS: return createStatus();
      case KPIGeneratorPackage.BOOL: return createBOOL();
      case KPIGeneratorPackage.TASK_NAME: return createTaskName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Status createStatus()
  {
    StatusImpl status = new StatusImpl();
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOL createBOOL()
  {
    BOOLImpl bool = new BOOLImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskName createTaskName()
  {
    TaskNameImpl taskName = new TaskNameImpl();
    return taskName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIGeneratorPackage getKPIGeneratorPackage()
  {
    return (KPIGeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KPIGeneratorPackage getPackage()
  {
    return KPIGeneratorPackage.eINSTANCE;
  }

} //KPIGeneratorFactoryImpl

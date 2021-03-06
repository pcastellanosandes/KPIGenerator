/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.kPIGenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.kPIGenerator.KPIGeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface KPIGeneratorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kPIGenerator";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.edu.co/uniandes/KPIGenerator";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kPIGenerator";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KPIGeneratorPackage eINSTANCE = co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl.init();

  /**
   * The meta object id for the '{@link co.edu.uniandes.kPIGenerator.impl.RootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.kPIGenerator.impl.RootImpl
   * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getRoot()
   * @generated
   */
  int ROOT = 0;

  /**
   * The feature id for the '<em><b>Projects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT__PROJECTS = 0;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROOT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link co.edu.uniandes.kPIGenerator.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.kPIGenerator.impl.ProjectImpl
   * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

  /**
   * The feature id for the '<em><b>Project Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PROJECT_NAME = 0;

  /**
   * The feature id for the '<em><b>Phases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__PHASES = 1;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.kPIGenerator.impl.PhaseImpl <em>Phase</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.kPIGenerator.impl.PhaseImpl
   * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getPhase()
   * @generated
   */
  int PHASE = 2;

  /**
   * The feature id for the '<em><b>Phase Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE__PHASE_NAME = 0;

  /**
   * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE__TASKS = 1;

  /**
   * The number of structural features of the '<em>Phase</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link co.edu.uniandes.kPIGenerator.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see co.edu.uniandes.kPIGenerator.impl.TaskImpl
   * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getTask()
   * @generated
   */
  int TASK = 3;

  /**
   * The feature id for the '<em><b>Task Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_ID = 0;

  /**
   * The feature id for the '<em><b>Task Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TASK_NAME = 1;

  /**
   * The feature id for the '<em><b>Use Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__USE_CASE = 2;

  /**
   * The feature id for the '<em><b>Sequence Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__SEQUENCE_NUMBER = 3;

  /**
   * The feature id for the '<em><b>Start Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__START_DATE = 4;

  /**
   * The feature id for the '<em><b>Due Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__DUE_DATE = 5;

  /**
   * The feature id for the '<em><b>Is Private</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__IS_PRIVATE = 6;

  /**
   * The feature id for the '<em><b>Progress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__PROGRESS = 7;

  /**
   * The feature id for the '<em><b>Status Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__STATUS_NAME = 8;

  /**
   * The feature id for the '<em><b>Status Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__STATUS_TEXT = 9;

  /**
   * The feature id for the '<em><b>Assigned To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ASSIGNED_TO = 10;

  /**
   * The feature id for the '<em><b>Created Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__CREATED_DATE = 11;

  /**
   * The feature id for the '<em><b>Completed Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__COMPLETED_DATE = 12;

  /**
   * The feature id for the '<em><b>Time Logged Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TIME_LOGGED_MIN = 13;

  /**
   * The feature id for the '<em><b>Billable Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__BILLABLE_TIME = 14;

  /**
   * The feature id for the '<em><b>Completed On Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__COMPLETED_ON_TIME = 15;

  /**
   * The feature id for the '<em><b>Time Estimated</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__TIME_ESTIMATED = 16;

  /**
   * The feature id for the '<em><b>Is Reprocessed Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__IS_REPROCESSED_TASK = 17;

  /**
   * The feature id for the '<em><b>Id Parent Task</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__ID_PARENT_TASK = 18;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = 19;


  /**
   * Returns the meta object for class '{@link co.edu.uniandes.kPIGenerator.Root <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see co.edu.uniandes.kPIGenerator.Root
   * @generated
   */
  EClass getRoot();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.kPIGenerator.Root#getProjects <em>Projects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Projects</em>'.
   * @see co.edu.uniandes.kPIGenerator.Root#getProjects()
   * @see #getRoot()
   * @generated
   */
  EReference getRoot_Projects();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.kPIGenerator.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see co.edu.uniandes.kPIGenerator.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Project#getProjectName <em>Project Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name</em>'.
   * @see co.edu.uniandes.kPIGenerator.Project#getProjectName()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_ProjectName();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.kPIGenerator.Project#getPhases <em>Phases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phases</em>'.
   * @see co.edu.uniandes.kPIGenerator.Project#getPhases()
   * @see #getProject()
   * @generated
   */
  EReference getProject_Phases();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.kPIGenerator.Phase <em>Phase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phase</em>'.
   * @see co.edu.uniandes.kPIGenerator.Phase
   * @generated
   */
  EClass getPhase();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Phase#getPhaseName <em>Phase Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Phase Name</em>'.
   * @see co.edu.uniandes.kPIGenerator.Phase#getPhaseName()
   * @see #getPhase()
   * @generated
   */
  EAttribute getPhase_PhaseName();

  /**
   * Returns the meta object for the containment reference list '{@link co.edu.uniandes.kPIGenerator.Phase#getTasks <em>Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tasks</em>'.
   * @see co.edu.uniandes.kPIGenerator.Phase#getTasks()
   * @see #getPhase()
   * @generated
   */
  EReference getPhase_Tasks();

  /**
   * Returns the meta object for class '{@link co.edu.uniandes.kPIGenerator.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getTaskId <em>Task Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Id</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getTaskId()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_TaskId();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getTaskName <em>Task Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Name</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getTaskName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_TaskName();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getUseCase <em>Use Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Use Case</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getUseCase()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_UseCase();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getSequenceNumber <em>Sequence Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequence Number</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getSequenceNumber()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_SequenceNumber();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getStartDate <em>Start Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Date</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getStartDate()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_StartDate();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getDueDate <em>Due Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Due Date</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getDueDate()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_DueDate();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getIsPrivate <em>Is Private</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Private</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getIsPrivate()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_IsPrivate();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getProgress <em>Progress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Progress</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getProgress()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_Progress();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getStatusName <em>Status Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status Name</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getStatusName()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_StatusName();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getStatusText <em>Status Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status Text</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getStatusText()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_StatusText();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getAssignedTo <em>Assigned To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assigned To</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getAssignedTo()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_AssignedTo();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getCreatedDate <em>Created Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Created Date</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getCreatedDate()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_CreatedDate();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getCompletedDate <em>Completed Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Completed Date</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getCompletedDate()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_CompletedDate();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getTimeLoggedMin <em>Time Logged Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Logged Min</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getTimeLoggedMin()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_TimeLoggedMin();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getBillableTime <em>Billable Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Billable Time</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getBillableTime()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_BillableTime();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getCompletedOnTime <em>Completed On Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Completed On Time</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getCompletedOnTime()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_CompletedOnTime();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getTimeEstimated <em>Time Estimated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Estimated</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getTimeEstimated()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_TimeEstimated();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getIsReprocessedTask <em>Is Reprocessed Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Reprocessed Task</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getIsReprocessedTask()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_IsReprocessedTask();

  /**
   * Returns the meta object for the attribute '{@link co.edu.uniandes.kPIGenerator.Task#getIdParentTask <em>Id Parent Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id Parent Task</em>'.
   * @see co.edu.uniandes.kPIGenerator.Task#getIdParentTask()
   * @see #getTask()
   * @generated
   */
  EAttribute getTask_IdParentTask();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KPIGeneratorFactory getKPIGeneratorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link co.edu.uniandes.kPIGenerator.impl.RootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.kPIGenerator.impl.RootImpl
     * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getRoot()
     * @generated
     */
    EClass ROOT = eINSTANCE.getRoot();

    /**
     * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ROOT__PROJECTS = eINSTANCE.getRoot_Projects();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.kPIGenerator.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.kPIGenerator.impl.ProjectImpl
     * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

    /**
     * The meta object literal for the '<em><b>Phases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECT__PHASES = eINSTANCE.getProject_Phases();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.kPIGenerator.impl.PhaseImpl <em>Phase</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.kPIGenerator.impl.PhaseImpl
     * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getPhase()
     * @generated
     */
    EClass PHASE = eINSTANCE.getPhase();

    /**
     * The meta object literal for the '<em><b>Phase Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHASE__PHASE_NAME = eINSTANCE.getPhase_PhaseName();

    /**
     * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHASE__TASKS = eINSTANCE.getPhase_Tasks();

    /**
     * The meta object literal for the '{@link co.edu.uniandes.kPIGenerator.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see co.edu.uniandes.kPIGenerator.impl.TaskImpl
     * @see co.edu.uniandes.kPIGenerator.impl.KPIGeneratorPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Task Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__TASK_ID = eINSTANCE.getTask_TaskId();

    /**
     * The meta object literal for the '<em><b>Task Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__TASK_NAME = eINSTANCE.getTask_TaskName();

    /**
     * The meta object literal for the '<em><b>Use Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__USE_CASE = eINSTANCE.getTask_UseCase();

    /**
     * The meta object literal for the '<em><b>Sequence Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__SEQUENCE_NUMBER = eINSTANCE.getTask_SequenceNumber();

    /**
     * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__START_DATE = eINSTANCE.getTask_StartDate();

    /**
     * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__DUE_DATE = eINSTANCE.getTask_DueDate();

    /**
     * The meta object literal for the '<em><b>Is Private</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__IS_PRIVATE = eINSTANCE.getTask_IsPrivate();

    /**
     * The meta object literal for the '<em><b>Progress</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__PROGRESS = eINSTANCE.getTask_Progress();

    /**
     * The meta object literal for the '<em><b>Status Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__STATUS_NAME = eINSTANCE.getTask_StatusName();

    /**
     * The meta object literal for the '<em><b>Status Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__STATUS_TEXT = eINSTANCE.getTask_StatusText();

    /**
     * The meta object literal for the '<em><b>Assigned To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__ASSIGNED_TO = eINSTANCE.getTask_AssignedTo();

    /**
     * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__CREATED_DATE = eINSTANCE.getTask_CreatedDate();

    /**
     * The meta object literal for the '<em><b>Completed Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__COMPLETED_DATE = eINSTANCE.getTask_CompletedDate();

    /**
     * The meta object literal for the '<em><b>Time Logged Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__TIME_LOGGED_MIN = eINSTANCE.getTask_TimeLoggedMin();

    /**
     * The meta object literal for the '<em><b>Billable Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__BILLABLE_TIME = eINSTANCE.getTask_BillableTime();

    /**
     * The meta object literal for the '<em><b>Completed On Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__COMPLETED_ON_TIME = eINSTANCE.getTask_CompletedOnTime();

    /**
     * The meta object literal for the '<em><b>Time Estimated</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__TIME_ESTIMATED = eINSTANCE.getTask_TimeEstimated();

    /**
     * The meta object literal for the '<em><b>Is Reprocessed Task</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__IS_REPROCESSED_TASK = eINSTANCE.getTask_IsReprocessedTask();

    /**
     * The meta object literal for the '<em><b>Id Parent Task</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TASK__ID_PARENT_TASK = eINSTANCE.getTask_IdParentTask();

  }

} //KPIGeneratorPackage

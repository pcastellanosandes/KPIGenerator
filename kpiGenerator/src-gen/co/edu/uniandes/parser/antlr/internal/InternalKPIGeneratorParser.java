package co.edu.uniandes.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import co.edu.uniandes.services.KPIGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalKPIGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_SEMICOLON", "RULE_CADENA", "RULE_NEWLINE", "RULE_PIPE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'completed'", "'new'", "'FALSO'", "'VERDADERO'", "'.'"
    };
    public static final int RULE_NEWLINE=7;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=9;
    public static final int RULE_WS=13;
    public static final int RULE_CADENA=6;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_INT=4;
    public static final int RULE_PIPE=8;
    public static final int RULE_ML_COMMENT=11;
    public static final int RULE_SEMICOLON=5;

    // delegates
    // delegators


        public InternalKPIGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalKPIGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalKPIGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalKPIGenerator.g"; }



     	private KPIGeneratorGrammarAccess grammarAccess;

        public InternalKPIGeneratorParser(TokenStream input, KPIGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Task";
       	}

       	@Override
       	protected KPIGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTask"
    // InternalKPIGenerator.g:64:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalKPIGenerator.g:64:45: (iv_ruleTask= ruleTask EOF )
            // InternalKPIGenerator.g:65:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalKPIGenerator.g:71:1: ruleTask returns [EObject current=null] : ( () ( (lv_taskId_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_taskList_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_Task_7_0= ruleTaskName ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_CADENA ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_CADENA ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_CADENA ) ) this_SEMICOLON_26= RULE_SEMICOLON ( (lv_completedDate_27_0= RULE_CADENA ) ) this_SEMICOLON_28= RULE_SEMICOLON ( (lv_timeLogged_29_0= RULE_INT ) )? this_SEMICOLON_30= RULE_SEMICOLON ( (lv_billableMinutes_31_0= RULE_INT ) )? this_SEMICOLON_32= RULE_SEMICOLON ( (lv_TaskParent_33_0= RULE_INT ) ) this_SEMICOLON_34= RULE_SEMICOLON ( (lv_completedOnTime_35_0= ruleBOOL ) ) this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeEstimated_37_0= RULE_INT ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_tags_39_0= RULE_CADENA ) )? this_NEWLINE_40= RULE_NEWLINE ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_taskId_1_0=null;
        Token this_SEMICOLON_2=null;
        Token lv_taskList_3_0=null;
        Token this_SEMICOLON_4=null;
        Token lv_milestone_5_0=null;
        Token this_SEMICOLON_6=null;
        Token this_SEMICOLON_8=null;
        Token lv_TaskDescription_9_0=null;
        Token this_SEMICOLON_10=null;
        Token lv_startDate_11_0=null;
        Token this_SEMICOLON_12=null;
        Token lv_DueDate_13_0=null;
        Token this_SEMICOLON_14=null;
        Token lv_priority_15_0=null;
        Token this_SEMICOLON_16=null;
        Token this_SEMICOLON_18=null;
        Token lv_progress_19_0=null;
        Token this_SEMICOLON_20=null;
        Token this_SEMICOLON_22=null;
        Token lv_assignedTo_23_0=null;
        Token this_SEMICOLON_24=null;
        Token lv_createdDate_25_0=null;
        Token this_SEMICOLON_26=null;
        Token lv_completedDate_27_0=null;
        Token this_SEMICOLON_28=null;
        Token lv_timeLogged_29_0=null;
        Token this_SEMICOLON_30=null;
        Token lv_billableMinutes_31_0=null;
        Token this_SEMICOLON_32=null;
        Token lv_TaskParent_33_0=null;
        Token this_SEMICOLON_34=null;
        Token this_SEMICOLON_36=null;
        Token lv_timeEstimated_37_0=null;
        Token this_SEMICOLON_38=null;
        Token lv_tags_39_0=null;
        Token this_NEWLINE_40=null;
        EObject lv_Task_7_0 = null;

        EObject lv_private_17_0 = null;

        EObject lv_Task_21_0 = null;

        EObject lv_completedOnTime_35_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:77:2: ( ( () ( (lv_taskId_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_taskList_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_Task_7_0= ruleTaskName ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_CADENA ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_CADENA ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_CADENA ) ) this_SEMICOLON_26= RULE_SEMICOLON ( (lv_completedDate_27_0= RULE_CADENA ) ) this_SEMICOLON_28= RULE_SEMICOLON ( (lv_timeLogged_29_0= RULE_INT ) )? this_SEMICOLON_30= RULE_SEMICOLON ( (lv_billableMinutes_31_0= RULE_INT ) )? this_SEMICOLON_32= RULE_SEMICOLON ( (lv_TaskParent_33_0= RULE_INT ) ) this_SEMICOLON_34= RULE_SEMICOLON ( (lv_completedOnTime_35_0= ruleBOOL ) ) this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeEstimated_37_0= RULE_INT ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_tags_39_0= RULE_CADENA ) )? this_NEWLINE_40= RULE_NEWLINE ) )
            // InternalKPIGenerator.g:78:2: ( () ( (lv_taskId_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_taskList_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_Task_7_0= ruleTaskName ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_CADENA ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_CADENA ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_CADENA ) ) this_SEMICOLON_26= RULE_SEMICOLON ( (lv_completedDate_27_0= RULE_CADENA ) ) this_SEMICOLON_28= RULE_SEMICOLON ( (lv_timeLogged_29_0= RULE_INT ) )? this_SEMICOLON_30= RULE_SEMICOLON ( (lv_billableMinutes_31_0= RULE_INT ) )? this_SEMICOLON_32= RULE_SEMICOLON ( (lv_TaskParent_33_0= RULE_INT ) ) this_SEMICOLON_34= RULE_SEMICOLON ( (lv_completedOnTime_35_0= ruleBOOL ) ) this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeEstimated_37_0= RULE_INT ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_tags_39_0= RULE_CADENA ) )? this_NEWLINE_40= RULE_NEWLINE )
            {
            // InternalKPIGenerator.g:78:2: ( () ( (lv_taskId_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_taskList_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_Task_7_0= ruleTaskName ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_CADENA ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_CADENA ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_CADENA ) ) this_SEMICOLON_26= RULE_SEMICOLON ( (lv_completedDate_27_0= RULE_CADENA ) ) this_SEMICOLON_28= RULE_SEMICOLON ( (lv_timeLogged_29_0= RULE_INT ) )? this_SEMICOLON_30= RULE_SEMICOLON ( (lv_billableMinutes_31_0= RULE_INT ) )? this_SEMICOLON_32= RULE_SEMICOLON ( (lv_TaskParent_33_0= RULE_INT ) ) this_SEMICOLON_34= RULE_SEMICOLON ( (lv_completedOnTime_35_0= ruleBOOL ) ) this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeEstimated_37_0= RULE_INT ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_tags_39_0= RULE_CADENA ) )? this_NEWLINE_40= RULE_NEWLINE )
            // InternalKPIGenerator.g:79:3: () ( (lv_taskId_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_taskList_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_Task_7_0= ruleTaskName ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_CADENA ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_CADENA ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_CADENA ) ) this_SEMICOLON_26= RULE_SEMICOLON ( (lv_completedDate_27_0= RULE_CADENA ) ) this_SEMICOLON_28= RULE_SEMICOLON ( (lv_timeLogged_29_0= RULE_INT ) )? this_SEMICOLON_30= RULE_SEMICOLON ( (lv_billableMinutes_31_0= RULE_INT ) )? this_SEMICOLON_32= RULE_SEMICOLON ( (lv_TaskParent_33_0= RULE_INT ) ) this_SEMICOLON_34= RULE_SEMICOLON ( (lv_completedOnTime_35_0= ruleBOOL ) ) this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeEstimated_37_0= RULE_INT ) ) this_SEMICOLON_38= RULE_SEMICOLON ( (lv_tags_39_0= RULE_CADENA ) )? this_NEWLINE_40= RULE_NEWLINE
            {
            // InternalKPIGenerator.g:79:3: ()
            // InternalKPIGenerator.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            // InternalKPIGenerator.g:86:3: ( (lv_taskId_1_0= RULE_INT ) )
            // InternalKPIGenerator.g:87:4: (lv_taskId_1_0= RULE_INT )
            {
            // InternalKPIGenerator.g:87:4: (lv_taskId_1_0= RULE_INT )
            // InternalKPIGenerator.g:88:5: lv_taskId_1_0= RULE_INT
            {
            lv_taskId_1_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_taskId_1_0, grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskId",
            						lv_taskId_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_2());
            		
            // InternalKPIGenerator.g:108:3: ( (lv_taskList_3_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:109:4: (lv_taskList_3_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:109:4: (lv_taskList_3_0= RULE_CADENA )
            // InternalKPIGenerator.g:110:5: lv_taskList_3_0= RULE_CADENA
            {
            lv_taskList_3_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            					newLeafNode(lv_taskList_3_0, grammarAccess.getTaskAccess().getTaskListCADENATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskList",
            						lv_taskList_3_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalKPIGenerator.g:130:3: ( (lv_milestone_5_0= RULE_CADENA ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CADENA) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:131:4: (lv_milestone_5_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:131:4: (lv_milestone_5_0= RULE_CADENA )
                    // InternalKPIGenerator.g:132:5: lv_milestone_5_0= RULE_CADENA
                    {
                    lv_milestone_5_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

                    					newLeafNode(lv_milestone_5_0, grammarAccess.getTaskAccess().getMilestoneCADENATerminalRuleCall_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"milestone",
                    						lv_milestone_5_0,
                    						"co.edu.uniandes.KPIGenerator.CADENA");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_6());
            		
            // InternalKPIGenerator.g:152:3: ( (lv_Task_7_0= ruleTaskName ) )
            // InternalKPIGenerator.g:153:4: (lv_Task_7_0= ruleTaskName )
            {
            // InternalKPIGenerator.g:153:4: (lv_Task_7_0= ruleTaskName )
            // InternalKPIGenerator.g:154:5: lv_Task_7_0= ruleTaskName
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getTaskTaskNameParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_3);
            lv_Task_7_0=ruleTaskName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					add(
            						current,
            						"Task",
            						lv_Task_7_0,
            						"co.edu.uniandes.KPIGenerator.TaskName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_8, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalKPIGenerator.g:175:3: ( (lv_TaskDescription_9_0= RULE_CADENA ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CADENA) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:176:4: (lv_TaskDescription_9_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:176:4: (lv_TaskDescription_9_0= RULE_CADENA )
                    // InternalKPIGenerator.g:177:5: lv_TaskDescription_9_0= RULE_CADENA
                    {
                    lv_TaskDescription_9_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

                    					newLeafNode(lv_TaskDescription_9_0, grammarAccess.getTaskAccess().getTaskDescriptionCADENATerminalRuleCall_9_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"TaskDescription",
                    						lv_TaskDescription_9_0,
                    						"co.edu.uniandes.KPIGenerator.CADENA");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_10());
            		
            // InternalKPIGenerator.g:197:3: ( (lv_startDate_11_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:198:4: (lv_startDate_11_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:198:4: (lv_startDate_11_0= RULE_CADENA )
            // InternalKPIGenerator.g:199:5: lv_startDate_11_0= RULE_CADENA
            {
            lv_startDate_11_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            					newLeafNode(lv_startDate_11_0, grammarAccess.getTaskAccess().getStartDateCADENATerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_11_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_12, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_12());
            		
            // InternalKPIGenerator.g:219:3: ( (lv_DueDate_13_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:220:4: (lv_DueDate_13_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:220:4: (lv_DueDate_13_0= RULE_CADENA )
            // InternalKPIGenerator.g:221:5: lv_DueDate_13_0= RULE_CADENA
            {
            lv_DueDate_13_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            					newLeafNode(lv_DueDate_13_0, grammarAccess.getTaskAccess().getDueDateCADENATerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"DueDate",
            						lv_DueDate_13_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_14, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_14());
            		
            // InternalKPIGenerator.g:241:3: ( (lv_priority_15_0= RULE_CADENA ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CADENA) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:242:4: (lv_priority_15_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:242:4: (lv_priority_15_0= RULE_CADENA )
                    // InternalKPIGenerator.g:243:5: lv_priority_15_0= RULE_CADENA
                    {
                    lv_priority_15_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

                    					newLeafNode(lv_priority_15_0, grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_15_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"priority",
                    						lv_priority_15_0,
                    						"co.edu.uniandes.KPIGenerator.CADENA");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_16, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_16());
            		
            // InternalKPIGenerator.g:263:3: ( (lv_private_17_0= ruleBOOL ) )
            // InternalKPIGenerator.g:264:4: (lv_private_17_0= ruleBOOL )
            {
            // InternalKPIGenerator.g:264:4: (lv_private_17_0= ruleBOOL )
            // InternalKPIGenerator.g:265:5: lv_private_17_0= ruleBOOL
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getPrivateBOOLParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_3);
            lv_private_17_0=ruleBOOL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"private",
            						lv_private_17_0,
            						"co.edu.uniandes.KPIGenerator.BOOL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_8); 

            			newLeafNode(this_SEMICOLON_18, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_18());
            		
            // InternalKPIGenerator.g:286:3: ( (lv_progress_19_0= RULE_INT ) )
            // InternalKPIGenerator.g:287:4: (lv_progress_19_0= RULE_INT )
            {
            // InternalKPIGenerator.g:287:4: (lv_progress_19_0= RULE_INT )
            // InternalKPIGenerator.g:288:5: lv_progress_19_0= RULE_INT
            {
            lv_progress_19_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_progress_19_0, grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_19_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"progress",
            						lv_progress_19_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_9); 

            			newLeafNode(this_SEMICOLON_20, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_20());
            		
            // InternalKPIGenerator.g:308:3: ( (lv_Task_21_0= ruleStatus ) )
            // InternalKPIGenerator.g:309:4: (lv_Task_21_0= ruleStatus )
            {
            // InternalKPIGenerator.g:309:4: (lv_Task_21_0= ruleStatus )
            // InternalKPIGenerator.g:310:5: lv_Task_21_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getTaskStatusParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_3);
            lv_Task_21_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					add(
            						current,
            						"Task",
            						lv_Task_21_0,
            						"co.edu.uniandes.KPIGenerator.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_22=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_22, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_22());
            		
            // InternalKPIGenerator.g:331:3: ( (lv_assignedTo_23_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:332:4: (lv_assignedTo_23_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:332:4: (lv_assignedTo_23_0= RULE_CADENA )
            // InternalKPIGenerator.g:333:5: lv_assignedTo_23_0= RULE_CADENA
            {
            lv_assignedTo_23_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            					newLeafNode(lv_assignedTo_23_0, grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_23_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assignedTo",
            						lv_assignedTo_23_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_24, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_24());
            		
            // InternalKPIGenerator.g:353:3: ( (lv_createdDate_25_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:354:4: (lv_createdDate_25_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:354:4: (lv_createdDate_25_0= RULE_CADENA )
            // InternalKPIGenerator.g:355:5: lv_createdDate_25_0= RULE_CADENA
            {
            lv_createdDate_25_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            					newLeafNode(lv_createdDate_25_0, grammarAccess.getTaskAccess().getCreatedDateCADENATerminalRuleCall_25_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdDate",
            						lv_createdDate_25_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            this_SEMICOLON_26=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_26, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_26());
            		
            // InternalKPIGenerator.g:375:3: ( (lv_completedDate_27_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:376:4: (lv_completedDate_27_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:376:4: (lv_completedDate_27_0= RULE_CADENA )
            // InternalKPIGenerator.g:377:5: lv_completedDate_27_0= RULE_CADENA
            {
            lv_completedDate_27_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            					newLeafNode(lv_completedDate_27_0, grammarAccess.getTaskAccess().getCompletedDateCADENATerminalRuleCall_27_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedDate",
            						lv_completedDate_27_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_10); 

            			newLeafNode(this_SEMICOLON_28, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_28());
            		
            // InternalKPIGenerator.g:397:3: ( (lv_timeLogged_29_0= RULE_INT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:398:4: (lv_timeLogged_29_0= RULE_INT )
                    {
                    // InternalKPIGenerator.g:398:4: (lv_timeLogged_29_0= RULE_INT )
                    // InternalKPIGenerator.g:399:5: lv_timeLogged_29_0= RULE_INT
                    {
                    lv_timeLogged_29_0=(Token)match(input,RULE_INT,FOLLOW_3); 

                    					newLeafNode(lv_timeLogged_29_0, grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_29_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"timeLogged",
                    						lv_timeLogged_29_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_10); 

            			newLeafNode(this_SEMICOLON_30, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_30());
            		
            // InternalKPIGenerator.g:419:3: ( (lv_billableMinutes_31_0= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:420:4: (lv_billableMinutes_31_0= RULE_INT )
                    {
                    // InternalKPIGenerator.g:420:4: (lv_billableMinutes_31_0= RULE_INT )
                    // InternalKPIGenerator.g:421:5: lv_billableMinutes_31_0= RULE_INT
                    {
                    lv_billableMinutes_31_0=(Token)match(input,RULE_INT,FOLLOW_3); 

                    					newLeafNode(lv_billableMinutes_31_0, grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_31_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"billableMinutes",
                    						lv_billableMinutes_31_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_32=(Token)match(input,RULE_SEMICOLON,FOLLOW_8); 

            			newLeafNode(this_SEMICOLON_32, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_32());
            		
            // InternalKPIGenerator.g:441:3: ( (lv_TaskParent_33_0= RULE_INT ) )
            // InternalKPIGenerator.g:442:4: (lv_TaskParent_33_0= RULE_INT )
            {
            // InternalKPIGenerator.g:442:4: (lv_TaskParent_33_0= RULE_INT )
            // InternalKPIGenerator.g:443:5: lv_TaskParent_33_0= RULE_INT
            {
            lv_TaskParent_33_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_TaskParent_33_0, grammarAccess.getTaskAccess().getTaskParentINTTerminalRuleCall_33_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"TaskParent",
            						lv_TaskParent_33_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_34=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_34, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_34());
            		
            // InternalKPIGenerator.g:463:3: ( (lv_completedOnTime_35_0= ruleBOOL ) )
            // InternalKPIGenerator.g:464:4: (lv_completedOnTime_35_0= ruleBOOL )
            {
            // InternalKPIGenerator.g:464:4: (lv_completedOnTime_35_0= ruleBOOL )
            // InternalKPIGenerator.g:465:5: lv_completedOnTime_35_0= ruleBOOL
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_35_0());
            				
            pushFollow(FOLLOW_3);
            lv_completedOnTime_35_0=ruleBOOL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"completedOnTime",
            						lv_completedOnTime_35_0,
            						"co.edu.uniandes.KPIGenerator.BOOL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_36=(Token)match(input,RULE_SEMICOLON,FOLLOW_8); 

            			newLeafNode(this_SEMICOLON_36, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_36());
            		
            // InternalKPIGenerator.g:486:3: ( (lv_timeEstimated_37_0= RULE_INT ) )
            // InternalKPIGenerator.g:487:4: (lv_timeEstimated_37_0= RULE_INT )
            {
            // InternalKPIGenerator.g:487:4: (lv_timeEstimated_37_0= RULE_INT )
            // InternalKPIGenerator.g:488:5: lv_timeEstimated_37_0= RULE_INT
            {
            lv_timeEstimated_37_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_timeEstimated_37_0, grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_37_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeEstimated",
            						lv_timeEstimated_37_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_38=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            			newLeafNode(this_SEMICOLON_38, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_38());
            		
            // InternalKPIGenerator.g:508:3: ( (lv_tags_39_0= RULE_CADENA ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CADENA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:509:4: (lv_tags_39_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:509:4: (lv_tags_39_0= RULE_CADENA )
                    // InternalKPIGenerator.g:510:5: lv_tags_39_0= RULE_CADENA
                    {
                    lv_tags_39_0=(Token)match(input,RULE_CADENA,FOLLOW_12); 

                    					newLeafNode(lv_tags_39_0, grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_39_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tags",
                    						lv_tags_39_0,
                    						"co.edu.uniandes.KPIGenerator.CADENA");
                    				

                    }


                    }
                    break;

            }

            this_NEWLINE_40=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

            			newLeafNode(this_NEWLINE_40, grammarAccess.getTaskAccess().getNEWLINETerminalRuleCall_40());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleStatus"
    // InternalKPIGenerator.g:534:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // InternalKPIGenerator.g:534:47: (iv_ruleStatus= ruleStatus EOF )
            // InternalKPIGenerator.g:535:2: iv_ruleStatus= ruleStatus EOF
            {
             newCompositeNode(grammarAccess.getStatusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatus=ruleStatus();

            state._fsp--;

             current =iv_ruleStatus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatus"


    // $ANTLR start "ruleStatus"
    // InternalKPIGenerator.g:541:1: ruleStatus returns [EObject current=null] : ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) ( (lv_text_1_0= RULE_CADENA ) ) ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        Token lv_statusName_0_1=null;
        Token lv_statusName_0_2=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:547:2: ( ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) ( (lv_text_1_0= RULE_CADENA ) ) ) )
            // InternalKPIGenerator.g:548:2: ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) ( (lv_text_1_0= RULE_CADENA ) ) )
            {
            // InternalKPIGenerator.g:548:2: ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) ( (lv_text_1_0= RULE_CADENA ) ) )
            // InternalKPIGenerator.g:549:3: ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) ( (lv_text_1_0= RULE_CADENA ) )
            {
            // InternalKPIGenerator.g:549:3: ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) )
            // InternalKPIGenerator.g:550:4: ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) )
            {
            // InternalKPIGenerator.g:550:4: ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) )
            // InternalKPIGenerator.g:551:5: (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' )
            {
            // InternalKPIGenerator.g:551:5: (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:552:6: lv_statusName_0_1= 'completed'
                    {
                    lv_statusName_0_1=(Token)match(input,15,FOLLOW_4); 

                    						newLeafNode(lv_statusName_0_1, grammarAccess.getStatusAccess().getStatusNameCompletedKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatusRule());
                    						}
                    						setWithLastConsumed(current, "statusName", lv_statusName_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:563:6: lv_statusName_0_2= 'new'
                    {
                    lv_statusName_0_2=(Token)match(input,16,FOLLOW_4); 

                    						newLeafNode(lv_statusName_0_2, grammarAccess.getStatusAccess().getStatusNameNewKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatusRule());
                    						}
                    						setWithLastConsumed(current, "statusName", lv_statusName_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalKPIGenerator.g:576:3: ( (lv_text_1_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:577:4: (lv_text_1_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:577:4: (lv_text_1_0= RULE_CADENA )
            // InternalKPIGenerator.g:578:5: lv_text_1_0= RULE_CADENA
            {
            lv_text_1_0=(Token)match(input,RULE_CADENA,FOLLOW_2); 

            					newLeafNode(lv_text_1_0, grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_1_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "entryRuleBOOL"
    // InternalKPIGenerator.g:598:1: entryRuleBOOL returns [EObject current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final EObject entryRuleBOOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOL = null;


        try {
            // InternalKPIGenerator.g:598:45: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalKPIGenerator.g:599:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalKPIGenerator.g:605:1: ruleBOOL returns [EObject current=null] : (otherlv_0= 'FALSO' | otherlv_1= 'VERDADERO' ) ;
    public final EObject ruleBOOL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:611:2: ( (otherlv_0= 'FALSO' | otherlv_1= 'VERDADERO' ) )
            // InternalKPIGenerator.g:612:2: (otherlv_0= 'FALSO' | otherlv_1= 'VERDADERO' )
            {
            // InternalKPIGenerator.g:612:2: (otherlv_0= 'FALSO' | otherlv_1= 'VERDADERO' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:613:3: otherlv_0= 'FALSO'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getBOOLAccess().getFALSOKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:618:3: otherlv_1= 'VERDADERO'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getBOOLAccess().getVERDADEROKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleTaskName"
    // InternalKPIGenerator.g:626:1: entryRuleTaskName returns [EObject current=null] : iv_ruleTaskName= ruleTaskName EOF ;
    public final EObject entryRuleTaskName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskName = null;


        try {
            // InternalKPIGenerator.g:626:49: (iv_ruleTaskName= ruleTaskName EOF )
            // InternalKPIGenerator.g:627:2: iv_ruleTaskName= ruleTaskName EOF
            {
             newCompositeNode(grammarAccess.getTaskNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskName=ruleTaskName();

            state._fsp--;

             current =iv_ruleTaskName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskName"


    // $ANTLR start "ruleTaskName"
    // InternalKPIGenerator.g:633:1: ruleTaskName returns [EObject current=null] : ( (this_PIPE_0= RULE_PIPE ( (lv_phase_1_0= RULE_CADENA ) ) (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )? this_PIPE_4= RULE_PIPE ( (lv_useCase_5_0= RULE_CADENA ) ) this_PIPE_6= RULE_PIPE ( (lv_version_7_0= RULE_INT ) ) ) | ruleEDouble ) ;
    public final EObject ruleTaskName() throws RecognitionException {
        EObject current = null;

        Token this_PIPE_0=null;
        Token lv_phase_1_0=null;
        Token this_PIPE_2=null;
        Token lv_subphase_3_0=null;
        Token this_PIPE_4=null;
        Token lv_useCase_5_0=null;
        Token this_PIPE_6=null;
        Token lv_version_7_0=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:639:2: ( ( (this_PIPE_0= RULE_PIPE ( (lv_phase_1_0= RULE_CADENA ) ) (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )? this_PIPE_4= RULE_PIPE ( (lv_useCase_5_0= RULE_CADENA ) ) this_PIPE_6= RULE_PIPE ( (lv_version_7_0= RULE_INT ) ) ) | ruleEDouble ) )
            // InternalKPIGenerator.g:640:2: ( (this_PIPE_0= RULE_PIPE ( (lv_phase_1_0= RULE_CADENA ) ) (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )? this_PIPE_4= RULE_PIPE ( (lv_useCase_5_0= RULE_CADENA ) ) this_PIPE_6= RULE_PIPE ( (lv_version_7_0= RULE_INT ) ) ) | ruleEDouble )
            {
            // InternalKPIGenerator.g:640:2: ( (this_PIPE_0= RULE_PIPE ( (lv_phase_1_0= RULE_CADENA ) ) (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )? this_PIPE_4= RULE_PIPE ( (lv_useCase_5_0= RULE_CADENA ) ) this_PIPE_6= RULE_PIPE ( (lv_version_7_0= RULE_INT ) ) ) | ruleEDouble )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_PIPE) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalKPIGenerator.g:641:3: (this_PIPE_0= RULE_PIPE ( (lv_phase_1_0= RULE_CADENA ) ) (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )? this_PIPE_4= RULE_PIPE ( (lv_useCase_5_0= RULE_CADENA ) ) this_PIPE_6= RULE_PIPE ( (lv_version_7_0= RULE_INT ) ) )
                    {
                    // InternalKPIGenerator.g:641:3: (this_PIPE_0= RULE_PIPE ( (lv_phase_1_0= RULE_CADENA ) ) (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )? this_PIPE_4= RULE_PIPE ( (lv_useCase_5_0= RULE_CADENA ) ) this_PIPE_6= RULE_PIPE ( (lv_version_7_0= RULE_INT ) ) )
                    // InternalKPIGenerator.g:642:4: this_PIPE_0= RULE_PIPE ( (lv_phase_1_0= RULE_CADENA ) ) (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )? this_PIPE_4= RULE_PIPE ( (lv_useCase_5_0= RULE_CADENA ) ) this_PIPE_6= RULE_PIPE ( (lv_version_7_0= RULE_INT ) )
                    {
                    this_PIPE_0=(Token)match(input,RULE_PIPE,FOLLOW_4); 

                    				newLeafNode(this_PIPE_0, grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_0());
                    			
                    // InternalKPIGenerator.g:646:4: ( (lv_phase_1_0= RULE_CADENA ) )
                    // InternalKPIGenerator.g:647:5: (lv_phase_1_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:647:5: (lv_phase_1_0= RULE_CADENA )
                    // InternalKPIGenerator.g:648:6: lv_phase_1_0= RULE_CADENA
                    {
                    lv_phase_1_0=(Token)match(input,RULE_CADENA,FOLLOW_13); 

                    						newLeafNode(lv_phase_1_0, grammarAccess.getTaskNameAccess().getPhaseCADENATerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"phase",
                    							lv_phase_1_0,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }


                    }

                    // InternalKPIGenerator.g:664:4: (this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_PIPE) ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1==RULE_CADENA) ) {
                            int LA9_2 = input.LA(3);

                            if ( (LA9_2==RULE_PIPE) ) {
                                int LA9_3 = input.LA(4);

                                if ( (LA9_3==RULE_CADENA) ) {
                                    alt9=1;
                                }
                            }
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalKPIGenerator.g:665:5: this_PIPE_2= RULE_PIPE ( (lv_subphase_3_0= RULE_CADENA ) )
                            {
                            this_PIPE_2=(Token)match(input,RULE_PIPE,FOLLOW_4); 

                            					newLeafNode(this_PIPE_2, grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_2_0());
                            				
                            // InternalKPIGenerator.g:669:5: ( (lv_subphase_3_0= RULE_CADENA ) )
                            // InternalKPIGenerator.g:670:6: (lv_subphase_3_0= RULE_CADENA )
                            {
                            // InternalKPIGenerator.g:670:6: (lv_subphase_3_0= RULE_CADENA )
                            // InternalKPIGenerator.g:671:7: lv_subphase_3_0= RULE_CADENA
                            {
                            lv_subphase_3_0=(Token)match(input,RULE_CADENA,FOLLOW_13); 

                            							newLeafNode(lv_subphase_3_0, grammarAccess.getTaskNameAccess().getSubphaseCADENATerminalRuleCall_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTaskNameRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"subphase",
                            								lv_subphase_3_0,
                            								"co.edu.uniandes.KPIGenerator.CADENA");
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_PIPE_4=(Token)match(input,RULE_PIPE,FOLLOW_4); 

                    				newLeafNode(this_PIPE_4, grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_3());
                    			
                    // InternalKPIGenerator.g:692:4: ( (lv_useCase_5_0= RULE_CADENA ) )
                    // InternalKPIGenerator.g:693:5: (lv_useCase_5_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:693:5: (lv_useCase_5_0= RULE_CADENA )
                    // InternalKPIGenerator.g:694:6: lv_useCase_5_0= RULE_CADENA
                    {
                    lv_useCase_5_0=(Token)match(input,RULE_CADENA,FOLLOW_13); 

                    						newLeafNode(lv_useCase_5_0, grammarAccess.getTaskNameAccess().getUseCaseCADENATerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"useCase",
                    							lv_useCase_5_0,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }


                    }

                    this_PIPE_6=(Token)match(input,RULE_PIPE,FOLLOW_8); 

                    				newLeafNode(this_PIPE_6, grammarAccess.getTaskNameAccess().getPIPETerminalRuleCall_0_5());
                    			
                    // InternalKPIGenerator.g:714:4: ( (lv_version_7_0= RULE_INT ) )
                    // InternalKPIGenerator.g:715:5: (lv_version_7_0= RULE_INT )
                    {
                    // InternalKPIGenerator.g:715:5: (lv_version_7_0= RULE_INT )
                    // InternalKPIGenerator.g:716:6: lv_version_7_0= RULE_INT
                    {
                    lv_version_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_version_7_0, grammarAccess.getTaskNameAccess().getVersionINTTerminalRuleCall_0_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:734:3: ruleEDouble
                    {

                    			newCompositeNode(grammarAccess.getTaskNameAccess().getEDoubleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleEDouble();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskName"


    // $ANTLR start "entryRuleEDouble"
    // InternalKPIGenerator.g:745:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalKPIGenerator.g:745:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalKPIGenerator.g:746:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalKPIGenerator.g:752:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:758:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalKPIGenerator.g:759:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalKPIGenerator.g:759:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalKPIGenerator.g:760:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_0());
            		
            // InternalKPIGenerator.g:767:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalKPIGenerator.g:768:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,19,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});

}
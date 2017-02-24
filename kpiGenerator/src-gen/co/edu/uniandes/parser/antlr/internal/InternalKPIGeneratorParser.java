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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_HEADER", "RULE_INT", "RULE_SEMICOLON", "RULE_CADENA", "RULE_DATE", "RULE_HOUR", "RULE_ID", "RULE_ENDLINE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\r\\n'", "'completed'", "'new'", "'FALSO'", "'VERDADERO'"
    };
    public static final int RULE_ENDLINE=11;
    public static final int RULE_STRING=12;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_HOUR=9;
    public static final int RULE_ID=10;
    public static final int RULE_WS=15;
    public static final int RULE_CADENA=7;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_HEADER=4;
    public static final int RULE_DATE=8;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_SEMICOLON=6;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "Root";
       	}

       	@Override
       	protected KPIGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalKPIGenerator.g:64:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalKPIGenerator.g:64:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalKPIGenerator.g:65:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalKPIGenerator.g:71:1: ruleRoot returns [EObject current=null] : (this_HEADER_0= RULE_HEADER ( (lv_tasks_1_0= ruleTask ) ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token this_HEADER_0=null;
        EObject lv_tasks_1_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:77:2: ( (this_HEADER_0= RULE_HEADER ( (lv_tasks_1_0= ruleTask ) ) ) )
            // InternalKPIGenerator.g:78:2: (this_HEADER_0= RULE_HEADER ( (lv_tasks_1_0= ruleTask ) ) )
            {
            // InternalKPIGenerator.g:78:2: (this_HEADER_0= RULE_HEADER ( (lv_tasks_1_0= ruleTask ) ) )
            // InternalKPIGenerator.g:79:3: this_HEADER_0= RULE_HEADER ( (lv_tasks_1_0= ruleTask ) )
            {
            this_HEADER_0=(Token)match(input,RULE_HEADER,FOLLOW_3); 

            			newLeafNode(this_HEADER_0, grammarAccess.getRootAccess().getHEADERTerminalRuleCall_0());
            		
            // InternalKPIGenerator.g:83:3: ( (lv_tasks_1_0= ruleTask ) )
            // InternalKPIGenerator.g:84:4: (lv_tasks_1_0= ruleTask )
            {
            // InternalKPIGenerator.g:84:4: (lv_tasks_1_0= ruleTask )
            // InternalKPIGenerator.g:85:5: lv_tasks_1_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getRootAccess().getTasksTaskParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_tasks_1_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRootRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_1_0,
            						"co.edu.uniandes.KPIGenerator.Task");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleTask"
    // InternalKPIGenerator.g:106:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalKPIGenerator.g:106:45: (iv_ruleTask= ruleTask EOF )
            // InternalKPIGenerator.g:107:2: iv_ruleTask= ruleTask EOF
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
    // InternalKPIGenerator.g:113:1: ruleTask returns [EObject current=null] : ( () this_INT_1= RULE_INT this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= ruleProject ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_status_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATE ) ) ( (lv_createdHour_26_0= RULE_HOUR ) ) this_SEMICOLON_27= RULE_SEMICOLON this_CADENA_28= RULE_CADENA this_SEMICOLON_29= RULE_SEMICOLON this_CADENA_30= RULE_CADENA this_SEMICOLON_31= RULE_SEMICOLON ( (lv_completedDate_32_0= RULE_DATE ) ) ( (lv_completedHour_33_0= RULE_HOUR ) ) this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON this_CADENA_37= RULE_CADENA this_SEMICOLON_38= RULE_SEMICOLON ( (lv_timeLogged_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_billableMinutes_41_0= RULE_INT ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (otherlv_43= RULE_ID ) )? this_SEMICOLON_44= RULE_SEMICOLON ( (lv_completedOnTime_45_0= ruleBOOL ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_timeEstimated_47_0= RULE_INT ) ) this_SEMICOLON_48= RULE_SEMICOLON ( (lv_tags_49_0= RULE_CADENA ) )? otherlv_50= '\\r\\n' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token this_INT_1=null;
        Token this_SEMICOLON_2=null;
        Token this_SEMICOLON_4=null;
        Token lv_milestone_5_0=null;
        Token this_SEMICOLON_6=null;
        Token lv_name_7_0=null;
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
        Token lv_createdHour_26_0=null;
        Token this_SEMICOLON_27=null;
        Token this_CADENA_28=null;
        Token this_SEMICOLON_29=null;
        Token this_CADENA_30=null;
        Token this_SEMICOLON_31=null;
        Token lv_completedDate_32_0=null;
        Token lv_completedHour_33_0=null;
        Token this_SEMICOLON_34=null;
        Token this_CADENA_35=null;
        Token this_SEMICOLON_36=null;
        Token this_CADENA_37=null;
        Token this_SEMICOLON_38=null;
        Token lv_timeLogged_39_0=null;
        Token this_SEMICOLON_40=null;
        Token lv_billableMinutes_41_0=null;
        Token this_SEMICOLON_42=null;
        Token otherlv_43=null;
        Token this_SEMICOLON_44=null;
        Token this_SEMICOLON_46=null;
        Token lv_timeEstimated_47_0=null;
        Token this_SEMICOLON_48=null;
        Token lv_tags_49_0=null;
        Token otherlv_50=null;
        EObject lv_project_3_0 = null;

        EObject lv_private_17_0 = null;

        EObject lv_status_21_0 = null;

        EObject lv_completedOnTime_45_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:119:2: ( ( () this_INT_1= RULE_INT this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= ruleProject ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_status_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATE ) ) ( (lv_createdHour_26_0= RULE_HOUR ) ) this_SEMICOLON_27= RULE_SEMICOLON this_CADENA_28= RULE_CADENA this_SEMICOLON_29= RULE_SEMICOLON this_CADENA_30= RULE_CADENA this_SEMICOLON_31= RULE_SEMICOLON ( (lv_completedDate_32_0= RULE_DATE ) ) ( (lv_completedHour_33_0= RULE_HOUR ) ) this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON this_CADENA_37= RULE_CADENA this_SEMICOLON_38= RULE_SEMICOLON ( (lv_timeLogged_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_billableMinutes_41_0= RULE_INT ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (otherlv_43= RULE_ID ) )? this_SEMICOLON_44= RULE_SEMICOLON ( (lv_completedOnTime_45_0= ruleBOOL ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_timeEstimated_47_0= RULE_INT ) ) this_SEMICOLON_48= RULE_SEMICOLON ( (lv_tags_49_0= RULE_CADENA ) )? otherlv_50= '\\r\\n' ) )
            // InternalKPIGenerator.g:120:2: ( () this_INT_1= RULE_INT this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= ruleProject ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_status_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATE ) ) ( (lv_createdHour_26_0= RULE_HOUR ) ) this_SEMICOLON_27= RULE_SEMICOLON this_CADENA_28= RULE_CADENA this_SEMICOLON_29= RULE_SEMICOLON this_CADENA_30= RULE_CADENA this_SEMICOLON_31= RULE_SEMICOLON ( (lv_completedDate_32_0= RULE_DATE ) ) ( (lv_completedHour_33_0= RULE_HOUR ) ) this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON this_CADENA_37= RULE_CADENA this_SEMICOLON_38= RULE_SEMICOLON ( (lv_timeLogged_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_billableMinutes_41_0= RULE_INT ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (otherlv_43= RULE_ID ) )? this_SEMICOLON_44= RULE_SEMICOLON ( (lv_completedOnTime_45_0= ruleBOOL ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_timeEstimated_47_0= RULE_INT ) ) this_SEMICOLON_48= RULE_SEMICOLON ( (lv_tags_49_0= RULE_CADENA ) )? otherlv_50= '\\r\\n' )
            {
            // InternalKPIGenerator.g:120:2: ( () this_INT_1= RULE_INT this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= ruleProject ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_status_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATE ) ) ( (lv_createdHour_26_0= RULE_HOUR ) ) this_SEMICOLON_27= RULE_SEMICOLON this_CADENA_28= RULE_CADENA this_SEMICOLON_29= RULE_SEMICOLON this_CADENA_30= RULE_CADENA this_SEMICOLON_31= RULE_SEMICOLON ( (lv_completedDate_32_0= RULE_DATE ) ) ( (lv_completedHour_33_0= RULE_HOUR ) ) this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON this_CADENA_37= RULE_CADENA this_SEMICOLON_38= RULE_SEMICOLON ( (lv_timeLogged_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_billableMinutes_41_0= RULE_INT ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (otherlv_43= RULE_ID ) )? this_SEMICOLON_44= RULE_SEMICOLON ( (lv_completedOnTime_45_0= ruleBOOL ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_timeEstimated_47_0= RULE_INT ) ) this_SEMICOLON_48= RULE_SEMICOLON ( (lv_tags_49_0= RULE_CADENA ) )? otherlv_50= '\\r\\n' )
            // InternalKPIGenerator.g:121:3: () this_INT_1= RULE_INT this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= ruleProject ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_CADENA ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_status_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATE ) ) ( (lv_createdHour_26_0= RULE_HOUR ) ) this_SEMICOLON_27= RULE_SEMICOLON this_CADENA_28= RULE_CADENA this_SEMICOLON_29= RULE_SEMICOLON this_CADENA_30= RULE_CADENA this_SEMICOLON_31= RULE_SEMICOLON ( (lv_completedDate_32_0= RULE_DATE ) ) ( (lv_completedHour_33_0= RULE_HOUR ) ) this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON this_CADENA_37= RULE_CADENA this_SEMICOLON_38= RULE_SEMICOLON ( (lv_timeLogged_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (lv_billableMinutes_41_0= RULE_INT ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (otherlv_43= RULE_ID ) )? this_SEMICOLON_44= RULE_SEMICOLON ( (lv_completedOnTime_45_0= ruleBOOL ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_timeEstimated_47_0= RULE_INT ) ) this_SEMICOLON_48= RULE_SEMICOLON ( (lv_tags_49_0= RULE_CADENA ) )? otherlv_50= '\\r\\n'
            {
            // InternalKPIGenerator.g:121:3: ()
            // InternalKPIGenerator.g:122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_4); 

            			newLeafNode(this_INT_1, grammarAccess.getTaskAccess().getINTTerminalRuleCall_1());
            		
            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_2());
            		
            // InternalKPIGenerator.g:136:3: ( (lv_project_3_0= ruleProject ) )
            // InternalKPIGenerator.g:137:4: (lv_project_3_0= ruleProject )
            {
            // InternalKPIGenerator.g:137:4: (lv_project_3_0= ruleProject )
            // InternalKPIGenerator.g:138:5: lv_project_3_0= ruleProject
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getProjectProjectParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_project_3_0=ruleProject();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"project",
            						lv_project_3_0,
            						"co.edu.uniandes.KPIGenerator.Project");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_4=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_4, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_4());
            		
            // InternalKPIGenerator.g:159:3: ( (lv_milestone_5_0= RULE_CADENA ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CADENA) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalKPIGenerator.g:160:4: (lv_milestone_5_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:160:4: (lv_milestone_5_0= RULE_CADENA )
                    // InternalKPIGenerator.g:161:5: lv_milestone_5_0= RULE_CADENA
                    {
                    lv_milestone_5_0=(Token)match(input,RULE_CADENA,FOLLOW_4); 

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

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_6());
            		
            // InternalKPIGenerator.g:181:3: ( (lv_name_7_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:182:4: (lv_name_7_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:182:4: (lv_name_7_0= RULE_CADENA )
            // InternalKPIGenerator.g:183:5: lv_name_7_0= RULE_CADENA
            {
            lv_name_7_0=(Token)match(input,RULE_CADENA,FOLLOW_4); 

            					newLeafNode(lv_name_7_0, grammarAccess.getTaskAccess().getNameCADENATerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_8, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalKPIGenerator.g:203:3: ( (lv_TaskDescription_9_0= RULE_CADENA ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CADENA) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:204:4: (lv_TaskDescription_9_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:204:4: (lv_TaskDescription_9_0= RULE_CADENA )
                    // InternalKPIGenerator.g:205:5: lv_TaskDescription_9_0= RULE_CADENA
                    {
                    lv_TaskDescription_9_0=(Token)match(input,RULE_CADENA,FOLLOW_4); 

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

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_10());
            		
            // InternalKPIGenerator.g:225:3: ( (lv_startDate_11_0= RULE_DATE ) )
            // InternalKPIGenerator.g:226:4: (lv_startDate_11_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:226:4: (lv_startDate_11_0= RULE_DATE )
            // InternalKPIGenerator.g:227:5: lv_startDate_11_0= RULE_DATE
            {
            lv_startDate_11_0=(Token)match(input,RULE_DATE,FOLLOW_4); 

            					newLeafNode(lv_startDate_11_0, grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_11_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_12, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_12());
            		
            // InternalKPIGenerator.g:247:3: ( (lv_DueDate_13_0= RULE_DATE ) )
            // InternalKPIGenerator.g:248:4: (lv_DueDate_13_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:248:4: (lv_DueDate_13_0= RULE_DATE )
            // InternalKPIGenerator.g:249:5: lv_DueDate_13_0= RULE_DATE
            {
            lv_DueDate_13_0=(Token)match(input,RULE_DATE,FOLLOW_4); 

            					newLeafNode(lv_DueDate_13_0, grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"DueDate",
            						lv_DueDate_13_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_14, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_14());
            		
            // InternalKPIGenerator.g:269:3: ( (lv_priority_15_0= RULE_CADENA ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_CADENA) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:270:4: (lv_priority_15_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:270:4: (lv_priority_15_0= RULE_CADENA )
                    // InternalKPIGenerator.g:271:5: lv_priority_15_0= RULE_CADENA
                    {
                    lv_priority_15_0=(Token)match(input,RULE_CADENA,FOLLOW_4); 

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

            this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_8); 

            			newLeafNode(this_SEMICOLON_16, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_16());
            		
            // InternalKPIGenerator.g:291:3: ( (lv_private_17_0= ruleBOOL ) )
            // InternalKPIGenerator.g:292:4: (lv_private_17_0= ruleBOOL )
            {
            // InternalKPIGenerator.g:292:4: (lv_private_17_0= ruleBOOL )
            // InternalKPIGenerator.g:293:5: lv_private_17_0= ruleBOOL
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getPrivateBOOLParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_4);
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

            this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_3); 

            			newLeafNode(this_SEMICOLON_18, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_18());
            		
            // InternalKPIGenerator.g:314:3: ( (lv_progress_19_0= RULE_INT ) )
            // InternalKPIGenerator.g:315:4: (lv_progress_19_0= RULE_INT )
            {
            // InternalKPIGenerator.g:315:4: (lv_progress_19_0= RULE_INT )
            // InternalKPIGenerator.g:316:5: lv_progress_19_0= RULE_INT
            {
            lv_progress_19_0=(Token)match(input,RULE_INT,FOLLOW_4); 

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
            		
            // InternalKPIGenerator.g:336:3: ( (lv_status_21_0= ruleStatus ) )
            // InternalKPIGenerator.g:337:4: (lv_status_21_0= ruleStatus )
            {
            // InternalKPIGenerator.g:337:4: (lv_status_21_0= ruleStatus )
            // InternalKPIGenerator.g:338:5: lv_status_21_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getStatusStatusParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_4);
            lv_status_21_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_21_0,
            						"co.edu.uniandes.KPIGenerator.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_22=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_22, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_22());
            		
            // InternalKPIGenerator.g:359:3: ( (lv_assignedTo_23_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:360:4: (lv_assignedTo_23_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:360:4: (lv_assignedTo_23_0= RULE_CADENA )
            // InternalKPIGenerator.g:361:5: lv_assignedTo_23_0= RULE_CADENA
            {
            lv_assignedTo_23_0=(Token)match(input,RULE_CADENA,FOLLOW_4); 

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

            this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_24, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_24());
            		
            // InternalKPIGenerator.g:381:3: ( (lv_createdDate_25_0= RULE_DATE ) )
            // InternalKPIGenerator.g:382:4: (lv_createdDate_25_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:382:4: (lv_createdDate_25_0= RULE_DATE )
            // InternalKPIGenerator.g:383:5: lv_createdDate_25_0= RULE_DATE
            {
            lv_createdDate_25_0=(Token)match(input,RULE_DATE,FOLLOW_10); 

            					newLeafNode(lv_createdDate_25_0, grammarAccess.getTaskAccess().getCreatedDateDATETerminalRuleCall_25_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdDate",
            						lv_createdDate_25_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            // InternalKPIGenerator.g:399:3: ( (lv_createdHour_26_0= RULE_HOUR ) )
            // InternalKPIGenerator.g:400:4: (lv_createdHour_26_0= RULE_HOUR )
            {
            // InternalKPIGenerator.g:400:4: (lv_createdHour_26_0= RULE_HOUR )
            // InternalKPIGenerator.g:401:5: lv_createdHour_26_0= RULE_HOUR
            {
            lv_createdHour_26_0=(Token)match(input,RULE_HOUR,FOLLOW_4); 

            					newLeafNode(lv_createdHour_26_0, grammarAccess.getTaskAccess().getCreatedHourHOURTerminalRuleCall_26_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdHour",
            						lv_createdHour_26_0,
            						"co.edu.uniandes.KPIGenerator.HOUR");
            				

            }


            }

            this_SEMICOLON_27=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_27, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_27());
            		
            this_CADENA_28=(Token)match(input,RULE_CADENA,FOLLOW_4); 

            			newLeafNode(this_CADENA_28, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_28());
            		
            this_SEMICOLON_29=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_29, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_29());
            		
            this_CADENA_30=(Token)match(input,RULE_CADENA,FOLLOW_4); 

            			newLeafNode(this_CADENA_30, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_30());
            		
            this_SEMICOLON_31=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_31, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_31());
            		
            // InternalKPIGenerator.g:437:3: ( (lv_completedDate_32_0= RULE_DATE ) )
            // InternalKPIGenerator.g:438:4: (lv_completedDate_32_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:438:4: (lv_completedDate_32_0= RULE_DATE )
            // InternalKPIGenerator.g:439:5: lv_completedDate_32_0= RULE_DATE
            {
            lv_completedDate_32_0=(Token)match(input,RULE_DATE,FOLLOW_10); 

            					newLeafNode(lv_completedDate_32_0, grammarAccess.getTaskAccess().getCompletedDateDATETerminalRuleCall_32_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedDate",
            						lv_completedDate_32_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            // InternalKPIGenerator.g:455:3: ( (lv_completedHour_33_0= RULE_HOUR ) )
            // InternalKPIGenerator.g:456:4: (lv_completedHour_33_0= RULE_HOUR )
            {
            // InternalKPIGenerator.g:456:4: (lv_completedHour_33_0= RULE_HOUR )
            // InternalKPIGenerator.g:457:5: lv_completedHour_33_0= RULE_HOUR
            {
            lv_completedHour_33_0=(Token)match(input,RULE_HOUR,FOLLOW_4); 

            					newLeafNode(lv_completedHour_33_0, grammarAccess.getTaskAccess().getCompletedHourHOURTerminalRuleCall_33_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedHour",
            						lv_completedHour_33_0,
            						"co.edu.uniandes.KPIGenerator.HOUR");
            				

            }


            }

            this_SEMICOLON_34=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_34, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_34());
            		
            this_CADENA_35=(Token)match(input,RULE_CADENA,FOLLOW_4); 

            			newLeafNode(this_CADENA_35, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_35());
            		
            this_SEMICOLON_36=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_36, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_36());
            		
            this_CADENA_37=(Token)match(input,RULE_CADENA,FOLLOW_4); 

            			newLeafNode(this_CADENA_37, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_37());
            		
            this_SEMICOLON_38=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            			newLeafNode(this_SEMICOLON_38, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_38());
            		
            // InternalKPIGenerator.g:493:3: ( (lv_timeLogged_39_0= RULE_INT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:494:4: (lv_timeLogged_39_0= RULE_INT )
                    {
                    // InternalKPIGenerator.g:494:4: (lv_timeLogged_39_0= RULE_INT )
                    // InternalKPIGenerator.g:495:5: lv_timeLogged_39_0= RULE_INT
                    {
                    lv_timeLogged_39_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                    					newLeafNode(lv_timeLogged_39_0, grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_39_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"timeLogged",
                    						lv_timeLogged_39_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_40=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            			newLeafNode(this_SEMICOLON_40, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_40());
            		
            // InternalKPIGenerator.g:515:3: ( (lv_billableMinutes_41_0= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:516:4: (lv_billableMinutes_41_0= RULE_INT )
                    {
                    // InternalKPIGenerator.g:516:4: (lv_billableMinutes_41_0= RULE_INT )
                    // InternalKPIGenerator.g:517:5: lv_billableMinutes_41_0= RULE_INT
                    {
                    lv_billableMinutes_41_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                    					newLeafNode(lv_billableMinutes_41_0, grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_41_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"billableMinutes",
                    						lv_billableMinutes_41_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_42=(Token)match(input,RULE_SEMICOLON,FOLLOW_12); 

            			newLeafNode(this_SEMICOLON_42, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_42());
            		
            // InternalKPIGenerator.g:537:3: ( (otherlv_43= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:538:4: (otherlv_43= RULE_ID )
                    {
                    // InternalKPIGenerator.g:538:4: (otherlv_43= RULE_ID )
                    // InternalKPIGenerator.g:539:5: otherlv_43= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    				
                    otherlv_43=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(otherlv_43, grammarAccess.getTaskAccess().getParentTaskTaskCrossReference_43_0());
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_44=(Token)match(input,RULE_SEMICOLON,FOLLOW_8); 

            			newLeafNode(this_SEMICOLON_44, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_44());
            		
            // InternalKPIGenerator.g:554:3: ( (lv_completedOnTime_45_0= ruleBOOL ) )
            // InternalKPIGenerator.g:555:4: (lv_completedOnTime_45_0= ruleBOOL )
            {
            // InternalKPIGenerator.g:555:4: (lv_completedOnTime_45_0= ruleBOOL )
            // InternalKPIGenerator.g:556:5: lv_completedOnTime_45_0= ruleBOOL
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_45_0());
            				
            pushFollow(FOLLOW_4);
            lv_completedOnTime_45_0=ruleBOOL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"completedOnTime",
            						lv_completedOnTime_45_0,
            						"co.edu.uniandes.KPIGenerator.BOOL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_46=(Token)match(input,RULE_SEMICOLON,FOLLOW_3); 

            			newLeafNode(this_SEMICOLON_46, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_46());
            		
            // InternalKPIGenerator.g:577:3: ( (lv_timeEstimated_47_0= RULE_INT ) )
            // InternalKPIGenerator.g:578:4: (lv_timeEstimated_47_0= RULE_INT )
            {
            // InternalKPIGenerator.g:578:4: (lv_timeEstimated_47_0= RULE_INT )
            // InternalKPIGenerator.g:579:5: lv_timeEstimated_47_0= RULE_INT
            {
            lv_timeEstimated_47_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_timeEstimated_47_0, grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_47_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeEstimated",
            						lv_timeEstimated_47_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_48=(Token)match(input,RULE_SEMICOLON,FOLLOW_13); 

            			newLeafNode(this_SEMICOLON_48, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_48());
            		
            // InternalKPIGenerator.g:599:3: ( (lv_tags_49_0= RULE_CADENA ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CADENA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:600:4: (lv_tags_49_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:600:4: (lv_tags_49_0= RULE_CADENA )
                    // InternalKPIGenerator.g:601:5: lv_tags_49_0= RULE_CADENA
                    {
                    lv_tags_49_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

                    					newLeafNode(lv_tags_49_0, grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_49_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tags",
                    						lv_tags_49_0,
                    						"co.edu.uniandes.KPIGenerator.CADENA");
                    				

                    }


                    }
                    break;

            }

            otherlv_50=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_50, grammarAccess.getTaskAccess().getControl000dControl000aKeyword_50());
            		

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


    // $ANTLR start "entryRuleProject"
    // InternalKPIGenerator.g:625:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalKPIGenerator.g:625:48: (iv_ruleProject= ruleProject EOF )
            // InternalKPIGenerator.g:626:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalKPIGenerator.g:632:1: ruleProject returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_CADENA ) ) ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:638:2: ( ( () ( (lv_name_1_0= RULE_CADENA ) ) ) )
            // InternalKPIGenerator.g:639:2: ( () ( (lv_name_1_0= RULE_CADENA ) ) )
            {
            // InternalKPIGenerator.g:639:2: ( () ( (lv_name_1_0= RULE_CADENA ) ) )
            // InternalKPIGenerator.g:640:3: () ( (lv_name_1_0= RULE_CADENA ) )
            {
            // InternalKPIGenerator.g:640:3: ()
            // InternalKPIGenerator.g:641:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            // InternalKPIGenerator.g:647:3: ( (lv_name_1_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:648:4: (lv_name_1_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:648:4: (lv_name_1_0= RULE_CADENA )
            // InternalKPIGenerator.g:649:5: lv_name_1_0= RULE_CADENA
            {
            lv_name_1_0=(Token)match(input,RULE_CADENA,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameCADENATerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleStatus"
    // InternalKPIGenerator.g:669:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // InternalKPIGenerator.g:669:47: (iv_ruleStatus= ruleStatus EOF )
            // InternalKPIGenerator.g:670:2: iv_ruleStatus= ruleStatus EOF
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
    // InternalKPIGenerator.g:676:1: ruleStatus returns [EObject current=null] : ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        Token lv_statusName_0_1=null;
        Token lv_statusName_0_2=null;
        Token this_SEMICOLON_1=null;
        Token lv_text_2_0=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:682:2: ( ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) ) )
            // InternalKPIGenerator.g:683:2: ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) )
            {
            // InternalKPIGenerator.g:683:2: ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) )
            // InternalKPIGenerator.g:684:3: ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) )
            {
            // InternalKPIGenerator.g:684:3: ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) )
            // InternalKPIGenerator.g:685:4: ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) )
            {
            // InternalKPIGenerator.g:685:4: ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) )
            // InternalKPIGenerator.g:686:5: (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' )
            {
            // InternalKPIGenerator.g:686:5: (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:687:6: lv_statusName_0_1= 'completed'
                    {
                    lv_statusName_0_1=(Token)match(input,18,FOLLOW_4); 

                    						newLeafNode(lv_statusName_0_1, grammarAccess.getStatusAccess().getStatusNameCompletedKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatusRule());
                    						}
                    						setWithLastConsumed(current, "statusName", lv_statusName_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:698:6: lv_statusName_0_2= 'new'
                    {
                    lv_statusName_0_2=(Token)match(input,19,FOLLOW_4); 

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

            this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_1, grammarAccess.getStatusAccess().getSEMICOLONTerminalRuleCall_1());
            		
            // InternalKPIGenerator.g:715:3: ( (lv_text_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:716:4: (lv_text_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:716:4: (lv_text_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:717:5: lv_text_2_0= RULE_CADENA
            {
            lv_text_2_0=(Token)match(input,RULE_CADENA,FOLLOW_2); 

            					newLeafNode(lv_text_2_0, grammarAccess.getStatusAccess().getTextCADENATerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatusRule());
            					}
            					setWithLastConsumed(
            						current,
            						"text",
            						lv_text_2_0,
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
    // InternalKPIGenerator.g:737:1: entryRuleBOOL returns [EObject current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final EObject entryRuleBOOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOL = null;


        try {
            // InternalKPIGenerator.g:737:45: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalKPIGenerator.g:738:2: iv_ruleBOOL= ruleBOOL EOF
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
    // InternalKPIGenerator.g:744:1: ruleBOOL returns [EObject current=null] : ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) ) ;
    public final EObject ruleBOOL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:750:2: ( ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) ) )
            // InternalKPIGenerator.g:751:2: ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) )
            {
            // InternalKPIGenerator.g:751:2: ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) )
            // InternalKPIGenerator.g:752:3: () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' )
            {
            // InternalKPIGenerator.g:752:3: ()
            // InternalKPIGenerator.g:753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOOLAccess().getBOOLAction_0(),
            					current);
            			

            }

            // InternalKPIGenerator.g:759:3: (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIGenerator.g:760:4: otherlv_1= 'FALSO'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBOOLAccess().getFALSOKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:765:4: otherlv_2= 'VERDADERO'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getBOOLAccess().getVERDADEROKeyword_1_1());
                    			

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
    // $ANTLR end "ruleBOOL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});

}
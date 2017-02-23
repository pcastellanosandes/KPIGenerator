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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_SEMICOLON", "RULE_CADENA", "RULE_DATE", "RULE_STRING", "RULE_DATEHOUR", "RULE_ID", "RULE_NEWLINE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'completed'", "'new'", "'FALSO'", "'VERDADERO'"
    };
    public static final int RULE_NEWLINE=11;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_DATEHOUR=9;
    public static final int RULE_ID=10;
    public static final int RULE_WS=14;
    public static final int RULE_CADENA=6;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_DATE=7;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=12;
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
    // InternalKPIGenerator.g:71:1: ruleTask returns [EObject current=null] : ( () ( (lv_id_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_STRING ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATEHOUR ) ) this_SEMICOLON_26= RULE_SEMICOLON this_CADENA_27= RULE_CADENA this_SEMICOLON_28= RULE_SEMICOLON this_CADENA_29= RULE_CADENA this_SEMICOLON_30= RULE_SEMICOLON ( (lv_completedDate_31_0= RULE_DATEHOUR ) ) this_SEMICOLON_32= RULE_SEMICOLON this_CADENA_33= RULE_CADENA this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeLogged_37_0= RULE_INT ) )? this_SEMICOLON_38= RULE_SEMICOLON ( (lv_billableMinutes_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (otherlv_41= RULE_ID ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (lv_completedOnTime_43_0= ruleBOOL ) ) this_SEMICOLON_44= RULE_SEMICOLON ( (lv_timeEstimated_45_0= RULE_INT ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_tags_47_0= RULE_CADENA ) )? this_NEWLINE_48= RULE_NEWLINE ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_id_1_0=null;
        Token this_SEMICOLON_2=null;
        Token lv_project_3_0=null;
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
        Token this_SEMICOLON_26=null;
        Token this_CADENA_27=null;
        Token this_SEMICOLON_28=null;
        Token this_CADENA_29=null;
        Token this_SEMICOLON_30=null;
        Token lv_completedDate_31_0=null;
        Token this_SEMICOLON_32=null;
        Token this_CADENA_33=null;
        Token this_SEMICOLON_34=null;
        Token this_CADENA_35=null;
        Token this_SEMICOLON_36=null;
        Token lv_timeLogged_37_0=null;
        Token this_SEMICOLON_38=null;
        Token lv_billableMinutes_39_0=null;
        Token this_SEMICOLON_40=null;
        Token otherlv_41=null;
        Token this_SEMICOLON_42=null;
        Token this_SEMICOLON_44=null;
        Token lv_timeEstimated_45_0=null;
        Token this_SEMICOLON_46=null;
        Token lv_tags_47_0=null;
        Token this_NEWLINE_48=null;
        EObject lv_private_17_0 = null;

        EObject lv_Task_21_0 = null;

        EObject lv_completedOnTime_43_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:77:2: ( ( () ( (lv_id_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_STRING ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATEHOUR ) ) this_SEMICOLON_26= RULE_SEMICOLON this_CADENA_27= RULE_CADENA this_SEMICOLON_28= RULE_SEMICOLON this_CADENA_29= RULE_CADENA this_SEMICOLON_30= RULE_SEMICOLON ( (lv_completedDate_31_0= RULE_DATEHOUR ) ) this_SEMICOLON_32= RULE_SEMICOLON this_CADENA_33= RULE_CADENA this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeLogged_37_0= RULE_INT ) )? this_SEMICOLON_38= RULE_SEMICOLON ( (lv_billableMinutes_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (otherlv_41= RULE_ID ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (lv_completedOnTime_43_0= ruleBOOL ) ) this_SEMICOLON_44= RULE_SEMICOLON ( (lv_timeEstimated_45_0= RULE_INT ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_tags_47_0= RULE_CADENA ) )? this_NEWLINE_48= RULE_NEWLINE ) )
            // InternalKPIGenerator.g:78:2: ( () ( (lv_id_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_STRING ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATEHOUR ) ) this_SEMICOLON_26= RULE_SEMICOLON this_CADENA_27= RULE_CADENA this_SEMICOLON_28= RULE_SEMICOLON this_CADENA_29= RULE_CADENA this_SEMICOLON_30= RULE_SEMICOLON ( (lv_completedDate_31_0= RULE_DATEHOUR ) ) this_SEMICOLON_32= RULE_SEMICOLON this_CADENA_33= RULE_CADENA this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeLogged_37_0= RULE_INT ) )? this_SEMICOLON_38= RULE_SEMICOLON ( (lv_billableMinutes_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (otherlv_41= RULE_ID ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (lv_completedOnTime_43_0= ruleBOOL ) ) this_SEMICOLON_44= RULE_SEMICOLON ( (lv_timeEstimated_45_0= RULE_INT ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_tags_47_0= RULE_CADENA ) )? this_NEWLINE_48= RULE_NEWLINE )
            {
            // InternalKPIGenerator.g:78:2: ( () ( (lv_id_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_STRING ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATEHOUR ) ) this_SEMICOLON_26= RULE_SEMICOLON this_CADENA_27= RULE_CADENA this_SEMICOLON_28= RULE_SEMICOLON this_CADENA_29= RULE_CADENA this_SEMICOLON_30= RULE_SEMICOLON ( (lv_completedDate_31_0= RULE_DATEHOUR ) ) this_SEMICOLON_32= RULE_SEMICOLON this_CADENA_33= RULE_CADENA this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeLogged_37_0= RULE_INT ) )? this_SEMICOLON_38= RULE_SEMICOLON ( (lv_billableMinutes_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (otherlv_41= RULE_ID ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (lv_completedOnTime_43_0= ruleBOOL ) ) this_SEMICOLON_44= RULE_SEMICOLON ( (lv_timeEstimated_45_0= RULE_INT ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_tags_47_0= RULE_CADENA ) )? this_NEWLINE_48= RULE_NEWLINE )
            // InternalKPIGenerator.g:79:3: () ( (lv_id_1_0= RULE_INT ) ) this_SEMICOLON_2= RULE_SEMICOLON ( (lv_project_3_0= RULE_CADENA ) ) this_SEMICOLON_4= RULE_SEMICOLON ( (lv_milestone_5_0= RULE_CADENA ) )? this_SEMICOLON_6= RULE_SEMICOLON ( (lv_name_7_0= RULE_CADENA ) ) this_SEMICOLON_8= RULE_SEMICOLON ( (lv_TaskDescription_9_0= RULE_CADENA ) )? this_SEMICOLON_10= RULE_SEMICOLON ( (lv_startDate_11_0= RULE_DATE ) ) this_SEMICOLON_12= RULE_SEMICOLON ( (lv_DueDate_13_0= RULE_DATE ) ) this_SEMICOLON_14= RULE_SEMICOLON ( (lv_priority_15_0= RULE_STRING ) )? this_SEMICOLON_16= RULE_SEMICOLON ( (lv_private_17_0= ruleBOOL ) ) this_SEMICOLON_18= RULE_SEMICOLON ( (lv_progress_19_0= RULE_INT ) ) this_SEMICOLON_20= RULE_SEMICOLON ( (lv_Task_21_0= ruleStatus ) ) this_SEMICOLON_22= RULE_SEMICOLON ( (lv_assignedTo_23_0= RULE_CADENA ) ) this_SEMICOLON_24= RULE_SEMICOLON ( (lv_createdDate_25_0= RULE_DATEHOUR ) ) this_SEMICOLON_26= RULE_SEMICOLON this_CADENA_27= RULE_CADENA this_SEMICOLON_28= RULE_SEMICOLON this_CADENA_29= RULE_CADENA this_SEMICOLON_30= RULE_SEMICOLON ( (lv_completedDate_31_0= RULE_DATEHOUR ) ) this_SEMICOLON_32= RULE_SEMICOLON this_CADENA_33= RULE_CADENA this_SEMICOLON_34= RULE_SEMICOLON this_CADENA_35= RULE_CADENA this_SEMICOLON_36= RULE_SEMICOLON ( (lv_timeLogged_37_0= RULE_INT ) )? this_SEMICOLON_38= RULE_SEMICOLON ( (lv_billableMinutes_39_0= RULE_INT ) )? this_SEMICOLON_40= RULE_SEMICOLON ( (otherlv_41= RULE_ID ) )? this_SEMICOLON_42= RULE_SEMICOLON ( (lv_completedOnTime_43_0= ruleBOOL ) ) this_SEMICOLON_44= RULE_SEMICOLON ( (lv_timeEstimated_45_0= RULE_INT ) ) this_SEMICOLON_46= RULE_SEMICOLON ( (lv_tags_47_0= RULE_CADENA ) )? this_NEWLINE_48= RULE_NEWLINE
            {
            // InternalKPIGenerator.g:79:3: ()
            // InternalKPIGenerator.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            // InternalKPIGenerator.g:86:3: ( (lv_id_1_0= RULE_INT ) )
            // InternalKPIGenerator.g:87:4: (lv_id_1_0= RULE_INT )
            {
            // InternalKPIGenerator.g:87:4: (lv_id_1_0= RULE_INT )
            // InternalKPIGenerator.g:88:5: lv_id_1_0= RULE_INT
            {
            lv_id_1_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_id_1_0, grammarAccess.getTaskAccess().getIdINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"id",
            						lv_id_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_2=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_2, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_2());
            		
            // InternalKPIGenerator.g:108:3: ( (lv_project_3_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:109:4: (lv_project_3_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:109:4: (lv_project_3_0= RULE_CADENA )
            // InternalKPIGenerator.g:110:5: lv_project_3_0= RULE_CADENA
            {
            lv_project_3_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            					newLeafNode(lv_project_3_0, grammarAccess.getTaskAccess().getProjectCADENATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"project",
            						lv_project_3_0,
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

            this_SEMICOLON_6=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_6, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_6());
            		
            // InternalKPIGenerator.g:152:3: ( (lv_name_7_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:153:4: (lv_name_7_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:153:4: (lv_name_7_0= RULE_CADENA )
            // InternalKPIGenerator.g:154:5: lv_name_7_0= RULE_CADENA
            {
            lv_name_7_0=(Token)match(input,RULE_CADENA,FOLLOW_3); 

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

            this_SEMICOLON_8=(Token)match(input,RULE_SEMICOLON,FOLLOW_5); 

            			newLeafNode(this_SEMICOLON_8, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_8());
            		
            // InternalKPIGenerator.g:174:3: ( (lv_TaskDescription_9_0= RULE_CADENA ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_CADENA) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalKPIGenerator.g:175:4: (lv_TaskDescription_9_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:175:4: (lv_TaskDescription_9_0= RULE_CADENA )
                    // InternalKPIGenerator.g:176:5: lv_TaskDescription_9_0= RULE_CADENA
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

            this_SEMICOLON_10=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_10, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_10());
            		
            // InternalKPIGenerator.g:196:3: ( (lv_startDate_11_0= RULE_DATE ) )
            // InternalKPIGenerator.g:197:4: (lv_startDate_11_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:197:4: (lv_startDate_11_0= RULE_DATE )
            // InternalKPIGenerator.g:198:5: lv_startDate_11_0= RULE_DATE
            {
            lv_startDate_11_0=(Token)match(input,RULE_DATE,FOLLOW_3); 

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

            this_SEMICOLON_12=(Token)match(input,RULE_SEMICOLON,FOLLOW_6); 

            			newLeafNode(this_SEMICOLON_12, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_12());
            		
            // InternalKPIGenerator.g:218:3: ( (lv_DueDate_13_0= RULE_DATE ) )
            // InternalKPIGenerator.g:219:4: (lv_DueDate_13_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:219:4: (lv_DueDate_13_0= RULE_DATE )
            // InternalKPIGenerator.g:220:5: lv_DueDate_13_0= RULE_DATE
            {
            lv_DueDate_13_0=(Token)match(input,RULE_DATE,FOLLOW_3); 

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

            this_SEMICOLON_14=(Token)match(input,RULE_SEMICOLON,FOLLOW_7); 

            			newLeafNode(this_SEMICOLON_14, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_14());
            		
            // InternalKPIGenerator.g:240:3: ( (lv_priority_15_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:241:4: (lv_priority_15_0= RULE_STRING )
                    {
                    // InternalKPIGenerator.g:241:4: (lv_priority_15_0= RULE_STRING )
                    // InternalKPIGenerator.g:242:5: lv_priority_15_0= RULE_STRING
                    {
                    lv_priority_15_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    					newLeafNode(lv_priority_15_0, grammarAccess.getTaskAccess().getPrioritySTRINGTerminalRuleCall_15_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"priority",
                    						lv_priority_15_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_16=(Token)match(input,RULE_SEMICOLON,FOLLOW_8); 

            			newLeafNode(this_SEMICOLON_16, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_16());
            		
            // InternalKPIGenerator.g:262:3: ( (lv_private_17_0= ruleBOOL ) )
            // InternalKPIGenerator.g:263:4: (lv_private_17_0= ruleBOOL )
            {
            // InternalKPIGenerator.g:263:4: (lv_private_17_0= ruleBOOL )
            // InternalKPIGenerator.g:264:5: lv_private_17_0= ruleBOOL
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

            this_SEMICOLON_18=(Token)match(input,RULE_SEMICOLON,FOLLOW_9); 

            			newLeafNode(this_SEMICOLON_18, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_18());
            		
            // InternalKPIGenerator.g:285:3: ( (lv_progress_19_0= RULE_INT ) )
            // InternalKPIGenerator.g:286:4: (lv_progress_19_0= RULE_INT )
            {
            // InternalKPIGenerator.g:286:4: (lv_progress_19_0= RULE_INT )
            // InternalKPIGenerator.g:287:5: lv_progress_19_0= RULE_INT
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

            this_SEMICOLON_20=(Token)match(input,RULE_SEMICOLON,FOLLOW_10); 

            			newLeafNode(this_SEMICOLON_20, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_20());
            		
            // InternalKPIGenerator.g:307:3: ( (lv_Task_21_0= ruleStatus ) )
            // InternalKPIGenerator.g:308:4: (lv_Task_21_0= ruleStatus )
            {
            // InternalKPIGenerator.g:308:4: (lv_Task_21_0= ruleStatus )
            // InternalKPIGenerator.g:309:5: lv_Task_21_0= ruleStatus
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
            		
            // InternalKPIGenerator.g:330:3: ( (lv_assignedTo_23_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:331:4: (lv_assignedTo_23_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:331:4: (lv_assignedTo_23_0= RULE_CADENA )
            // InternalKPIGenerator.g:332:5: lv_assignedTo_23_0= RULE_CADENA
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

            this_SEMICOLON_24=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            			newLeafNode(this_SEMICOLON_24, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_24());
            		
            // InternalKPIGenerator.g:352:3: ( (lv_createdDate_25_0= RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:353:4: (lv_createdDate_25_0= RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:353:4: (lv_createdDate_25_0= RULE_DATEHOUR )
            // InternalKPIGenerator.g:354:5: lv_createdDate_25_0= RULE_DATEHOUR
            {
            lv_createdDate_25_0=(Token)match(input,RULE_DATEHOUR,FOLLOW_3); 

            					newLeafNode(lv_createdDate_25_0, grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_25_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdDate",
            						lv_createdDate_25_0,
            						"co.edu.uniandes.KPIGenerator.DATEHOUR");
            				

            }


            }

            this_SEMICOLON_26=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_26, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_26());
            		
            this_CADENA_27=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            			newLeafNode(this_CADENA_27, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_27());
            		
            this_SEMICOLON_28=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_28, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_28());
            		
            this_CADENA_29=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            			newLeafNode(this_CADENA_29, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_29());
            		
            this_SEMICOLON_30=(Token)match(input,RULE_SEMICOLON,FOLLOW_11); 

            			newLeafNode(this_SEMICOLON_30, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_30());
            		
            // InternalKPIGenerator.g:390:3: ( (lv_completedDate_31_0= RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:391:4: (lv_completedDate_31_0= RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:391:4: (lv_completedDate_31_0= RULE_DATEHOUR )
            // InternalKPIGenerator.g:392:5: lv_completedDate_31_0= RULE_DATEHOUR
            {
            lv_completedDate_31_0=(Token)match(input,RULE_DATEHOUR,FOLLOW_3); 

            					newLeafNode(lv_completedDate_31_0, grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_31_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedDate",
            						lv_completedDate_31_0,
            						"co.edu.uniandes.KPIGenerator.DATEHOUR");
            				

            }


            }

            this_SEMICOLON_32=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_32, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_32());
            		
            this_CADENA_33=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            			newLeafNode(this_CADENA_33, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_33());
            		
            this_SEMICOLON_34=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_34, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_34());
            		
            this_CADENA_35=(Token)match(input,RULE_CADENA,FOLLOW_3); 

            			newLeafNode(this_CADENA_35, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_35());
            		
            this_SEMICOLON_36=(Token)match(input,RULE_SEMICOLON,FOLLOW_12); 

            			newLeafNode(this_SEMICOLON_36, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_36());
            		
            // InternalKPIGenerator.g:428:3: ( (lv_timeLogged_37_0= RULE_INT ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalKPIGenerator.g:429:4: (lv_timeLogged_37_0= RULE_INT )
                    {
                    // InternalKPIGenerator.g:429:4: (lv_timeLogged_37_0= RULE_INT )
                    // InternalKPIGenerator.g:430:5: lv_timeLogged_37_0= RULE_INT
                    {
                    lv_timeLogged_37_0=(Token)match(input,RULE_INT,FOLLOW_3); 

                    					newLeafNode(lv_timeLogged_37_0, grammarAccess.getTaskAccess().getTimeLoggedINTTerminalRuleCall_37_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"timeLogged",
                    						lv_timeLogged_37_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_38=(Token)match(input,RULE_SEMICOLON,FOLLOW_12); 

            			newLeafNode(this_SEMICOLON_38, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_38());
            		
            // InternalKPIGenerator.g:450:3: ( (lv_billableMinutes_39_0= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:451:4: (lv_billableMinutes_39_0= RULE_INT )
                    {
                    // InternalKPIGenerator.g:451:4: (lv_billableMinutes_39_0= RULE_INT )
                    // InternalKPIGenerator.g:452:5: lv_billableMinutes_39_0= RULE_INT
                    {
                    lv_billableMinutes_39_0=(Token)match(input,RULE_INT,FOLLOW_3); 

                    					newLeafNode(lv_billableMinutes_39_0, grammarAccess.getTaskAccess().getBillableMinutesINTTerminalRuleCall_39_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"billableMinutes",
                    						lv_billableMinutes_39_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_40=(Token)match(input,RULE_SEMICOLON,FOLLOW_13); 

            			newLeafNode(this_SEMICOLON_40, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_40());
            		
            // InternalKPIGenerator.g:472:3: ( (otherlv_41= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:473:4: (otherlv_41= RULE_ID )
                    {
                    // InternalKPIGenerator.g:473:4: (otherlv_41= RULE_ID )
                    // InternalKPIGenerator.g:474:5: otherlv_41= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    				
                    otherlv_41=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(otherlv_41, grammarAccess.getTaskAccess().getParentTaskTaskCrossReference_41_0());
                    				

                    }


                    }
                    break;

            }

            this_SEMICOLON_42=(Token)match(input,RULE_SEMICOLON,FOLLOW_8); 

            			newLeafNode(this_SEMICOLON_42, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_42());
            		
            // InternalKPIGenerator.g:489:3: ( (lv_completedOnTime_43_0= ruleBOOL ) )
            // InternalKPIGenerator.g:490:4: (lv_completedOnTime_43_0= ruleBOOL )
            {
            // InternalKPIGenerator.g:490:4: (lv_completedOnTime_43_0= ruleBOOL )
            // InternalKPIGenerator.g:491:5: lv_completedOnTime_43_0= ruleBOOL
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getCompletedOnTimeBOOLParserRuleCall_43_0());
            				
            pushFollow(FOLLOW_3);
            lv_completedOnTime_43_0=ruleBOOL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"completedOnTime",
            						lv_completedOnTime_43_0,
            						"co.edu.uniandes.KPIGenerator.BOOL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_SEMICOLON_44=(Token)match(input,RULE_SEMICOLON,FOLLOW_9); 

            			newLeafNode(this_SEMICOLON_44, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_44());
            		
            // InternalKPIGenerator.g:512:3: ( (lv_timeEstimated_45_0= RULE_INT ) )
            // InternalKPIGenerator.g:513:4: (lv_timeEstimated_45_0= RULE_INT )
            {
            // InternalKPIGenerator.g:513:4: (lv_timeEstimated_45_0= RULE_INT )
            // InternalKPIGenerator.g:514:5: lv_timeEstimated_45_0= RULE_INT
            {
            lv_timeEstimated_45_0=(Token)match(input,RULE_INT,FOLLOW_3); 

            					newLeafNode(lv_timeEstimated_45_0, grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_45_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeEstimated",
            						lv_timeEstimated_45_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            this_SEMICOLON_46=(Token)match(input,RULE_SEMICOLON,FOLLOW_14); 

            			newLeafNode(this_SEMICOLON_46, grammarAccess.getTaskAccess().getSEMICOLONTerminalRuleCall_46());
            		
            // InternalKPIGenerator.g:534:3: ( (lv_tags_47_0= RULE_CADENA ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CADENA) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:535:4: (lv_tags_47_0= RULE_CADENA )
                    {
                    // InternalKPIGenerator.g:535:4: (lv_tags_47_0= RULE_CADENA )
                    // InternalKPIGenerator.g:536:5: lv_tags_47_0= RULE_CADENA
                    {
                    lv_tags_47_0=(Token)match(input,RULE_CADENA,FOLLOW_15); 

                    					newLeafNode(lv_tags_47_0, grammarAccess.getTaskAccess().getTagsCADENATerminalRuleCall_47_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTaskRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"tags",
                    						lv_tags_47_0,
                    						"co.edu.uniandes.KPIGenerator.CADENA");
                    				

                    }


                    }
                    break;

            }

            this_NEWLINE_48=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

            			newLeafNode(this_NEWLINE_48, grammarAccess.getTaskAccess().getNEWLINETerminalRuleCall_48());
            		

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
    // InternalKPIGenerator.g:560:1: entryRuleStatus returns [EObject current=null] : iv_ruleStatus= ruleStatus EOF ;
    public final EObject entryRuleStatus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatus = null;


        try {
            // InternalKPIGenerator.g:560:47: (iv_ruleStatus= ruleStatus EOF )
            // InternalKPIGenerator.g:561:2: iv_ruleStatus= ruleStatus EOF
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
    // InternalKPIGenerator.g:567:1: ruleStatus returns [EObject current=null] : ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) ) ;
    public final EObject ruleStatus() throws RecognitionException {
        EObject current = null;

        Token lv_statusName_0_1=null;
        Token lv_statusName_0_2=null;
        Token this_SEMICOLON_1=null;
        Token lv_text_2_0=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:573:2: ( ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) ) )
            // InternalKPIGenerator.g:574:2: ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) )
            {
            // InternalKPIGenerator.g:574:2: ( ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) ) )
            // InternalKPIGenerator.g:575:3: ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) ) this_SEMICOLON_1= RULE_SEMICOLON ( (lv_text_2_0= RULE_CADENA ) )
            {
            // InternalKPIGenerator.g:575:3: ( ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) ) )
            // InternalKPIGenerator.g:576:4: ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) )
            {
            // InternalKPIGenerator.g:576:4: ( (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' ) )
            // InternalKPIGenerator.g:577:5: (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' )
            {
            // InternalKPIGenerator.g:577:5: (lv_statusName_0_1= 'completed' | lv_statusName_0_2= 'new' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:578:6: lv_statusName_0_1= 'completed'
                    {
                    lv_statusName_0_1=(Token)match(input,16,FOLLOW_3); 

                    						newLeafNode(lv_statusName_0_1, grammarAccess.getStatusAccess().getStatusNameCompletedKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatusRule());
                    						}
                    						setWithLastConsumed(current, "statusName", lv_statusName_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:589:6: lv_statusName_0_2= 'new'
                    {
                    lv_statusName_0_2=(Token)match(input,17,FOLLOW_3); 

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

            this_SEMICOLON_1=(Token)match(input,RULE_SEMICOLON,FOLLOW_4); 

            			newLeafNode(this_SEMICOLON_1, grammarAccess.getStatusAccess().getSEMICOLONTerminalRuleCall_1());
            		
            // InternalKPIGenerator.g:606:3: ( (lv_text_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:607:4: (lv_text_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:607:4: (lv_text_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:608:5: lv_text_2_0= RULE_CADENA
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
    // InternalKPIGenerator.g:628:1: entryRuleBOOL returns [EObject current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final EObject entryRuleBOOL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBOOL = null;


        try {
            // InternalKPIGenerator.g:628:45: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalKPIGenerator.g:629:2: iv_ruleBOOL= ruleBOOL EOF
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
    // InternalKPIGenerator.g:635:1: ruleBOOL returns [EObject current=null] : ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) ) ;
    public final EObject ruleBOOL() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:641:2: ( ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) ) )
            // InternalKPIGenerator.g:642:2: ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) )
            {
            // InternalKPIGenerator.g:642:2: ( () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' ) )
            // InternalKPIGenerator.g:643:3: () (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' )
            {
            // InternalKPIGenerator.g:643:3: ()
            // InternalKPIGenerator.g:644:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBOOLAccess().getBOOLAction_0(),
            					current);
            			

            }

            // InternalKPIGenerator.g:650:3: (otherlv_1= 'FALSO' | otherlv_2= 'VERDADERO' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIGenerator.g:651:4: otherlv_1= 'FALSO'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getBOOLAccess().getFALSOKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:656:4: otherlv_2= 'VERDADERO'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});

}
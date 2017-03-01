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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CADENA", "RULE_INT", "RULE_DOUBLE", "RULE_DATE", "RULE_DATEHOUR", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "']'", "'{\"name\":\"'", "'\",\"phases\":['", "']}'", "','", "'\",\"tasks\":['", "'{\"id\":'", "',\"name\":\"'", "'\",\"useCase\":\"'", "'\",\"sequenceNumber\":'", "',\"description\":\"'", "'-'", "'\",\"startDate\":\"'", "'\",\"dueDate\":\"'", "'\",\"priority\":\"'", "'\",\"isPrivate\":'", "',\"progress\":'", "',\"status\":\"'", "'\",\"statusText\":\"'", "'\",\"assignedTo\":\"'", "'\",\"createdDate\":\"'", "'\",\"completedDate\":\"'", "'\",\"timeLoggedMin\":'", "',\"billableTime\":'", "',\"completedOnTime\":'", "',\"timeEstimated\":'", "'}'"
    };
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DATEHOUR=8;
    public static final int RULE_ID=9;
    public static final int RULE_WS=13;
    public static final int RULE_CADENA=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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
    // InternalKPIGenerator.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) )+ otherlv_2= ']' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_projects_1_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:77:2: ( (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) )+ otherlv_2= ']' ) )
            // InternalKPIGenerator.g:78:2: (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) )+ otherlv_2= ']' )
            {
            // InternalKPIGenerator.g:78:2: (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) )+ otherlv_2= ']' )
            // InternalKPIGenerator.g:79:3: otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) )+ otherlv_2= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalKPIGenerator.g:83:3: ( (lv_projects_1_0= ruleProject ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKPIGenerator.g:84:4: (lv_projects_1_0= ruleProject )
            	    {
            	    // InternalKPIGenerator.g:84:4: (lv_projects_1_0= ruleProject )
            	    // InternalKPIGenerator.g:85:5: lv_projects_1_0= ruleProject
            	    {

            	    					newCompositeNode(grammarAccess.getRootAccess().getProjectsProjectParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_projects_1_0=ruleProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRootRule());
            	    					}
            	    					add(
            	    						current,
            	    						"projects",
            	    						lv_projects_1_0,
            	    						"co.edu.uniandes.KPIGenerator.Project");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRootAccess().getRightSquareBracketKeyword_2());
            		

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


    // $ANTLR start "entryRuleProject"
    // InternalKPIGenerator.g:110:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalKPIGenerator.g:110:48: (iv_ruleProject= ruleProject EOF )
            // InternalKPIGenerator.g:111:2: iv_ruleProject= ruleProject EOF
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
    // InternalKPIGenerator.g:117:1: ruleProject returns [EObject current=null] : ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) )+ otherlv_5= ']}' (otherlv_6= ',' )? ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_projectName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_phases_4_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:123:2: ( ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) )+ otherlv_5= ']}' (otherlv_6= ',' )? ) )
            // InternalKPIGenerator.g:124:2: ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) )+ otherlv_5= ']}' (otherlv_6= ',' )? )
            {
            // InternalKPIGenerator.g:124:2: ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) )+ otherlv_5= ']}' (otherlv_6= ',' )? )
            // InternalKPIGenerator.g:125:3: () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) )+ otherlv_5= ']}' (otherlv_6= ',' )?
            {
            // InternalKPIGenerator.g:125:3: ()
            // InternalKPIGenerator.g:126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getNameKeyword_1());
            		
            // InternalKPIGenerator.g:136:3: ( (lv_projectName_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:137:4: (lv_projectName_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:137:4: (lv_projectName_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:138:5: lv_projectName_2_0= RULE_CADENA
            {
            lv_projectName_2_0=(Token)match(input,RULE_CADENA,FOLLOW_6); 

            					newLeafNode(lv_projectName_2_0, grammarAccess.getProjectAccess().getProjectNameCADENATerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"projectName",
            						lv_projectName_2_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getPhasesKeyword_3());
            		
            // InternalKPIGenerator.g:158:3: ( (lv_phases_4_0= rulePhase ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKPIGenerator.g:159:4: (lv_phases_4_0= rulePhase )
            	    {
            	    // InternalKPIGenerator.g:159:4: (lv_phases_4_0= rulePhase )
            	    // InternalKPIGenerator.g:160:5: lv_phases_4_0= rulePhase
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_phases_4_0=rulePhase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"phases",
            	    						lv_phases_4_0,
            	    						"co.edu.uniandes.KPIGenerator.Phase");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_5());
            		
            // InternalKPIGenerator.g:181:3: (otherlv_6= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:182:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getCommaKeyword_6());
                    			

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRulePhase"
    // InternalKPIGenerator.g:191:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalKPIGenerator.g:191:46: (iv_rulePhase= rulePhase EOF )
            // InternalKPIGenerator.g:192:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
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
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalKPIGenerator.g:198:1: rulePhase returns [EObject current=null] : ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) )+ otherlv_5= ']}' (otherlv_6= ',' )? ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_phaseName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_tasks_4_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:204:2: ( ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) )+ otherlv_5= ']}' (otherlv_6= ',' )? ) )
            // InternalKPIGenerator.g:205:2: ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) )+ otherlv_5= ']}' (otherlv_6= ',' )? )
            {
            // InternalKPIGenerator.g:205:2: ( () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) )+ otherlv_5= ']}' (otherlv_6= ',' )? )
            // InternalKPIGenerator.g:206:3: () otherlv_1= '{\"name\":\"' ( (lv_phaseName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"tasks\":[' ( (lv_tasks_4_0= ruleTask ) )+ otherlv_5= ']}' (otherlv_6= ',' )?
            {
            // InternalKPIGenerator.g:206:3: ()
            // InternalKPIGenerator.g:207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhaseAccess().getPhaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getNameKeyword_1());
            		
            // InternalKPIGenerator.g:217:3: ( (lv_phaseName_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:218:4: (lv_phaseName_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:218:4: (lv_phaseName_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:219:5: lv_phaseName_2_0= RULE_CADENA
            {
            lv_phaseName_2_0=(Token)match(input,RULE_CADENA,FOLLOW_9); 

            					newLeafNode(lv_phaseName_2_0, grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phaseName",
            						lv_phaseName_2_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPhaseAccess().getTasksKeyword_3());
            		
            // InternalKPIGenerator.g:239:3: ( (lv_tasks_4_0= ruleTask ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIGenerator.g:240:4: (lv_tasks_4_0= ruleTask )
            	    {
            	    // InternalKPIGenerator.g:240:4: (lv_tasks_4_0= ruleTask )
            	    // InternalKPIGenerator.g:241:5: lv_tasks_4_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_tasks_4_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPhaseRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_4_0,
            	    						"co.edu.uniandes.KPIGenerator.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_5());
            		
            // InternalKPIGenerator.g:262:3: (otherlv_6= ',' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:263:4: otherlv_6= ','
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getCommaKeyword_6());
                    			

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
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleTask"
    // InternalKPIGenerator.g:272:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalKPIGenerator.g:272:45: (iv_ruleTask= ruleTask EOF )
            // InternalKPIGenerator.g:273:2: iv_ruleTask= ruleTask EOF
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
    // InternalKPIGenerator.g:279:1: ruleTask returns [EObject current=null] : ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"description\":\"' (this_CADENA_10= RULE_CADENA | otherlv_11= '-' ) otherlv_12= '\",\"startDate\":\"' ( (lv_startDate_13_0= RULE_DATE ) ) otherlv_14= '\",\"dueDate\":\"' ( (lv_dueDate_15_0= RULE_DATE ) ) otherlv_16= '\",\"priority\":\"' ( ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) ) ) otherlv_18= '\",\"isPrivate\":' ( (lv_isPrivate_19_0= RULE_CADENA ) ) otherlv_20= ',\"progress\":' ( (lv_progress_21_0= RULE_INT ) ) otherlv_22= ',\"status\":\"' ( (lv_statusName_23_0= RULE_CADENA ) ) otherlv_24= '\",\"statusText\":\"' ( (lv_statusText_25_0= RULE_CADENA ) ) otherlv_26= '\",\"assignedTo\":\"' ( (lv_assignedTo_27_0= RULE_CADENA ) ) otherlv_28= '\",\"createdDate\":\"' ( (lv_createdDate_29_0= RULE_DATEHOUR ) ) otherlv_30= '\",\"completedDate\":\"' ( ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) ) ) otherlv_32= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_33_0= RULE_INT ) ) otherlv_34= ',\"billableTime\":' ( (lv_billableTime_35_0= RULE_INT ) ) otherlv_36= ',\"completedOnTime\":' ( (lv_completedOnTime_37_0= RULE_CADENA ) ) otherlv_38= ',\"timeEstimated\":' ( (lv_timeEstimated_39_0= RULE_INT ) ) otherlv_40= '}' (otherlv_41= ',' )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_taskId_2_0=null;
        Token otherlv_3=null;
        Token lv_taskName_4_0=null;
        Token otherlv_5=null;
        Token lv_useCase_6_0=null;
        Token otherlv_7=null;
        Token lv_sequenceNumber_8_0=null;
        Token otherlv_9=null;
        Token this_CADENA_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_startDate_13_0=null;
        Token otherlv_14=null;
        Token lv_dueDate_15_0=null;
        Token otherlv_16=null;
        Token lv_priority_17_1=null;
        Token lv_priority_17_2=null;
        Token otherlv_18=null;
        Token lv_isPrivate_19_0=null;
        Token otherlv_20=null;
        Token lv_progress_21_0=null;
        Token otherlv_22=null;
        Token lv_statusName_23_0=null;
        Token otherlv_24=null;
        Token lv_statusText_25_0=null;
        Token otherlv_26=null;
        Token lv_assignedTo_27_0=null;
        Token otherlv_28=null;
        Token lv_createdDate_29_0=null;
        Token otherlv_30=null;
        Token lv_completedDate_31_1=null;
        Token lv_completedDate_31_2=null;
        Token otherlv_32=null;
        Token lv_timeLoggedMin_33_0=null;
        Token otherlv_34=null;
        Token lv_billableTime_35_0=null;
        Token otherlv_36=null;
        Token lv_completedOnTime_37_0=null;
        Token otherlv_38=null;
        Token lv_timeEstimated_39_0=null;
        Token otherlv_40=null;
        Token otherlv_41=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:285:2: ( ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"description\":\"' (this_CADENA_10= RULE_CADENA | otherlv_11= '-' ) otherlv_12= '\",\"startDate\":\"' ( (lv_startDate_13_0= RULE_DATE ) ) otherlv_14= '\",\"dueDate\":\"' ( (lv_dueDate_15_0= RULE_DATE ) ) otherlv_16= '\",\"priority\":\"' ( ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) ) ) otherlv_18= '\",\"isPrivate\":' ( (lv_isPrivate_19_0= RULE_CADENA ) ) otherlv_20= ',\"progress\":' ( (lv_progress_21_0= RULE_INT ) ) otherlv_22= ',\"status\":\"' ( (lv_statusName_23_0= RULE_CADENA ) ) otherlv_24= '\",\"statusText\":\"' ( (lv_statusText_25_0= RULE_CADENA ) ) otherlv_26= '\",\"assignedTo\":\"' ( (lv_assignedTo_27_0= RULE_CADENA ) ) otherlv_28= '\",\"createdDate\":\"' ( (lv_createdDate_29_0= RULE_DATEHOUR ) ) otherlv_30= '\",\"completedDate\":\"' ( ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) ) ) otherlv_32= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_33_0= RULE_INT ) ) otherlv_34= ',\"billableTime\":' ( (lv_billableTime_35_0= RULE_INT ) ) otherlv_36= ',\"completedOnTime\":' ( (lv_completedOnTime_37_0= RULE_CADENA ) ) otherlv_38= ',\"timeEstimated\":' ( (lv_timeEstimated_39_0= RULE_INT ) ) otherlv_40= '}' (otherlv_41= ',' )? ) )
            // InternalKPIGenerator.g:286:2: ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"description\":\"' (this_CADENA_10= RULE_CADENA | otherlv_11= '-' ) otherlv_12= '\",\"startDate\":\"' ( (lv_startDate_13_0= RULE_DATE ) ) otherlv_14= '\",\"dueDate\":\"' ( (lv_dueDate_15_0= RULE_DATE ) ) otherlv_16= '\",\"priority\":\"' ( ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) ) ) otherlv_18= '\",\"isPrivate\":' ( (lv_isPrivate_19_0= RULE_CADENA ) ) otherlv_20= ',\"progress\":' ( (lv_progress_21_0= RULE_INT ) ) otherlv_22= ',\"status\":\"' ( (lv_statusName_23_0= RULE_CADENA ) ) otherlv_24= '\",\"statusText\":\"' ( (lv_statusText_25_0= RULE_CADENA ) ) otherlv_26= '\",\"assignedTo\":\"' ( (lv_assignedTo_27_0= RULE_CADENA ) ) otherlv_28= '\",\"createdDate\":\"' ( (lv_createdDate_29_0= RULE_DATEHOUR ) ) otherlv_30= '\",\"completedDate\":\"' ( ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) ) ) otherlv_32= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_33_0= RULE_INT ) ) otherlv_34= ',\"billableTime\":' ( (lv_billableTime_35_0= RULE_INT ) ) otherlv_36= ',\"completedOnTime\":' ( (lv_completedOnTime_37_0= RULE_CADENA ) ) otherlv_38= ',\"timeEstimated\":' ( (lv_timeEstimated_39_0= RULE_INT ) ) otherlv_40= '}' (otherlv_41= ',' )? )
            {
            // InternalKPIGenerator.g:286:2: ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"description\":\"' (this_CADENA_10= RULE_CADENA | otherlv_11= '-' ) otherlv_12= '\",\"startDate\":\"' ( (lv_startDate_13_0= RULE_DATE ) ) otherlv_14= '\",\"dueDate\":\"' ( (lv_dueDate_15_0= RULE_DATE ) ) otherlv_16= '\",\"priority\":\"' ( ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) ) ) otherlv_18= '\",\"isPrivate\":' ( (lv_isPrivate_19_0= RULE_CADENA ) ) otherlv_20= ',\"progress\":' ( (lv_progress_21_0= RULE_INT ) ) otherlv_22= ',\"status\":\"' ( (lv_statusName_23_0= RULE_CADENA ) ) otherlv_24= '\",\"statusText\":\"' ( (lv_statusText_25_0= RULE_CADENA ) ) otherlv_26= '\",\"assignedTo\":\"' ( (lv_assignedTo_27_0= RULE_CADENA ) ) otherlv_28= '\",\"createdDate\":\"' ( (lv_createdDate_29_0= RULE_DATEHOUR ) ) otherlv_30= '\",\"completedDate\":\"' ( ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) ) ) otherlv_32= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_33_0= RULE_INT ) ) otherlv_34= ',\"billableTime\":' ( (lv_billableTime_35_0= RULE_INT ) ) otherlv_36= ',\"completedOnTime\":' ( (lv_completedOnTime_37_0= RULE_CADENA ) ) otherlv_38= ',\"timeEstimated\":' ( (lv_timeEstimated_39_0= RULE_INT ) ) otherlv_40= '}' (otherlv_41= ',' )? )
            // InternalKPIGenerator.g:287:3: () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"description\":\"' (this_CADENA_10= RULE_CADENA | otherlv_11= '-' ) otherlv_12= '\",\"startDate\":\"' ( (lv_startDate_13_0= RULE_DATE ) ) otherlv_14= '\",\"dueDate\":\"' ( (lv_dueDate_15_0= RULE_DATE ) ) otherlv_16= '\",\"priority\":\"' ( ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) ) ) otherlv_18= '\",\"isPrivate\":' ( (lv_isPrivate_19_0= RULE_CADENA ) ) otherlv_20= ',\"progress\":' ( (lv_progress_21_0= RULE_INT ) ) otherlv_22= ',\"status\":\"' ( (lv_statusName_23_0= RULE_CADENA ) ) otherlv_24= '\",\"statusText\":\"' ( (lv_statusText_25_0= RULE_CADENA ) ) otherlv_26= '\",\"assignedTo\":\"' ( (lv_assignedTo_27_0= RULE_CADENA ) ) otherlv_28= '\",\"createdDate\":\"' ( (lv_createdDate_29_0= RULE_DATEHOUR ) ) otherlv_30= '\",\"completedDate\":\"' ( ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) ) ) otherlv_32= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_33_0= RULE_INT ) ) otherlv_34= ',\"billableTime\":' ( (lv_billableTime_35_0= RULE_INT ) ) otherlv_36= ',\"completedOnTime\":' ( (lv_completedOnTime_37_0= RULE_CADENA ) ) otherlv_38= ',\"timeEstimated\":' ( (lv_timeEstimated_39_0= RULE_INT ) ) otherlv_40= '}' (otherlv_41= ',' )?
            {
            // InternalKPIGenerator.g:287:3: ()
            // InternalKPIGenerator.g:288:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getIdKeyword_1());
            		
            // InternalKPIGenerator.g:298:3: ( (lv_taskId_2_0= RULE_INT ) )
            // InternalKPIGenerator.g:299:4: (lv_taskId_2_0= RULE_INT )
            {
            // InternalKPIGenerator.g:299:4: (lv_taskId_2_0= RULE_INT )
            // InternalKPIGenerator.g:300:5: lv_taskId_2_0= RULE_INT
            {
            lv_taskId_2_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_taskId_2_0, grammarAccess.getTaskAccess().getTaskIdINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskId",
            						lv_taskId_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getNameKeyword_3());
            		
            // InternalKPIGenerator.g:320:3: ( (lv_taskName_4_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:321:4: (lv_taskName_4_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:321:4: (lv_taskName_4_0= RULE_CADENA )
            // InternalKPIGenerator.g:322:5: lv_taskName_4_0= RULE_CADENA
            {
            lv_taskName_4_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

            					newLeafNode(lv_taskName_4_0, grammarAccess.getTaskAccess().getTaskNameCADENATerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"taskName",
            						lv_taskName_4_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getUseCaseKeyword_5());
            		
            // InternalKPIGenerator.g:342:3: ( (lv_useCase_6_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:343:4: (lv_useCase_6_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:343:4: (lv_useCase_6_0= RULE_CADENA )
            // InternalKPIGenerator.g:344:5: lv_useCase_6_0= RULE_CADENA
            {
            lv_useCase_6_0=(Token)match(input,RULE_CADENA,FOLLOW_15); 

            					newLeafNode(lv_useCase_6_0, grammarAccess.getTaskAccess().getUseCaseCADENATerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"useCase",
            						lv_useCase_6_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSequenceNumberKeyword_7());
            		
            // InternalKPIGenerator.g:364:3: ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) )
            // InternalKPIGenerator.g:365:4: (lv_sequenceNumber_8_0= RULE_DOUBLE )
            {
            // InternalKPIGenerator.g:365:4: (lv_sequenceNumber_8_0= RULE_DOUBLE )
            // InternalKPIGenerator.g:366:5: lv_sequenceNumber_8_0= RULE_DOUBLE
            {
            lv_sequenceNumber_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_17); 

            					newLeafNode(lv_sequenceNumber_8_0, grammarAccess.getTaskAccess().getSequenceNumberDOUBLETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sequenceNumber",
            						lv_sequenceNumber_8_0,
            						"co.edu.uniandes.KPIGenerator.DOUBLE");
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getDescriptionKeyword_9());
            		
            // InternalKPIGenerator.g:386:3: (this_CADENA_10= RULE_CADENA | otherlv_11= '-' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_CADENA) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:387:4: this_CADENA_10= RULE_CADENA
                    {
                    this_CADENA_10=(Token)match(input,RULE_CADENA,FOLLOW_19); 

                    				newLeafNode(this_CADENA_10, grammarAccess.getTaskAccess().getCADENATerminalRuleCall_10_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:392:4: otherlv_11= '-'
                    {
                    otherlv_11=(Token)match(input,27,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getHyphenMinusKeyword_10_1());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getStartDateKeyword_11());
            		
            // InternalKPIGenerator.g:401:3: ( (lv_startDate_13_0= RULE_DATE ) )
            // InternalKPIGenerator.g:402:4: (lv_startDate_13_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:402:4: (lv_startDate_13_0= RULE_DATE )
            // InternalKPIGenerator.g:403:5: lv_startDate_13_0= RULE_DATE
            {
            lv_startDate_13_0=(Token)match(input,RULE_DATE,FOLLOW_21); 

            					newLeafNode(lv_startDate_13_0, grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startDate",
            						lv_startDate_13_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            otherlv_14=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getDueDateKeyword_13());
            		
            // InternalKPIGenerator.g:423:3: ( (lv_dueDate_15_0= RULE_DATE ) )
            // InternalKPIGenerator.g:424:4: (lv_dueDate_15_0= RULE_DATE )
            {
            // InternalKPIGenerator.g:424:4: (lv_dueDate_15_0= RULE_DATE )
            // InternalKPIGenerator.g:425:5: lv_dueDate_15_0= RULE_DATE
            {
            lv_dueDate_15_0=(Token)match(input,RULE_DATE,FOLLOW_22); 

            					newLeafNode(lv_dueDate_15_0, grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dueDate",
            						lv_dueDate_15_0,
            						"co.edu.uniandes.KPIGenerator.DATE");
            				

            }


            }

            otherlv_16=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getPriorityKeyword_15());
            		
            // InternalKPIGenerator.g:445:3: ( ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) ) )
            // InternalKPIGenerator.g:446:4: ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) )
            {
            // InternalKPIGenerator.g:446:4: ( (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' ) )
            // InternalKPIGenerator.g:447:5: (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' )
            {
            // InternalKPIGenerator.g:447:5: (lv_priority_17_1= RULE_CADENA | lv_priority_17_2= '-' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CADENA) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:448:6: lv_priority_17_1= RULE_CADENA
                    {
                    lv_priority_17_1=(Token)match(input,RULE_CADENA,FOLLOW_23); 

                    						newLeafNode(lv_priority_17_1, grammarAccess.getTaskAccess().getPriorityCADENATerminalRuleCall_16_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_17_1,
                    							"co.edu.uniandes.KPIGenerator.CADENA");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:463:6: lv_priority_17_2= '-'
                    {
                    lv_priority_17_2=(Token)match(input,27,FOLLOW_23); 

                    						newLeafNode(lv_priority_17_2, grammarAccess.getTaskAccess().getPriorityHyphenMinusKeyword_16_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "priority", lv_priority_17_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_18=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getIsPrivateKeyword_17());
            		
            // InternalKPIGenerator.g:480:3: ( (lv_isPrivate_19_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:481:4: (lv_isPrivate_19_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:481:4: (lv_isPrivate_19_0= RULE_CADENA )
            // InternalKPIGenerator.g:482:5: lv_isPrivate_19_0= RULE_CADENA
            {
            lv_isPrivate_19_0=(Token)match(input,RULE_CADENA,FOLLOW_24); 

            					newLeafNode(lv_isPrivate_19_0, grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isPrivate",
            						lv_isPrivate_19_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_20=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_20, grammarAccess.getTaskAccess().getProgressKeyword_19());
            		
            // InternalKPIGenerator.g:502:3: ( (lv_progress_21_0= RULE_INT ) )
            // InternalKPIGenerator.g:503:4: (lv_progress_21_0= RULE_INT )
            {
            // InternalKPIGenerator.g:503:4: (lv_progress_21_0= RULE_INT )
            // InternalKPIGenerator.g:504:5: lv_progress_21_0= RULE_INT
            {
            lv_progress_21_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_progress_21_0, grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"progress",
            						lv_progress_21_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_22=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_22, grammarAccess.getTaskAccess().getStatusKeyword_21());
            		
            // InternalKPIGenerator.g:524:3: ( (lv_statusName_23_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:525:4: (lv_statusName_23_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:525:4: (lv_statusName_23_0= RULE_CADENA )
            // InternalKPIGenerator.g:526:5: lv_statusName_23_0= RULE_CADENA
            {
            lv_statusName_23_0=(Token)match(input,RULE_CADENA,FOLLOW_26); 

            					newLeafNode(lv_statusName_23_0, grammarAccess.getTaskAccess().getStatusNameCADENATerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"statusName",
            						lv_statusName_23_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_24=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getStatusTextKeyword_23());
            		
            // InternalKPIGenerator.g:546:3: ( (lv_statusText_25_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:547:4: (lv_statusText_25_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:547:4: (lv_statusText_25_0= RULE_CADENA )
            // InternalKPIGenerator.g:548:5: lv_statusText_25_0= RULE_CADENA
            {
            lv_statusText_25_0=(Token)match(input,RULE_CADENA,FOLLOW_27); 

            					newLeafNode(lv_statusText_25_0, grammarAccess.getTaskAccess().getStatusTextCADENATerminalRuleCall_24_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"statusText",
            						lv_statusText_25_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_26=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_26, grammarAccess.getTaskAccess().getAssignedToKeyword_25());
            		
            // InternalKPIGenerator.g:568:3: ( (lv_assignedTo_27_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:569:4: (lv_assignedTo_27_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:569:4: (lv_assignedTo_27_0= RULE_CADENA )
            // InternalKPIGenerator.g:570:5: lv_assignedTo_27_0= RULE_CADENA
            {
            lv_assignedTo_27_0=(Token)match(input,RULE_CADENA,FOLLOW_28); 

            					newLeafNode(lv_assignedTo_27_0, grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_26_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assignedTo",
            						lv_assignedTo_27_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_28=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_28, grammarAccess.getTaskAccess().getCreatedDateKeyword_27());
            		
            // InternalKPIGenerator.g:590:3: ( (lv_createdDate_29_0= RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:591:4: (lv_createdDate_29_0= RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:591:4: (lv_createdDate_29_0= RULE_DATEHOUR )
            // InternalKPIGenerator.g:592:5: lv_createdDate_29_0= RULE_DATEHOUR
            {
            lv_createdDate_29_0=(Token)match(input,RULE_DATEHOUR,FOLLOW_30); 

            					newLeafNode(lv_createdDate_29_0, grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_28_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdDate",
            						lv_createdDate_29_0,
            						"co.edu.uniandes.KPIGenerator.DATEHOUR");
            				

            }


            }

            otherlv_30=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_30, grammarAccess.getTaskAccess().getCompletedDateKeyword_29());
            		
            // InternalKPIGenerator.g:612:3: ( ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) ) )
            // InternalKPIGenerator.g:613:4: ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) )
            {
            // InternalKPIGenerator.g:613:4: ( (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' ) )
            // InternalKPIGenerator.g:614:5: (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' )
            {
            // InternalKPIGenerator.g:614:5: (lv_completedDate_31_1= RULE_DATEHOUR | lv_completedDate_31_2= '-' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DATEHOUR) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalKPIGenerator.g:615:6: lv_completedDate_31_1= RULE_DATEHOUR
                    {
                    lv_completedDate_31_1=(Token)match(input,RULE_DATEHOUR,FOLLOW_32); 

                    						newLeafNode(lv_completedDate_31_1, grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_30_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"completedDate",
                    							lv_completedDate_31_1,
                    							"co.edu.uniandes.KPIGenerator.DATEHOUR");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:630:6: lv_completedDate_31_2= '-'
                    {
                    lv_completedDate_31_2=(Token)match(input,27,FOLLOW_32); 

                    						newLeafNode(lv_completedDate_31_2, grammarAccess.getTaskAccess().getCompletedDateHyphenMinusKeyword_30_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "completedDate", lv_completedDate_31_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_32=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_32, grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_31());
            		
            // InternalKPIGenerator.g:647:3: ( (lv_timeLoggedMin_33_0= RULE_INT ) )
            // InternalKPIGenerator.g:648:4: (lv_timeLoggedMin_33_0= RULE_INT )
            {
            // InternalKPIGenerator.g:648:4: (lv_timeLoggedMin_33_0= RULE_INT )
            // InternalKPIGenerator.g:649:5: lv_timeLoggedMin_33_0= RULE_INT
            {
            lv_timeLoggedMin_33_0=(Token)match(input,RULE_INT,FOLLOW_33); 

            					newLeafNode(lv_timeLoggedMin_33_0, grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_32_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeLoggedMin",
            						lv_timeLoggedMin_33_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_34=(Token)match(input,39,FOLLOW_12); 

            			newLeafNode(otherlv_34, grammarAccess.getTaskAccess().getBillableTimeKeyword_33());
            		
            // InternalKPIGenerator.g:669:3: ( (lv_billableTime_35_0= RULE_INT ) )
            // InternalKPIGenerator.g:670:4: (lv_billableTime_35_0= RULE_INT )
            {
            // InternalKPIGenerator.g:670:4: (lv_billableTime_35_0= RULE_INT )
            // InternalKPIGenerator.g:671:5: lv_billableTime_35_0= RULE_INT
            {
            lv_billableTime_35_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_billableTime_35_0, grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_34_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"billableTime",
            						lv_billableTime_35_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_36=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_36, grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_35());
            		
            // InternalKPIGenerator.g:691:3: ( (lv_completedOnTime_37_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:692:4: (lv_completedOnTime_37_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:692:4: (lv_completedOnTime_37_0= RULE_CADENA )
            // InternalKPIGenerator.g:693:5: lv_completedOnTime_37_0= RULE_CADENA
            {
            lv_completedOnTime_37_0=(Token)match(input,RULE_CADENA,FOLLOW_35); 

            					newLeafNode(lv_completedOnTime_37_0, grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_36_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedOnTime",
            						lv_completedOnTime_37_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_38=(Token)match(input,41,FOLLOW_12); 

            			newLeafNode(otherlv_38, grammarAccess.getTaskAccess().getTimeEstimatedKeyword_37());
            		
            // InternalKPIGenerator.g:713:3: ( (lv_timeEstimated_39_0= RULE_INT ) )
            // InternalKPIGenerator.g:714:4: (lv_timeEstimated_39_0= RULE_INT )
            {
            // InternalKPIGenerator.g:714:4: (lv_timeEstimated_39_0= RULE_INT )
            // InternalKPIGenerator.g:715:5: lv_timeEstimated_39_0= RULE_INT
            {
            lv_timeEstimated_39_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            					newLeafNode(lv_timeEstimated_39_0, grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_38_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeEstimated",
            						lv_timeEstimated_39_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_40=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_40, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_39());
            		
            // InternalKPIGenerator.g:735:3: (otherlv_41= ',' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalKPIGenerator.g:736:4: otherlv_41= ','
                    {
                    otherlv_41=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_41, grammarAccess.getTaskAccess().getCommaKeyword_40());
                    			

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
    // $ANTLR end "ruleTask"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});

}
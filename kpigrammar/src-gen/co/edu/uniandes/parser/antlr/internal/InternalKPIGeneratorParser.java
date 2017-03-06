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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_CADENA", "RULE_INT", "RULE_DOUBLE", "RULE_DATE", "RULE_DATEHOUR", "RULE_SPACE", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "','", "']'", "'{\"name\":\"'", "'\",\"phases\":['", "']}'", "'\",\"tasks\":['", "'{\"id\":'", "',\"name\":\"'", "'\",\"useCase\":\"'", "'\",\"sequenceNumber\":'", "',\"startDate\":\"'", "'-'", "'\",\"dueDate\":\"'", "'\",\"isPrivate\":'", "',\"progress\":'", "',\"status\":\"'", "'\",\"statusText\":\"'", "'\",\"assignedTo\":\"'", "'\",\"createdDate\":\"'", "'\",\"completedDate\":\"'", "'\",\"timeLoggedMin\":'", "',\"billableTime\":'", "',\"completedOnTime\":'", "',\"timeEstimated\":'", "',\"isReprocessedTask\":'", "',\"idParentTask\":'", "'}'"
    };
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_SPACE=9;
    public static final int RULE_ID=10;
    public static final int RULE_DATE=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DATEHOUR=8;
    public static final int RULE_WS=14;
    public static final int RULE_CADENA=4;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalKPIGenerator.g:71:1: ruleRoot returns [EObject current=null] : (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) (otherlv_2= ',' ( (lv_projects_3_0= ruleProject ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_projects_1_0 = null;

        EObject lv_projects_3_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:77:2: ( (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) (otherlv_2= ',' ( (lv_projects_3_0= ruleProject ) ) )* otherlv_4= ']' ) )
            // InternalKPIGenerator.g:78:2: (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) (otherlv_2= ',' ( (lv_projects_3_0= ruleProject ) ) )* otherlv_4= ']' )
            {
            // InternalKPIGenerator.g:78:2: (otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) (otherlv_2= ',' ( (lv_projects_3_0= ruleProject ) ) )* otherlv_4= ']' )
            // InternalKPIGenerator.g:79:3: otherlv_0= '[' ( (lv_projects_1_0= ruleProject ) ) (otherlv_2= ',' ( (lv_projects_3_0= ruleProject ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalKPIGenerator.g:83:3: ( (lv_projects_1_0= ruleProject ) )
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

            // InternalKPIGenerator.g:102:3: (otherlv_2= ',' ( (lv_projects_3_0= ruleProject ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalKPIGenerator.g:103:4: otherlv_2= ',' ( (lv_projects_3_0= ruleProject ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalKPIGenerator.g:107:4: ( (lv_projects_3_0= ruleProject ) )
            	    // InternalKPIGenerator.g:108:5: (lv_projects_3_0= ruleProject )
            	    {
            	    // InternalKPIGenerator.g:108:5: (lv_projects_3_0= ruleProject )
            	    // InternalKPIGenerator.g:109:6: lv_projects_3_0= ruleProject
            	    {

            	    						newCompositeNode(grammarAccess.getRootAccess().getProjectsProjectParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_projects_3_0=ruleProject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"projects",
            	    							lv_projects_3_0,
            	    							"co.edu.uniandes.KPIGenerator.Project");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRootAccess().getRightSquareBracketKeyword_3());
            		

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
    // InternalKPIGenerator.g:135:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalKPIGenerator.g:135:48: (iv_ruleProject= ruleProject EOF )
            // InternalKPIGenerator.g:136:2: iv_ruleProject= ruleProject EOF
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
    // InternalKPIGenerator.g:142:1: ruleProject returns [EObject current=null] : ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) (otherlv_5= ',' ( (lv_phases_6_0= rulePhase ) ) )* otherlv_7= ']}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_projectName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_phases_4_0 = null;

        EObject lv_phases_6_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:148:2: ( ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) (otherlv_5= ',' ( (lv_phases_6_0= rulePhase ) ) )* otherlv_7= ']}' ) )
            // InternalKPIGenerator.g:149:2: ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) (otherlv_5= ',' ( (lv_phases_6_0= rulePhase ) ) )* otherlv_7= ']}' )
            {
            // InternalKPIGenerator.g:149:2: ( () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) (otherlv_5= ',' ( (lv_phases_6_0= rulePhase ) ) )* otherlv_7= ']}' )
            // InternalKPIGenerator.g:150:3: () otherlv_1= '{\"name\":\"' ( (lv_projectName_2_0= RULE_CADENA ) ) otherlv_3= '\",\"phases\":[' ( (lv_phases_4_0= rulePhase ) ) (otherlv_5= ',' ( (lv_phases_6_0= rulePhase ) ) )* otherlv_7= ']}'
            {
            // InternalKPIGenerator.g:150:3: ()
            // InternalKPIGenerator.g:151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProjectAccess().getProjectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getProjectAccess().getNameKeyword_1());
            		
            // InternalKPIGenerator.g:161:3: ( (lv_projectName_2_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:162:4: (lv_projectName_2_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:162:4: (lv_projectName_2_0= RULE_CADENA )
            // InternalKPIGenerator.g:163:5: lv_projectName_2_0= RULE_CADENA
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

            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getProjectAccess().getPhasesKeyword_3());
            		
            // InternalKPIGenerator.g:183:3: ( (lv_phases_4_0= rulePhase ) )
            // InternalKPIGenerator.g:184:4: (lv_phases_4_0= rulePhase )
            {
            // InternalKPIGenerator.g:184:4: (lv_phases_4_0= rulePhase )
            // InternalKPIGenerator.g:185:5: lv_phases_4_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalKPIGenerator.g:202:3: (otherlv_5= ',' ( (lv_phases_6_0= rulePhase ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalKPIGenerator.g:203:4: otherlv_5= ',' ( (lv_phases_6_0= rulePhase ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_7); 

            	    				newLeafNode(otherlv_5, grammarAccess.getProjectAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalKPIGenerator.g:207:4: ( (lv_phases_6_0= rulePhase ) )
            	    // InternalKPIGenerator.g:208:5: (lv_phases_6_0= rulePhase )
            	    {
            	    // InternalKPIGenerator.g:208:5: (lv_phases_6_0= rulePhase )
            	    // InternalKPIGenerator.g:209:6: lv_phases_6_0= rulePhase
            	    {

            	    						newCompositeNode(grammarAccess.getProjectAccess().getPhasesPhaseParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_phases_6_0=rulePhase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"phases",
            	    							lv_phases_6_0,
            	    							"co.edu.uniandes.KPIGenerator.Phase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getProjectAccess().getRightSquareBracketRightCurlyBracketKeyword_6());
            		

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
    // InternalKPIGenerator.g:235:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalKPIGenerator.g:235:46: (iv_rulePhase= rulePhase EOF )
            // InternalKPIGenerator.g:236:2: iv_rulePhase= rulePhase EOF
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
    // InternalKPIGenerator.g:242:1: rulePhase returns [EObject current=null] : ( () (otherlv_1= ',' )? otherlv_2= '{\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_tasks_7_0= ruleTask ) ) )* otherlv_8= ']}' ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_phaseName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_tasks_5_0 = null;

        EObject lv_tasks_7_0 = null;



        	enterRule();

        try {
            // InternalKPIGenerator.g:248:2: ( ( () (otherlv_1= ',' )? otherlv_2= '{\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_tasks_7_0= ruleTask ) ) )* otherlv_8= ']}' ) )
            // InternalKPIGenerator.g:249:2: ( () (otherlv_1= ',' )? otherlv_2= '{\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_tasks_7_0= ruleTask ) ) )* otherlv_8= ']}' )
            {
            // InternalKPIGenerator.g:249:2: ( () (otherlv_1= ',' )? otherlv_2= '{\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_tasks_7_0= ruleTask ) ) )* otherlv_8= ']}' )
            // InternalKPIGenerator.g:250:3: () (otherlv_1= ',' )? otherlv_2= '{\"name\":\"' ( (lv_phaseName_3_0= RULE_CADENA ) ) otherlv_4= '\",\"tasks\":[' ( (lv_tasks_5_0= ruleTask ) ) (otherlv_6= ',' ( (lv_tasks_7_0= ruleTask ) ) )* otherlv_8= ']}'
            {
            // InternalKPIGenerator.g:250:3: ()
            // InternalKPIGenerator.g:251:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPhaseAccess().getPhaseAction_0(),
            					current);
            			

            }

            // InternalKPIGenerator.g:257:3: (otherlv_1= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalKPIGenerator.g:258:4: otherlv_1= ','
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPhaseAccess().getCommaKeyword_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPhaseAccess().getNameKeyword_2());
            		
            // InternalKPIGenerator.g:267:3: ( (lv_phaseName_3_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:268:4: (lv_phaseName_3_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:268:4: (lv_phaseName_3_0= RULE_CADENA )
            // InternalKPIGenerator.g:269:5: lv_phaseName_3_0= RULE_CADENA
            {
            lv_phaseName_3_0=(Token)match(input,RULE_CADENA,FOLLOW_9); 

            					newLeafNode(lv_phaseName_3_0, grammarAccess.getPhaseAccess().getPhaseNameCADENATerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPhaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"phaseName",
            						lv_phaseName_3_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getPhaseAccess().getTasksKeyword_4());
            		
            // InternalKPIGenerator.g:289:3: ( (lv_tasks_5_0= ruleTask ) )
            // InternalKPIGenerator.g:290:4: (lv_tasks_5_0= ruleTask )
            {
            // InternalKPIGenerator.g:290:4: (lv_tasks_5_0= ruleTask )
            // InternalKPIGenerator.g:291:5: lv_tasks_5_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_tasks_5_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPhaseRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_5_0,
            						"co.edu.uniandes.KPIGenerator.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalKPIGenerator.g:308:3: (otherlv_6= ',' ( (lv_tasks_7_0= ruleTask ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalKPIGenerator.g:309:4: otherlv_6= ',' ( (lv_tasks_7_0= ruleTask ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_10); 

            	    				newLeafNode(otherlv_6, grammarAccess.getPhaseAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalKPIGenerator.g:313:4: ( (lv_tasks_7_0= ruleTask ) )
            	    // InternalKPIGenerator.g:314:5: (lv_tasks_7_0= ruleTask )
            	    {
            	    // InternalKPIGenerator.g:314:5: (lv_tasks_7_0= ruleTask )
            	    // InternalKPIGenerator.g:315:6: lv_tasks_7_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getPhaseAccess().getTasksTaskParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_tasks_7_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPhaseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_7_0,
            	    							"co.edu.uniandes.KPIGenerator.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPhaseAccess().getRightSquareBracketRightCurlyBracketKeyword_7());
            		

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
    // InternalKPIGenerator.g:341:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalKPIGenerator.g:341:45: (iv_ruleTask= ruleTask EOF )
            // InternalKPIGenerator.g:342:2: iv_ruleTask= ruleTask EOF
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
    // InternalKPIGenerator.g:348:1: ruleTask returns [EObject current=null] : ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"startDate\":\"' ( ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) ) ) otherlv_11= '\",\"dueDate\":\"' ( ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) ) ) otherlv_13= '\",\"isPrivate\":' ( (lv_isPrivate_14_0= RULE_CADENA ) ) otherlv_15= ',\"progress\":' ( (lv_progress_16_0= RULE_INT ) ) otherlv_17= ',\"status\":\"' ( (lv_statusName_18_0= RULE_CADENA ) ) otherlv_19= '\",\"statusText\":\"' ( (lv_statusText_20_0= RULE_CADENA ) ) otherlv_21= '\",\"assignedTo\":\"' ( (lv_assignedTo_22_0= RULE_CADENA ) ) otherlv_23= '\",\"createdDate\":\"' ( (lv_createdDate_24_0= RULE_DATEHOUR ) ) otherlv_25= '\",\"completedDate\":\"' ( ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) ) ) otherlv_27= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_28_0= RULE_INT ) ) otherlv_29= ',\"billableTime\":' ( (lv_billableTime_30_0= RULE_INT ) ) otherlv_31= ',\"completedOnTime\":' ( (lv_completedOnTime_32_0= RULE_CADENA ) ) otherlv_33= ',\"timeEstimated\":' ( (lv_timeEstimated_34_0= RULE_INT ) ) otherlv_35= ',\"isReprocessedTask\":' ( (lv_isReprocessedTask_36_0= RULE_CADENA ) ) otherlv_37= ',\"idParentTask\":' ( (lv_idParentTask_38_0= RULE_INT ) ) otherlv_39= '}' ) ;
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
        Token lv_startDate_10_1=null;
        Token lv_startDate_10_2=null;
        Token otherlv_11=null;
        Token lv_dueDate_12_1=null;
        Token lv_dueDate_12_2=null;
        Token otherlv_13=null;
        Token lv_isPrivate_14_0=null;
        Token otherlv_15=null;
        Token lv_progress_16_0=null;
        Token otherlv_17=null;
        Token lv_statusName_18_0=null;
        Token otherlv_19=null;
        Token lv_statusText_20_0=null;
        Token otherlv_21=null;
        Token lv_assignedTo_22_0=null;
        Token otherlv_23=null;
        Token lv_createdDate_24_0=null;
        Token otherlv_25=null;
        Token lv_completedDate_26_1=null;
        Token lv_completedDate_26_2=null;
        Token otherlv_27=null;
        Token lv_timeLoggedMin_28_0=null;
        Token otherlv_29=null;
        Token lv_billableTime_30_0=null;
        Token otherlv_31=null;
        Token lv_completedOnTime_32_0=null;
        Token otherlv_33=null;
        Token lv_timeEstimated_34_0=null;
        Token otherlv_35=null;
        Token lv_isReprocessedTask_36_0=null;
        Token otherlv_37=null;
        Token lv_idParentTask_38_0=null;
        Token otherlv_39=null;


        	enterRule();

        try {
            // InternalKPIGenerator.g:354:2: ( ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"startDate\":\"' ( ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) ) ) otherlv_11= '\",\"dueDate\":\"' ( ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) ) ) otherlv_13= '\",\"isPrivate\":' ( (lv_isPrivate_14_0= RULE_CADENA ) ) otherlv_15= ',\"progress\":' ( (lv_progress_16_0= RULE_INT ) ) otherlv_17= ',\"status\":\"' ( (lv_statusName_18_0= RULE_CADENA ) ) otherlv_19= '\",\"statusText\":\"' ( (lv_statusText_20_0= RULE_CADENA ) ) otherlv_21= '\",\"assignedTo\":\"' ( (lv_assignedTo_22_0= RULE_CADENA ) ) otherlv_23= '\",\"createdDate\":\"' ( (lv_createdDate_24_0= RULE_DATEHOUR ) ) otherlv_25= '\",\"completedDate\":\"' ( ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) ) ) otherlv_27= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_28_0= RULE_INT ) ) otherlv_29= ',\"billableTime\":' ( (lv_billableTime_30_0= RULE_INT ) ) otherlv_31= ',\"completedOnTime\":' ( (lv_completedOnTime_32_0= RULE_CADENA ) ) otherlv_33= ',\"timeEstimated\":' ( (lv_timeEstimated_34_0= RULE_INT ) ) otherlv_35= ',\"isReprocessedTask\":' ( (lv_isReprocessedTask_36_0= RULE_CADENA ) ) otherlv_37= ',\"idParentTask\":' ( (lv_idParentTask_38_0= RULE_INT ) ) otherlv_39= '}' ) )
            // InternalKPIGenerator.g:355:2: ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"startDate\":\"' ( ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) ) ) otherlv_11= '\",\"dueDate\":\"' ( ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) ) ) otherlv_13= '\",\"isPrivate\":' ( (lv_isPrivate_14_0= RULE_CADENA ) ) otherlv_15= ',\"progress\":' ( (lv_progress_16_0= RULE_INT ) ) otherlv_17= ',\"status\":\"' ( (lv_statusName_18_0= RULE_CADENA ) ) otherlv_19= '\",\"statusText\":\"' ( (lv_statusText_20_0= RULE_CADENA ) ) otherlv_21= '\",\"assignedTo\":\"' ( (lv_assignedTo_22_0= RULE_CADENA ) ) otherlv_23= '\",\"createdDate\":\"' ( (lv_createdDate_24_0= RULE_DATEHOUR ) ) otherlv_25= '\",\"completedDate\":\"' ( ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) ) ) otherlv_27= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_28_0= RULE_INT ) ) otherlv_29= ',\"billableTime\":' ( (lv_billableTime_30_0= RULE_INT ) ) otherlv_31= ',\"completedOnTime\":' ( (lv_completedOnTime_32_0= RULE_CADENA ) ) otherlv_33= ',\"timeEstimated\":' ( (lv_timeEstimated_34_0= RULE_INT ) ) otherlv_35= ',\"isReprocessedTask\":' ( (lv_isReprocessedTask_36_0= RULE_CADENA ) ) otherlv_37= ',\"idParentTask\":' ( (lv_idParentTask_38_0= RULE_INT ) ) otherlv_39= '}' )
            {
            // InternalKPIGenerator.g:355:2: ( () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"startDate\":\"' ( ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) ) ) otherlv_11= '\",\"dueDate\":\"' ( ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) ) ) otherlv_13= '\",\"isPrivate\":' ( (lv_isPrivate_14_0= RULE_CADENA ) ) otherlv_15= ',\"progress\":' ( (lv_progress_16_0= RULE_INT ) ) otherlv_17= ',\"status\":\"' ( (lv_statusName_18_0= RULE_CADENA ) ) otherlv_19= '\",\"statusText\":\"' ( (lv_statusText_20_0= RULE_CADENA ) ) otherlv_21= '\",\"assignedTo\":\"' ( (lv_assignedTo_22_0= RULE_CADENA ) ) otherlv_23= '\",\"createdDate\":\"' ( (lv_createdDate_24_0= RULE_DATEHOUR ) ) otherlv_25= '\",\"completedDate\":\"' ( ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) ) ) otherlv_27= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_28_0= RULE_INT ) ) otherlv_29= ',\"billableTime\":' ( (lv_billableTime_30_0= RULE_INT ) ) otherlv_31= ',\"completedOnTime\":' ( (lv_completedOnTime_32_0= RULE_CADENA ) ) otherlv_33= ',\"timeEstimated\":' ( (lv_timeEstimated_34_0= RULE_INT ) ) otherlv_35= ',\"isReprocessedTask\":' ( (lv_isReprocessedTask_36_0= RULE_CADENA ) ) otherlv_37= ',\"idParentTask\":' ( (lv_idParentTask_38_0= RULE_INT ) ) otherlv_39= '}' )
            // InternalKPIGenerator.g:356:3: () otherlv_1= '{\"id\":' ( (lv_taskId_2_0= RULE_INT ) ) otherlv_3= ',\"name\":\"' ( (lv_taskName_4_0= RULE_CADENA ) ) otherlv_5= '\",\"useCase\":\"' ( (lv_useCase_6_0= RULE_CADENA ) ) otherlv_7= '\",\"sequenceNumber\":' ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) ) otherlv_9= ',\"startDate\":\"' ( ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) ) ) otherlv_11= '\",\"dueDate\":\"' ( ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) ) ) otherlv_13= '\",\"isPrivate\":' ( (lv_isPrivate_14_0= RULE_CADENA ) ) otherlv_15= ',\"progress\":' ( (lv_progress_16_0= RULE_INT ) ) otherlv_17= ',\"status\":\"' ( (lv_statusName_18_0= RULE_CADENA ) ) otherlv_19= '\",\"statusText\":\"' ( (lv_statusText_20_0= RULE_CADENA ) ) otherlv_21= '\",\"assignedTo\":\"' ( (lv_assignedTo_22_0= RULE_CADENA ) ) otherlv_23= '\",\"createdDate\":\"' ( (lv_createdDate_24_0= RULE_DATEHOUR ) ) otherlv_25= '\",\"completedDate\":\"' ( ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) ) ) otherlv_27= '\",\"timeLoggedMin\":' ( (lv_timeLoggedMin_28_0= RULE_INT ) ) otherlv_29= ',\"billableTime\":' ( (lv_billableTime_30_0= RULE_INT ) ) otherlv_31= ',\"completedOnTime\":' ( (lv_completedOnTime_32_0= RULE_CADENA ) ) otherlv_33= ',\"timeEstimated\":' ( (lv_timeEstimated_34_0= RULE_INT ) ) otherlv_35= ',\"isReprocessedTask\":' ( (lv_isReprocessedTask_36_0= RULE_CADENA ) ) otherlv_37= ',\"idParentTask\":' ( (lv_idParentTask_38_0= RULE_INT ) ) otherlv_39= '}'
            {
            // InternalKPIGenerator.g:356:3: ()
            // InternalKPIGenerator.g:357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskAccess().getTaskAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskAccess().getIdKeyword_1());
            		
            // InternalKPIGenerator.g:367:3: ( (lv_taskId_2_0= RULE_INT ) )
            // InternalKPIGenerator.g:368:4: (lv_taskId_2_0= RULE_INT )
            {
            // InternalKPIGenerator.g:368:4: (lv_taskId_2_0= RULE_INT )
            // InternalKPIGenerator.g:369:5: lv_taskId_2_0= RULE_INT
            {
            lv_taskId_2_0=(Token)match(input,RULE_INT,FOLLOW_12); 

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

            otherlv_3=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getNameKeyword_3());
            		
            // InternalKPIGenerator.g:389:3: ( (lv_taskName_4_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:390:4: (lv_taskName_4_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:390:4: (lv_taskName_4_0= RULE_CADENA )
            // InternalKPIGenerator.g:391:5: lv_taskName_4_0= RULE_CADENA
            {
            lv_taskName_4_0=(Token)match(input,RULE_CADENA,FOLLOW_13); 

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

            otherlv_5=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getUseCaseKeyword_5());
            		
            // InternalKPIGenerator.g:411:3: ( (lv_useCase_6_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:412:4: (lv_useCase_6_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:412:4: (lv_useCase_6_0= RULE_CADENA )
            // InternalKPIGenerator.g:413:5: lv_useCase_6_0= RULE_CADENA
            {
            lv_useCase_6_0=(Token)match(input,RULE_CADENA,FOLLOW_14); 

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

            otherlv_7=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSequenceNumberKeyword_7());
            		
            // InternalKPIGenerator.g:433:3: ( (lv_sequenceNumber_8_0= RULE_DOUBLE ) )
            // InternalKPIGenerator.g:434:4: (lv_sequenceNumber_8_0= RULE_DOUBLE )
            {
            // InternalKPIGenerator.g:434:4: (lv_sequenceNumber_8_0= RULE_DOUBLE )
            // InternalKPIGenerator.g:435:5: lv_sequenceNumber_8_0= RULE_DOUBLE
            {
            lv_sequenceNumber_8_0=(Token)match(input,RULE_DOUBLE,FOLLOW_16); 

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

            otherlv_9=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getStartDateKeyword_9());
            		
            // InternalKPIGenerator.g:455:3: ( ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) ) )
            // InternalKPIGenerator.g:456:4: ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) )
            {
            // InternalKPIGenerator.g:456:4: ( (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' ) )
            // InternalKPIGenerator.g:457:5: (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' )
            {
            // InternalKPIGenerator.g:457:5: (lv_startDate_10_1= RULE_DATE | lv_startDate_10_2= '-' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DATE) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalKPIGenerator.g:458:6: lv_startDate_10_1= RULE_DATE
                    {
                    lv_startDate_10_1=(Token)match(input,RULE_DATE,FOLLOW_18); 

                    						newLeafNode(lv_startDate_10_1, grammarAccess.getTaskAccess().getStartDateDATETerminalRuleCall_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"startDate",
                    							lv_startDate_10_1,
                    							"co.edu.uniandes.KPIGenerator.DATE");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:473:6: lv_startDate_10_2= '-'
                    {
                    lv_startDate_10_2=(Token)match(input,28,FOLLOW_18); 

                    						newLeafNode(lv_startDate_10_2, grammarAccess.getTaskAccess().getStartDateHyphenMinusKeyword_10_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "startDate", lv_startDate_10_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_11=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getDueDateKeyword_11());
            		
            // InternalKPIGenerator.g:490:3: ( ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) ) )
            // InternalKPIGenerator.g:491:4: ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) )
            {
            // InternalKPIGenerator.g:491:4: ( (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' ) )
            // InternalKPIGenerator.g:492:5: (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' )
            {
            // InternalKPIGenerator.g:492:5: (lv_dueDate_12_1= RULE_DATE | lv_dueDate_12_2= '-' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DATE) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalKPIGenerator.g:493:6: lv_dueDate_12_1= RULE_DATE
                    {
                    lv_dueDate_12_1=(Token)match(input,RULE_DATE,FOLLOW_19); 

                    						newLeafNode(lv_dueDate_12_1, grammarAccess.getTaskAccess().getDueDateDATETerminalRuleCall_12_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dueDate",
                    							lv_dueDate_12_1,
                    							"co.edu.uniandes.KPIGenerator.DATE");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:508:6: lv_dueDate_12_2= '-'
                    {
                    lv_dueDate_12_2=(Token)match(input,28,FOLLOW_19); 

                    						newLeafNode(lv_dueDate_12_2, grammarAccess.getTaskAccess().getDueDateHyphenMinusKeyword_12_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "dueDate", lv_dueDate_12_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_13=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getIsPrivateKeyword_13());
            		
            // InternalKPIGenerator.g:525:3: ( (lv_isPrivate_14_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:526:4: (lv_isPrivate_14_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:526:4: (lv_isPrivate_14_0= RULE_CADENA )
            // InternalKPIGenerator.g:527:5: lv_isPrivate_14_0= RULE_CADENA
            {
            lv_isPrivate_14_0=(Token)match(input,RULE_CADENA,FOLLOW_20); 

            					newLeafNode(lv_isPrivate_14_0, grammarAccess.getTaskAccess().getIsPrivateCADENATerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isPrivate",
            						lv_isPrivate_14_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_15=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getProgressKeyword_15());
            		
            // InternalKPIGenerator.g:547:3: ( (lv_progress_16_0= RULE_INT ) )
            // InternalKPIGenerator.g:548:4: (lv_progress_16_0= RULE_INT )
            {
            // InternalKPIGenerator.g:548:4: (lv_progress_16_0= RULE_INT )
            // InternalKPIGenerator.g:549:5: lv_progress_16_0= RULE_INT
            {
            lv_progress_16_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_progress_16_0, grammarAccess.getTaskAccess().getProgressINTTerminalRuleCall_16_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"progress",
            						lv_progress_16_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_17=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getStatusKeyword_17());
            		
            // InternalKPIGenerator.g:569:3: ( (lv_statusName_18_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:570:4: (lv_statusName_18_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:570:4: (lv_statusName_18_0= RULE_CADENA )
            // InternalKPIGenerator.g:571:5: lv_statusName_18_0= RULE_CADENA
            {
            lv_statusName_18_0=(Token)match(input,RULE_CADENA,FOLLOW_22); 

            					newLeafNode(lv_statusName_18_0, grammarAccess.getTaskAccess().getStatusNameCADENATerminalRuleCall_18_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"statusName",
            						lv_statusName_18_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_19=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getStatusTextKeyword_19());
            		
            // InternalKPIGenerator.g:591:3: ( (lv_statusText_20_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:592:4: (lv_statusText_20_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:592:4: (lv_statusText_20_0= RULE_CADENA )
            // InternalKPIGenerator.g:593:5: lv_statusText_20_0= RULE_CADENA
            {
            lv_statusText_20_0=(Token)match(input,RULE_CADENA,FOLLOW_23); 

            					newLeafNode(lv_statusText_20_0, grammarAccess.getTaskAccess().getStatusTextCADENATerminalRuleCall_20_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"statusText",
            						lv_statusText_20_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_21=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getAssignedToKeyword_21());
            		
            // InternalKPIGenerator.g:613:3: ( (lv_assignedTo_22_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:614:4: (lv_assignedTo_22_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:614:4: (lv_assignedTo_22_0= RULE_CADENA )
            // InternalKPIGenerator.g:615:5: lv_assignedTo_22_0= RULE_CADENA
            {
            lv_assignedTo_22_0=(Token)match(input,RULE_CADENA,FOLLOW_24); 

            					newLeafNode(lv_assignedTo_22_0, grammarAccess.getTaskAccess().getAssignedToCADENATerminalRuleCall_22_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"assignedTo",
            						lv_assignedTo_22_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_23=(Token)match(input,35,FOLLOW_25); 

            			newLeafNode(otherlv_23, grammarAccess.getTaskAccess().getCreatedDateKeyword_23());
            		
            // InternalKPIGenerator.g:635:3: ( (lv_createdDate_24_0= RULE_DATEHOUR ) )
            // InternalKPIGenerator.g:636:4: (lv_createdDate_24_0= RULE_DATEHOUR )
            {
            // InternalKPIGenerator.g:636:4: (lv_createdDate_24_0= RULE_DATEHOUR )
            // InternalKPIGenerator.g:637:5: lv_createdDate_24_0= RULE_DATEHOUR
            {
            lv_createdDate_24_0=(Token)match(input,RULE_DATEHOUR,FOLLOW_26); 

            					newLeafNode(lv_createdDate_24_0, grammarAccess.getTaskAccess().getCreatedDateDATEHOURTerminalRuleCall_24_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"createdDate",
            						lv_createdDate_24_0,
            						"co.edu.uniandes.KPIGenerator.DATEHOUR");
            				

            }


            }

            otherlv_25=(Token)match(input,36,FOLLOW_27); 

            			newLeafNode(otherlv_25, grammarAccess.getTaskAccess().getCompletedDateKeyword_25());
            		
            // InternalKPIGenerator.g:657:3: ( ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) ) )
            // InternalKPIGenerator.g:658:4: ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) )
            {
            // InternalKPIGenerator.g:658:4: ( (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' ) )
            // InternalKPIGenerator.g:659:5: (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' )
            {
            // InternalKPIGenerator.g:659:5: (lv_completedDate_26_1= RULE_DATEHOUR | lv_completedDate_26_2= '-' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DATEHOUR) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalKPIGenerator.g:660:6: lv_completedDate_26_1= RULE_DATEHOUR
                    {
                    lv_completedDate_26_1=(Token)match(input,RULE_DATEHOUR,FOLLOW_28); 

                    						newLeafNode(lv_completedDate_26_1, grammarAccess.getTaskAccess().getCompletedDateDATEHOURTerminalRuleCall_26_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"completedDate",
                    							lv_completedDate_26_1,
                    							"co.edu.uniandes.KPIGenerator.DATEHOUR");
                    					

                    }
                    break;
                case 2 :
                    // InternalKPIGenerator.g:675:6: lv_completedDate_26_2= '-'
                    {
                    lv_completedDate_26_2=(Token)match(input,28,FOLLOW_28); 

                    						newLeafNode(lv_completedDate_26_2, grammarAccess.getTaskAccess().getCompletedDateHyphenMinusKeyword_26_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "completedDate", lv_completedDate_26_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_27=(Token)match(input,37,FOLLOW_11); 

            			newLeafNode(otherlv_27, grammarAccess.getTaskAccess().getTimeLoggedMinKeyword_27());
            		
            // InternalKPIGenerator.g:692:3: ( (lv_timeLoggedMin_28_0= RULE_INT ) )
            // InternalKPIGenerator.g:693:4: (lv_timeLoggedMin_28_0= RULE_INT )
            {
            // InternalKPIGenerator.g:693:4: (lv_timeLoggedMin_28_0= RULE_INT )
            // InternalKPIGenerator.g:694:5: lv_timeLoggedMin_28_0= RULE_INT
            {
            lv_timeLoggedMin_28_0=(Token)match(input,RULE_INT,FOLLOW_29); 

            					newLeafNode(lv_timeLoggedMin_28_0, grammarAccess.getTaskAccess().getTimeLoggedMinINTTerminalRuleCall_28_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeLoggedMin",
            						lv_timeLoggedMin_28_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_29=(Token)match(input,38,FOLLOW_11); 

            			newLeafNode(otherlv_29, grammarAccess.getTaskAccess().getBillableTimeKeyword_29());
            		
            // InternalKPIGenerator.g:714:3: ( (lv_billableTime_30_0= RULE_INT ) )
            // InternalKPIGenerator.g:715:4: (lv_billableTime_30_0= RULE_INT )
            {
            // InternalKPIGenerator.g:715:4: (lv_billableTime_30_0= RULE_INT )
            // InternalKPIGenerator.g:716:5: lv_billableTime_30_0= RULE_INT
            {
            lv_billableTime_30_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            					newLeafNode(lv_billableTime_30_0, grammarAccess.getTaskAccess().getBillableTimeINTTerminalRuleCall_30_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"billableTime",
            						lv_billableTime_30_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_31=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_31, grammarAccess.getTaskAccess().getCompletedOnTimeKeyword_31());
            		
            // InternalKPIGenerator.g:736:3: ( (lv_completedOnTime_32_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:737:4: (lv_completedOnTime_32_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:737:4: (lv_completedOnTime_32_0= RULE_CADENA )
            // InternalKPIGenerator.g:738:5: lv_completedOnTime_32_0= RULE_CADENA
            {
            lv_completedOnTime_32_0=(Token)match(input,RULE_CADENA,FOLLOW_31); 

            					newLeafNode(lv_completedOnTime_32_0, grammarAccess.getTaskAccess().getCompletedOnTimeCADENATerminalRuleCall_32_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"completedOnTime",
            						lv_completedOnTime_32_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_33=(Token)match(input,40,FOLLOW_11); 

            			newLeafNode(otherlv_33, grammarAccess.getTaskAccess().getTimeEstimatedKeyword_33());
            		
            // InternalKPIGenerator.g:758:3: ( (lv_timeEstimated_34_0= RULE_INT ) )
            // InternalKPIGenerator.g:759:4: (lv_timeEstimated_34_0= RULE_INT )
            {
            // InternalKPIGenerator.g:759:4: (lv_timeEstimated_34_0= RULE_INT )
            // InternalKPIGenerator.g:760:5: lv_timeEstimated_34_0= RULE_INT
            {
            lv_timeEstimated_34_0=(Token)match(input,RULE_INT,FOLLOW_32); 

            					newLeafNode(lv_timeEstimated_34_0, grammarAccess.getTaskAccess().getTimeEstimatedINTTerminalRuleCall_34_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"timeEstimated",
            						lv_timeEstimated_34_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_35=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_35, grammarAccess.getTaskAccess().getIsReprocessedTaskKeyword_35());
            		
            // InternalKPIGenerator.g:780:3: ( (lv_isReprocessedTask_36_0= RULE_CADENA ) )
            // InternalKPIGenerator.g:781:4: (lv_isReprocessedTask_36_0= RULE_CADENA )
            {
            // InternalKPIGenerator.g:781:4: (lv_isReprocessedTask_36_0= RULE_CADENA )
            // InternalKPIGenerator.g:782:5: lv_isReprocessedTask_36_0= RULE_CADENA
            {
            lv_isReprocessedTask_36_0=(Token)match(input,RULE_CADENA,FOLLOW_33); 

            					newLeafNode(lv_isReprocessedTask_36_0, grammarAccess.getTaskAccess().getIsReprocessedTaskCADENATerminalRuleCall_36_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"isReprocessedTask",
            						lv_isReprocessedTask_36_0,
            						"co.edu.uniandes.KPIGenerator.CADENA");
            				

            }


            }

            otherlv_37=(Token)match(input,42,FOLLOW_11); 

            			newLeafNode(otherlv_37, grammarAccess.getTaskAccess().getIdParentTaskKeyword_37());
            		
            // InternalKPIGenerator.g:802:3: ( (lv_idParentTask_38_0= RULE_INT ) )
            // InternalKPIGenerator.g:803:4: (lv_idParentTask_38_0= RULE_INT )
            {
            // InternalKPIGenerator.g:803:4: (lv_idParentTask_38_0= RULE_INT )
            // InternalKPIGenerator.g:804:5: lv_idParentTask_38_0= RULE_INT
            {
            lv_idParentTask_38_0=(Token)match(input,RULE_INT,FOLLOW_34); 

            					newLeafNode(lv_idParentTask_38_0, grammarAccess.getTaskAccess().getIdParentTaskINTTerminalRuleCall_38_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"idParentTask",
            						lv_idParentTask_38_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_39=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_39());
            		

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});

}
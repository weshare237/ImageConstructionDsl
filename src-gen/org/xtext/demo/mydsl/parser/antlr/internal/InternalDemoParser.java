package org.xtext.demo.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.demo.mydsl.services.DemoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDemoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'avancer'", "'gauche'", "'droit'", "'procedure'", "'finProcedure'", "':'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalDemoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDemoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDemoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDemo.g"; }



     	private DemoGrammarAccess grammarAccess;

        public InternalDemoParser(TokenStream input, DemoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DemoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDemo.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDemo.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDemo.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDemo.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDemo.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalDemo.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalDemo.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=14)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDemo.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalDemo.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalDemo.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.demo.mydsl.Demo.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDemo.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalDemo.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalDemo.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDemo.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Image_0= ruleImage | this_Procedure_1= ruleProcedure ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Image_0 = null;

        EObject this_Procedure_1 = null;



        	enterRule();

        try {
            // InternalDemo.g:113:2: ( (this_Image_0= ruleImage | this_Procedure_1= ruleProcedure ) )
            // InternalDemo.g:114:2: (this_Image_0= ruleImage | this_Procedure_1= ruleProcedure )
            {
            // InternalDemo.g:114:2: (this_Image_0= ruleImage | this_Procedure_1= ruleProcedure )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDemo.g:115:3: this_Image_0= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_0=ruleImage();

                    state._fsp--;


                    			current = this_Image_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDemo.g:124:3: this_Procedure_1= ruleProcedure
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getProcedureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Procedure_1=ruleProcedure();

                    state._fsp--;


                    			current = this_Procedure_1;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImage"
    // InternalDemo.g:136:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalDemo.g:136:46: (iv_ruleImage= ruleImage EOF )
            // InternalDemo.g:137:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalDemo.g:143:1: ruleImage returns [EObject current=null] : ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_0_0 = null;

        EObject lv_suite_inst_1_0 = null;



        	enterRule();

        try {
            // InternalDemo.g:149:2: ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) )
            // InternalDemo.g:150:2: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
            {
            // InternalDemo.g:150:2: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
            // InternalDemo.g:151:3: ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) )
            {
            // InternalDemo.g:151:3: ( (lv_instruction_0_0= ruleInst ) )
            // InternalDemo.g:152:4: (lv_instruction_0_0= ruleInst )
            {
            // InternalDemo.g:152:4: (lv_instruction_0_0= ruleInst )
            // InternalDemo.g:153:5: lv_instruction_0_0= ruleInst
            {

            					newCompositeNode(grammarAccess.getImageAccess().getInstructionInstParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_instruction_0_0=ruleInst();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"instruction",
            						lv_instruction_0_0,
            						"org.xtext.demo.mydsl.Demo.Inst");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDemo.g:170:3: ( (lv_suite_inst_1_0= ruleSuite ) )
            // InternalDemo.g:171:4: (lv_suite_inst_1_0= ruleSuite )
            {
            // InternalDemo.g:171:4: (lv_suite_inst_1_0= ruleSuite )
            // InternalDemo.g:172:5: lv_suite_inst_1_0= ruleSuite
            {

            					newCompositeNode(grammarAccess.getImageAccess().getSuite_instSuiteParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_suite_inst_1_0=ruleSuite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageRule());
            					}
            					set(
            						current,
            						"suite_inst",
            						lv_suite_inst_1_0,
            						"org.xtext.demo.mydsl.Demo.Suite");
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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleSuite"
    // InternalDemo.g:193:1: entryRuleSuite returns [EObject current=null] : iv_ruleSuite= ruleSuite EOF ;
    public final EObject entryRuleSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuite = null;


        try {
            // InternalDemo.g:193:46: (iv_ruleSuite= ruleSuite EOF )
            // InternalDemo.g:194:2: iv_ruleSuite= ruleSuite EOF
            {
             newCompositeNode(grammarAccess.getSuiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuite=ruleSuite();

            state._fsp--;

             current =iv_ruleSuite; 
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
    // $ANTLR end "entryRuleSuite"


    // $ANTLR start "ruleSuite"
    // InternalDemo.g:200:1: ruleSuite returns [EObject current=null] : ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () ) ;
    public final EObject ruleSuite() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_0_0 = null;

        EObject lv_suite_inst_1_0 = null;



        	enterRule();

        try {
            // InternalDemo.g:206:2: ( ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () ) )
            // InternalDemo.g:207:2: ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () )
            {
            // InternalDemo.g:207:2: ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_INT) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_INT) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 14:
            case 15:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDemo.g:208:3: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
                    {
                    // InternalDemo.g:208:3: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
                    // InternalDemo.g:209:4: ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) )
                    {
                    // InternalDemo.g:209:4: ( (lv_instruction_0_0= ruleInst ) )
                    // InternalDemo.g:210:5: (lv_instruction_0_0= ruleInst )
                    {
                    // InternalDemo.g:210:5: (lv_instruction_0_0= ruleInst )
                    // InternalDemo.g:211:6: lv_instruction_0_0= ruleInst
                    {

                    						newCompositeNode(grammarAccess.getSuiteAccess().getInstructionInstParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_instruction_0_0=ruleInst();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuiteRule());
                    						}
                    						set(
                    							current,
                    							"instruction",
                    							lv_instruction_0_0,
                    							"org.xtext.demo.mydsl.Demo.Inst");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDemo.g:228:4: ( (lv_suite_inst_1_0= ruleSuite ) )
                    // InternalDemo.g:229:5: (lv_suite_inst_1_0= ruleSuite )
                    {
                    // InternalDemo.g:229:5: (lv_suite_inst_1_0= ruleSuite )
                    // InternalDemo.g:230:6: lv_suite_inst_1_0= ruleSuite
                    {

                    						newCompositeNode(grammarAccess.getSuiteAccess().getSuite_instSuiteParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_suite_inst_1_0=ruleSuite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSuiteRule());
                    						}
                    						set(
                    							current,
                    							"suite_inst",
                    							lv_suite_inst_1_0,
                    							"org.xtext.demo.mydsl.Demo.Suite");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDemo.g:249:3: ()
                    {
                    // InternalDemo.g:249:3: ()
                    // InternalDemo.g:250:4: 
                    {

                    				current = forceCreateModelElement(
                    					grammarAccess.getSuiteAccess().getSuiteAction_1(),
                    					current);
                    			

                    }


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
    // $ANTLR end "ruleSuite"


    // $ANTLR start "entryRuleInst"
    // InternalDemo.g:260:1: entryRuleInst returns [EObject current=null] : iv_ruleInst= ruleInst EOF ;
    public final EObject entryRuleInst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst = null;


        try {
            // InternalDemo.g:260:45: (iv_ruleInst= ruleInst EOF )
            // InternalDemo.g:261:2: iv_ruleInst= ruleInst EOF
            {
             newCompositeNode(grammarAccess.getInstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInst=ruleInst();

            state._fsp--;

             current =iv_ruleInst; 
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
    // $ANTLR end "entryRuleInst"


    // $ANTLR start "ruleInst"
    // InternalDemo.g:267:1: ruleInst returns [EObject current=null] : (this_Go_0= ruleGo | this_Turn_1= ruleTurn ) ;
    public final EObject ruleInst() throws RecognitionException {
        EObject current = null;

        EObject this_Go_0 = null;

        EObject this_Turn_1 = null;



        	enterRule();

        try {
            // InternalDemo.g:273:2: ( (this_Go_0= ruleGo | this_Turn_1= ruleTurn ) )
            // InternalDemo.g:274:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn )
            {
            // InternalDemo.g:274:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=12 && LA4_0<=13)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDemo.g:275:3: this_Go_0= ruleGo
                    {

                    			newCompositeNode(grammarAccess.getInstAccess().getGoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Go_0=ruleGo();

                    state._fsp--;


                    			current = this_Go_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDemo.g:284:3: this_Turn_1= ruleTurn
                    {

                    			newCompositeNode(grammarAccess.getInstAccess().getTurnParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Turn_1=ruleTurn();

                    state._fsp--;


                    			current = this_Turn_1;
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
    // $ANTLR end "ruleInst"


    // $ANTLR start "entryRuleGo"
    // InternalDemo.g:296:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalDemo.g:296:43: (iv_ruleGo= ruleGo EOF )
            // InternalDemo.g:297:2: iv_ruleGo= ruleGo EOF
            {
             newCompositeNode(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;

             current =iv_ruleGo; 
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
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalDemo.g:303:1: ruleGo returns [EObject current=null] : (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;


        	enterRule();

        try {
            // InternalDemo.g:309:2: ( (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) ) )
            // InternalDemo.g:310:2: (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) )
            {
            // InternalDemo.g:310:2: (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) )
            // InternalDemo.g:311:3: otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGoAccess().getAvancerKeyword_0());
            		
            // InternalDemo.g:315:3: ( (lv_nombre_1_0= RULE_INT ) )
            // InternalDemo.g:316:4: (lv_nombre_1_0= RULE_INT )
            {
            // InternalDemo.g:316:4: (lv_nombre_1_0= RULE_INT )
            // InternalDemo.g:317:5: lv_nombre_1_0= RULE_INT
            {
            lv_nombre_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_nombre_1_0, grammarAccess.getGoAccess().getNombreINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleTurn"
    // InternalDemo.g:337:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalDemo.g:337:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalDemo.g:338:2: iv_ruleTurn= ruleTurn EOF
            {
             newCompositeNode(grammarAccess.getTurnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurn=ruleTurn();

            state._fsp--;

             current =iv_ruleTurn; 
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
    // $ANTLR end "entryRuleTurn"


    // $ANTLR start "ruleTurn"
    // InternalDemo.g:344:1: ruleTurn returns [EObject current=null] : (this_Tl_0= ruleTl | this_Tr_1= ruleTr ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        EObject this_Tl_0 = null;

        EObject this_Tr_1 = null;



        	enterRule();

        try {
            // InternalDemo.g:350:2: ( (this_Tl_0= ruleTl | this_Tr_1= ruleTr ) )
            // InternalDemo.g:351:2: (this_Tl_0= ruleTl | this_Tr_1= ruleTr )
            {
            // InternalDemo.g:351:2: (this_Tl_0= ruleTl | this_Tr_1= ruleTr )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDemo.g:352:3: this_Tl_0= ruleTl
                    {

                    			newCompositeNode(grammarAccess.getTurnAccess().getTlParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tl_0=ruleTl();

                    state._fsp--;


                    			current = this_Tl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDemo.g:361:3: this_Tr_1= ruleTr
                    {

                    			newCompositeNode(grammarAccess.getTurnAccess().getTrParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tr_1=ruleTr();

                    state._fsp--;


                    			current = this_Tr_1;
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
    // $ANTLR end "ruleTurn"


    // $ANTLR start "entryRuleTl"
    // InternalDemo.g:373:1: entryRuleTl returns [EObject current=null] : iv_ruleTl= ruleTl EOF ;
    public final EObject entryRuleTl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTl = null;


        try {
            // InternalDemo.g:373:43: (iv_ruleTl= ruleTl EOF )
            // InternalDemo.g:374:2: iv_ruleTl= ruleTl EOF
            {
             newCompositeNode(grammarAccess.getTlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTl=ruleTl();

            state._fsp--;

             current =iv_ruleTl; 
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
    // $ANTLR end "entryRuleTl"


    // $ANTLR start "ruleTl"
    // InternalDemo.g:380:1: ruleTl returns [EObject current=null] : (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;


        	enterRule();

        try {
            // InternalDemo.g:386:2: ( (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) ) )
            // InternalDemo.g:387:2: (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) )
            {
            // InternalDemo.g:387:2: (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) )
            // InternalDemo.g:388:3: otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTlAccess().getGaucheKeyword_0());
            		
            // InternalDemo.g:392:3: ( (lv_nombre_1_0= RULE_INT ) )
            // InternalDemo.g:393:4: (lv_nombre_1_0= RULE_INT )
            {
            // InternalDemo.g:393:4: (lv_nombre_1_0= RULE_INT )
            // InternalDemo.g:394:5: lv_nombre_1_0= RULE_INT
            {
            lv_nombre_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_nombre_1_0, grammarAccess.getTlAccess().getNombreINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTlRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleTl"


    // $ANTLR start "entryRuleTr"
    // InternalDemo.g:414:1: entryRuleTr returns [EObject current=null] : iv_ruleTr= ruleTr EOF ;
    public final EObject entryRuleTr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTr = null;


        try {
            // InternalDemo.g:414:43: (iv_ruleTr= ruleTr EOF )
            // InternalDemo.g:415:2: iv_ruleTr= ruleTr EOF
            {
             newCompositeNode(grammarAccess.getTrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTr=ruleTr();

            state._fsp--;

             current =iv_ruleTr; 
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
    // $ANTLR end "entryRuleTr"


    // $ANTLR start "ruleTr"
    // InternalDemo.g:421:1: ruleTr returns [EObject current=null] : (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;


        	enterRule();

        try {
            // InternalDemo.g:427:2: ( (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) ) )
            // InternalDemo.g:428:2: (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) )
            {
            // InternalDemo.g:428:2: (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) )
            // InternalDemo.g:429:3: otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTrAccess().getDroitKeyword_0());
            		
            // InternalDemo.g:433:3: ( (lv_nombre_1_0= RULE_INT ) )
            // InternalDemo.g:434:4: (lv_nombre_1_0= RULE_INT )
            {
            // InternalDemo.g:434:4: (lv_nombre_1_0= RULE_INT )
            // InternalDemo.g:435:5: lv_nombre_1_0= RULE_INT
            {
            lv_nombre_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_nombre_1_0, grammarAccess.getTrAccess().getNombreINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleTr"


    // $ANTLR start "entryRuleProcedure"
    // InternalDemo.g:455:1: entryRuleProcedure returns [EObject current=null] : iv_ruleProcedure= ruleProcedure EOF ;
    public final EObject entryRuleProcedure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedure = null;


        try {
            // InternalDemo.g:455:50: (iv_ruleProcedure= ruleProcedure EOF )
            // InternalDemo.g:456:2: iv_ruleProcedure= ruleProcedure EOF
            {
             newCompositeNode(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcedure=ruleProcedure();

            state._fsp--;

             current =iv_ruleProcedure; 
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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalDemo.g:462:1: ruleProcedure returns [EObject current=null] : (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ( (lv_image_3_0= ruleImage ) ) otherlv_4= 'finProcedure' ) ;
    public final EObject ruleProcedure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_image_3_0 = null;



        	enterRule();

        try {
            // InternalDemo.g:468:2: ( (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ( (lv_image_3_0= ruleImage ) ) otherlv_4= 'finProcedure' ) )
            // InternalDemo.g:469:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ( (lv_image_3_0= ruleImage ) ) otherlv_4= 'finProcedure' )
            {
            // InternalDemo.g:469:2: (otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ( (lv_image_3_0= ruleImage ) ) otherlv_4= 'finProcedure' )
            // InternalDemo.g:470:3: otherlv_0= 'procedure' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleformal_parameter_list ) )? ( (lv_image_3_0= ruleImage ) ) otherlv_4= 'finProcedure'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
            		
            // InternalDemo.g:474:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDemo.g:475:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDemo.g:475:4: (lv_name_1_0= RULE_ID )
            // InternalDemo.g:476:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcedureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemo.g:492:3: ( (lv_parameters_2_0= ruleformal_parameter_list ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDemo.g:493:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    {
                    // InternalDemo.g:493:4: (lv_parameters_2_0= ruleformal_parameter_list )
                    // InternalDemo.g:494:5: lv_parameters_2_0= ruleformal_parameter_list
                    {

                    					newCompositeNode(grammarAccess.getProcedureAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_parameters_2_0=ruleformal_parameter_list();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getProcedureRule());
                    					}
                    					set(
                    						current,
                    						"parameters",
                    						lv_parameters_2_0,
                    						"org.xtext.demo.mydsl.Demo.formal_parameter_list");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDemo.g:511:3: ( (lv_image_3_0= ruleImage ) )
            // InternalDemo.g:512:4: (lv_image_3_0= ruleImage )
            {
            // InternalDemo.g:512:4: (lv_image_3_0= ruleImage )
            // InternalDemo.g:513:5: lv_image_3_0= ruleImage
            {

            					newCompositeNode(grammarAccess.getProcedureAccess().getImageImageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_image_3_0=ruleImage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcedureRule());
            					}
            					set(
            						current,
            						"image",
            						lv_image_3_0,
            						"org.xtext.demo.mydsl.Demo.Image");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getFinProcedureKeyword_4());
            		

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleformal_parameter_list"
    // InternalDemo.g:538:1: entryRuleformal_parameter_list returns [EObject current=null] : iv_ruleformal_parameter_list= ruleformal_parameter_list EOF ;
    public final EObject entryRuleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformal_parameter_list = null;


        try {
            // InternalDemo.g:538:62: (iv_ruleformal_parameter_list= ruleformal_parameter_list EOF )
            // InternalDemo.g:539:2: iv_ruleformal_parameter_list= ruleformal_parameter_list EOF
            {
             newCompositeNode(grammarAccess.getFormal_parameter_listRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleformal_parameter_list=ruleformal_parameter_list();

            state._fsp--;

             current =iv_ruleformal_parameter_list; 
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
    // $ANTLR end "entryRuleformal_parameter_list"


    // $ANTLR start "ruleformal_parameter_list"
    // InternalDemo.g:545:1: ruleformal_parameter_list returns [EObject current=null] : (otherlv_0= ':' ( (lv_parameter_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleformal_parameter_list() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameter_1_0=null;
        Token otherlv_2=null;
        Token lv_parameter_3_0=null;


        	enterRule();

        try {
            // InternalDemo.g:551:2: ( (otherlv_0= ':' ( (lv_parameter_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) )* ) )
            // InternalDemo.g:552:2: (otherlv_0= ':' ( (lv_parameter_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) )* )
            {
            // InternalDemo.g:552:2: (otherlv_0= ':' ( (lv_parameter_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) )* )
            // InternalDemo.g:553:3: otherlv_0= ':' ( (lv_parameter_1_0= RULE_ID ) ) (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getColonKeyword_0());
            		
            // InternalDemo.g:557:3: ( (lv_parameter_1_0= RULE_ID ) )
            // InternalDemo.g:558:4: (lv_parameter_1_0= RULE_ID )
            {
            // InternalDemo.g:558:4: (lv_parameter_1_0= RULE_ID )
            // InternalDemo.g:559:5: lv_parameter_1_0= RULE_ID
            {
            lv_parameter_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_parameter_1_0, grammarAccess.getFormal_parameter_listAccess().getParameterIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormal_parameter_listRule());
            					}
            					addWithLastConsumed(
            						current,
            						"parameter",
            						lv_parameter_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDemo.g:575:3: (otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDemo.g:576:4: otherlv_2= ':' ( (lv_parameter_3_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getColonKeyword_2_0());
            	    			
            	    // InternalDemo.g:580:4: ( (lv_parameter_3_0= RULE_ID ) )
            	    // InternalDemo.g:581:5: (lv_parameter_3_0= RULE_ID )
            	    {
            	    // InternalDemo.g:581:5: (lv_parameter_3_0= RULE_ID )
            	    // InternalDemo.g:582:6: lv_parameter_3_0= RULE_ID
            	    {
            	    lv_parameter_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            	    						newLeafNode(lv_parameter_3_0, grammarAccess.getFormal_parameter_listAccess().getParameterIDTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFormal_parameter_listRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"parameter",
            	    							lv_parameter_3_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleformal_parameter_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});

}
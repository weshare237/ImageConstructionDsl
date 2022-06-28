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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'avancer'", "'gauche'", "'droit'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
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
    // InternalDemo.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleImage ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalDemo.g:77:2: ( ( (lv_elements_0_0= ruleImage ) )* )
            // InternalDemo.g:78:2: ( (lv_elements_0_0= ruleImage ) )*
            {
            // InternalDemo.g:78:2: ( (lv_elements_0_0= ruleImage ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDemo.g:79:3: (lv_elements_0_0= ruleImage )
            	    {
            	    // InternalDemo.g:79:3: (lv_elements_0_0= ruleImage )
            	    // InternalDemo.g:80:4: lv_elements_0_0= ruleImage
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsImageParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleImage();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.demo.mydsl.Demo.Image");
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


    // $ANTLR start "entryRuleImage"
    // InternalDemo.g:100:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalDemo.g:100:46: (iv_ruleImage= ruleImage EOF )
            // InternalDemo.g:101:2: iv_ruleImage= ruleImage EOF
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
    // InternalDemo.g:107:1: ruleImage returns [EObject current=null] : ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_0_0 = null;

        EObject lv_suite_inst_1_0 = null;



        	enterRule();

        try {
            // InternalDemo.g:113:2: ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) )
            // InternalDemo.g:114:2: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
            {
            // InternalDemo.g:114:2: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
            // InternalDemo.g:115:3: ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) )
            {
            // InternalDemo.g:115:3: ( (lv_instruction_0_0= ruleInst ) )
            // InternalDemo.g:116:4: (lv_instruction_0_0= ruleInst )
            {
            // InternalDemo.g:116:4: (lv_instruction_0_0= ruleInst )
            // InternalDemo.g:117:5: lv_instruction_0_0= ruleInst
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

            // InternalDemo.g:134:3: ( (lv_suite_inst_1_0= ruleSuite ) )
            // InternalDemo.g:135:4: (lv_suite_inst_1_0= ruleSuite )
            {
            // InternalDemo.g:135:4: (lv_suite_inst_1_0= ruleSuite )
            // InternalDemo.g:136:5: lv_suite_inst_1_0= ruleSuite
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
    // InternalDemo.g:157:1: entryRuleSuite returns [EObject current=null] : iv_ruleSuite= ruleSuite EOF ;
    public final EObject entryRuleSuite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuite = null;


        try {
            // InternalDemo.g:157:46: (iv_ruleSuite= ruleSuite EOF )
            // InternalDemo.g:158:2: iv_ruleSuite= ruleSuite EOF
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
    // InternalDemo.g:164:1: ruleSuite returns [EObject current=null] : ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () ) ;
    public final EObject ruleSuite() throws RecognitionException {
        EObject current = null;

        EObject lv_instruction_0_0 = null;

        EObject lv_suite_inst_1_0 = null;



        	enterRule();

        try {
            // InternalDemo.g:170:2: ( ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () ) )
            // InternalDemo.g:171:2: ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () )
            {
            // InternalDemo.g:171:2: ( ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) ) | () )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_INT) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_INT) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_INT) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDemo.g:172:3: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
                    {
                    // InternalDemo.g:172:3: ( ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) ) )
                    // InternalDemo.g:173:4: ( (lv_instruction_0_0= ruleInst ) ) ( (lv_suite_inst_1_0= ruleSuite ) )
                    {
                    // InternalDemo.g:173:4: ( (lv_instruction_0_0= ruleInst ) )
                    // InternalDemo.g:174:5: (lv_instruction_0_0= ruleInst )
                    {
                    // InternalDemo.g:174:5: (lv_instruction_0_0= ruleInst )
                    // InternalDemo.g:175:6: lv_instruction_0_0= ruleInst
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

                    // InternalDemo.g:192:4: ( (lv_suite_inst_1_0= ruleSuite ) )
                    // InternalDemo.g:193:5: (lv_suite_inst_1_0= ruleSuite )
                    {
                    // InternalDemo.g:193:5: (lv_suite_inst_1_0= ruleSuite )
                    // InternalDemo.g:194:6: lv_suite_inst_1_0= ruleSuite
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
                    // InternalDemo.g:213:3: ()
                    {
                    // InternalDemo.g:213:3: ()
                    // InternalDemo.g:214:4: 
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
    // InternalDemo.g:224:1: entryRuleInst returns [EObject current=null] : iv_ruleInst= ruleInst EOF ;
    public final EObject entryRuleInst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInst = null;


        try {
            // InternalDemo.g:224:45: (iv_ruleInst= ruleInst EOF )
            // InternalDemo.g:225:2: iv_ruleInst= ruleInst EOF
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
    // InternalDemo.g:231:1: ruleInst returns [EObject current=null] : (this_Go_0= ruleGo | this_Turn_1= ruleTurn ) ;
    public final EObject ruleInst() throws RecognitionException {
        EObject current = null;

        EObject this_Go_0 = null;

        EObject this_Turn_1 = null;



        	enterRule();

        try {
            // InternalDemo.g:237:2: ( (this_Go_0= ruleGo | this_Turn_1= ruleTurn ) )
            // InternalDemo.g:238:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn )
            {
            // InternalDemo.g:238:2: (this_Go_0= ruleGo | this_Turn_1= ruleTurn )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=12 && LA3_0<=13)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDemo.g:239:3: this_Go_0= ruleGo
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
                    // InternalDemo.g:248:3: this_Turn_1= ruleTurn
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
    // InternalDemo.g:260:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalDemo.g:260:43: (iv_ruleGo= ruleGo EOF )
            // InternalDemo.g:261:2: iv_ruleGo= ruleGo EOF
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
    // InternalDemo.g:267:1: ruleGo returns [EObject current=null] : (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;


        	enterRule();

        try {
            // InternalDemo.g:273:2: ( (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) ) )
            // InternalDemo.g:274:2: (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) )
            {
            // InternalDemo.g:274:2: (otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) ) )
            // InternalDemo.g:275:3: otherlv_0= 'avancer' ( (lv_nombre_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGoAccess().getAvancerKeyword_0());
            		
            // InternalDemo.g:279:3: ( (lv_nombre_1_0= RULE_INT ) )
            // InternalDemo.g:280:4: (lv_nombre_1_0= RULE_INT )
            {
            // InternalDemo.g:280:4: (lv_nombre_1_0= RULE_INT )
            // InternalDemo.g:281:5: lv_nombre_1_0= RULE_INT
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
    // InternalDemo.g:301:1: entryRuleTurn returns [EObject current=null] : iv_ruleTurn= ruleTurn EOF ;
    public final EObject entryRuleTurn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurn = null;


        try {
            // InternalDemo.g:301:45: (iv_ruleTurn= ruleTurn EOF )
            // InternalDemo.g:302:2: iv_ruleTurn= ruleTurn EOF
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
    // InternalDemo.g:308:1: ruleTurn returns [EObject current=null] : (this_Tl_0= ruleTl | this_Tr_1= ruleTr ) ;
    public final EObject ruleTurn() throws RecognitionException {
        EObject current = null;

        EObject this_Tl_0 = null;

        EObject this_Tr_1 = null;



        	enterRule();

        try {
            // InternalDemo.g:314:2: ( (this_Tl_0= ruleTl | this_Tr_1= ruleTr ) )
            // InternalDemo.g:315:2: (this_Tl_0= ruleTl | this_Tr_1= ruleTr )
            {
            // InternalDemo.g:315:2: (this_Tl_0= ruleTl | this_Tr_1= ruleTr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDemo.g:316:3: this_Tl_0= ruleTl
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
                    // InternalDemo.g:325:3: this_Tr_1= ruleTr
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
    // InternalDemo.g:337:1: entryRuleTl returns [EObject current=null] : iv_ruleTl= ruleTl EOF ;
    public final EObject entryRuleTl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTl = null;


        try {
            // InternalDemo.g:337:43: (iv_ruleTl= ruleTl EOF )
            // InternalDemo.g:338:2: iv_ruleTl= ruleTl EOF
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
    // InternalDemo.g:344:1: ruleTl returns [EObject current=null] : (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;


        	enterRule();

        try {
            // InternalDemo.g:350:2: ( (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) ) )
            // InternalDemo.g:351:2: (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) )
            {
            // InternalDemo.g:351:2: (otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) ) )
            // InternalDemo.g:352:3: otherlv_0= 'gauche' ( (lv_nombre_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTlAccess().getGaucheKeyword_0());
            		
            // InternalDemo.g:356:3: ( (lv_nombre_1_0= RULE_INT ) )
            // InternalDemo.g:357:4: (lv_nombre_1_0= RULE_INT )
            {
            // InternalDemo.g:357:4: (lv_nombre_1_0= RULE_INT )
            // InternalDemo.g:358:5: lv_nombre_1_0= RULE_INT
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
    // InternalDemo.g:378:1: entryRuleTr returns [EObject current=null] : iv_ruleTr= ruleTr EOF ;
    public final EObject entryRuleTr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTr = null;


        try {
            // InternalDemo.g:378:43: (iv_ruleTr= ruleTr EOF )
            // InternalDemo.g:379:2: iv_ruleTr= ruleTr EOF
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
    // InternalDemo.g:385:1: ruleTr returns [EObject current=null] : (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) ) ;
    public final EObject ruleTr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nombre_1_0=null;


        	enterRule();

        try {
            // InternalDemo.g:391:2: ( (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) ) )
            // InternalDemo.g:392:2: (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) )
            {
            // InternalDemo.g:392:2: (otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) ) )
            // InternalDemo.g:393:3: otherlv_0= 'droit' ( (lv_nombre_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTrAccess().getDroitKeyword_0());
            		
            // InternalDemo.g:397:3: ( (lv_nombre_1_0= RULE_INT ) )
            // InternalDemo.g:398:4: (lv_nombre_1_0= RULE_INT )
            {
            // InternalDemo.g:398:4: (lv_nombre_1_0= RULE_INT )
            // InternalDemo.g:399:5: lv_nombre_1_0= RULE_INT
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}
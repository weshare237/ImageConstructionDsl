/*
 * generated by Xtext 2.26.0
 */
grammar InternalDemo;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.demo.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleAbstractElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.demo.mydsl.Demo.AbstractElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	iv_ruleAbstractElement=ruleAbstractElement
	{ $current=$iv_ruleAbstractElement.current; }
	EOF;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getImageParserRuleCall_0());
		}
		this_Image_0=ruleImage
		{
			$current = $this_Image_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractElementAccess().getProcedureParserRuleCall_1());
		}
		this_Procedure_1=ruleProcedure
		{
			$current = $this_Procedure_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleImage
entryRuleImage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImageRule()); }
	iv_ruleImage=ruleImage
	{ $current=$iv_ruleImage.current; }
	EOF;

// Rule Image
ruleImage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getImageAccess().getInstructionInstParserRuleCall_0_0());
				}
				lv_instruction_0_0=ruleInst
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImageRule());
					}
					set(
						$current,
						"instruction",
						lv_instruction_0_0,
						"org.xtext.demo.mydsl.Demo.Inst");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getImageAccess().getSuite_instSuiteParserRuleCall_1_0());
				}
				lv_suite_inst_1_0=ruleSuite
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImageRule());
					}
					set(
						$current,
						"suite_inst",
						lv_suite_inst_1_0,
						"org.xtext.demo.mydsl.Demo.Suite");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSuite
entryRuleSuite returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSuiteRule()); }
	iv_ruleSuite=ruleSuite
	{ $current=$iv_ruleSuite.current; }
	EOF;

// Rule Suite
ruleSuite returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSuiteAccess().getInstructionInstParserRuleCall_0_0_0());
					}
					lv_instruction_0_0=ruleInst
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSuiteRule());
						}
						set(
							$current,
							"instruction",
							lv_instruction_0_0,
							"org.xtext.demo.mydsl.Demo.Inst");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getSuiteAccess().getSuite_instSuiteParserRuleCall_0_1_0());
					}
					lv_suite_inst_1_0=ruleSuite
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSuiteRule());
						}
						set(
							$current,
							"suite_inst",
							lv_suite_inst_1_0,
							"org.xtext.demo.mydsl.Demo.Suite");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSuiteAccess().getSuiteAction_1(),
					$current);
			}
		)
	)
;

// Entry rule entryRuleInst
entryRuleInst returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstRule()); }
	iv_ruleInst=ruleInst
	{ $current=$iv_ruleInst.current; }
	EOF;

// Rule Inst
ruleInst returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getInstAccess().getGoParserRuleCall_0());
		}
		this_Go_0=ruleGo
		{
			$current = $this_Go_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstAccess().getTurnParserRuleCall_1());
		}
		this_Turn_1=ruleTurn
		{
			$current = $this_Turn_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getInstAccess().getProcedureCallParserRuleCall_2());
		}
		this_ProcedureCall_2=ruleProcedureCall
		{
			$current = $this_ProcedureCall_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGo
entryRuleGo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoRule()); }
	iv_ruleGo=ruleGo
	{ $current=$iv_ruleGo.current; }
	EOF;

// Rule Go
ruleGo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='avancer'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoAccess().getAvancerKeyword_0());
		}
		(
			(
				lv_nombre_1_0=RULE_INT
				{
					newLeafNode(lv_nombre_1_0, grammarAccess.getGoAccess().getNombreINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoRule());
					}
					setWithLastConsumed(
						$current,
						"nombre",
						lv_nombre_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleTurn
entryRuleTurn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTurnRule()); }
	iv_ruleTurn=ruleTurn
	{ $current=$iv_ruleTurn.current; }
	EOF;

// Rule Turn
ruleTurn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTurnAccess().getTlParserRuleCall_0());
		}
		this_Tl_0=ruleTl
		{
			$current = $this_Tl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTurnAccess().getTrParserRuleCall_1());
		}
		this_Tr_1=ruleTr
		{
			$current = $this_Tr_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTl
entryRuleTl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTlRule()); }
	iv_ruleTl=ruleTl
	{ $current=$iv_ruleTl.current; }
	EOF;

// Rule Tl
ruleTl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='gauche'
		{
			newLeafNode(otherlv_0, grammarAccess.getTlAccess().getGaucheKeyword_0());
		}
		(
			(
				lv_nombre_1_0=RULE_INT
				{
					newLeafNode(lv_nombre_1_0, grammarAccess.getTlAccess().getNombreINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTlRule());
					}
					setWithLastConsumed(
						$current,
						"nombre",
						lv_nombre_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleTr
entryRuleTr returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrRule()); }
	iv_ruleTr=ruleTr
	{ $current=$iv_ruleTr.current; }
	EOF;

// Rule Tr
ruleTr returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='droit'
		{
			newLeafNode(otherlv_0, grammarAccess.getTrAccess().getDroitKeyword_0());
		}
		(
			(
				lv_nombre_1_0=RULE_INT
				{
					newLeafNode(lv_nombre_1_0, grammarAccess.getTrAccess().getNombreINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTrRule());
					}
					setWithLastConsumed(
						$current,
						"nombre",
						lv_nombre_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
	)
;

// Entry rule entryRuleProcedure
entryRuleProcedure returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcedureRule()); }
	iv_ruleProcedure=ruleProcedure
	{ $current=$iv_ruleProcedure.current; }
	EOF;

// Rule Procedure
ruleProcedure returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='procedure'
		{
			newLeafNode(otherlv_0, grammarAccess.getProcedureAccess().getProcedureKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcedureRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProcedureAccess().getParametersFormal_parameter_listParserRuleCall_2_0());
				}
				lv_parameters_2_0=ruleformal_parameter_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcedureRule());
					}
					set(
						$current,
						"parameters",
						lv_parameters_2_0,
						"org.xtext.demo.mydsl.Demo.formal_parameter_list");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getProcedureAccess().getImageImageParserRuleCall_3_0());
				}
				lv_image_3_0=ruleImage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcedureRule());
					}
					set(
						$current,
						"image",
						lv_image_3_0,
						"org.xtext.demo.mydsl.Demo.Image");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='finProcedure'
		{
			newLeafNode(otherlv_4, grammarAccess.getProcedureAccess().getFinProcedureKeyword_4());
		}
	)
;

// Entry rule entryRuleformal_parameter_list
entryRuleformal_parameter_list returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFormal_parameter_listRule()); }
	iv_ruleformal_parameter_list=ruleformal_parameter_list
	{ $current=$iv_ruleformal_parameter_list.current; }
	EOF;

// Rule formal_parameter_list
ruleformal_parameter_list returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0=':'
		{
			newLeafNode(otherlv_0, grammarAccess.getFormal_parameter_listAccess().getColonKeyword_0());
		}
		(
			(
				lv_parameter_1_0=RULE_ID
				{
					newLeafNode(lv_parameter_1_0, grammarAccess.getFormal_parameter_listAccess().getParameterIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFormal_parameter_listRule());
					}
					addWithLastConsumed(
						$current,
						"parameter",
						lv_parameter_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getFormal_parameter_listAccess().getColonKeyword_2_0());
			}
			(
				(
					lv_parameter_3_0=RULE_ID
					{
						newLeafNode(lv_parameter_3_0, grammarAccess.getFormal_parameter_listAccess().getParameterIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFormal_parameter_listRule());
						}
						addWithLastConsumed(
							$current,
							"parameter",
							lv_parameter_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleProcedureCall
entryRuleProcedureCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProcedureCallRule()); }
	iv_ruleProcedureCall=ruleProcedureCall
	{ $current=$iv_ruleProcedureCall.current; }
	EOF;

// Rule ProcedureCall
ruleProcedureCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getProcedureCallAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProcedureCallRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProcedureCallAccess().getArgumentsArgument_listParserRuleCall_1_0());
				}
				lv_arguments_1_0=ruleargument_list
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProcedureCallRule());
					}
					set(
						$current,
						"arguments",
						lv_arguments_1_0,
						"org.xtext.demo.mydsl.Demo.argument_list");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleargument_list
entryRuleargument_list returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArgument_listRule()); }
	iv_ruleargument_list=ruleargument_list
	{ $current=$iv_ruleargument_list.current; }
	EOF;

// Rule argument_list
ruleargument_list returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_argument_0_0=RULE_INT
				{
					newLeafNode(lv_argument_0_0, grammarAccess.getArgument_listAccess().getArgumentINTTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArgument_listRule());
					}
					addWithLastConsumed(
						$current,
						"argument",
						lv_argument_0_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		(
			(
				lv_argument_1_0=RULE_INT
				{
					newLeafNode(lv_argument_1_0, grammarAccess.getArgument_listAccess().getArgumentINTTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArgument_listRule());
					}
					addWithLastConsumed(
						$current,
						"argument",
						lv_argument_1_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

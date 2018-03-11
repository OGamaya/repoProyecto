/*
 * generated by Xtext 2.12.0
 */
package edu.uniandes.tour.tourdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class TourDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class TourElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.Tour");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTourAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cLBRACKETTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cNAMETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cTWOPOINTSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameEStringParserRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cT_PANORAMATerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cTWOPOINTSTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cLPARENTISISCUADRADOTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final Assignment cPanoramaAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cPanoramaPanoramaParserRuleCall_9_0 = (RuleCall)cPanoramaAssignment_9.eContents().get(0);
		private final RuleCall cRPARENTISISCUADRADOTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		private final RuleCall cRBRACKETTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		
		//Tour:
		//	{Tour} LBRACKET
		//	NAME TWOPOINTS name=EString COMA
		//	T_PANORAMA TWOPOINTS LPARENTISISCUADRADO
		//	panorama+=Panorama+
		//	RPARENTISISCUADRADO
		//	RBRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//{Tour} LBRACKET NAME TWOPOINTS name=EString COMA T_PANORAMA TWOPOINTS LPARENTISISCUADRADO panorama+=Panorama+
		//RPARENTISISCUADRADO RBRACKET
		public Group getGroup() { return cGroup; }
		
		//{Tour}
		public Action getTourAction_0() { return cTourAction_0; }
		
		//LBRACKET
		public RuleCall getLBRACKETTerminalRuleCall_1() { return cLBRACKETTerminalRuleCall_1; }
		
		//NAME
		public RuleCall getNAMETerminalRuleCall_2() { return cNAMETerminalRuleCall_2; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_3() { return cTWOPOINTSTerminalRuleCall_3; }
		
		//name=EString
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_4_0() { return cNameEStringParserRuleCall_4_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_5() { return cCOMATerminalRuleCall_5; }
		
		//T_PANORAMA
		public RuleCall getT_PANORAMATerminalRuleCall_6() { return cT_PANORAMATerminalRuleCall_6; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_7() { return cTWOPOINTSTerminalRuleCall_7; }
		
		//LPARENTISISCUADRADO
		public RuleCall getLPARENTISISCUADRADOTerminalRuleCall_8() { return cLPARENTISISCUADRADOTerminalRuleCall_8; }
		
		//panorama+=Panorama+
		public Assignment getPanoramaAssignment_9() { return cPanoramaAssignment_9; }
		
		//Panorama
		public RuleCall getPanoramaPanoramaParserRuleCall_9_0() { return cPanoramaPanoramaParserRuleCall_9_0; }
		
		//RPARENTISISCUADRADO
		public RuleCall getRPARENTISISCUADRADOTerminalRuleCall_10() { return cRPARENTISISCUADRADOTerminalRuleCall_10; }
		
		//RBRACKET
		public RuleCall getRBRACKETTerminalRuleCall_11() { return cRBRACKETTerminalRuleCall_11; }
	}
	public class PanoramaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.Panorama");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPanoramaAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cLBRACKETTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cNAMETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cTWOPOINTSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameEStringParserRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cDESCRIPTIONTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cTWOPOINTSTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Assignment cDescriptionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cDescriptionEStringParserRuleCall_8_0 = (RuleCall)cDescriptionAssignment_8.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final RuleCall cT_HOTSPOTTerminalRuleCall_10 = (RuleCall)cGroup.eContents().get(10);
		private final RuleCall cTWOPOINTSTerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cLPARENTISISCUADRADOTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final Assignment cHotspotAssignment_13 = (Assignment)cGroup.eContents().get(13);
		private final RuleCall cHotspotHotspotParserRuleCall_13_0 = (RuleCall)cHotspotAssignment_13.eContents().get(0);
		private final RuleCall cRPARENTISISCUADRADOTerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		private final RuleCall cRBRACKETTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		private final RuleCall cCOMATerminalRuleCall_16 = (RuleCall)cGroup.eContents().get(16);
		
		//Panorama:
		//	{Panorama} LBRACKET
		//	NAME TWOPOINTS name=EString COMA
		//	DESCRIPTION TWOPOINTS description=EString COMA
		//	T_HOTSPOT TWOPOINTS LPARENTISISCUADRADO
		//	hotspot+=Hotspot+
		//	RPARENTISISCUADRADO
		//	RBRACKET COMA?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Panorama} LBRACKET NAME TWOPOINTS name=EString COMA DESCRIPTION TWOPOINTS description=EString COMA T_HOTSPOT TWOPOINTS
		//LPARENTISISCUADRADO hotspot+=Hotspot+ RPARENTISISCUADRADO RBRACKET COMA?
		public Group getGroup() { return cGroup; }
		
		//{Panorama}
		public Action getPanoramaAction_0() { return cPanoramaAction_0; }
		
		//LBRACKET
		public RuleCall getLBRACKETTerminalRuleCall_1() { return cLBRACKETTerminalRuleCall_1; }
		
		//NAME
		public RuleCall getNAMETerminalRuleCall_2() { return cNAMETerminalRuleCall_2; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_3() { return cTWOPOINTSTerminalRuleCall_3; }
		
		//name=EString
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_4_0() { return cNameEStringParserRuleCall_4_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_5() { return cCOMATerminalRuleCall_5; }
		
		//DESCRIPTION
		public RuleCall getDESCRIPTIONTerminalRuleCall_6() { return cDESCRIPTIONTerminalRuleCall_6; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_7() { return cTWOPOINTSTerminalRuleCall_7; }
		
		//description=EString
		public Assignment getDescriptionAssignment_8() { return cDescriptionAssignment_8; }
		
		//EString
		public RuleCall getDescriptionEStringParserRuleCall_8_0() { return cDescriptionEStringParserRuleCall_8_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_9() { return cCOMATerminalRuleCall_9; }
		
		//T_HOTSPOT
		public RuleCall getT_HOTSPOTTerminalRuleCall_10() { return cT_HOTSPOTTerminalRuleCall_10; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_11() { return cTWOPOINTSTerminalRuleCall_11; }
		
		//LPARENTISISCUADRADO
		public RuleCall getLPARENTISISCUADRADOTerminalRuleCall_12() { return cLPARENTISISCUADRADOTerminalRuleCall_12; }
		
		//hotspot+=Hotspot+
		public Assignment getHotspotAssignment_13() { return cHotspotAssignment_13; }
		
		//Hotspot
		public RuleCall getHotspotHotspotParserRuleCall_13_0() { return cHotspotHotspotParserRuleCall_13_0; }
		
		//RPARENTISISCUADRADO
		public RuleCall getRPARENTISISCUADRADOTerminalRuleCall_14() { return cRPARENTISISCUADRADOTerminalRuleCall_14; }
		
		//RBRACKET
		public RuleCall getRBRACKETTerminalRuleCall_15() { return cRBRACKETTerminalRuleCall_15; }
		
		//COMA?
		public RuleCall getCOMATerminalRuleCall_16() { return cCOMATerminalRuleCall_16; }
	}
	public class HotspotElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.Hotspot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cHotspotAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cLBRACKETTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cNAMETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cTWOPOINTSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameEStringParserRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final RuleCall cTOTerminalRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		private final RuleCall cTWOPOINTSTerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final Assignment cToAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cToPanoramaCrossReference_8_0 = (CrossReference)cToAssignment_8.eContents().get(0);
		private final RuleCall cToPanoramaEStringParserRuleCall_8_0_1 = (RuleCall)cToPanoramaCrossReference_8_0.eContents().get(1);
		private final RuleCall cCOMATerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cPositionAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cPositionPositionParserRuleCall_10_0 = (RuleCall)cPositionAssignment_10.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final Assignment cRotationAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRotationRotationParserRuleCall_12_0 = (RuleCall)cRotationAssignment_12.eContents().get(0);
		private final RuleCall cRBRACKETTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final RuleCall cCOMATerminalRuleCall_14 = (RuleCall)cGroup.eContents().get(14);
		
		//Hotspot:
		//	{Hotspot} LBRACKET
		//	NAME TWOPOINTS name=EString COMA
		//	TO TWOPOINTS to=[Panorama|EString] COMA
		//	position=Position COMA
		//	rotation=Rotation
		//	RBRACKET COMA?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Hotspot} LBRACKET NAME TWOPOINTS name=EString COMA TO TWOPOINTS to=[Panorama|EString] COMA position=Position COMA
		//rotation=Rotation RBRACKET COMA?
		public Group getGroup() { return cGroup; }
		
		//{Hotspot}
		public Action getHotspotAction_0() { return cHotspotAction_0; }
		
		//LBRACKET
		public RuleCall getLBRACKETTerminalRuleCall_1() { return cLBRACKETTerminalRuleCall_1; }
		
		//NAME
		public RuleCall getNAMETerminalRuleCall_2() { return cNAMETerminalRuleCall_2; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_3() { return cTWOPOINTSTerminalRuleCall_3; }
		
		//name=EString
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_4_0() { return cNameEStringParserRuleCall_4_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_5() { return cCOMATerminalRuleCall_5; }
		
		//TO
		public RuleCall getTOTerminalRuleCall_6() { return cTOTerminalRuleCall_6; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_7() { return cTWOPOINTSTerminalRuleCall_7; }
		
		//to=[Panorama|EString]
		public Assignment getToAssignment_8() { return cToAssignment_8; }
		
		//[Panorama|EString]
		public CrossReference getToPanoramaCrossReference_8_0() { return cToPanoramaCrossReference_8_0; }
		
		//EString
		public RuleCall getToPanoramaEStringParserRuleCall_8_0_1() { return cToPanoramaEStringParserRuleCall_8_0_1; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_9() { return cCOMATerminalRuleCall_9; }
		
		//position=Position
		public Assignment getPositionAssignment_10() { return cPositionAssignment_10; }
		
		//Position
		public RuleCall getPositionPositionParserRuleCall_10_0() { return cPositionPositionParserRuleCall_10_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_11() { return cCOMATerminalRuleCall_11; }
		
		//rotation=Rotation
		public Assignment getRotationAssignment_12() { return cRotationAssignment_12; }
		
		//Rotation
		public RuleCall getRotationRotationParserRuleCall_12_0() { return cRotationRotationParserRuleCall_12_0; }
		
		//RBRACKET
		public RuleCall getRBRACKETTerminalRuleCall_13() { return cRBRACKETTerminalRuleCall_13; }
		
		//COMA?
		public RuleCall getCOMATerminalRuleCall_14() { return cCOMATerminalRuleCall_14; }
	}
	public class RotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.Rotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRotationAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cT_ROTATIONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cTWOPOINTSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cLBRACKETTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cROTXTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cTWOPOINTSTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cXAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cXEDoubleParserRuleCall_6_0 = (RuleCall)cXAssignment_6.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cROTYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cTWOPOINTSTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cYAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cYEDoubleParserRuleCall_10_0 = (RuleCall)cYAssignment_10.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cROTZTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cTWOPOINTSTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final Assignment cZAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cZEDoubleParserRuleCall_14_0 = (RuleCall)cZAssignment_14.eContents().get(0);
		private final RuleCall cRBRACKETTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		
		//Rotation:
		//	{Rotation} T_ROTATION TWOPOINTS LBRACKET
		//	ROTX TWOPOINTS x=EDouble? COMA
		//	ROTY TWOPOINTS y=EDouble? COMA
		//	ROTZ TWOPOINTS z=EDouble?
		//	RBRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//{Rotation} T_ROTATION TWOPOINTS LBRACKET ROTX TWOPOINTS x=EDouble? COMA ROTY TWOPOINTS y=EDouble? COMA ROTZ TWOPOINTS
		//z=EDouble? RBRACKET
		public Group getGroup() { return cGroup; }
		
		//{Rotation}
		public Action getRotationAction_0() { return cRotationAction_0; }
		
		//T_ROTATION
		public RuleCall getT_ROTATIONTerminalRuleCall_1() { return cT_ROTATIONTerminalRuleCall_1; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_2() { return cTWOPOINTSTerminalRuleCall_2; }
		
		//LBRACKET
		public RuleCall getLBRACKETTerminalRuleCall_3() { return cLBRACKETTerminalRuleCall_3; }
		
		//ROTX
		public RuleCall getROTXTerminalRuleCall_4() { return cROTXTerminalRuleCall_4; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_5() { return cTWOPOINTSTerminalRuleCall_5; }
		
		//x=EDouble?
		public Assignment getXAssignment_6() { return cXAssignment_6; }
		
		//EDouble
		public RuleCall getXEDoubleParserRuleCall_6_0() { return cXEDoubleParserRuleCall_6_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_7() { return cCOMATerminalRuleCall_7; }
		
		//ROTY
		public RuleCall getROTYTerminalRuleCall_8() { return cROTYTerminalRuleCall_8; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_9() { return cTWOPOINTSTerminalRuleCall_9; }
		
		//y=EDouble?
		public Assignment getYAssignment_10() { return cYAssignment_10; }
		
		//EDouble
		public RuleCall getYEDoubleParserRuleCall_10_0() { return cYEDoubleParserRuleCall_10_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_11() { return cCOMATerminalRuleCall_11; }
		
		//ROTZ
		public RuleCall getROTZTerminalRuleCall_12() { return cROTZTerminalRuleCall_12; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_13() { return cTWOPOINTSTerminalRuleCall_13; }
		
		//z=EDouble?
		public Assignment getZAssignment_14() { return cZAssignment_14; }
		
		//EDouble
		public RuleCall getZEDoubleParserRuleCall_14_0() { return cZEDoubleParserRuleCall_14_0; }
		
		//RBRACKET
		public RuleCall getRBRACKETTerminalRuleCall_15() { return cRBRACKETTerminalRuleCall_15; }
	}
	public class PositionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.Position");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPositionAction_0 = (Action)cGroup.eContents().get(0);
		private final RuleCall cT_POSITIONTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cTWOPOINTSTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cLBRACKETTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cPOSXTerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final RuleCall cTWOPOINTSTerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Assignment cXAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cXEDoubleParserRuleCall_6_0 = (RuleCall)cXAssignment_6.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_7 = (RuleCall)cGroup.eContents().get(7);
		private final RuleCall cPOSYTerminalRuleCall_8 = (RuleCall)cGroup.eContents().get(8);
		private final RuleCall cTWOPOINTSTerminalRuleCall_9 = (RuleCall)cGroup.eContents().get(9);
		private final Assignment cYAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cYEDoubleParserRuleCall_10_0 = (RuleCall)cYAssignment_10.eContents().get(0);
		private final RuleCall cCOMATerminalRuleCall_11 = (RuleCall)cGroup.eContents().get(11);
		private final RuleCall cPOSZTerminalRuleCall_12 = (RuleCall)cGroup.eContents().get(12);
		private final RuleCall cTWOPOINTSTerminalRuleCall_13 = (RuleCall)cGroup.eContents().get(13);
		private final Assignment cZAssignment_14 = (Assignment)cGroup.eContents().get(14);
		private final RuleCall cZEDoubleParserRuleCall_14_0 = (RuleCall)cZAssignment_14.eContents().get(0);
		private final RuleCall cRBRACKETTerminalRuleCall_15 = (RuleCall)cGroup.eContents().get(15);
		
		//Position:
		//	{Position} T_POSITION TWOPOINTS LBRACKET
		//	POSX TWOPOINTS x=EDouble? COMA
		//	POSY TWOPOINTS y=EDouble? COMA
		//	POSZ TWOPOINTS z=EDouble?
		//	RBRACKET;
		@Override public ParserRule getRule() { return rule; }
		
		//{Position} T_POSITION TWOPOINTS LBRACKET POSX TWOPOINTS x=EDouble? COMA POSY TWOPOINTS y=EDouble? COMA POSZ TWOPOINTS
		//z=EDouble? RBRACKET
		public Group getGroup() { return cGroup; }
		
		//{Position}
		public Action getPositionAction_0() { return cPositionAction_0; }
		
		//T_POSITION
		public RuleCall getT_POSITIONTerminalRuleCall_1() { return cT_POSITIONTerminalRuleCall_1; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_2() { return cTWOPOINTSTerminalRuleCall_2; }
		
		//LBRACKET
		public RuleCall getLBRACKETTerminalRuleCall_3() { return cLBRACKETTerminalRuleCall_3; }
		
		//POSX
		public RuleCall getPOSXTerminalRuleCall_4() { return cPOSXTerminalRuleCall_4; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_5() { return cTWOPOINTSTerminalRuleCall_5; }
		
		//x=EDouble?
		public Assignment getXAssignment_6() { return cXAssignment_6; }
		
		//EDouble
		public RuleCall getXEDoubleParserRuleCall_6_0() { return cXEDoubleParserRuleCall_6_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_7() { return cCOMATerminalRuleCall_7; }
		
		//POSY
		public RuleCall getPOSYTerminalRuleCall_8() { return cPOSYTerminalRuleCall_8; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_9() { return cTWOPOINTSTerminalRuleCall_9; }
		
		//y=EDouble?
		public Assignment getYAssignment_10() { return cYAssignment_10; }
		
		//EDouble
		public RuleCall getYEDoubleParserRuleCall_10_0() { return cYEDoubleParserRuleCall_10_0; }
		
		//COMA
		public RuleCall getCOMATerminalRuleCall_11() { return cCOMATerminalRuleCall_11; }
		
		//POSZ
		public RuleCall getPOSZTerminalRuleCall_12() { return cPOSZTerminalRuleCall_12; }
		
		//TWOPOINTS
		public RuleCall getTWOPOINTSTerminalRuleCall_13() { return cTWOPOINTSTerminalRuleCall_13; }
		
		//z=EDouble?
		public Assignment getZAssignment_14() { return cZAssignment_14; }
		
		//EDouble
		public RuleCall getZEDoubleParserRuleCall_14_0() { return cZEDoubleParserRuleCall_14_0; }
		
		//RBRACKET
		public RuleCall getRBRACKETTerminalRuleCall_15() { return cRBRACKETTerminalRuleCall_15; }
	}
	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.EInt");
		private final RuleCall cINTTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EInt ecore::EInt:
		//	INT;
		@Override public ParserRule getRule() { return rule; }
		
		//INT
		public RuleCall getINTTerminalRuleCall() { return cINTTerminalRuleCall; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble ecore::EDouble:
		//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT (('E' | 'e') '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//(('E' | 'e') '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'E' | 'e'
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }
		
		//'E'
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }
		
		//'e'
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final TourElements pTour;
	private final PanoramaElements pPanorama;
	private final HotspotElements pHotspot;
	private final RotationElements pRotation;
	private final PositionElements pPosition;
	private final EIntElements pEInt;
	private final EDoubleElements pEDouble;
	private final EStringElements pEString;
	private final TerminalRule tLBRACKET;
	private final TerminalRule tRBRACKET;
	private final TerminalRule tLPARENTISISCUADRADO;
	private final TerminalRule tRPARENTISISCUADRADO;
	private final TerminalRule tCOMA;
	private final TerminalRule tTWOPOINTS;
	private final TerminalRule tNAME;
	private final TerminalRule tT_PANORAMA;
	private final TerminalRule tDESCRIPTION;
	private final TerminalRule tT_HOTSPOT;
	private final TerminalRule tTO;
	private final TerminalRule tT_POSITION;
	private final TerminalRule tT_ROTATION;
	private final TerminalRule tPOSX;
	private final TerminalRule tPOSY;
	private final TerminalRule tPOSZ;
	private final TerminalRule tROTX;
	private final TerminalRule tROTY;
	private final TerminalRule tROTZ;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public TourDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pTour = new TourElements();
		this.pPanorama = new PanoramaElements();
		this.pHotspot = new HotspotElements();
		this.pRotation = new RotationElements();
		this.pPosition = new PositionElements();
		this.pEInt = new EIntElements();
		this.pEDouble = new EDoubleElements();
		this.pEString = new EStringElements();
		this.tLBRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.LBRACKET");
		this.tRBRACKET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.RBRACKET");
		this.tLPARENTISISCUADRADO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.LPARENTISISCUADRADO");
		this.tRPARENTISISCUADRADO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.RPARENTISISCUADRADO");
		this.tCOMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.COMA");
		this.tTWOPOINTS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.TWOPOINTS");
		this.tNAME = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.NAME");
		this.tT_PANORAMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.T_PANORAMA");
		this.tDESCRIPTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.DESCRIPTION");
		this.tT_HOTSPOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.T_HOTSPOT");
		this.tTO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.TO");
		this.tT_POSITION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.T_POSITION");
		this.tT_ROTATION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.T_ROTATION");
		this.tPOSX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.POSX");
		this.tPOSY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.POSY");
		this.tPOSZ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.POSZ");
		this.tROTX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.ROTX");
		this.tROTY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.ROTY");
		this.tROTZ = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "edu.uniandes.tour.tourdsl.TourDsl.ROTZ");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("edu.uniandes.tour.tourdsl.TourDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Tour:
	//	{Tour} LBRACKET
	//	NAME TWOPOINTS name=EString COMA
	//	T_PANORAMA TWOPOINTS LPARENTISISCUADRADO
	//	panorama+=Panorama+
	//	RPARENTISISCUADRADO
	//	RBRACKET;
	public TourElements getTourAccess() {
		return pTour;
	}
	
	public ParserRule getTourRule() {
		return getTourAccess().getRule();
	}
	
	//Panorama:
	//	{Panorama} LBRACKET
	//	NAME TWOPOINTS name=EString COMA
	//	DESCRIPTION TWOPOINTS description=EString COMA
	//	T_HOTSPOT TWOPOINTS LPARENTISISCUADRADO
	//	hotspot+=Hotspot+
	//	RPARENTISISCUADRADO
	//	RBRACKET COMA?;
	public PanoramaElements getPanoramaAccess() {
		return pPanorama;
	}
	
	public ParserRule getPanoramaRule() {
		return getPanoramaAccess().getRule();
	}
	
	//Hotspot:
	//	{Hotspot} LBRACKET
	//	NAME TWOPOINTS name=EString COMA
	//	TO TWOPOINTS to=[Panorama|EString] COMA
	//	position=Position COMA
	//	rotation=Rotation
	//	RBRACKET COMA?;
	public HotspotElements getHotspotAccess() {
		return pHotspot;
	}
	
	public ParserRule getHotspotRule() {
		return getHotspotAccess().getRule();
	}
	
	//Rotation:
	//	{Rotation} T_ROTATION TWOPOINTS LBRACKET
	//	ROTX TWOPOINTS x=EDouble? COMA
	//	ROTY TWOPOINTS y=EDouble? COMA
	//	ROTZ TWOPOINTS z=EDouble?
	//	RBRACKET;
	public RotationElements getRotationAccess() {
		return pRotation;
	}
	
	public ParserRule getRotationRule() {
		return getRotationAccess().getRule();
	}
	
	//Position:
	//	{Position} T_POSITION TWOPOINTS LBRACKET
	//	POSX TWOPOINTS x=EDouble? COMA
	//	POSY TWOPOINTS y=EDouble? COMA
	//	POSZ TWOPOINTS z=EDouble?
	//	RBRACKET;
	public PositionElements getPositionAccess() {
		return pPosition;
	}
	
	public ParserRule getPositionRule() {
		return getPositionAccess().getRule();
	}
	
	//EInt ecore::EInt:
	//	INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}
	
	//EDouble ecore::EDouble:
	//	'-'? INT? '.' INT (('E' | 'e') '-'? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal LBRACKET:
	//	"{";
	public TerminalRule getLBRACKETRule() {
		return tLBRACKET;
	}
	
	//terminal RBRACKET:
	//	"}";
	public TerminalRule getRBRACKETRule() {
		return tRBRACKET;
	}
	
	//terminal LPARENTISISCUADRADO:
	//	"[";
	public TerminalRule getLPARENTISISCUADRADORule() {
		return tLPARENTISISCUADRADO;
	}
	
	//terminal RPARENTISISCUADRADO:
	//	"]";
	public TerminalRule getRPARENTISISCUADRADORule() {
		return tRPARENTISISCUADRADO;
	}
	
	//terminal COMA:
	//	",";
	public TerminalRule getCOMARule() {
		return tCOMA;
	}
	
	//terminal TWOPOINTS:
	//	":";
	public TerminalRule getTWOPOINTSRule() {
		return tTWOPOINTS;
	}
	
	//terminal NAME:
	//	"name";
	public TerminalRule getNAMERule() {
		return tNAME;
	}
	
	//terminal T_PANORAMA:
	//	"panoramas";
	public TerminalRule getT_PANORAMARule() {
		return tT_PANORAMA;
	}
	
	//terminal DESCRIPTION:
	//	"description";
	public TerminalRule getDESCRIPTIONRule() {
		return tDESCRIPTION;
	}
	
	//terminal T_HOTSPOT:
	//	"hotspots";
	public TerminalRule getT_HOTSPOTRule() {
		return tT_HOTSPOT;
	}
	
	//terminal TO:
	//	"to";
	public TerminalRule getTORule() {
		return tTO;
	}
	
	//terminal T_POSITION:
	//	"position";
	public TerminalRule getT_POSITIONRule() {
		return tT_POSITION;
	}
	
	//terminal T_ROTATION:
	//	"rotation";
	public TerminalRule getT_ROTATIONRule() {
		return tT_ROTATION;
	}
	
	//terminal POSX:
	//	"posx";
	public TerminalRule getPOSXRule() {
		return tPOSX;
	}
	
	//terminal POSY:
	//	"posy";
	public TerminalRule getPOSYRule() {
		return tPOSY;
	}
	
	//terminal POSZ:
	//	"posz";
	public TerminalRule getPOSZRule() {
		return tPOSZ;
	}
	
	//terminal ROTX:
	//	"rotx";
	public TerminalRule getROTXRule() {
		return tROTX;
	}
	
	//terminal ROTY:
	//	"roty";
	public TerminalRule getROTYRule() {
		return tROTY;
	}
	
	//terminal ROTZ:
	//	"rotz";
	public TerminalRule getROTZRule() {
		return tROTZ;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

package edu.uniandes.tour.tourdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.uniandes.tour.tourdsl.services.TourDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTourDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LBRACKET", "RULE_NAME", "RULE_TWOPOINTS", "RULE_COMA", "RULE_T_PANORAMA", "RULE_LPARENTISISCUADRADO", "RULE_RPARENTISISCUADRADO", "RULE_RBRACKET", "RULE_DESCRIPTION", "RULE_T_HOTSPOT", "RULE_TO", "RULE_T_ROTATION", "RULE_ROTX", "RULE_ROTY", "RULE_ROTZ", "RULE_T_POSITION", "RULE_POSX", "RULE_POSY", "RULE_POSZ", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_LBRACKET=4;
    public static final int RULE_COMA=7;
    public static final int RULE_TO=14;
    public static final int RULE_NAME=5;
    public static final int RULE_T_HOTSPOT=13;
    public static final int RULE_STRING=24;
    public static final int RULE_ROTX=16;
    public static final int RULE_ROTY=17;
    public static final int RULE_ROTZ=18;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_RPARENTISISCUADRADO=10;
    public static final int T__33=33;
    public static final int RULE_LPARENTISISCUADRADO=9;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_T_PANORAMA=8;
    public static final int RULE_T_POSITION=19;
    public static final int RULE_POSX=20;
    public static final int RULE_T_ROTATION=15;
    public static final int RULE_ID=25;
    public static final int RULE_WS=28;
    public static final int RULE_DESCRIPTION=12;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_POSZ=22;
    public static final int RULE_POSY=21;
    public static final int RULE_INT=23;
    public static final int RULE_TWOPOINTS=6;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_RBRACKET=11;

    // delegates
    // delegators


        public InternalTourDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTourDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTourDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTourDsl.g"; }



     	private TourDslGrammarAccess grammarAccess;

        public InternalTourDslParser(TokenStream input, TourDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Tour";
       	}

       	@Override
       	protected TourDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTour"
    // InternalTourDsl.g:64:1: entryRuleTour returns [EObject current=null] : iv_ruleTour= ruleTour EOF ;
    public final EObject entryRuleTour() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTour = null;


        try {
            // InternalTourDsl.g:64:45: (iv_ruleTour= ruleTour EOF )
            // InternalTourDsl.g:65:2: iv_ruleTour= ruleTour EOF
            {
             newCompositeNode(grammarAccess.getTourRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTour=ruleTour();

            state._fsp--;

             current =iv_ruleTour; 
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
    // $ANTLR end "entryRuleTour"


    // $ANTLR start "ruleTour"
    // InternalTourDsl.g:71:1: ruleTour returns [EObject current=null] : ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_T_PANORAMA_6= RULE_T_PANORAMA this_TWOPOINTS_7= RULE_TWOPOINTS this_LPARENTISISCUADRADO_8= RULE_LPARENTISISCUADRADO ( (lv_panorama_9_0= rulePanorama ) )+ this_RPARENTISISCUADRADO_10= RULE_RPARENTISISCUADRADO this_RBRACKET_11= RULE_RBRACKET ) ;
    public final EObject ruleTour() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_1=null;
        Token this_NAME_2=null;
        Token this_TWOPOINTS_3=null;
        Token this_COMA_5=null;
        Token this_T_PANORAMA_6=null;
        Token this_TWOPOINTS_7=null;
        Token this_LPARENTISISCUADRADO_8=null;
        Token this_RPARENTISISCUADRADO_10=null;
        Token this_RBRACKET_11=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_panorama_9_0 = null;



        	enterRule();

        try {
            // InternalTourDsl.g:77:2: ( ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_T_PANORAMA_6= RULE_T_PANORAMA this_TWOPOINTS_7= RULE_TWOPOINTS this_LPARENTISISCUADRADO_8= RULE_LPARENTISISCUADRADO ( (lv_panorama_9_0= rulePanorama ) )+ this_RPARENTISISCUADRADO_10= RULE_RPARENTISISCUADRADO this_RBRACKET_11= RULE_RBRACKET ) )
            // InternalTourDsl.g:78:2: ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_T_PANORAMA_6= RULE_T_PANORAMA this_TWOPOINTS_7= RULE_TWOPOINTS this_LPARENTISISCUADRADO_8= RULE_LPARENTISISCUADRADO ( (lv_panorama_9_0= rulePanorama ) )+ this_RPARENTISISCUADRADO_10= RULE_RPARENTISISCUADRADO this_RBRACKET_11= RULE_RBRACKET )
            {
            // InternalTourDsl.g:78:2: ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_T_PANORAMA_6= RULE_T_PANORAMA this_TWOPOINTS_7= RULE_TWOPOINTS this_LPARENTISISCUADRADO_8= RULE_LPARENTISISCUADRADO ( (lv_panorama_9_0= rulePanorama ) )+ this_RPARENTISISCUADRADO_10= RULE_RPARENTISISCUADRADO this_RBRACKET_11= RULE_RBRACKET )
            // InternalTourDsl.g:79:3: () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_T_PANORAMA_6= RULE_T_PANORAMA this_TWOPOINTS_7= RULE_TWOPOINTS this_LPARENTISISCUADRADO_8= RULE_LPARENTISISCUADRADO ( (lv_panorama_9_0= rulePanorama ) )+ this_RPARENTISISCUADRADO_10= RULE_RPARENTISISCUADRADO this_RBRACKET_11= RULE_RBRACKET
            {
            // InternalTourDsl.g:79:3: ()
            // InternalTourDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTourAccess().getTourAction_0(),
            					current);
            			

            }

            this_LBRACKET_1=(Token)match(input,RULE_LBRACKET,FOLLOW_3); 

            			newLeafNode(this_LBRACKET_1, grammarAccess.getTourAccess().getLBRACKETTerminalRuleCall_1());
            		
            this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_2, grammarAccess.getTourAccess().getNAMETerminalRuleCall_2());
            		
            this_TWOPOINTS_3=(Token)match(input,RULE_TWOPOINTS,FOLLOW_5); 

            			newLeafNode(this_TWOPOINTS_3, grammarAccess.getTourAccess().getTWOPOINTSTerminalRuleCall_3());
            		
            // InternalTourDsl.g:98:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTourDsl.g:99:4: (lv_name_4_0= ruleEString )
            {
            // InternalTourDsl.g:99:4: (lv_name_4_0= ruleEString )
            // InternalTourDsl.g:100:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTourAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTourRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"edu.uniandes.tour.tourdsl.TourDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_5=(Token)match(input,RULE_COMA,FOLLOW_7); 

            			newLeafNode(this_COMA_5, grammarAccess.getTourAccess().getCOMATerminalRuleCall_5());
            		
            this_T_PANORAMA_6=(Token)match(input,RULE_T_PANORAMA,FOLLOW_4); 

            			newLeafNode(this_T_PANORAMA_6, grammarAccess.getTourAccess().getT_PANORAMATerminalRuleCall_6());
            		
            this_TWOPOINTS_7=(Token)match(input,RULE_TWOPOINTS,FOLLOW_8); 

            			newLeafNode(this_TWOPOINTS_7, grammarAccess.getTourAccess().getTWOPOINTSTerminalRuleCall_7());
            		
            this_LPARENTISISCUADRADO_8=(Token)match(input,RULE_LPARENTISISCUADRADO,FOLLOW_9); 

            			newLeafNode(this_LPARENTISISCUADRADO_8, grammarAccess.getTourAccess().getLPARENTISISCUADRADOTerminalRuleCall_8());
            		
            // InternalTourDsl.g:133:3: ( (lv_panorama_9_0= rulePanorama ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_LBRACKET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTourDsl.g:134:4: (lv_panorama_9_0= rulePanorama )
            	    {
            	    // InternalTourDsl.g:134:4: (lv_panorama_9_0= rulePanorama )
            	    // InternalTourDsl.g:135:5: lv_panorama_9_0= rulePanorama
            	    {

            	    					newCompositeNode(grammarAccess.getTourAccess().getPanoramaPanoramaParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_panorama_9_0=rulePanorama();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTourRule());
            	    					}
            	    					add(
            	    						current,
            	    						"panorama",
            	    						lv_panorama_9_0,
            	    						"edu.uniandes.tour.tourdsl.TourDsl.Panorama");
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

            this_RPARENTISISCUADRADO_10=(Token)match(input,RULE_RPARENTISISCUADRADO,FOLLOW_11); 

            			newLeafNode(this_RPARENTISISCUADRADO_10, grammarAccess.getTourAccess().getRPARENTISISCUADRADOTerminalRuleCall_10());
            		
            this_RBRACKET_11=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

            			newLeafNode(this_RBRACKET_11, grammarAccess.getTourAccess().getRBRACKETTerminalRuleCall_11());
            		

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
    // $ANTLR end "ruleTour"


    // $ANTLR start "entryRulePanorama"
    // InternalTourDsl.g:164:1: entryRulePanorama returns [EObject current=null] : iv_rulePanorama= rulePanorama EOF ;
    public final EObject entryRulePanorama() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanorama = null;


        try {
            // InternalTourDsl.g:164:49: (iv_rulePanorama= rulePanorama EOF )
            // InternalTourDsl.g:165:2: iv_rulePanorama= rulePanorama EOF
            {
             newCompositeNode(grammarAccess.getPanoramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePanorama=rulePanorama();

            state._fsp--;

             current =iv_rulePanorama; 
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
    // $ANTLR end "entryRulePanorama"


    // $ANTLR start "rulePanorama"
    // InternalTourDsl.g:171:1: rulePanorama returns [EObject current=null] : ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_DESCRIPTION_6= RULE_DESCRIPTION this_TWOPOINTS_7= RULE_TWOPOINTS ( (lv_description_8_0= ruleEString ) ) this_COMA_9= RULE_COMA this_T_HOTSPOT_10= RULE_T_HOTSPOT this_TWOPOINTS_11= RULE_TWOPOINTS this_LPARENTISISCUADRADO_12= RULE_LPARENTISISCUADRADO ( (lv_hotspot_13_0= ruleHotspot ) )+ this_RPARENTISISCUADRADO_14= RULE_RPARENTISISCUADRADO this_RBRACKET_15= RULE_RBRACKET (this_COMA_16= RULE_COMA )? ) ;
    public final EObject rulePanorama() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_1=null;
        Token this_NAME_2=null;
        Token this_TWOPOINTS_3=null;
        Token this_COMA_5=null;
        Token this_DESCRIPTION_6=null;
        Token this_TWOPOINTS_7=null;
        Token this_COMA_9=null;
        Token this_T_HOTSPOT_10=null;
        Token this_TWOPOINTS_11=null;
        Token this_LPARENTISISCUADRADO_12=null;
        Token this_RPARENTISISCUADRADO_14=null;
        Token this_RBRACKET_15=null;
        Token this_COMA_16=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        EObject lv_hotspot_13_0 = null;



        	enterRule();

        try {
            // InternalTourDsl.g:177:2: ( ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_DESCRIPTION_6= RULE_DESCRIPTION this_TWOPOINTS_7= RULE_TWOPOINTS ( (lv_description_8_0= ruleEString ) ) this_COMA_9= RULE_COMA this_T_HOTSPOT_10= RULE_T_HOTSPOT this_TWOPOINTS_11= RULE_TWOPOINTS this_LPARENTISISCUADRADO_12= RULE_LPARENTISISCUADRADO ( (lv_hotspot_13_0= ruleHotspot ) )+ this_RPARENTISISCUADRADO_14= RULE_RPARENTISISCUADRADO this_RBRACKET_15= RULE_RBRACKET (this_COMA_16= RULE_COMA )? ) )
            // InternalTourDsl.g:178:2: ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_DESCRIPTION_6= RULE_DESCRIPTION this_TWOPOINTS_7= RULE_TWOPOINTS ( (lv_description_8_0= ruleEString ) ) this_COMA_9= RULE_COMA this_T_HOTSPOT_10= RULE_T_HOTSPOT this_TWOPOINTS_11= RULE_TWOPOINTS this_LPARENTISISCUADRADO_12= RULE_LPARENTISISCUADRADO ( (lv_hotspot_13_0= ruleHotspot ) )+ this_RPARENTISISCUADRADO_14= RULE_RPARENTISISCUADRADO this_RBRACKET_15= RULE_RBRACKET (this_COMA_16= RULE_COMA )? )
            {
            // InternalTourDsl.g:178:2: ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_DESCRIPTION_6= RULE_DESCRIPTION this_TWOPOINTS_7= RULE_TWOPOINTS ( (lv_description_8_0= ruleEString ) ) this_COMA_9= RULE_COMA this_T_HOTSPOT_10= RULE_T_HOTSPOT this_TWOPOINTS_11= RULE_TWOPOINTS this_LPARENTISISCUADRADO_12= RULE_LPARENTISISCUADRADO ( (lv_hotspot_13_0= ruleHotspot ) )+ this_RPARENTISISCUADRADO_14= RULE_RPARENTISISCUADRADO this_RBRACKET_15= RULE_RBRACKET (this_COMA_16= RULE_COMA )? )
            // InternalTourDsl.g:179:3: () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_DESCRIPTION_6= RULE_DESCRIPTION this_TWOPOINTS_7= RULE_TWOPOINTS ( (lv_description_8_0= ruleEString ) ) this_COMA_9= RULE_COMA this_T_HOTSPOT_10= RULE_T_HOTSPOT this_TWOPOINTS_11= RULE_TWOPOINTS this_LPARENTISISCUADRADO_12= RULE_LPARENTISISCUADRADO ( (lv_hotspot_13_0= ruleHotspot ) )+ this_RPARENTISISCUADRADO_14= RULE_RPARENTISISCUADRADO this_RBRACKET_15= RULE_RBRACKET (this_COMA_16= RULE_COMA )?
            {
            // InternalTourDsl.g:179:3: ()
            // InternalTourDsl.g:180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPanoramaAccess().getPanoramaAction_0(),
            					current);
            			

            }

            this_LBRACKET_1=(Token)match(input,RULE_LBRACKET,FOLLOW_3); 

            			newLeafNode(this_LBRACKET_1, grammarAccess.getPanoramaAccess().getLBRACKETTerminalRuleCall_1());
            		
            this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_2, grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_2());
            		
            this_TWOPOINTS_3=(Token)match(input,RULE_TWOPOINTS,FOLLOW_5); 

            			newLeafNode(this_TWOPOINTS_3, grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_3());
            		
            // InternalTourDsl.g:198:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTourDsl.g:199:4: (lv_name_4_0= ruleEString )
            {
            // InternalTourDsl.g:199:4: (lv_name_4_0= ruleEString )
            // InternalTourDsl.g:200:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"edu.uniandes.tour.tourdsl.TourDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_5=(Token)match(input,RULE_COMA,FOLLOW_12); 

            			newLeafNode(this_COMA_5, grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_5());
            		
            this_DESCRIPTION_6=(Token)match(input,RULE_DESCRIPTION,FOLLOW_4); 

            			newLeafNode(this_DESCRIPTION_6, grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_6());
            		
            this_TWOPOINTS_7=(Token)match(input,RULE_TWOPOINTS,FOLLOW_5); 

            			newLeafNode(this_TWOPOINTS_7, grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_7());
            		
            // InternalTourDsl.g:229:3: ( (lv_description_8_0= ruleEString ) )
            // InternalTourDsl.g:230:4: (lv_description_8_0= ruleEString )
            {
            // InternalTourDsl.g:230:4: (lv_description_8_0= ruleEString )
            // InternalTourDsl.g:231:5: lv_description_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPanoramaAccess().getDescriptionEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_6);
            lv_description_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_8_0,
            						"edu.uniandes.tour.tourdsl.TourDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_13); 

            			newLeafNode(this_COMA_9, grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_9());
            		
            this_T_HOTSPOT_10=(Token)match(input,RULE_T_HOTSPOT,FOLLOW_4); 

            			newLeafNode(this_T_HOTSPOT_10, grammarAccess.getPanoramaAccess().getT_HOTSPOTTerminalRuleCall_10());
            		
            this_TWOPOINTS_11=(Token)match(input,RULE_TWOPOINTS,FOLLOW_8); 

            			newLeafNode(this_TWOPOINTS_11, grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_11());
            		
            this_LPARENTISISCUADRADO_12=(Token)match(input,RULE_LPARENTISISCUADRADO,FOLLOW_9); 

            			newLeafNode(this_LPARENTISISCUADRADO_12, grammarAccess.getPanoramaAccess().getLPARENTISISCUADRADOTerminalRuleCall_12());
            		
            // InternalTourDsl.g:264:3: ( (lv_hotspot_13_0= ruleHotspot ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_LBRACKET) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTourDsl.g:265:4: (lv_hotspot_13_0= ruleHotspot )
            	    {
            	    // InternalTourDsl.g:265:4: (lv_hotspot_13_0= ruleHotspot )
            	    // InternalTourDsl.g:266:5: lv_hotspot_13_0= ruleHotspot
            	    {

            	    					newCompositeNode(grammarAccess.getPanoramaAccess().getHotspotHotspotParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_hotspot_13_0=ruleHotspot();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPanoramaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"hotspot",
            	    						lv_hotspot_13_0,
            	    						"edu.uniandes.tour.tourdsl.TourDsl.Hotspot");
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

            this_RPARENTISISCUADRADO_14=(Token)match(input,RULE_RPARENTISISCUADRADO,FOLLOW_11); 

            			newLeafNode(this_RPARENTISISCUADRADO_14, grammarAccess.getPanoramaAccess().getRPARENTISISCUADRADOTerminalRuleCall_14());
            		
            this_RBRACKET_15=(Token)match(input,RULE_RBRACKET,FOLLOW_14); 

            			newLeafNode(this_RBRACKET_15, grammarAccess.getPanoramaAccess().getRBRACKETTerminalRuleCall_15());
            		
            // InternalTourDsl.g:291:3: (this_COMA_16= RULE_COMA )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMA) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTourDsl.g:292:4: this_COMA_16= RULE_COMA
                    {
                    this_COMA_16=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_16, grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_16());
                    			

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
    // $ANTLR end "rulePanorama"


    // $ANTLR start "entryRuleHotspot"
    // InternalTourDsl.g:301:1: entryRuleHotspot returns [EObject current=null] : iv_ruleHotspot= ruleHotspot EOF ;
    public final EObject entryRuleHotspot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHotspot = null;


        try {
            // InternalTourDsl.g:301:48: (iv_ruleHotspot= ruleHotspot EOF )
            // InternalTourDsl.g:302:2: iv_ruleHotspot= ruleHotspot EOF
            {
             newCompositeNode(grammarAccess.getHotspotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHotspot=ruleHotspot();

            state._fsp--;

             current =iv_ruleHotspot; 
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
    // $ANTLR end "entryRuleHotspot"


    // $ANTLR start "ruleHotspot"
    // InternalTourDsl.g:308:1: ruleHotspot returns [EObject current=null] : ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_TO_6= RULE_TO this_TWOPOINTS_7= RULE_TWOPOINTS ( ( ruleEString ) ) this_COMA_9= RULE_COMA ( (lv_position_10_0= rulePosition ) ) this_COMA_11= RULE_COMA ( (lv_rotation_12_0= ruleRotation ) ) this_RBRACKET_13= RULE_RBRACKET (this_COMA_14= RULE_COMA )? ) ;
    public final EObject ruleHotspot() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_1=null;
        Token this_NAME_2=null;
        Token this_TWOPOINTS_3=null;
        Token this_COMA_5=null;
        Token this_TO_6=null;
        Token this_TWOPOINTS_7=null;
        Token this_COMA_9=null;
        Token this_COMA_11=null;
        Token this_RBRACKET_13=null;
        Token this_COMA_14=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_position_10_0 = null;

        EObject lv_rotation_12_0 = null;



        	enterRule();

        try {
            // InternalTourDsl.g:314:2: ( ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_TO_6= RULE_TO this_TWOPOINTS_7= RULE_TWOPOINTS ( ( ruleEString ) ) this_COMA_9= RULE_COMA ( (lv_position_10_0= rulePosition ) ) this_COMA_11= RULE_COMA ( (lv_rotation_12_0= ruleRotation ) ) this_RBRACKET_13= RULE_RBRACKET (this_COMA_14= RULE_COMA )? ) )
            // InternalTourDsl.g:315:2: ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_TO_6= RULE_TO this_TWOPOINTS_7= RULE_TWOPOINTS ( ( ruleEString ) ) this_COMA_9= RULE_COMA ( (lv_position_10_0= rulePosition ) ) this_COMA_11= RULE_COMA ( (lv_rotation_12_0= ruleRotation ) ) this_RBRACKET_13= RULE_RBRACKET (this_COMA_14= RULE_COMA )? )
            {
            // InternalTourDsl.g:315:2: ( () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_TO_6= RULE_TO this_TWOPOINTS_7= RULE_TWOPOINTS ( ( ruleEString ) ) this_COMA_9= RULE_COMA ( (lv_position_10_0= rulePosition ) ) this_COMA_11= RULE_COMA ( (lv_rotation_12_0= ruleRotation ) ) this_RBRACKET_13= RULE_RBRACKET (this_COMA_14= RULE_COMA )? )
            // InternalTourDsl.g:316:3: () this_LBRACKET_1= RULE_LBRACKET this_NAME_2= RULE_NAME this_TWOPOINTS_3= RULE_TWOPOINTS ( (lv_name_4_0= ruleEString ) ) this_COMA_5= RULE_COMA this_TO_6= RULE_TO this_TWOPOINTS_7= RULE_TWOPOINTS ( ( ruleEString ) ) this_COMA_9= RULE_COMA ( (lv_position_10_0= rulePosition ) ) this_COMA_11= RULE_COMA ( (lv_rotation_12_0= ruleRotation ) ) this_RBRACKET_13= RULE_RBRACKET (this_COMA_14= RULE_COMA )?
            {
            // InternalTourDsl.g:316:3: ()
            // InternalTourDsl.g:317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHotspotAccess().getHotspotAction_0(),
            					current);
            			

            }

            this_LBRACKET_1=(Token)match(input,RULE_LBRACKET,FOLLOW_3); 

            			newLeafNode(this_LBRACKET_1, grammarAccess.getHotspotAccess().getLBRACKETTerminalRuleCall_1());
            		
            this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_4); 

            			newLeafNode(this_NAME_2, grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_2());
            		
            this_TWOPOINTS_3=(Token)match(input,RULE_TWOPOINTS,FOLLOW_5); 

            			newLeafNode(this_TWOPOINTS_3, grammarAccess.getHotspotAccess().getTWOPOINTSTerminalRuleCall_3());
            		
            // InternalTourDsl.g:335:3: ( (lv_name_4_0= ruleEString ) )
            // InternalTourDsl.g:336:4: (lv_name_4_0= ruleEString )
            {
            // InternalTourDsl.g:336:4: (lv_name_4_0= ruleEString )
            // InternalTourDsl.g:337:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"edu.uniandes.tour.tourdsl.TourDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_5=(Token)match(input,RULE_COMA,FOLLOW_15); 

            			newLeafNode(this_COMA_5, grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_5());
            		
            this_TO_6=(Token)match(input,RULE_TO,FOLLOW_4); 

            			newLeafNode(this_TO_6, grammarAccess.getHotspotAccess().getTOTerminalRuleCall_6());
            		
            this_TWOPOINTS_7=(Token)match(input,RULE_TWOPOINTS,FOLLOW_5); 

            			newLeafNode(this_TWOPOINTS_7, grammarAccess.getHotspotAccess().getTWOPOINTSTerminalRuleCall_7());
            		
            // InternalTourDsl.g:366:3: ( ( ruleEString ) )
            // InternalTourDsl.g:367:4: ( ruleEString )
            {
            // InternalTourDsl.g:367:4: ( ruleEString )
            // InternalTourDsl.g:368:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHotspotRule());
            					}
            				

            					newCompositeNode(grammarAccess.getHotspotAccess().getToPanoramaCrossReference_8_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_9=(Token)match(input,RULE_COMA,FOLLOW_16); 

            			newLeafNode(this_COMA_9, grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_9());
            		
            // InternalTourDsl.g:386:3: ( (lv_position_10_0= rulePosition ) )
            // InternalTourDsl.g:387:4: (lv_position_10_0= rulePosition )
            {
            // InternalTourDsl.g:387:4: (lv_position_10_0= rulePosition )
            // InternalTourDsl.g:388:5: lv_position_10_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getPositionPositionParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_6);
            lv_position_10_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_10_0,
            						"edu.uniandes.tour.tourdsl.TourDsl.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_17); 

            			newLeafNode(this_COMA_11, grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_11());
            		
            // InternalTourDsl.g:409:3: ( (lv_rotation_12_0= ruleRotation ) )
            // InternalTourDsl.g:410:4: (lv_rotation_12_0= ruleRotation )
            {
            // InternalTourDsl.g:410:4: (lv_rotation_12_0= ruleRotation )
            // InternalTourDsl.g:411:5: lv_rotation_12_0= ruleRotation
            {

            					newCompositeNode(grammarAccess.getHotspotAccess().getRotationRotationParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_11);
            lv_rotation_12_0=ruleRotation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHotspotRule());
            					}
            					set(
            						current,
            						"rotation",
            						lv_rotation_12_0,
            						"edu.uniandes.tour.tourdsl.TourDsl.Rotation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_RBRACKET_13=(Token)match(input,RULE_RBRACKET,FOLLOW_14); 

            			newLeafNode(this_RBRACKET_13, grammarAccess.getHotspotAccess().getRBRACKETTerminalRuleCall_13());
            		
            // InternalTourDsl.g:432:3: (this_COMA_14= RULE_COMA )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_COMA) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTourDsl.g:433:4: this_COMA_14= RULE_COMA
                    {
                    this_COMA_14=(Token)match(input,RULE_COMA,FOLLOW_2); 

                    				newLeafNode(this_COMA_14, grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_14());
                    			

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
    // $ANTLR end "ruleHotspot"


    // $ANTLR start "entryRuleRotation"
    // InternalTourDsl.g:442:1: entryRuleRotation returns [EObject current=null] : iv_ruleRotation= ruleRotation EOF ;
    public final EObject entryRuleRotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotation = null;


        try {
            // InternalTourDsl.g:442:49: (iv_ruleRotation= ruleRotation EOF )
            // InternalTourDsl.g:443:2: iv_ruleRotation= ruleRotation EOF
            {
             newCompositeNode(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotation=ruleRotation();

            state._fsp--;

             current =iv_ruleRotation; 
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
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalTourDsl.g:449:1: ruleRotation returns [EObject current=null] : ( () this_T_ROTATION_1= RULE_T_ROTATION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_ROTX_4= RULE_ROTX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_ROTY_8= RULE_ROTY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_ROTZ_12= RULE_ROTZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET ) ;
    public final EObject ruleRotation() throws RecognitionException {
        EObject current = null;

        Token this_T_ROTATION_1=null;
        Token this_TWOPOINTS_2=null;
        Token this_LBRACKET_3=null;
        Token this_ROTX_4=null;
        Token this_TWOPOINTS_5=null;
        Token this_COMA_7=null;
        Token this_ROTY_8=null;
        Token this_TWOPOINTS_9=null;
        Token this_COMA_11=null;
        Token this_ROTZ_12=null;
        Token this_TWOPOINTS_13=null;
        Token this_RBRACKET_15=null;
        AntlrDatatypeRuleToken lv_x_6_0 = null;

        AntlrDatatypeRuleToken lv_y_10_0 = null;

        AntlrDatatypeRuleToken lv_z_14_0 = null;



        	enterRule();

        try {
            // InternalTourDsl.g:455:2: ( ( () this_T_ROTATION_1= RULE_T_ROTATION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_ROTX_4= RULE_ROTX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_ROTY_8= RULE_ROTY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_ROTZ_12= RULE_ROTZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET ) )
            // InternalTourDsl.g:456:2: ( () this_T_ROTATION_1= RULE_T_ROTATION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_ROTX_4= RULE_ROTX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_ROTY_8= RULE_ROTY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_ROTZ_12= RULE_ROTZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET )
            {
            // InternalTourDsl.g:456:2: ( () this_T_ROTATION_1= RULE_T_ROTATION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_ROTX_4= RULE_ROTX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_ROTY_8= RULE_ROTY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_ROTZ_12= RULE_ROTZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET )
            // InternalTourDsl.g:457:3: () this_T_ROTATION_1= RULE_T_ROTATION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_ROTX_4= RULE_ROTX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_ROTY_8= RULE_ROTY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_ROTZ_12= RULE_ROTZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET
            {
            // InternalTourDsl.g:457:3: ()
            // InternalTourDsl.g:458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotationAccess().getRotationAction_0(),
            					current);
            			

            }

            this_T_ROTATION_1=(Token)match(input,RULE_T_ROTATION,FOLLOW_4); 

            			newLeafNode(this_T_ROTATION_1, grammarAccess.getRotationAccess().getT_ROTATIONTerminalRuleCall_1());
            		
            this_TWOPOINTS_2=(Token)match(input,RULE_TWOPOINTS,FOLLOW_9); 

            			newLeafNode(this_TWOPOINTS_2, grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_2());
            		
            this_LBRACKET_3=(Token)match(input,RULE_LBRACKET,FOLLOW_18); 

            			newLeafNode(this_LBRACKET_3, grammarAccess.getRotationAccess().getLBRACKETTerminalRuleCall_3());
            		
            this_ROTX_4=(Token)match(input,RULE_ROTX,FOLLOW_4); 

            			newLeafNode(this_ROTX_4, grammarAccess.getRotationAccess().getROTXTerminalRuleCall_4());
            		
            this_TWOPOINTS_5=(Token)match(input,RULE_TWOPOINTS,FOLLOW_19); 

            			newLeafNode(this_TWOPOINTS_5, grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_5());
            		
            // InternalTourDsl.g:484:3: ( (lv_x_6_0= ruleEDouble ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||(LA5_0>=30 && LA5_0<=31)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTourDsl.g:485:4: (lv_x_6_0= ruleEDouble )
                    {
                    // InternalTourDsl.g:485:4: (lv_x_6_0= ruleEDouble )
                    // InternalTourDsl.g:486:5: lv_x_6_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getRotationAccess().getXEDoubleParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_x_6_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRotationRule());
                    					}
                    					set(
                    						current,
                    						"x",
                    						lv_x_6_0,
                    						"edu.uniandes.tour.tourdsl.TourDsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_COMA_7=(Token)match(input,RULE_COMA,FOLLOW_20); 

            			newLeafNode(this_COMA_7, grammarAccess.getRotationAccess().getCOMATerminalRuleCall_7());
            		
            this_ROTY_8=(Token)match(input,RULE_ROTY,FOLLOW_4); 

            			newLeafNode(this_ROTY_8, grammarAccess.getRotationAccess().getROTYTerminalRuleCall_8());
            		
            this_TWOPOINTS_9=(Token)match(input,RULE_TWOPOINTS,FOLLOW_19); 

            			newLeafNode(this_TWOPOINTS_9, grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_9());
            		
            // InternalTourDsl.g:515:3: ( (lv_y_10_0= ruleEDouble ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||(LA6_0>=30 && LA6_0<=31)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTourDsl.g:516:4: (lv_y_10_0= ruleEDouble )
                    {
                    // InternalTourDsl.g:516:4: (lv_y_10_0= ruleEDouble )
                    // InternalTourDsl.g:517:5: lv_y_10_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getRotationAccess().getYEDoubleParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_y_10_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRotationRule());
                    					}
                    					set(
                    						current,
                    						"y",
                    						lv_y_10_0,
                    						"edu.uniandes.tour.tourdsl.TourDsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_21); 

            			newLeafNode(this_COMA_11, grammarAccess.getRotationAccess().getCOMATerminalRuleCall_11());
            		
            this_ROTZ_12=(Token)match(input,RULE_ROTZ,FOLLOW_4); 

            			newLeafNode(this_ROTZ_12, grammarAccess.getRotationAccess().getROTZTerminalRuleCall_12());
            		
            this_TWOPOINTS_13=(Token)match(input,RULE_TWOPOINTS,FOLLOW_22); 

            			newLeafNode(this_TWOPOINTS_13, grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_13());
            		
            // InternalTourDsl.g:546:3: ( (lv_z_14_0= ruleEDouble ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=30 && LA7_0<=31)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTourDsl.g:547:4: (lv_z_14_0= ruleEDouble )
                    {
                    // InternalTourDsl.g:547:4: (lv_z_14_0= ruleEDouble )
                    // InternalTourDsl.g:548:5: lv_z_14_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getRotationAccess().getZEDoubleParserRuleCall_14_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_z_14_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRotationRule());
                    					}
                    					set(
                    						current,
                    						"z",
                    						lv_z_14_0,
                    						"edu.uniandes.tour.tourdsl.TourDsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_RBRACKET_15=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

            			newLeafNode(this_RBRACKET_15, grammarAccess.getRotationAccess().getRBRACKETTerminalRuleCall_15());
            		

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
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRulePosition"
    // InternalTourDsl.g:573:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalTourDsl.g:573:49: (iv_rulePosition= rulePosition EOF )
            // InternalTourDsl.g:574:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalTourDsl.g:580:1: rulePosition returns [EObject current=null] : ( () this_T_POSITION_1= RULE_T_POSITION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_POSX_4= RULE_POSX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_POSY_8= RULE_POSY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_POSZ_12= RULE_POSZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token this_T_POSITION_1=null;
        Token this_TWOPOINTS_2=null;
        Token this_LBRACKET_3=null;
        Token this_POSX_4=null;
        Token this_TWOPOINTS_5=null;
        Token this_COMA_7=null;
        Token this_POSY_8=null;
        Token this_TWOPOINTS_9=null;
        Token this_COMA_11=null;
        Token this_POSZ_12=null;
        Token this_TWOPOINTS_13=null;
        Token this_RBRACKET_15=null;
        AntlrDatatypeRuleToken lv_x_6_0 = null;

        AntlrDatatypeRuleToken lv_y_10_0 = null;

        AntlrDatatypeRuleToken lv_z_14_0 = null;



        	enterRule();

        try {
            // InternalTourDsl.g:586:2: ( ( () this_T_POSITION_1= RULE_T_POSITION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_POSX_4= RULE_POSX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_POSY_8= RULE_POSY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_POSZ_12= RULE_POSZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET ) )
            // InternalTourDsl.g:587:2: ( () this_T_POSITION_1= RULE_T_POSITION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_POSX_4= RULE_POSX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_POSY_8= RULE_POSY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_POSZ_12= RULE_POSZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET )
            {
            // InternalTourDsl.g:587:2: ( () this_T_POSITION_1= RULE_T_POSITION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_POSX_4= RULE_POSX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_POSY_8= RULE_POSY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_POSZ_12= RULE_POSZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET )
            // InternalTourDsl.g:588:3: () this_T_POSITION_1= RULE_T_POSITION this_TWOPOINTS_2= RULE_TWOPOINTS this_LBRACKET_3= RULE_LBRACKET this_POSX_4= RULE_POSX this_TWOPOINTS_5= RULE_TWOPOINTS ( (lv_x_6_0= ruleEDouble ) )? this_COMA_7= RULE_COMA this_POSY_8= RULE_POSY this_TWOPOINTS_9= RULE_TWOPOINTS ( (lv_y_10_0= ruleEDouble ) )? this_COMA_11= RULE_COMA this_POSZ_12= RULE_POSZ this_TWOPOINTS_13= RULE_TWOPOINTS ( (lv_z_14_0= ruleEDouble ) )? this_RBRACKET_15= RULE_RBRACKET
            {
            // InternalTourDsl.g:588:3: ()
            // InternalTourDsl.g:589:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPositionAccess().getPositionAction_0(),
            					current);
            			

            }

            this_T_POSITION_1=(Token)match(input,RULE_T_POSITION,FOLLOW_4); 

            			newLeafNode(this_T_POSITION_1, grammarAccess.getPositionAccess().getT_POSITIONTerminalRuleCall_1());
            		
            this_TWOPOINTS_2=(Token)match(input,RULE_TWOPOINTS,FOLLOW_9); 

            			newLeafNode(this_TWOPOINTS_2, grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_2());
            		
            this_LBRACKET_3=(Token)match(input,RULE_LBRACKET,FOLLOW_23); 

            			newLeafNode(this_LBRACKET_3, grammarAccess.getPositionAccess().getLBRACKETTerminalRuleCall_3());
            		
            this_POSX_4=(Token)match(input,RULE_POSX,FOLLOW_4); 

            			newLeafNode(this_POSX_4, grammarAccess.getPositionAccess().getPOSXTerminalRuleCall_4());
            		
            this_TWOPOINTS_5=(Token)match(input,RULE_TWOPOINTS,FOLLOW_19); 

            			newLeafNode(this_TWOPOINTS_5, grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_5());
            		
            // InternalTourDsl.g:615:3: ( (lv_x_6_0= ruleEDouble ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=30 && LA8_0<=31)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTourDsl.g:616:4: (lv_x_6_0= ruleEDouble )
                    {
                    // InternalTourDsl.g:616:4: (lv_x_6_0= ruleEDouble )
                    // InternalTourDsl.g:617:5: lv_x_6_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getXEDoubleParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_x_6_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositionRule());
                    					}
                    					set(
                    						current,
                    						"x",
                    						lv_x_6_0,
                    						"edu.uniandes.tour.tourdsl.TourDsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_COMA_7=(Token)match(input,RULE_COMA,FOLLOW_24); 

            			newLeafNode(this_COMA_7, grammarAccess.getPositionAccess().getCOMATerminalRuleCall_7());
            		
            this_POSY_8=(Token)match(input,RULE_POSY,FOLLOW_4); 

            			newLeafNode(this_POSY_8, grammarAccess.getPositionAccess().getPOSYTerminalRuleCall_8());
            		
            this_TWOPOINTS_9=(Token)match(input,RULE_TWOPOINTS,FOLLOW_19); 

            			newLeafNode(this_TWOPOINTS_9, grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_9());
            		
            // InternalTourDsl.g:646:3: ( (lv_y_10_0= ruleEDouble ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=30 && LA9_0<=31)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTourDsl.g:647:4: (lv_y_10_0= ruleEDouble )
                    {
                    // InternalTourDsl.g:647:4: (lv_y_10_0= ruleEDouble )
                    // InternalTourDsl.g:648:5: lv_y_10_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getYEDoubleParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_y_10_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositionRule());
                    					}
                    					set(
                    						current,
                    						"y",
                    						lv_y_10_0,
                    						"edu.uniandes.tour.tourdsl.TourDsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_COMA_11=(Token)match(input,RULE_COMA,FOLLOW_25); 

            			newLeafNode(this_COMA_11, grammarAccess.getPositionAccess().getCOMATerminalRuleCall_11());
            		
            this_POSZ_12=(Token)match(input,RULE_POSZ,FOLLOW_4); 

            			newLeafNode(this_POSZ_12, grammarAccess.getPositionAccess().getPOSZTerminalRuleCall_12());
            		
            this_TWOPOINTS_13=(Token)match(input,RULE_TWOPOINTS,FOLLOW_22); 

            			newLeafNode(this_TWOPOINTS_13, grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_13());
            		
            // InternalTourDsl.g:677:3: ( (lv_z_14_0= ruleEDouble ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||(LA10_0>=30 && LA10_0<=31)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTourDsl.g:678:4: (lv_z_14_0= ruleEDouble )
                    {
                    // InternalTourDsl.g:678:4: (lv_z_14_0= ruleEDouble )
                    // InternalTourDsl.g:679:5: lv_z_14_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getPositionAccess().getZEDoubleParserRuleCall_14_0());
                    				
                    pushFollow(FOLLOW_11);
                    lv_z_14_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPositionRule());
                    					}
                    					set(
                    						current,
                    						"z",
                    						lv_z_14_0,
                    						"edu.uniandes.tour.tourdsl.TourDsl.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_RBRACKET_15=(Token)match(input,RULE_RBRACKET,FOLLOW_2); 

            			newLeafNode(this_RBRACKET_15, grammarAccess.getPositionAccess().getRBRACKETTerminalRuleCall_15());
            		

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleEDouble"
    // InternalTourDsl.g:704:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalTourDsl.g:704:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalTourDsl.g:705:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalTourDsl.g:711:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTourDsl.g:717:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTourDsl.g:718:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTourDsl.g:718:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTourDsl.g:719:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTourDsl.g:719:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTourDsl.g:720:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTourDsl.g:726:3: (this_INT_1= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTourDsl.g:727:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_27); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,31,FOLLOW_28); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_29); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTourDsl.g:747:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=32 && LA15_0<=33)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTourDsl.g:748:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTourDsl.g:748:4: (kw= 'E' | kw= 'e' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==32) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==33) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTourDsl.g:749:5: kw= 'E'
                            {
                            kw=(Token)match(input,32,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTourDsl.g:755:5: kw= 'e'
                            {
                            kw=(Token)match(input,33,FOLLOW_30); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTourDsl.g:761:4: (kw= '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==30) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTourDsl.g:762:5: kw= '-'
                            {
                            kw=(Token)match(input,30,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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


    // $ANTLR start "entryRuleEString"
    // InternalTourDsl.g:780:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTourDsl.g:780:47: (iv_ruleEString= ruleEString EOF )
            // InternalTourDsl.g:781:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTourDsl.g:787:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTourDsl.g:793:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTourDsl.g:794:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTourDsl.g:794:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTourDsl.g:795:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTourDsl.g:803:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0800080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0800800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040800000L});

}
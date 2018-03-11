package edu.uniandes.tour.tourdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.uniandes.tour.tourdsl.services.TourDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTourDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_LBRACKET", "RULE_NAME", "RULE_TWOPOINTS", "RULE_COMA", "RULE_T_PANORAMA", "RULE_LPARENTISISCUADRADO", "RULE_RPARENTISISCUADRADO", "RULE_RBRACKET", "RULE_DESCRIPTION", "RULE_T_HOTSPOT", "RULE_TO", "RULE_T_ROTATION", "RULE_ROTX", "RULE_ROTY", "RULE_ROTZ", "RULE_T_POSITION", "RULE_POSX", "RULE_POSY", "RULE_POSZ", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'-'", "'.'"
    };
    public static final int RULE_LBRACKET=6;
    public static final int RULE_COMA=9;
    public static final int RULE_TO=16;
    public static final int RULE_NAME=7;
    public static final int RULE_T_HOTSPOT=15;
    public static final int RULE_STRING=4;
    public static final int RULE_ROTX=18;
    public static final int RULE_ROTY=19;
    public static final int RULE_ROTZ=20;
    public static final int RULE_SL_COMMENT=27;
    public static final int RULE_RPARENTISISCUADRADO=12;
    public static final int T__33=33;
    public static final int RULE_LPARENTISISCUADRADO=11;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_T_PANORAMA=10;
    public static final int RULE_T_POSITION=21;
    public static final int RULE_POSX=22;
    public static final int RULE_T_ROTATION=17;
    public static final int RULE_ID=5;
    public static final int RULE_WS=28;
    public static final int RULE_DESCRIPTION=14;
    public static final int RULE_ANY_OTHER=29;
    public static final int RULE_POSZ=24;
    public static final int RULE_POSY=23;
    public static final int RULE_INT=25;
    public static final int RULE_TWOPOINTS=8;
    public static final int RULE_ML_COMMENT=26;
    public static final int RULE_RBRACKET=13;

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

    	public void setGrammarAccess(TourDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTour"
    // InternalTourDsl.g:53:1: entryRuleTour : ruleTour EOF ;
    public final void entryRuleTour() throws RecognitionException {
        try {
            // InternalTourDsl.g:54:1: ( ruleTour EOF )
            // InternalTourDsl.g:55:1: ruleTour EOF
            {
             before(grammarAccess.getTourRule()); 
            pushFollow(FOLLOW_1);
            ruleTour();

            state._fsp--;

             after(grammarAccess.getTourRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTour"


    // $ANTLR start "ruleTour"
    // InternalTourDsl.g:62:1: ruleTour : ( ( rule__Tour__Group__0 ) ) ;
    public final void ruleTour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:66:2: ( ( ( rule__Tour__Group__0 ) ) )
            // InternalTourDsl.g:67:2: ( ( rule__Tour__Group__0 ) )
            {
            // InternalTourDsl.g:67:2: ( ( rule__Tour__Group__0 ) )
            // InternalTourDsl.g:68:3: ( rule__Tour__Group__0 )
            {
             before(grammarAccess.getTourAccess().getGroup()); 
            // InternalTourDsl.g:69:3: ( rule__Tour__Group__0 )
            // InternalTourDsl.g:69:4: rule__Tour__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tour__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTour"


    // $ANTLR start "entryRulePanorama"
    // InternalTourDsl.g:78:1: entryRulePanorama : rulePanorama EOF ;
    public final void entryRulePanorama() throws RecognitionException {
        try {
            // InternalTourDsl.g:79:1: ( rulePanorama EOF )
            // InternalTourDsl.g:80:1: rulePanorama EOF
            {
             before(grammarAccess.getPanoramaRule()); 
            pushFollow(FOLLOW_1);
            rulePanorama();

            state._fsp--;

             after(grammarAccess.getPanoramaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePanorama"


    // $ANTLR start "rulePanorama"
    // InternalTourDsl.g:87:1: rulePanorama : ( ( rule__Panorama__Group__0 ) ) ;
    public final void rulePanorama() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:91:2: ( ( ( rule__Panorama__Group__0 ) ) )
            // InternalTourDsl.g:92:2: ( ( rule__Panorama__Group__0 ) )
            {
            // InternalTourDsl.g:92:2: ( ( rule__Panorama__Group__0 ) )
            // InternalTourDsl.g:93:3: ( rule__Panorama__Group__0 )
            {
             before(grammarAccess.getPanoramaAccess().getGroup()); 
            // InternalTourDsl.g:94:3: ( rule__Panorama__Group__0 )
            // InternalTourDsl.g:94:4: rule__Panorama__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePanorama"


    // $ANTLR start "entryRuleHotspot"
    // InternalTourDsl.g:103:1: entryRuleHotspot : ruleHotspot EOF ;
    public final void entryRuleHotspot() throws RecognitionException {
        try {
            // InternalTourDsl.g:104:1: ( ruleHotspot EOF )
            // InternalTourDsl.g:105:1: ruleHotspot EOF
            {
             before(grammarAccess.getHotspotRule()); 
            pushFollow(FOLLOW_1);
            ruleHotspot();

            state._fsp--;

             after(grammarAccess.getHotspotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHotspot"


    // $ANTLR start "ruleHotspot"
    // InternalTourDsl.g:112:1: ruleHotspot : ( ( rule__Hotspot__Group__0 ) ) ;
    public final void ruleHotspot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:116:2: ( ( ( rule__Hotspot__Group__0 ) ) )
            // InternalTourDsl.g:117:2: ( ( rule__Hotspot__Group__0 ) )
            {
            // InternalTourDsl.g:117:2: ( ( rule__Hotspot__Group__0 ) )
            // InternalTourDsl.g:118:3: ( rule__Hotspot__Group__0 )
            {
             before(grammarAccess.getHotspotAccess().getGroup()); 
            // InternalTourDsl.g:119:3: ( rule__Hotspot__Group__0 )
            // InternalTourDsl.g:119:4: rule__Hotspot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHotspot"


    // $ANTLR start "entryRuleRotation"
    // InternalTourDsl.g:128:1: entryRuleRotation : ruleRotation EOF ;
    public final void entryRuleRotation() throws RecognitionException {
        try {
            // InternalTourDsl.g:129:1: ( ruleRotation EOF )
            // InternalTourDsl.g:130:1: ruleRotation EOF
            {
             before(grammarAccess.getRotationRule()); 
            pushFollow(FOLLOW_1);
            ruleRotation();

            state._fsp--;

             after(grammarAccess.getRotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotation"


    // $ANTLR start "ruleRotation"
    // InternalTourDsl.g:137:1: ruleRotation : ( ( rule__Rotation__Group__0 ) ) ;
    public final void ruleRotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:141:2: ( ( ( rule__Rotation__Group__0 ) ) )
            // InternalTourDsl.g:142:2: ( ( rule__Rotation__Group__0 ) )
            {
            // InternalTourDsl.g:142:2: ( ( rule__Rotation__Group__0 ) )
            // InternalTourDsl.g:143:3: ( rule__Rotation__Group__0 )
            {
             before(grammarAccess.getRotationAccess().getGroup()); 
            // InternalTourDsl.g:144:3: ( rule__Rotation__Group__0 )
            // InternalTourDsl.g:144:4: rule__Rotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotation"


    // $ANTLR start "entryRulePosition"
    // InternalTourDsl.g:153:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalTourDsl.g:154:1: ( rulePosition EOF )
            // InternalTourDsl.g:155:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalTourDsl.g:162:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:166:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalTourDsl.g:167:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalTourDsl.g:167:2: ( ( rule__Position__Group__0 ) )
            // InternalTourDsl.g:168:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalTourDsl.g:169:3: ( rule__Position__Group__0 )
            // InternalTourDsl.g:169:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleEDouble"
    // InternalTourDsl.g:178:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalTourDsl.g:179:1: ( ruleEDouble EOF )
            // InternalTourDsl.g:180:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTourDsl.g:187:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:191:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalTourDsl.g:192:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalTourDsl.g:192:2: ( ( rule__EDouble__Group__0 ) )
            // InternalTourDsl.g:193:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalTourDsl.g:194:3: ( rule__EDouble__Group__0 )
            // InternalTourDsl.g:194:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEString"
    // InternalTourDsl.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTourDsl.g:204:1: ( ruleEString EOF )
            // InternalTourDsl.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTourDsl.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTourDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTourDsl.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalTourDsl.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTourDsl.g:219:3: ( rule__EString__Alternatives )
            // InternalTourDsl.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalTourDsl.g:227:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:231:1: ( ( 'E' ) | ( 'e' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==31) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTourDsl.g:232:2: ( 'E' )
                    {
                    // InternalTourDsl.g:232:2: ( 'E' )
                    // InternalTourDsl.g:233:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTourDsl.g:238:2: ( 'e' )
                    {
                    // InternalTourDsl.g:238:2: ( 'e' )
                    // InternalTourDsl.g:239:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTourDsl.g:248:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:252:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTourDsl.g:253:2: ( RULE_STRING )
                    {
                    // InternalTourDsl.g:253:2: ( RULE_STRING )
                    // InternalTourDsl.g:254:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTourDsl.g:259:2: ( RULE_ID )
                    {
                    // InternalTourDsl.g:259:2: ( RULE_ID )
                    // InternalTourDsl.g:260:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Tour__Group__0"
    // InternalTourDsl.g:269:1: rule__Tour__Group__0 : rule__Tour__Group__0__Impl rule__Tour__Group__1 ;
    public final void rule__Tour__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:273:1: ( rule__Tour__Group__0__Impl rule__Tour__Group__1 )
            // InternalTourDsl.g:274:2: rule__Tour__Group__0__Impl rule__Tour__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Tour__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__0"


    // $ANTLR start "rule__Tour__Group__0__Impl"
    // InternalTourDsl.g:281:1: rule__Tour__Group__0__Impl : ( () ) ;
    public final void rule__Tour__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:285:1: ( ( () ) )
            // InternalTourDsl.g:286:1: ( () )
            {
            // InternalTourDsl.g:286:1: ( () )
            // InternalTourDsl.g:287:2: ()
            {
             before(grammarAccess.getTourAccess().getTourAction_0()); 
            // InternalTourDsl.g:288:2: ()
            // InternalTourDsl.g:288:3: 
            {
            }

             after(grammarAccess.getTourAccess().getTourAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__0__Impl"


    // $ANTLR start "rule__Tour__Group__1"
    // InternalTourDsl.g:296:1: rule__Tour__Group__1 : rule__Tour__Group__1__Impl rule__Tour__Group__2 ;
    public final void rule__Tour__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:300:1: ( rule__Tour__Group__1__Impl rule__Tour__Group__2 )
            // InternalTourDsl.g:301:2: rule__Tour__Group__1__Impl rule__Tour__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Tour__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__1"


    // $ANTLR start "rule__Tour__Group__1__Impl"
    // InternalTourDsl.g:308:1: rule__Tour__Group__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Tour__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:312:1: ( ( RULE_LBRACKET ) )
            // InternalTourDsl.g:313:1: ( RULE_LBRACKET )
            {
            // InternalTourDsl.g:313:1: ( RULE_LBRACKET )
            // InternalTourDsl.g:314:2: RULE_LBRACKET
            {
             before(grammarAccess.getTourAccess().getLBRACKETTerminalRuleCall_1()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getLBRACKETTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__1__Impl"


    // $ANTLR start "rule__Tour__Group__2"
    // InternalTourDsl.g:323:1: rule__Tour__Group__2 : rule__Tour__Group__2__Impl rule__Tour__Group__3 ;
    public final void rule__Tour__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:327:1: ( rule__Tour__Group__2__Impl rule__Tour__Group__3 )
            // InternalTourDsl.g:328:2: rule__Tour__Group__2__Impl rule__Tour__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Tour__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__2"


    // $ANTLR start "rule__Tour__Group__2__Impl"
    // InternalTourDsl.g:335:1: rule__Tour__Group__2__Impl : ( RULE_NAME ) ;
    public final void rule__Tour__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:339:1: ( ( RULE_NAME ) )
            // InternalTourDsl.g:340:1: ( RULE_NAME )
            {
            // InternalTourDsl.g:340:1: ( RULE_NAME )
            // InternalTourDsl.g:341:2: RULE_NAME
            {
             before(grammarAccess.getTourAccess().getNAMETerminalRuleCall_2()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getNAMETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__2__Impl"


    // $ANTLR start "rule__Tour__Group__3"
    // InternalTourDsl.g:350:1: rule__Tour__Group__3 : rule__Tour__Group__3__Impl rule__Tour__Group__4 ;
    public final void rule__Tour__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:354:1: ( rule__Tour__Group__3__Impl rule__Tour__Group__4 )
            // InternalTourDsl.g:355:2: rule__Tour__Group__3__Impl rule__Tour__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Tour__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__3"


    // $ANTLR start "rule__Tour__Group__3__Impl"
    // InternalTourDsl.g:362:1: rule__Tour__Group__3__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Tour__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:366:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:367:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:367:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:368:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getTourAccess().getTWOPOINTSTerminalRuleCall_3()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getTWOPOINTSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__3__Impl"


    // $ANTLR start "rule__Tour__Group__4"
    // InternalTourDsl.g:377:1: rule__Tour__Group__4 : rule__Tour__Group__4__Impl rule__Tour__Group__5 ;
    public final void rule__Tour__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:381:1: ( rule__Tour__Group__4__Impl rule__Tour__Group__5 )
            // InternalTourDsl.g:382:2: rule__Tour__Group__4__Impl rule__Tour__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Tour__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__4"


    // $ANTLR start "rule__Tour__Group__4__Impl"
    // InternalTourDsl.g:389:1: rule__Tour__Group__4__Impl : ( ( rule__Tour__NameAssignment_4 ) ) ;
    public final void rule__Tour__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:393:1: ( ( ( rule__Tour__NameAssignment_4 ) ) )
            // InternalTourDsl.g:394:1: ( ( rule__Tour__NameAssignment_4 ) )
            {
            // InternalTourDsl.g:394:1: ( ( rule__Tour__NameAssignment_4 ) )
            // InternalTourDsl.g:395:2: ( rule__Tour__NameAssignment_4 )
            {
             before(grammarAccess.getTourAccess().getNameAssignment_4()); 
            // InternalTourDsl.g:396:2: ( rule__Tour__NameAssignment_4 )
            // InternalTourDsl.g:396:3: rule__Tour__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Tour__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__4__Impl"


    // $ANTLR start "rule__Tour__Group__5"
    // InternalTourDsl.g:404:1: rule__Tour__Group__5 : rule__Tour__Group__5__Impl rule__Tour__Group__6 ;
    public final void rule__Tour__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:408:1: ( rule__Tour__Group__5__Impl rule__Tour__Group__6 )
            // InternalTourDsl.g:409:2: rule__Tour__Group__5__Impl rule__Tour__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Tour__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__5"


    // $ANTLR start "rule__Tour__Group__5__Impl"
    // InternalTourDsl.g:416:1: rule__Tour__Group__5__Impl : ( RULE_COMA ) ;
    public final void rule__Tour__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:420:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:421:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:421:1: ( RULE_COMA )
            // InternalTourDsl.g:422:2: RULE_COMA
            {
             before(grammarAccess.getTourAccess().getCOMATerminalRuleCall_5()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getCOMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__5__Impl"


    // $ANTLR start "rule__Tour__Group__6"
    // InternalTourDsl.g:431:1: rule__Tour__Group__6 : rule__Tour__Group__6__Impl rule__Tour__Group__7 ;
    public final void rule__Tour__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:435:1: ( rule__Tour__Group__6__Impl rule__Tour__Group__7 )
            // InternalTourDsl.g:436:2: rule__Tour__Group__6__Impl rule__Tour__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Tour__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__6"


    // $ANTLR start "rule__Tour__Group__6__Impl"
    // InternalTourDsl.g:443:1: rule__Tour__Group__6__Impl : ( RULE_T_PANORAMA ) ;
    public final void rule__Tour__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:447:1: ( ( RULE_T_PANORAMA ) )
            // InternalTourDsl.g:448:1: ( RULE_T_PANORAMA )
            {
            // InternalTourDsl.g:448:1: ( RULE_T_PANORAMA )
            // InternalTourDsl.g:449:2: RULE_T_PANORAMA
            {
             before(grammarAccess.getTourAccess().getT_PANORAMATerminalRuleCall_6()); 
            match(input,RULE_T_PANORAMA,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getT_PANORAMATerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__6__Impl"


    // $ANTLR start "rule__Tour__Group__7"
    // InternalTourDsl.g:458:1: rule__Tour__Group__7 : rule__Tour__Group__7__Impl rule__Tour__Group__8 ;
    public final void rule__Tour__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:462:1: ( rule__Tour__Group__7__Impl rule__Tour__Group__8 )
            // InternalTourDsl.g:463:2: rule__Tour__Group__7__Impl rule__Tour__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Tour__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__7"


    // $ANTLR start "rule__Tour__Group__7__Impl"
    // InternalTourDsl.g:470:1: rule__Tour__Group__7__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Tour__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:474:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:475:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:475:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:476:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getTourAccess().getTWOPOINTSTerminalRuleCall_7()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getTWOPOINTSTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__7__Impl"


    // $ANTLR start "rule__Tour__Group__8"
    // InternalTourDsl.g:485:1: rule__Tour__Group__8 : rule__Tour__Group__8__Impl rule__Tour__Group__9 ;
    public final void rule__Tour__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:489:1: ( rule__Tour__Group__8__Impl rule__Tour__Group__9 )
            // InternalTourDsl.g:490:2: rule__Tour__Group__8__Impl rule__Tour__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Tour__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__8"


    // $ANTLR start "rule__Tour__Group__8__Impl"
    // InternalTourDsl.g:497:1: rule__Tour__Group__8__Impl : ( RULE_LPARENTISISCUADRADO ) ;
    public final void rule__Tour__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:501:1: ( ( RULE_LPARENTISISCUADRADO ) )
            // InternalTourDsl.g:502:1: ( RULE_LPARENTISISCUADRADO )
            {
            // InternalTourDsl.g:502:1: ( RULE_LPARENTISISCUADRADO )
            // InternalTourDsl.g:503:2: RULE_LPARENTISISCUADRADO
            {
             before(grammarAccess.getTourAccess().getLPARENTISISCUADRADOTerminalRuleCall_8()); 
            match(input,RULE_LPARENTISISCUADRADO,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getLPARENTISISCUADRADOTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__8__Impl"


    // $ANTLR start "rule__Tour__Group__9"
    // InternalTourDsl.g:512:1: rule__Tour__Group__9 : rule__Tour__Group__9__Impl rule__Tour__Group__10 ;
    public final void rule__Tour__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:516:1: ( rule__Tour__Group__9__Impl rule__Tour__Group__10 )
            // InternalTourDsl.g:517:2: rule__Tour__Group__9__Impl rule__Tour__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Tour__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__9"


    // $ANTLR start "rule__Tour__Group__9__Impl"
    // InternalTourDsl.g:524:1: rule__Tour__Group__9__Impl : ( ( ( rule__Tour__PanoramaAssignment_9 ) ) ( ( rule__Tour__PanoramaAssignment_9 )* ) ) ;
    public final void rule__Tour__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:528:1: ( ( ( ( rule__Tour__PanoramaAssignment_9 ) ) ( ( rule__Tour__PanoramaAssignment_9 )* ) ) )
            // InternalTourDsl.g:529:1: ( ( ( rule__Tour__PanoramaAssignment_9 ) ) ( ( rule__Tour__PanoramaAssignment_9 )* ) )
            {
            // InternalTourDsl.g:529:1: ( ( ( rule__Tour__PanoramaAssignment_9 ) ) ( ( rule__Tour__PanoramaAssignment_9 )* ) )
            // InternalTourDsl.g:530:2: ( ( rule__Tour__PanoramaAssignment_9 ) ) ( ( rule__Tour__PanoramaAssignment_9 )* )
            {
            // InternalTourDsl.g:530:2: ( ( rule__Tour__PanoramaAssignment_9 ) )
            // InternalTourDsl.g:531:3: ( rule__Tour__PanoramaAssignment_9 )
            {
             before(grammarAccess.getTourAccess().getPanoramaAssignment_9()); 
            // InternalTourDsl.g:532:3: ( rule__Tour__PanoramaAssignment_9 )
            // InternalTourDsl.g:532:4: rule__Tour__PanoramaAssignment_9
            {
            pushFollow(FOLLOW_11);
            rule__Tour__PanoramaAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getPanoramaAssignment_9()); 

            }

            // InternalTourDsl.g:535:2: ( ( rule__Tour__PanoramaAssignment_9 )* )
            // InternalTourDsl.g:536:3: ( rule__Tour__PanoramaAssignment_9 )*
            {
             before(grammarAccess.getTourAccess().getPanoramaAssignment_9()); 
            // InternalTourDsl.g:537:3: ( rule__Tour__PanoramaAssignment_9 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_LBRACKET) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTourDsl.g:537:4: rule__Tour__PanoramaAssignment_9
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Tour__PanoramaAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTourAccess().getPanoramaAssignment_9()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__9__Impl"


    // $ANTLR start "rule__Tour__Group__10"
    // InternalTourDsl.g:546:1: rule__Tour__Group__10 : rule__Tour__Group__10__Impl rule__Tour__Group__11 ;
    public final void rule__Tour__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:550:1: ( rule__Tour__Group__10__Impl rule__Tour__Group__11 )
            // InternalTourDsl.g:551:2: rule__Tour__Group__10__Impl rule__Tour__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Tour__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tour__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__10"


    // $ANTLR start "rule__Tour__Group__10__Impl"
    // InternalTourDsl.g:558:1: rule__Tour__Group__10__Impl : ( RULE_RPARENTISISCUADRADO ) ;
    public final void rule__Tour__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:562:1: ( ( RULE_RPARENTISISCUADRADO ) )
            // InternalTourDsl.g:563:1: ( RULE_RPARENTISISCUADRADO )
            {
            // InternalTourDsl.g:563:1: ( RULE_RPARENTISISCUADRADO )
            // InternalTourDsl.g:564:2: RULE_RPARENTISISCUADRADO
            {
             before(grammarAccess.getTourAccess().getRPARENTISISCUADRADOTerminalRuleCall_10()); 
            match(input,RULE_RPARENTISISCUADRADO,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getRPARENTISISCUADRADOTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__10__Impl"


    // $ANTLR start "rule__Tour__Group__11"
    // InternalTourDsl.g:573:1: rule__Tour__Group__11 : rule__Tour__Group__11__Impl ;
    public final void rule__Tour__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:577:1: ( rule__Tour__Group__11__Impl )
            // InternalTourDsl.g:578:2: rule__Tour__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tour__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__11"


    // $ANTLR start "rule__Tour__Group__11__Impl"
    // InternalTourDsl.g:584:1: rule__Tour__Group__11__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Tour__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:588:1: ( ( RULE_RBRACKET ) )
            // InternalTourDsl.g:589:1: ( RULE_RBRACKET )
            {
            // InternalTourDsl.g:589:1: ( RULE_RBRACKET )
            // InternalTourDsl.g:590:2: RULE_RBRACKET
            {
             before(grammarAccess.getTourAccess().getRBRACKETTerminalRuleCall_11()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getTourAccess().getRBRACKETTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__Group__11__Impl"


    // $ANTLR start "rule__Panorama__Group__0"
    // InternalTourDsl.g:600:1: rule__Panorama__Group__0 : rule__Panorama__Group__0__Impl rule__Panorama__Group__1 ;
    public final void rule__Panorama__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:604:1: ( rule__Panorama__Group__0__Impl rule__Panorama__Group__1 )
            // InternalTourDsl.g:605:2: rule__Panorama__Group__0__Impl rule__Panorama__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Panorama__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__0"


    // $ANTLR start "rule__Panorama__Group__0__Impl"
    // InternalTourDsl.g:612:1: rule__Panorama__Group__0__Impl : ( () ) ;
    public final void rule__Panorama__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:616:1: ( ( () ) )
            // InternalTourDsl.g:617:1: ( () )
            {
            // InternalTourDsl.g:617:1: ( () )
            // InternalTourDsl.g:618:2: ()
            {
             before(grammarAccess.getPanoramaAccess().getPanoramaAction_0()); 
            // InternalTourDsl.g:619:2: ()
            // InternalTourDsl.g:619:3: 
            {
            }

             after(grammarAccess.getPanoramaAccess().getPanoramaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__0__Impl"


    // $ANTLR start "rule__Panorama__Group__1"
    // InternalTourDsl.g:627:1: rule__Panorama__Group__1 : rule__Panorama__Group__1__Impl rule__Panorama__Group__2 ;
    public final void rule__Panorama__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:631:1: ( rule__Panorama__Group__1__Impl rule__Panorama__Group__2 )
            // InternalTourDsl.g:632:2: rule__Panorama__Group__1__Impl rule__Panorama__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Panorama__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__1"


    // $ANTLR start "rule__Panorama__Group__1__Impl"
    // InternalTourDsl.g:639:1: rule__Panorama__Group__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Panorama__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:643:1: ( ( RULE_LBRACKET ) )
            // InternalTourDsl.g:644:1: ( RULE_LBRACKET )
            {
            // InternalTourDsl.g:644:1: ( RULE_LBRACKET )
            // InternalTourDsl.g:645:2: RULE_LBRACKET
            {
             before(grammarAccess.getPanoramaAccess().getLBRACKETTerminalRuleCall_1()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getLBRACKETTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__1__Impl"


    // $ANTLR start "rule__Panorama__Group__2"
    // InternalTourDsl.g:654:1: rule__Panorama__Group__2 : rule__Panorama__Group__2__Impl rule__Panorama__Group__3 ;
    public final void rule__Panorama__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:658:1: ( rule__Panorama__Group__2__Impl rule__Panorama__Group__3 )
            // InternalTourDsl.g:659:2: rule__Panorama__Group__2__Impl rule__Panorama__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Panorama__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__2"


    // $ANTLR start "rule__Panorama__Group__2__Impl"
    // InternalTourDsl.g:666:1: rule__Panorama__Group__2__Impl : ( RULE_NAME ) ;
    public final void rule__Panorama__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:670:1: ( ( RULE_NAME ) )
            // InternalTourDsl.g:671:1: ( RULE_NAME )
            {
            // InternalTourDsl.g:671:1: ( RULE_NAME )
            // InternalTourDsl.g:672:2: RULE_NAME
            {
             before(grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_2()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getNAMETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__2__Impl"


    // $ANTLR start "rule__Panorama__Group__3"
    // InternalTourDsl.g:681:1: rule__Panorama__Group__3 : rule__Panorama__Group__3__Impl rule__Panorama__Group__4 ;
    public final void rule__Panorama__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:685:1: ( rule__Panorama__Group__3__Impl rule__Panorama__Group__4 )
            // InternalTourDsl.g:686:2: rule__Panorama__Group__3__Impl rule__Panorama__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Panorama__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__3"


    // $ANTLR start "rule__Panorama__Group__3__Impl"
    // InternalTourDsl.g:693:1: rule__Panorama__Group__3__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Panorama__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:697:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:698:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:698:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:699:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_3()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__3__Impl"


    // $ANTLR start "rule__Panorama__Group__4"
    // InternalTourDsl.g:708:1: rule__Panorama__Group__4 : rule__Panorama__Group__4__Impl rule__Panorama__Group__5 ;
    public final void rule__Panorama__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:712:1: ( rule__Panorama__Group__4__Impl rule__Panorama__Group__5 )
            // InternalTourDsl.g:713:2: rule__Panorama__Group__4__Impl rule__Panorama__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Panorama__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__4"


    // $ANTLR start "rule__Panorama__Group__4__Impl"
    // InternalTourDsl.g:720:1: rule__Panorama__Group__4__Impl : ( ( rule__Panorama__NameAssignment_4 ) ) ;
    public final void rule__Panorama__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:724:1: ( ( ( rule__Panorama__NameAssignment_4 ) ) )
            // InternalTourDsl.g:725:1: ( ( rule__Panorama__NameAssignment_4 ) )
            {
            // InternalTourDsl.g:725:1: ( ( rule__Panorama__NameAssignment_4 ) )
            // InternalTourDsl.g:726:2: ( rule__Panorama__NameAssignment_4 )
            {
             before(grammarAccess.getPanoramaAccess().getNameAssignment_4()); 
            // InternalTourDsl.g:727:2: ( rule__Panorama__NameAssignment_4 )
            // InternalTourDsl.g:727:3: rule__Panorama__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__4__Impl"


    // $ANTLR start "rule__Panorama__Group__5"
    // InternalTourDsl.g:735:1: rule__Panorama__Group__5 : rule__Panorama__Group__5__Impl rule__Panorama__Group__6 ;
    public final void rule__Panorama__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:739:1: ( rule__Panorama__Group__5__Impl rule__Panorama__Group__6 )
            // InternalTourDsl.g:740:2: rule__Panorama__Group__5__Impl rule__Panorama__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Panorama__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__5"


    // $ANTLR start "rule__Panorama__Group__5__Impl"
    // InternalTourDsl.g:747:1: rule__Panorama__Group__5__Impl : ( RULE_COMA ) ;
    public final void rule__Panorama__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:751:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:752:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:752:1: ( RULE_COMA )
            // InternalTourDsl.g:753:2: RULE_COMA
            {
             before(grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_5()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__5__Impl"


    // $ANTLR start "rule__Panorama__Group__6"
    // InternalTourDsl.g:762:1: rule__Panorama__Group__6 : rule__Panorama__Group__6__Impl rule__Panorama__Group__7 ;
    public final void rule__Panorama__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:766:1: ( rule__Panorama__Group__6__Impl rule__Panorama__Group__7 )
            // InternalTourDsl.g:767:2: rule__Panorama__Group__6__Impl rule__Panorama__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Panorama__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__6"


    // $ANTLR start "rule__Panorama__Group__6__Impl"
    // InternalTourDsl.g:774:1: rule__Panorama__Group__6__Impl : ( RULE_DESCRIPTION ) ;
    public final void rule__Panorama__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:778:1: ( ( RULE_DESCRIPTION ) )
            // InternalTourDsl.g:779:1: ( RULE_DESCRIPTION )
            {
            // InternalTourDsl.g:779:1: ( RULE_DESCRIPTION )
            // InternalTourDsl.g:780:2: RULE_DESCRIPTION
            {
             before(grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_6()); 
            match(input,RULE_DESCRIPTION,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getDESCRIPTIONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__6__Impl"


    // $ANTLR start "rule__Panorama__Group__7"
    // InternalTourDsl.g:789:1: rule__Panorama__Group__7 : rule__Panorama__Group__7__Impl rule__Panorama__Group__8 ;
    public final void rule__Panorama__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:793:1: ( rule__Panorama__Group__7__Impl rule__Panorama__Group__8 )
            // InternalTourDsl.g:794:2: rule__Panorama__Group__7__Impl rule__Panorama__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Panorama__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__7"


    // $ANTLR start "rule__Panorama__Group__7__Impl"
    // InternalTourDsl.g:801:1: rule__Panorama__Group__7__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Panorama__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:805:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:806:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:806:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:807:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_7()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__7__Impl"


    // $ANTLR start "rule__Panorama__Group__8"
    // InternalTourDsl.g:816:1: rule__Panorama__Group__8 : rule__Panorama__Group__8__Impl rule__Panorama__Group__9 ;
    public final void rule__Panorama__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:820:1: ( rule__Panorama__Group__8__Impl rule__Panorama__Group__9 )
            // InternalTourDsl.g:821:2: rule__Panorama__Group__8__Impl rule__Panorama__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Panorama__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__8"


    // $ANTLR start "rule__Panorama__Group__8__Impl"
    // InternalTourDsl.g:828:1: rule__Panorama__Group__8__Impl : ( ( rule__Panorama__DescriptionAssignment_8 ) ) ;
    public final void rule__Panorama__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:832:1: ( ( ( rule__Panorama__DescriptionAssignment_8 ) ) )
            // InternalTourDsl.g:833:1: ( ( rule__Panorama__DescriptionAssignment_8 ) )
            {
            // InternalTourDsl.g:833:1: ( ( rule__Panorama__DescriptionAssignment_8 ) )
            // InternalTourDsl.g:834:2: ( rule__Panorama__DescriptionAssignment_8 )
            {
             before(grammarAccess.getPanoramaAccess().getDescriptionAssignment_8()); 
            // InternalTourDsl.g:835:2: ( rule__Panorama__DescriptionAssignment_8 )
            // InternalTourDsl.g:835:3: rule__Panorama__DescriptionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__DescriptionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getDescriptionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__8__Impl"


    // $ANTLR start "rule__Panorama__Group__9"
    // InternalTourDsl.g:843:1: rule__Panorama__Group__9 : rule__Panorama__Group__9__Impl rule__Panorama__Group__10 ;
    public final void rule__Panorama__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:847:1: ( rule__Panorama__Group__9__Impl rule__Panorama__Group__10 )
            // InternalTourDsl.g:848:2: rule__Panorama__Group__9__Impl rule__Panorama__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Panorama__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__9"


    // $ANTLR start "rule__Panorama__Group__9__Impl"
    // InternalTourDsl.g:855:1: rule__Panorama__Group__9__Impl : ( RULE_COMA ) ;
    public final void rule__Panorama__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:859:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:860:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:860:1: ( RULE_COMA )
            // InternalTourDsl.g:861:2: RULE_COMA
            {
             before(grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_9()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__9__Impl"


    // $ANTLR start "rule__Panorama__Group__10"
    // InternalTourDsl.g:870:1: rule__Panorama__Group__10 : rule__Panorama__Group__10__Impl rule__Panorama__Group__11 ;
    public final void rule__Panorama__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:874:1: ( rule__Panorama__Group__10__Impl rule__Panorama__Group__11 )
            // InternalTourDsl.g:875:2: rule__Panorama__Group__10__Impl rule__Panorama__Group__11
            {
            pushFollow(FOLLOW_5);
            rule__Panorama__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__10"


    // $ANTLR start "rule__Panorama__Group__10__Impl"
    // InternalTourDsl.g:882:1: rule__Panorama__Group__10__Impl : ( RULE_T_HOTSPOT ) ;
    public final void rule__Panorama__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:886:1: ( ( RULE_T_HOTSPOT ) )
            // InternalTourDsl.g:887:1: ( RULE_T_HOTSPOT )
            {
            // InternalTourDsl.g:887:1: ( RULE_T_HOTSPOT )
            // InternalTourDsl.g:888:2: RULE_T_HOTSPOT
            {
             before(grammarAccess.getPanoramaAccess().getT_HOTSPOTTerminalRuleCall_10()); 
            match(input,RULE_T_HOTSPOT,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getT_HOTSPOTTerminalRuleCall_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__10__Impl"


    // $ANTLR start "rule__Panorama__Group__11"
    // InternalTourDsl.g:897:1: rule__Panorama__Group__11 : rule__Panorama__Group__11__Impl rule__Panorama__Group__12 ;
    public final void rule__Panorama__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:901:1: ( rule__Panorama__Group__11__Impl rule__Panorama__Group__12 )
            // InternalTourDsl.g:902:2: rule__Panorama__Group__11__Impl rule__Panorama__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Panorama__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__11"


    // $ANTLR start "rule__Panorama__Group__11__Impl"
    // InternalTourDsl.g:909:1: rule__Panorama__Group__11__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Panorama__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:913:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:914:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:914:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:915:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_11()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getTWOPOINTSTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__11__Impl"


    // $ANTLR start "rule__Panorama__Group__12"
    // InternalTourDsl.g:924:1: rule__Panorama__Group__12 : rule__Panorama__Group__12__Impl rule__Panorama__Group__13 ;
    public final void rule__Panorama__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:928:1: ( rule__Panorama__Group__12__Impl rule__Panorama__Group__13 )
            // InternalTourDsl.g:929:2: rule__Panorama__Group__12__Impl rule__Panorama__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__Panorama__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__12"


    // $ANTLR start "rule__Panorama__Group__12__Impl"
    // InternalTourDsl.g:936:1: rule__Panorama__Group__12__Impl : ( RULE_LPARENTISISCUADRADO ) ;
    public final void rule__Panorama__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:940:1: ( ( RULE_LPARENTISISCUADRADO ) )
            // InternalTourDsl.g:941:1: ( RULE_LPARENTISISCUADRADO )
            {
            // InternalTourDsl.g:941:1: ( RULE_LPARENTISISCUADRADO )
            // InternalTourDsl.g:942:2: RULE_LPARENTISISCUADRADO
            {
             before(grammarAccess.getPanoramaAccess().getLPARENTISISCUADRADOTerminalRuleCall_12()); 
            match(input,RULE_LPARENTISISCUADRADO,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getLPARENTISISCUADRADOTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__12__Impl"


    // $ANTLR start "rule__Panorama__Group__13"
    // InternalTourDsl.g:951:1: rule__Panorama__Group__13 : rule__Panorama__Group__13__Impl rule__Panorama__Group__14 ;
    public final void rule__Panorama__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:955:1: ( rule__Panorama__Group__13__Impl rule__Panorama__Group__14 )
            // InternalTourDsl.g:956:2: rule__Panorama__Group__13__Impl rule__Panorama__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Panorama__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__13"


    // $ANTLR start "rule__Panorama__Group__13__Impl"
    // InternalTourDsl.g:963:1: rule__Panorama__Group__13__Impl : ( ( ( rule__Panorama__HotspotAssignment_13 ) ) ( ( rule__Panorama__HotspotAssignment_13 )* ) ) ;
    public final void rule__Panorama__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:967:1: ( ( ( ( rule__Panorama__HotspotAssignment_13 ) ) ( ( rule__Panorama__HotspotAssignment_13 )* ) ) )
            // InternalTourDsl.g:968:1: ( ( ( rule__Panorama__HotspotAssignment_13 ) ) ( ( rule__Panorama__HotspotAssignment_13 )* ) )
            {
            // InternalTourDsl.g:968:1: ( ( ( rule__Panorama__HotspotAssignment_13 ) ) ( ( rule__Panorama__HotspotAssignment_13 )* ) )
            // InternalTourDsl.g:969:2: ( ( rule__Panorama__HotspotAssignment_13 ) ) ( ( rule__Panorama__HotspotAssignment_13 )* )
            {
            // InternalTourDsl.g:969:2: ( ( rule__Panorama__HotspotAssignment_13 ) )
            // InternalTourDsl.g:970:3: ( rule__Panorama__HotspotAssignment_13 )
            {
             before(grammarAccess.getPanoramaAccess().getHotspotAssignment_13()); 
            // InternalTourDsl.g:971:3: ( rule__Panorama__HotspotAssignment_13 )
            // InternalTourDsl.g:971:4: rule__Panorama__HotspotAssignment_13
            {
            pushFollow(FOLLOW_11);
            rule__Panorama__HotspotAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPanoramaAccess().getHotspotAssignment_13()); 

            }

            // InternalTourDsl.g:974:2: ( ( rule__Panorama__HotspotAssignment_13 )* )
            // InternalTourDsl.g:975:3: ( rule__Panorama__HotspotAssignment_13 )*
            {
             before(grammarAccess.getPanoramaAccess().getHotspotAssignment_13()); 
            // InternalTourDsl.g:976:3: ( rule__Panorama__HotspotAssignment_13 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_LBRACKET) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTourDsl.g:976:4: rule__Panorama__HotspotAssignment_13
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Panorama__HotspotAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPanoramaAccess().getHotspotAssignment_13()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__13__Impl"


    // $ANTLR start "rule__Panorama__Group__14"
    // InternalTourDsl.g:985:1: rule__Panorama__Group__14 : rule__Panorama__Group__14__Impl rule__Panorama__Group__15 ;
    public final void rule__Panorama__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:989:1: ( rule__Panorama__Group__14__Impl rule__Panorama__Group__15 )
            // InternalTourDsl.g:990:2: rule__Panorama__Group__14__Impl rule__Panorama__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Panorama__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__14"


    // $ANTLR start "rule__Panorama__Group__14__Impl"
    // InternalTourDsl.g:997:1: rule__Panorama__Group__14__Impl : ( RULE_RPARENTISISCUADRADO ) ;
    public final void rule__Panorama__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1001:1: ( ( RULE_RPARENTISISCUADRADO ) )
            // InternalTourDsl.g:1002:1: ( RULE_RPARENTISISCUADRADO )
            {
            // InternalTourDsl.g:1002:1: ( RULE_RPARENTISISCUADRADO )
            // InternalTourDsl.g:1003:2: RULE_RPARENTISISCUADRADO
            {
             before(grammarAccess.getPanoramaAccess().getRPARENTISISCUADRADOTerminalRuleCall_14()); 
            match(input,RULE_RPARENTISISCUADRADO,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getRPARENTISISCUADRADOTerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__14__Impl"


    // $ANTLR start "rule__Panorama__Group__15"
    // InternalTourDsl.g:1012:1: rule__Panorama__Group__15 : rule__Panorama__Group__15__Impl rule__Panorama__Group__16 ;
    public final void rule__Panorama__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1016:1: ( rule__Panorama__Group__15__Impl rule__Panorama__Group__16 )
            // InternalTourDsl.g:1017:2: rule__Panorama__Group__15__Impl rule__Panorama__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Panorama__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Panorama__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__15"


    // $ANTLR start "rule__Panorama__Group__15__Impl"
    // InternalTourDsl.g:1024:1: rule__Panorama__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Panorama__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1028:1: ( ( RULE_RBRACKET ) )
            // InternalTourDsl.g:1029:1: ( RULE_RBRACKET )
            {
            // InternalTourDsl.g:1029:1: ( RULE_RBRACKET )
            // InternalTourDsl.g:1030:2: RULE_RBRACKET
            {
             before(grammarAccess.getPanoramaAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getPanoramaAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__15__Impl"


    // $ANTLR start "rule__Panorama__Group__16"
    // InternalTourDsl.g:1039:1: rule__Panorama__Group__16 : rule__Panorama__Group__16__Impl ;
    public final void rule__Panorama__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1043:1: ( rule__Panorama__Group__16__Impl )
            // InternalTourDsl.g:1044:2: rule__Panorama__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Panorama__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__16"


    // $ANTLR start "rule__Panorama__Group__16__Impl"
    // InternalTourDsl.g:1050:1: rule__Panorama__Group__16__Impl : ( ( RULE_COMA )? ) ;
    public final void rule__Panorama__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1054:1: ( ( ( RULE_COMA )? ) )
            // InternalTourDsl.g:1055:1: ( ( RULE_COMA )? )
            {
            // InternalTourDsl.g:1055:1: ( ( RULE_COMA )? )
            // InternalTourDsl.g:1056:2: ( RULE_COMA )?
            {
             before(grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_16()); 
            // InternalTourDsl.g:1057:2: ( RULE_COMA )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMA) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTourDsl.g:1057:3: RULE_COMA
                    {
                    match(input,RULE_COMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPanoramaAccess().getCOMATerminalRuleCall_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__Group__16__Impl"


    // $ANTLR start "rule__Hotspot__Group__0"
    // InternalTourDsl.g:1066:1: rule__Hotspot__Group__0 : rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1 ;
    public final void rule__Hotspot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1070:1: ( rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1 )
            // InternalTourDsl.g:1071:2: rule__Hotspot__Group__0__Impl rule__Hotspot__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Hotspot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__0"


    // $ANTLR start "rule__Hotspot__Group__0__Impl"
    // InternalTourDsl.g:1078:1: rule__Hotspot__Group__0__Impl : ( () ) ;
    public final void rule__Hotspot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1082:1: ( ( () ) )
            // InternalTourDsl.g:1083:1: ( () )
            {
            // InternalTourDsl.g:1083:1: ( () )
            // InternalTourDsl.g:1084:2: ()
            {
             before(grammarAccess.getHotspotAccess().getHotspotAction_0()); 
            // InternalTourDsl.g:1085:2: ()
            // InternalTourDsl.g:1085:3: 
            {
            }

             after(grammarAccess.getHotspotAccess().getHotspotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__0__Impl"


    // $ANTLR start "rule__Hotspot__Group__1"
    // InternalTourDsl.g:1093:1: rule__Hotspot__Group__1 : rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2 ;
    public final void rule__Hotspot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1097:1: ( rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2 )
            // InternalTourDsl.g:1098:2: rule__Hotspot__Group__1__Impl rule__Hotspot__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Hotspot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__1"


    // $ANTLR start "rule__Hotspot__Group__1__Impl"
    // InternalTourDsl.g:1105:1: rule__Hotspot__Group__1__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Hotspot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1109:1: ( ( RULE_LBRACKET ) )
            // InternalTourDsl.g:1110:1: ( RULE_LBRACKET )
            {
            // InternalTourDsl.g:1110:1: ( RULE_LBRACKET )
            // InternalTourDsl.g:1111:2: RULE_LBRACKET
            {
             before(grammarAccess.getHotspotAccess().getLBRACKETTerminalRuleCall_1()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getLBRACKETTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__1__Impl"


    // $ANTLR start "rule__Hotspot__Group__2"
    // InternalTourDsl.g:1120:1: rule__Hotspot__Group__2 : rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3 ;
    public final void rule__Hotspot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1124:1: ( rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3 )
            // InternalTourDsl.g:1125:2: rule__Hotspot__Group__2__Impl rule__Hotspot__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Hotspot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__2"


    // $ANTLR start "rule__Hotspot__Group__2__Impl"
    // InternalTourDsl.g:1132:1: rule__Hotspot__Group__2__Impl : ( RULE_NAME ) ;
    public final void rule__Hotspot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1136:1: ( ( RULE_NAME ) )
            // InternalTourDsl.g:1137:1: ( RULE_NAME )
            {
            // InternalTourDsl.g:1137:1: ( RULE_NAME )
            // InternalTourDsl.g:1138:2: RULE_NAME
            {
             before(grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_2()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getNAMETerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__2__Impl"


    // $ANTLR start "rule__Hotspot__Group__3"
    // InternalTourDsl.g:1147:1: rule__Hotspot__Group__3 : rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4 ;
    public final void rule__Hotspot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1151:1: ( rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4 )
            // InternalTourDsl.g:1152:2: rule__Hotspot__Group__3__Impl rule__Hotspot__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Hotspot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__3"


    // $ANTLR start "rule__Hotspot__Group__3__Impl"
    // InternalTourDsl.g:1159:1: rule__Hotspot__Group__3__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Hotspot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1163:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:1164:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:1164:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:1165:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getHotspotAccess().getTWOPOINTSTerminalRuleCall_3()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getTWOPOINTSTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__3__Impl"


    // $ANTLR start "rule__Hotspot__Group__4"
    // InternalTourDsl.g:1174:1: rule__Hotspot__Group__4 : rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5 ;
    public final void rule__Hotspot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1178:1: ( rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5 )
            // InternalTourDsl.g:1179:2: rule__Hotspot__Group__4__Impl rule__Hotspot__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Hotspot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__4"


    // $ANTLR start "rule__Hotspot__Group__4__Impl"
    // InternalTourDsl.g:1186:1: rule__Hotspot__Group__4__Impl : ( ( rule__Hotspot__NameAssignment_4 ) ) ;
    public final void rule__Hotspot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1190:1: ( ( ( rule__Hotspot__NameAssignment_4 ) ) )
            // InternalTourDsl.g:1191:1: ( ( rule__Hotspot__NameAssignment_4 ) )
            {
            // InternalTourDsl.g:1191:1: ( ( rule__Hotspot__NameAssignment_4 ) )
            // InternalTourDsl.g:1192:2: ( rule__Hotspot__NameAssignment_4 )
            {
             before(grammarAccess.getHotspotAccess().getNameAssignment_4()); 
            // InternalTourDsl.g:1193:2: ( rule__Hotspot__NameAssignment_4 )
            // InternalTourDsl.g:1193:3: rule__Hotspot__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__4__Impl"


    // $ANTLR start "rule__Hotspot__Group__5"
    // InternalTourDsl.g:1201:1: rule__Hotspot__Group__5 : rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6 ;
    public final void rule__Hotspot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1205:1: ( rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6 )
            // InternalTourDsl.g:1206:2: rule__Hotspot__Group__5__Impl rule__Hotspot__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Hotspot__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__5"


    // $ANTLR start "rule__Hotspot__Group__5__Impl"
    // InternalTourDsl.g:1213:1: rule__Hotspot__Group__5__Impl : ( RULE_COMA ) ;
    public final void rule__Hotspot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1217:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:1218:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:1218:1: ( RULE_COMA )
            // InternalTourDsl.g:1219:2: RULE_COMA
            {
             before(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_5()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__5__Impl"


    // $ANTLR start "rule__Hotspot__Group__6"
    // InternalTourDsl.g:1228:1: rule__Hotspot__Group__6 : rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7 ;
    public final void rule__Hotspot__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1232:1: ( rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7 )
            // InternalTourDsl.g:1233:2: rule__Hotspot__Group__6__Impl rule__Hotspot__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Hotspot__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__6"


    // $ANTLR start "rule__Hotspot__Group__6__Impl"
    // InternalTourDsl.g:1240:1: rule__Hotspot__Group__6__Impl : ( RULE_TO ) ;
    public final void rule__Hotspot__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1244:1: ( ( RULE_TO ) )
            // InternalTourDsl.g:1245:1: ( RULE_TO )
            {
            // InternalTourDsl.g:1245:1: ( RULE_TO )
            // InternalTourDsl.g:1246:2: RULE_TO
            {
             before(grammarAccess.getHotspotAccess().getTOTerminalRuleCall_6()); 
            match(input,RULE_TO,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getTOTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__6__Impl"


    // $ANTLR start "rule__Hotspot__Group__7"
    // InternalTourDsl.g:1255:1: rule__Hotspot__Group__7 : rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8 ;
    public final void rule__Hotspot__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1259:1: ( rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8 )
            // InternalTourDsl.g:1260:2: rule__Hotspot__Group__7__Impl rule__Hotspot__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Hotspot__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__7"


    // $ANTLR start "rule__Hotspot__Group__7__Impl"
    // InternalTourDsl.g:1267:1: rule__Hotspot__Group__7__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Hotspot__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1271:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:1272:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:1272:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:1273:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getHotspotAccess().getTWOPOINTSTerminalRuleCall_7()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getTWOPOINTSTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__7__Impl"


    // $ANTLR start "rule__Hotspot__Group__8"
    // InternalTourDsl.g:1282:1: rule__Hotspot__Group__8 : rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9 ;
    public final void rule__Hotspot__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1286:1: ( rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9 )
            // InternalTourDsl.g:1287:2: rule__Hotspot__Group__8__Impl rule__Hotspot__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Hotspot__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__8"


    // $ANTLR start "rule__Hotspot__Group__8__Impl"
    // InternalTourDsl.g:1294:1: rule__Hotspot__Group__8__Impl : ( ( rule__Hotspot__ToAssignment_8 ) ) ;
    public final void rule__Hotspot__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1298:1: ( ( ( rule__Hotspot__ToAssignment_8 ) ) )
            // InternalTourDsl.g:1299:1: ( ( rule__Hotspot__ToAssignment_8 ) )
            {
            // InternalTourDsl.g:1299:1: ( ( rule__Hotspot__ToAssignment_8 ) )
            // InternalTourDsl.g:1300:2: ( rule__Hotspot__ToAssignment_8 )
            {
             before(grammarAccess.getHotspotAccess().getToAssignment_8()); 
            // InternalTourDsl.g:1301:2: ( rule__Hotspot__ToAssignment_8 )
            // InternalTourDsl.g:1301:3: rule__Hotspot__ToAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__ToAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getToAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__8__Impl"


    // $ANTLR start "rule__Hotspot__Group__9"
    // InternalTourDsl.g:1309:1: rule__Hotspot__Group__9 : rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10 ;
    public final void rule__Hotspot__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1313:1: ( rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10 )
            // InternalTourDsl.g:1314:2: rule__Hotspot__Group__9__Impl rule__Hotspot__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Hotspot__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__9"


    // $ANTLR start "rule__Hotspot__Group__9__Impl"
    // InternalTourDsl.g:1321:1: rule__Hotspot__Group__9__Impl : ( RULE_COMA ) ;
    public final void rule__Hotspot__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1325:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:1326:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:1326:1: ( RULE_COMA )
            // InternalTourDsl.g:1327:2: RULE_COMA
            {
             before(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_9()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__9__Impl"


    // $ANTLR start "rule__Hotspot__Group__10"
    // InternalTourDsl.g:1336:1: rule__Hotspot__Group__10 : rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11 ;
    public final void rule__Hotspot__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1340:1: ( rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11 )
            // InternalTourDsl.g:1341:2: rule__Hotspot__Group__10__Impl rule__Hotspot__Group__11
            {
            pushFollow(FOLLOW_7);
            rule__Hotspot__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__10"


    // $ANTLR start "rule__Hotspot__Group__10__Impl"
    // InternalTourDsl.g:1348:1: rule__Hotspot__Group__10__Impl : ( ( rule__Hotspot__PositionAssignment_10 ) ) ;
    public final void rule__Hotspot__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1352:1: ( ( ( rule__Hotspot__PositionAssignment_10 ) ) )
            // InternalTourDsl.g:1353:1: ( ( rule__Hotspot__PositionAssignment_10 ) )
            {
            // InternalTourDsl.g:1353:1: ( ( rule__Hotspot__PositionAssignment_10 ) )
            // InternalTourDsl.g:1354:2: ( rule__Hotspot__PositionAssignment_10 )
            {
             before(grammarAccess.getHotspotAccess().getPositionAssignment_10()); 
            // InternalTourDsl.g:1355:2: ( rule__Hotspot__PositionAssignment_10 )
            // InternalTourDsl.g:1355:3: rule__Hotspot__PositionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__PositionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getPositionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__10__Impl"


    // $ANTLR start "rule__Hotspot__Group__11"
    // InternalTourDsl.g:1363:1: rule__Hotspot__Group__11 : rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12 ;
    public final void rule__Hotspot__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1367:1: ( rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12 )
            // InternalTourDsl.g:1368:2: rule__Hotspot__Group__11__Impl rule__Hotspot__Group__12
            {
            pushFollow(FOLLOW_17);
            rule__Hotspot__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__11"


    // $ANTLR start "rule__Hotspot__Group__11__Impl"
    // InternalTourDsl.g:1375:1: rule__Hotspot__Group__11__Impl : ( RULE_COMA ) ;
    public final void rule__Hotspot__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1379:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:1380:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:1380:1: ( RULE_COMA )
            // InternalTourDsl.g:1381:2: RULE_COMA
            {
             before(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_11()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__11__Impl"


    // $ANTLR start "rule__Hotspot__Group__12"
    // InternalTourDsl.g:1390:1: rule__Hotspot__Group__12 : rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13 ;
    public final void rule__Hotspot__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1394:1: ( rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13 )
            // InternalTourDsl.g:1395:2: rule__Hotspot__Group__12__Impl rule__Hotspot__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Hotspot__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__12"


    // $ANTLR start "rule__Hotspot__Group__12__Impl"
    // InternalTourDsl.g:1402:1: rule__Hotspot__Group__12__Impl : ( ( rule__Hotspot__RotationAssignment_12 ) ) ;
    public final void rule__Hotspot__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1406:1: ( ( ( rule__Hotspot__RotationAssignment_12 ) ) )
            // InternalTourDsl.g:1407:1: ( ( rule__Hotspot__RotationAssignment_12 ) )
            {
            // InternalTourDsl.g:1407:1: ( ( rule__Hotspot__RotationAssignment_12 ) )
            // InternalTourDsl.g:1408:2: ( rule__Hotspot__RotationAssignment_12 )
            {
             before(grammarAccess.getHotspotAccess().getRotationAssignment_12()); 
            // InternalTourDsl.g:1409:2: ( rule__Hotspot__RotationAssignment_12 )
            // InternalTourDsl.g:1409:3: rule__Hotspot__RotationAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__RotationAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getHotspotAccess().getRotationAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__12__Impl"


    // $ANTLR start "rule__Hotspot__Group__13"
    // InternalTourDsl.g:1417:1: rule__Hotspot__Group__13 : rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14 ;
    public final void rule__Hotspot__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1421:1: ( rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14 )
            // InternalTourDsl.g:1422:2: rule__Hotspot__Group__13__Impl rule__Hotspot__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__Hotspot__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__13"


    // $ANTLR start "rule__Hotspot__Group__13__Impl"
    // InternalTourDsl.g:1429:1: rule__Hotspot__Group__13__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Hotspot__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1433:1: ( ( RULE_RBRACKET ) )
            // InternalTourDsl.g:1434:1: ( RULE_RBRACKET )
            {
            // InternalTourDsl.g:1434:1: ( RULE_RBRACKET )
            // InternalTourDsl.g:1435:2: RULE_RBRACKET
            {
             before(grammarAccess.getHotspotAccess().getRBRACKETTerminalRuleCall_13()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getHotspotAccess().getRBRACKETTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__13__Impl"


    // $ANTLR start "rule__Hotspot__Group__14"
    // InternalTourDsl.g:1444:1: rule__Hotspot__Group__14 : rule__Hotspot__Group__14__Impl ;
    public final void rule__Hotspot__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1448:1: ( rule__Hotspot__Group__14__Impl )
            // InternalTourDsl.g:1449:2: rule__Hotspot__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Hotspot__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__14"


    // $ANTLR start "rule__Hotspot__Group__14__Impl"
    // InternalTourDsl.g:1455:1: rule__Hotspot__Group__14__Impl : ( ( RULE_COMA )? ) ;
    public final void rule__Hotspot__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1459:1: ( ( ( RULE_COMA )? ) )
            // InternalTourDsl.g:1460:1: ( ( RULE_COMA )? )
            {
            // InternalTourDsl.g:1460:1: ( ( RULE_COMA )? )
            // InternalTourDsl.g:1461:2: ( RULE_COMA )?
            {
             before(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_14()); 
            // InternalTourDsl.g:1462:2: ( RULE_COMA )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COMA) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTourDsl.g:1462:3: RULE_COMA
                    {
                    match(input,RULE_COMA,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHotspotAccess().getCOMATerminalRuleCall_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__Group__14__Impl"


    // $ANTLR start "rule__Rotation__Group__0"
    // InternalTourDsl.g:1471:1: rule__Rotation__Group__0 : rule__Rotation__Group__0__Impl rule__Rotation__Group__1 ;
    public final void rule__Rotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1475:1: ( rule__Rotation__Group__0__Impl rule__Rotation__Group__1 )
            // InternalTourDsl.g:1476:2: rule__Rotation__Group__0__Impl rule__Rotation__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Rotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__0"


    // $ANTLR start "rule__Rotation__Group__0__Impl"
    // InternalTourDsl.g:1483:1: rule__Rotation__Group__0__Impl : ( () ) ;
    public final void rule__Rotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1487:1: ( ( () ) )
            // InternalTourDsl.g:1488:1: ( () )
            {
            // InternalTourDsl.g:1488:1: ( () )
            // InternalTourDsl.g:1489:2: ()
            {
             before(grammarAccess.getRotationAccess().getRotationAction_0()); 
            // InternalTourDsl.g:1490:2: ()
            // InternalTourDsl.g:1490:3: 
            {
            }

             after(grammarAccess.getRotationAccess().getRotationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__0__Impl"


    // $ANTLR start "rule__Rotation__Group__1"
    // InternalTourDsl.g:1498:1: rule__Rotation__Group__1 : rule__Rotation__Group__1__Impl rule__Rotation__Group__2 ;
    public final void rule__Rotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1502:1: ( rule__Rotation__Group__1__Impl rule__Rotation__Group__2 )
            // InternalTourDsl.g:1503:2: rule__Rotation__Group__1__Impl rule__Rotation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__1"


    // $ANTLR start "rule__Rotation__Group__1__Impl"
    // InternalTourDsl.g:1510:1: rule__Rotation__Group__1__Impl : ( RULE_T_ROTATION ) ;
    public final void rule__Rotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1514:1: ( ( RULE_T_ROTATION ) )
            // InternalTourDsl.g:1515:1: ( RULE_T_ROTATION )
            {
            // InternalTourDsl.g:1515:1: ( RULE_T_ROTATION )
            // InternalTourDsl.g:1516:2: RULE_T_ROTATION
            {
             before(grammarAccess.getRotationAccess().getT_ROTATIONTerminalRuleCall_1()); 
            match(input,RULE_T_ROTATION,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getT_ROTATIONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__1__Impl"


    // $ANTLR start "rule__Rotation__Group__2"
    // InternalTourDsl.g:1525:1: rule__Rotation__Group__2 : rule__Rotation__Group__2__Impl rule__Rotation__Group__3 ;
    public final void rule__Rotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1529:1: ( rule__Rotation__Group__2__Impl rule__Rotation__Group__3 )
            // InternalTourDsl.g:1530:2: rule__Rotation__Group__2__Impl rule__Rotation__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Rotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__2"


    // $ANTLR start "rule__Rotation__Group__2__Impl"
    // InternalTourDsl.g:1537:1: rule__Rotation__Group__2__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Rotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1541:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:1542:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:1542:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:1543:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_2()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__2__Impl"


    // $ANTLR start "rule__Rotation__Group__3"
    // InternalTourDsl.g:1552:1: rule__Rotation__Group__3 : rule__Rotation__Group__3__Impl rule__Rotation__Group__4 ;
    public final void rule__Rotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1556:1: ( rule__Rotation__Group__3__Impl rule__Rotation__Group__4 )
            // InternalTourDsl.g:1557:2: rule__Rotation__Group__3__Impl rule__Rotation__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Rotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__3"


    // $ANTLR start "rule__Rotation__Group__3__Impl"
    // InternalTourDsl.g:1564:1: rule__Rotation__Group__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Rotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1568:1: ( ( RULE_LBRACKET ) )
            // InternalTourDsl.g:1569:1: ( RULE_LBRACKET )
            {
            // InternalTourDsl.g:1569:1: ( RULE_LBRACKET )
            // InternalTourDsl.g:1570:2: RULE_LBRACKET
            {
             before(grammarAccess.getRotationAccess().getLBRACKETTerminalRuleCall_3()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getLBRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__3__Impl"


    // $ANTLR start "rule__Rotation__Group__4"
    // InternalTourDsl.g:1579:1: rule__Rotation__Group__4 : rule__Rotation__Group__4__Impl rule__Rotation__Group__5 ;
    public final void rule__Rotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1583:1: ( rule__Rotation__Group__4__Impl rule__Rotation__Group__5 )
            // InternalTourDsl.g:1584:2: rule__Rotation__Group__4__Impl rule__Rotation__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Rotation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__4"


    // $ANTLR start "rule__Rotation__Group__4__Impl"
    // InternalTourDsl.g:1591:1: rule__Rotation__Group__4__Impl : ( RULE_ROTX ) ;
    public final void rule__Rotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1595:1: ( ( RULE_ROTX ) )
            // InternalTourDsl.g:1596:1: ( RULE_ROTX )
            {
            // InternalTourDsl.g:1596:1: ( RULE_ROTX )
            // InternalTourDsl.g:1597:2: RULE_ROTX
            {
             before(grammarAccess.getRotationAccess().getROTXTerminalRuleCall_4()); 
            match(input,RULE_ROTX,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getROTXTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__4__Impl"


    // $ANTLR start "rule__Rotation__Group__5"
    // InternalTourDsl.g:1606:1: rule__Rotation__Group__5 : rule__Rotation__Group__5__Impl rule__Rotation__Group__6 ;
    public final void rule__Rotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1610:1: ( rule__Rotation__Group__5__Impl rule__Rotation__Group__6 )
            // InternalTourDsl.g:1611:2: rule__Rotation__Group__5__Impl rule__Rotation__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Rotation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__5"


    // $ANTLR start "rule__Rotation__Group__5__Impl"
    // InternalTourDsl.g:1618:1: rule__Rotation__Group__5__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Rotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1622:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:1623:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:1623:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:1624:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_5()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__5__Impl"


    // $ANTLR start "rule__Rotation__Group__6"
    // InternalTourDsl.g:1633:1: rule__Rotation__Group__6 : rule__Rotation__Group__6__Impl rule__Rotation__Group__7 ;
    public final void rule__Rotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1637:1: ( rule__Rotation__Group__6__Impl rule__Rotation__Group__7 )
            // InternalTourDsl.g:1638:2: rule__Rotation__Group__6__Impl rule__Rotation__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Rotation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__6"


    // $ANTLR start "rule__Rotation__Group__6__Impl"
    // InternalTourDsl.g:1645:1: rule__Rotation__Group__6__Impl : ( ( rule__Rotation__XAssignment_6 )? ) ;
    public final void rule__Rotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1649:1: ( ( ( rule__Rotation__XAssignment_6 )? ) )
            // InternalTourDsl.g:1650:1: ( ( rule__Rotation__XAssignment_6 )? )
            {
            // InternalTourDsl.g:1650:1: ( ( rule__Rotation__XAssignment_6 )? )
            // InternalTourDsl.g:1651:2: ( rule__Rotation__XAssignment_6 )?
            {
             before(grammarAccess.getRotationAccess().getXAssignment_6()); 
            // InternalTourDsl.g:1652:2: ( rule__Rotation__XAssignment_6 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT||(LA7_0>=32 && LA7_0<=33)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTourDsl.g:1652:3: rule__Rotation__XAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rotation__XAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRotationAccess().getXAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__6__Impl"


    // $ANTLR start "rule__Rotation__Group__7"
    // InternalTourDsl.g:1660:1: rule__Rotation__Group__7 : rule__Rotation__Group__7__Impl rule__Rotation__Group__8 ;
    public final void rule__Rotation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1664:1: ( rule__Rotation__Group__7__Impl rule__Rotation__Group__8 )
            // InternalTourDsl.g:1665:2: rule__Rotation__Group__7__Impl rule__Rotation__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Rotation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__7"


    // $ANTLR start "rule__Rotation__Group__7__Impl"
    // InternalTourDsl.g:1672:1: rule__Rotation__Group__7__Impl : ( RULE_COMA ) ;
    public final void rule__Rotation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1676:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:1677:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:1677:1: ( RULE_COMA )
            // InternalTourDsl.g:1678:2: RULE_COMA
            {
             before(grammarAccess.getRotationAccess().getCOMATerminalRuleCall_7()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOMATerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__7__Impl"


    // $ANTLR start "rule__Rotation__Group__8"
    // InternalTourDsl.g:1687:1: rule__Rotation__Group__8 : rule__Rotation__Group__8__Impl rule__Rotation__Group__9 ;
    public final void rule__Rotation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1691:1: ( rule__Rotation__Group__8__Impl rule__Rotation__Group__9 )
            // InternalTourDsl.g:1692:2: rule__Rotation__Group__8__Impl rule__Rotation__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Rotation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__8"


    // $ANTLR start "rule__Rotation__Group__8__Impl"
    // InternalTourDsl.g:1699:1: rule__Rotation__Group__8__Impl : ( RULE_ROTY ) ;
    public final void rule__Rotation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1703:1: ( ( RULE_ROTY ) )
            // InternalTourDsl.g:1704:1: ( RULE_ROTY )
            {
            // InternalTourDsl.g:1704:1: ( RULE_ROTY )
            // InternalTourDsl.g:1705:2: RULE_ROTY
            {
             before(grammarAccess.getRotationAccess().getROTYTerminalRuleCall_8()); 
            match(input,RULE_ROTY,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getROTYTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__8__Impl"


    // $ANTLR start "rule__Rotation__Group__9"
    // InternalTourDsl.g:1714:1: rule__Rotation__Group__9 : rule__Rotation__Group__9__Impl rule__Rotation__Group__10 ;
    public final void rule__Rotation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1718:1: ( rule__Rotation__Group__9__Impl rule__Rotation__Group__10 )
            // InternalTourDsl.g:1719:2: rule__Rotation__Group__9__Impl rule__Rotation__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Rotation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__9"


    // $ANTLR start "rule__Rotation__Group__9__Impl"
    // InternalTourDsl.g:1726:1: rule__Rotation__Group__9__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Rotation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1730:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:1731:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:1731:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:1732:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_9()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__9__Impl"


    // $ANTLR start "rule__Rotation__Group__10"
    // InternalTourDsl.g:1741:1: rule__Rotation__Group__10 : rule__Rotation__Group__10__Impl rule__Rotation__Group__11 ;
    public final void rule__Rotation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1745:1: ( rule__Rotation__Group__10__Impl rule__Rotation__Group__11 )
            // InternalTourDsl.g:1746:2: rule__Rotation__Group__10__Impl rule__Rotation__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Rotation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__10"


    // $ANTLR start "rule__Rotation__Group__10__Impl"
    // InternalTourDsl.g:1753:1: rule__Rotation__Group__10__Impl : ( ( rule__Rotation__YAssignment_10 )? ) ;
    public final void rule__Rotation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1757:1: ( ( ( rule__Rotation__YAssignment_10 )? ) )
            // InternalTourDsl.g:1758:1: ( ( rule__Rotation__YAssignment_10 )? )
            {
            // InternalTourDsl.g:1758:1: ( ( rule__Rotation__YAssignment_10 )? )
            // InternalTourDsl.g:1759:2: ( rule__Rotation__YAssignment_10 )?
            {
             before(grammarAccess.getRotationAccess().getYAssignment_10()); 
            // InternalTourDsl.g:1760:2: ( rule__Rotation__YAssignment_10 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=32 && LA8_0<=33)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTourDsl.g:1760:3: rule__Rotation__YAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rotation__YAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRotationAccess().getYAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__10__Impl"


    // $ANTLR start "rule__Rotation__Group__11"
    // InternalTourDsl.g:1768:1: rule__Rotation__Group__11 : rule__Rotation__Group__11__Impl rule__Rotation__Group__12 ;
    public final void rule__Rotation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1772:1: ( rule__Rotation__Group__11__Impl rule__Rotation__Group__12 )
            // InternalTourDsl.g:1773:2: rule__Rotation__Group__11__Impl rule__Rotation__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__Rotation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__11"


    // $ANTLR start "rule__Rotation__Group__11__Impl"
    // InternalTourDsl.g:1780:1: rule__Rotation__Group__11__Impl : ( RULE_COMA ) ;
    public final void rule__Rotation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1784:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:1785:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:1785:1: ( RULE_COMA )
            // InternalTourDsl.g:1786:2: RULE_COMA
            {
             before(grammarAccess.getRotationAccess().getCOMATerminalRuleCall_11()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getCOMATerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__11__Impl"


    // $ANTLR start "rule__Rotation__Group__12"
    // InternalTourDsl.g:1795:1: rule__Rotation__Group__12 : rule__Rotation__Group__12__Impl rule__Rotation__Group__13 ;
    public final void rule__Rotation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1799:1: ( rule__Rotation__Group__12__Impl rule__Rotation__Group__13 )
            // InternalTourDsl.g:1800:2: rule__Rotation__Group__12__Impl rule__Rotation__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__Rotation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__12"


    // $ANTLR start "rule__Rotation__Group__12__Impl"
    // InternalTourDsl.g:1807:1: rule__Rotation__Group__12__Impl : ( RULE_ROTZ ) ;
    public final void rule__Rotation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1811:1: ( ( RULE_ROTZ ) )
            // InternalTourDsl.g:1812:1: ( RULE_ROTZ )
            {
            // InternalTourDsl.g:1812:1: ( RULE_ROTZ )
            // InternalTourDsl.g:1813:2: RULE_ROTZ
            {
             before(grammarAccess.getRotationAccess().getROTZTerminalRuleCall_12()); 
            match(input,RULE_ROTZ,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getROTZTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__12__Impl"


    // $ANTLR start "rule__Rotation__Group__13"
    // InternalTourDsl.g:1822:1: rule__Rotation__Group__13 : rule__Rotation__Group__13__Impl rule__Rotation__Group__14 ;
    public final void rule__Rotation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1826:1: ( rule__Rotation__Group__13__Impl rule__Rotation__Group__14 )
            // InternalTourDsl.g:1827:2: rule__Rotation__Group__13__Impl rule__Rotation__Group__14
            {
            pushFollow(FOLLOW_22);
            rule__Rotation__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__13"


    // $ANTLR start "rule__Rotation__Group__13__Impl"
    // InternalTourDsl.g:1834:1: rule__Rotation__Group__13__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Rotation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1838:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:1839:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:1839:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:1840:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_13()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getTWOPOINTSTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__13__Impl"


    // $ANTLR start "rule__Rotation__Group__14"
    // InternalTourDsl.g:1849:1: rule__Rotation__Group__14 : rule__Rotation__Group__14__Impl rule__Rotation__Group__15 ;
    public final void rule__Rotation__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1853:1: ( rule__Rotation__Group__14__Impl rule__Rotation__Group__15 )
            // InternalTourDsl.g:1854:2: rule__Rotation__Group__14__Impl rule__Rotation__Group__15
            {
            pushFollow(FOLLOW_22);
            rule__Rotation__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rotation__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__14"


    // $ANTLR start "rule__Rotation__Group__14__Impl"
    // InternalTourDsl.g:1861:1: rule__Rotation__Group__14__Impl : ( ( rule__Rotation__ZAssignment_14 )? ) ;
    public final void rule__Rotation__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1865:1: ( ( ( rule__Rotation__ZAssignment_14 )? ) )
            // InternalTourDsl.g:1866:1: ( ( rule__Rotation__ZAssignment_14 )? )
            {
            // InternalTourDsl.g:1866:1: ( ( rule__Rotation__ZAssignment_14 )? )
            // InternalTourDsl.g:1867:2: ( rule__Rotation__ZAssignment_14 )?
            {
             before(grammarAccess.getRotationAccess().getZAssignment_14()); 
            // InternalTourDsl.g:1868:2: ( rule__Rotation__ZAssignment_14 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT||(LA9_0>=32 && LA9_0<=33)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTourDsl.g:1868:3: rule__Rotation__ZAssignment_14
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rotation__ZAssignment_14();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRotationAccess().getZAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__14__Impl"


    // $ANTLR start "rule__Rotation__Group__15"
    // InternalTourDsl.g:1876:1: rule__Rotation__Group__15 : rule__Rotation__Group__15__Impl ;
    public final void rule__Rotation__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1880:1: ( rule__Rotation__Group__15__Impl )
            // InternalTourDsl.g:1881:2: rule__Rotation__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rotation__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__15"


    // $ANTLR start "rule__Rotation__Group__15__Impl"
    // InternalTourDsl.g:1887:1: rule__Rotation__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Rotation__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1891:1: ( ( RULE_RBRACKET ) )
            // InternalTourDsl.g:1892:1: ( RULE_RBRACKET )
            {
            // InternalTourDsl.g:1892:1: ( RULE_RBRACKET )
            // InternalTourDsl.g:1893:2: RULE_RBRACKET
            {
             before(grammarAccess.getRotationAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getRotationAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__Group__15__Impl"


    // $ANTLR start "rule__Position__Group__0"
    // InternalTourDsl.g:1903:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1907:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalTourDsl.g:1908:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalTourDsl.g:1915:1: rule__Position__Group__0__Impl : ( () ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1919:1: ( ( () ) )
            // InternalTourDsl.g:1920:1: ( () )
            {
            // InternalTourDsl.g:1920:1: ( () )
            // InternalTourDsl.g:1921:2: ()
            {
             before(grammarAccess.getPositionAccess().getPositionAction_0()); 
            // InternalTourDsl.g:1922:2: ()
            // InternalTourDsl.g:1922:3: 
            {
            }

             after(grammarAccess.getPositionAccess().getPositionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalTourDsl.g:1930:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1934:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalTourDsl.g:1935:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalTourDsl.g:1942:1: rule__Position__Group__1__Impl : ( RULE_T_POSITION ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1946:1: ( ( RULE_T_POSITION ) )
            // InternalTourDsl.g:1947:1: ( RULE_T_POSITION )
            {
            // InternalTourDsl.g:1947:1: ( RULE_T_POSITION )
            // InternalTourDsl.g:1948:2: RULE_T_POSITION
            {
             before(grammarAccess.getPositionAccess().getT_POSITIONTerminalRuleCall_1()); 
            match(input,RULE_T_POSITION,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getT_POSITIONTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalTourDsl.g:1957:1: rule__Position__Group__2 : rule__Position__Group__2__Impl rule__Position__Group__3 ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1961:1: ( rule__Position__Group__2__Impl rule__Position__Group__3 )
            // InternalTourDsl.g:1962:2: rule__Position__Group__2__Impl rule__Position__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Position__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalTourDsl.g:1969:1: rule__Position__Group__2__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1973:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:1974:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:1974:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:1975:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_2()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__3"
    // InternalTourDsl.g:1984:1: rule__Position__Group__3 : rule__Position__Group__3__Impl rule__Position__Group__4 ;
    public final void rule__Position__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:1988:1: ( rule__Position__Group__3__Impl rule__Position__Group__4 )
            // InternalTourDsl.g:1989:2: rule__Position__Group__3__Impl rule__Position__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Position__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3"


    // $ANTLR start "rule__Position__Group__3__Impl"
    // InternalTourDsl.g:1996:1: rule__Position__Group__3__Impl : ( RULE_LBRACKET ) ;
    public final void rule__Position__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2000:1: ( ( RULE_LBRACKET ) )
            // InternalTourDsl.g:2001:1: ( RULE_LBRACKET )
            {
            // InternalTourDsl.g:2001:1: ( RULE_LBRACKET )
            // InternalTourDsl.g:2002:2: RULE_LBRACKET
            {
             before(grammarAccess.getPositionAccess().getLBRACKETTerminalRuleCall_3()); 
            match(input,RULE_LBRACKET,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getLBRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3__Impl"


    // $ANTLR start "rule__Position__Group__4"
    // InternalTourDsl.g:2011:1: rule__Position__Group__4 : rule__Position__Group__4__Impl rule__Position__Group__5 ;
    public final void rule__Position__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2015:1: ( rule__Position__Group__4__Impl rule__Position__Group__5 )
            // InternalTourDsl.g:2016:2: rule__Position__Group__4__Impl rule__Position__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Position__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4"


    // $ANTLR start "rule__Position__Group__4__Impl"
    // InternalTourDsl.g:2023:1: rule__Position__Group__4__Impl : ( RULE_POSX ) ;
    public final void rule__Position__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2027:1: ( ( RULE_POSX ) )
            // InternalTourDsl.g:2028:1: ( RULE_POSX )
            {
            // InternalTourDsl.g:2028:1: ( RULE_POSX )
            // InternalTourDsl.g:2029:2: RULE_POSX
            {
             before(grammarAccess.getPositionAccess().getPOSXTerminalRuleCall_4()); 
            match(input,RULE_POSX,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPOSXTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4__Impl"


    // $ANTLR start "rule__Position__Group__5"
    // InternalTourDsl.g:2038:1: rule__Position__Group__5 : rule__Position__Group__5__Impl rule__Position__Group__6 ;
    public final void rule__Position__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2042:1: ( rule__Position__Group__5__Impl rule__Position__Group__6 )
            // InternalTourDsl.g:2043:2: rule__Position__Group__5__Impl rule__Position__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Position__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__5"


    // $ANTLR start "rule__Position__Group__5__Impl"
    // InternalTourDsl.g:2050:1: rule__Position__Group__5__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Position__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2054:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:2055:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:2055:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:2056:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_5()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__5__Impl"


    // $ANTLR start "rule__Position__Group__6"
    // InternalTourDsl.g:2065:1: rule__Position__Group__6 : rule__Position__Group__6__Impl rule__Position__Group__7 ;
    public final void rule__Position__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2069:1: ( rule__Position__Group__6__Impl rule__Position__Group__7 )
            // InternalTourDsl.g:2070:2: rule__Position__Group__6__Impl rule__Position__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Position__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__6"


    // $ANTLR start "rule__Position__Group__6__Impl"
    // InternalTourDsl.g:2077:1: rule__Position__Group__6__Impl : ( ( rule__Position__XAssignment_6 )? ) ;
    public final void rule__Position__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2081:1: ( ( ( rule__Position__XAssignment_6 )? ) )
            // InternalTourDsl.g:2082:1: ( ( rule__Position__XAssignment_6 )? )
            {
            // InternalTourDsl.g:2082:1: ( ( rule__Position__XAssignment_6 )? )
            // InternalTourDsl.g:2083:2: ( rule__Position__XAssignment_6 )?
            {
             before(grammarAccess.getPositionAccess().getXAssignment_6()); 
            // InternalTourDsl.g:2084:2: ( rule__Position__XAssignment_6 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT||(LA10_0>=32 && LA10_0<=33)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTourDsl.g:2084:3: rule__Position__XAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__XAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAccess().getXAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__6__Impl"


    // $ANTLR start "rule__Position__Group__7"
    // InternalTourDsl.g:2092:1: rule__Position__Group__7 : rule__Position__Group__7__Impl rule__Position__Group__8 ;
    public final void rule__Position__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2096:1: ( rule__Position__Group__7__Impl rule__Position__Group__8 )
            // InternalTourDsl.g:2097:2: rule__Position__Group__7__Impl rule__Position__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Position__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__7"


    // $ANTLR start "rule__Position__Group__7__Impl"
    // InternalTourDsl.g:2104:1: rule__Position__Group__7__Impl : ( RULE_COMA ) ;
    public final void rule__Position__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2108:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:2109:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:2109:1: ( RULE_COMA )
            // InternalTourDsl.g:2110:2: RULE_COMA
            {
             before(grammarAccess.getPositionAccess().getCOMATerminalRuleCall_7()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOMATerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__7__Impl"


    // $ANTLR start "rule__Position__Group__8"
    // InternalTourDsl.g:2119:1: rule__Position__Group__8 : rule__Position__Group__8__Impl rule__Position__Group__9 ;
    public final void rule__Position__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2123:1: ( rule__Position__Group__8__Impl rule__Position__Group__9 )
            // InternalTourDsl.g:2124:2: rule__Position__Group__8__Impl rule__Position__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__Position__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__8"


    // $ANTLR start "rule__Position__Group__8__Impl"
    // InternalTourDsl.g:2131:1: rule__Position__Group__8__Impl : ( RULE_POSY ) ;
    public final void rule__Position__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2135:1: ( ( RULE_POSY ) )
            // InternalTourDsl.g:2136:1: ( RULE_POSY )
            {
            // InternalTourDsl.g:2136:1: ( RULE_POSY )
            // InternalTourDsl.g:2137:2: RULE_POSY
            {
             before(grammarAccess.getPositionAccess().getPOSYTerminalRuleCall_8()); 
            match(input,RULE_POSY,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPOSYTerminalRuleCall_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__8__Impl"


    // $ANTLR start "rule__Position__Group__9"
    // InternalTourDsl.g:2146:1: rule__Position__Group__9 : rule__Position__Group__9__Impl rule__Position__Group__10 ;
    public final void rule__Position__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2150:1: ( rule__Position__Group__9__Impl rule__Position__Group__10 )
            // InternalTourDsl.g:2151:2: rule__Position__Group__9__Impl rule__Position__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Position__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__9"


    // $ANTLR start "rule__Position__Group__9__Impl"
    // InternalTourDsl.g:2158:1: rule__Position__Group__9__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Position__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2162:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:2163:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:2163:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:2164:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_9()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__9__Impl"


    // $ANTLR start "rule__Position__Group__10"
    // InternalTourDsl.g:2173:1: rule__Position__Group__10 : rule__Position__Group__10__Impl rule__Position__Group__11 ;
    public final void rule__Position__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2177:1: ( rule__Position__Group__10__Impl rule__Position__Group__11 )
            // InternalTourDsl.g:2178:2: rule__Position__Group__10__Impl rule__Position__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Position__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__10"


    // $ANTLR start "rule__Position__Group__10__Impl"
    // InternalTourDsl.g:2185:1: rule__Position__Group__10__Impl : ( ( rule__Position__YAssignment_10 )? ) ;
    public final void rule__Position__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2189:1: ( ( ( rule__Position__YAssignment_10 )? ) )
            // InternalTourDsl.g:2190:1: ( ( rule__Position__YAssignment_10 )? )
            {
            // InternalTourDsl.g:2190:1: ( ( rule__Position__YAssignment_10 )? )
            // InternalTourDsl.g:2191:2: ( rule__Position__YAssignment_10 )?
            {
             before(grammarAccess.getPositionAccess().getYAssignment_10()); 
            // InternalTourDsl.g:2192:2: ( rule__Position__YAssignment_10 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||(LA11_0>=32 && LA11_0<=33)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTourDsl.g:2192:3: rule__Position__YAssignment_10
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__YAssignment_10();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAccess().getYAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__10__Impl"


    // $ANTLR start "rule__Position__Group__11"
    // InternalTourDsl.g:2200:1: rule__Position__Group__11 : rule__Position__Group__11__Impl rule__Position__Group__12 ;
    public final void rule__Position__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2204:1: ( rule__Position__Group__11__Impl rule__Position__Group__12 )
            // InternalTourDsl.g:2205:2: rule__Position__Group__11__Impl rule__Position__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__Position__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__11"


    // $ANTLR start "rule__Position__Group__11__Impl"
    // InternalTourDsl.g:2212:1: rule__Position__Group__11__Impl : ( RULE_COMA ) ;
    public final void rule__Position__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2216:1: ( ( RULE_COMA ) )
            // InternalTourDsl.g:2217:1: ( RULE_COMA )
            {
            // InternalTourDsl.g:2217:1: ( RULE_COMA )
            // InternalTourDsl.g:2218:2: RULE_COMA
            {
             before(grammarAccess.getPositionAccess().getCOMATerminalRuleCall_11()); 
            match(input,RULE_COMA,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCOMATerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__11__Impl"


    // $ANTLR start "rule__Position__Group__12"
    // InternalTourDsl.g:2227:1: rule__Position__Group__12 : rule__Position__Group__12__Impl rule__Position__Group__13 ;
    public final void rule__Position__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2231:1: ( rule__Position__Group__12__Impl rule__Position__Group__13 )
            // InternalTourDsl.g:2232:2: rule__Position__Group__12__Impl rule__Position__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__Position__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__12"


    // $ANTLR start "rule__Position__Group__12__Impl"
    // InternalTourDsl.g:2239:1: rule__Position__Group__12__Impl : ( RULE_POSZ ) ;
    public final void rule__Position__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2243:1: ( ( RULE_POSZ ) )
            // InternalTourDsl.g:2244:1: ( RULE_POSZ )
            {
            // InternalTourDsl.g:2244:1: ( RULE_POSZ )
            // InternalTourDsl.g:2245:2: RULE_POSZ
            {
             before(grammarAccess.getPositionAccess().getPOSZTerminalRuleCall_12()); 
            match(input,RULE_POSZ,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPOSZTerminalRuleCall_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__12__Impl"


    // $ANTLR start "rule__Position__Group__13"
    // InternalTourDsl.g:2254:1: rule__Position__Group__13 : rule__Position__Group__13__Impl rule__Position__Group__14 ;
    public final void rule__Position__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2258:1: ( rule__Position__Group__13__Impl rule__Position__Group__14 )
            // InternalTourDsl.g:2259:2: rule__Position__Group__13__Impl rule__Position__Group__14
            {
            pushFollow(FOLLOW_22);
            rule__Position__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__13"


    // $ANTLR start "rule__Position__Group__13__Impl"
    // InternalTourDsl.g:2266:1: rule__Position__Group__13__Impl : ( RULE_TWOPOINTS ) ;
    public final void rule__Position__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2270:1: ( ( RULE_TWOPOINTS ) )
            // InternalTourDsl.g:2271:1: ( RULE_TWOPOINTS )
            {
            // InternalTourDsl.g:2271:1: ( RULE_TWOPOINTS )
            // InternalTourDsl.g:2272:2: RULE_TWOPOINTS
            {
             before(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_13()); 
            match(input,RULE_TWOPOINTS,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getTWOPOINTSTerminalRuleCall_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__13__Impl"


    // $ANTLR start "rule__Position__Group__14"
    // InternalTourDsl.g:2281:1: rule__Position__Group__14 : rule__Position__Group__14__Impl rule__Position__Group__15 ;
    public final void rule__Position__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2285:1: ( rule__Position__Group__14__Impl rule__Position__Group__15 )
            // InternalTourDsl.g:2286:2: rule__Position__Group__14__Impl rule__Position__Group__15
            {
            pushFollow(FOLLOW_22);
            rule__Position__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__14"


    // $ANTLR start "rule__Position__Group__14__Impl"
    // InternalTourDsl.g:2293:1: rule__Position__Group__14__Impl : ( ( rule__Position__ZAssignment_14 )? ) ;
    public final void rule__Position__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2297:1: ( ( ( rule__Position__ZAssignment_14 )? ) )
            // InternalTourDsl.g:2298:1: ( ( rule__Position__ZAssignment_14 )? )
            {
            // InternalTourDsl.g:2298:1: ( ( rule__Position__ZAssignment_14 )? )
            // InternalTourDsl.g:2299:2: ( rule__Position__ZAssignment_14 )?
            {
             before(grammarAccess.getPositionAccess().getZAssignment_14()); 
            // InternalTourDsl.g:2300:2: ( rule__Position__ZAssignment_14 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||(LA12_0>=32 && LA12_0<=33)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTourDsl.g:2300:3: rule__Position__ZAssignment_14
                    {
                    pushFollow(FOLLOW_2);
                    rule__Position__ZAssignment_14();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAccess().getZAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__14__Impl"


    // $ANTLR start "rule__Position__Group__15"
    // InternalTourDsl.g:2308:1: rule__Position__Group__15 : rule__Position__Group__15__Impl ;
    public final void rule__Position__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2312:1: ( rule__Position__Group__15__Impl )
            // InternalTourDsl.g:2313:2: rule__Position__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__15"


    // $ANTLR start "rule__Position__Group__15__Impl"
    // InternalTourDsl.g:2319:1: rule__Position__Group__15__Impl : ( RULE_RBRACKET ) ;
    public final void rule__Position__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2323:1: ( ( RULE_RBRACKET ) )
            // InternalTourDsl.g:2324:1: ( RULE_RBRACKET )
            {
            // InternalTourDsl.g:2324:1: ( RULE_RBRACKET )
            // InternalTourDsl.g:2325:2: RULE_RBRACKET
            {
             before(grammarAccess.getPositionAccess().getRBRACKETTerminalRuleCall_15()); 
            match(input,RULE_RBRACKET,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getRBRACKETTerminalRuleCall_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__15__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalTourDsl.g:2335:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2339:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalTourDsl.g:2340:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalTourDsl.g:2347:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2351:1: ( ( ( '-' )? ) )
            // InternalTourDsl.g:2352:1: ( ( '-' )? )
            {
            // InternalTourDsl.g:2352:1: ( ( '-' )? )
            // InternalTourDsl.g:2353:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalTourDsl.g:2354:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTourDsl.g:2354:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalTourDsl.g:2362:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2366:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalTourDsl.g:2367:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalTourDsl.g:2374:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2378:1: ( ( ( RULE_INT )? ) )
            // InternalTourDsl.g:2379:1: ( ( RULE_INT )? )
            {
            // InternalTourDsl.g:2379:1: ( ( RULE_INT )? )
            // InternalTourDsl.g:2380:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalTourDsl.g:2381:2: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTourDsl.g:2381:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalTourDsl.g:2389:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2393:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalTourDsl.g:2394:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalTourDsl.g:2401:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2405:1: ( ( '.' ) )
            // InternalTourDsl.g:2406:1: ( '.' )
            {
            // InternalTourDsl.g:2406:1: ( '.' )
            // InternalTourDsl.g:2407:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalTourDsl.g:2416:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2420:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalTourDsl.g:2421:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalTourDsl.g:2428:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2432:1: ( ( RULE_INT ) )
            // InternalTourDsl.g:2433:1: ( RULE_INT )
            {
            // InternalTourDsl.g:2433:1: ( RULE_INT )
            // InternalTourDsl.g:2434:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalTourDsl.g:2443:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2447:1: ( rule__EDouble__Group__4__Impl )
            // InternalTourDsl.g:2448:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalTourDsl.g:2454:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2458:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalTourDsl.g:2459:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalTourDsl.g:2459:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalTourDsl.g:2460:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalTourDsl.g:2461:2: ( rule__EDouble__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=30 && LA15_0<=31)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTourDsl.g:2461:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalTourDsl.g:2470:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2474:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalTourDsl.g:2475:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalTourDsl.g:2482:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2486:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalTourDsl.g:2487:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalTourDsl.g:2487:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalTourDsl.g:2488:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalTourDsl.g:2489:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalTourDsl.g:2489:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalTourDsl.g:2497:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2501:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalTourDsl.g:2502:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalTourDsl.g:2509:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2513:1: ( ( ( '-' )? ) )
            // InternalTourDsl.g:2514:1: ( ( '-' )? )
            {
            // InternalTourDsl.g:2514:1: ( ( '-' )? )
            // InternalTourDsl.g:2515:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTourDsl.g:2516:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTourDsl.g:2516:3: '-'
                    {
                    match(input,32,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalTourDsl.g:2524:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2528:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalTourDsl.g:2529:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalTourDsl.g:2535:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2539:1: ( ( RULE_INT ) )
            // InternalTourDsl.g:2540:1: ( RULE_INT )
            {
            // InternalTourDsl.g:2540:1: ( RULE_INT )
            // InternalTourDsl.g:2541:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Tour__NameAssignment_4"
    // InternalTourDsl.g:2551:1: rule__Tour__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Tour__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2555:1: ( ( ruleEString ) )
            // InternalTourDsl.g:2556:2: ( ruleEString )
            {
            // InternalTourDsl.g:2556:2: ( ruleEString )
            // InternalTourDsl.g:2557:3: ruleEString
            {
             before(grammarAccess.getTourAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTourAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__NameAssignment_4"


    // $ANTLR start "rule__Tour__PanoramaAssignment_9"
    // InternalTourDsl.g:2566:1: rule__Tour__PanoramaAssignment_9 : ( rulePanorama ) ;
    public final void rule__Tour__PanoramaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2570:1: ( ( rulePanorama ) )
            // InternalTourDsl.g:2571:2: ( rulePanorama )
            {
            // InternalTourDsl.g:2571:2: ( rulePanorama )
            // InternalTourDsl.g:2572:3: rulePanorama
            {
             before(grammarAccess.getTourAccess().getPanoramaPanoramaParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePanorama();

            state._fsp--;

             after(grammarAccess.getTourAccess().getPanoramaPanoramaParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tour__PanoramaAssignment_9"


    // $ANTLR start "rule__Panorama__NameAssignment_4"
    // InternalTourDsl.g:2581:1: rule__Panorama__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Panorama__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2585:1: ( ( ruleEString ) )
            // InternalTourDsl.g:2586:2: ( ruleEString )
            {
            // InternalTourDsl.g:2586:2: ( ruleEString )
            // InternalTourDsl.g:2587:3: ruleEString
            {
             before(grammarAccess.getPanoramaAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__NameAssignment_4"


    // $ANTLR start "rule__Panorama__DescriptionAssignment_8"
    // InternalTourDsl.g:2596:1: rule__Panorama__DescriptionAssignment_8 : ( ruleEString ) ;
    public final void rule__Panorama__DescriptionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2600:1: ( ( ruleEString ) )
            // InternalTourDsl.g:2601:2: ( ruleEString )
            {
            // InternalTourDsl.g:2601:2: ( ruleEString )
            // InternalTourDsl.g:2602:3: ruleEString
            {
             before(grammarAccess.getPanoramaAccess().getDescriptionEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getDescriptionEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__DescriptionAssignment_8"


    // $ANTLR start "rule__Panorama__HotspotAssignment_13"
    // InternalTourDsl.g:2611:1: rule__Panorama__HotspotAssignment_13 : ( ruleHotspot ) ;
    public final void rule__Panorama__HotspotAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2615:1: ( ( ruleHotspot ) )
            // InternalTourDsl.g:2616:2: ( ruleHotspot )
            {
            // InternalTourDsl.g:2616:2: ( ruleHotspot )
            // InternalTourDsl.g:2617:3: ruleHotspot
            {
             before(grammarAccess.getPanoramaAccess().getHotspotHotspotParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleHotspot();

            state._fsp--;

             after(grammarAccess.getPanoramaAccess().getHotspotHotspotParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panorama__HotspotAssignment_13"


    // $ANTLR start "rule__Hotspot__NameAssignment_4"
    // InternalTourDsl.g:2626:1: rule__Hotspot__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Hotspot__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2630:1: ( ( ruleEString ) )
            // InternalTourDsl.g:2631:2: ( ruleEString )
            {
            // InternalTourDsl.g:2631:2: ( ruleEString )
            // InternalTourDsl.g:2632:3: ruleEString
            {
             before(grammarAccess.getHotspotAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__NameAssignment_4"


    // $ANTLR start "rule__Hotspot__ToAssignment_8"
    // InternalTourDsl.g:2641:1: rule__Hotspot__ToAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Hotspot__ToAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2645:1: ( ( ( ruleEString ) ) )
            // InternalTourDsl.g:2646:2: ( ( ruleEString ) )
            {
            // InternalTourDsl.g:2646:2: ( ( ruleEString ) )
            // InternalTourDsl.g:2647:3: ( ruleEString )
            {
             before(grammarAccess.getHotspotAccess().getToPanoramaCrossReference_8_0()); 
            // InternalTourDsl.g:2648:3: ( ruleEString )
            // InternalTourDsl.g:2649:4: ruleEString
            {
             before(grammarAccess.getHotspotAccess().getToPanoramaEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getToPanoramaEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getHotspotAccess().getToPanoramaCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__ToAssignment_8"


    // $ANTLR start "rule__Hotspot__PositionAssignment_10"
    // InternalTourDsl.g:2660:1: rule__Hotspot__PositionAssignment_10 : ( rulePosition ) ;
    public final void rule__Hotspot__PositionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2664:1: ( ( rulePosition ) )
            // InternalTourDsl.g:2665:2: ( rulePosition )
            {
            // InternalTourDsl.g:2665:2: ( rulePosition )
            // InternalTourDsl.g:2666:3: rulePosition
            {
             before(grammarAccess.getHotspotAccess().getPositionPositionParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getPositionPositionParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__PositionAssignment_10"


    // $ANTLR start "rule__Hotspot__RotationAssignment_12"
    // InternalTourDsl.g:2675:1: rule__Hotspot__RotationAssignment_12 : ( ruleRotation ) ;
    public final void rule__Hotspot__RotationAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2679:1: ( ( ruleRotation ) )
            // InternalTourDsl.g:2680:2: ( ruleRotation )
            {
            // InternalTourDsl.g:2680:2: ( ruleRotation )
            // InternalTourDsl.g:2681:3: ruleRotation
            {
             before(grammarAccess.getHotspotAccess().getRotationRotationParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleRotation();

            state._fsp--;

             after(grammarAccess.getHotspotAccess().getRotationRotationParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Hotspot__RotationAssignment_12"


    // $ANTLR start "rule__Rotation__XAssignment_6"
    // InternalTourDsl.g:2690:1: rule__Rotation__XAssignment_6 : ( ruleEDouble ) ;
    public final void rule__Rotation__XAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2694:1: ( ( ruleEDouble ) )
            // InternalTourDsl.g:2695:2: ( ruleEDouble )
            {
            // InternalTourDsl.g:2695:2: ( ruleEDouble )
            // InternalTourDsl.g:2696:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getXEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getXEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__XAssignment_6"


    // $ANTLR start "rule__Rotation__YAssignment_10"
    // InternalTourDsl.g:2705:1: rule__Rotation__YAssignment_10 : ( ruleEDouble ) ;
    public final void rule__Rotation__YAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2709:1: ( ( ruleEDouble ) )
            // InternalTourDsl.g:2710:2: ( ruleEDouble )
            {
            // InternalTourDsl.g:2710:2: ( ruleEDouble )
            // InternalTourDsl.g:2711:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getYEDoubleParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getYEDoubleParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__YAssignment_10"


    // $ANTLR start "rule__Rotation__ZAssignment_14"
    // InternalTourDsl.g:2720:1: rule__Rotation__ZAssignment_14 : ( ruleEDouble ) ;
    public final void rule__Rotation__ZAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2724:1: ( ( ruleEDouble ) )
            // InternalTourDsl.g:2725:2: ( ruleEDouble )
            {
            // InternalTourDsl.g:2725:2: ( ruleEDouble )
            // InternalTourDsl.g:2726:3: ruleEDouble
            {
             before(grammarAccess.getRotationAccess().getZEDoubleParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRotationAccess().getZEDoubleParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rotation__ZAssignment_14"


    // $ANTLR start "rule__Position__XAssignment_6"
    // InternalTourDsl.g:2735:1: rule__Position__XAssignment_6 : ( ruleEDouble ) ;
    public final void rule__Position__XAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2739:1: ( ( ruleEDouble ) )
            // InternalTourDsl.g:2740:2: ( ruleEDouble )
            {
            // InternalTourDsl.g:2740:2: ( ruleEDouble )
            // InternalTourDsl.g:2741:3: ruleEDouble
            {
             before(grammarAccess.getPositionAccess().getXEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getXEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__XAssignment_6"


    // $ANTLR start "rule__Position__YAssignment_10"
    // InternalTourDsl.g:2750:1: rule__Position__YAssignment_10 : ( ruleEDouble ) ;
    public final void rule__Position__YAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2754:1: ( ( ruleEDouble ) )
            // InternalTourDsl.g:2755:2: ( ruleEDouble )
            {
            // InternalTourDsl.g:2755:2: ( ruleEDouble )
            // InternalTourDsl.g:2756:3: ruleEDouble
            {
             before(grammarAccess.getPositionAccess().getYEDoubleParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getYEDoubleParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__YAssignment_10"


    // $ANTLR start "rule__Position__ZAssignment_14"
    // InternalTourDsl.g:2765:1: rule__Position__ZAssignment_14 : ( ruleEDouble ) ;
    public final void rule__Position__ZAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTourDsl.g:2769:1: ( ( ruleEDouble ) )
            // InternalTourDsl.g:2770:2: ( ruleEDouble )
            {
            // InternalTourDsl.g:2770:2: ( ruleEDouble )
            // InternalTourDsl.g:2771:3: ruleEDouble
            {
             before(grammarAccess.getPositionAccess().getZEDoubleParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getZEDoubleParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__ZAssignment_14"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000302000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000302002000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000302000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000102000000L});

}
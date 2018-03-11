package edu.uniandes.tour.tourdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTourDslLexer extends Lexer {
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

    public InternalTourDslLexer() {;} 
    public InternalTourDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTourDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTourDsl.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:11:7: ( '-' )
            // InternalTourDsl.g:11:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:12:7: ( '.' )
            // InternalTourDsl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:13:7: ( 'E' )
            // InternalTourDsl.g:13:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:14:7: ( 'e' )
            // InternalTourDsl.g:14:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:813:15: ( '{' )
            // InternalTourDsl.g:813:17: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:815:15: ( '}' )
            // InternalTourDsl.g:815:17: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_LPARENTISISCUADRADO"
    public final void mRULE_LPARENTISISCUADRADO() throws RecognitionException {
        try {
            int _type = RULE_LPARENTISISCUADRADO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:817:26: ( '[' )
            // InternalTourDsl.g:817:28: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPARENTISISCUADRADO"

    // $ANTLR start "RULE_RPARENTISISCUADRADO"
    public final void mRULE_RPARENTISISCUADRADO() throws RecognitionException {
        try {
            int _type = RULE_RPARENTISISCUADRADO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:819:26: ( ']' )
            // InternalTourDsl.g:819:28: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPARENTISISCUADRADO"

    // $ANTLR start "RULE_COMA"
    public final void mRULE_COMA() throws RecognitionException {
        try {
            int _type = RULE_COMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:821:11: ( ',' )
            // InternalTourDsl.g:821:13: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMA"

    // $ANTLR start "RULE_TWOPOINTS"
    public final void mRULE_TWOPOINTS() throws RecognitionException {
        try {
            int _type = RULE_TWOPOINTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:823:16: ( ':' )
            // InternalTourDsl.g:823:18: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TWOPOINTS"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:825:11: ( 'name' )
            // InternalTourDsl.g:825:13: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_T_PANORAMA"
    public final void mRULE_T_PANORAMA() throws RecognitionException {
        try {
            int _type = RULE_T_PANORAMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:827:17: ( 'panoramas' )
            // InternalTourDsl.g:827:19: 'panoramas'
            {
            match("panoramas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_T_PANORAMA"

    // $ANTLR start "RULE_DESCRIPTION"
    public final void mRULE_DESCRIPTION() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:829:18: ( 'description' )
            // InternalTourDsl.g:829:20: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESCRIPTION"

    // $ANTLR start "RULE_T_HOTSPOT"
    public final void mRULE_T_HOTSPOT() throws RecognitionException {
        try {
            int _type = RULE_T_HOTSPOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:831:16: ( 'hotspots' )
            // InternalTourDsl.g:831:18: 'hotspots'
            {
            match("hotspots"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_T_HOTSPOT"

    // $ANTLR start "RULE_TO"
    public final void mRULE_TO() throws RecognitionException {
        try {
            int _type = RULE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:833:9: ( 'to' )
            // InternalTourDsl.g:833:11: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TO"

    // $ANTLR start "RULE_T_POSITION"
    public final void mRULE_T_POSITION() throws RecognitionException {
        try {
            int _type = RULE_T_POSITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:835:17: ( 'position' )
            // InternalTourDsl.g:835:19: 'position'
            {
            match("position"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_T_POSITION"

    // $ANTLR start "RULE_T_ROTATION"
    public final void mRULE_T_ROTATION() throws RecognitionException {
        try {
            int _type = RULE_T_ROTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:837:17: ( 'rotation' )
            // InternalTourDsl.g:837:19: 'rotation'
            {
            match("rotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_T_ROTATION"

    // $ANTLR start "RULE_POSX"
    public final void mRULE_POSX() throws RecognitionException {
        try {
            int _type = RULE_POSX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:839:11: ( 'posx' )
            // InternalTourDsl.g:839:13: 'posx'
            {
            match("posx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSX"

    // $ANTLR start "RULE_POSY"
    public final void mRULE_POSY() throws RecognitionException {
        try {
            int _type = RULE_POSY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:841:11: ( 'posy' )
            // InternalTourDsl.g:841:13: 'posy'
            {
            match("posy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSY"

    // $ANTLR start "RULE_POSZ"
    public final void mRULE_POSZ() throws RecognitionException {
        try {
            int _type = RULE_POSZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:843:11: ( 'posz' )
            // InternalTourDsl.g:843:13: 'posz'
            {
            match("posz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSZ"

    // $ANTLR start "RULE_ROTX"
    public final void mRULE_ROTX() throws RecognitionException {
        try {
            int _type = RULE_ROTX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:845:11: ( 'rotx' )
            // InternalTourDsl.g:845:13: 'rotx'
            {
            match("rotx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROTX"

    // $ANTLR start "RULE_ROTY"
    public final void mRULE_ROTY() throws RecognitionException {
        try {
            int _type = RULE_ROTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:847:11: ( 'roty' )
            // InternalTourDsl.g:847:13: 'roty'
            {
            match("roty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROTY"

    // $ANTLR start "RULE_ROTZ"
    public final void mRULE_ROTZ() throws RecognitionException {
        try {
            int _type = RULE_ROTZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:849:11: ( 'rotz' )
            // InternalTourDsl.g:849:13: 'rotz'
            {
            match("rotz"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROTZ"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:851:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTourDsl.g:851:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTourDsl.g:851:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTourDsl.g:851:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTourDsl.g:851:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTourDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:853:10: ( ( '0' .. '9' )+ )
            // InternalTourDsl.g:853:12: ( '0' .. '9' )+
            {
            // InternalTourDsl.g:853:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTourDsl.g:853:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:855:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTourDsl.g:855:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTourDsl.g:855:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTourDsl.g:855:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTourDsl.g:855:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalTourDsl.g:855:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTourDsl.g:855:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTourDsl.g:855:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTourDsl.g:855:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalTourDsl.g:855:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTourDsl.g:855:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:857:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTourDsl.g:857:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTourDsl.g:857:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalTourDsl.g:857:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:859:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTourDsl.g:859:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTourDsl.g:859:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTourDsl.g:859:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalTourDsl.g:859:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTourDsl.g:859:41: ( '\\r' )? '\\n'
                    {
                    // InternalTourDsl.g:859:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTourDsl.g:859:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:861:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTourDsl.g:861:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTourDsl.g:861:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTourDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:863:16: ( . )
            // InternalTourDsl.g:863:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTourDsl.g:1:8: ( T__30 | T__31 | T__32 | T__33 | RULE_LBRACKET | RULE_RBRACKET | RULE_LPARENTISISCUADRADO | RULE_RPARENTISISCUADRADO | RULE_COMA | RULE_TWOPOINTS | RULE_NAME | RULE_T_PANORAMA | RULE_DESCRIPTION | RULE_T_HOTSPOT | RULE_TO | RULE_T_POSITION | RULE_T_ROTATION | RULE_POSX | RULE_POSY | RULE_POSZ | RULE_ROTX | RULE_ROTY | RULE_ROTZ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=30;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalTourDsl.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
                // InternalTourDsl.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
                // InternalTourDsl.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
                // InternalTourDsl.g:1:28: T__33
                {
                mT__33(); 

                }
                break;
            case 5 :
                // InternalTourDsl.g:1:34: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 6 :
                // InternalTourDsl.g:1:48: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 7 :
                // InternalTourDsl.g:1:62: RULE_LPARENTISISCUADRADO
                {
                mRULE_LPARENTISISCUADRADO(); 

                }
                break;
            case 8 :
                // InternalTourDsl.g:1:87: RULE_RPARENTISISCUADRADO
                {
                mRULE_RPARENTISISCUADRADO(); 

                }
                break;
            case 9 :
                // InternalTourDsl.g:1:112: RULE_COMA
                {
                mRULE_COMA(); 

                }
                break;
            case 10 :
                // InternalTourDsl.g:1:122: RULE_TWOPOINTS
                {
                mRULE_TWOPOINTS(); 

                }
                break;
            case 11 :
                // InternalTourDsl.g:1:137: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 12 :
                // InternalTourDsl.g:1:147: RULE_T_PANORAMA
                {
                mRULE_T_PANORAMA(); 

                }
                break;
            case 13 :
                // InternalTourDsl.g:1:163: RULE_DESCRIPTION
                {
                mRULE_DESCRIPTION(); 

                }
                break;
            case 14 :
                // InternalTourDsl.g:1:180: RULE_T_HOTSPOT
                {
                mRULE_T_HOTSPOT(); 

                }
                break;
            case 15 :
                // InternalTourDsl.g:1:195: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 16 :
                // InternalTourDsl.g:1:203: RULE_T_POSITION
                {
                mRULE_T_POSITION(); 

                }
                break;
            case 17 :
                // InternalTourDsl.g:1:219: RULE_T_ROTATION
                {
                mRULE_T_ROTATION(); 

                }
                break;
            case 18 :
                // InternalTourDsl.g:1:235: RULE_POSX
                {
                mRULE_POSX(); 

                }
                break;
            case 19 :
                // InternalTourDsl.g:1:245: RULE_POSY
                {
                mRULE_POSY(); 

                }
                break;
            case 20 :
                // InternalTourDsl.g:1:255: RULE_POSZ
                {
                mRULE_POSZ(); 

                }
                break;
            case 21 :
                // InternalTourDsl.g:1:265: RULE_ROTX
                {
                mRULE_ROTX(); 

                }
                break;
            case 22 :
                // InternalTourDsl.g:1:275: RULE_ROTY
                {
                mRULE_ROTY(); 

                }
                break;
            case 23 :
                // InternalTourDsl.g:1:285: RULE_ROTZ
                {
                mRULE_ROTZ(); 

                }
                break;
            case 24 :
                // InternalTourDsl.g:1:295: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalTourDsl.g:1:303: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalTourDsl.g:1:312: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // InternalTourDsl.g:1:324: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalTourDsl.g:1:340: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalTourDsl.g:1:356: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalTourDsl.g:1:364: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\3\uffff\1\33\1\35\6\uffff\6\34\1\30\2\uffff\3\30\15\uffff\5\34\1\65\1\34\5\uffff\5\34\1\uffff\1\34\1\103\2\34\1\106\1\107\1\110\3\34\1\114\1\115\1\116\1\uffff\2\34\3\uffff\3\34\3\uffff\13\34\1\137\1\34\1\141\1\142\1\143\1\uffff\1\34\3\uffff\1\34\1\146\1\uffff";
    static final String DFA12_eofS =
        "\147\uffff";
    static final String DFA12_minS =
        "\1\0\2\uffff\2\60\6\uffff\2\141\1\145\3\157\1\101\2\uffff\2\0\1\52\15\uffff\1\155\1\156\2\163\1\164\1\60\1\164\5\uffff\1\145\1\157\1\151\1\143\1\163\1\uffff\1\141\1\60\1\162\1\164\3\60\1\162\1\160\1\164\3\60\1\uffff\1\141\1\151\3\uffff\1\151\1\157\1\151\3\uffff\1\155\1\157\1\160\1\164\1\157\1\141\1\156\1\164\1\163\1\156\1\163\1\60\1\151\3\60\1\uffff\1\157\3\uffff\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\uffff\2\172\6\uffff\1\141\1\157\1\145\3\157\1\172\2\uffff\2\uffff\1\57\15\uffff\1\155\1\156\2\163\1\164\1\172\1\164\5\uffff\1\145\1\157\1\172\1\143\1\163\1\uffff\2\172\1\162\1\164\3\172\1\162\1\160\1\164\3\172\1\uffff\1\141\1\151\3\uffff\1\151\1\157\1\151\3\uffff\1\155\1\157\1\160\1\164\1\157\1\141\1\156\1\164\1\163\1\156\1\163\1\172\1\151\3\172\1\uffff\1\157\3\uffff\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff\1\30\1\31\3\uffff\1\35\1\36\1\1\1\2\1\3\1\30\1\4\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff\1\31\1\32\1\33\1\34\1\35\5\uffff\1\17\15\uffff\1\13\2\uffff\1\22\1\23\1\24\3\uffff\1\25\1\26\1\27\20\uffff\1\20\1\uffff\1\16\1\21\1\14\2\uffff\1\15";
    static final String DFA12_specialS =
        "\1\0\23\uffff\1\2\1\1\121\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\30\2\27\2\30\1\27\22\30\1\27\1\30\1\24\4\30\1\25\4\30\1\11\1\1\1\2\1\26\12\23\1\12\6\30\4\22\1\3\25\22\1\7\1\30\1\10\1\21\1\22\1\30\3\22\1\15\1\4\2\22\1\16\5\22\1\13\1\22\1\14\1\22\1\20\1\22\1\17\6\22\1\5\1\30\1\6\uff82\30",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45\15\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\54",
            "\0\54",
            "\1\55\4\uffff\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71\16\uffff\1\72\1\73\1\74",
            "\1\75",
            "\1\76",
            "",
            "\1\77\26\uffff\1\100\1\101\1\102",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\104",
            "\1\105",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\117",
            "\1\120",
            "",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\140",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\144",
            "",
            "",
            "",
            "\1\145",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | RULE_LBRACKET | RULE_RBRACKET | RULE_LPARENTISISCUADRADO | RULE_RPARENTISISCUADRADO | RULE_COMA | RULE_TWOPOINTS | RULE_NAME | RULE_T_PANORAMA | RULE_DESCRIPTION | RULE_T_HOTSPOT | RULE_TO | RULE_T_POSITION | RULE_T_ROTATION | RULE_POSX | RULE_POSY | RULE_POSZ | RULE_ROTX | RULE_ROTY | RULE_ROTZ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='-') ) {s = 1;}

                        else if ( (LA12_0=='.') ) {s = 2;}

                        else if ( (LA12_0=='E') ) {s = 3;}

                        else if ( (LA12_0=='e') ) {s = 4;}

                        else if ( (LA12_0=='{') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='[') ) {s = 7;}

                        else if ( (LA12_0==']') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0=='n') ) {s = 11;}

                        else if ( (LA12_0=='p') ) {s = 12;}

                        else if ( (LA12_0=='d') ) {s = 13;}

                        else if ( (LA12_0=='h') ) {s = 14;}

                        else if ( (LA12_0=='t') ) {s = 15;}

                        else if ( (LA12_0=='r') ) {s = 16;}

                        else if ( (LA12_0=='^') ) {s = 17;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||(LA12_0>='f' && LA12_0<='g')||(LA12_0>='i' && LA12_0<='m')||LA12_0=='o'||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='z')) ) {s = 18;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 19;}

                        else if ( (LA12_0=='\"') ) {s = 20;}

                        else if ( (LA12_0=='\'') ) {s = 21;}

                        else if ( (LA12_0=='/') ) {s = 22;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 23;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFF')) ) {s = 44;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 44;}

                        else s = 24;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
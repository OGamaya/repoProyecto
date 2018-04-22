package edu.uniandes.tour.tourdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTourDslLexer extends Lexer {
    public static final int RULE_LBRACKET=6;
    public static final int RULE_COMA=9;
    public static final int RULE_TO=17;
    public static final int RULE_NAME=7;
    public static final int RULE_T_HOTSPOT=16;
    public static final int RULE_STRING=4;
    public static final int RULE_ROTX=19;
    public static final int RULE_ROTY=20;
    public static final int RULE_ROTZ=21;
    public static final int RULE_SL_COMMENT=28;
    public static final int RULE_RPARENTISISCUADRADO=12;
    public static final int T__33=33;
    public static final int RULE_LPARENTISISCUADRADO=11;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_T_PANORAMA=10;
    public static final int RULE_T_POSITION=22;
    public static final int RULE_POSX=23;
    public static final int RULE_T_ROTATION=18;
    public static final int RULE_ID=5;
    public static final int RULE_WS=29;
    public static final int RULE_DESCRIPTION=14;
    public static final int RULE_T_IMAGEN=15;
    public static final int RULE_ANY_OTHER=30;
    public static final int RULE_POSZ=25;
    public static final int RULE_POSY=24;
    public static final int RULE_INT=26;
    public static final int RULE_TWOPOINTS=8;
    public static final int RULE_ML_COMMENT=27;
    public static final int RULE_RBRACKET=13;

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

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:11:7: ( 'E' )
            // InternalTourDsl.g:11:9: 'E'
            {
            match('E'); 

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
            // InternalTourDsl.g:12:7: ( 'e' )
            // InternalTourDsl.g:12:9: 'e'
            {
            match('e'); 

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
            // InternalTourDsl.g:13:7: ( '-' )
            // InternalTourDsl.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:14:7: ( '.' )
            // InternalTourDsl.g:14:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:2903:15: ( '{' )
            // InternalTourDsl.g:2903:17: '{'
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
            // InternalTourDsl.g:2905:15: ( '}' )
            // InternalTourDsl.g:2905:17: '}'
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
            // InternalTourDsl.g:2907:26: ( '[' )
            // InternalTourDsl.g:2907:28: '['
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
            // InternalTourDsl.g:2909:26: ( ']' )
            // InternalTourDsl.g:2909:28: ']'
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
            // InternalTourDsl.g:2911:11: ( ',' )
            // InternalTourDsl.g:2911:13: ','
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
            // InternalTourDsl.g:2913:16: ( ':' )
            // InternalTourDsl.g:2913:18: ':'
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
            // InternalTourDsl.g:2915:11: ( 'name' )
            // InternalTourDsl.g:2915:13: 'name'
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

    // $ANTLR start "RULE_T_IMAGEN"
    public final void mRULE_T_IMAGEN() throws RecognitionException {
        try {
            int _type = RULE_T_IMAGEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:2917:15: ( 'imagePath' )
            // InternalTourDsl.g:2917:17: 'imagePath'
            {
            match("imagePath"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_T_IMAGEN"

    // $ANTLR start "RULE_T_PANORAMA"
    public final void mRULE_T_PANORAMA() throws RecognitionException {
        try {
            int _type = RULE_T_PANORAMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTourDsl.g:2919:17: ( 'panoramas' )
            // InternalTourDsl.g:2919:19: 'panoramas'
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
            // InternalTourDsl.g:2921:18: ( 'description' )
            // InternalTourDsl.g:2921:20: 'description'
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
            // InternalTourDsl.g:2923:16: ( 'hotspots' )
            // InternalTourDsl.g:2923:18: 'hotspots'
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
            // InternalTourDsl.g:2925:9: ( 'to' )
            // InternalTourDsl.g:2925:11: 'to'
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
            // InternalTourDsl.g:2927:17: ( 'position' )
            // InternalTourDsl.g:2927:19: 'position'
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
            // InternalTourDsl.g:2929:17: ( 'rotation' )
            // InternalTourDsl.g:2929:19: 'rotation'
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
            // InternalTourDsl.g:2931:11: ( 'posx' )
            // InternalTourDsl.g:2931:13: 'posx'
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
            // InternalTourDsl.g:2933:11: ( 'posy' )
            // InternalTourDsl.g:2933:13: 'posy'
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
            // InternalTourDsl.g:2935:11: ( 'posz' )
            // InternalTourDsl.g:2935:13: 'posz'
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
            // InternalTourDsl.g:2937:11: ( 'rotx' )
            // InternalTourDsl.g:2937:13: 'rotx'
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
            // InternalTourDsl.g:2939:11: ( 'roty' )
            // InternalTourDsl.g:2939:13: 'roty'
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
            // InternalTourDsl.g:2941:11: ( 'rotz' )
            // InternalTourDsl.g:2941:13: 'rotz'
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
            // InternalTourDsl.g:2943:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTourDsl.g:2943:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTourDsl.g:2943:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTourDsl.g:2943:11: '^'
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

            // InternalTourDsl.g:2943:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalTourDsl.g:2945:10: ( ( '0' .. '9' )+ )
            // InternalTourDsl.g:2945:12: ( '0' .. '9' )+
            {
            // InternalTourDsl.g:2945:12: ( '0' .. '9' )+
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
            	    // InternalTourDsl.g:2945:13: '0' .. '9'
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
            // InternalTourDsl.g:2947:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTourDsl.g:2947:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTourDsl.g:2947:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTourDsl.g:2947:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTourDsl.g:2947:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTourDsl.g:2947:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTourDsl.g:2947:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTourDsl.g:2947:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTourDsl.g:2947:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTourDsl.g:2947:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTourDsl.g:2947:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTourDsl.g:2949:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTourDsl.g:2949:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTourDsl.g:2949:24: ( options {greedy=false; } : . )*
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
            	    // InternalTourDsl.g:2949:52: .
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
            // InternalTourDsl.g:2951:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTourDsl.g:2951:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTourDsl.g:2951:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTourDsl.g:2951:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTourDsl.g:2951:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTourDsl.g:2951:41: ( '\\r' )? '\\n'
                    {
                    // InternalTourDsl.g:2951:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalTourDsl.g:2951:41: '\\r'
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
            // InternalTourDsl.g:2953:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTourDsl.g:2953:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTourDsl.g:2953:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTourDsl.g:2955:16: ( . )
            // InternalTourDsl.g:2955:18: .
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
        // InternalTourDsl.g:1:8: ( T__31 | T__32 | T__33 | T__34 | RULE_LBRACKET | RULE_RBRACKET | RULE_LPARENTISISCUADRADO | RULE_RPARENTISISCUADRADO | RULE_COMA | RULE_TWOPOINTS | RULE_NAME | RULE_T_IMAGEN | RULE_T_PANORAMA | RULE_DESCRIPTION | RULE_T_HOTSPOT | RULE_TO | RULE_T_POSITION | RULE_T_ROTATION | RULE_POSX | RULE_POSY | RULE_POSZ | RULE_ROTX | RULE_ROTY | RULE_ROTZ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=31;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalTourDsl.g:1:10: T__31
                {
                mT__31(); 

                }
                break;
            case 2 :
                // InternalTourDsl.g:1:16: T__32
                {
                mT__32(); 

                }
                break;
            case 3 :
                // InternalTourDsl.g:1:22: T__33
                {
                mT__33(); 

                }
                break;
            case 4 :
                // InternalTourDsl.g:1:28: T__34
                {
                mT__34(); 

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
                // InternalTourDsl.g:1:147: RULE_T_IMAGEN
                {
                mRULE_T_IMAGEN(); 

                }
                break;
            case 13 :
                // InternalTourDsl.g:1:161: RULE_T_PANORAMA
                {
                mRULE_T_PANORAMA(); 

                }
                break;
            case 14 :
                // InternalTourDsl.g:1:177: RULE_DESCRIPTION
                {
                mRULE_DESCRIPTION(); 

                }
                break;
            case 15 :
                // InternalTourDsl.g:1:194: RULE_T_HOTSPOT
                {
                mRULE_T_HOTSPOT(); 

                }
                break;
            case 16 :
                // InternalTourDsl.g:1:209: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 17 :
                // InternalTourDsl.g:1:217: RULE_T_POSITION
                {
                mRULE_T_POSITION(); 

                }
                break;
            case 18 :
                // InternalTourDsl.g:1:233: RULE_T_ROTATION
                {
                mRULE_T_ROTATION(); 

                }
                break;
            case 19 :
                // InternalTourDsl.g:1:249: RULE_POSX
                {
                mRULE_POSX(); 

                }
                break;
            case 20 :
                // InternalTourDsl.g:1:259: RULE_POSY
                {
                mRULE_POSY(); 

                }
                break;
            case 21 :
                // InternalTourDsl.g:1:269: RULE_POSZ
                {
                mRULE_POSZ(); 

                }
                break;
            case 22 :
                // InternalTourDsl.g:1:279: RULE_ROTX
                {
                mRULE_ROTX(); 

                }
                break;
            case 23 :
                // InternalTourDsl.g:1:289: RULE_ROTY
                {
                mRULE_ROTY(); 

                }
                break;
            case 24 :
                // InternalTourDsl.g:1:299: RULE_ROTZ
                {
                mRULE_ROTZ(); 

                }
                break;
            case 25 :
                // InternalTourDsl.g:1:309: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // InternalTourDsl.g:1:317: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // InternalTourDsl.g:1:326: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // InternalTourDsl.g:1:338: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // InternalTourDsl.g:1:354: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // InternalTourDsl.g:1:370: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // InternalTourDsl.g:1:378: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\33\1\34\10\uffff\7\32\1\31\2\uffff\3\31\15\uffff\6\32\1\70\1\32\5\uffff\6\32\1\uffff\1\32\1\107\3\32\1\113\1\114\1\115\3\32\1\121\1\122\1\123\1\uffff\3\32\3\uffff\3\32\3\uffff\16\32\1\150\1\32\1\152\1\153\1\154\1\155\1\uffff\1\32\4\uffff\1\32\1\160\1\uffff";
    static final String DFA12_eofS =
        "\161\uffff";
    static final String DFA12_minS =
        "\1\0\2\60\10\uffff\1\141\1\155\1\141\1\145\3\157\1\101\2\uffff\2\0\1\52\15\uffff\1\155\1\141\1\156\2\163\1\164\1\60\1\164\5\uffff\1\145\1\147\1\157\1\151\1\143\1\163\1\uffff\1\141\1\60\1\145\1\162\1\164\3\60\1\162\1\160\1\164\3\60\1\uffff\1\120\1\141\1\151\3\uffff\1\151\1\157\1\151\3\uffff\1\141\1\155\1\157\1\160\1\164\1\157\1\164\1\141\1\156\1\164\1\163\1\156\1\150\1\163\1\60\1\151\4\60\1\uffff\1\157\4\uffff\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\172\10\uffff\1\141\1\155\1\157\1\145\3\157\1\172\2\uffff\2\uffff\1\57\15\uffff\1\155\1\141\1\156\2\163\1\164\1\172\1\164\5\uffff\1\145\1\147\1\157\1\172\1\143\1\163\1\uffff\2\172\1\145\1\162\1\164\3\172\1\162\1\160\1\164\3\172\1\uffff\1\120\1\141\1\151\3\uffff\1\151\1\157\1\151\3\uffff\1\141\1\155\1\157\1\160\1\164\1\157\1\164\1\141\1\156\1\164\1\163\1\156\1\150\1\163\1\172\1\151\4\172\1\uffff\1\157\4\uffff\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\10\uffff\1\31\1\32\3\uffff\1\36\1\37\1\31\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\10\uffff\1\32\1\33\1\34\1\35\1\36\6\uffff\1\20\16\uffff\1\13\3\uffff\1\23\1\24\1\25\3\uffff\1\26\1\27\1\30\24\uffff\1\21\1\uffff\1\17\1\22\1\14\1\15\2\uffff\1\16";
    static final String DFA12_specialS =
        "\1\2\24\uffff\1\1\1\0\132\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\30\1\31\1\25\4\31\1\26\4\31\1\11\1\3\1\4\1\27\12\24\1\12\6\31\4\23\1\1\25\23\1\7\1\31\1\10\1\22\1\23\1\31\3\23\1\16\1\2\2\23\1\17\1\14\4\23\1\13\1\23\1\15\1\23\1\21\1\23\1\20\6\23\1\5\1\31\1\6\uff82\31",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47\15\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
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
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\71",
            "",
            "",
            "",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75\16\uffff\1\76\1\77\1\100",
            "\1\101",
            "\1\102",
            "",
            "\1\103\26\uffff\1\104\1\105\1\106",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\116",
            "\1\117",
            "\1\120",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\151",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\156",
            "",
            "",
            "",
            "",
            "\1\157",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
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
            return "1:1: Tokens : ( T__31 | T__32 | T__33 | T__34 | RULE_LBRACKET | RULE_RBRACKET | RULE_LPARENTISISCUADRADO | RULE_RPARENTISISCUADRADO | RULE_COMA | RULE_TWOPOINTS | RULE_NAME | RULE_T_IMAGEN | RULE_T_PANORAMA | RULE_DESCRIPTION | RULE_T_HOTSPOT | RULE_TO | RULE_T_POSITION | RULE_T_ROTATION | RULE_POSX | RULE_POSY | RULE_POSZ | RULE_ROTX | RULE_ROTY | RULE_ROTZ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 46;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_21 = input.LA(1);

                        s = -1;
                        if ( ((LA12_21>='\u0000' && LA12_21<='\uFFFF')) ) {s = 46;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='E') ) {s = 1;}

                        else if ( (LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='-') ) {s = 3;}

                        else if ( (LA12_0=='.') ) {s = 4;}

                        else if ( (LA12_0=='{') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='[') ) {s = 7;}

                        else if ( (LA12_0==']') ) {s = 8;}

                        else if ( (LA12_0==',') ) {s = 9;}

                        else if ( (LA12_0==':') ) {s = 10;}

                        else if ( (LA12_0=='n') ) {s = 11;}

                        else if ( (LA12_0=='i') ) {s = 12;}

                        else if ( (LA12_0=='p') ) {s = 13;}

                        else if ( (LA12_0=='d') ) {s = 14;}

                        else if ( (LA12_0=='h') ) {s = 15;}

                        else if ( (LA12_0=='t') ) {s = 16;}

                        else if ( (LA12_0=='r') ) {s = 17;}

                        else if ( (LA12_0=='^') ) {s = 18;}

                        else if ( ((LA12_0>='A' && LA12_0<='D')||(LA12_0>='F' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='c')||(LA12_0>='f' && LA12_0<='g')||(LA12_0>='j' && LA12_0<='m')||LA12_0=='o'||LA12_0=='q'||LA12_0=='s'||(LA12_0>='u' && LA12_0<='z')) ) {s = 19;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 20;}

                        else if ( (LA12_0=='\"') ) {s = 21;}

                        else if ( (LA12_0=='\'') ) {s = 22;}

                        else if ( (LA12_0=='/') ) {s = 23;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 24;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=';' && LA12_0<='@')||LA12_0=='\\'||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 25;}

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
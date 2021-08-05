//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------
package Generados;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;
import Estructura.Arbol;
import Estructura.NodoArbol;
import java_cup.runtime.XMLElement;

/**
 * CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
 */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

    public final Class getSymbolContainer() {
        return sym.class;
    }

    /**
     * Default constructor.
     */
    @Deprecated
    public parser() {
        super();
    }

    /**
     * Constructor which sets the default scanner.
     */
    @Deprecated
    public parser(java_cup.runtime.Scanner s) {
        super(s);
    }

    /**
     * Constructor which sets the default scanner.
     */
    public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {
        super(s, sf);
    }

    /**
     * Production table.
     */
    protected static final short _production_table[][]
            = unpackFromStrings(new String[]{
        "\000\012\000\002\002\004\000\002\002\003\000\002\003"
        + "\004\000\002\004\004\000\002\004\005\000\002\005\003"
        + "\000\002\006\002\000\002\006\004\000\002\007\002\000"
        + "\002\007\004"});

    /**
     * Access to production table.
     */
    public short[][] production_table() {
        return _production_table;
    }

    /**
     * Parse-action table.
     */
    protected static final short[][] _action_table
            = unpackFromStrings(new String[]{
        "\000\020\000\006\006\007\010\004\001\002\000\012\002"
        + "\ufffc\004\ufffc\005\ufffc\007\ufffc\001\002\000\012\002\ufffb"
        + "\004\ufffb\005\021\007\ufffb\001\002\000\004\002\000\001"
        + "\002\000\006\006\007\010\004\001\002\000\004\002\015"
        + "\001\002\000\010\002\ufff9\004\012\007\ufff9\001\002\000"
        + "\006\006\007\010\004\001\002\000\006\002\uffff\007\uffff"
        + "\001\002\000\006\002\ufff8\007\ufff8\001\002\000\004\002"
        + "\001\001\002\000\004\007\017\001\002\000\010\002\ufffd"
        + "\004\ufffd\007\ufffd\001\002\000\010\002\ufffe\004\ufffe\007"
        + "\ufffe\001\002\000\006\006\007\010\004\001\002\000\010"
        + "\002\ufffa\004\ufffa\007\ufffa\001\002"});

    /**
     * Access to parse-action table.
     */
    public short[][] action_table() {
        return _action_table;
    }

    /** <code>reduce_goto</code> table.
     */
    protected static final short[][] _reduce_table
            = unpackFromStrings(new String[]{
        "\000\020\000\012\002\007\003\005\004\010\005\004\001"
        + "\001\000\002\001\001\000\004\006\017\001\001\000\002"
        + "\001\001\000\010\003\015\004\010\005\004\001\001\000"
        + "\002\001\001\000\004\007\012\001\001\000\010\003\013"
        + "\004\010\005\004\001\001\000\002\001\001\000\002\001"
        + "\001\000\002\001\001\000\002\001\001\000\002\001\001"
        + "\000\002\001\001\000\006\004\021\005\004\001\001\000"
        + "\002\001\001"});

    /**
     * Access to <code>reduce_goto</code> table.
     */
    public short[][] reduce_table() {
        return _reduce_table;
    }

    /**
     * Instance of action encapsulation class.
     */
    protected CUP$parser$actions action_obj;

    /**
     * Action encapsulation object initializer.
     */
    protected void init_actions() {
        action_obj = new CUP$parser$actions(this);
    }

    /**
     * Invoke a user supplied parse action.
     */
    public java_cup.runtime.Symbol do_action(
            int act_num,
            java_cup.runtime.lr_parser parser,
            java.util.Stack stack,
            int top)
            throws java.lang.Exception {
        /* call code in generated class */
        return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
    }

    /**
     * Indicates start state.
     */
    public int start_state() {
        return 0;
    }

    /**
     * Indicates start production.
     */
    public int start_production() {
        return 0;
    }

    /** <code>EOF</code> Symbol index.
     */
    public int EOF_sym() {
        return 0;
    }

    /** <code>error</code> Symbol index.
     */
    public int error_sym() {
        return 1;
    }

    public int multiplicando = 1;
    public int sumando = 0;
    public int no_nodos = 0;
    public int resultado = 0;
    public Arbol actual = new Arbol();
    public Arbol aux = new Arbol();
    public NodoArbol no1 = new NodoArbol();
    public NodoArbol no2 = new NodoArbol();

    public void syntax_error(Symbol cur_token) {
        System.out.println(" Se esperaban: ");
        String esperados = "";
        for (int i = 0; i < expected_token_ids().size(); i++) {
            esperados += symbl_name_from_id(expected_token_ids().get(i)) + "-";
        }
        System.out.print(esperados);
    }

    public void report_fatal_error(String message, Object info) {
        System.out.println("reportfatal " + message + info);
    }

    public void report_fatal_error(Symbol cur) {
        System.out.println("unrecovered_syntax_error");
    }

    public void imp(String texto) {
        System.out.println(texto);
    }

    protected int error_sync_size() {
        return 1;
    }

    /**
     * Cup generated class to encapsulate user supplied action code.
     */
    @SuppressWarnings({"rawtypes", "unchecked", "unused"})
    class CUP$parser$actions {

        private final parser parser;

        /**
         * Constructor
         */
        CUP$parser$actions(parser parser) {
            this.parser = parser;
        }

        /**
         * Method 0 with the actual generated action code for actions 0 to 300.
         */
        public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
                int CUP$parser$act_num,
                java_cup.runtime.lr_parser CUP$parser$parser,
                java.util.Stack CUP$parser$stack,
                int CUP$parser$top)
                throws java.lang.Exception {
            /* Symbol object for return from actions */
            java_cup.runtime.Symbol CUP$parser$result;

            /* select the action based on the action number */
            switch (CUP$parser$act_num) {
                /*. . . . . . . . . . . . . . . . . . . .*/
                case 0: // $START ::= inicio EOF 
                {
                    Object RESULT = null;
                    int start_valleft = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int start_valright = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Object start_val = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;
                    RESULT = start_val;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("$START", 0, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                /* ACCEPT */
                CUP$parser$parser.done_parsing();
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 1: // inicio ::= operaciones 
                {
                    Object RESULT = null;
                    int e1left = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).left;
                    int e1right = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).right;
                    Integer e1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
                    resultado = e1;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio", 0, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 2: // operaciones ::= termino resto 
                {
                    Integer RESULT = null;
                    int e1left = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int e1right = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Integer e1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;
                    imp("Hasta arriba" + e1);
                    RESULT = e1 + sumando;
                    sumando = 0;
                    actual.suma_nodos(actual, aux);
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("operaciones", 1, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 3: // termino ::= numero factor 
                {
                    Integer RESULT = null;
                    int e1left = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int e1right = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Integer e1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;
                    int e2left = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).left;
                    int e2right = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).right;
                    Integer e2 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
                    if (e2 >= 0) {
                        imp("Multiplica " + e1.toString());
                        RESULT = e1 * multiplicando;
                        multiplicando = 1;
                    } else {
                        System.out.println("no trae");
                        multiplicando = 1;
                        RESULT = e1;
                    }
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("termino", 2, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 4: // termino ::= PA operaciones PC 
                {
                    Integer RESULT = null;
                    int e1left = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).left;
                    int e1right = ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).right;
                    Integer e1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)).value;
                    imp("Agrupa ");
                    RESULT = Integer.parseInt(e1.toString());
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("termino", 2, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 2)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 5: // numero ::= NUMERO 
                {
                    Integer RESULT = null;
                    int e1left = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).left;
                    int e1right = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).right;
                    Object e1 = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
                    imp(" numero " + e1.toString());
                    RESULT = Integer.parseInt(e1.toString());
                    if (no1.lexema.isEmpty()) {

                        no1.lexema = e1.toString();
                        no1.id = no_nodos++;
                        no1.id_nodo = "node" + no1.id;
                    } else {
                        no2.lexema = e1.toString();
                        no2.id = no_nodos++;
                        no2.id_nodo = "node" + no2.id;
                    }
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("numero", 3, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 6: // factor ::= 
                {
                    Integer RESULT = null;
                    RESULT = -1;
                    System.out.println("Entra primero acá en el null");
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("factor", 4, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 7: // factor ::= POR termino 
                {
                    Integer RESULT = null;
                    int e1left = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).left;
                    int e1right = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).right;
                    Integer e1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
                    imp("Multiplicacion " + e1.toString());
                    RESULT = Integer.parseInt(e1.toString());
                    multiplicando *= RESULT;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("factor", 4, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 8: // resto ::= 
                {
                    Integer RESULT = null;
                    RESULT = 0;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("resto", 5, ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /*. . . . . . . . . . . . . . . . . . . .*/
                case 9: // resto ::= MAS operaciones 
                {
                    Integer RESULT = null;
                    int e1left = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).left;
                    int e1right = ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).right;
                    Integer e1 = (Integer) ((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
                    imp("Continuacion " + e1.toString());
                    RESULT = Integer.parseInt(e1.toString());
                    sumando += RESULT;
                    CUP$parser$result = parser.getSymbolFactory().newSymbol("resto", 5, ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top - 1)), ((java_cup.runtime.Symbol) CUP$parser$stack.peek()), RESULT);
                }
                return CUP$parser$result;

                /* . . . . . .*/
                default:
                    throw new Exception(
                            "Invalid action number " + CUP$parser$act_num + "found in internal parse table");

            }
        }

        /* end of method */
        /**
         * Method splitting the generated action code into several parts.
         */
        public final java_cup.runtime.Symbol CUP$parser$do_action(
                int CUP$parser$act_num,
                java_cup.runtime.lr_parser CUP$parser$parser,
                java.util.Stack CUP$parser$stack,
                int CUP$parser$top)
                throws java.lang.Exception {
            return CUP$parser$do_action_part00000000(
                    CUP$parser$act_num,
                    CUP$parser$parser,
                    CUP$parser$stack,
                    CUP$parser$top);
        }
    }

}
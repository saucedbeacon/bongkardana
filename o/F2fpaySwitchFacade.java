package o;

import java.io.Serializable;
import o.SimplePassword;

public class F2fpaySwitchFacade implements record, Serializable {
    public static final F2fpaySwitchFacade HAS_INSTANCE = new F2fpaySwitchFacade("Symbol.hasInstance");
    public static final F2fpaySwitchFacade IS_CONCAT_SPREADABLE = new F2fpaySwitchFacade("Symbol.isConcatSpreadable");
    public static final F2fpaySwitchFacade IS_REGEXP = new F2fpaySwitchFacade("Symbol.isRegExp");
    public static final F2fpaySwitchFacade ITERATOR = new F2fpaySwitchFacade("Symbol.iterator");
    public static final F2fpaySwitchFacade MATCH = new F2fpaySwitchFacade("Symbol.match");
    public static final F2fpaySwitchFacade REPLACE = new F2fpaySwitchFacade("Symbol.replace");
    public static final F2fpaySwitchFacade SEARCH = new F2fpaySwitchFacade("Symbol.search");
    public static final F2fpaySwitchFacade SPECIES = new F2fpaySwitchFacade("Symbol.species");
    public static final F2fpaySwitchFacade SPLIT = new F2fpaySwitchFacade("Symbol.split");
    public static final F2fpaySwitchFacade TO_PRIMITIVE = new F2fpaySwitchFacade("Symbol.toPrimitive");
    public static final F2fpaySwitchFacade TO_STRING_TAG = new F2fpaySwitchFacade("Symbol.toStringTag");
    public static final F2fpaySwitchFacade UNSCOPABLES = new F2fpaySwitchFacade("Symbol.unscopables");
    static final long serialVersionUID = -6019782713330994754L;
    private String name;

    public F2fpaySwitchFacade(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public boolean equals(Object obj) {
        return obj instanceof F2fpaySwitchFacade ? obj == this : (obj instanceof SimplePassword.AnonymousClass1) && ((SimplePassword.AnonymousClass1) obj).getKey() == this;
    }

    public String toString() {
        if (this.name == null) {
            return "Symbol()";
        }
        StringBuilder sb = new StringBuilder("Symbol(");
        sb.append(this.name);
        sb.append(')');
        return sb.toString();
    }
}

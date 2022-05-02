package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;

public class EditTextUtil extends onInit {
    static final long serialVersionUID = -5332312783643935019L;
    private int arity;
    private String functionName;
    private final printExceptionStackTrace idcall;
    private final int methodId;
    private final Object tag;
    private boolean useCallAsConstructor;

    public EditTextUtil(printExceptionStackTrace printexceptionstacktrace, Object obj, int i, int i2) {
        if (i2 >= 0) {
            this.idcall = printexceptionstacktrace;
            this.tag = obj;
            this.methodId = i;
            this.arity = i2;
            if (i2 < 0) {
                throw new IllegalArgumentException();
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public EditTextUtil(printExceptionStackTrace printexceptionstacktrace, Object obj, int i, String str, int i2, LogUtils logUtils) {
        super(logUtils, (LogUtils) null);
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (str != null) {
            this.idcall = printexceptionstacktrace;
            this.tag = obj;
            this.methodId = i;
            this.arity = i2;
            this.functionName = str;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void initFunction(String str, LogUtils logUtils) {
        if (str == null) {
            throw new IllegalArgumentException();
        } else if (logUtils != null) {
            this.functionName = str;
            setParentScope(logUtils);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final boolean hasTag(Object obj) {
        if (obj == null) {
            return this.tag == null;
        }
        return obj.equals(this.tag);
    }

    public Object getTag() {
        return this.tag;
    }

    public final int methodId() {
        return this.methodId;
    }

    public final void markAsConstructor(LogUtils logUtils) {
        this.useCallAsConstructor = true;
        setImmunePrototypeProperty(logUtils);
    }

    public final void addAsProperty(LogUtils logUtils) {
        ScriptableObject.defineProperty(logUtils, this.functionName, this, 2);
    }

    public void exportAsScopeProperty() {
        addAsProperty(getParentScope());
    }

    public LogUtils getPrototype() {
        LogUtils prototype = super.getPrototype();
        if (prototype != null) {
            return prototype;
        }
        LogUtils functionPrototype = getFunctionPrototype(getParentScope());
        setPrototype(functionPrototype);
        return functionPrototype;
    }

    public Object call(SecureQwertyKeyboard.AnonymousClass1 r7, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        return this.idcall.execIdCall(this, r7, logUtils, logUtils2, objArr);
    }

    public LogUtils createObject(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils) {
        if (this.useCallAsConstructor) {
            return null;
        }
        throw LogItem.length("msg.not.ctor", (Object) this.functionName);
    }

    /* access modifiers changed from: package-private */
    public String decompile(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        if ((i2 & 1) == 0) {
            z = false;
        }
        if (!z) {
            sb.append("function ");
            sb.append(getFunctionName());
            sb.append("() { ");
        }
        sb.append("[native code for ");
        printExceptionStackTrace printexceptionstacktrace = this.idcall;
        if (printexceptionstacktrace instanceof LogUtils) {
            sb.append(((LogUtils) printexceptionstacktrace).getClassName());
            sb.append('.');
        }
        sb.append(getFunctionName());
        sb.append(", arity=");
        sb.append(getArity());
        sb.append(z ? "]\n" : "] }\n");
        return sb.toString();
    }

    public int getArity() {
        return this.arity;
    }

    public int getLength() {
        return getArity();
    }

    public String getFunctionName() {
        String str = this.functionName;
        return str == null ? "" : str;
    }

    public final RuntimeException unknown() {
        StringBuilder sb = new StringBuilder("BAD FUNCTION ID=");
        sb.append(this.methodId);
        sb.append(" MASTER=");
        sb.append(this.idcall);
        return new IllegalArgumentException(sb.toString());
    }
}

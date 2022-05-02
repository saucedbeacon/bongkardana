package org.mozilla.javascript;

import java.util.EnumMap;
import o.LogItem;
import o.LogUtils;
import o.SecureQwertyKeyboard;
import o.doCheck;
import o.onInit;
import o.setUiContext;

public class TopLevel extends setUiContext {
    static final /* synthetic */ boolean $assertionsDisabled = (!TopLevel.class.desiredAssertionStatus());
    static final long serialVersionUID = -4648046356662472260L;
    private EnumMap<Builtins, onInit> ctors;
    private EnumMap<NativeErrors, onInit> errors;

    public enum Builtins {
        Object,
        Array,
        Function,
        String,
        Number,
        Boolean,
        RegExp,
        Error,
        Symbol
    }

    public enum NativeErrors {
        Error,
        EvalError,
        RangeError,
        ReferenceError,
        SyntaxError,
        TypeError,
        URIError,
        InternalError,
        JavaException
    }

    public String getClassName() {
        return "global";
    }

    public void cacheBuiltins() {
        this.ctors = new EnumMap<>(Builtins.class);
        for (Builtins builtins : Builtins.values()) {
            Object property = ScriptableObject.getProperty((LogUtils) this, builtins.name());
            if (property instanceof onInit) {
                this.ctors.put(builtins, (onInit) property);
            }
        }
        this.errors = new EnumMap<>(NativeErrors.class);
        for (NativeErrors nativeErrors : NativeErrors.values()) {
            Object property2 = ScriptableObject.getProperty((LogUtils) this, nativeErrors.name());
            if (property2 instanceof onInit) {
                this.errors.put(nativeErrors, (onInit) property2);
            }
        }
    }

    public static doCheck getBuiltinCtor(SecureQwertyKeyboard.AnonymousClass1 r0, LogUtils logUtils, Builtins builtins) {
        onInit builtinCtor;
        if (!$assertionsDisabled && logUtils.getParentScope() != null) {
            throw new AssertionError();
        } else if (!(logUtils instanceof TopLevel) || (builtinCtor = ((TopLevel) logUtils).getBuiltinCtor(builtins)) == null) {
            return LogItem.getMax(logUtils, builtins.name());
        } else {
            return builtinCtor;
        }
    }

    public static doCheck getNativeErrorCtor(SecureQwertyKeyboard.AnonymousClass1 r0, LogUtils logUtils, NativeErrors nativeErrors) {
        onInit nativeErrorCtor;
        if (!$assertionsDisabled && logUtils.getParentScope() != null) {
            throw new AssertionError();
        } else if (!(logUtils instanceof TopLevel) || (nativeErrorCtor = ((TopLevel) logUtils).getNativeErrorCtor(nativeErrors)) == null) {
            return LogItem.getMax(logUtils, nativeErrors.name());
        } else {
            return nativeErrorCtor;
        }
    }

    public static LogUtils getBuiltinPrototype(LogUtils logUtils, Builtins builtins) {
        LogUtils builtinPrototype;
        if (!$assertionsDisabled && logUtils.getParentScope() != null) {
            throw new AssertionError();
        } else if (!(logUtils instanceof TopLevel) || (builtinPrototype = ((TopLevel) logUtils).getBuiltinPrototype(builtins)) == null) {
            return ScriptableObject.getClassPrototype(logUtils, builtins.name());
        } else {
            return builtinPrototype;
        }
    }

    public onInit getBuiltinCtor(Builtins builtins) {
        EnumMap<Builtins, onInit> enumMap = this.ctors;
        if (enumMap != null) {
            return enumMap.get(builtins);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public onInit getNativeErrorCtor(NativeErrors nativeErrors) {
        EnumMap<NativeErrors, onInit> enumMap = this.errors;
        if (enumMap != null) {
            return enumMap.get(nativeErrors);
        }
        return null;
    }

    public LogUtils getBuiltinPrototype(Builtins builtins) {
        onInit builtinCtor = getBuiltinCtor(builtins);
        Object prototypeProperty = builtinCtor != null ? builtinCtor.getPrototypeProperty() : null;
        if (prototypeProperty instanceof LogUtils) {
            return (LogUtils) prototypeProperty;
        }
        return null;
    }
}

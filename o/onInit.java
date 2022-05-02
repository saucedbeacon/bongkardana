package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.ScriptableObject;

public class onInit extends setUiContext implements doCheck {
    private static final Object FUNCTION_TAG = "Function";
    private static final int Id_apply = 4;
    private static final int Id_arguments = 5;
    private static final int Id_arity = 2;
    private static final int Id_bind = 6;
    private static final int Id_call = 5;
    private static final int Id_constructor = 1;
    private static final int Id_length = 1;
    private static final int Id_name = 3;
    private static final int Id_prototype = 4;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int MAX_INSTANCE_ID = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    static final long serialVersionUID = 5311394446546053859L;
    private int argumentsAttributes = 6;
    private Object argumentsObj = getMax;
    private Object prototypeProperty;
    private int prototypePropertyAttributes = 6;

    public int getArity() {
        return 0;
    }

    public String getClassName() {
        return "Function";
    }

    public String getFunctionName() {
        return "";
    }

    public int getLength() {
        return 0;
    }

    public int getMaxInstanceId() {
        return 5;
    }

    static void init(LogUtils logUtils, boolean z) {
        onInit oninit = new onInit();
        oninit.prototypePropertyAttributes = 7;
        oninit.exportAsJSClass(6, logUtils, z);
    }

    public onInit() {
    }

    public onInit(LogUtils logUtils, LogUtils logUtils2) {
        super(logUtils, logUtils2);
    }

    public String getTypeOf() {
        return avoidObjectDetection() ? "undefined" : "function";
    }

    public boolean hasInstance(LogUtils logUtils) {
        Object property = ScriptableObject.getProperty((LogUtils) this, "prototype");
        if (property instanceof LogUtils) {
            return LogItem.getMax(logUtils, (LogUtils) property);
        }
        throw LogItem.length("msg.instanceof.bad.prototype", (Object) getFunctionName());
    }

    public int findInstanceIdInfo(String str) {
        int i;
        String str2;
        int i2;
        int length = str.length();
        if (length == 4) {
            str2 = "name";
            i = 3;
        } else if (length == 5) {
            str2 = "arity";
            i = 2;
        } else if (length != 6) {
            if (length == 9) {
                char charAt = str.charAt(0);
                if (charAt == 'a') {
                    str2 = "arguments";
                    i = 5;
                } else if (charAt == 'p') {
                    str2 = "prototype";
                    i = 4;
                }
            }
            str2 = null;
            i = 0;
        } else {
            str2 = "length";
            i = 1;
        }
        if (!(str2 == null || str2 == str || str2.equals(str))) {
            i = 0;
        }
        if (i == 0) {
            return super.findInstanceIdInfo(str);
        }
        if (i == 1 || i == 2 || i == 3) {
            i2 = 7;
        } else if (i != 4) {
            if (i == 5) {
                i2 = this.argumentsAttributes;
            } else {
                throw new IllegalStateException();
            }
        } else if (!hasPrototypeProperty()) {
            return 0;
        } else {
            i2 = this.prototypePropertyAttributes;
        }
        return instanceIdInfo(i2, i);
    }

    public String getInstanceIdName(int i) {
        if (i == 1) {
            return "length";
        }
        if (i == 2) {
            return "arity";
        }
        if (i == 3) {
            return "name";
        }
        if (i != 4) {
            return i != 5 ? super.getInstanceIdName(i) : "arguments";
        }
        return "prototype";
    }

    public Object getInstanceIdValue(int i) {
        if (i == 1) {
            return LogItem.getMin(getLength());
        }
        if (i == 2) {
            return LogItem.getMin(getArity());
        }
        if (i == 3) {
            return getFunctionName();
        }
        if (i == 4) {
            return getPrototypeProperty();
        }
        if (i != 5) {
            return super.getInstanceIdValue(i);
        }
        return getArguments();
    }

    public void setInstanceIdValue(int i, Object obj) {
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                if (i != 5) {
                    super.setInstanceIdValue(i, obj);
                    return;
                }
                if (obj == getMax) {
                    getStyleId.setMin();
                }
                if (defaultHas("arguments")) {
                    defaultPut("arguments", obj);
                } else if ((this.argumentsAttributes & 1) == 0) {
                    this.argumentsObj = obj;
                }
            } else if ((this.prototypePropertyAttributes & 1) == 0) {
                if (obj == null) {
                    obj = ack.NULL_VALUE;
                }
                this.prototypeProperty = obj;
            }
        }
    }

    public void setInstanceIdAttributes(int i, int i2) {
        if (i == 4) {
            this.prototypePropertyAttributes = i2;
        } else if (i != 5) {
            super.setInstanceIdAttributes(i, i2);
        } else {
            this.argumentsAttributes = i2;
        }
    }

    /* access modifiers changed from: protected */
    public void fillConstructorProperties(EditTextUtil editTextUtil) {
        editTextUtil.setPrototype(this);
        super.fillConstructorProperties(editTextUtil);
    }

    /* access modifiers changed from: protected */
    public void initPrototypeId(int i) {
        String str;
        int i2 = 1;
        switch (i) {
            case 1:
                str = "constructor";
                break;
            case 2:
                i2 = 0;
                str = "toString";
                break;
            case 3:
                str = "toSource";
                break;
            case 4:
                i2 = 2;
                str = "apply";
                break;
            case 5:
                str = "call";
                break;
            case 6:
                str = "bind";
                break;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
        initPrototypeMethod(FUNCTION_TAG, i, str, i2);
    }

    static boolean isApply(EditTextUtil editTextUtil) {
        return editTextUtil.hasTag(FUNCTION_TAG) && editTextUtil.methodId() == 4;
    }

    static boolean isApplyOrCall(EditTextUtil editTextUtil) {
        if (!editTextUtil.hasTag(FUNCTION_TAG)) {
            return false;
        }
        int methodId = editTextUtil.methodId();
        return methodId == 4 || methodId == 5;
    }

    public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r11, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        int floatRange;
        Object[] objArr2;
        LogUtils logUtils3;
        if (!editTextUtil.hasTag(FUNCTION_TAG)) {
            return super.execIdCall(editTextUtil, r11, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        boolean z = true;
        int i = 0;
        switch (methodId) {
            case 1:
                return jsConstructor(r11, logUtils, objArr);
            case 2:
                return realFunction(logUtils2, editTextUtil).decompile(LogItem.setMax(objArr, 0), 0);
            case 3:
                onInit realFunction = realFunction(logUtils2, editTextUtil);
                int i2 = 2;
                if (objArr.length != 0 && (floatRange = LogItem.toFloatRange(objArr[0])) >= 0) {
                    i = floatRange;
                    i2 = 0;
                }
                return realFunction.decompile(i, i2);
            case 4:
            case 5:
                if (methodId != 4) {
                    z = false;
                }
                return LogItem.length(z, r11, logUtils, logUtils2, objArr);
            case 6:
                if (logUtils2 instanceof announceSwitchKeyboard) {
                    announceSwitchKeyboard announceswitchkeyboard = (announceSwitchKeyboard) logUtils2;
                    int length = objArr.length;
                    if (length > 0) {
                        LogUtils length2 = LogItem.length(r11, objArr[0], logUtils);
                        int i3 = length - 1;
                        Object[] objArr3 = new Object[i3];
                        System.arraycopy(objArr, 1, objArr3, 0, i3);
                        logUtils3 = length2;
                        objArr2 = objArr3;
                    } else {
                        logUtils3 = null;
                        objArr2 = LogItem.create;
                    }
                    return new onInit(r11, logUtils, announceswitchkeyboard, logUtils3, objArr2) {
                        static final long serialVersionUID;
                        private final Object[] boundArgs;
                        private final LogUtils boundThis;
                        private final int length;
                        private final announceSwitchKeyboard targetFunction;

                        public final java.lang.Object call(
/*
Method generation error in method: o.SecureNumKeyboard.1.call(o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, java.lang.Object[]):java.lang.Object, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureNumKeyboard.1.call(o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        public final o.LogUtils construct(
/*
Method generation error in method: o.SecureNumKeyboard.1.construct(o.SecureQwertyKeyboard$1, o.LogUtils, java.lang.Object[]):o.LogUtils, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureNumKeyboard.1.construct(o.SecureQwertyKeyboard$1, o.LogUtils, java.lang.Object[]):o.LogUtils, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        public final boolean hasInstance(
/*
Method generation error in method: o.SecureNumKeyboard.1.hasInstance(o.LogUtils):boolean, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureNumKeyboard.1.hasInstance(o.LogUtils):boolean, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        public final int getLength(
/*
Method generation error in method: o.SecureNumKeyboard.1.getLength():int, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureNumKeyboard.1.getLength():int, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        private java.lang.Object[] concat(
/*
Method generation error in method: o.SecureNumKeyboard.1.concat(java.lang.Object[], java.lang.Object[]):java.lang.Object[], dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SecureNumKeyboard.1.concat(java.lang.Object[], java.lang.Object[]):java.lang.Object[], class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    };
                }
                throw LogItem.toString(logUtils2);
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    private onInit realFunction(LogUtils logUtils, EditTextUtil editTextUtil) {
        Object defaultValue = logUtils.getDefaultValue(LogItem.invoke);
        if (defaultValue instanceof TaoHelper) {
            defaultValue = ((TaoHelper) defaultValue).setMin();
        }
        if (defaultValue instanceof onInit) {
            return (onInit) defaultValue;
        }
        throw LogItem.length("msg.incompat.call", (Object) editTextUtil.getFunctionName());
    }

    public void setImmunePrototypeProperty(Object obj) {
        if ((this.prototypePropertyAttributes & 1) == 0) {
            if (obj == null) {
                obj = ack.NULL_VALUE;
            }
            this.prototypeProperty = obj;
            this.prototypePropertyAttributes = 7;
            return;
        }
        throw new IllegalStateException();
    }

    public LogUtils getClassPrototype() {
        Object prototypeProperty2 = getPrototypeProperty();
        if (prototypeProperty2 instanceof LogUtils) {
            return (LogUtils) prototypeProperty2;
        }
        return ScriptableObject.getObjectPrototype(this);
    }

    public Object call(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        return checkOpen.instance;
    }

    public LogUtils construct(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, Object[] objArr) {
        LogUtils parentScope;
        LogUtils classPrototype;
        LogUtils createObject = createObject(r2, logUtils);
        if (createObject != null) {
            Object call = call(r2, logUtils, createObject, objArr);
            if (call instanceof LogUtils) {
                return (LogUtils) call;
            }
            return createObject;
        }
        Object call2 = call(r2, logUtils, (LogUtils) null, objArr);
        if (call2 instanceof LogUtils) {
            LogUtils logUtils2 = (LogUtils) call2;
            if (logUtils2.getPrototype() == null && logUtils2 != (classPrototype = getClassPrototype())) {
                logUtils2.setPrototype(classPrototype);
            }
            if (logUtils2.getParentScope() != null || logUtils2 == (parentScope = getParentScope())) {
                return logUtils2;
            }
            logUtils2.setParentScope(parentScope);
            return logUtils2;
        }
        StringBuilder sb = new StringBuilder("Bad implementaion of call as constructor, name=");
        sb.append(getFunctionName());
        sb.append(" in ");
        sb.append(getClass().getName());
        throw new IllegalStateException(sb.toString());
    }

    public LogUtils createObject(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils) {
        setmSubmitInterface setmsubmitinterface = new setmSubmitInterface();
        setmsubmitinterface.setPrototype(getClassPrototype());
        setmsubmitinterface.setParentScope(getParentScope());
        return setmsubmitinterface;
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
            sb.append("() {\n\t");
        }
        sb.append("[native code, arity=");
        sb.append(getArity());
        sb.append("]\n");
        if (!z) {
            sb.append("}\n");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public boolean hasPrototypeProperty() {
        return this.prototypeProperty != null || (this instanceof setNeedComfirm);
    }

    public Object getPrototypeProperty() {
        Object obj = this.prototypeProperty;
        if (obj == null) {
            if (this instanceof setNeedComfirm) {
                return setupDefaultPrototype();
            }
            return checkOpen.instance;
        } else if (obj == ack.NULL_VALUE) {
            return null;
        } else {
            return obj;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.Object setupDefaultPrototype() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.prototypeProperty     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r3.prototypeProperty     // Catch:{ all -> 0x0021 }
            monitor-exit(r3)
            return r0
        L_0x0009:
            o.setmSubmitInterface r0 = new o.setmSubmitInterface     // Catch:{ all -> 0x0021 }
            r0.<init>()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "constructor"
            r2 = 2
            r0.defineProperty((java.lang.String) r1, (java.lang.Object) r3, (int) r2)     // Catch:{ all -> 0x0021 }
            r3.prototypeProperty = r0     // Catch:{ all -> 0x0021 }
            o.LogUtils r1 = getObjectPrototype(r3)     // Catch:{ all -> 0x0021 }
            if (r1 == r0) goto L_0x001f
            r0.setPrototype(r1)     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r3)
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onInit.setupDefaultPrototype():java.lang.Object");
    }

    private Object getArguments() {
        Object defaultGet = defaultHas("arguments") ? defaultGet("arguments") : this.argumentsObj;
        if (defaultGet != getMax) {
            return defaultGet;
        }
        doAutoSubmit length = LogItem.length(SecureQwertyKeyboard.AnonymousClass1.toFloatRange(), (doCheck) this);
        if (length == null) {
            return null;
        }
        return length.get("arguments", (LogUtils) length);
    }

    private static Object jsConstructor(SecureQwertyKeyboard.AnonymousClass1 r9, LogUtils logUtils, Object[] objArr) {
        int i;
        getPublicKeyFromX509 getpublickeyfromx509;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder();
        sb.append("function ");
        if (r9.IsOverlapping != 120) {
            sb.append("anonymous");
        }
        sb.append('(');
        int i2 = 0;
        while (true) {
            i = length - 1;
            if (i2 >= i) {
                break;
            }
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(LogItem.getMin(objArr[i2]));
            i2++;
        }
        sb.append(") {");
        if (length != 0) {
            sb.append(LogItem.getMin(objArr[i]));
        }
        sb.append("\n}");
        String obj = sb.toString();
        int[] iArr = new int[1];
        String max = SecureQwertyKeyboard.AnonymousClass1.setMax(iArr);
        if (max == null) {
            iArr[0] = 1;
            max = "<eval'ed string>";
        }
        String max2 = LogItem.getMax(false, max, iArr[0]);
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
        if (r9.values == null) {
            getpublickeyfromx509 = SecureQwertyKeyboard.ShiftType.setMin;
        } else {
            getpublickeyfromx509 = r9.values;
        }
        getPublicKeyFromX509 length2 = SecureQwertyKeyboard.ShiftType.length(getpublickeyfromx509);
        LogTracer isInside = SecureQwertyKeyboard.AnonymousClass1.isInside();
        if (isInside != null) {
            return r9.length(topLevelScope, obj, isInside, length2, max2);
        }
        throw new JavaScriptException("Interpreter not present", max, iArr[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int findPrototypeId(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            r1 = 3
            r2 = 5
            r3 = 4
            r4 = 0
            if (r0 == r3) goto L_0x0030
            if (r0 == r2) goto L_0x002c
            r2 = 8
            if (r0 == r2) goto L_0x0019
            r1 = 11
            if (r0 == r1) goto L_0x0015
            goto L_0x0044
        L_0x0015:
            r1 = 1
            java.lang.String r0 = "constructor"
            goto L_0x0046
        L_0x0019:
            char r0 = r6.charAt(r1)
            r2 = 111(0x6f, float:1.56E-43)
            if (r0 != r2) goto L_0x0024
            java.lang.String r0 = "toSource"
            goto L_0x0046
        L_0x0024:
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L_0x0044
            r1 = 2
            java.lang.String r0 = "toString"
            goto L_0x0046
        L_0x002c:
            java.lang.String r0 = "apply"
            r1 = 4
            goto L_0x0046
        L_0x0030:
            char r0 = r6.charAt(r4)
            r1 = 98
            if (r0 != r1) goto L_0x003c
            r1 = 6
            java.lang.String r0 = "bind"
            goto L_0x0046
        L_0x003c:
            r1 = 99
            if (r0 != r1) goto L_0x0044
            java.lang.String r0 = "call"
            r1 = 5
            goto L_0x0046
        L_0x0044:
            r0 = 0
            r1 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0051
            if (r0 == r6) goto L_0x0051
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r4 = r1
        L_0x0052:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onInit.findPrototypeId(java.lang.String):int");
    }
}

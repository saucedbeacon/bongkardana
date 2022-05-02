package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.SafeInputWidget;
import o.SecureQwertyKeyboard;
import o.SecureTextView;
import org.mozilla.javascript.ScriptableObject;

class getDrawableId {
    private Map<String, Object> getMax;
    private Map<String, Object> getMin;
    Class<?> length;
    private Map<String, encryptToByteArray> setMax;
    setBizId setMin;
    private Map<String, encryptToByteArray> toIntRange;

    private getDrawableId(LogUtils logUtils, Class<?> cls, boolean z) {
        try {
            SecureQwertyKeyboard.AnonymousClass1 max = SecureQwertyKeyboard.AnonymousClass1.setMax(SecureTextView.SendAccessiBilityEventListener.getMin());
            SecureNumKeyboard length2 = max.length();
            if (length2 != null) {
                if (!length2.getMin()) {
                    throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.access.prohibited", (Object) cls.getName());
                }
            }
            this.getMax = new HashMap();
            this.getMin = new HashMap();
            this.length = cls;
            getMin(logUtils, z, max.getMax(13));
        } finally {
            SecureQwertyKeyboard.AnonymousClass1.setMax();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(String str, boolean z) {
        if ((z ? this.getMin : this.getMax).get(str) == null && getMax(str, z) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object setMax(LogUtils logUtils, String str, Object obj, boolean z) {
        Object obj2;
        Class<?> cls;
        Object obj3;
        SafeInputWidget.AnonymousClass2 r4;
        Object obj4 = (z ? this.getMin : this.getMax).get(str);
        if (!z && obj4 == null) {
            obj4 = this.getMin.get(str);
        }
        if (obj2 == null) {
            Map<String, Object> map = z ? this.getMin : this.getMax;
            getStyleableIds max = getMax(str, z);
            if (max != null) {
                LogUtils functionPrototype = ScriptableObject.getFunctionPrototype(logUtils);
                if (max.isCtor()) {
                    SafeInputWidget.AnonymousClass2 r42 = new onInit(max) {
                        static final long serialVersionUID;
                        getStyleableIds ctor;

                        public final java.lang.Object call(
/*
Method generation error in method: o.SafeInputWidget.2.call(o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, java.lang.Object[]):java.lang.Object, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SafeInputWidget.2.call(o.SecureQwertyKeyboard$1, o.LogUtils, o.LogUtils, java.lang.Object[]):java.lang.Object, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                        public final java.lang.String getFunctionName(
/*
Method generation error in method: o.SafeInputWidget.2.getFunctionName():java.lang.String, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SafeInputWidget.2.getFunctionName():java.lang.String, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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

                        public final java.lang.String toString(
/*
Method generation error in method: o.SafeInputWidget.2.toString():java.lang.String, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.SafeInputWidget.2.toString():java.lang.String, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                    r42.setPrototype(functionPrototype);
                    map.put(str, r42);
                    r4 = r42;
                } else {
                    Object obj5 = map.get(max.getName());
                    boolean z2 = obj5 instanceof setBizId;
                    r4 = obj5;
                    if (z2) {
                        int length2 = ((setBizId) obj5).methods.length;
                        r4 = obj5;
                        if (length2 > 1) {
                            setBizId setbizid = new setBizId(max, str);
                            setbizid.setPrototype(functionPrototype);
                            map.put(str, setbizid);
                            r4 = setbizid;
                        }
                    }
                }
                obj2 = r4;
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                return LogUtils.getMax;
            }
        }
        if (obj2 instanceof LogUtils) {
            return obj2;
        }
        SecureQwertyKeyboard.AnonymousClass1 floatRange = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
        try {
            if (obj2 instanceof getAnnounceString) {
                getAnnounceString getannouncestring = (getAnnounceString) obj2;
                if (getannouncestring.length == null) {
                    return LogUtils.getMax;
                }
                obj3 = getannouncestring.length.invoke(obj, SecureQwertyKeyboard.AnonymousClass1.length);
                cls = getannouncestring.length.method().getReturnType();
            } else {
                Field field = (Field) obj2;
                if (z) {
                    obj = null;
                }
                obj3 = field.get(obj);
                cls = field.getType();
            }
            LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
            if (floatRange.Grayscale$Algorithm == null) {
                floatRange.Grayscale$Algorithm = new MoneyView();
            }
            return floatRange.Grayscale$Algorithm.getMax(topLevelScope, obj3, cls);
        } catch (Exception e) {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(LogUtils logUtils, String str, Object obj, Object obj2, boolean z) {
        Map<String, Object> map = z ? this.getMin : this.getMax;
        Object obj3 = map.get(str);
        if (!z && obj3 == null) {
            obj3 = this.getMin.get(str);
        }
        if (obj3 != null) {
            if (obj3 instanceof encryptToByteArray) {
                obj3 = ((encryptToByteArray) map.get(str)).field;
            }
            if (obj3 instanceof getAnnounceString) {
                getAnnounceString getannouncestring = (getAnnounceString) obj3;
                if (getannouncestring.setMin == null) {
                    throw SecureQwertyKeyboard.AnonymousClass1.getMin("msg.java.member.not.found", (Object) this.length.getName(), (Object) str);
                } else if (getannouncestring.getMax == null || obj2 == null) {
                    try {
                        getannouncestring.setMin.invoke(obj, new Object[]{SecureQwertyKeyboard.AnonymousClass1.length(obj2, getannouncestring.setMin.argTypes[0])});
                    } catch (Exception e) {
                        throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e);
                    }
                } else {
                    getannouncestring.getMax.call(SecureQwertyKeyboard.AnonymousClass1.toFloatRange(), ScriptableObject.getTopLevelScope(logUtils), logUtils, new Object[]{obj2});
                }
            } else if (!(obj3 instanceof Field)) {
                throw SecureQwertyKeyboard.AnonymousClass1.getMax(obj3 == null ? "msg.java.internal.private" : "msg.java.method.assign", (Object) str);
            } else {
                Field field = (Field) obj3;
                try {
                    field.set(obj, SecureQwertyKeyboard.AnonymousClass1.length(obj2, field.getType()));
                } catch (IllegalAccessException e2) {
                    if ((field.getModifiers() & 16) == 0) {
                        throw SecureQwertyKeyboard.AnonymousClass1.getMax((Throwable) e2);
                    }
                } catch (IllegalArgumentException unused) {
                    throw SecureQwertyKeyboard.AnonymousClass1.setMax("msg.java.internal.field.type", obj2.getClass().getName(), field, obj.getClass().getName());
                }
            }
        } else {
            throw SecureQwertyKeyboard.AnonymousClass1.getMin("msg.java.member.not.found", (Object) this.length.getName(), (Object) str);
        }
    }

    /* access modifiers changed from: package-private */
    public final Object[] setMax(boolean z) {
        Map<String, Object> map = z ? this.getMin : this.getMax;
        return map.keySet().toArray(new Object[map.size()]);
    }

    static String getMin(Class<?> cls) {
        if (!cls.isArray()) {
            return cls.getName();
        }
        int i = 0;
        do {
            i++;
            cls = cls.getComponentType();
        } while (cls.isArray());
        String name = cls.getName();
        if (i == 1) {
            return name.concat("[]");
        }
        StringBuilder sb = new StringBuilder(name.length() + (i * 2));
        sb.append(name);
        while (i != 0) {
            i--;
            sb.append("[]");
        }
        return sb.toString();
    }

    static String getMin(Class<?>[] clsArr) {
        int length2 = clsArr.length;
        if (length2 == 0) {
            return "()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (int i = 0; i != length2; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(getMin(clsArr[i]));
        }
        sb.append(')');
        return sb.toString();
    }

    private getStyleableIds getMax(String str, boolean z) {
        getStyleableIds[] getstyleableidsArr;
        int indexOf = str.indexOf(40);
        if (indexOf < 0) {
            return null;
        }
        Map<String, Object> map = z ? this.getMin : this.getMax;
        if (z && indexOf == 0) {
            getstyleableidsArr = this.setMin.methods;
        } else {
            String substring = str.substring(0, indexOf);
            Object obj = map.get(substring);
            if (!z && obj == null) {
                obj = this.getMin.get(substring);
            }
            getstyleableidsArr = obj instanceof setBizId ? ((setBizId) obj).methods : null;
        }
        if (getstyleableidsArr != null) {
            for (getStyleableIds getstyleableids : getstyleableidsArr) {
                String min = getMin(getstyleableids.argTypes);
                if (min.length() + indexOf == str.length() && str.regionMatches(indexOf, min, 0, min.length())) {
                    return getstyleableids;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:33|34|(3:36|(2:38|60)(1:61)|39)|59|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r8.put(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r7 == null) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0 = r7.getDeclaredMethods();
        r2 = r0.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r3 >= r2) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r4 = r0[r3];
        r5 = r4.getModifiers();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (java.lang.reflect.Modifier.isPublic(r5) != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (java.lang.reflect.Modifier.isProtected(r5) != false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r10 == false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r5 = new o.getDrawableId.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r8.containsKey(r5) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r10 == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r4.isAccessible() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        r4.setAccessible(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r8.put(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        r0 = r7.getInterfaces();
        r2 = r0.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r10 != false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (r3 >= r2) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        getMax(r0[r3], r8, r9, r10);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r7 = r7.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = r7.getMethods();
        r2 = r0.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r3 < r2) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        r4 = r0[r3];
        r5 = new o.getDrawableId.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        if (r8.containsKey(r5) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0092, code lost:
        r8.put(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r9 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        r0 = new java.lang.StringBuilder("Could not discover accessible methods of class ");
        r0.append(r7.getName());
        r0.append(" due to lack of privileges, attemping superclasses/interfaces.");
        o.SecureQwertyKeyboard.AnonymousClass1.getMin(r0.toString());
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        r0 = r7.getInterfaces();
        r2 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r1 < r2) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ba, code lost:
        getMax(r0[r1], r8, r9, r10);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        r7 = r7.getSuperclass();
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r10 == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x002d, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r0 = r7.getMethods();
        r2 = r0.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r3 >= r2) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r4 = r0[r3];
        r5 = new o.getDrawableId.getMax(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (r8.containsKey(r5) != false) goto L_0x002a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void getMax(java.lang.Class<?> r7, java.util.Map<o.getDrawableId.getMax, java.lang.reflect.Method> r8, boolean r9, boolean r10) {
        /*
        L_0x0000:
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000d
            if (r10 == 0) goto L_0x00b3
        L_0x000d:
            if (r9 != 0) goto L_0x002d
            if (r10 == 0) goto L_0x0012
            goto L_0x002d
        L_0x0012:
            java.lang.reflect.Method[] r0 = r7.getMethods()     // Catch:{ SecurityException -> 0x0099 }
            int r2 = r0.length     // Catch:{ SecurityException -> 0x0099 }
            r3 = 0
        L_0x0018:
            if (r3 >= r2) goto L_0x00ca
            r4 = r0[r3]     // Catch:{ SecurityException -> 0x0099 }
            o.getDrawableId$getMax r5 = new o.getDrawableId$getMax     // Catch:{ SecurityException -> 0x0099 }
            r5.<init>(r4)     // Catch:{ SecurityException -> 0x0099 }
            boolean r6 = r8.containsKey(r5)     // Catch:{ SecurityException -> 0x0099 }
            if (r6 != 0) goto L_0x002a
            r8.put(r5, r4)     // Catch:{ SecurityException -> 0x0099 }
        L_0x002a:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x002d:
            if (r7 == 0) goto L_0x00ca
            java.lang.reflect.Method[] r0 = r7.getDeclaredMethods()     // Catch:{ SecurityException -> 0x007d }
            int r2 = r0.length     // Catch:{ SecurityException -> 0x007d }
            r3 = 0
        L_0x0035:
            if (r3 >= r2) goto L_0x0068
            r4 = r0[r3]     // Catch:{ SecurityException -> 0x007d }
            int r5 = r4.getModifiers()     // Catch:{ SecurityException -> 0x007d }
            boolean r6 = java.lang.reflect.Modifier.isPublic(r5)     // Catch:{ SecurityException -> 0x007d }
            if (r6 != 0) goto L_0x004b
            boolean r5 = java.lang.reflect.Modifier.isProtected(r5)     // Catch:{ SecurityException -> 0x007d }
            if (r5 != 0) goto L_0x004b
            if (r10 == 0) goto L_0x0065
        L_0x004b:
            o.getDrawableId$getMax r5 = new o.getDrawableId$getMax     // Catch:{ SecurityException -> 0x007d }
            r5.<init>(r4)     // Catch:{ SecurityException -> 0x007d }
            boolean r6 = r8.containsKey(r5)     // Catch:{ SecurityException -> 0x007d }
            if (r6 != 0) goto L_0x0065
            if (r10 == 0) goto L_0x0062
            boolean r6 = r4.isAccessible()     // Catch:{ SecurityException -> 0x007d }
            if (r6 != 0) goto L_0x0062
            r6 = 1
            r4.setAccessible(r6)     // Catch:{ SecurityException -> 0x007d }
        L_0x0062:
            r8.put(r5, r4)     // Catch:{ SecurityException -> 0x007d }
        L_0x0065:
            int r3 = r3 + 1
            goto L_0x0035
        L_0x0068:
            java.lang.Class[] r0 = r7.getInterfaces()     // Catch:{ SecurityException -> 0x007d }
            int r2 = r0.length     // Catch:{ SecurityException -> 0x007d }
            r3 = 0
        L_0x006e:
            if (r3 >= r2) goto L_0x0078
            r4 = r0[r3]     // Catch:{ SecurityException -> 0x007d }
            getMax(r4, r8, r9, r10)     // Catch:{ SecurityException -> 0x007d }
            int r3 = r3 + 1
            goto L_0x006e
        L_0x0078:
            java.lang.Class r7 = r7.getSuperclass()     // Catch:{ SecurityException -> 0x007d }
            goto L_0x002d
        L_0x007d:
            java.lang.reflect.Method[] r0 = r7.getMethods()     // Catch:{ SecurityException -> 0x0099 }
            int r2 = r0.length     // Catch:{ SecurityException -> 0x0099 }
            r3 = 0
        L_0x0083:
            if (r3 >= r2) goto L_0x0098
            r4 = r0[r3]     // Catch:{ SecurityException -> 0x0099 }
            o.getDrawableId$getMax r5 = new o.getDrawableId$getMax     // Catch:{ SecurityException -> 0x0099 }
            r5.<init>(r4)     // Catch:{ SecurityException -> 0x0099 }
            boolean r6 = r8.containsKey(r5)     // Catch:{ SecurityException -> 0x0099 }
            if (r6 != 0) goto L_0x0095
            r8.put(r5, r4)     // Catch:{ SecurityException -> 0x0099 }
        L_0x0095:
            int r3 = r3 + 1
            goto L_0x0083
        L_0x0098:
            return
        L_0x0099:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not discover accessible methods of class "
            r0.<init>(r2)
            java.lang.String r2 = r7.getName()
            r0.append(r2)
            java.lang.String r2 = " due to lack of privileges, attemping superclasses/interfaces."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r0)
        L_0x00b3:
            java.lang.Class[] r0 = r7.getInterfaces()
            int r2 = r0.length
        L_0x00b8:
            if (r1 >= r2) goto L_0x00c2
            r3 = r0[r1]
            getMax(r3, r8, r9, r10)
            int r1 = r1 + 1
            goto L_0x00b8
        L_0x00c2:
            java.lang.Class r7 = r7.getSuperclass()
            if (r7 == 0) goto L_0x00ca
            goto L_0x0000
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDrawableId.getMax(java.lang.Class, java.util.Map, boolean, boolean):void");
    }

    static final class getMax {
        private final String length;
        private final Class<?>[] setMax;

        private getMax(String str, Class<?>[] clsArr) {
            this.length = str;
            this.setMax = clsArr;
        }

        getMax(Method method) {
            this(method.getName(), method.getParameterTypes());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof getMax) {
                getMax getmax = (getMax) obj;
                if (!getmax.length.equals(this.length) || !Arrays.equals(this.setMax, getmax.setMax)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.length.hashCode() ^ this.setMax.length;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void getMin(o.LogUtils r17, boolean r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Class<?> r4 = r0.length
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            getMax(r4, r5, r2, r3)
            java.util.Collection r4 = r5.values()
            int r5 = r5.size()
            java.lang.reflect.Method[] r5 = new java.lang.reflect.Method[r5]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.reflect.Method[] r4 = (java.lang.reflect.Method[]) r4
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L_0x0025:
            if (r7 >= r5) goto L_0x0066
            r8 = r4[r7]
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L_0x0036
            java.util.Map<java.lang.String, java.lang.Object> r9 = r0.getMin
            goto L_0x0038
        L_0x0036:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r0.getMax
        L_0x0038:
            java.lang.String r10 = r8.getName()
            java.lang.Object r11 = r9.get(r10)
            if (r11 != 0) goto L_0x0046
            r9.put(r10, r8)
            goto L_0x0063
        L_0x0046:
            boolean r12 = r11 instanceof o.getLogs
            if (r12 == 0) goto L_0x004d
            o.getLogs r11 = (o.getLogs) r11
            goto L_0x0060
        L_0x004d:
            boolean r12 = r11 instanceof java.lang.reflect.Method
            if (r12 != 0) goto L_0x0054
            o.getStyleId.setMin()
        L_0x0054:
            o.getLogs r12 = new o.getLogs
            r12.<init>()
            r12.add(r11)
            r9.put(r10, r12)
            r11 = r12
        L_0x0060:
            r11.add(r8)
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0066:
            r4 = 0
        L_0x0067:
            r5 = 2
            r7 = 1
            if (r4 == r5) goto L_0x00d7
            if (r4 != 0) goto L_0x006f
            r8 = 1
            goto L_0x0070
        L_0x006f:
            r8 = 0
        L_0x0070:
            if (r8 == 0) goto L_0x0075
            java.util.Map<java.lang.String, java.lang.Object> r8 = r0.getMin
            goto L_0x0077
        L_0x0075:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r0.getMax
        L_0x0077:
            java.util.Set r9 = r8.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x007f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00d4
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            boolean r12 = r11 instanceof java.lang.reflect.Method
            if (r12 == 0) goto L_0x009f
            o.getStyleableIds[] r12 = new o.getStyleableIds[r7]
            o.getStyleableIds r13 = new o.getStyleableIds
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r13.<init>((java.lang.reflect.Method) r11)
            r12[r6] = r13
            goto L_0x00c1
        L_0x009f:
            o.getLogs r11 = (o.getLogs) r11
            int r12 = r11.size()
            if (r12 >= r5) goto L_0x00aa
            o.getStyleId.setMin()
        L_0x00aa:
            o.getStyleableIds[] r13 = new o.getStyleableIds[r12]
            r14 = 0
        L_0x00ad:
            if (r14 == r12) goto L_0x00c0
            java.lang.Object r15 = r11.get(r14)
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            o.getStyleableIds r7 = new o.getStyleableIds
            r7.<init>((java.lang.reflect.Method) r15)
            r13[r14] = r7
            int r14 = r14 + 1
            r7 = 1
            goto L_0x00ad
        L_0x00c0:
            r12 = r13
        L_0x00c1:
            o.setBizId r7 = new o.setBizId
            r7.<init>(r12)
            if (r1 == 0) goto L_0x00cb
            o.LogItem.getMax((o.onInit) r7, (o.LogUtils) r1)
        L_0x00cb:
            java.lang.Object r10 = r10.getKey()
            r8.put(r10, r7)
            r7 = 1
            goto L_0x007f
        L_0x00d4:
            int r4 = r4 + 1
            goto L_0x0067
        L_0x00d7:
            java.lang.reflect.Field[] r2 = r0.setMin(r2, r3)
            int r4 = r2.length
            r7 = 0
        L_0x00dd:
            if (r7 >= r4) goto L_0x016b
            r8 = r2[r7]
            java.lang.String r9 = r8.getName()
            int r10 = r8.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)     // Catch:{ SecurityException -> 0x0143 }
            if (r10 == 0) goto L_0x00f2
            java.util.Map<java.lang.String, java.lang.Object> r11 = r0.getMin     // Catch:{ SecurityException -> 0x0143 }
            goto L_0x00f4
        L_0x00f2:
            java.util.Map<java.lang.String, java.lang.Object> r11 = r0.getMax     // Catch:{ SecurityException -> 0x0143 }
        L_0x00f4:
            java.lang.Object r12 = r11.get(r9)     // Catch:{ SecurityException -> 0x0143 }
            if (r12 != 0) goto L_0x00fe
            r11.put(r9, r8)     // Catch:{ SecurityException -> 0x0143 }
            goto L_0x0167
        L_0x00fe:
            boolean r13 = r12 instanceof o.setBizId     // Catch:{ SecurityException -> 0x0143 }
            if (r13 == 0) goto L_0x0127
            o.setBizId r12 = (o.setBizId) r12     // Catch:{ SecurityException -> 0x0143 }
            o.encryptToByteArray r13 = new o.encryptToByteArray     // Catch:{ SecurityException -> 0x0143 }
            o.getStyleableIds[] r12 = r12.methods     // Catch:{ SecurityException -> 0x0143 }
            r13.<init>(r1, r12, r8)     // Catch:{ SecurityException -> 0x0143 }
            if (r10 == 0) goto L_0x0110
            java.util.Map<java.lang.String, o.encryptToByteArray> r8 = r0.toIntRange     // Catch:{ SecurityException -> 0x0143 }
            goto L_0x0112
        L_0x0110:
            java.util.Map<java.lang.String, o.encryptToByteArray> r8 = r0.setMax     // Catch:{ SecurityException -> 0x0143 }
        L_0x0112:
            if (r8 != 0) goto L_0x0120
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ SecurityException -> 0x0143 }
            r8.<init>()     // Catch:{ SecurityException -> 0x0143 }
            if (r10 == 0) goto L_0x011e
            r0.toIntRange = r8     // Catch:{ SecurityException -> 0x0143 }
            goto L_0x0120
        L_0x011e:
            r0.setMax = r8     // Catch:{ SecurityException -> 0x0143 }
        L_0x0120:
            r8.put(r9, r13)     // Catch:{ SecurityException -> 0x0143 }
            r11.put(r9, r13)     // Catch:{ SecurityException -> 0x0143 }
            goto L_0x0167
        L_0x0127:
            boolean r10 = r12 instanceof java.lang.reflect.Field     // Catch:{ SecurityException -> 0x0143 }
            if (r10 == 0) goto L_0x013f
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12     // Catch:{ SecurityException -> 0x0143 }
            java.lang.Class r10 = r12.getDeclaringClass()     // Catch:{ SecurityException -> 0x0143 }
            java.lang.Class r12 = r8.getDeclaringClass()     // Catch:{ SecurityException -> 0x0143 }
            boolean r10 = r10.isAssignableFrom(r12)     // Catch:{ SecurityException -> 0x0143 }
            if (r10 == 0) goto L_0x0167
            r11.put(r9, r8)     // Catch:{ SecurityException -> 0x0143 }
            goto L_0x0167
        L_0x013f:
            o.getStyleId.setMin()     // Catch:{ SecurityException -> 0x0143 }
            goto L_0x0167
        L_0x0143:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Could not access field "
            r8.<init>(r10)
            r8.append(r9)
            java.lang.String r9 = " of class "
            r8.append(r9)
            java.lang.Class<?> r9 = r0.length
            java.lang.String r9 = r9.getName()
            r8.append(r9)
            java.lang.String r9 = " due to lack of privileges."
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r8)
        L_0x0167:
            int r7 = r7 + 1
            goto L_0x00dd
        L_0x016b:
            r1 = 0
        L_0x016c:
            if (r1 == r5) goto L_0x0281
            if (r1 != 0) goto L_0x0172
            r2 = 1
            goto L_0x0173
        L_0x0172:
            r2 = 0
        L_0x0173:
            if (r2 == 0) goto L_0x0178
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.getMin
            goto L_0x017a
        L_0x0178:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r0.getMax
        L_0x017a:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Set r8 = r4.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0187:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0260
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "get"
            boolean r11 = r9.startsWith(r10)
            java.lang.String r12 = "set"
            boolean r13 = r9.startsWith(r12)
            java.lang.String r14 = "is"
            boolean r15 = r9.startsWith(r14)
            if (r11 != 0) goto L_0x01ae
            if (r15 != 0) goto L_0x01ae
            if (r13 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r15 = 1
            goto L_0x0187
        L_0x01ae:
            if (r15 == 0) goto L_0x01b2
            r11 = 2
            goto L_0x01b3
        L_0x01b2:
            r11 = 3
        L_0x01b3:
            java.lang.String r9 = r9.substring(r11)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x0187
            char r11 = r9.charAt(r6)
            boolean r13 = java.lang.Character.isUpperCase(r11)
            if (r13 == 0) goto L_0x01f5
            int r13 = r9.length()
            r15 = 1
            if (r13 != r15) goto L_0x01d3
            java.lang.String r11 = r9.toLowerCase()
            goto L_0x01f6
        L_0x01d3:
            char r13 = r9.charAt(r15)
            boolean r13 = java.lang.Character.isUpperCase(r13)
            if (r13 != 0) goto L_0x01f5
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            char r11 = java.lang.Character.toLowerCase(r11)
            r13.append(r11)
            java.lang.String r11 = r9.substring(r15)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            goto L_0x01f6
        L_0x01f5:
            r11 = r9
        L_0x01f6:
            boolean r13 = r7.containsKey(r11)
            if (r13 != 0) goto L_0x0187
            java.lang.Object r13 = r4.get(r11)
            if (r13 == 0) goto L_0x0214
            if (r3 == 0) goto L_0x0187
            boolean r15 = r13 instanceof java.lang.reflect.Member
            if (r15 == 0) goto L_0x0187
            java.lang.reflect.Member r13 = (java.lang.reflect.Member) r13
            int r13 = r13.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isPrivate(r13)
            if (r13 == 0) goto L_0x0187
        L_0x0214:
            o.getStyleableIds r10 = getMin(r2, r4, r10, r9)
            if (r10 != 0) goto L_0x021e
            o.getStyleableIds r10 = getMin(r2, r4, r14, r9)
        L_0x021e:
            java.lang.String r9 = r12.concat(r9)
            boolean r12 = r4.containsKey(r9)
            r13 = 0
            if (r12 == 0) goto L_0x0254
            java.lang.Object r9 = r4.get(r9)
            boolean r12 = r9 instanceof o.setBizId
            if (r12 == 0) goto L_0x0254
            o.setBizId r9 = (o.setBizId) r9
            if (r10 == 0) goto L_0x0244
            java.lang.reflect.Method r12 = r10.method()
            java.lang.Class r12 = r12.getReturnType()
            o.getStyleableIds[] r14 = r9.methods
            o.getStyleableIds r12 = getMax(r12, r14, r2)
            goto L_0x024a
        L_0x0244:
            o.getStyleableIds[] r12 = r9.methods
            o.getStyleableIds r12 = setMax(r12, r2)
        L_0x024a:
            o.getStyleableIds[] r14 = r9.methods
            int r14 = r14.length
            r15 = 1
            if (r14 <= r15) goto L_0x0251
            goto L_0x0252
        L_0x0251:
            r9 = r13
        L_0x0252:
            r13 = r12
            goto L_0x0256
        L_0x0254:
            r15 = 1
            r9 = r13
        L_0x0256:
            o.getAnnounceString r12 = new o.getAnnounceString
            r12.<init>(r10, r13, r9)
            r7.put(r11, r12)
            goto L_0x0187
        L_0x0260:
            r15 = 1
            java.util.Set r2 = r7.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0269:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x027d
            java.lang.Object r8 = r2.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.get(r8)
            r4.put(r8, r9)
            goto L_0x0269
        L_0x027d:
            int r1 = r1 + 1
            goto L_0x016c
        L_0x0281:
            java.lang.reflect.Constructor[] r1 = r0.length(r3)
            int r2 = r1.length
            o.getStyleableIds[] r2 = new o.getStyleableIds[r2]
        L_0x0288:
            int r3 = r1.length
            if (r6 == r3) goto L_0x0297
            o.getStyleableIds r3 = new o.getStyleableIds
            r4 = r1[r6]
            r3.<init>((java.lang.reflect.Constructor<?>) r4)
            r2[r6] = r3
            int r6 = r6 + 1
            goto L_0x0288
        L_0x0297:
            o.setBizId r1 = new o.setBizId
            java.lang.Class<?> r3 = r0.length
            java.lang.String r3 = r3.getSimpleName()
            r1.<init>((o.getStyleableIds[]) r2, (java.lang.String) r3)
            r0.setMin = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDrawableId.getMin(o.LogUtils, boolean, boolean):void");
    }

    private Constructor<?>[] length(boolean z) {
        if (z && this.length != LogItem.setMin) {
            try {
                Constructor<?>[] declaredConstructors = this.length.getDeclaredConstructors();
                AccessibleObject.setAccessible(declaredConstructors, true);
                return declaredConstructors;
            } catch (SecurityException unused) {
                StringBuilder sb = new StringBuilder("Could not access constructor  of class ");
                sb.append(this.length.getName());
                sb.append(" due to lack of privileges.");
                SecureQwertyKeyboard.AnonymousClass1.getMin(sb.toString());
            }
        }
        return this.length.getConstructors();
    }

    private Field[] setMin(boolean z, boolean z2) {
        if (z2 || z) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Class cls = this.length; cls != null; cls = cls.getSuperclass()) {
                    for (Field field : cls.getDeclaredFields()) {
                        int modifiers = field.getModifiers();
                        if (z2 || Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                            if (!field.isAccessible()) {
                                field.setAccessible(true);
                            }
                            arrayList.add(field);
                        }
                    }
                }
                return (Field[]) arrayList.toArray(new Field[arrayList.size()]);
            } catch (SecurityException unused) {
            }
        }
        return this.length.getFields();
    }

    private static getStyleableIds getMin(boolean z, Map<String, Object> map, String str, String str2) {
        String concat = str.concat(str2);
        if (!map.containsKey(concat)) {
            return null;
        }
        Object obj = map.get(concat);
        if (obj instanceof setBizId) {
            return getMax(((setBizId) obj).methods, z);
        }
        return null;
    }

    private static getStyleableIds getMax(getStyleableIds[] getstyleableidsArr, boolean z) {
        int length2 = getstyleableidsArr.length;
        int i = 0;
        while (i < length2) {
            getStyleableIds getstyleableids = getstyleableidsArr[i];
            if (getstyleableids.argTypes.length != 0 || (z && !getstyleableids.isStatic())) {
                i++;
            } else if (getstyleableids.method().getReturnType() != Void.TYPE) {
                return getstyleableids;
            } else {
                return null;
            }
        }
        return null;
    }

    private static getStyleableIds getMax(Class<?> cls, getStyleableIds[] getstyleableidsArr, boolean z) {
        for (int i = 1; i <= 2; i++) {
            for (getStyleableIds getstyleableids : getstyleableidsArr) {
                if (!z || getstyleableids.isStatic()) {
                    Class<?>[] clsArr = getstyleableids.argTypes;
                    if (clsArr.length != 1) {
                        continue;
                    } else if (i != 1) {
                        if (i != 2) {
                            getStyleId.setMin();
                        }
                        if (clsArr[0].isAssignableFrom(cls)) {
                            return getstyleableids;
                        }
                    } else if (clsArr[0] == cls) {
                        return getstyleableids;
                    }
                }
            }
        }
        return null;
    }

    private static getStyleableIds setMax(getStyleableIds[] getstyleableidsArr, boolean z) {
        for (getStyleableIds getstyleableids : getstyleableidsArr) {
            if ((!z || getstyleableids.isStatic()) && getstyleableids.method().getReturnType() == Void.TYPE && getstyleableids.argTypes.length == 1) {
                return getstyleableids;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, encryptToByteArray> length(LogUtils logUtils, Object obj, boolean z) {
        Map<String, encryptToByteArray> map = z ? this.toIntRange : this.setMax;
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap(map.size());
        for (encryptToByteArray next : map.values()) {
            encryptToByteArray encrypttobytearray = new encryptToByteArray(logUtils, next.methods, next.field);
            encrypttobytearray.javaObject = obj;
            hashMap.put(next.field.getName(), encrypttobytearray);
        }
        return hashMap;
    }

    static getDrawableId length(LogUtils logUtils, Class<?> cls, Class<?> cls2, boolean z) {
        SecureQwertyKeyboard secureQwertyKeyboard = SecureQwertyKeyboard.get(logUtils);
        Map<Class<?>, getDrawableId> classCacheMap = secureQwertyKeyboard.getClassCacheMap();
        Class<?> cls3 = cls;
        while (true) {
            getDrawableId getdrawableid = classCacheMap.get(cls3);
            if (getdrawableid != null) {
                if (cls3 != cls) {
                    classCacheMap.put(cls, getdrawableid);
                }
                return getdrawableid;
            }
            try {
                getDrawableId getdrawableid2 = new getDrawableId(secureQwertyKeyboard.getAssociatedScope(), cls3, z);
                if (secureQwertyKeyboard.isCachingEnabled()) {
                    classCacheMap.put(cls3, getdrawableid2);
                    if (cls3 != cls) {
                        classCacheMap.put(cls, getdrawableid2);
                    }
                }
                return getdrawableid2;
            } catch (SecurityException e) {
                if (cls2 == null || !cls2.isInterface()) {
                    Class<? super Object> superclass = cls3.getSuperclass();
                    if (superclass != null) {
                        cls3 = superclass;
                    } else if (cls3.isInterface()) {
                        cls3 = LogItem.equals;
                    } else {
                        throw e;
                    }
                } else {
                    cls3 = cls2;
                    cls2 = null;
                }
            }
        }
    }
}

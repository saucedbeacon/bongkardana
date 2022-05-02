package o;

import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.j256.ormlite.field.FieldType;
import java.util.HashMap;
import o.CircleFrameLayout;
import o.LogItem;
import o.SecureQwertyKeyboard;
import o.SimplePassword;
import org.mozilla.classfile.ClassFileWriter;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.FunctionNode;

public final class WaveView extends isHasFace {
    public isHasFace equals;
    private boolean toIntRange;

    public WaveView() {
    }

    public class ShapeType implements LogTracer {
        private static int toFloatRange;
        private static final Object toIntRange = new Object();
        private SecureQwertyKeyboard.AnonymousClass2 IsOverlapping;
        int equals;
        SimplePassword.TextWatcherImpl getMax;
        double[] getMin;
        private getLogs isInside;
        String length;
        String setMax;
        getCricleColor[] setMin;
        private String toString = "org.mozilla.javascript.optimizer.OptRuntime";

        static String getMax(double d) {
            return ((double) ((int) d)) == d ? "Ljava/lang/Integer;" : "Ljava/lang/Double;";
        }

        public final void setMin(RhinoException rhinoException) {
            throw new UnsupportedOperationException();
        }

        public final String length(SecureQwertyKeyboard.AnonymousClass1 r1, int[] iArr) {
            throw new UnsupportedOperationException();
        }

        public final String setMax(RhinoException rhinoException, String str) {
            throw new UnsupportedOperationException();
        }

        public final void setMax(LogItem.TracerInfo tracerInfo) {
            throw new UnsupportedOperationException();
        }

        public final Object length(SecureQwertyKeyboard.AnonymousClass2 r12, getCricleColor getcriclecolor, String str, boolean z) {
            int i;
            String str2;
            synchronized (toIntRange) {
                i = toFloatRange + 1;
                toFloatRange = i;
            }
            if (getcriclecolor.extraCallbackWithResult.length() > 0) {
                str2 = getcriclecolor.extraCallbackWithResult.replaceAll("\\W", "_");
                if (!Character.isJavaIdentifierStart(str2.charAt(0))) {
                    str2 = "_".concat(String.valueOf(str2));
                }
            } else {
                str2 = "c";
            }
            StringBuilder sb = new StringBuilder("org.mozilla.javascript.gen.");
            sb.append(str2);
            sb.append("_");
            sb.append(i);
            Object obj = sb.toString();
            return new Object[]{obj, getMax(r12, obj, getcriclecolor, str, z)};
        }

        public final LogItem.TracerInfo length(Object obj) {
            try {
                return (LogItem.TracerInfo) setMin(obj).newInstance();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Unable to instantiate compiled class:");
                sb.append(e.toString());
                throw new RuntimeException(sb.toString());
            }
        }

        public final doCheck length(SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, Object obj) {
            try {
                return (setNeedComfirm) setMin(obj).getConstructors()[0].newInstance(new Object[]{logUtils, r3, 0});
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Unable to instantiate compiled class:");
                sb.append(e.toString());
                throw new RuntimeException(sb.toString());
            }
        }

        private Class<?> setMin(Object obj) {
            Object[] objArr = (Object[]) obj;
            String str = (String) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            traceInfo min = LogPrinterProxy.setMin(getClass().getClassLoader(), (Object) null);
            try {
                Class<?> min2 = min.setMin(str, bArr);
                min.length(min2);
                return min2;
            } catch (IllegalArgumentException | SecurityException e) {
                throw new RuntimeException("Malformed optimizer package ".concat(String.valueOf(e)));
            }
        }

        private byte[] getMax(SecureQwertyKeyboard.AnonymousClass2 r8, String str, getCricleColor getcriclecolor, String str2, boolean z) {
            String str3;
            this.IsOverlapping = r8;
            length(getcriclecolor);
            int i = this.IsOverlapping.getMin;
            HashMap hashMap = null;
            if (i > 0 && getcriclecolor.length() == 137) {
                int size = getcriclecolor.ICustomTabsCallback$Default == null ? 0 : getcriclecolor.ICustomTabsCallback$Default.size();
                for (int i2 = 0; i2 != size; i2++) {
                    ClientConfigContentPB clientConfigContentPB = (ClientConfigContentPB) getcriclecolor.ICustomTabsCallback$Default.get(i2).ICustomTabsCallback$Stub$Proxy;
                    if (clientConfigContentPB.length.invokeSuspend == 1) {
                        FunctionNode functionNode = clientConfigContentPB.length;
                        if (functionNode.toIntRange != null) {
                            str3 = functionNode.toIntRange.equals;
                        } else {
                            str3 = "";
                        }
                        if (str3.length() != 0) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            hashMap.put(str3, clientConfigContentPB);
                        }
                    }
                }
            }
            if (hashMap != null) {
                this.isInside = new getLogs();
            }
            new BisBehavTask(hashMap, this.isInside).setMin(getcriclecolor, this.IsOverlapping);
            if (i > 0) {
                new BisClientInfo().length(getcriclecolor);
            }
            if (z) {
                getcriclecolor = getcriclecolor.ICustomTabsCallback$Default.get(0);
            }
            setMax(getcriclecolor);
            this.setMax = str;
            this.length = ClassFileWriter.length(str);
            try {
                return setMin(str2);
            } catch (ClassFileWriter.ClassFileFormatException e) {
                throw getMin(getcriclecolor, e.getMessage());
            }
        }

        private static RuntimeException getMin(getCricleColor getcriclecolor, String str) {
            String str2;
            if (getcriclecolor instanceof FunctionNode) {
                str2 = LogItem.length("msg.while.compiling.fn", (Object) ((FunctionNode) getcriclecolor).toIntRange, (Object) str);
            } else {
                str2 = LogItem.getMin("msg.while.compiling.script", (Object) str);
            }
            return SecureQwertyKeyboard.AnonymousClass1.getMin(str2, getcriclecolor.extraCallbackWithResult, getcriclecolor.equals());
        }

        private void setMax(getCricleColor getcriclecolor) {
            getLogs getlogs = new getLogs();
            setMin(getcriclecolor, getlogs);
            int size = getlogs.size();
            getCricleColor[] getcriclecolorArr = new getCricleColor[size];
            this.setMin = getcriclecolorArr;
            getlogs.toArray(getcriclecolorArr);
            this.getMax = new SimplePassword.TextWatcherImpl(size);
            for (int i = 0; i != size; i++) {
                this.getMax.put(this.setMin[i], i);
            }
        }

        private static void setMin(getCricleColor getcriclecolor, getLogs getlogs) {
            getlogs.add(getcriclecolor);
            int size = getcriclecolor.ICustomTabsCallback$Default == null ? 0 : getcriclecolor.ICustomTabsCallback$Default.size();
            for (int i = 0; i != size; i++) {
                setMin(getcriclecolor.ICustomTabsCallback$Default.get(i), getlogs);
            }
        }

        private byte[] setMin(String str) {
            int i;
            int i2;
            int i3;
            int i4;
            boolean z = this.setMin[0].length() == 137;
            boolean z2 = this.setMin.length > 1 || !z;
            boolean ICustomTabsCallback$Stub = this.setMin[0].ICustomTabsCallback$Stub();
            String str2 = null;
            if (this.IsOverlapping.setMax()) {
                str2 = this.setMin[0].extraCallbackWithResult;
            }
            ClassFileWriter classFileWriter = new ClassFileWriter(this.setMax, "org.mozilla.javascript.NativeFunction", str2);
            classFileWriter.setMax(FieldType.FOREIGN_ID_FIELD_SUFFIX, "I", 2);
            if (z2) {
                classFileWriter.getMin("<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Context;I)V", 1);
                classFileWriter.getMax(42, 25, 0);
                classFileWriter.setMin(183, "org.mozilla.javascript.NativeFunction", "<init>", "()V");
                classFileWriter.setMax(42);
                classFileWriter.getMax(26, 21, 3);
                classFileWriter.getMin(181, classFileWriter.length, FieldType.FOREIGN_ID_FIELD_SUFFIX, "I");
                classFileWriter.setMax(42);
                classFileWriter.getMax(42, 25, 2);
                classFileWriter.getMax(42, 25, 1);
                int i5 = this.setMin[0].length() == 137 ? 1 : 0;
                int length2 = this.setMin.length;
                if (i5 != length2) {
                    boolean z3 = 2 <= length2 - i5;
                    if (z3) {
                        classFileWriter.getMax(26, 21, 3);
                        i3 = classFileWriter.getMin(i5 + 1, length2 - 1);
                    } else {
                        i3 = 0;
                    }
                    int i6 = i5;
                    short s = 0;
                    while (i6 != length2) {
                        if (z3) {
                            if (i6 == i5) {
                                classFileWriter.equals(i3);
                                s = classFileWriter.getMin();
                            } else {
                                i4 = length2;
                                classFileWriter.setMin(i3, (i6 - 1) - i5, s);
                                int i7 = i5;
                                String str3 = this.setMax;
                                int i8 = i3;
                                StringBuilder sb = new StringBuilder("_i");
                                sb.append(this.getMax.getExisting(((ClientConfigContentPB) this.setMin[i6].ICustomTabsCallback$Stub$Proxy).length));
                                classFileWriter.setMin(183, str3, sb.toString(), "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
                                classFileWriter.setMax(177);
                                i6++;
                                i5 = i7;
                                length2 = i4;
                                i3 = i8;
                                z3 = z3;
                            }
                        }
                        i4 = length2;
                        int i72 = i5;
                        String str32 = this.setMax;
                        int i82 = i3;
                        StringBuilder sb2 = new StringBuilder("_i");
                        sb2.append(this.getMax.getExisting(((ClientConfigContentPB) this.setMin[i6].ICustomTabsCallback$Stub$Proxy).length));
                        classFileWriter.setMin(183, str32, sb2.toString(), "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
                        classFileWriter.setMax(177);
                        i6++;
                        i5 = i72;
                        length2 = i4;
                        i3 = i82;
                        z3 = z3;
                    }
                    classFileWriter.setMin(4);
                } else {
                    throw new RuntimeException("Bad tree in codegen");
                }
            }
            if (z) {
                classFileWriter.isInside.add(Short.valueOf(classFileWriter.getMax.length("org/mozilla/javascript/Script")));
                classFileWriter.getMin("<init>", "()V", 1);
                classFileWriter.setMax(42);
                classFileWriter.setMin(183, "org.mozilla.javascript.NativeFunction", "<init>", "()V");
                classFileWriter.setMax(42);
                classFileWriter.setMin(0);
                classFileWriter.getMin(181, classFileWriter.length, FieldType.FOREIGN_ID_FIELD_SUFFIX, "I");
                classFileWriter.setMax(177);
                classFileWriter.setMin(1);
                classFileWriter.getMin("main", "([Ljava/lang/String;)V", 9);
                classFileWriter.length(187, classFileWriter.length);
                classFileWriter.setMax(89);
                classFileWriter.setMin(183, classFileWriter.length, "<init>", "()V");
                classFileWriter.setMax(42);
                classFileWriter.setMin(184, this.toString, "main", "(Lorg/mozilla/javascript/Script;[Ljava/lang/String;)V");
                classFileWriter.setMax(177);
                classFileWriter.setMin(1);
                classFileWriter.getMin("exec", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Ljava/lang/Object;", 17);
                classFileWriter.setMax(42);
                classFileWriter.getMax(42, 25, 1);
                classFileWriter.getMax(42, 25, 2);
                classFileWriter.setMax(89);
                classFileWriter.setMax(1);
                classFileWriter.setMin(182, classFileWriter.length, "call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
                classFileWriter.setMax(176);
                classFileWriter.setMin(3);
            }
            classFileWriter.getMin("call", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", 17);
            int max = classFileWriter.getMax();
            classFileWriter.getMax(42, 25, 1);
            classFileWriter.setMin(184, "org/mozilla/javascript/ScriptRuntime", "hasTopCall", "(Lorg/mozilla/javascript/Context;)Z");
            classFileWriter.setMin(154, max);
            classFileWriter.getMax(42, 25, 0);
            classFileWriter.getMax(42, 25, 1);
            classFileWriter.getMax(42, 25, 2);
            classFileWriter.getMax(42, 25, 3);
            classFileWriter.getMax(42, 25, 4);
            classFileWriter.setMax(ICustomTabsCallback$Stub ? 4 : 3);
            classFileWriter.setMin(184, "org/mozilla/javascript/ScriptRuntime", "doTopCall", "(Lorg/mozilla/javascript/Callable;Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;Z)Ljava/lang/Object;");
            classFileWriter.setMax(176);
            classFileWriter.toFloatRange(max);
            classFileWriter.getMax(42, 25, 0);
            classFileWriter.getMax(42, 25, 1);
            classFileWriter.getMax(42, 25, 2);
            classFileWriter.getMax(42, 25, 3);
            classFileWriter.getMax(42, 25, 4);
            int length3 = this.setMin.length;
            boolean z4 = 2 <= length3;
            if (z4) {
                classFileWriter.setMax(42);
                classFileWriter.getMin(180, classFileWriter.length, FieldType.FOREIGN_ID_FIELD_SUFFIX, "I");
                i = classFileWriter.getMin(1, length3 - 1);
            } else {
                i = 0;
            }
            int i9 = 0;
            short s2 = 0;
            while (i9 != length3) {
                getCricleColor getcriclecolor = this.setMin[i9];
                if (z4) {
                    if (i9 == 0) {
                        classFileWriter.equals(i);
                        s2 = classFileWriter.getMin();
                    } else {
                        classFileWriter.setMin(i, i9 - 1, s2);
                    }
                }
                if (getcriclecolor.length() == 110) {
                    ClientConfigContentPB clientConfigContentPB = (ClientConfigContentPB) getcriclecolor.ICustomTabsCallback$Stub$Proxy;
                    if (clientConfigContentPB.setMax() && (i2 = clientConfigContentPB.length.onTransact) != 0) {
                        int i10 = 0;
                        while (i10 != i2) {
                            classFileWriter.setMax(190);
                            classFileWriter.setMin(i10);
                            int max2 = classFileWriter.getMax();
                            int max3 = classFileWriter.getMax();
                            classFileWriter.setMin(164, max2);
                            classFileWriter.getMax(42, 25, 4);
                            classFileWriter.setMin(i10);
                            classFileWriter.setMax(50);
                            classFileWriter.setMin(167, max3);
                            classFileWriter.toFloatRange(max2);
                            classFileWriter.getMin(178, "org/mozilla/javascript/Undefined", "instance", "Ljava/lang/Object;");
                            classFileWriter.toFloatRange(max3);
                            classFileWriter.setMin();
                            classFileWriter.length(0.0d);
                            classFileWriter.getMax(42, 25, 4);
                            i10++;
                            z4 = z4;
                            length3 = length3;
                        }
                    }
                }
                classFileWriter.setMin(184, this.setMax, setMin(getcriclecolor), getMax(getcriclecolor));
                classFileWriter.setMax(176);
                i9++;
                z4 = z4;
                length3 = length3;
            }
            classFileWriter.setMin(5);
            int i11 = 0;
            boolean z5 = false;
            while (true) {
                getCricleColor[] getcriclecolorArr = this.setMin;
                if (i11 >= getcriclecolorArr.length) {
                    break;
                }
                if (getMin(getcriclecolorArr[i11])) {
                    z5 = true;
                }
                i11++;
            }
            if (z5) {
                classFileWriter.getMin("resumeGenerator", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 17);
                classFileWriter.getMax(42, 25, 0);
                classFileWriter.getMax(42, 25, 1);
                classFileWriter.getMax(42, 25, 2);
                classFileWriter.getMax(42, 25, 4);
                classFileWriter.getMax(42, 25, 5);
                classFileWriter.getMax(26, 21, 3);
                classFileWriter.setMax(42);
                classFileWriter.getMin(180, classFileWriter.length, FieldType.FOREIGN_ID_FIELD_SUFFIX, "I");
                int min = classFileWriter.getMin(0, this.setMin.length - 1);
                classFileWriter.equals(min);
                int max4 = classFileWriter.getMax();
                int i12 = 0;
                while (true) {
                    getCricleColor[] getcriclecolorArr2 = this.setMin;
                    if (i12 >= getcriclecolorArr2.length) {
                        break;
                    }
                    getCricleColor getcriclecolor2 = getcriclecolorArr2[i12];
                    classFileWriter.setMin(min, i12, 6);
                    if (getMin(getcriclecolor2)) {
                        StringBuilder sb3 = new StringBuilder("(");
                        sb3.append(this.length);
                        sb3.append("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;");
                        String obj = sb3.toString();
                        String str4 = this.setMax;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(setMin(getcriclecolor2));
                        sb4.append("_gen");
                        classFileWriter.setMin(184, str4, sb4.toString(), obj);
                        classFileWriter.setMax(176);
                    } else {
                        classFileWriter.setMin(167, max4);
                    }
                    i12++;
                }
                classFileWriter.toFloatRange(max4);
                classFileWriter.getMin(178, "org/mozilla/javascript/Undefined", "instance", "Ljava/lang/Object;");
                classFileWriter.setMax(176);
                classFileWriter.setMin(6);
            }
            getMin(classFileWriter, str);
            int length4 = this.setMin.length;
            int i13 = 0;
            while (i13 != length4) {
                getCricleColor getcriclecolor3 = this.setMin[i13];
                fillTagValue filltagvalue = new fillTagValue();
                filltagvalue.length = classFileWriter;
                filltagvalue.setMax = this;
                filltagvalue.setMin = this.IsOverlapping;
                filltagvalue.getMin = getcriclecolor3;
                filltagvalue.getMax = i13;
                try {
                    filltagvalue.getMax();
                    if (getcriclecolor3.length() == 110) {
                        ClientConfigContentPB clientConfigContentPB2 = (ClientConfigContentPB) getcriclecolor3.ICustomTabsCallback$Stub$Proxy;
                        StringBuilder sb5 = new StringBuilder("_i");
                        sb5.append(this.getMax.getExisting(clientConfigContentPB2.length));
                        classFileWriter.getMin(sb5.toString(), "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V", 18);
                        classFileWriter.setMax(42);
                        classFileWriter.getMax(42, 25, 1);
                        classFileWriter.getMax(42, 25, 2);
                        classFileWriter.setMin(182, "org/mozilla/javascript/NativeFunction", "initScriptFunction", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)V");
                        FunctionNode functionNode = clientConfigContentPB2.length;
                        if ((functionNode.asInterface == null ? 0 : functionNode.asInterface.size()) != 0) {
                            classFileWriter.getMax(42, 25, 1);
                            classFileWriter.setMin(184, this.setMax, "_reInit", "(Lorg/mozilla/javascript/Context;)V");
                        }
                        classFileWriter.setMax(177);
                        classFileWriter.setMin(3);
                        if (clientConfigContentPB2.setMax()) {
                            setMax(classFileWriter, clientConfigContentPB2);
                        }
                    }
                    i13++;
                } catch (ClassFileWriter.ClassFileFormatException e) {
                    throw getMin(getcriclecolor3, e.getMessage());
                }
            }
            setMin(classFileWriter);
            length(classFileWriter);
            return classFileWriter.setMax();
        }

        private void setMax(ClassFileWriter classFileWriter, ClientConfigContentPB clientConfigContentPB) {
            FunctionNode functionNode = clientConfigContentPB.length;
            StringBuilder sb = new StringBuilder("_n");
            sb.append(this.getMax.getExisting(functionNode));
            classFileWriter.getMin(sb.toString(), getMax((getCricleColor) clientConfigContentPB.length), 10);
            int i = clientConfigContentPB.length.onTransact;
            int i2 = (i * 3) + 4;
            int i3 = i2 + 1;
            classFileWriter.getMax(42, 25, 0);
            classFileWriter.getMax(42, 25, 1);
            classFileWriter.getMax(42, 25, 2);
            classFileWriter.setMin(182, "org/mozilla/javascript/BaseFunction", "createObject", "(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;)Lorg/mozilla/javascript/Scriptable;");
            classFileWriter.getMax(75, 58, i3);
            classFileWriter.getMax(42, 25, 0);
            classFileWriter.getMax(42, 25, 1);
            classFileWriter.getMax(42, 25, 2);
            classFileWriter.getMax(42, 25, i3);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i4 * 3;
                classFileWriter.getMax(42, 25, i5 + 4);
                classFileWriter.getMax(38, 24, i5 + 5);
            }
            classFileWriter.getMax(42, 25, i2);
            classFileWriter.setMin(184, this.setMax, setMin((getCricleColor) clientConfigContentPB.length), getMax((getCricleColor) clientConfigContentPB.length));
            int max = classFileWriter.getMax();
            classFileWriter.setMax(89);
            classFileWriter.length(193, "org/mozilla/javascript/Scriptable");
            classFileWriter.setMin(153, max);
            classFileWriter.length(PsExtractor.AUDIO_STREAM, "org/mozilla/javascript/Scriptable");
            classFileWriter.setMax(176);
            classFileWriter.toFloatRange(max);
            classFileWriter.getMax(42, 25, i3);
            classFileWriter.setMax(176);
            classFileWriter.setMin((short) (i3 + 1));
        }

        static boolean getMin(getCricleColor getcriclecolor) {
            return getcriclecolor.length() == 110 && ((FunctionNode) getcriclecolor).invokeSuspend();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void getMin(org.mozilla.classfile.ClassFileWriter r18, java.lang.String r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "()I"
                r3 = 1
                java.lang.String r4 = "getLanguageVersion"
                r1.getMin((java.lang.String) r4, (java.lang.String) r2, (short) r3)
                o.SecureQwertyKeyboard$2 r4 = r0.IsOverlapping
                int r4 = r4.setMin
                r1.setMin((int) r4)
                r4 = 172(0xac, float:2.41E-43)
                r1.setMax((int) r4)
                r1.setMin((short) r3)
                r6 = 0
            L_0x001c:
                r7 = 6
                if (r6 == r7) goto L_0x0204
                r7 = 4
                if (r6 != r7) goto L_0x0028
                if (r19 == 0) goto L_0x0025
                goto L_0x0028
            L_0x0025:
                r3 = 0
                goto L_0x01ff
            L_0x0028:
                java.lang.String r8 = "()Ljava/lang/String;"
                r9 = 5
                r10 = 2
                r11 = 3
                if (r6 == 0) goto L_0x0065
                if (r6 == r3) goto L_0x005f
                if (r6 == r10) goto L_0x0059
                if (r6 == r11) goto L_0x0050
                if (r6 == r7) goto L_0x0047
                if (r6 != r9) goto L_0x0042
                java.lang.String r8 = "getParamOrVarConst"
                java.lang.String r12 = "(I)Z"
                r1.getMin((java.lang.String) r8, (java.lang.String) r12, (short) r3)
                r8 = 3
                goto L_0x006b
            L_0x0042:
                java.lang.RuntimeException r1 = o.getStyleId.setMin()
                throw r1
            L_0x0047:
                java.lang.String r12 = "getEncodedSource"
                r1.getMin((java.lang.String) r12, (java.lang.String) r8, (short) r3)
                r18.getMin((java.lang.String) r19)
                goto L_0x006a
            L_0x0050:
                java.lang.String r8 = "getParamOrVarName"
                java.lang.String r12 = "(I)Ljava/lang/String;"
                r1.getMin((java.lang.String) r8, (java.lang.String) r12, (short) r3)
                r8 = 2
                goto L_0x006b
            L_0x0059:
                java.lang.String r8 = "getParamAndVarCount"
                r1.getMin((java.lang.String) r8, (java.lang.String) r2, (short) r3)
                goto L_0x006a
            L_0x005f:
                java.lang.String r8 = "getParamCount"
                r1.getMin((java.lang.String) r8, (java.lang.String) r2, (short) r3)
                goto L_0x006a
            L_0x0065:
                java.lang.String r12 = "getFunctionName"
                r1.getMin((java.lang.String) r12, (java.lang.String) r8, (short) r3)
            L_0x006a:
                r8 = 1
            L_0x006b:
                o.getCricleColor[] r12 = r0.setMin
                int r12 = r12.length
                if (r12 <= r3) goto L_0x0087
                r13 = 42
                r1.setMax((int) r13)
                r13 = 180(0xb4, float:2.52E-43)
                java.lang.String r14 = r1.length
                java.lang.String r15 = "_id"
                java.lang.String r5 = "I"
                r1.getMin(r13, r14, r15, r5)
                int r5 = r12 + -1
                int r5 = r1.getMin((int) r3, (int) r5)
                goto L_0x0088
            L_0x0087:
                r5 = 0
            L_0x0088:
                r13 = 0
                r14 = 0
            L_0x008a:
                if (r14 == r12) goto L_0x01fb
                o.getCricleColor[] r15 = r0.setMin
                r15 = r15[r14]
                if (r14 != 0) goto L_0x009c
                if (r12 <= r3) goto L_0x00a1
                r1.equals((int) r5)
                short r13 = r18.getMin()
                goto L_0x00a1
            L_0x009c:
                int r4 = r14 + -1
                r1.setMin(r5, r4, r13)
            L_0x00a1:
                if (r6 == 0) goto L_0x01ce
                if (r6 == r3) goto L_0x01c2
                if (r6 == r10) goto L_0x01a9
                r10 = 21
                r4 = 26
                if (r6 == r11) goto L_0x013d
                if (r6 == r7) goto L_0x011e
                if (r6 != r9) goto L_0x0119
                java.lang.String[] r7 = r15.ICustomTabsService
                if (r7 == 0) goto L_0x0114
                java.util.List<o.getRoundWidth> r7 = r15.asBinder
                int r7 = r7.size()
                boolean[] r15 = r15.extraCallback()
                if (r7 != 0) goto L_0x00cc
                r1.setMax((int) r11)
                r4 = 172(0xac, float:2.41E-43)
                r1.setMax((int) r4)
                r3 = 0
                goto L_0x01f2
            L_0x00cc:
                r9 = 172(0xac, float:2.41E-43)
                if (r7 != r3) goto L_0x00e0
                r16 = 0
                boolean r4 = r15[r16]
                if (r4 == 0) goto L_0x00d8
                r4 = 4
                goto L_0x00d9
            L_0x00d8:
                r4 = 3
            L_0x00d9:
                r1.setMax((int) r4)
                r1.setMax((int) r9)
                goto L_0x0138
            L_0x00e0:
                r1.getMax((int) r4, (int) r10, (int) r3)
                int r4 = r7 + -1
                int r4 = r1.getMin((int) r3, (int) r4)
                r9 = 0
            L_0x00ea:
                if (r9 == r7) goto L_0x0138
                short r10 = r18.getMin()
                if (r10 == 0) goto L_0x00f5
                o.getStyleId.setMin()
            L_0x00f5:
                if (r9 != 0) goto L_0x00fb
                r1.equals((int) r4)
                goto L_0x0101
            L_0x00fb:
                int r10 = r9 + -1
                r11 = 0
                r1.setMin(r4, r10, r11)
            L_0x0101:
                boolean r10 = r15[r9]
                if (r10 == 0) goto L_0x0107
                r10 = 4
                goto L_0x0108
            L_0x0107:
                r10 = 3
            L_0x0108:
                r1.setMax((int) r10)
                r10 = 172(0xac, float:2.41E-43)
                r1.setMax((int) r10)
                int r9 = r9 + 1
                r11 = 3
                goto L_0x00ea
            L_0x0114:
                java.lang.RuntimeException r1 = o.getStyleId.setMin()
                throw r1
            L_0x0119:
                java.lang.RuntimeException r1 = o.getStyleId.setMin()
                throw r1
            L_0x011e:
                int r4 = r15.extraCallback
                r1.setMin((int) r4)
                int r4 = r15.onRelationshipValidationResult
                r1.setMin((int) r4)
                r4 = 182(0xb6, float:2.55E-43)
                java.lang.String r7 = "java/lang/String"
                java.lang.String r9 = "substring"
                java.lang.String r10 = "(II)Ljava/lang/String;"
                r1.setMin(r4, r7, r9, r10)
                r7 = 176(0xb0, float:2.47E-43)
                r1.setMax((int) r7)
            L_0x0138:
                r3 = 0
                r4 = 172(0xac, float:2.41E-43)
                goto L_0x01f2
            L_0x013d:
                r7 = 176(0xb0, float:2.47E-43)
                java.lang.String[] r9 = r15.ICustomTabsService
                if (r9 == 0) goto L_0x01a4
                java.util.List<o.getRoundWidth> r9 = r15.asBinder
                int r9 = r9.size()
                if (r9 != 0) goto L_0x0152
                r1.setMax((int) r3)
                r1.setMax((int) r7)
                goto L_0x0138
            L_0x0152:
                if (r9 != r3) goto L_0x0169
                java.lang.String[] r4 = r15.ICustomTabsService
                if (r4 == 0) goto L_0x0164
                java.lang.String[] r4 = r15.ICustomTabsService
                r9 = 0
                r4 = r4[r9]
                r1.getMin((java.lang.String) r4)
                r1.setMax((int) r7)
                goto L_0x0138
            L_0x0164:
                java.lang.RuntimeException r1 = o.getStyleId.setMin()
                throw r1
            L_0x0169:
                r1.getMax((int) r4, (int) r10, (int) r3)
                int r4 = r9 + -1
                int r4 = r1.getMin((int) r3, (int) r4)
                r7 = 0
            L_0x0173:
                if (r7 == r9) goto L_0x0138
                short r10 = r18.getMin()
                if (r10 == 0) goto L_0x017e
                o.getStyleId.setMin()
            L_0x017e:
                java.lang.String[] r10 = r15.ICustomTabsService
                if (r10 == 0) goto L_0x019f
                java.lang.String[] r10 = r15.ICustomTabsService
                r10 = r10[r7]
                if (r7 != 0) goto L_0x018d
                r1.equals((int) r4)
                r3 = 0
                goto L_0x0193
            L_0x018d:
                int r11 = r7 + -1
                r3 = 0
                r1.setMin(r4, r11, r3)
            L_0x0193:
                r1.getMin((java.lang.String) r10)
                r10 = 176(0xb0, float:2.47E-43)
                r1.setMax((int) r10)
                int r7 = r7 + 1
                r3 = 1
                goto L_0x0173
            L_0x019f:
                java.lang.RuntimeException r1 = o.getStyleId.setMin()
                throw r1
            L_0x01a4:
                java.lang.RuntimeException r1 = o.getStyleId.setMin()
                throw r1
            L_0x01a9:
                r3 = 0
                java.lang.String[] r4 = r15.ICustomTabsService
                if (r4 == 0) goto L_0x01bd
                java.util.List<o.getRoundWidth> r4 = r15.asBinder
                int r4 = r4.size()
                r1.setMin((int) r4)
                r4 = 172(0xac, float:2.41E-43)
                r1.setMax((int) r4)
                goto L_0x01f2
            L_0x01bd:
                java.lang.RuntimeException r1 = o.getStyleId.setMin()
                throw r1
            L_0x01c2:
                r3 = 0
                r4 = 172(0xac, float:2.41E-43)
                int r7 = r15.onTransact
                r1.setMin((int) r7)
                r1.setMax((int) r4)
                goto L_0x01f2
            L_0x01ce:
                r3 = 0
                r4 = 172(0xac, float:2.41E-43)
                int r7 = r15.length()
                r9 = 137(0x89, float:1.92E-43)
                java.lang.String r10 = ""
                if (r7 != r9) goto L_0x01e1
                r1.getMin((java.lang.String) r10)
            L_0x01de:
                r7 = 176(0xb0, float:2.47E-43)
                goto L_0x01ef
            L_0x01e1:
                org.mozilla.javascript.ast.FunctionNode r15 = (org.mozilla.javascript.ast.FunctionNode) r15
                o.CircleFrameLayout$WidgetListener r7 = r15.toIntRange
                if (r7 == 0) goto L_0x01eb
                o.CircleFrameLayout$WidgetListener r7 = r15.toIntRange
                java.lang.String r10 = r7.equals
            L_0x01eb:
                r1.getMin((java.lang.String) r10)
                goto L_0x01de
            L_0x01ef:
                r1.setMax((int) r7)
            L_0x01f2:
                int r14 = r14 + 1
                r3 = 1
                r7 = 4
                r9 = 5
                r10 = 2
                r11 = 3
                goto L_0x008a
            L_0x01fb:
                r3 = 0
                r1.setMin((short) r8)
            L_0x01ff:
                int r6 = r6 + 1
                r3 = 1
                goto L_0x001c
            L_0x0204:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.WaveView.ShapeType.getMin(org.mozilla.classfile.ClassFileWriter, java.lang.String):void");
        }

        private void setMin(ClassFileWriter classFileWriter) {
            ClassFileWriter classFileWriter2 = classFileWriter;
            int i = 0;
            int i2 = 0;
            while (true) {
                getCricleColor[] getcriclecolorArr = this.setMin;
                if (i == getcriclecolorArr.length) {
                    break;
                }
                getCricleColor getcriclecolor = getcriclecolorArr[i];
                i2 += getcriclecolor.asInterface == null ? 0 : getcriclecolor.asInterface.size();
                i++;
            }
            if (i2 != 0) {
                short s = 10;
                classFileWriter2.getMin("_reInit", "(Lorg/mozilla/javascript/Context;)V", 10);
                classFileWriter2.setMax("_reInitDone", "Z", 74);
                classFileWriter2.getMin(178, this.setMax, "_reInitDone", "Z");
                int max = classFileWriter.getMax();
                classFileWriter2.setMin(153, max);
                classFileWriter2.setMax(177);
                classFileWriter2.toFloatRange(max);
                int i3 = 25;
                classFileWriter2.getMax(42, 25, 0);
                classFileWriter2.setMin(184, "org/mozilla/javascript/ScriptRuntime", "checkRegExpProxy", "(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
                classFileWriter2.getMax(75, 58, 1);
                int i4 = 0;
                while (true) {
                    getCricleColor[] getcriclecolorArr2 = this.setMin;
                    if (i4 != getcriclecolorArr2.length) {
                        getCricleColor getcriclecolor2 = getcriclecolorArr2[i4];
                        int size = getcriclecolor2.asInterface == null ? 0 : getcriclecolor2.asInterface.size();
                        int i5 = 0;
                        while (i5 != size) {
                            String max2 = setMax(getcriclecolor2, i5);
                            String str = getcriclecolor2.asInterface.get(i5).toFloatRange;
                            String str2 = getcriclecolor2.asInterface.get(i5).isInside;
                            classFileWriter2.setMax(max2, "Ljava/lang/Object;", s);
                            classFileWriter2.getMax(42, i3, 1);
                            classFileWriter2.getMax(42, i3, 0);
                            classFileWriter2.getMin(str);
                            if (str2 == null) {
                                classFileWriter2.setMax(1);
                            } else {
                                classFileWriter2.getMin(str2);
                            }
                            classFileWriter2.setMin(WSContextConstant.HANDSHAKE_RECEIVE_SIZE, "org/mozilla/javascript/RegExpProxy", "compileRegExp", "(Lorg/mozilla/javascript/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;");
                            classFileWriter2.getMin(179, this.setMax, max2, "Ljava/lang/Object;");
                            i5++;
                            s = 10;
                            i3 = 25;
                        }
                        i4++;
                        s = 10;
                        i3 = 25;
                    } else {
                        classFileWriter2.setMin(1);
                        classFileWriter2.getMin(179, this.setMax, "_reInitDone", "Z");
                        classFileWriter2.setMax(177);
                        classFileWriter2.setMin(2);
                        return;
                    }
                }
            }
        }

        private void length(ClassFileWriter classFileWriter) {
            int i = this.equals;
            if (i != 0) {
                classFileWriter.getMin("<clinit>", "()V", 24);
                double[] dArr = this.getMin;
                for (int i2 = 0; i2 != i; i2++) {
                    double d = dArr[i2];
                    String concat = "_k".concat(String.valueOf(i2));
                    int i3 = (int) d;
                    double d2 = (double) i3;
                    String str = d2 == d ? "Ljava/lang/Integer;" : "Ljava/lang/Double;";
                    classFileWriter.setMax(concat, str, 10);
                    if (d2 == d) {
                        classFileWriter.setMin(i3);
                        classFileWriter.setMin(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    } else {
                        classFileWriter.length(d);
                        classFileWriter.setMin(184, "org/mozilla/javascript/optimizer/OptRuntime", "wrapDouble", "(D)Ljava/lang/Double;");
                    }
                    classFileWriter.getMin(179, this.setMax, concat, str);
                }
                classFileWriter.setMax(177);
                classFileWriter.setMin(0);
            }
        }

        static void getMin(ClassFileWriter classFileWriter) {
            classFileWriter.setMin(184, "org/mozilla/javascript/optimizer/OptRuntime", "wrapDouble", "(D)Ljava/lang/Double;");
        }

        static void setMax(ClassFileWriter classFileWriter) {
            classFileWriter.getMin(178, "org/mozilla/javascript/Undefined", "instance", "Ljava/lang/Object;");
        }

        /* access modifiers changed from: package-private */
        public final String setMin(getCricleColor getcriclecolor) {
            StringBuilder sb = new StringBuilder("_c_");
            sb.append(equals(getcriclecolor));
            sb.append("_");
            sb.append(this.getMax.getExisting(getcriclecolor));
            return sb.toString();
        }

        private static String equals(getCricleColor getcriclecolor) {
            if (!(getcriclecolor instanceof FunctionNode)) {
                return "script";
            }
            CircleFrameLayout.WidgetListener widgetListener = ((FunctionNode) getcriclecolor).toIntRange;
            if (widgetListener == null) {
                return "anonymous";
            }
            return widgetListener.equals;
        }

        /* access modifiers changed from: package-private */
        public final String getMax(getCricleColor getcriclecolor) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(this.length);
            sb.append("Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;");
            if (getcriclecolor.length() == 110) {
                ClientConfigContentPB clientConfigContentPB = (ClientConfigContentPB) getcriclecolor.ICustomTabsCallback$Stub$Proxy;
                if (clientConfigContentPB.setMax()) {
                    int i = clientConfigContentPB.length.onTransact;
                    for (int i2 = 0; i2 != i; i2++) {
                        sb.append("Ljava/lang/Object;D");
                    }
                }
            }
            sb.append("[Ljava/lang/Object;)Ljava/lang/Object;");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public final String setMax(getCricleColor getcriclecolor, int i) {
            StringBuilder sb = new StringBuilder("_re");
            sb.append(this.getMax.getExisting(getcriclecolor));
            sb.append("_");
            sb.append(i);
            return sb.toString();
        }

        static RuntimeException getMin() {
            throw new RuntimeException("Bad tree in codegen");
        }

        private static void length(getCricleColor getcriclecolor) {
            int size = getcriclecolor.ICustomTabsCallback$Default == null ? 0 : getcriclecolor.ICustomTabsCallback$Default.size();
            for (int i = 0; i != size; i++) {
                FunctionNode functionNode = getcriclecolor.ICustomTabsCallback$Default.get(i);
                new ClientConfigContentPB(functionNode);
                length((getCricleColor) functionNode);
            }
        }
    }

    public WaveView(int i, int i2) {
        super(i, i2);
    }

    public WaveView(int i, int i2, isHasFace ishasface) {
        this(i, i2, ishasface, false);
    }

    public WaveView(int i, int i2, isHasFace ishasface, boolean z) {
        int i3;
        if (ishasface != null) {
            int Mean$Arithmetic = z ? ishasface.Mean$Arithmetic() : i2;
            if (z) {
                i3 = i2 + 2;
            } else {
                i3 = ishasface.Mean$Arithmetic() + ishasface.create();
            }
            length(Mean$Arithmetic, i3);
            if (Token.getMin(i)) {
                setMax(i);
                if (ishasface != null) {
                    this.equals = ishasface;
                    ishasface.getMax(this);
                    this.toIntRange = z;
                    return;
                }
                throw new IllegalArgumentException("arg cannot be null");
            }
            throw new IllegalArgumentException("Invalid token: ".concat(String.valueOf(i)));
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final boolean invokeSuspend() {
        return this.toIntRange;
    }

    public final boolean Grayscale$Algorithm() {
        return !this.toIntRange;
    }
}

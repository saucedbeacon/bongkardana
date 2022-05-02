package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import o.SecureQwertyKeyboard;
import o.SimplePassword;
import org.mozilla.classfile.ClassFileWriter;

public final class getStringId implements printExceptionStackTrace {
    private static final Object setMin = "JavaAdapter";

    static class length {
        Class<?>[] getMax;
        Class<?> length;
        SimplePassword.TextWatcherImpl setMax;

        length(Class<?> cls, Class<?>[] clsArr, SimplePassword.TextWatcherImpl textWatcherImpl) {
            this.length = cls;
            this.getMax = clsArr;
            this.setMax = textWatcherImpl;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof length)) {
                return false;
            }
            length length2 = (length) obj;
            if (this.length != length2.length) {
                return false;
            }
            Class<?>[] clsArr = this.getMax;
            Class<?>[] clsArr2 = length2.getMax;
            if (clsArr != clsArr2) {
                if (clsArr.length == clsArr2.length) {
                    int i = 0;
                    while (true) {
                        Class<?>[] clsArr3 = this.getMax;
                        if (i >= clsArr3.length) {
                            break;
                        } else if (clsArr3[i] != length2.getMax[i]) {
                            return false;
                        } else {
                            i++;
                        }
                    }
                } else {
                    return false;
                }
            }
            if (this.setMax.size() != length2.setMax.size()) {
                return false;
            }
            SimplePassword.TextWatcherImpl.getMin getmin = new SimplePassword.TextWatcherImpl.getMin(this.setMax);
            getmin.setMin.initIterator(getmin);
            getmin.getMax();
            while (!getmin.getMin()) {
                Object obj2 = getmin.getMin[getmin.setMax];
                if (obj2 == ack.NULL_VALUE) {
                    obj2 = null;
                }
                int i2 = getmin.getMax[getmin.setMax];
                if (i2 != length2.setMax.get((String) obj2, i2 + 1)) {
                    return false;
                }
                getmin.getMax();
            }
            return true;
        }

        public final int hashCode() {
            return (this.length.hashCode() + Arrays.hashCode(this.getMax)) ^ this.setMax.size();
        }
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (editTextUtil.hasTag(setMin) && editTextUtil.methodId() == 1) {
            return getMax(r3, logUtils, objArr);
        }
        throw editTextUtil.unknown();
    }

    /* JADX WARNING: type inference failed for: r9v9, types: [java.security.CodeSource] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object getMax(o.SecureQwertyKeyboard.AnonymousClass1 r16, o.LogUtils r17, java.lang.Object[] r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = r2.length
            if (r3 == 0) goto L_0x019c
            r4 = 0
            r5 = 0
        L_0x000b:
            int r6 = r3 + -1
            if (r5 >= r6) goto L_0x002b
            r6 = r2[r5]
            boolean r7 = r6 instanceof o.setmSubmitInterface
            if (r7 != 0) goto L_0x002b
            boolean r7 = r6 instanceof o.initPwdInputView
            if (r7 == 0) goto L_0x001c
            int r5 = r5 + 1
            goto L_0x000b
        L_0x001c:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = o.LogItem.getMin((java.lang.Object) r6)
            java.lang.String r2 = "msg.not.java.class.arg"
            org.mozilla.javascript.EcmaError r0 = o.LogItem.setMin((java.lang.String) r2, (java.lang.Object) r0, (java.lang.Object) r1)
            throw r0
        L_0x002b:
            java.lang.Class[] r6 = new java.lang.Class[r5]
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0030:
            if (r8 >= r5) goto L_0x005b
            r11 = r2[r8]
            o.initPwdInputView r11 = (o.initPwdInputView) r11
            java.lang.Class r11 = r11.getClassObject()
            boolean r12 = r11.isInterface()
            if (r12 != 0) goto L_0x0053
            if (r9 != 0) goto L_0x0044
            r9 = r11
            goto L_0x0058
        L_0x0044:
            java.lang.String r0 = r9.getName()
            java.lang.String r1 = r11.getName()
            java.lang.String r2 = "msg.only.one.super"
            org.mozilla.javascript.EcmaError r0 = o.LogItem.setMin((java.lang.String) r2, (java.lang.Object) r0, (java.lang.Object) r1)
            throw r0
        L_0x0053:
            int r12 = r10 + 1
            r6[r10] = r11
            r10 = r12
        L_0x0058:
            int r8 = r8 + 1
            goto L_0x0030
        L_0x005b:
            if (r9 != 0) goto L_0x005f
            java.lang.Class<?> r9 = o.LogItem.equals
        L_0x005f:
            java.lang.Class[] r8 = new java.lang.Class[r10]
            java.lang.System.arraycopy(r6, r4, r8, r4, r10)
            r6 = r2[r5]
            o.LogUtils r6 = org.mozilla.javascript.ScriptableObject.ensureScriptable(r6)
            o.SecureQwertyKeyboard r10 = o.SecureQwertyKeyboard.get(r17)
            java.util.Map r11 = r10.getInterfaceAdapterCacheMap()
            java.lang.Object[] r12 = org.mozilla.javascript.ScriptableObject.getPropertyIds(r6)
            o.SimplePassword$TextWatcherImpl r13 = new o.SimplePassword$TextWatcherImpl
            int r14 = r12.length
            r13.<init>(r14)
            r14 = 0
        L_0x007d:
            int r15 = r12.length
            if (r14 == r15) goto L_0x00a8
            r15 = r12[r14]
            boolean r15 = r15 instanceof java.lang.String
            if (r15 == 0) goto L_0x00a4
            r15 = r12[r14]
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r4 = org.mozilla.javascript.ScriptableObject.getProperty((o.LogUtils) r6, (java.lang.String) r15)
            boolean r7 = r4 instanceof o.doCheck
            if (r7 == 0) goto L_0x00a4
            o.doCheck r4 = (o.doCheck) r4
            java.lang.String r7 = "length"
            java.lang.Object r4 = org.mozilla.javascript.ScriptableObject.getProperty((o.LogUtils) r4, (java.lang.String) r7)
            int r4 = o.LogItem.toFloatRange((java.lang.Object) r4)
            if (r4 >= 0) goto L_0x00a1
            r4 = 0
        L_0x00a1:
            r13.put(r15, r4)
        L_0x00a4:
            int r14 = r14 + 1
            r4 = 0
            goto L_0x007d
        L_0x00a8:
            o.getStringId$length r4 = new o.getStringId$length
            r4.<init>(r9, r8, r13)
            java.lang.Object r7 = r11.get(r4)
            java.lang.Class r7 = (java.lang.Class) r7
            if (r7 != 0) goto L_0x011a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r12 = "adapter"
            r7.<init>(r12)
            int r12 = r10.newClassSerialNumber()
            r7.append(r12)
            java.lang.String r7 = r7.toString()
            byte[] r8 = setMax(r13, r7, r9, r8)
            java.lang.Class r9 = o.LogPrinterProxy.getMax()
            java.lang.Class<java.security.CodeSource> r12 = java.security.CodeSource.class
            if (r9 == r12) goto L_0x00db
            java.lang.Class<java.security.ProtectionDomain> r12 = java.security.ProtectionDomain.class
            if (r9 != r12) goto L_0x00d8
            goto L_0x00db
        L_0x00d8:
            r9 = 0
            r12 = 0
            goto L_0x0106
        L_0x00db:
            java.lang.SecurityManager r12 = java.lang.System.getSecurityManager()
            boolean r13 = r12 instanceof o.LogItem.TemplateInfo
            if (r13 == 0) goto L_0x00ef
            o.LogMessage$1 r13 = new o.LogMessage$1
            r13.<init>(r12)
            java.lang.Object r12 = java.security.AccessController.doPrivileged(r13)
            java.security.ProtectionDomain r12 = (java.security.ProtectionDomain) r12
            goto L_0x00f0
        L_0x00ef:
            r12 = 0
        L_0x00f0:
            if (r12 != 0) goto L_0x00f8
            java.lang.Class<o.getStringId> r12 = o.getStringId.class
            java.security.ProtectionDomain r12 = r12.getProtectionDomain()
        L_0x00f8:
            java.lang.Class<java.security.CodeSource> r13 = java.security.CodeSource.class
            if (r9 != r13) goto L_0x0105
            if (r12 != 0) goto L_0x0100
            r12 = 0
            goto L_0x0105
        L_0x0100:
            java.security.CodeSource r9 = r12.getCodeSource()
            r12 = r9
        L_0x0105:
            r9 = 0
        L_0x0106:
            o.traceInfo r9 = o.LogPrinterProxy.setMin(r9, r12)
            java.lang.Class r7 = r9.setMin(r7, r8)
            r9.length(r7)
            boolean r8 = r10.isCachingEnabled()
            if (r8 == 0) goto L_0x011a
            r11.put(r4, r7)
        L_0x011a:
            int r3 = r3 - r5
            r4 = 1
            int r3 = r3 - r4
            r8 = 2
            if (r3 <= 0) goto L_0x0156
            int r9 = r3 + 2
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0196 }
            r10 = 0
            r9[r10] = r6     // Catch:{ Exception -> 0x0196 }
            o.SecureTextView$SendAccessiBilityEventListener r6 = r0.getMax     // Catch:{ Exception -> 0x0196 }
            r9[r4] = r6     // Catch:{ Exception -> 0x0196 }
            int r5 = r5 + r4
            java.lang.System.arraycopy(r2, r5, r9, r8, r3)     // Catch:{ Exception -> 0x0196 }
            o.initPwdInputView r3 = new o.initPwdInputView     // Catch:{ Exception -> 0x0196 }
            r3.<init>(r1, r7, r4)     // Catch:{ Exception -> 0x0196 }
            o.getDrawableId r3 = r3.members     // Catch:{ Exception -> 0x0196 }
            o.setBizId r3 = r3.setMin     // Catch:{ Exception -> 0x0196 }
            int r0 = r3.findCachedFunction(r0, r9)     // Catch:{ Exception -> 0x0196 }
            if (r0 < 0) goto L_0x0147
            o.getStyleableIds[] r2 = r3.methods     // Catch:{ Exception -> 0x0196 }
            r0 = r2[r0]     // Catch:{ Exception -> 0x0196 }
            java.lang.Object r0 = o.initPwdInputView.constructInternal(r9, r0)     // Catch:{ Exception -> 0x0196 }
            goto L_0x0171
        L_0x0147:
            java.lang.String r0 = o.setBizId.scriptSignature(r18)     // Catch:{ Exception -> 0x0196 }
            java.lang.String r1 = "msg.no.java.ctor"
            java.lang.String r2 = r7.getName()     // Catch:{ Exception -> 0x0196 }
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMin((java.lang.String) r1, (java.lang.Object) r2, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0196 }
            throw r0     // Catch:{ Exception -> 0x0196 }
        L_0x0156:
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x0196 }
            java.lang.Class<o.LogUtils> r3 = o.LogItem.valueOf     // Catch:{ Exception -> 0x0196 }
            r5 = 0
            r2[r5] = r3     // Catch:{ Exception -> 0x0196 }
            java.lang.Class<?> r3 = o.LogItem.toDoubleRange     // Catch:{ Exception -> 0x0196 }
            r2[r4] = r3     // Catch:{ Exception -> 0x0196 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x0196 }
            r3[r5] = r6     // Catch:{ Exception -> 0x0196 }
            o.SecureTextView$SendAccessiBilityEventListener r0 = r0.getMax     // Catch:{ Exception -> 0x0196 }
            r3[r4] = r0     // Catch:{ Exception -> 0x0196 }
            java.lang.reflect.Constructor r0 = r7.getConstructor(r2)     // Catch:{ Exception -> 0x0196 }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ Exception -> 0x0196 }
        L_0x0171:
            java.lang.String r2 = "self"
            java.lang.reflect.Field r2 = r7.getDeclaredField(r2)     // Catch:{ Exception -> 0x0196 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x0196 }
            boolean r2 = r0 instanceof o.UniResultF2fpayOrderInfo     // Catch:{ Exception -> 0x0196 }
            if (r2 == 0) goto L_0x0195
            r2 = r0
            o.UniResultF2fpayOrderInfo r2 = (o.UniResultF2fpayOrderInfo) r2     // Catch:{ Exception -> 0x0196 }
            java.lang.Object r2 = r2.unwrap()     // Catch:{ Exception -> 0x0196 }
            boolean r3 = r2 instanceof o.LogUtils     // Catch:{ Exception -> 0x0196 }
            if (r3 == 0) goto L_0x0195
            boolean r0 = r2 instanceof org.mozilla.javascript.ScriptableObject     // Catch:{ Exception -> 0x0196 }
            if (r0 == 0) goto L_0x0194
            r0 = r2
            org.mozilla.javascript.ScriptableObject r0 = (org.mozilla.javascript.ScriptableObject) r0     // Catch:{ Exception -> 0x0196 }
            o.LogItem.length((org.mozilla.javascript.ScriptableObject) r0, (o.LogUtils) r1)     // Catch:{ Exception -> 0x0196 }
        L_0x0194:
            return r2
        L_0x0195:
            return r0
        L_0x0196:
            r0 = move-exception
            java.lang.RuntimeException r0 = o.SecureQwertyKeyboard.AnonymousClass1.getMax((java.lang.Throwable) r0)
            throw r0
        L_0x019c:
            java.lang.String r0 = "msg.adapter.zero.args"
            org.mozilla.javascript.EcmaError r0 = o.LogItem.toFloatRange((java.lang.String) r0)
            goto L_0x01a4
        L_0x01a3:
            throw r0
        L_0x01a4:
            goto L_0x01a3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStringId.getMax(o.SecureQwertyKeyboard$1, o.LogUtils, java.lang.Object[]):java.lang.Object");
    }

    private static byte[] setMax(SimplePassword.TextWatcherImpl textWatcherImpl, String str, Class<?> cls, Class<?>[] clsArr) {
        Method[] methodArr;
        int i;
        int i2;
        Constructor[] constructorArr;
        short s;
        int i3;
        SimplePassword.TextWatcherImpl textWatcherImpl2 = textWatcherImpl;
        String str2 = str;
        Class<?>[] clsArr2 = clsArr;
        ClassFileWriter classFileWriter = new ClassFileWriter(str2, cls.getName(), "<adapter>");
        classFileWriter.setMax("factory", "Lorg/mozilla/javascript/ContextFactory;", 17);
        classFileWriter.setMax("delegee", "Lorg/mozilla/javascript/Scriptable;", 17);
        classFileWriter.setMax("self", "Lorg/mozilla/javascript/Scriptable;", 17);
        int length2 = clsArr2.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (clsArr2[i4] != null) {
                classFileWriter.isInside.add(Short.valueOf(classFileWriter.getMax.length(clsArr2[i4].getName())));
            }
        }
        String replace = cls.getName().replace('.', '/');
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        int length3 = declaredConstructors.length;
        int i5 = 0;
        while (i5 < length3) {
            Constructor constructor = declaredConstructors[i5];
            int modifiers = constructor.getModifiers();
            if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                Class[] parameterTypes = constructor.getParameterTypes();
                constructorArr = declaredConstructors;
                if (parameterTypes.length == 0) {
                    classFileWriter.getMin("<init>", "(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;)V", 1);
                    classFileWriter.setMax(42);
                    classFileWriter.setMin(183, replace, "<init>", "()V");
                    i2 = length2;
                    i = length3;
                    i3 = 42;
                    s = 3;
                } else {
                    StringBuilder sb = new StringBuilder("(Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/ContextFactory;");
                    int length4 = sb.length();
                    i = length3;
                    int i6 = 0;
                    for (int length5 = parameterTypes.length; i6 < length5; length5 = length5) {
                        length(sb, parameterTypes[i6]);
                        i6++;
                    }
                    sb.append(")V");
                    classFileWriter.getMin("<init>", sb.toString(), 1);
                    classFileWriter.setMax(42);
                    i2 = length2;
                    s = 3;
                    int i7 = 0;
                    for (int length6 = parameterTypes.length; i7 < length6; length6 = length6) {
                        s = (short) (s + getMin(classFileWriter, (int) s, (Class<?>) parameterTypes[i7]));
                        i7++;
                    }
                    sb.delete(1, length4);
                    classFileWriter.setMin(183, replace, "<init>", sb.toString());
                    i3 = 42;
                }
                classFileWriter.setMax(i3);
                classFileWriter.setMax(43);
                classFileWriter.getMin(181, str2, "delegee", "Lorg/mozilla/javascript/Scriptable;");
                classFileWriter.setMax(i3);
                classFileWriter.setMax(44);
                classFileWriter.getMin(181, str2, "factory", "Lorg/mozilla/javascript/ContextFactory;");
                classFileWriter.setMax(i3);
                classFileWriter.setMax(43);
                classFileWriter.setMax(i3);
                classFileWriter.setMin(184, "org/mozilla/javascript/JavaAdapter", "createAdapterWrapper", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/Object;)Lorg/mozilla/javascript/Scriptable;");
                classFileWriter.getMin(181, str2, "self", "Lorg/mozilla/javascript/Scriptable;");
                classFileWriter.setMax(177);
                classFileWriter.setMin(s);
            } else {
                constructorArr = declaredConstructors;
                i2 = length2;
                i = length3;
            }
            i5++;
            SimplePassword.TextWatcherImpl textWatcherImpl3 = textWatcherImpl;
            Class<?>[] clsArr3 = clsArr;
            declaredConstructors = constructorArr;
            length2 = i2;
            length3 = i;
        }
        int i8 = length2;
        classFileWriter.getMin("<init>", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;)V", 1);
        classFileWriter.setMax(42);
        classFileWriter.setMin(183, replace, "<init>", "()V");
        classFileWriter.setMax(42);
        classFileWriter.setMax(43);
        classFileWriter.getMin(181, str2, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.setMax(42);
        classFileWriter.setMax(44);
        classFileWriter.getMin(181, str2, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.setMax(42);
        classFileWriter.setMax(45);
        classFileWriter.getMin(181, str2, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.setMax(177);
        classFileWriter.setMin(4);
        SimplePassword.TextWatcherImpl textWatcherImpl4 = new SimplePassword.TextWatcherImpl();
        SimplePassword.TextWatcherImpl textWatcherImpl5 = new SimplePassword.TextWatcherImpl();
        int i9 = 0;
        while (i9 < length2) {
            Method[] methods = clsArr[i9].getMethods();
            int i10 = 0;
            while (i10 < methods.length) {
                Method method = methods[i10];
                int modifiers2 = method.getModifiers();
                if (Modifier.isStatic(modifiers2) || Modifier.isFinal(modifiers2)) {
                    SimplePassword.TextWatcherImpl textWatcherImpl6 = textWatcherImpl;
                } else {
                    INotProguard iNotProguard = INotProguard.setMin;
                    String name = method.getName();
                    Class[] parameterTypes2 = method.getParameterTypes();
                    SimplePassword.TextWatcherImpl textWatcherImpl7 = textWatcherImpl;
                    if (!textWatcherImpl7.has(name)) {
                        try {
                            cls.getMethod(name, parameterTypes2);
                        } catch (NoSuchMethodException unused) {
                        }
                    } else {
                        Class<?> cls2 = cls;
                        StringBuilder sb2 = new StringBuilder();
                        getMax((Class<?>[]) parameterTypes2, method.getReturnType(), sb2);
                        String obj = sb2.toString();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(name);
                        sb3.append(obj);
                        String obj2 = sb3.toString();
                        if (!textWatcherImpl4.has(obj2)) {
                            SimplePassword.TextWatcherImpl textWatcherImpl8 = textWatcherImpl7;
                            length(classFileWriter, str, name, parameterTypes2, method.getReturnType(), true);
                            textWatcherImpl4.put(obj2, 0);
                            textWatcherImpl5.put(name, 0);
                        }
                    }
                    SimplePassword.TextWatcherImpl textWatcherImpl9 = textWatcherImpl7;
                }
                i10++;
                String str3 = str;
            }
            SimplePassword.TextWatcherImpl textWatcherImpl10 = textWatcherImpl;
            i9++;
            String str4 = str;
        }
        SimplePassword.TextWatcherImpl textWatcherImpl11 = textWatcherImpl;
        int i11 = 0;
        for (Method[] min = setMin(cls); i11 < min.length; min = methodArr) {
            Method method2 = min[i11];
            boolean isAbstract = Modifier.isAbstract(method2.getModifiers());
            String name2 = method2.getName();
            if (isAbstract || textWatcherImpl11.has(name2)) {
                Class[] parameterTypes3 = method2.getParameterTypes();
                StringBuilder sb4 = new StringBuilder();
                getMax((Class<?>[]) parameterTypes3, method2.getReturnType(), sb4);
                String obj3 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(name2);
                sb5.append(obj3);
                String obj4 = sb5.toString();
                if (!textWatcherImpl4.has(obj4)) {
                    methodArr = min;
                    String str5 = obj3;
                    Class[] clsArr4 = parameterTypes3;
                    length(classFileWriter, str, name2, parameterTypes3, method2.getReturnType(), true);
                    textWatcherImpl4.put(obj4, 0);
                    textWatcherImpl5.put(name2, 0);
                    if (!isAbstract) {
                        setMax(classFileWriter, replace, name2, str5, clsArr4, method2.getReturnType());
                        i11++;
                    }
                    i11++;
                }
            }
            methodArr = min;
            i11++;
        }
        SimplePassword.TextWatcherImpl.getMin getmin = new SimplePassword.TextWatcherImpl.getMin(textWatcherImpl11);
        getmin.setMin.initIterator(getmin);
        getmin.getMax();
        while (!getmin.getMin()) {
            Object obj5 = getmin.getMin[getmin.setMax];
            if (obj5 == ack.NULL_VALUE) {
                obj5 = null;
            }
            String str6 = (String) obj5;
            if (!textWatcherImpl5.has(str6)) {
                int i12 = getmin.getMax[getmin.setMax];
                Class[] clsArr5 = new Class[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    clsArr5[i13] = LogItem.equals;
                }
                length(classFileWriter, str, str6, clsArr5, LogItem.equals, false);
            }
            getmin.getMax();
        }
        return classFileWriter.setMax();
    }

    private static Method[] setMin(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            getMax(cls2, (ArrayList<Method>) arrayList, (HashSet<String>) hashSet);
        }
        for (Class<? super Object> cls3 = cls; cls3 != null; cls3 = cls3.getSuperclass()) {
            for (Class max : cls3.getInterfaces()) {
                getMax((Class<?>) max, (ArrayList<Method>) arrayList, (HashSet<String>) hashSet);
            }
        }
        return (Method[]) arrayList.toArray(new Method[arrayList.size()]);
    }

    private static void getMax(Class<?> cls, ArrayList<Method> arrayList, HashSet<String> hashSet) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(declaredMethods[i].getName());
            Method method = declaredMethods[i];
            Class[] parameterTypes = declaredMethods[i].getParameterTypes();
            StringBuilder sb2 = new StringBuilder();
            getMax((Class<?>[]) parameterTypes, method.getReturnType(), sb2);
            sb.append(sb2.toString());
            String obj = sb.toString();
            if (!hashSet.contains(obj)) {
                int modifiers = declaredMethods[i].getModifiers();
                if (!Modifier.isStatic(modifiers)) {
                    if (Modifier.isFinal(modifiers)) {
                        hashSet.add(obj);
                    } else if (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers)) {
                        arrayList.add(declaredMethods[i]);
                        hashSet.add(obj);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r3 != 's') goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void getMax(org.mozilla.classfile.ClassFileWriter r10, java.lang.Class<?>[] r11, int r12) {
        /*
            r10.setMin((int) r12)
            r12 = 189(0xbd, float:2.65E-43)
            java.lang.String r0 = "java/lang/Object"
            r10.length(r12, r0)
            r12 = 0
            r0 = 1
            r1 = 0
            r2 = 1
        L_0x000e:
            int r3 = r11.length
            if (r1 == r3) goto L_0x00b6
            r3 = 89
            r10.setMax((int) r3)
            r10.setMin((int) r1)
            r4 = r11[r1]
            boolean r5 = r4.isPrimitive()
            if (r5 != 0) goto L_0x0027
            r3 = 25
            r10.setMin(r3, r2)
            goto L_0x0056
        L_0x0027:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            java.lang.String r6 = "<init>"
            r7 = 183(0xb7, float:2.56E-43)
            r8 = 187(0xbb, float:2.62E-43)
            r9 = 21
            if (r4 != r5) goto L_0x0044
            java.lang.String r4 = "java/lang/Boolean"
            r10.length(r8, r4)
            r10.setMax((int) r3)
            r10.setMin(r9, r2)
            java.lang.String r3 = "(Z)V"
            r10.setMin(r7, r4, r6, r3)
            goto L_0x0056
        L_0x0044:
            java.lang.Class r5 = java.lang.Character.TYPE
            if (r4 != r5) goto L_0x0058
            r10.setMin(r9, r2)
            r3 = 184(0xb8, float:2.58E-43)
            java.lang.String r4 = "java/lang/String"
            java.lang.String r5 = "valueOf"
            java.lang.String r6 = "(C)Ljava/lang/String;"
            r10.setMin(r3, r4, r5, r6)
        L_0x0056:
            r8 = 1
            goto L_0x00ac
        L_0x0058:
            java.lang.String r5 = "java/lang/Double"
            r10.length(r8, r5)
            r10.setMax((int) r3)
            java.lang.String r3 = r4.getName()
            char r3 = r3.charAt(r12)
            r4 = 98
            r8 = 2
            if (r3 == r4) goto L_0x009e
            r4 = 100
            if (r3 == r4) goto L_0x0098
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto L_0x008d
            r4 = 105(0x69, float:1.47E-43)
            if (r3 == r4) goto L_0x009e
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L_0x0082
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L_0x009e
            goto L_0x00a6
        L_0x0082:
            r3 = 22
            r10.setMin(r3, r2)
            r3 = 138(0x8a, float:1.93E-43)
            r10.setMax((int) r3)
            goto L_0x00a7
        L_0x008d:
            r3 = 23
            r10.setMin(r3, r2)
            r3 = 141(0x8d, float:1.98E-43)
            r10.setMax((int) r3)
            goto L_0x00a6
        L_0x0098:
            r3 = 24
            r10.setMin(r3, r2)
            goto L_0x00a7
        L_0x009e:
            r10.setMin(r9, r2)
            r3 = 135(0x87, float:1.89E-43)
            r10.setMax((int) r3)
        L_0x00a6:
            r8 = 1
        L_0x00a7:
            java.lang.String r3 = "(D)V"
            r10.setMin(r7, r5, r6, r3)
        L_0x00ac:
            int r2 = r2 + r8
            r3 = 83
            r10.setMax((int) r3)
            int r1 = r1 + 1
            goto L_0x000e
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStringId.getMax(org.mozilla.classfile.ClassFileWriter, java.lang.Class[], int):void");
    }

    private static void getMin(ClassFileWriter classFileWriter, Class<?> cls, boolean z) {
        if (cls == Void.TYPE) {
            classFileWriter.setMax(87);
            classFileWriter.setMax(177);
        } else if (cls == Boolean.TYPE) {
            classFileWriter.setMin(184, "org/mozilla/javascript/Context", "toBoolean", "(Ljava/lang/Object;)Z");
            classFileWriter.setMax(172);
        } else if (cls == Character.TYPE) {
            classFileWriter.setMin(184, "org/mozilla/javascript/Context", "toString", "(Ljava/lang/Object;)Ljava/lang/String;");
            classFileWriter.setMax(3);
            classFileWriter.setMin(182, "java/lang/String", "charAt", "(I)C");
            classFileWriter.setMax(172);
        } else if (cls.isPrimitive()) {
            classFileWriter.setMin(184, "org/mozilla/javascript/Context", "toNumber", "(Ljava/lang/Object;)D");
            char charAt = cls.getName().charAt(0);
            if (charAt != 'b') {
                if (charAt == 'd') {
                    classFileWriter.setMax(175);
                    return;
                } else if (charAt == 'f') {
                    classFileWriter.setMax(144);
                    classFileWriter.setMax(174);
                    return;
                } else if (charAt != 'i') {
                    if (charAt == 'l') {
                        classFileWriter.setMax(143);
                        classFileWriter.setMax(173);
                        return;
                    } else if (charAt != 's') {
                        StringBuilder sb = new StringBuilder("Unexpected return type ");
                        sb.append(cls.toString());
                        throw new RuntimeException(sb.toString());
                    }
                }
            }
            classFileWriter.setMax(142);
            classFileWriter.setMax(172);
        } else {
            String name = cls.getName();
            if (z) {
                classFileWriter.setMax(name);
                classFileWriter.setMin(184, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
                classFileWriter.setMin(184, "org/mozilla/javascript/JavaAdapter", "convertResult", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;");
            }
            classFileWriter.length(PsExtractor.AUDIO_STREAM, name);
            classFileWriter.setMax(176);
        }
    }

    private static void length(ClassFileWriter classFileWriter, String str, String str2, Class<?>[] clsArr, Class<?> cls, boolean z) {
        StringBuilder sb = new StringBuilder();
        int max = getMax(clsArr, cls, sb);
        classFileWriter.getMin(str2, sb.toString(), 1);
        classFileWriter.setMax(42);
        classFileWriter.getMin(180, str, "factory", "Lorg/mozilla/javascript/ContextFactory;");
        classFileWriter.setMax(42);
        classFileWriter.getMin(180, str, "self", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.setMax(42);
        classFileWriter.getMin(180, str, "delegee", "Lorg/mozilla/javascript/Scriptable;");
        classFileWriter.getMin(str2);
        classFileWriter.setMin(184, "org/mozilla/javascript/JavaAdapter", "getFunction", "(Lorg/mozilla/javascript/Scriptable;Ljava/lang/String;)Lorg/mozilla/javascript/Function;");
        getMax(classFileWriter, clsArr, clsArr.length);
        if (clsArr.length <= 64) {
            long j = 0;
            for (int i = 0; i != clsArr.length; i++) {
                if (!clsArr[i].isPrimitive()) {
                    j |= (long) (1 << i);
                }
            }
            int i2 = (int) j;
            if (((long) i2) == j) {
                classFileWriter.setMin(i2);
                classFileWriter.setMax(133);
            } else {
                SecureMoneyKeyboard secureMoneyKeyboard = classFileWriter.getMax;
                secureMoneyKeyboard.setMin(9);
                byte[] bArr = secureMoneyKeyboard.equals;
                int i3 = secureMoneyKeyboard.getMin;
                secureMoneyKeyboard.getMin = i3 + 1;
                bArr[i3] = 5;
                byte[] bArr2 = secureMoneyKeyboard.equals;
                secureMoneyKeyboard.getMin = ClassFileWriter.getMax(i2, bArr2, ClassFileWriter.getMax((int) (j >>> 32), bArr2, secureMoneyKeyboard.getMin));
                int i4 = secureMoneyKeyboard.setMin;
                secureMoneyKeyboard.setMin += 2;
                secureMoneyKeyboard.getMax.put(i4, 5);
                classFileWriter.setMin(20, i4);
            }
            classFileWriter.setMin(184, "org/mozilla/javascript/JavaAdapter", "callMethod", "(Lorg/mozilla/javascript/ContextFactory;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Function;[Ljava/lang/Object;J)Ljava/lang/Object;");
            getMin(classFileWriter, cls, z);
            classFileWriter.setMin((short) max);
            return;
        }
        throw SecureQwertyKeyboard.AnonymousClass1.setMin("JavaAdapter can not subclass methods with more then 64 arguments.");
    }

    private static int getMin(ClassFileWriter classFileWriter, int i, Class<?> cls) {
        if (!cls.isPrimitive()) {
            classFileWriter.getMax(42, 25, i);
            return 1;
        }
        char charAt = cls.getName().charAt(0);
        if (charAt != 'f') {
            if (charAt != 'i') {
                if (charAt == 'l') {
                    classFileWriter.getMax(30, 22, i);
                    return 2;
                } else if (!(charAt == 's' || charAt == 'z')) {
                    switch (charAt) {
                        case 'b':
                        case 'c':
                            break;
                        case 'd':
                            classFileWriter.getMax(38, 24, i);
                            return 2;
                        default:
                            throw getStyleId.setMin();
                    }
                }
            }
            classFileWriter.getMax(26, 21, i);
            return 1;
        }
        classFileWriter.getMax(34, 23, i);
        return 1;
    }

    private static void setMax(ClassFileWriter classFileWriter, String str, String str2, String str3, Class<?>[] clsArr, Class<?> cls) {
        classFileWriter.getMin("super$".concat(String.valueOf(str2)), str3, 1);
        classFileWriter.setMin(25, 0);
        int i = 1;
        for (Class<?> min : clsArr) {
            i += getMin(classFileWriter, i, min);
        }
        classFileWriter.setMin(183, str, str2, str3);
        if (cls.equals(Void.TYPE)) {
            classFileWriter.setMax(177);
        } else if (cls.isPrimitive()) {
            char charAt = cls.getName().charAt(0);
            if (charAt != 'f') {
                if (charAt != 'i') {
                    if (charAt != 'l') {
                        if (!(charAt == 's' || charAt == 'z')) {
                            switch (charAt) {
                                case 'b':
                                case 'c':
                                    break;
                                case 'd':
                                    classFileWriter.setMax(175);
                                    break;
                            }
                        }
                    } else {
                        classFileWriter.setMax(173);
                    }
                }
                classFileWriter.setMax(172);
            } else {
                classFileWriter.setMax(174);
            }
        } else {
            classFileWriter.setMax(176);
        }
        classFileWriter.setMin((short) (i + 1));
    }

    private static int getMax(Class<?>[] clsArr, Class<?> cls, StringBuilder sb) {
        sb.append('(');
        int length2 = clsArr.length + 1;
        for (Class<?> cls2 : clsArr) {
            length(sb, cls2);
            if (cls2 == Long.TYPE || cls2 == Double.TYPE) {
                length2++;
            }
        }
        sb.append(')');
        length(sb, cls);
        return length2;
    }

    private static StringBuilder length(StringBuilder sb, Class<?> cls) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                c = 'Z';
            } else if (cls == Long.TYPE) {
                c = 'J';
            } else {
                c = Character.toUpperCase(cls.getName().charAt(0));
            }
            sb.append(c);
        } else {
            sb.append('L');
            sb.append(cls.getName().replace('.', '/'));
            sb.append(';');
        }
        return sb;
    }
}

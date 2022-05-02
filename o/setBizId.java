package o;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.LogItem;
import o.SafeInputWidget;
import o.SecureQwertyKeyboard;

public class setBizId extends onInit {
    private static final int PREFERENCE_AMBIGUOUS = 3;
    private static final int PREFERENCE_EQUAL = 0;
    private static final int PREFERENCE_FIRST_ARG = 1;
    private static final int PREFERENCE_SECOND_ARG = 2;
    private static final boolean debug = false;
    static final long serialVersionUID = -3440381785576412928L;
    private String functionName;
    getStyleableIds[] methods;
    private transient CopyOnWriteArrayList<LogItem.TracerType> overloadCache;

    private static void printDebug(String str, getStyleableIds getstyleableids, Object[] objArr) {
    }

    setBizId(getStyleableIds[] getstyleableidsArr) {
        this.functionName = getstyleableidsArr[0].getName();
        this.methods = getstyleableidsArr;
    }

    setBizId(getStyleableIds[] getstyleableidsArr, String str) {
        this.functionName = str;
        this.methods = getstyleableidsArr;
    }

    setBizId(getStyleableIds getstyleableids, String str) {
        this.functionName = str;
        this.methods = new getStyleableIds[]{getstyleableids};
    }

    public setBizId(Method method, String str) {
        this(new getStyleableIds(method), str);
    }

    public String getFunctionName() {
        return this.functionName;
    }

    static String scriptSignature(Object[] objArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i != objArr.length; i++) {
            UniResultF2fpayOrderInfo uniResultF2fpayOrderInfo = objArr[i];
            if (uniResultF2fpayOrderInfo == null) {
                str = "null";
            } else if (uniResultF2fpayOrderInfo instanceof Boolean) {
                str = "boolean";
            } else if (uniResultF2fpayOrderInfo instanceof String) {
                str = "string";
            } else if (uniResultF2fpayOrderInfo instanceof Number) {
                str = "number";
            } else if (!(uniResultF2fpayOrderInfo instanceof LogUtils)) {
                str = getDrawableId.getMin(uniResultF2fpayOrderInfo.getClass());
            } else if (uniResultF2fpayOrderInfo instanceof checkOpen) {
                str = "undefined";
            } else if (uniResultF2fpayOrderInfo instanceof UniResultF2fpayOrderInfo) {
                str = uniResultF2fpayOrderInfo.unwrap().getClass().getName();
            } else {
                str = uniResultF2fpayOrderInfo instanceof doCheck ? "function" : "object";
            }
            if (i != 0) {
                sb.append(',');
            }
            sb.append(str);
        }
        return sb.toString();
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
            sb.append("() {");
        }
        sb.append("/*\n");
        sb.append(toString());
        sb.append(z ? "*/\n" : "*/}\n");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.methods.length;
        for (int i = 0; i != length; i++) {
            if (this.methods[i].isMethod()) {
                Method method = this.methods[i].method();
                sb.append(getDrawableId.getMin(method.getReturnType()));
                sb.append(' ');
                sb.append(method.getName());
            } else {
                sb.append(this.methods[i].getName());
            }
            sb.append(getDrawableId.getMin(this.methods[i].argTypes));
            sb.append(10);
        }
        return sb.toString();
    }

    public Object call(SecureQwertyKeyboard.AnonymousClass1 r8, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        Object[] objArr2;
        Object obj;
        Object obj2;
        if (this.methods.length != 0) {
            int findCachedFunction = findCachedFunction(r8, objArr);
            int i = 0;
            if (findCachedFunction >= 0) {
                getStyleableIds getstyleableids = this.methods[findCachedFunction];
                Class<?>[] clsArr = getstyleableids.argTypes;
                if (getstyleableids.vararg) {
                    objArr2 = new Object[clsArr.length];
                    for (int i2 = 0; i2 < clsArr.length - 1; i2++) {
                        objArr2[i2] = SecureQwertyKeyboard.AnonymousClass1.length(objArr[i2], clsArr[i2]);
                    }
                    if (objArr.length != clsArr.length || (objArr[objArr.length - 1] != null && !(objArr[objArr.length - 1] instanceof getResourceDeclareStyleableIntArray) && !(objArr[objArr.length - 1] instanceof SafeInputWidget.AnonymousClass1))) {
                        Class<?> componentType = clsArr[clsArr.length - 1].getComponentType();
                        Object newInstance = Array.newInstance(componentType, (objArr.length - clsArr.length) + 1);
                        while (i < Array.getLength(newInstance)) {
                            Array.set(newInstance, i, SecureQwertyKeyboard.AnonymousClass1.length(objArr[(clsArr.length - 1) + i], componentType));
                            i++;
                        }
                        obj2 = newInstance;
                    } else {
                        obj2 = SecureQwertyKeyboard.AnonymousClass1.length(objArr[objArr.length - 1], clsArr[clsArr.length - 1]);
                    }
                    objArr2[clsArr.length - 1] = obj2;
                } else {
                    objArr2 = objArr;
                    while (i < objArr2.length) {
                        Object obj3 = objArr2[i];
                        Object length = SecureQwertyKeyboard.AnonymousClass1.length(obj3, clsArr[i]);
                        if (length != obj3) {
                            if (objArr == objArr2) {
                                objArr2 = (Object[]) objArr2.clone();
                            }
                            objArr2[i] = length;
                        }
                        i++;
                    }
                }
                if (getstyleableids.isStatic()) {
                    obj = null;
                } else {
                    Class<?> declaringClass = getstyleableids.getDeclaringClass();
                    for (LogUtils logUtils3 = logUtils2; logUtils3 != null; logUtils3 = logUtils3.getPrototype()) {
                        if (logUtils3 instanceof UniResultF2fpayOrderInfo) {
                            Object unwrap = ((UniResultF2fpayOrderInfo) logUtils3).unwrap();
                            if (declaringClass.isInstance(unwrap)) {
                                obj = unwrap;
                            }
                        }
                    }
                    throw SecureQwertyKeyboard.AnonymousClass1.setMax("msg.nonjava.method", getFunctionName(), LogItem.getMin((Object) logUtils2), declaringClass.getName());
                }
                Object invoke = getstyleableids.invoke(obj, objArr2);
                Class<?> returnType = getstyleableids.method().getReturnType();
                if (r8.Grayscale$Algorithm == null) {
                    r8.Grayscale$Algorithm = new MoneyView();
                }
                Object max = r8.Grayscale$Algorithm.getMax(logUtils, invoke, returnType);
                if (max == null && returnType == Void.TYPE) {
                    return checkOpen.instance;
                }
                return max;
            }
            Class<?> declaringClass2 = this.methods[0].method().getDeclaringClass();
            StringBuilder sb = new StringBuilder();
            sb.append(declaringClass2.getName());
            sb.append('.');
            sb.append(getFunctionName());
            sb.append('(');
            sb.append(scriptSignature(objArr));
            sb.append(')');
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("msg.java.no_such_method", (Object) sb.toString());
        }
        throw new RuntimeException("No methods defined for call");
    }

    /* access modifiers changed from: package-private */
    public int findCachedFunction(SecureQwertyKeyboard.AnonymousClass1 r4, Object[] objArr) {
        getStyleableIds[] getstyleableidsArr = this.methods;
        if (getstyleableidsArr.length <= 1) {
            return findFunction(r4, getstyleableidsArr, objArr);
        }
        CopyOnWriteArrayList<LogItem.TracerType> copyOnWriteArrayList = this.overloadCache;
        if (copyOnWriteArrayList != null) {
            Iterator<LogItem.TracerType> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                LogItem.TracerType next = it.next();
                if (next.setMin(objArr)) {
                    return next.getMax;
                }
            }
        } else {
            this.overloadCache = new CopyOnWriteArrayList<>();
        }
        int findFunction = findFunction(r4, this.methods, objArr);
        if (this.overloadCache.size() < this.methods.length * 2) {
            synchronized (this.overloadCache) {
                LogItem.TracerType tracerType = new LogItem.TracerType(objArr, findFunction);
                if (!this.overloadCache.contains(tracerType)) {
                    this.overloadCache.add(0, tracerType);
                }
            }
        }
        return findFunction;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0098, code lost:
        if ((r14.member().getModifiers() & r5) == 0) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        r3 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e1, code lost:
        if (r13 != r3) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00e3, code lost:
        r7 = r6;
        r5 = 1;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e7, code lost:
        if (r12 == r3) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00e9, code lost:
        if (r2 != null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00eb, code lost:
        r5 = 1;
        r2 = new int[(r0.length - 1)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00f1, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f2, code lost:
        r2[r8] = r6;
        r8 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int findFunction(o.SecureQwertyKeyboard.AnonymousClass1 r17, o.getStyleableIds[] r18, java.lang.Object[] r19) {
        /*
            r0 = r18
            r1 = r19
            int r2 = r0.length
            r3 = -1
            if (r2 != 0) goto L_0x0009
            return r3
        L_0x0009:
            int r2 = r0.length
            r4 = 0
            r5 = 1
            if (r2 != r5) goto L_0x0033
            r0 = r0[r4]
            java.lang.Class<?>[] r2 = r0.argTypes
            int r5 = r2.length
            boolean r0 = r0.vararg
            if (r0 == 0) goto L_0x001d
            int r5 = r5 + -1
            int r0 = r1.length
            if (r5 <= r0) goto L_0x0021
            return r3
        L_0x001d:
            int r0 = r1.length
            if (r5 == r0) goto L_0x0021
            return r3
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == r5) goto L_0x0032
            r6 = r1[r0]
            r7 = r2[r0]
            boolean r6 = o.SimplePassword.canConvert(r6, r7)
            if (r6 != 0) goto L_0x002f
            return r3
        L_0x002f:
            int r0 = r0 + 1
            goto L_0x0022
        L_0x0032:
            return r4
        L_0x0033:
            r2 = 0
            r6 = 0
            r7 = -1
            r8 = 0
        L_0x0037:
            int r9 = r0.length
            if (r6 >= r9) goto L_0x00fe
            r9 = r0[r6]
            java.lang.Class<?>[] r10 = r9.argTypes
            int r11 = r10.length
            boolean r12 = r9.vararg
            if (r12 == 0) goto L_0x004a
            int r11 = r11 + -1
            int r12 = r1.length
            if (r11 <= r12) goto L_0x004d
            goto L_0x00f6
        L_0x004a:
            int r12 = r1.length
            if (r11 != r12) goto L_0x00f6
        L_0x004d:
            r12 = 0
        L_0x004e:
            if (r12 >= r11) goto L_0x005d
            r13 = r1[r12]
            r14 = r10[r12]
            boolean r13 = o.SimplePassword.canConvert(r13, r14)
            if (r13 == 0) goto L_0x00f6
            int r12 = r12 + 1
            goto L_0x004e
        L_0x005d:
            if (r7 >= 0) goto L_0x0063
            r4 = r17
            goto L_0x00d7
        L_0x0063:
            r11 = -1
            r12 = 0
            r13 = 0
        L_0x0066:
            if (r11 == r8) goto L_0x00dd
            if (r11 != r3) goto L_0x006c
            r14 = r7
            goto L_0x006e
        L_0x006c:
            r14 = r2[r11]
        L_0x006e:
            r14 = r0[r14]
            r15 = 13
            r4 = r17
            boolean r15 = r4.getMax((int) r15)
            if (r15 == 0) goto L_0x009e
            java.lang.reflect.Member r15 = r14.member()
            int r15 = r15.getModifiers()
            r15 = r15 & r5
            java.lang.reflect.Member r16 = r9.member()
            int r16 = r16.getModifiers()
            r3 = r16 & 1
            if (r15 == r3) goto L_0x009e
            java.lang.reflect.Member r3 = r14.member()
            int r3 = r3.getModifiers()
            r3 = r3 & r5
            if (r3 != 0) goto L_0x009b
            goto L_0x00ae
        L_0x009b:
            int r12 = r12 + 1
            goto L_0x00b5
        L_0x009e:
            boolean r3 = r9.vararg
            java.lang.Class<?>[] r15 = r14.argTypes
            boolean r5 = r14.vararg
            int r3 = preferSignature(r1, r10, r3, r15, r5)
            r5 = 3
            if (r3 == r5) goto L_0x00df
            r5 = 1
            if (r3 != r5) goto L_0x00b1
        L_0x00ae:
            int r13 = r13 + 1
            goto L_0x00b5
        L_0x00b1:
            r5 = 2
            if (r3 != r5) goto L_0x00bb
            goto L_0x009b
        L_0x00b5:
            int r11 = r11 + 1
            r3 = -1
            r4 = 0
            r5 = 1
            goto L_0x0066
        L_0x00bb:
            if (r3 == 0) goto L_0x00c0
            o.getStyleId.setMin()
        L_0x00c0:
            boolean r3 = r14.isStatic()
            if (r3 == 0) goto L_0x00d8
            java.lang.Class r3 = r14.getDeclaringClass()
            java.lang.Class r5 = r9.getDeclaringClass()
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L_0x00d8
            r3 = -1
            if (r11 != r3) goto L_0x00da
        L_0x00d7:
            r7 = r6
        L_0x00d8:
            r5 = 1
            goto L_0x00f8
        L_0x00da:
            r2[r11] = r6
            goto L_0x00d8
        L_0x00dd:
            r4 = r17
        L_0x00df:
            int r3 = r8 + 1
            if (r13 != r3) goto L_0x00e7
            r7 = r6
            r5 = 1
            r8 = 0
            goto L_0x00f8
        L_0x00e7:
            if (r12 == r3) goto L_0x00d8
            if (r2 != 0) goto L_0x00f1
            int r2 = r0.length
            r5 = 1
            int r2 = r2 - r5
            int[] r2 = new int[r2]
            goto L_0x00f2
        L_0x00f1:
            r5 = 1
        L_0x00f2:
            r2[r8] = r6
            r8 = r3
            goto L_0x00f8
        L_0x00f6:
            r4 = r17
        L_0x00f8:
            int r6 = r6 + 1
            r3 = -1
            r4 = 0
            goto L_0x0037
        L_0x00fe:
            if (r7 >= 0) goto L_0x0102
            r3 = -1
            return r3
        L_0x0102:
            r3 = -1
            if (r8 != 0) goto L_0x0106
            return r7
        L_0x0106:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = -1
        L_0x010c:
            if (r5 == r8) goto L_0x0125
            if (r5 != r3) goto L_0x0112
            r6 = r7
            goto L_0x0114
        L_0x0112:
            r6 = r2[r5]
        L_0x0114:
            java.lang.String r9 = "\n    "
            r4.append(r9)
            r6 = r0[r6]
            java.lang.String r6 = r6.toJavaDeclaration()
            r4.append(r6)
            int r5 = r5 + 1
            goto L_0x010c
        L_0x0125:
            r2 = r0[r7]
            java.lang.String r3 = r2.getName()
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            r5 = 0
            r0 = r0[r5]
            boolean r0 = r0.isCtor()
            if (r0 == 0) goto L_0x014b
            java.lang.String r0 = scriptSignature(r19)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "msg.constructor.ambiguous"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.setMax(r2, r3, r0, r1)
            throw r0
        L_0x014b:
            java.lang.String r0 = scriptSignature(r19)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "msg.method.ambiguous"
            org.mozilla.javascript.EvaluatorException r0 = o.SecureQwertyKeyboard.AnonymousClass1.setMax(r4, r2, r3, r0, r1)
            goto L_0x015b
        L_0x015a:
            throw r0
        L_0x015b:
            goto L_0x015a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBizId.findFunction(o.SecureQwertyKeyboard$1, o.getStyleableIds[], java.lang.Object[]):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        if (r4.isAssignableFrom(r3) != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int preferSignature(java.lang.Object[] r9, java.lang.Class<?>[] r10, boolean r11, java.lang.Class<?>[] r12, boolean r13) {
        /*
            r0 = 0
            r1 = 0
        L_0x0002:
            int r2 = r9.length
            if (r0 >= r2) goto L_0x004a
            r2 = 1
            if (r11 == 0) goto L_0x0010
            int r3 = r10.length
            if (r0 < r3) goto L_0x0010
            int r3 = r10.length
            int r3 = r3 - r2
            r3 = r10[r3]
            goto L_0x0012
        L_0x0010:
            r3 = r10[r0]
        L_0x0012:
            if (r13 == 0) goto L_0x001c
            int r4 = r12.length
            if (r0 < r4) goto L_0x001c
            int r4 = r12.length
            int r4 = r4 - r2
            r4 = r12[r4]
            goto L_0x001e
        L_0x001c:
            r4 = r12[r0]
        L_0x001e:
            if (r3 == r4) goto L_0x0047
            r5 = r9[r0]
            int r6 = o.SimplePassword.getConversionWeight(r5, r3)
            int r5 = o.SimplePassword.getConversionWeight(r5, r4)
            r7 = 2
            r8 = 3
            if (r6 >= r5) goto L_0x002f
            goto L_0x0044
        L_0x002f:
            if (r6 <= r5) goto L_0x0033
        L_0x0031:
            r2 = 2
            goto L_0x0044
        L_0x0033:
            if (r6 != 0) goto L_0x0043
            boolean r5 = r3.isAssignableFrom(r4)
            if (r5 == 0) goto L_0x003c
            goto L_0x0031
        L_0x003c:
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = 3
        L_0x0044:
            r1 = r1 | r2
            if (r1 == r8) goto L_0x004a
        L_0x0047:
            int r0 = r0 + 1
            goto L_0x0002
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setBizId.preferSignature(java.lang.Object[], java.lang.Class[], boolean, java.lang.Class[], boolean):int");
    }
}

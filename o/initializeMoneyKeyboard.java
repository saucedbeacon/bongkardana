package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import org.greenrobot.eventbus.EventBusException;

class initializeMoneyKeyboard {
    private static final int BRIDGE = 64;
    private static final setMin[] FIND_STATE_POOL = new setMin[4];
    private static final Map<Class<?>, List<initializeNumKeyboard>> METHOD_CACHE = new ConcurrentHashMap();
    private static final int MODIFIERS_IGNORE = 5192;
    private static final int POOL_SIZE = 4;
    private static final int SYNTHETIC = 4096;
    private final boolean ignoreGeneratedIndex;
    private final boolean strictMethodVerification;
    private List<setStatisticInterface> subscriberInfoIndexes;

    initializeMoneyKeyboard(List<setStatisticInterface> list, boolean z, boolean z2) {
        this.subscriberInfoIndexes = list;
        this.strictMethodVerification = z;
        this.ignoreGeneratedIndex = z2;
    }

    /* access modifiers changed from: package-private */
    public List<initializeNumKeyboard> findSubscriberMethods(Class<?> cls) {
        List<initializeNumKeyboard> list;
        List<initializeNumKeyboard> list2 = METHOD_CACHE.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.ignoreGeneratedIndex) {
            list = findUsingReflection(cls);
        } else {
            list = findUsingInfo(cls);
        }
        if (!list.isEmpty()) {
            METHOD_CACHE.put(cls, list);
            return list;
        }
        StringBuilder sb = new StringBuilder("Subscriber ");
        sb.append(cls);
        sb.append(" and its super classes have no public methods with the @Subscribe annotation");
        throw new EventBusException(sb.toString());
    }

    private List<initializeNumKeyboard> findUsingInfo(Class<?> cls) {
        setMin prepareFindState = prepareFindState();
        prepareFindState.initForSubscriber(cls);
        while (prepareFindState.clazz != null) {
            prepareFindState.subscriberInfo = getSubscriberInfo(prepareFindState);
            if (prepareFindState.subscriberInfo != null) {
                for (initializeNumKeyboard initializenumkeyboard : prepareFindState.subscriberInfo.getSubscriberMethods()) {
                    if (prepareFindState.checkAdd(initializenumkeyboard.method, initializenumkeyboard.eventType)) {
                        prepareFindState.subscriberMethods.add(initializenumkeyboard);
                    }
                }
            } else {
                findUsingReflectionInSingleClass(prepareFindState);
            }
            prepareFindState.moveToSuperclass();
        }
        return getMethodsAndRelease(prepareFindState);
    }

    private List<initializeNumKeyboard> getMethodsAndRelease(setMin setmin) {
        ArrayList arrayList = new ArrayList(setmin.subscriberMethods);
        setmin.recycle();
        synchronized (FIND_STATE_POOL) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                } else if (FIND_STATE_POOL[i] == null) {
                    FIND_STATE_POOL[i] = setmin;
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    private setMin prepareFindState() {
        synchronized (FIND_STATE_POOL) {
            for (int i = 0; i < 4; i++) {
                setMin setmin = FIND_STATE_POOL[i];
                if (setmin != null) {
                    FIND_STATE_POOL[i] = null;
                    return setmin;
                }
            }
            return new setMin();
        }
    }

    private initializePhoneKeyboard getSubscriberInfo(setMin setmin) {
        if (!(setmin.subscriberInfo == null || setmin.subscriberInfo.getSuperSubscriberInfo() == null)) {
            initializePhoneKeyboard superSubscriberInfo = setmin.subscriberInfo.getSuperSubscriberInfo();
            if (setmin.clazz == superSubscriberInfo.getSubscriberClass()) {
                return superSubscriberInfo;
            }
        }
        List<setStatisticInterface> list = this.subscriberInfoIndexes;
        if (list == null) {
            return null;
        }
        for (setStatisticInterface subscriberInfo : list) {
            initializePhoneKeyboard subscriberInfo2 = subscriberInfo.getSubscriberInfo(setmin.clazz);
            if (subscriberInfo2 != null) {
                return subscriberInfo2;
            }
        }
        return null;
    }

    private List<initializeNumKeyboard> findUsingReflection(Class<?> cls) {
        setMin prepareFindState = prepareFindState();
        prepareFindState.initForSubscriber(cls);
        while (prepareFindState.clazz != null) {
            findUsingReflectionInSingleClass(prepareFindState);
            prepareFindState.moveToSuperclass();
        }
        return getMethodsAndRelease(prepareFindState);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ec, code lost:
        r1 = new java.lang.StringBuilder("Could not inspect methods of ");
        r1.append(r15.clazz.getName());
        r15 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0102, code lost:
        if (r14.ignoreGeneratedIndex != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r15);
        r1.append(". Please consider using EventBus annotation processor to avoid reflection.");
        r15 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0116, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r15);
        r1.append(". Please make this class visible to EventBus annotation processor to avoid reflection.");
        r15 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012d, code lost:
        throw new org.greenrobot.eventbus.EventBusException(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = r15.clazz.getMethods();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r15.skipSuperClasses = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void findUsingReflectionInSingleClass(o.initializeMoneyKeyboard.setMin r15) {
        /*
            r14 = this;
            r0 = 1
            java.lang.Class<?> r1 = r15.clazz     // Catch:{ all -> 0x0008 }
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch:{ all -> 0x0008 }
            goto L_0x0010
        L_0x0008:
            java.lang.Class<?> r1 = r15.clazz     // Catch:{ LinkageError -> 0x00eb }
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch:{ LinkageError -> 0x00eb }
            r15.skipSuperClasses = r0
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x0013:
            if (r4 >= r2) goto L_0x00ea
            r6 = r1[r4]
            int r5 = r6.getModifiers()
            r7 = r5 & 1
            java.lang.String r8 = "."
            if (r7 == 0) goto L_0x00a4
            r5 = r5 & 5192(0x1448, float:7.276E-42)
            if (r5 != 0) goto L_0x00a4
            java.lang.Class[] r5 = r6.getParameterTypes()
            int r7 = r5.length
            if (r7 != r0) goto L_0x005b
            java.lang.Class<org.greenrobot.eventbus.Subscribe> r7 = org.greenrobot.eventbus.Subscribe.class
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r7)
            org.greenrobot.eventbus.Subscribe r7 = (org.greenrobot.eventbus.Subscribe) r7
            if (r7 == 0) goto L_0x00e6
            r8 = r5[r3]
            boolean r5 = r15.checkAdd(r6, r8)
            if (r5 == 0) goto L_0x00e6
            org.greenrobot.eventbus.ThreadMode r9 = r7.threadMode()
            java.util.List<o.initializeNumKeyboard> r11 = r15.subscriberMethods
            o.initializeNumKeyboard r12 = new o.initializeNumKeyboard
            int r10 = r7.priority()
            boolean r13 = r7.sticky()
            r5 = r12
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r11.add(r12)
            goto L_0x00e6
        L_0x005b:
            boolean r7 = r14.strictMethodVerification
            if (r7 == 0) goto L_0x00e6
            java.lang.Class<org.greenrobot.eventbus.Subscribe> r7 = org.greenrobot.eventbus.Subscribe.class
            boolean r7 = r6.isAnnotationPresent(r7)
            if (r7 != 0) goto L_0x0069
            goto L_0x00e6
        L_0x0069:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            org.greenrobot.eventbus.EventBusException r0 = new org.greenrobot.eventbus.EventBusException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "@Subscribe method "
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r15 = "must have exactly 1 parameter but has "
            r1.append(r15)
            int r15 = r5.length
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>((java.lang.String) r15)
            throw r0
        L_0x00a4:
            boolean r5 = r14.strictMethodVerification
            if (r5 == 0) goto L_0x00e6
            java.lang.Class<org.greenrobot.eventbus.Subscribe> r5 = org.greenrobot.eventbus.Subscribe.class
            boolean r5 = r6.isAnnotationPresent(r5)
            if (r5 != 0) goto L_0x00b1
            goto L_0x00e6
        L_0x00b1:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            org.greenrobot.eventbus.EventBusException r0 = new org.greenrobot.eventbus.EventBusException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = " is a illegal @Subscribe method: must be public, non-static, and non-abstract"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>((java.lang.String) r15)
            throw r0
        L_0x00e6:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x00ea:
            return
        L_0x00eb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not inspect methods of "
            r1.<init>(r2)
            java.lang.Class<?> r15 = r15.clazz
            java.lang.String r15 = r15.getName()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            boolean r1 = r14.ignoreGeneratedIndex
            if (r1 == 0) goto L_0x0116
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please consider using EventBus annotation processor to avoid reflection."
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            goto L_0x0127
        L_0x0116:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please make this class visible to EventBus annotation processor to avoid reflection."
            r1.append(r15)
            java.lang.String r15 = r1.toString()
        L_0x0127:
            org.greenrobot.eventbus.EventBusException r1 = new org.greenrobot.eventbus.EventBusException
            r1.<init>(r15, r0)
            goto L_0x012e
        L_0x012d:
            throw r1
        L_0x012e:
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.initializeMoneyKeyboard.findUsingReflectionInSingleClass(o.initializeMoneyKeyboard$setMin):void");
    }

    static void clearCaches() {
        METHOD_CACHE.clear();
    }

    static class setMin {
        final Map<Class, Object> anyMethodByEventType = new HashMap();
        Class<?> clazz;
        final StringBuilder methodKeyBuilder = new StringBuilder(128);
        boolean skipSuperClasses;
        Class<?> subscriberClass;
        final Map<String, Class> subscriberClassByMethodKey = new HashMap();
        initializePhoneKeyboard subscriberInfo;
        final List<initializeNumKeyboard> subscriberMethods = new ArrayList();

        setMin() {
        }

        /* access modifiers changed from: package-private */
        public void initForSubscriber(Class<?> cls) {
            this.clazz = cls;
            this.subscriberClass = cls;
            this.skipSuperClasses = false;
            this.subscriberInfo = null;
        }

        /* access modifiers changed from: package-private */
        public void recycle() {
            this.subscriberMethods.clear();
            this.anyMethodByEventType.clear();
            this.subscriberClassByMethodKey.clear();
            this.methodKeyBuilder.setLength(0);
            this.subscriberClass = null;
            this.clazz = null;
            this.skipSuperClasses = false;
            this.subscriberInfo = null;
        }

        /* access modifiers changed from: package-private */
        public boolean checkAdd(Method method, Class<?> cls) {
            Object put = this.anyMethodByEventType.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (checkAddWithMethodSignature((Method) put, cls)) {
                    this.anyMethodByEventType.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return checkAddWithMethodSignature(method, cls);
        }

        private boolean checkAddWithMethodSignature(Method method, Class<?> cls) {
            this.methodKeyBuilder.setLength(0);
            this.methodKeyBuilder.append(method.getName());
            StringBuilder sb = this.methodKeyBuilder;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String obj = this.methodKeyBuilder.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.subscriberClassByMethodKey.put(obj, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.subscriberClassByMethodKey.put(obj, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        public void moveToSuperclass() {
            if (!this.skipSuperClasses) {
                Class<? super Object> superclass = this.clazz.getSuperclass();
                this.clazz = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.") && !name.startsWith("androidx.")) {
                    return;
                }
            }
            this.clazz = null;
        }
    }
}

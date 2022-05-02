package kotlin.reflect.jvm;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\",\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"value", "", "isAccessible", "Lkotlin/reflect/KCallable;", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "kotlin-reflection"}, k = 2, mv = {1, 4, 1})
@JvmName(name = "KCallablesJvm")
public final class KCallablesJvm {
    public static final boolean isAccessible(@NotNull KCallable<?> kCallable) {
        Caller<?> defaultCaller;
        Intrinsics.checkNotNullParameter(kCallable, "$this$isAccessible");
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field javaField = ReflectJvmMapping.getJavaField(kProperty);
            if (javaField != null ? javaField.isAccessible() : true) {
                Method javaGetter = ReflectJvmMapping.getJavaGetter(kProperty);
                if (javaGetter != null ? javaGetter.isAccessible() : true) {
                    Method javaSetter = ReflectJvmMapping.getJavaSetter((KMutableProperty) kCallable);
                    if (javaSetter != null ? javaSetter.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        } else if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field javaField2 = ReflectJvmMapping.getJavaField(kProperty2);
            if (javaField2 != null ? javaField2.isAccessible() : true) {
                Method javaGetter2 = ReflectJvmMapping.getJavaGetter(kProperty2);
                if (javaGetter2 != null ? javaGetter2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        } else if (kCallable instanceof KProperty.Getter) {
            Field javaField3 = ReflectJvmMapping.getJavaField(((KProperty.Getter) kCallable).getProperty());
            if (javaField3 != null ? javaField3.isAccessible() : true) {
                Method javaMethod = ReflectJvmMapping.getJavaMethod((KFunction) kCallable);
                if (javaMethod != null ? javaMethod.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        } else if (kCallable instanceof KMutableProperty.Setter) {
            Field javaField4 = ReflectJvmMapping.getJavaField(((KMutableProperty.Setter) kCallable).getProperty());
            if (javaField4 != null ? javaField4.isAccessible() : true) {
                Method javaMethod2 = ReflectJvmMapping.getJavaMethod((KFunction) kCallable);
                if (javaMethod2 != null ? javaMethod2.isAccessible() : true) {
                    return true;
                }
            }
            return false;
        } else if (kCallable instanceof KFunction) {
            KFunction kFunction = (KFunction) kCallable;
            Method javaMethod3 = ReflectJvmMapping.getJavaMethod(kFunction);
            if (javaMethod3 != null ? javaMethod3.isAccessible() : true) {
                KCallableImpl<?> asKCallableImpl = UtilKt.asKCallableImpl(kCallable);
                AccessibleObject accessibleObject = null;
                Object member = (asKCallableImpl == null || (defaultCaller = asKCallableImpl.getDefaultCaller()) == null) ? null : defaultCaller.getMember();
                if (member instanceof AccessibleObject) {
                    accessibleObject = member;
                }
                AccessibleObject accessibleObject2 = accessibleObject;
                if (accessibleObject2 != null ? accessibleObject2.isAccessible() : true) {
                    Constructor javaConstructor = ReflectJvmMapping.getJavaConstructor(kFunction);
                    if (javaConstructor != null ? javaConstructor.isAccessible() : true) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Unknown callable: ");
            sb.append(kCallable);
            sb.append(" (");
            sb.append(kCallable.getClass());
            sb.append(')');
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        r3 = r3.getDefaultCaller();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void setAccessible(@org.jetbrains.annotations.NotNull kotlin.reflect.KCallable<?> r3, boolean r4) {
        /*
            java.lang.String r0 = "$this$isAccessible"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof kotlin.reflect.KMutableProperty
            if (r0 == 0) goto L_0x002a
            r0 = r3
            kotlin.reflect.KProperty r0 = (kotlin.reflect.KProperty) r0
            java.lang.reflect.Field r1 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r1 == 0) goto L_0x0015
            r1.setAccessible(r4)
        L_0x0015:
            java.lang.reflect.Method r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(r0)
            if (r0 == 0) goto L_0x001e
            r0.setAccessible(r4)
        L_0x001e:
            kotlin.reflect.KMutableProperty r3 = (kotlin.reflect.KMutableProperty) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaSetter(r3)
            if (r3 == 0) goto L_0x0029
            r3.setAccessible(r4)
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r3 instanceof kotlin.reflect.KProperty
            if (r0 == 0) goto L_0x0043
            kotlin.reflect.KProperty r3 = (kotlin.reflect.KProperty) r3
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r3)
            if (r0 == 0) goto L_0x0039
            r0.setAccessible(r4)
        L_0x0039:
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaGetter(r3)
            if (r3 == 0) goto L_0x0042
            r3.setAccessible(r4)
        L_0x0042:
            return
        L_0x0043:
            boolean r0 = r3 instanceof kotlin.reflect.KProperty.Getter
            if (r0 == 0) goto L_0x0063
            r0 = r3
            kotlin.reflect.KProperty$Getter r0 = (kotlin.reflect.KProperty.Getter) r0
            kotlin.reflect.KProperty r0 = r0.getProperty()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r0 == 0) goto L_0x0057
            r0.setAccessible(r4)
        L_0x0057:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r3)
            if (r3 == 0) goto L_0x0062
            r3.setAccessible(r4)
        L_0x0062:
            return
        L_0x0063:
            boolean r0 = r3 instanceof kotlin.reflect.KMutableProperty.Setter
            if (r0 == 0) goto L_0x0083
            r0 = r3
            kotlin.reflect.KMutableProperty$Setter r0 = (kotlin.reflect.KMutableProperty.Setter) r0
            kotlin.reflect.KProperty r0 = r0.getProperty()
            java.lang.reflect.Field r0 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaField(r0)
            if (r0 == 0) goto L_0x0077
            r0.setAccessible(r4)
        L_0x0077:
            kotlin.reflect.KFunction r3 = (kotlin.reflect.KFunction) r3
            java.lang.reflect.Method r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r3)
            if (r3 == 0) goto L_0x0082
            r3.setAccessible(r4)
        L_0x0082:
            return
        L_0x0083:
            boolean r0 = r3 instanceof kotlin.reflect.KFunction
            if (r0 == 0) goto L_0x00be
            r0 = r3
            kotlin.reflect.KFunction r0 = (kotlin.reflect.KFunction) r0
            java.lang.reflect.Method r1 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaMethod(r0)
            if (r1 == 0) goto L_0x0093
            r1.setAccessible(r4)
        L_0x0093:
            kotlin.reflect.jvm.internal.KCallableImpl r3 = kotlin.reflect.jvm.internal.UtilKt.asKCallableImpl(r3)
            r1 = 0
            if (r3 == 0) goto L_0x00a5
            kotlin.reflect.jvm.internal.calls.Caller r3 = r3.getDefaultCaller()
            if (r3 == 0) goto L_0x00a5
            java.lang.reflect.Member r3 = r3.getMember()
            goto L_0x00a6
        L_0x00a5:
            r3 = r1
        L_0x00a6:
            boolean r2 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r2 != 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r1 = r3
        L_0x00ac:
            java.lang.reflect.AccessibleObject r1 = (java.lang.reflect.AccessibleObject) r1
            if (r1 == 0) goto L_0x00b4
            r3 = 1
            r1.setAccessible(r3)
        L_0x00b4:
            java.lang.reflect.Constructor r3 = kotlin.reflect.jvm.ReflectJvmMapping.getJavaConstructor(r0)
            if (r3 == 0) goto L_0x00bd
            r3.setAccessible(r4)
        L_0x00bd:
            return
        L_0x00be:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown callable: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.KCallablesJvm.setAccessible(kotlin.reflect.KCallable, boolean):void");
    }
}

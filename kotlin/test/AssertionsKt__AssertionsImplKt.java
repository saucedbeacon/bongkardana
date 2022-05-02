package kotlin.test;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0002\b\u0005\u001a5\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\f\u0010\r\u001a?\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\f\u0010\u000e\u001a@\u0010\u000f\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a4\u0010\u0013\u001a(\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015 \u0016*\u0014\u0012\u000e\b\u0001\u0012\n \u0016*\u0004\u0018\u00010\u00150\u0015\u0018\u00010\u00140\u0014H\b¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\b\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"assertFailsNoInline", "", "block", "Lkotlin/Function0;", "", "assertFails", "message", "", "assertFailsWithNoInline", "T", "exceptionClass", "Lkotlin/reflect/KClass;", "assertFailsWith", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Throwable;", "checkResultIsFailure", "blockResult", "Lkotlin/Result;", "(Lkotlin/reflect/KClass;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Throwable;", "currentStackTrace", "", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "()[Ljava/lang/StackTraceElement;", "todo", "kotlin-test"}, k = 5, mv = {1, 1, 15}, xs = "kotlin/test/AssertionsKt")
final /* synthetic */ class AssertionsKt__AssertionsImplKt {
    @NotNull
    @PublishedApi
    public static final <T extends Throwable> T checkResultIsFailure(@NotNull KClass<T> kClass, @Nullable String str, @NotNull Object obj) {
        Intrinsics.checkParameterIsNotNull(kClass, GriverMonitorConstants.KEY_EXCEPTION_CLASS);
        T r6 = Result.m4exceptionOrNullimpl(obj);
        if (r6 == null) {
            String messagePrefix = UtilsKt.messagePrefix(str);
            Asserter asserter = AssertionsKt.getAsserter();
            StringBuilder sb = new StringBuilder();
            sb.append(messagePrefix);
            sb.append("Expected an exception of ");
            sb.append(JvmClassMappingKt.getJavaClass(kClass));
            sb.append(" to be thrown, but was completed successfully.");
            asserter.fail(sb.toString());
            throw null;
        } else if (JvmClassMappingKt.getJavaClass(kClass).isInstance(r6)) {
            return r6;
        } else {
            Asserter asserter2 = AssertionsKt.getAsserter();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(UtilsKt.messagePrefix(str));
            sb2.append("Expected an exception of ");
            sb2.append(JvmClassMappingKt.getJavaClass(kClass));
            sb2.append(" to be thrown, but was ");
            sb2.append(r6);
            asserter2.fail(sb2.toString());
            throw null;
        }
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    @JvmName(name = "assertFails")
    public static final /* synthetic */ Throwable assertFails(@NotNull Function0<Unit> function0) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure((String) null, obj);
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    @JvmName(name = "assertFails")
    public static final /* synthetic */ Throwable assertFails(@Nullable String str, @NotNull Function0<Unit> function0) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(str, obj);
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    @JvmName(name = "assertFailsWith")
    public static final /* synthetic */ <T extends Throwable> T assertFailsWith(@NotNull KClass<T> kClass, @NotNull Function0<Unit> function0) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(kClass, GriverMonitorConstants.KEY_EXCEPTION_CLASS);
        Intrinsics.checkParameterIsNotNull(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(kClass, (String) null, obj);
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Provided for binary compatibility")
    @JvmName(name = "assertFailsWith")
    public static final /* synthetic */ <T extends Throwable> T assertFailsWith(@NotNull KClass<T> kClass, @Nullable String str, @NotNull Function0<Unit> function0) {
        Object obj;
        Intrinsics.checkParameterIsNotNull(kClass, GriverMonitorConstants.KEY_EXCEPTION_CLASS);
        Intrinsics.checkParameterIsNotNull(function0, "block");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(function0.invoke());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        return AssertionsKt.checkResultIsFailure(kClass, str, obj);
    }

    @InlineOnly
    private static final void todo(Function0<Unit> function0) {
        StringBuilder sb = new StringBuilder("TODO at ");
        sb.append(new Exception().getStackTrace()[0]);
        System.out.println(sb.toString());
    }

    @InlineOnly
    private static final StackTraceElement[] currentStackTrace() {
        return new Exception().getStackTrace();
    }
}

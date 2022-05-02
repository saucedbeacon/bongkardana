package o;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", "", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class startConnectionTimer {
    private static final boolean setMin;

    static {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m1constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m1constructorimpl(ResultKt.createFailure(th));
        }
        setMin = Result.m8isSuccessimpl(obj);
    }

    public static final boolean length() {
        return setMin;
    }
}

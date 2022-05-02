package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineStart;
import o.DeviceTokenClient;
import o.TMNTokenClient;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, k = 4, mv = {1, 4, 2})
public final class xp2 {
    public static final <T> T setMax(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super initToken, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        CoroutineContext coroutineContext2;
        DeviceTokenClient.InitResultListener initResultListener;
        Thread currentThread = Thread.currentThread();
        if (((ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.Key)) == null) {
            isNeedRead isneedread = isNeedRead.setMin;
            initResultListener = isNeedRead.getMin();
            coroutineContext2 = registerLog.setMin(TMNTokenClient.InitResultListener.length, coroutineContext.plus(initResultListener));
        } else {
            isNeedRead isneedread2 = isNeedRead.setMin;
            initResultListener = isNeedRead.setMax();
            coroutineContext2 = registerLog.setMin(TMNTokenClient.InitResultListener.length, coroutineContext);
        }
        methodToNative methodtonative = new methodToNative(coroutineContext2, currentThread, initResultListener);
        methodtonative.setMax(CoroutineStart.DEFAULT, methodtonative, function2);
        return methodtonative.toFloatRange();
    }

    @NotNull
    public static final DictionaryKeys setMin(@NotNull initToken inittoken, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super initToken, ? super Continuation<? super Unit>, ? extends Object> function2) {
        isNeedWrite isneedwrite;
        CoroutineContext min = registerLog.setMin(inittoken, coroutineContext);
        if (coroutineStart.isLazy()) {
            isneedwrite = new onGetFocus(min, function2);
        } else {
            isneedwrite = new isNeedWrite(min, true);
        }
        isneedwrite.setMax(coroutineStart, isneedwrite, function2);
        return isneedwrite;
    }
}

package o;

import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00060\u0004H\bø\u0001\u0000JQ\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\b\b\u0000\u0010\u0006*\u00020\u0001\"\u0004\b\u0001\u0010\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\f\"\u0002H\u00062\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0004H\u0007¢\u0006\u0002\u0010\u000eJY\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0006\b\u0000\u0010\u0006\u0018\u0001\"\u0004\b\u0001\u0010\n*\u0002H\u00062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00060\f\"\u0002H\u00062\u001a\b\b\u0010\r\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0004H\bø\u0001\u0000¢\u0006\u0002\u0010\u000fJJ\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00122\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u0002H\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\t0\u0004\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0013"}, d2 = {"Lid/dana/data/util/ConfigUtil;", "", "()V", "fallbackAmcsOrLocal", "Lkotlin/Function1;", "", "T", "local", "getConfigFallback", "Lio/reactivex/Observable;", "P", "configEntityDatas", "", "entityData", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "(Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lio/reactivex/Observable;", "getConfigFromOtherEntityData", "iterator", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isSync {
    @NotNull
    public static final isSync INSTANCE = new isSync();

    private isSync() {
    }

    public final /* synthetic */ <T, P> TitleBarRightButtonView.AnonymousClass1<P> getConfigFallback(T t, T[] tArr, Function1<? super T, ? extends TitleBarRightButtonView.AnonymousClass1<P>> function1) {
        Intrinsics.checkNotNullParameter(tArr, "configEntityDatas");
        Intrinsics.checkNotNullParameter(function1, "entityData");
        return getConfigFromOtherEntityData((TitleBarRightButtonView.AnonymousClass1) function1.invoke(t), ArrayIteratorKt.iterator(tArr), function1);
    }

    @JvmStatic
    @NotNull
    public static final <T, P> TitleBarRightButtonView.AnonymousClass1<P> getConfigFallback(@NotNull T[] tArr, @NotNull Function1<? super T, ? extends TitleBarRightButtonView.AnonymousClass1<P>> function1) {
        Intrinsics.checkNotNullParameter(tArr, "configEntityDatas");
        Intrinsics.checkNotNullParameter(function1, "entityData");
        Iterator it = ArrayIteratorKt.iterator(tArr);
        return INSTANCE.getConfigFromOtherEntityData((TitleBarRightButtonView.AnonymousClass1) function1.invoke(it.next()), it, function1);
    }

    @NotNull
    public final <T, P> TitleBarRightButtonView.AnonymousClass1<P> getConfigFromOtherEntityData(@NotNull TitleBarRightButtonView.AnonymousClass1<P> r2, @NotNull Iterator<? extends T> it, @NotNull Function1<? super T, ? extends TitleBarRightButtonView.AnonymousClass1<P>> function1) {
        Intrinsics.checkNotNullParameter(r2, "$this$getConfigFromOtherEntityData");
        Intrinsics.checkNotNullParameter(it, "iterator");
        Intrinsics.checkNotNullParameter(function1, "entityData");
        if (!it.hasNext()) {
            return r2;
        }
        TitleBarRightButtonView.AnonymousClass1<P> onErrorResumeNext = r2.onErrorResumeNext((TitleBarRightButtonView.AnonymousClass4<? extends P>) getConfigFromOtherEntityData((TitleBarRightButtonView.AnonymousClass1) function1.invoke(it.next()), it, function1));
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "onErrorResumeNext(\n     …entityData)\n            )");
        return onErrorResumeNext;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "key", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<String, T> {
        final /* synthetic */ Function1 $local;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(Function1 function1) {
            super(1);
            this.$local = function1;
        }

        public final T invoke(@NotNull String str) {
            String jSONObject;
            Intrinsics.checkNotNullParameter(str, "key");
            JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig(str);
            if (!(jSONConfig == null || (jSONObject = jSONConfig.toString()) == null)) {
                T t = null;
                if (jSONObject != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(jSONObject);
                        Gson gson = new Gson();
                        String jSONObject3 = jSONObject2.toString();
                        Intrinsics.reifiedOperationMarker(4, DiskFormatter.TB);
                        t = gson.fromJson(jSONObject3, Object.class);
                    } catch (Exception unused) {
                    }
                }
                if (t != null) {
                    return t;
                }
            }
            isSync issync = isSync.INSTANCE;
            return this.$local.invoke(str);
        }
    }

    public final /* synthetic */ <T> Function1<String, T> fallbackAmcsOrLocal(Function1<? super String, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "local");
        Intrinsics.needClassReification();
        return new length(function1);
    }
}

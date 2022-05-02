package o;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CreateDialogParam;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lid/dana/data/geocode/repository/config/local/LocalGeocodeConfigEntityData;", "Lid/dana/data/geocode/repository/config/GeocodeConfigEntityData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "geocodeReverseConfigResult", "", "kotlin.jvm.PlatformType", "getGeocodeReverseConfigResult", "()Ljava/lang/String;", "geocodeReverseConfigResult$delegate", "Lkotlin/Lazy;", "getGeocodeReverseConfig", "Lio/reactivex/Observable;", "Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class compare implements CreatePromptParam {
    private final Lazy geocodeReverseConfigResult$delegate;

    /* access modifiers changed from: private */
    public final String getGeocodeReverseConfigResult() {
        return (String) this.geocodeReverseConfigResult$delegate.getValue();
    }

    @Inject
    public compare(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.geocodeReverseConfigResult$delegate = LazyKt.lazy(new getMin(context));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<String> {
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(Context context) {
            super(0);
            this.$context = context;
        }

        public final String invoke() {
            return getPositiveString.loadJSONFromAsset(this.$context, BaseAppContext.DEFAULT_GEOCODE_REVERSE_CONFIG);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<CreateDialogParam.AgreementClickListener> getGeocodeReverseConfig() {
        TitleBarRightButtonView.AnonymousClass1<CreateDialogParam.AgreementClickListener> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMax(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …lt::class.java)\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMax<V> implements Callable<CreateDialogParam.AgreementClickListener> {
        final /* synthetic */ compare length;

        getMax(compare compare) {
            this.length = compare;
        }

        public final /* synthetic */ Object call() {
            return (CreateDialogParam.AgreementClickListener) JSON.parseObject(this.length.getGeocodeReverseConfigResult(), CreateDialogParam.AgreementClickListener.class);
        }
    }
}

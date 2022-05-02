package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/DefaultBillerX2BEntityData;", "Lid/dana/data/sendmoney/BillerX2BEntityData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getListBillerX2B", "Lio/reactivex/Observable;", "", "Lid/dana/data/sendmoney/model/BillerX2BEntity;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StringUtils implements clearProcessCache {
    @NotNull
    public static final String ALL_BILLER_X2B_DATA = "json/default-x2b-redirect-all-biller-data.json";
    @NotNull
    public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
    @NotNull
    private final Context context;

    @Inject
    public StringUtils(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.context = context2;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/sendmoney/model/BillerX2BEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<List<? extends getNewDomainSuffix>> {
        final /* synthetic */ StringUtils getMax;

        length(StringUtils stringUtils) {
            this.getMax = stringUtils;
        }

        /* access modifiers changed from: private */
        /* renamed from: getMax */
        public List<getNewDomainSuffix> call() {
            String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.getMax.getContext(), StringUtils.ALL_BILLER_X2B_DATA);
            Object obj = null;
            if (loadJSONFromAsset != null) {
                try {
                    obj = new Gson().fromJson(new JSONObject(loadJSONFromAsset).toString(), List.class);
                } catch (Exception unused) {
                }
            }
            return (List) obj;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getNewDomainSuffix>> getListBillerX2B() {
        TitleBarRightButtonView.AnonymousClass1<List<getNewDomainSuffix>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …erX2BEntity>>()\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/sendmoney/repository/source/local/DefaultBillerX2BEntityData$Companion;", "", "()V", "ALL_BILLER_X2B_DATA", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}

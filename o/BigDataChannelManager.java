package o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RVProxy;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006H\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006H\u0016J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/data/referral/source/local/LocalReferralEntityData;", "Lid/dana/data/referral/source/ReferralEntityData;", "referralEngagementPreference", "Lid/dana/data/referral/source/local/ReferralEngagementPreference;", "(Lid/dana/data/referral/source/local/ReferralEngagementPreference;)V", "consult", "Lio/reactivex/Observable;", "Lid/dana/data/referral/source/network/result/ReferralConsultRpcResult;", "getDialogCaches", "", "Lid/dana/data/referral/source/local/model/ReferralEngagementDialogCacheEntity;", "saveReferralEngagementDialogCache", "", "referralEngagementDialogCacheEntity", "statusConsult", "Lid/dana/data/referral/source/network/result/ReferralStatusConsultRpcResult;", "verify", "Lid/dana/data/referral/source/network/result/ReferralVerifyRpcResult;", "referralCode", "", "cityName", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BigDataChannelManager implements RVProxy.LazyGetter {
    /* access modifiers changed from: private */
    public final decrementRef referralEngagementPreference;

    final class InstanceHolder implements RedDotDrawable {
        private final setBizType length;

        public InstanceHolder(setBizType setbiztype) {
            this.length = setbiztype;
        }

        public final Object apply(Object obj) {
            return this.length.apply(obj);
        }
    }

    @Inject
    public BigDataChannelManager(@NotNull decrementRef decrementref) {
        Intrinsics.checkNotNullParameter(decrementref, "referralEngagementPreference");
        this.referralEngagementPreference = decrementref;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<pickNext> consult() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setViewId> verify(@Nullable String str, @Nullable String str2) {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setChannelId> statusConsult() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveReferralEngagementDialogCache(@NotNull List<createChannelWithBuffer> list) {
        Intrinsics.checkNotNullParameter(list, "referralEngagementDialogCacheEntity");
        TitleBarRightButtonView.AnonymousClass1<Boolean> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMin(this, list));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ntity)\n        true\n    }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<createChannelWithBuffer>> getDialogCaches() {
        TitleBarRightButtonView.AnonymousClass1<List<createChannelWithBuffer>> onErrorReturnItem = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMax(this)).onErrorReturnItem(new ArrayList());
        Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "Observable.fromCallable …turnItem(mutableListOf())");
        return onErrorReturnItem;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class setMin<V> implements Callable<Boolean> {
        final /* synthetic */ List getMax;
        final /* synthetic */ BigDataChannelManager setMin;

        setMin(BigDataChannelManager bigDataChannelManager, List list) {
            this.setMin = bigDataChannelManager;
            this.getMax = list;
        }

        public final /* synthetic */ Object call() {
            this.setMin.referralEngagementPreference.saveDialogCache(this.getMax);
            return Boolean.TRUE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/referral/source/local/model/ReferralEngagementDialogCacheEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMax<V> implements Callable<List<? extends createChannelWithBuffer>> {
        final /* synthetic */ BigDataChannelManager getMin;

        getMax(BigDataChannelManager bigDataChannelManager) {
            this.getMin = bigDataChannelManager;
        }

        public final /* synthetic */ Object call() {
            return this.getMin.referralEngagementPreference.getDialogCaches();
        }
    }
}

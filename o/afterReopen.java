package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.di.PerActivity;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.onFrameData;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000eH\u0016J\u0018\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/savings/WithdrawSavingPresenter;", "Lid/dana/savings/contract/WithdrawSavingContract$Presenter;", "view", "Lid/dana/savings/contract/WithdrawSavingContract$View;", "context", "Landroid/content/Context;", "getUserInfoWithKyc", "Lid/dana/domain/user/interactor/GetUserInfoWithKyc;", "getWithdrawOption", "Lid/dana/domain/saving/interactor/GetWithdrawOption;", "initSavingWithdraw", "Lid/dana/domain/saving/interactor/InitSavingWithdraw;", "(Lid/dana/savings/contract/WithdrawSavingContract$View;Landroid/content/Context;Lid/dana/domain/user/interactor/GetUserInfoWithKyc;Lid/dana/domain/saving/interactor/GetWithdrawOption;Lid/dana/domain/saving/interactor/InitSavingWithdraw;)V", "getKycStatus", "", "getSavingGoalWithdrawMethod", "Lid/dana/domain/saving/model/SavingGoalWithdrawMethod;", "savingWithdrawInitResult", "Lid/dana/domain/saving/model/SavingWithdrawInitResult;", "withdrawMethod", "", "getSavingWithdrawOption", "savingId", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class afterReopen implements onFrameData.getMax {
    /* access modifiers changed from: private */
    public final onFrameData.getMin getMax;
    public final notifyCharacteristicValue getMin;
    public final setMultiFrameBeacon length;
    public final setDataFields setMax;
    /* access modifiers changed from: private */
    public final Context setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMax extends Lambda implements Function1<List<? extends String>, Unit> {
        final /* synthetic */ afterReopen this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(afterReopen afterreopen) {
            super(1);
            this.this$0 = afterreopen;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<String>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            this.this$0.getMax.setMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ afterReopen this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(afterReopen afterreopen) {
            super(1);
            this.this$0 = afterreopen;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            onFrameData.getMin length = this.this$0.getMax;
            onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
            length.onError(onSurfaceTextureDestroyed.setMax(this.this$0.setMin, th.getLocalizedMessage()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingWithdrawInitResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<setUseTrackingCache, Unit> {
        final /* synthetic */ String $withdrawMethod;
        final /* synthetic */ afterReopen this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(afterReopen afterreopen, String str) {
            super(1);
            this.this$0 = afterreopen;
            this.$withdrawMethod = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((setUseTrackingCache) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull setUseTrackingCache setusetrackingcache) {
            Intrinsics.checkNotNullParameter(setusetrackingcache, "it");
            getRssiFilterImplClass length = afterReopen.length(setusetrackingcache, this.$withdrawMethod);
            if (length.getSuccess()) {
                this.this$0.getMax.getMax();
                return;
            }
            onFrameData.getMin length2 = this.this$0.getMax;
            onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
            length2.onError(onSurfaceTextureDestroyed.getMax(this.this$0.setMin, length.getErrorCode()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ afterReopen this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMin(afterReopen afterreopen) {
            super(1);
            this.this$0 = afterreopen;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            onFrameData.getMin length = this.this$0.getMax;
            onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
            length.onError(onSurfaceTextureDestroyed.setMax(this.this$0.setMin, th.getLocalizedMessage()));
        }
    }

    @Inject
    public afterReopen(@NotNull onFrameData.getMin getmin, @NotNull Context context, @NotNull notifyCharacteristicValue notifycharacteristicvalue, @NotNull setDataFields setdatafields, @NotNull setMultiFrameBeacon setmultiframebeacon) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(notifycharacteristicvalue, "getUserInfoWithKyc");
        Intrinsics.checkNotNullParameter(setdatafields, "getWithdrawOption");
        Intrinsics.checkNotNullParameter(setmultiframebeacon, "initSavingWithdraw");
        this.getMax = getmin;
        this.setMin = context;
        this.getMin = notifycharacteristicvalue;
        this.setMax = setdatafields;
        this.length = setmultiframebeacon;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/savings/WithdrawSavingPresenter$getKycStatus$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onNext", "", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ afterReopen length;

        public setMax(afterReopen afterreopen) {
            this.length = afterreopen;
        }

        public final /* synthetic */ void onNext(Object obj) {
            disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            this.length.getMax.getMin(disconnect.isKycCertified());
        }
    }

    public final void setMax() {
        this.getMin.dispose();
    }

    public static final /* synthetic */ getRssiFilterImplClass length(setUseTrackingCache setusetrackingcache, String str) {
        Object obj;
        Iterator it = setusetrackingcache.getSavingGoalWithdrawMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((getRssiFilterImplClass) obj).getWithdrawMethod(), (Object) str)) {
                break;
            }
        }
        getRssiFilterImplClass getrssifilterimplclass = (getRssiFilterImplClass) obj;
        return getrssifilterimplclass == null ? new getRssiFilterImplClass("", false, false, "", "") : getrssifilterimplclass;
    }
}

package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.setVideoCurTimeStamp;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0018\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/savings/presenter/SavingTopUpPresenter;", "Lid/dana/savings/contract/SavingTopUpContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/savings/contract/SavingTopUpContract$View;", "initSavingTopUp", "Lid/dana/domain/saving/interactor/InitSavingTopUp;", "topUpSaving", "Lid/dana/domain/saving/interactor/TopUpSaving;", "getUserInfoWithKyc", "Lid/dana/domain/user/interactor/GetUserInfoWithKyc;", "(Landroid/content/Context;Lid/dana/savings/contract/SavingTopUpContract$View;Lid/dana/domain/saving/interactor/InitSavingTopUp;Lid/dana/domain/saving/interactor/TopUpSaving;Lid/dana/domain/user/interactor/GetUserInfoWithKyc;)V", "getMessageByKycLevel", "", "handleTopUpError", "it", "", "savingId", "", "onDestroy", "fundAmount", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class setOnTapListener implements setVideoCurTimeStamp.getMin {
    /* access modifiers changed from: private */
    public final Context getMax;
    private final setBluetoothName getMin;
    public final setVideoCurTimeStamp.setMin length;
    public final setLatitude setMax;
    private final notifyCharacteristicValue setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setOnTapListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(setOnTapListener setontaplistener) {
            super(1);
            this.this$0 = setontaplistener;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            setVideoCurTimeStamp.setMin min = this.this$0.length;
            onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
            min.onError(onSurfaceTextureDestroyed.setMax(this.this$0.getMax, th.getLocalizedMessage()));
            updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to init top up", th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class getMin extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ setOnTapListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMin(setOnTapListener setontaplistener) {
            super(1);
            this.this$0 = setontaplistener;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.this$0.length.dismissProgress();
            this.this$0.length.setMax(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingTopUpInit;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<getDistanceModelUpdateUrl, Unit> {
        final /* synthetic */ setOnTapListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(setOnTapListener setontaplistener) {
            super(1);
            this.this$0 = setontaplistener;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((getDistanceModelUpdateUrl) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull getDistanceModelUpdateUrl getdistancemodelupdateurl) {
            Intrinsics.checkNotNullParameter(getdistancemodelupdateurl, "it");
            this.this$0.length.dismissProgress();
            setVideoCurTimeStamp.setMin min = this.this$0.length;
            Intrinsics.checkNotNullParameter(getdistancemodelupdateurl, "$this$toSavingTopUpInitModel");
            MoneyViewModel.length length = MoneyViewModel.length;
            MoneyViewModel length2 = MoneyViewModel.length.length(getdistancemodelupdateurl.getMaxAmount());
            MoneyViewModel.length length3 = MoneyViewModel.length;
            MoneyViewModel length4 = MoneyViewModel.length.length(getdistancemodelupdateurl.getCurrentAmount());
            MoneyViewModel.length length5 = MoneyViewModel.length;
            min.setMax(new onSurfaceTextureUpdated(length2, length4, MoneyViewModel.length.length(getdistancemodelupdateurl.getTargetAmount())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ setOnTapListener this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public setMax(setOnTapListener setontaplistener) {
            super(1);
            this.this$0 = setontaplistener;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.length.dismissProgress();
            setOnTapListener.getMin(this.this$0, th);
            updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to top up", th);
        }
    }

    @Inject
    public setOnTapListener(@NotNull Context context, @NotNull setVideoCurTimeStamp.setMin setmin, @NotNull setBluetoothName setbluetoothname, @NotNull setLatitude setlatitude, @NotNull notifyCharacteristicValue notifycharacteristicvalue) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(setbluetoothname, "initSavingTopUp");
        Intrinsics.checkNotNullParameter(setlatitude, "topUpSaving");
        Intrinsics.checkNotNullParameter(notifycharacteristicvalue, "getUserInfoWithKyc");
        this.getMax = context;
        this.length = setmin;
        this.getMin = setbluetoothname;
        this.setMax = setlatitude;
        this.setMin = notifycharacteristicvalue;
    }

    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        this.length.showProgress();
        this.getMin.execute(str, new length(this), new getMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"id/dana/savings/presenter/SavingTopUpPresenter$getMessageByKycLevel$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "onComplete", "", "onNext", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends GriverAppVirtualHostProxy<disconnect> {
        final /* synthetic */ setOnTapListener length;
        final /* synthetic */ Ref.BooleanRef setMin;

        setMin(setOnTapListener setontaplistener, Ref.BooleanRef booleanRef) {
            this.length = setontaplistener;
            this.setMin = booleanRef;
        }

        public final /* synthetic */ void onNext(Object obj) {
            disconnect disconnect = (disconnect) obj;
            Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
            this.setMin.element = disconnect.isKycCertified();
        }

        public final void onComplete() {
            super.onComplete();
            this.length.length.dismissProgress();
            if (this.setMin.element) {
                this.length.length.onError(this.length.getMax.getString(R.string.error_saving_DE13113048999207));
                return;
            }
            setVideoCurTimeStamp.setMin min = this.length.length;
            String string = this.length.getMax.getString(R.string.error_saving_amount_limit_non_kyc);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ing_amount_limit_non_kyc)");
            min.length(string);
        }
    }

    public final void setMax() {
        this.getMin.dispose();
        this.setMax.dispose();
        this.setMin.dispose();
    }

    public static final /* synthetic */ void getMin(setOnTapListener setontaplistener, Throwable th) {
        onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
        String min = onSurfaceTextureDestroyed.getMin(th.getLocalizedMessage());
        if (min.hashCode() == 1665786596 && min.equals("DE13113048999207")) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = false;
            setontaplistener.setMin.execute(new setMin(setontaplistener, booleanRef));
            return;
        }
        setVideoCurTimeStamp.setMin setmin = setontaplistener.length;
        onSurfaceTextureDestroyed onsurfacetexturedestroyed2 = onSurfaceTextureDestroyed.getMax;
        setmin.onError(onSurfaceTextureDestroyed.setMax(setontaplistener.getMax, th.getLocalizedMessage()));
    }
}

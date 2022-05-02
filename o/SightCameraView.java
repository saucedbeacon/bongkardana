package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.SavingCategoryModel;
import id.dana.savings.model.SavingDetailModel;
import id.dana.savings.model.SavingModel;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.Beacon;
import o.BeaconLocalBroadcastProcessor;
import o.CaptureBtn;
import o.b;
import o.enableEventbus;
import o.isEnableFrameData;
import o.notifyMicError;
import o.notifyPrepared;
import o.setIdentifiers;
import o.updateScreenRotation;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lid/dana/savings/model/SavingSummaryModel;", "", "savingBalanceAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "maxSavingAmount", "maxSavingCount", "", "remainingAmount", "remainingCount", "savingModels", "", "Lid/dana/savings/model/SavingModel;", "hasNext", "", "(Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;JLid/dana/nearbyme/merchantdetail/model/MoneyViewModel;JLjava/util/List;Z)V", "getHasNext", "()Z", "getMaxSavingAmount", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "getMaxSavingCount", "()J", "getRemainingAmount", "getRemainingCount", "getSavingBalanceAmount", "getSavingModels", "()Ljava/util/List;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SightCameraView {
    @NotNull
    public final MoneyViewModel getMax;
    @NotNull
    public final List<SavingModel> getMin;
    @NotNull
    public final MoneyViewModel length;
    @NotNull
    private final MoneyViewModel setMax;
    private final long setMin;
    private final long toFloatRange;
    private final boolean toIntRange;

    public SightCameraView(@NotNull MoneyViewModel moneyViewModel, @NotNull MoneyViewModel moneyViewModel2, long j, @NotNull MoneyViewModel moneyViewModel3, long j2, @NotNull List<SavingModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(moneyViewModel, "savingBalanceAmount");
        Intrinsics.checkNotNullParameter(moneyViewModel2, "maxSavingAmount");
        Intrinsics.checkNotNullParameter(moneyViewModel3, "remainingAmount");
        Intrinsics.checkNotNullParameter(list, "savingModels");
        this.length = moneyViewModel;
        this.setMax = moneyViewModel2;
        this.setMin = j;
        this.getMax = moneyViewModel3;
        this.toFloatRange = j2;
        this.getMin = list;
        this.toIntRange = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0006\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\b\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/savings/presenter/SavingConfigPresenter;", "Lid/dana/savings/contract/SavingConfigContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/savings/contract/SavingConfigContract$View;", "getSavingBalanceVisibility", "Lid/dana/domain/saving/interactor/GetSavingBalanceVisibility;", "saveSavingBalanceVisibility", "Lid/dana/domain/saving/interactor/SaveSavingBalanceVisibility;", "(Landroid/content/Context;Lid/dana/savings/contract/SavingConfigContract$View;Lid/dana/domain/saving/interactor/GetSavingBalanceVisibility;Lid/dana/domain/saving/interactor/SaveSavingBalanceVisibility;)V", "lastBalanceVisibilityState", "", "", "onDestroy", "visibility", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    public final class OnRecordListener implements notifyPrepared.getMax {
        public final sync getMax;
        /* access modifiers changed from: private */
        public boolean getMin;
        private final Beacon.AnonymousClass1 length;
        /* access modifiers changed from: private */
        public final Context setMax;
        public final notifyPrepared.length setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final class getMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ OnRecordListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMax(OnRecordListener onRecordListener) {
                super(1);
                this.this$0 = onRecordListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMin.dismissProgress();
                notifyPrepared.length min = this.this$0.setMin;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                min.onError(onSurfaceTextureDestroyed.setMax(this.this$0.setMax, th.getLocalizedMessage()));
                this.this$0.setMin.setMin(this.this$0.getMin);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ OnRecordListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(OnRecordListener onRecordListener) {
                super(1);
                this.this$0 = onRecordListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMin.dismissProgress();
                notifyPrepared.length min = this.this$0.setMin;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                min.onError(onSurfaceTextureDestroyed.setMax(this.this$0.setMax, th.getLocalizedMessage()));
                this.this$0.setMin.setMin(this.this$0.getMin);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ OnRecordListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(OnRecordListener onRecordListener) {
                super(1);
                this.this$0 = onRecordListener;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.this$0.setMin.dismissProgress();
                this.this$0.setMin.setMin(z);
                this.this$0.getMin = z;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "success", "", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final class setMin extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ boolean $visibility;
            final /* synthetic */ OnRecordListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public setMin(OnRecordListener onRecordListener, boolean z) {
                super(1);
                this.this$0 = onRecordListener;
                this.$visibility = z;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.this$0.setMin.dismissProgress();
                if (z) {
                    this.this$0.setMin.setMin(this.$visibility);
                    this.this$0.getMin = this.$visibility;
                }
            }
        }

        @Inject
        public OnRecordListener(@NotNull Context context, @NotNull notifyPrepared.length length2, @NotNull Beacon.AnonymousClass1 r4, @NotNull sync sync) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(length2, "view");
            Intrinsics.checkNotNullParameter(r4, "getSavingBalanceVisibility");
            Intrinsics.checkNotNullParameter(sync, "saveSavingBalanceVisibility");
            this.setMax = context;
            this.setMin = length2;
            this.length = r4;
            this.getMax = sync;
        }

        public final void getMin() {
            this.setMin.showProgress();
            this.length.execute(onReceivedIcon.INSTANCE, new setMax(this), new length(this));
        }

        public final void setMax() {
            this.length.dispose();
            this.getMax.dispose();
        }
    }

    public final class TakePictureMPListener implements getAdapterPosition<TakePictureListener> {
        private final b.C0007b<isEnableFrameData.getMin> getMin;
        private final b.C0007b<Beacon.Builder> setMax;
        private final b.C0007b<Context> setMin;

        private TakePictureMPListener(b.C0007b<Context> bVar, b.C0007b<isEnableFrameData.getMin> bVar2, b.C0007b<Beacon.Builder> bVar3) {
            this.setMin = bVar;
            this.getMin = bVar2;
            this.setMax = bVar3;
        }

        public static TakePictureMPListener getMax(b.C0007b<Context> bVar, b.C0007b<isEnableFrameData.getMin> bVar2, b.C0007b<Beacon.Builder> bVar3) {
            return new TakePictureMPListener(bVar, bVar2, bVar3);
        }

        public final /* synthetic */ Object get() {
            return new TakePictureListener(this.setMin.get(), this.getMin.get(), this.setMax.get());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0016J \u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\u0010\u0010\b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/savings/presenter/SavingDetailPresenter;", "Lid/dana/savings/contract/SavingDetailContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/savings/contract/SavingDetailContract$View;", "getSavingDetail", "Lid/dana/domain/saving/interactor/GetSavingDetail;", "revokeSaving", "Lid/dana/domain/saving/interactor/RevokeSaving;", "(Landroid/content/Context;Lid/dana/savings/contract/SavingDetailContract$View;Lid/dana/domain/saving/interactor/GetSavingDetail;Lid/dana/domain/saving/interactor/RevokeSaving;)V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "fetchingMoreTopUpHistory", "", "savingId", "", "topUpViewPage", "", "topUpViewSize", "getAchievedDaysCount", "achievedTime", "createdTime", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    public final class BufferType implements enableEventbus.getMin {
        public int getMax = 1;
        public final Beacon.Builder getMin;
        /* access modifiers changed from: private */
        public final Context length;
        public final enableEventbus.setMax setMax;
        public final getLatitude setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingDetail;", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final class getMax extends Lambda implements Function1<setRegionExitPeriod, Unit> {
            final /* synthetic */ BufferType this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMax(BufferType bufferType) {
                super(1);
                this.this$0 = bufferType;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((setRegionExitPeriod) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull setRegionExitPeriod setregionexitperiod) {
                Intrinsics.checkNotNullParameter(setregionexitperiod, "it");
                this.this$0.getMax++;
                this.this$0.setMax.dismissProgress();
                enableEventbus.setMax max = this.this$0.setMax;
                Intrinsics.checkNotNullParameter(setregionexitperiod, "$this$toSavingDetailModel");
                max.getMax(new SavingDetailModel(setVideoRecordListener.getMax(setregionexitperiod.getSavingGoalView()), SightCameraTextureView.length(setregionexitperiod.getTopUpViews()), setregionexitperiod.getHasNext()).setMin);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final class getMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ BufferType this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMin(BufferType bufferType) {
                super(1);
                this.this$0 = bufferType;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMax.setMax();
                enableEventbus.setMax max = this.this$0.setMax;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                max.onError(onSurfaceTextureDestroyed.setMax(this.this$0.length, th.getLocalizedMessage()));
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to get saving history top up", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final class length extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ BufferType this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public length(BufferType bufferType) {
                super(1);
                this.this$0 = bufferType;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.this$0.setMax.dismissProgress();
                this.this$0.setMax.setMin();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ BufferType this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(BufferType bufferType) {
                super(1);
                this.this$0 = bufferType;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMax.dismissProgress();
                enableEventbus.setMax max = this.this$0.setMax;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                max.onError(onSurfaceTextureDestroyed.setMax(this.this$0.length, th.getLocalizedMessage()));
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to get saving history top up", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingDetail;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<setRegionExitPeriod, Unit> {
            final /* synthetic */ BufferType this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(BufferType bufferType) {
                super(1);
                this.this$0 = bufferType;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((setRegionExitPeriod) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull setRegionExitPeriod setregionexitperiod) {
                Intrinsics.checkNotNullParameter(setregionexitperiod, "it");
                this.this$0.setMax.dismissProgress();
                enableEventbus.setMax max = this.this$0.setMax;
                Intrinsics.checkNotNullParameter(setregionexitperiod, "$this$toSavingDetailModel");
                max.length(new SavingDetailModel(setVideoRecordListener.getMax(setregionexitperiod.getSavingGoalView()), SightCameraTextureView.length(setregionexitperiod.getTopUpViews()), setregionexitperiod.getHasNext()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        public static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ BufferType this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public toFloatRange(BufferType bufferType) {
                super(1);
                this.this$0 = bufferType;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.setMax.dismissProgress();
                enableEventbus.setMax max = this.this$0.setMax;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                max.onError(onSurfaceTextureDestroyed.setMax(this.this$0.length, th.getLocalizedMessage()));
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to revoke saving", th);
            }
        }

        @Inject
        public BufferType(@NotNull Context context, @NotNull enableEventbus.setMax setmax, @NotNull Beacon.Builder builder, @NotNull getLatitude getlatitude) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(setmax, "view");
            Intrinsics.checkNotNullParameter(builder, "getSavingDetail");
            Intrinsics.checkNotNullParameter(getlatitude, "revokeSaving");
            this.length = context;
            this.setMax = setmax;
            this.getMin = builder;
            this.setMin = getlatitude;
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "savingId");
            this.setMax.showProgress();
            this.getMin.execute(new Beacon.Builder.setMax(str, 0, 20), new setMin(this), new setMax(this));
        }

        public static long length(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "achievedTime");
            Intrinsics.checkNotNullParameter(str2, "createdTime");
            return TimeUnit.DAYS.convert(Long.parseLong(str) - Long.parseLong(str2), TimeUnit.MILLISECONDS);
        }

        public final void setMax() {
            this.getMin.dispose();
            this.setMin.dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/savings/presenter/SavingTopUpHistoryPresenter;", "Lid/dana/savings/contract/SavingTopUpHistoryContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/savings/contract/SavingTopUpHistoryContract$View;", "getSavingDetail", "Lid/dana/domain/saving/interactor/GetSavingDetail;", "(Landroid/content/Context;Lid/dana/savings/contract/SavingTopUpHistoryContract$View;Lid/dana/domain/saving/interactor/GetSavingDetail;)V", "currentPage", "", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "fetchingMoreTopUpHistory", "", "savingId", "", "topUpViewPage", "", "topUpViewSize", "getSavingTopUpHistory", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    public final class TakePictureListener implements isEnableFrameData.getMax {
        /* access modifiers changed from: private */
        public final isEnableFrameData.getMin getMin;
        /* access modifiers changed from: private */
        public final Context length;
        int setMax = 1;
        private final Beacon.Builder setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ TakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(TakePictureListener takePictureListener) {
                super(1);
                this.this$0 = takePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMin.setMax();
                isEnableFrameData.getMin min = this.this$0.getMin;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                min.onError(onSurfaceTextureDestroyed.setMax(this.this$0.length, th.getLocalizedMessage()));
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to get saving history top up", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingDetail;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<setRegionExitPeriod, Unit> {
            final /* synthetic */ TakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(TakePictureListener takePictureListener) {
                super(1);
                this.this$0 = takePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((setRegionExitPeriod) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull setRegionExitPeriod setregionexitperiod) {
                Intrinsics.checkNotNullParameter(setregionexitperiod, "it");
                this.this$0.getMin.dismissProgress();
                isEnableFrameData.getMin min = this.this$0.getMin;
                Intrinsics.checkNotNullParameter(setregionexitperiod, "$this$toSavingDetailModel");
                min.setMin(new SavingDetailModel(setVideoRecordListener.getMax(setregionexitperiod.getSavingGoalView()), SightCameraTextureView.length(setregionexitperiod.getTopUpViews()), setregionexitperiod.getHasNext()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ TakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(TakePictureListener takePictureListener) {
                super(1);
                this.this$0 = takePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMin.dismissProgress();
                isEnableFrameData.getMin min = this.this$0.getMin;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                min.onError(onSurfaceTextureDestroyed.setMax(this.this$0.length, th.getLocalizedMessage()));
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to get saving history top up", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingDetail;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<setRegionExitPeriod, Unit> {
            final /* synthetic */ TakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(TakePictureListener takePictureListener) {
                super(1);
                this.this$0 = takePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((setRegionExitPeriod) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull setRegionExitPeriod setregionexitperiod) {
                Intrinsics.checkNotNullParameter(setregionexitperiod, "it");
                this.this$0.setMax++;
                this.this$0.getMin.dismissProgress();
                isEnableFrameData.getMin min = this.this$0.getMin;
                Intrinsics.checkNotNullParameter(setregionexitperiod, "$this$toSavingDetailModel");
                min.getMin(new SavingDetailModel(setVideoRecordListener.getMax(setregionexitperiod.getSavingGoalView()), SightCameraTextureView.length(setregionexitperiod.getTopUpViews()), setregionexitperiod.getHasNext()).setMin);
            }
        }

        @Inject
        public TakePictureListener(@NotNull Context context, @NotNull isEnableFrameData.getMin getmin, @NotNull Beacon.Builder builder) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(getmin, "view");
            Intrinsics.checkNotNullParameter(builder, "getSavingDetail");
            this.length = context;
            this.getMin = getmin;
            this.setMin = builder;
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "savingId");
            this.getMin.showProgress();
            this.setMin.execute(new Beacon.Builder.setMax(str, 0, 40), new getMin(this), new length(this));
        }

        public final void getMin(@NotNull String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(1110345373, oncanceled);
                onCancelLoad.getMin(1110345373, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "savingId");
            this.setMin.execute(new Beacon.Builder.setMax(str, (long) this.setMax, 40), new setMin(this), new getMax(this));
        }

        public final int getMax() {
            return this.setMax;
        }

        public final void setMax() {
            this.setMin.dispose();
        }
    }

    public final class FrameType implements getAdapterPosition<OnRecordListener> {
        private final b.C0007b<sync> getMax;
        private final b.C0007b<notifyPrepared.length> getMin;
        private final b.C0007b<Context> setMax;
        private final b.C0007b<Beacon.AnonymousClass1> setMin;

        private FrameType(b.C0007b<Context> bVar, b.C0007b<notifyPrepared.length> bVar2, b.C0007b<Beacon.AnonymousClass1> bVar3, b.C0007b<sync> bVar4) {
            this.setMax = bVar;
            this.getMin = bVar2;
            this.setMin = bVar3;
            this.getMax = bVar4;
        }

        public static FrameType length(b.C0007b<Context> bVar, b.C0007b<notifyPrepared.length> bVar2, b.C0007b<Beacon.AnonymousClass1> bVar3, b.C0007b<sync> bVar4) {
            return new FrameType(bVar, bVar2, bVar3, bVar4);
        }

        public final /* synthetic */ Object get() {
            return new OnRecordListener(this.setMax.get(), this.getMin.get(), this.setMin.get(), this.getMax.get());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ \u0010\b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0016J(\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lid/dana/savings/presenter/SavingCreatePresenter;", "Lid/dana/savings/contract/SavingCreateContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/savings/contract/SavingCreateContract$View;", "initSavingCreate", "Lid/dana/domain/saving/interactor/InitSavingCreate;", "createSaving", "Lid/dana/domain/saving/interactor/CreateSaving;", "getUserInfoWithKyc", "Lid/dana/domain/user/interactor/GetUserInfoWithKyc;", "(Landroid/content/Context;Lid/dana/savings/contract/SavingCreateContract$View;Lid/dana/domain/saving/interactor/InitSavingCreate;Lid/dana/domain/saving/interactor/CreateSaving;Lid/dana/domain/user/interactor/GetUserInfoWithKyc;)V", "", "categoryCode", "", "title", "targetAmount", "getKycStatus", "initCreateSaving", "mappingErrorCode", "throwable", "", "onDestroy", "validateGoal", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "maxTargetAmount", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class APTakePictureListener implements notifyMicError.getMin {
        /* access modifiers changed from: private */
        public final Context getMax;
        private final setIdentifiers getMin;
        /* access modifiers changed from: private */
        public final notifyMicError.setMax length;
        private final setManufacturer setMax;
        private final notifyCharacteristicValue setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingGoalView;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<BeaconManager, Unit> {
            final /* synthetic */ APTakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(APTakePictureListener aPTakePictureListener) {
                super(1);
                this.this$0 = aPTakePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BeaconManager) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull BeaconManager beaconManager) {
                Intrinsics.checkNotNullParameter(beaconManager, "it");
                this.this$0.length.dismissProgress();
                this.this$0.length.getMax(setVideoRecordListener.getMax(beaconManager));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ APTakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(APTakePictureListener aPTakePictureListener) {
                super(1);
                this.this$0 = aPTakePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.length.dismissProgress();
                APTakePictureListener.setMin(this.this$0, th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to init saving create ", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingCreateInit;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<getRegionExitPeriod, Unit> {
            final /* synthetic */ APTakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(APTakePictureListener aPTakePictureListener) {
                super(1);
                this.this$0 = aPTakePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getRegionExitPeriod) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull getRegionExitPeriod getregionexitperiod) {
                Intrinsics.checkNotNullParameter(getregionexitperiod, "it");
                this.this$0.length.dismissProgress();
                notifyMicError.setMax length = this.this$0.length;
                Intrinsics.checkNotNullParameter(getregionexitperiod, "$this$toSavingCreateInitModel");
                List<String> categoryCodes = getregionexitperiod.getCategoryCodes();
                List<SavingCategoryModel> min = CustomBgImageView.getMin(getregionexitperiod.getSavingCategories());
                MoneyViewModel.length length2 = MoneyViewModel.length;
                length.getMin(new setViewType(categoryCodes, min, MoneyViewModel.length.length(getregionexitperiod.getMaxTargetAmount())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ APTakePictureListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(APTakePictureListener aPTakePictureListener) {
                super(1);
                this.this$0 = aPTakePictureListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.length.dismissProgress();
                notifyMicError.setMax length = this.this$0.length;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                length.onError(onSurfaceTextureDestroyed.setMax(this.this$0.getMax, th.getLocalizedMessage()));
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to create saving", th);
            }
        }

        @Inject
        public APTakePictureListener(@NotNull Context context, @NotNull notifyMicError.setMax setmax, @NotNull setManufacturer setmanufacturer, @NotNull setIdentifiers setidentifiers, @NotNull notifyCharacteristicValue notifycharacteristicvalue) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(setmax, "view");
            Intrinsics.checkNotNullParameter(setmanufacturer, "initSavingCreate");
            Intrinsics.checkNotNullParameter(setidentifiers, "createSaving");
            Intrinsics.checkNotNullParameter(notifycharacteristicvalue, "getUserInfoWithKyc");
            this.getMax = context;
            this.length = setmax;
            this.setMax = setmanufacturer;
            this.getMin = setidentifiers;
            this.setMin = notifycharacteristicvalue;
        }

        public final void length() {
            this.length.showProgress();
            this.setMax.execute(onReceivedIcon.INSTANCE, new setMax(this), new getMin(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"id/dana/savings/presenter/SavingCreatePresenter$getKycStatus$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "isKycCertified", "", "()Z", "setKycCertified", "(Z)V", "onComplete", "", "onNext", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length extends GriverAppVirtualHostProxy<disconnect> {
            private boolean getMax;
            final /* synthetic */ APTakePictureListener setMax;

            length(APTakePictureListener aPTakePictureListener) {
                this.setMax = aPTakePictureListener;
            }

            public final /* synthetic */ void onNext(Object obj) {
                disconnect disconnect = (disconnect) obj;
                Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
                this.getMax = disconnect.isKycCertified();
            }

            public final void onComplete() {
                super.onComplete();
                this.setMax.length.dismissProgress();
                this.setMax.length.getMax(this.getMax);
            }
        }

        public final void setMin() {
            this.length.showProgress();
            this.setMin.execute(new length(this));
        }

        public final void getMin(@NotNull String str, @NotNull String str2, @NotNull MoneyViewModel moneyViewModel, @NotNull MoneyViewModel moneyViewModel2) {
            Intrinsics.checkNotNullParameter(str, "categoryCode");
            Intrinsics.checkNotNullParameter(str2, "title");
            Intrinsics.checkNotNullParameter(moneyViewModel, "targetAmount");
            Intrinsics.checkNotNullParameter(moneyViewModel2, "maxTargetAmount");
            if (StringsKt.isBlank(str2) || moneyViewModel.getMax(moneyViewModel2)) {
                this.length.setMax();
                return;
            }
            String cleanAll = isOriginHasAppInfo.getCleanAll(moneyViewModel.setMin);
            if (cleanAll == null) {
                cleanAll = "0";
            }
            Intrinsics.checkNotNullParameter(str, "categoryCode");
            Intrinsics.checkNotNullParameter(str2, "title");
            Intrinsics.checkNotNullParameter(cleanAll, "targetAmount");
            this.length.showProgress();
            this.getMin.execute(new setIdentifiers.getMax(str, str2, cleanAll), new getMax(this), new setMin(this));
        }

        public final void setMax() {
            this.setMax.dispose();
            this.getMin.dispose();
            this.setMin.dispose();
        }

        public static final /* synthetic */ void setMin(APTakePictureListener aPTakePictureListener, Throwable th) {
            CaptureBtn captureBtn = CaptureBtn.setMin;
            String length2 = CaptureBtn.length(th);
            switch (length2.hashCode()) {
                case 1665786589:
                    if (length2.equals("DE13113048999200")) {
                        aPTakePictureListener.length.setMax();
                        return;
                    }
                    break;
                case 1665786590:
                    if (length2.equals("DE13113048999201")) {
                        aPTakePictureListener.length.setMax();
                        return;
                    }
                    break;
            }
            notifyMicError.setMax setmax = aPTakePictureListener.length;
            onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
            setmax.onError(onSurfaceTextureDestroyed.setMax(aPTakePictureListener.getMax, th.getLocalizedMessage()));
        }
    }

    public final class ICameraFrameListener implements getAdapterPosition<APTakePictureListener> {
        private final b.C0007b<Context> getMax;
        private final b.C0007b<setIdentifiers> getMin;
        private final b.C0007b<setManufacturer> length;
        private final b.C0007b<notifyCharacteristicValue> setMax;
        private final b.C0007b<notifyMicError.setMax> setMin;

        private ICameraFrameListener(b.C0007b<Context> bVar, b.C0007b<notifyMicError.setMax> bVar2, b.C0007b<setManufacturer> bVar3, b.C0007b<setIdentifiers> bVar4, b.C0007b<notifyCharacteristicValue> bVar5) {
            this.getMax = bVar;
            this.setMin = bVar2;
            this.length = bVar3;
            this.getMin = bVar4;
            this.setMax = bVar5;
        }

        public static ICameraFrameListener getMin(b.C0007b<Context> bVar, b.C0007b<notifyMicError.setMax> bVar2, b.C0007b<setManufacturer> bVar3, b.C0007b<setIdentifiers> bVar4, b.C0007b<notifyCharacteristicValue> bVar5) {
            return new ICameraFrameListener(bVar, bVar2, bVar3, bVar4, bVar5);
        }

        public final /* synthetic */ Object get() {
            return new APTakePictureListener(this.getMax.get(), this.setMin.get(), this.length.get(), this.getMin.get(), this.setMax.get());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u000e\u001a\u00020\u0012H\u0016J\b\u0010\u0006\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/savings/presenter/SavingPresenter;", "Lid/dana/savings/contract/SavingContract$Presenter;", "context", "Landroid/content/Context;", "view", "Lid/dana/savings/contract/SavingContract$View;", "getSavingSummary", "Lid/dana/domain/saving/interactor/GetSavingSummary;", "getUserInfoWithKyc", "Lid/dana/domain/user/interactor/GetUserInfoWithKyc;", "initSavingCreate", "Lid/dana/domain/saving/interactor/InitSavingCreate;", "checkGoalsBalanceFeature", "Lid/dana/domain/featureconfig/interactor/CheckGoalsBalanceFeature;", "getSavingEmptyState", "Lid/dana/domain/saving/interactor/GetSavingEmptyState;", "(Landroid/content/Context;Lid/dana/savings/contract/SavingContract$View;Lid/dana/domain/saving/interactor/GetSavingSummary;Lid/dana/domain/user/interactor/GetUserInfoWithKyc;Lid/dana/domain/saving/interactor/InitSavingCreate;Lid/dana/domain/featureconfig/interactor/CheckGoalsBalanceFeature;Lid/dana/domain/saving/interactor/GetSavingEmptyState;)V", "checkGoalsBalanceFeatureEnable", "", "getKycStatus", "initSaving", "mappingError", "throwable", "", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    public final class OnScrollListener implements updateScreenRotation.setMin {
        private final notifyCharacteristicValue getMax;
        /* access modifiers changed from: private */
        public final updateScreenRotation.getMax getMin;
        /* access modifiers changed from: private */
        public final Context length;
        private final setBeaconTypeCode setMax;
        private final setManufacturer setMin;
        private final setAllowUniversalAccessFromFileURLs toFloatRange;
        private final setTxPower toIntRange;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            IsOverlapping(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMin.dismissProgress();
                OnScrollListener.length(this.this$0, th);
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to init saving create ", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingSummary;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class equals extends Lambda implements Function1<logDebug, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            equals(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((logDebug) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull logDebug logdebug) {
                Intrinsics.checkNotNullParameter(logdebug, "it");
                this.this$0.getMin.dismissProgress();
                updateScreenRotation.getMax min = this.this$0.getMin;
                Intrinsics.checkNotNullParameter(logdebug, "$this$toSavingSummaryModel");
                MoneyViewModel.length length = MoneyViewModel.length;
                MoneyViewModel length2 = MoneyViewModel.length.length(logdebug.getSavingBalanceAmount());
                MoneyViewModel.length length3 = MoneyViewModel.length;
                MoneyViewModel length4 = MoneyViewModel.length.length(logdebug.getMaxSavingAmount());
                long maxSavingCount = logdebug.getMaxSavingCount();
                MoneyViewModel.length length5 = MoneyViewModel.length;
                min.getMax(new SightCameraView(length2, length4, maxSavingCount, MoneyViewModel.length.length(logdebug.getRemainingAmount()), logdebug.getRemainingCount(), setVideoRecordListener.setMax(logdebug.getSavingGoalViews()), logdebug.getHasNext()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "enable", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<Boolean, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                this.this$0.getMin.setMin(z);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMin.setMin(false);
                this.this$0.getMin.onError(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to check ewallet goals balance feature ", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMax extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMin.dismissProgress();
                this.this$0.getMin.onError(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to get saving empty state config", th);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingEmptyState;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class setMin extends Lambda implements Function1<BeaconLocalBroadcastProcessor.AnonymousClass1, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMin(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BeaconLocalBroadcastProcessor.AnonymousClass1) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull BeaconLocalBroadcastProcessor.AnonymousClass1 r7) {
                Intrinsics.checkNotNullParameter(r7, "it");
                this.this$0.getMin.dismissProgress();
                updateScreenRotation.getMax min = this.this$0.getMin;
                Intrinsics.checkNotNullParameter(r7, "$this$toSavingEmptyStateModel");
                BeaconIntentProcessor mainEmptyState = r7.getMainEmptyState();
                Intrinsics.checkNotNullParameter(mainEmptyState, "$this$toMainEmptyStateModel");
                min.setMin(new onSurfaceTextureSizeChanged(new CaptureBtn.Type(mainEmptyState.getIcon(), mainEmptyState.getTitle(), mainEmptyState.getSubtitle()), setCameraFrameListener.length(r7.getSavingBenefit())));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/saving/model/SavingCreateInit;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toFloatRange extends Lambda implements Function1<getRegionExitPeriod, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toFloatRange(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((getRegionExitPeriod) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull getRegionExitPeriod getregionexitperiod) {
                Intrinsics.checkNotNullParameter(getregionexitperiod, "it");
                this.this$0.getMin.dismissProgress();
                this.this$0.getMin.setMax(getregionexitperiod);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
            final /* synthetic */ OnScrollListener this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            toIntRange(OnScrollListener onScrollListener) {
                super(1);
                this.this$0 = onScrollListener;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                this.this$0.getMin.dismissProgress();
                updateScreenRotation.getMax min = this.this$0.getMin;
                onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
                min.onError(onSurfaceTextureDestroyed.setMax(this.this$0.length, th.getLocalizedMessage()));
                updateActionSheetContent.e(DanaLogConstants.TAG.SAVING, "Fail to get saving summary", th);
            }
        }

        @Inject
        public OnScrollListener(@NotNull Context context, @NotNull updateScreenRotation.getMax getmax, @NotNull setBeaconTypeCode setbeacontypecode, @NotNull notifyCharacteristicValue notifycharacteristicvalue, @NotNull setManufacturer setmanufacturer, @NotNull setAllowUniversalAccessFromFileURLs setallowuniversalaccessfromfileurls, @NotNull setTxPower settxpower) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(getmax, "view");
            Intrinsics.checkNotNullParameter(setbeacontypecode, "getSavingSummary");
            Intrinsics.checkNotNullParameter(notifycharacteristicvalue, "getUserInfoWithKyc");
            Intrinsics.checkNotNullParameter(setmanufacturer, "initSavingCreate");
            Intrinsics.checkNotNullParameter(setallowuniversalaccessfromfileurls, "checkGoalsBalanceFeature");
            Intrinsics.checkNotNullParameter(settxpower, "getSavingEmptyState");
            this.length = context;
            this.getMin = getmax;
            this.setMax = setbeacontypecode;
            this.getMax = notifycharacteristicvalue;
            this.setMin = setmanufacturer;
            this.toFloatRange = setallowuniversalaccessfromfileurls;
            this.toIntRange = settxpower;
        }

        public final void setMin() {
            this.getMin.showProgress();
            this.setMax.execute(onReceivedIcon.INSTANCE, new equals(this), new toIntRange(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"id/dana/savings/presenter/SavingPresenter$getKycStatus$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/UserInfoResponse;", "isKycCertified", "", "()Z", "setKycCertified", "(Z)V", "onComplete", "", "onNext", "userInfoResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends GriverAppVirtualHostProxy<disconnect> {
            private boolean getMax;
            final /* synthetic */ OnScrollListener setMax;

            getMin(OnScrollListener onScrollListener) {
                this.setMax = onScrollListener;
            }

            public final /* synthetic */ void onNext(Object obj) {
                disconnect disconnect = (disconnect) obj;
                Intrinsics.checkNotNullParameter(disconnect, "userInfoResponse");
                this.getMax = disconnect.isKycCertified();
            }

            public final void onComplete() {
                this.setMax.getMin.dismissProgress();
                this.setMax.getMin.setMax(this.getMax);
            }
        }

        public final void length() {
            this.getMin.showProgress();
            this.getMax.execute(new getMin(this));
        }

        public final void getMax() {
            this.setMin.execute(onReceivedIcon.INSTANCE, new toFloatRange(this), new IsOverlapping(this));
        }

        public final void getMin() {
            this.toFloatRange.execute(onReceivedIcon.INSTANCE, new getMax(this), new length(this));
        }

        public final void IsOverlapping() {
            this.getMin.showProgress();
            this.toIntRange.execute(onReceivedIcon.INSTANCE, new setMin(this), new setMax(this));
        }

        public final void setMax() {
            this.setMax.dispose();
            this.getMax.dispose();
            this.toFloatRange.dispose();
            this.toIntRange.dispose();
        }

        public static final /* synthetic */ void length(OnScrollListener onScrollListener, Throwable th) {
            CaptureBtn captureBtn = CaptureBtn.setMin;
            String length2 = CaptureBtn.length(th);
            switch (length2.hashCode()) {
                case 1665786589:
                    if (length2.equals("DE13113048999200")) {
                        onScrollListener.getMin.getMin();
                        return;
                    }
                    break;
                case 1665786590:
                    if (length2.equals("DE13113048999201")) {
                        onScrollListener.getMin.getMin();
                        return;
                    }
                    break;
            }
            updateScreenRotation.getMax getmax = onScrollListener.getMin;
            onSurfaceTextureDestroyed onsurfacetexturedestroyed = onSurfaceTextureDestroyed.getMax;
            Context context = onScrollListener.length;
            CaptureBtn captureBtn2 = CaptureBtn.setMin;
            getmax.onError(onSurfaceTextureDestroyed.getMax(context, CaptureBtn.length(th)));
        }
    }
}

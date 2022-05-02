package id.dana.savings.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.danah5.DanaH5;
import id.dana.di.modules.SavingTopUpHistoryModule;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.SavingDetailModel;
import id.dana.savings.model.SavingModel;
import id.dana.savings.model.TopUpModel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import o.GriverCaptureActivity;
import o.Ignore;
import o.IntRange;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.inBlackList;
import o.isEnableFrameData;
import o.isShowMenu;
import o.notifyCameraOpen;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.resetInternal;
import o.setShadowResourceRight;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\n &*\u0004\u0018\u00010\u001c0\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u0019H\u0016J\b\u0010)\u001a\u00020\u0019H\u0002J\b\u0010*\u001a\u00020\u0019H\u0002J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u0019H\u0002J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u0002000/*\b\u0012\u0004\u0012\u0002000/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00062"}, d2 = {"Lid/dana/savings/activity/SavingHistoryActivity;", "Lid/dana/base/BaseActivity;", "()V", "historyAdapter", "Lid/dana/savings/adapter/HistoryAdapter;", "loadingHistory", "", "value", "Lid/dana/savings/model/SavingDetailModel;", "savingDetailModel", "setSavingDetailModel", "(Lid/dana/savings/model/SavingDetailModel;)V", "savingTopUpHistoryModule", "Lid/dana/di/modules/SavingTopUpHistoryModule;", "getSavingTopUpHistoryModule", "()Lid/dana/di/modules/SavingTopUpHistoryModule;", "savingTopUpHistoryModule$delegate", "Lkotlin/Lazy;", "savingTopUpHistoryPresenter", "Lid/dana/savings/contract/SavingTopUpHistoryContract$Presenter;", "getSavingTopUpHistoryPresenter", "()Lid/dana/savings/contract/SavingTopUpHistoryContract$Presenter;", "setSavingTopUpHistoryPresenter", "(Lid/dana/savings/contract/SavingTopUpHistoryContract$Presenter;)V", "configToolbar", "", "fetchHistory", "savingId", "", "fetchMoreHistoryTopUp", "getLastItemPosition", "", "getLayout", "getOnHistoryItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "getTopUpHistoryCurrentPage", "", "getTransactionDetailContentUrl", "kotlin.jvm.PlatformType", "bizOrderId", "init", "initComponent", "initRecyclerView", "openH5Container", "url", "prepareBundle", "setHistories", "", "Lid/dana/savings/model/TopUpModel;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SavingHistoryActivity extends BaseActivity {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    public static final int DEFAUL_THRESHOLD = 10;
    @NotNull
    public static final String EXTRA_HISTORY = "extra_history";
    public static final long TOP_UP_VIEW_SIZE = 40;
    private final Lazy IsOverlapping = LazyKt.lazy(new setMin(this));
    /* access modifiers changed from: private */
    public notifyCameraOpen getMax;
    /* access modifiers changed from: private */
    public boolean getMin;
    @Inject
    public isEnableFrameData.getMax savingTopUpHistoryPresenter;
    /* access modifiers changed from: private */
    public SavingDetailModel setMax;
    private HashMap toIntRange;

    public final void _$_clearFindViewByIdCache() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1910356383, oncanceled);
            onCancelLoad.getMin(-1910356383, oncanceled);
        }
        HashMap hashMap = this.toIntRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length2 = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length2, 4);
            onCancelLoad.setMax(-1417555513, oncanceled);
            onCancelLoad.getMin(-1417555513, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1417555513, oncanceled2);
            onCancelLoad.getMin(-1417555513, oncanceled2);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled3 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1417555513, oncanceled3);
            onCancelLoad.getMin(-1417555513, oncanceled3);
        }
        if (this.toIntRange == null) {
            this.toIntRange = new HashMap();
        }
        View view = (View) this.toIntRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toIntRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_saving_history;
    }

    public static final /* synthetic */ notifyCameraOpen access$getHistoryAdapter$p(SavingHistoryActivity savingHistoryActivity) {
        notifyCameraOpen notifycameraopen = savingHistoryActivity.getMax;
        if (notifycameraopen == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
        }
        return notifycameraopen;
    }

    @NotNull
    public final isEnableFrameData.getMax getSavingTopUpHistoryPresenter() {
        isEnableFrameData.getMax getmax = this.savingTopUpHistoryPresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingTopUpHistoryPresenter");
        }
        return getmax;
    }

    public final void setSavingTopUpHistoryPresenter(@NotNull isEnableFrameData.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.savingTopUpHistoryPresenter = getmax;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/SavingTopUpHistoryModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<SavingTopUpHistoryModule> {
        final /* synthetic */ SavingHistoryActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(SavingHistoryActivity savingHistoryActivity) {
            super(0);
            this.this$0 = savingHistoryActivity;
        }

        @NotNull
        public final SavingTopUpHistoryModule invoke() {
            return new SavingTopUpHistoryModule(new isEnableFrameData.getMin(this) {
                final /* synthetic */ setMin setMax;

                @JvmDefault
                public final void dismissProgress() {
                }

                @JvmDefault
                public final void onError(@Nullable String str) {
                }

                @JvmDefault
                public final void showProgress() {
                }

                {
                    this.setMax = r1;
                }

                public final void setMin(@NotNull SavingDetailModel savingDetailModel) {
                    Intrinsics.checkNotNullParameter(savingDetailModel, "savingDetailModel");
                    SavingHistoryActivity.access$setSavingDetailModel$p(this.setMax.this$0, savingDetailModel);
                }

                public final void getMin(@NotNull List<TopUpModel> list) {
                    Intrinsics.checkNotNullParameter(list, "historyTopUps");
                    notifyCameraOpen access$getHistoryAdapter$p = SavingHistoryActivity.access$getHistoryAdapter$p(this.setMax.this$0);
                    this.setMax.this$0.getMin = false;
                    access$getHistoryAdapter$p.getMax(SavingHistoryActivity.access$getLastItemPosition(this.setMax.this$0));
                    access$getHistoryAdapter$p.length(list);
                }

                public final void setMax() {
                    notifyCameraOpen access$getHistoryAdapter$p = SavingHistoryActivity.access$getHistoryAdapter$p(this.setMax.this$0);
                    this.setMax.this$0.getMin = false;
                    access$getHistoryAdapter$p.getMax(SavingHistoryActivity.access$getLastItemPosition(this.setMax.this$0));
                    access$getHistoryAdapter$p.getMax(new TopUpModel((String) null, (MoneyViewModel) null, (String) null, (String) null, (String) null, (Map) null, 2, 63));
                }
            });
        }
    }

    public final void configToolbar() {
        setTitle(getString(R.string.history));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0007"}, d2 = {"id/dana/savings/activity/SavingHistoryActivity$initRecyclerView$1$1$1", "Lid/dana/richview/EndlessOnScrollListener;", "getDefaultThreshold", "", "onLoadMore", "", "app_productionRelease", "id/dana/savings/activity/SavingHistoryActivity$$special$$inlined$apply$lambda$1"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverCaptureActivity.AnonymousClass15 {
        final /* synthetic */ SavingHistoryActivity getMax;
        final /* synthetic */ RecyclerView getMin;

        public final int setMax() {
            return 10;
        }

        setMax(RecyclerView recyclerView, SavingHistoryActivity savingHistoryActivity) {
            this.getMin = recyclerView;
            this.getMax = savingHistoryActivity;
        }

        public final void getMax() {
            SavingHistoryActivity.access$fetchMoreHistoryTopUp(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements Ignore.setMin {
        final /* synthetic */ SavingHistoryActivity length;

        length(SavingHistoryActivity savingHistoryActivity) {
            this.length = savingHistoryActivity;
        }

        public final void length(int i) {
            TopUpModel topUpModel = (TopUpModel) SavingHistoryActivity.access$getHistoryAdapter$p(this.length).setMin(i);
            int i2 = topUpModel.getMin;
            if (i2 == 0) {
                SavingHistoryActivity savingHistoryActivity = this.length;
                String access$getTransactionDetailContentUrl = SavingHistoryActivity.access$getTransactionDetailContentUrl(savingHistoryActivity, topUpModel.setMax);
                Intrinsics.checkNotNullExpressionValue(access$getTransactionDetailContentUrl, "getTransactionDetailContentUrl(this.bizOrderId)");
                DanaH5.startContainerFullUrl(access$getTransactionDetailContentUrl);
            } else if (i2 == 2) {
                SavingHistoryActivity.access$fetchMoreHistoryTopUp(this.length);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/savings/activity/SavingHistoryActivity$Companion;", "", "()V", "DEFAUL_THRESHOLD", "", "EXTRA_HISTORY", "", "TOP_UP_VIEW_SIZE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void init() {
        SavingDetailModel savingDetailModel;
        int length2;
        int min;
        inBlackList.getMax getmax = new inBlackList.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        Context context = null;
        if (applicationComponent != null) {
            getmax.setMax = applicationComponent;
            SavingTopUpHistoryModule savingTopUpHistoryModule = (SavingTopUpHistoryModule) this.IsOverlapping.getValue();
            if (savingTopUpHistoryModule != null) {
                getmax.setMin = savingTopUpHistoryModule;
                stopIgnoring.setMin(getmax.setMin, SavingTopUpHistoryModule.class);
                stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
                new inBlackList(getmax.setMin, getmax.setMax, (byte) 0).setMin(this);
                onDelete.getMin[] getminArr = new onDelete.getMin[1];
                isEnableFrameData.getMax getmax2 = this.savingTopUpHistoryPresenter;
                if (getmax2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingTopUpHistoryPresenter");
                }
                getminArr[0] = getmax2;
                registerPresenter(getminArr);
                Context baseContext = getBaseContext();
                if (baseContext != null) {
                    context = baseContext.getApplicationContext();
                }
                if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                    onCanceled oncanceled = new onCanceled(length2, min, 32);
                    onCancelLoad.setMax(-1061743768, oncanceled);
                    onCancelLoad.getMin(-1061743768, oncanceled);
                }
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportCompoundDrawablesTintList);
                if (recyclerView != null) {
                    notifyCameraOpen notifycameraopen = new notifyCameraOpen();
                    recyclerView.addOnScrollListener(new setMax(recyclerView, this));
                    this.getMax = notifycameraopen;
                    notifycameraopen.getMax((Ignore.setMin) new length(this));
                    Unit unit = Unit.INSTANCE;
                    recyclerView.setAdapter(notifycameraopen);
                    recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
                    recyclerView.addItemDecoration(new setShadowResourceRight(recyclerView.getContext(), IntRange.setMax(recyclerView.getContext(), R.color.f20352131099947), (float) ((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f)), 0));
                }
                Intent intent = getIntent();
                if (intent != null && (savingDetailModel = (SavingDetailModel) intent.getParcelableExtra(EXTRA_HISTORY)) != null) {
                    List<TopUpModel> list = savingDetailModel.setMin;
                    notifyCameraOpen notifycameraopen2 = this.getMax;
                    if (notifycameraopen2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
                    }
                    notifycameraopen2.getMin(list);
                    String str = savingDetailModel.getMin.getMax;
                    isEnableFrameData.getMax getmax3 = this.savingTopUpHistoryPresenter;
                    if (getmax3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("savingTopUpHistoryPresenter");
                    }
                    getmax3.setMin(str);
                    return;
                }
                return;
            }
            throw null;
        }
        throw null;
    }

    public static final /* synthetic */ void access$fetchMoreHistoryTopUp(SavingHistoryActivity savingHistoryActivity) {
        SavingModel savingModel;
        SavingDetailModel savingDetailModel = savingHistoryActivity.setMax;
        if (savingDetailModel != null) {
            if (!(savingDetailModel.setMin() && !savingHistoryActivity.getMin)) {
                savingDetailModel = null;
            }
            if (savingDetailModel != null && (savingModel = savingDetailModel.getMin) != null) {
                savingHistoryActivity.getMin = true;
                notifyCameraOpen notifycameraopen = savingHistoryActivity.getMax;
                if (notifycameraopen == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
                }
                notifycameraopen.getMax(new TopUpModel((String) null, (MoneyViewModel) null, (String) null, (String) null, (String) null, (Map) null, 1, 63));
                isEnableFrameData.getMax getmax = savingHistoryActivity.savingTopUpHistoryPresenter;
                if (getmax == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingTopUpHistoryPresenter");
                }
                String str = savingModel.getMax;
                isEnableFrameData.getMax getmax2 = savingHistoryActivity.savingTopUpHistoryPresenter;
                if (getmax2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingTopUpHistoryPresenter");
                }
                getmax2.getMax();
                getmax.getMin(str);
            }
        }
    }

    public static final /* synthetic */ String access$getTransactionDetailContentUrl(SavingHistoryActivity savingHistoryActivity, String str) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("/m/portal/transaction?bizOrderId=%s&isClosable=true", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return isShowMenu.setMin(format);
    }

    public static final /* synthetic */ void access$setSavingDetailModel$p(SavingHistoryActivity savingHistoryActivity, SavingDetailModel savingDetailModel) {
        List<TopUpModel> list;
        savingHistoryActivity.setMax = savingDetailModel;
        if (savingDetailModel != null && (list = savingDetailModel.setMin) != null) {
            notifyCameraOpen notifycameraopen = savingHistoryActivity.getMax;
            if (notifycameraopen == null) {
                Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
            }
            notifycameraopen.getMin(list);
        }
    }

    public static final /* synthetic */ int access$getLastItemPosition(SavingHistoryActivity savingHistoryActivity) {
        notifyCameraOpen notifycameraopen = savingHistoryActivity.getMax;
        if (notifycameraopen == null) {
            Intrinsics.throwUninitializedPropertyAccessException("historyAdapter");
        }
        return notifycameraopen.getItemCount() - 1;
    }
}

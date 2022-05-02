package id.dana.savings.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.SavingCreateModule;
import id.dana.di.modules.SavingUpdateModule;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.SavingModel;
import id.dana.savings.view.CategorySelectorView;
import id.dana.savings.view.SavingGoalEntryView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.BeaconLocalBroadcastProcessor;
import o.CameraView;
import o.GriverManifest;
import o.GriverProgressBar;
import o.IComponent;
import o.IntRange;
import o.PrepareException;
import o.RedDotManager;
import o.SightCameraTextureView;
import o.SightCameraViewImpl;
import o.autoGenerate;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getBigInteger;
import o.getCamera;
import o.getCameraId;
import o.isOriginHasAppInfo;
import o.observedEntities;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.readTarStreamIntoMemory;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 C2\u00020\u0001:\u0001CB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0014J\b\u0010'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020\u0012H\u0002J\b\u0010)\u001a\u00020%H\u0002J\b\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0014J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020%H\u0002J\b\u00100\u001a\u00020\u0010H\u0002J\u0010\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020\u0010H\u0002J\b\u00105\u001a\u00020%H\u0016J\b\u00106\u001a\u00020%H\u0002J\u0010\u00107\u001a\u00020%2\u0006\u00108\u001a\u00020.H\u0002J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020%H\u0002J\u000e\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020.J \u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020.H\u0002J\b\u0010A\u001a\u00020%H\u0002J\f\u0010B\u001a\u00020%*\u000203H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006D"}, d2 = {"Lid/dana/savings/activity/SavingUpdateActivity;", "Lid/dana/savings/activity/SavingCreateActivity;", "()V", "checkoutH5EventModule", "Lid/dana/di/modules/CheckoutH5EventModule;", "getCheckoutH5EventModule", "()Lid/dana/di/modules/CheckoutH5EventModule;", "checkoutH5EventModule$delegate", "Lkotlin/Lazy;", "checkoutH5EventPresenter", "Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "getCheckoutH5EventPresenter", "()Lid/dana/h5event/CheckoutH5EventContract$Presenter;", "setCheckoutH5EventPresenter", "(Lid/dana/h5event/CheckoutH5EventContract$Presenter;)V", "checkoutH5EventSuccess", "", "currentTopupAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "loadingDialog", "Lid/dana/dialog/LoadingDialog;", "getLoadingDialog", "()Lid/dana/dialog/LoadingDialog;", "loadingDialog$delegate", "minimumTargetAmount", "savingUpdateModule", "Lid/dana/di/modules/SavingUpdateModule;", "getSavingUpdateModule", "()Lid/dana/di/modules/SavingUpdateModule;", "savingUpdateModule$delegate", "savingUpdatePresenter", "Lid/dana/savings/presenter/SavingUpdatePresenter;", "getSavingUpdatePresenter", "()Lid/dana/savings/presenter/SavingUpdatePresenter;", "setSavingUpdatePresenter", "(Lid/dana/savings/presenter/SavingUpdatePresenter;)V", "categoryListenSubject", "", "configToolbar", "finishUpdateGoalSaving", "getValidEditAmount", "goToSavingGoalPage", "init", "initComponent", "initSavingUpdate", "savingId", "", "initViews", "isFreshGoals", "isSavingDataEdited", "newSavingModel", "Lid/dana/savings/model/SavingModel;", "isValidAmountForEditing", "onBackPressed", "onOpenH5", "openH5Container", "url", "prepareBundle", "restictSaveWhenAmountIsMinimum", "showErrorWarning", "text", "trackingGoalEdited", "category", "name", "level", "updateSaving", "preFillEntryField", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SavingUpdateActivity extends SavingCreateActivity {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    public static final int RESULT_CODE_SAVING_REVOKED = 1002;
    public static final int RESULT_CODE_SAVING_UPDATED = 1001;
    private HashMap IsOverlapping;
    @Inject
    public GriverManifest.AnonymousClass22.getMin checkoutH5EventPresenter;
    /* access modifiers changed from: private */
    public boolean equals;
    private final Lazy getMax = LazyKt.lazy(new toFloatRange(this));
    private final Lazy getMin = LazyKt.lazy(new IsOverlapping(this));
    @Inject
    public SightCameraViewImpl.AnonymousClass2 savingUpdatePresenter;
    private final Lazy setMax = LazyKt.lazy(new setMin(this));
    private MoneyViewModel toFloatRange;
    /* access modifiers changed from: private */
    public MoneyViewModel toIntRange;

    @JvmStatic
    public static final void startActivityForResult(@NotNull BaseActivity baseActivity, int i, @NotNull SavingModel savingModel) {
        setMax.setMin(baseActivity, i, savingModel);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1157121492, oncanceled);
            onCancelLoad.getMin(-1157121492, oncanceled);
        }
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMin extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        getMin(SavingUpdateActivity savingUpdateActivity) {
            super(1, savingUpdateActivity, SavingUpdateActivity.class, "setButtonEnable", "setButtonEnable(Z)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((SavingUpdateActivity) this.receiver).setButtonEnable(z);
        }
    }

    public static final /* synthetic */ void access$onOpenH5(SavingUpdateActivity savingUpdateActivity) {
        int length2;
        int min;
        Context baseContext = savingUpdateActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(276340535, oncanceled);
            onCancelLoad.getMin(276340535, oncanceled);
        }
        savingUpdateActivity.equals = false;
        GriverManifest.AnonymousClass22.getMin getmin = savingUpdateActivity.checkoutH5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkoutH5EventPresenter");
        }
        getmin.getMin();
    }

    public static final /* synthetic */ void access$trackingGoalEdited(SavingUpdateActivity savingUpdateActivity, String str, String str2, String str3) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(441611152, oncanceled);
            onCancelLoad.getMin(441611152, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(savingUpdateActivity.getApplicationContext());
        length2.getMax = TrackerKey.Event.GOAL_SAVINGS_EDITED;
        convertDipToPx.length max2 = length2.setMax(TrackerKey.Property.GOAL_CATEGORY, str).setMax(TrackerKey.Property.GOAL_NAME, str2).setMax(TrackerKey.Property.GOAL_AMOUNT, str3);
        max2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ void access$updateSaving(SavingUpdateActivity savingUpdateActivity) {
        MoneyViewModel targetAmount;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1483207556, oncanceled);
            onCancelLoad.getMin(-1483207556, oncanceled);
        }
        SightCameraViewImpl.AnonymousClass2 r0 = savingUpdateActivity.savingUpdatePresenter;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingUpdatePresenter");
        }
        String str = savingUpdateActivity.getSavingModel().getMax;
        CategorySelectorView categorySelectorView = (CategorySelectorView) savingUpdateActivity._$_findCachedViewById(resetInternal.setMax.setFirstVerticalStyle);
        String str2 = null;
        String selectedCategoryCode = categorySelectorView != null ? categorySelectorView.getSelectedCategoryCode() : null;
        String str3 = "";
        if (selectedCategoryCode == null) {
            selectedCategoryCode = str3;
        }
        SavingGoalEntryView savingGoalEntryView = (SavingGoalEntryView) savingUpdateActivity._$_findCachedViewById(resetInternal.setMax.isUseOnHide);
        String title = savingGoalEntryView != null ? savingGoalEntryView.getTitle() : null;
        if (title != null) {
            str3 = title;
        }
        SavingGoalEntryView savingGoalEntryView2 = (SavingGoalEntryView) savingUpdateActivity._$_findCachedViewById(resetInternal.setMax.isUseOnHide);
        if (!(savingGoalEntryView2 == null || (targetAmount = savingGoalEntryView2.getTargetAmount()) == null)) {
            String cleanAll = isOriginHasAppInfo.getCleanAll(targetAmount.setMin);
            if (cleanAll == null) {
                cleanAll = "0";
            }
            str2 = cleanAll;
        }
        String valueOf = String.valueOf(str2);
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(selectedCategoryCode, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(valueOf, "targetAmount");
        r0.setMax.showProgress();
        r0.setMin.execute(new BeaconLocalBroadcastProcessor.length(str, selectedCategoryCode, str3, valueOf), new SightCameraViewImpl.AnonymousClass2.length(r0), new SightCameraViewImpl.AnonymousClass2.setMin(r0));
    }

    @NotNull
    public final SightCameraViewImpl.AnonymousClass2 getSavingUpdatePresenter() {
        SightCameraViewImpl.AnonymousClass2 r0 = this.savingUpdatePresenter;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingUpdatePresenter");
        }
        return r0;
    }

    public final void setSavingUpdatePresenter(@NotNull SightCameraViewImpl.AnonymousClass2 r2) {
        Intrinsics.checkNotNullParameter(r2, "<set-?>");
        this.savingUpdatePresenter = r2;
    }

    @NotNull
    public final GriverManifest.AnonymousClass22.getMin getCheckoutH5EventPresenter() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1389047403, oncanceled);
            onCancelLoad.getMin(-1389047403, oncanceled);
        }
        GriverManifest.AnonymousClass22.getMin getmin = this.checkoutH5EventPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("checkoutH5EventPresenter");
        }
        return getmin;
    }

    public final void setCheckoutH5EventPresenter(@NotNull GriverManifest.AnonymousClass22.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.checkoutH5EventPresenter = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/LoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<deleteAppInfoById> {
        final /* synthetic */ SavingUpdateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(SavingUpdateActivity savingUpdateActivity) {
            super(0);
            this.this$0 = savingUpdateActivity;
        }

        @NotNull
        public final deleteAppInfoById invoke() {
            return new deleteAppInfoById(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/SavingUpdateModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<SavingUpdateModule> {
        final /* synthetic */ SavingUpdateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(SavingUpdateActivity savingUpdateActivity) {
            super(0);
            this.this$0 = savingUpdateActivity;
        }

        @NotNull
        public final SavingUpdateModule invoke() {
            return new SavingUpdateModule(new CameraView.AnonymousClass1.getMin(this) {
                final /* synthetic */ toFloatRange getMax;

                @JvmDefault
                public final void onError(@Nullable String str) {
                }

                {
                    this.getMax = r1;
                }

                public final void setMax(@NotNull SightCameraTextureView.AnonymousClass1 r3) {
                    Intrinsics.checkNotNullParameter(r3, "savingUpdateInitModel");
                    SavingGoalEntryView savingGoalEntryView = (SavingGoalEntryView) this.getMax.this$0._$_findCachedViewById(resetInternal.setMax.isUseOnHide);
                    if (savingGoalEntryView != null) {
                        savingGoalEntryView.setMaximumAmount(r3.getMin);
                    }
                    CategorySelectorView categorySelectorView = (CategorySelectorView) this.getMax.this$0._$_findCachedViewById(resetInternal.setMax.setFirstVerticalStyle);
                    if (categorySelectorView != null) {
                        categorySelectorView.setCurrentCategory(r3.length.setMin);
                        categorySelectorView.setCategories(r3.setMax);
                        categorySelectorView.selectCurrentCategory();
                        this.getMax.this$0.toIntRange = r3.length.length;
                    }
                }

                public final void setMax(@NotNull SavingModel savingModel) {
                    Intrinsics.checkNotNullParameter(savingModel, "savingModel");
                    if (this.getMax.this$0.getMax(savingModel)) {
                        SavingUpdateActivity savingUpdateActivity = this.getMax.this$0;
                        String str = savingModel.setMin;
                        String str2 = savingModel.getMin;
                        String string = this.getMax.this$0.getString(R.string.saving_level, new Object[]{CameraView.WrapperListener.length(savingModel)});
                        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.savin…getSavingLevelByAmount())");
                        SavingUpdateActivity.access$trackingGoalEdited(savingUpdateActivity, str, str2, string);
                    }
                    SavingUpdateActivity.access$finishUpdateGoalSaving(this.getMax.this$0);
                }

                public final void length(boolean z) {
                    if (z) {
                        this.getMax.this$0.showTotalSavingLimitInfoDialog(this.getMax.this$0);
                    } else {
                        this.getMax.this$0.showUpgradeToKycDialog(this.getMax.this$0);
                    }
                }

                public final void showProgress() {
                    deleteAppInfoById access$getLoadingDialog$p = SavingUpdateActivity.access$getLoadingDialog$p(this.getMax.this$0);
                    if (!access$getLoadingDialog$p.length.isShowing()) {
                        try {
                            access$getLoadingDialog$p.length.show();
                        } catch (Exception unused) {
                        }
                    }
                }

                public final void dismissProgress() {
                    SavingUpdateActivity.access$getLoadingDialog$p(this.getMax.this$0).getMin();
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/CheckoutH5EventModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<CheckoutH5EventModule> {
        final /* synthetic */ SavingUpdateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(SavingUpdateActivity savingUpdateActivity) {
            super(0);
            this.this$0 = savingUpdateActivity;
        }

        @NotNull
        public final CheckoutH5EventModule invoke() {
            return new CheckoutH5EventModule(new GriverManifest.AnonymousClass22.length(this) {
                final /* synthetic */ setMin getMin;

                {
                    this.getMin = r1;
                }

                public final void setMin(boolean z) {
                    this.getMin.this$0.equals = z;
                }
            });
        }
    }

    public final void init() {
        IComponent<Boolean> categorySavingSelectedSubject;
        int max;
        SavingModel savingModel;
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1211895075, oncanceled);
            onCancelLoad.getMin(1211895075, oncanceled);
        }
        super.init();
        Intent intent = getIntent();
        GriverProgressBar.UpdateRunnable updateRunnable = null;
        if (!(intent == null || (savingModel = (SavingModel) intent.getParcelableExtra(SavingCreateActivity.EXTRA_SAVING)) == null)) {
            Intrinsics.checkNotNullExpressionValue(savingModel, "this");
            setSavingModel(savingModel);
            int max3 = dispatchOnCancelled.getMax(0);
            if (max3 != 0) {
                onCanceled oncanceled2 = new onCanceled(0, max3, 16);
                onCancelLoad.setMax(789828922, oncanceled2);
                onCancelLoad.getMin(789828922, oncanceled2);
            }
            SavingGoalEntryView savingGoalEntryView = (SavingGoalEntryView) _$_findCachedViewById(resetInternal.setMax.isUseOnHide);
            if (savingGoalEntryView != null) {
                savingGoalEntryView.setTitle(savingModel.getMin);
            }
            SavingGoalEntryView savingGoalEntryView2 = (SavingGoalEntryView) _$_findCachedViewById(resetInternal.setMax.isUseOnHide);
            if (savingGoalEntryView2 != null) {
                savingGoalEntryView2.setGoal(savingModel.setMax.setMin);
            }
            SavingGoalEntryView savingGoalEntryView3 = (SavingGoalEntryView) _$_findCachedViewById(resetInternal.setMax.isUseOnHide);
            if (savingGoalEntryView3 != null) {
                savingGoalEntryView3.setGoalAmount(savingModel.setMax.setMin);
            }
            SavingGoalEntryView savingGoalEntryView4 = (SavingGoalEntryView) _$_findCachedViewById(resetInternal.setMax.isUseOnHide);
            if (savingGoalEntryView4 != null) {
                String cleanAll = isOriginHasAppInfo.getCleanAll(savingModel.length.setMin);
                if (cleanAll == null) {
                    cleanAll = "0";
                }
                Long longOrNull = StringsKt.toLongOrNull(cleanAll);
                savingGoalEntryView4.setMinAmount(new MoneyViewModel(String.valueOf((int) ((longOrNull != null ? longOrNull.longValue() : 0) + 1)), "Rp", (String) null, 4));
            }
            this.toFloatRange = savingModel.length;
            String str = savingModel.getMax;
            SightCameraViewImpl.AnonymousClass2 r4 = this.savingUpdatePresenter;
            if (r4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("savingUpdatePresenter");
            }
            Intrinsics.checkNotNullParameter(str, "savingId");
            r4.setMax.showProgress();
            r4.getMin.execute(str, new SightCameraViewImpl.AnonymousClass2.setMax(r4), new SightCameraViewImpl.AnonymousClass2.getMax(r4));
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1100432578 == (max = dispatchOnCancelled.getMax(applicationContext, 1100432578)))) {
            onCanceled oncanceled3 = new onCanceled(1100432578, max, 512);
            onCancelLoad.setMax(1100432578, oncanceled3);
            onCancelLoad.getMin(1100432578, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(1100432578, oncanceled4);
            onCancelLoad.getMin(1100432578, oncanceled4);
        }
        CategorySelectorView categorySelectorView = (CategorySelectorView) _$_findCachedViewById(resetInternal.setMax.setFirstVerticalStyle);
        if (!(categorySelectorView == null || (categorySavingSelectedSubject = categorySelectorView.getCategorySavingSelectedSubject()) == null)) {
            updateRunnable = categorySavingSelectedSubject.subscribe((RedDotManager<? super Boolean>) new getCameraId(new getMin(this)));
        }
        addDisposable(updateRunnable);
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.postMessage);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new length(this, this));
        }
        SavingGoalEntryView savingGoalEntryView5 = (SavingGoalEntryView) _$_findCachedViewById(resetInternal.setMax.isUseOnHide);
        if (savingGoalEntryView5 != null) {
            savingGoalEntryView5.setOnGoalChangeListener(new getMax(this));
        }
        ImageView imageView = (ImageView) _$_findCachedViewById(resetInternal.setMax.onDetachedFromWindow);
        if (imageView != null) {
            imageView.setOnClickListener(new toIntRange(this));
        }
        setUpdate(true);
    }

    /* access modifiers changed from: protected */
    public final void initComponent() {
        readTarStreamIntoMemory.length min = readTarStreamIntoMemory.setMin();
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            min.setMax = applicationComponent;
            min.getMin = new SavingCreateModule(new getCamera());
            SavingUpdateModule savingUpdateModule = (SavingUpdateModule) this.getMax.getValue();
            if (savingUpdateModule != null) {
                min.length = savingUpdateModule;
                CheckoutH5EventModule checkoutH5EventModule = (CheckoutH5EventModule) this.setMax.getValue();
                if (checkoutH5EventModule != null) {
                    min.getMax = checkoutH5EventModule;
                    getBigInteger max = min.getMax();
                    Intrinsics.checkNotNullExpressionValue(max, "DaggerSavingUpdateCompon…ule)\n            .build()");
                    setSavingUpdateComponent(max);
                    getSavingUpdateComponent().length(this);
                    onDelete.getMin[] getminArr = new onDelete.getMin[1];
                    SightCameraViewImpl.AnonymousClass2 r2 = this.savingUpdatePresenter;
                    if (r2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("savingUpdatePresenter");
                    }
                    getminArr[0] = r2;
                    registerPresenter(getminArr);
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void configToolbar() {
        setTitle(getString(R.string.edit_savings_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/savings/activity/SavingUpdateActivity$initViews$1", "Lid/dana/base/SingleClickListener;", "singleClick", "", "v", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends observedEntities {
        final /* synthetic */ SavingUpdateActivity setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(SavingUpdateActivity savingUpdateActivity, autoGenerate autogenerate) {
            super(autogenerate);
            this.setMin = savingUpdateActivity;
        }

        public final void getMin(@Nullable View view) {
            SavingUpdateActivity.access$updateSaving(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/savings/activity/SavingUpdateActivity$initViews$2", "Lid/dana/savings/view/SavingGoalEntryView$OnGoalChangeListener;", "onTargetAmountChange", "", "edited", "", "onTittleChange", "title", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements SavingGoalEntryView.setMin {
        final /* synthetic */ SavingUpdateActivity setMin;

        getMax(SavingUpdateActivity savingUpdateActivity) {
            this.setMin = savingUpdateActivity;
        }

        public final void setMin(boolean z) {
            if (this.setMin.setMin()) {
                this.setMin.setButtonEnable(z);
            } else if (!z) {
                SavingUpdateActivity.access$restictSaveWhenAmountIsMinimum(this.setMin);
            }
        }

        public final void setMax(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-598991016, oncanceled);
                onCancelLoad.getMin(-598991016, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, "title");
            if (!Intrinsics.areEqual((Object) this.setMin.getSavingModel().getMin, (Object) str)) {
                this.setMin.setButtonEnable(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ SavingUpdateActivity length;

        toIntRange(SavingUpdateActivity savingUpdateActivity) {
            this.length = savingUpdateActivity;
        }

        public final void onClick(View view) {
            SightCameraViewImpl.AnonymousClass2 savingUpdatePresenter = this.length.getSavingUpdatePresenter();
            savingUpdatePresenter.setMax.showProgress();
            savingUpdatePresenter.getMax.execute(new SightCameraViewImpl.AnonymousClass2.getMin(savingUpdatePresenter));
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMax(SavingModel savingModel) {
        if ((!Intrinsics.areEqual((Object) getSavingModel().getMin, (Object) savingModel.getMin)) || (!Intrinsics.areEqual((Object) getSavingModel().setMax, (Object) savingModel.setMax)) || (!Intrinsics.areEqual((Object) getSavingModel().setMin, (Object) savingModel.setMin))) {
            return true;
        }
        return false;
    }

    public final void onBackPressed() {
        showQuitEditingDialog(R.string.pop_up_title_cancel_edit_saving_goal, R.string.pop_up_desc_cancel_edit_saving_goal, R.string.pop_up_negative_button_cancel_edit_saving_goal, R.string.pop_up_positive_button_cancel_edit_saving_goal);
    }

    /* access modifiers changed from: private */
    public final boolean setMin() {
        MoneyViewModel moneyViewModel;
        if (getMax()) {
            return true;
        }
        SavingGoalEntryView savingGoalEntryView = (SavingGoalEntryView) _$_findCachedViewById(resetInternal.setMax.isUseOnHide);
        MoneyViewModel targetAmount = savingGoalEntryView != null ? savingGoalEntryView.getTargetAmount() : null;
        if (targetAmount == null || (moneyViewModel = this.toFloatRange) == null) {
            return false;
        }
        return moneyViewModel.getMin(targetAmount);
    }

    private final boolean getMax() {
        String str;
        MoneyViewModel moneyViewModel = this.toIntRange;
        if (moneyViewModel != null) {
            str = moneyViewModel.setMin;
        } else {
            str = null;
        }
        return Intrinsics.areEqual((Object) str, (Object) "0");
    }

    public final void showErrorWarning(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        AppCompatTextView appCompatTextView = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getNavigationIcon);
        if (appCompatTextView != null) {
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getNavigationIcon);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(str);
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) _$_findCachedViewById(resetInternal.setMax.getNavigationIcon);
        if (appCompatTextView3 != null) {
            appCompatTextView3.setTextColor(IntRange.setMax(this, R.color.f23802131100313));
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.tv_warning_note);
        if (textView != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_warning_14, 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/savings/activity/SavingUpdateActivity$Companion;", "", "()V", "RESULT_CODE_SAVING_REVOKED", "", "RESULT_CODE_SAVING_UPDATED", "startActivityForResult", "", "activity", "Lid/dana/base/BaseActivity;", "requestCode", "savingModel", "Lid/dana/savings/model/SavingModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        @JvmStatic
        public static void setMin(@NotNull BaseActivity baseActivity, int i, @NotNull SavingModel savingModel) {
            Intrinsics.checkNotNullParameter(baseActivity, AkuEventParamsKey.KEY_ACTIVITY);
            Intrinsics.checkNotNullParameter(savingModel, "savingModel");
            Intent intentClassWithTracking = baseActivity.getIntentClassWithTracking(SavingUpdateActivity.class);
            intentClassWithTracking.putExtra(SavingCreateActivity.EXTRA_SAVING, savingModel);
            baseActivity.startActivityForResult(intentClassWithTracking, i);
        }
    }

    public static final /* synthetic */ void access$restictSaveWhenAmountIsMinimum(SavingUpdateActivity savingUpdateActivity) {
        Integer num;
        int length2;
        int min;
        savingUpdateActivity.setButtonEnable(false);
        Object[] objArr = new Object[1];
        Context baseContext = savingUpdateActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1839982051, oncanceled);
            onCancelLoad.getMin(-1839982051, oncanceled);
        }
        MoneyViewModel moneyViewModel = savingUpdateActivity.toFloatRange;
        if (moneyViewModel != null) {
            String cleanAll = isOriginHasAppInfo.getCleanAll(moneyViewModel.setMin);
            if (cleanAll == null) {
                cleanAll = "0";
            }
            Long longOrNull = StringsKt.toLongOrNull(cleanAll);
            num = Integer.valueOf((int) ((longOrNull != null ? longOrNull.longValue() : 0) + 1));
        } else {
            num = null;
        }
        MoneyViewModel moneyViewModel2 = new MoneyViewModel(String.valueOf(num), "Rp", (String) null, 4);
        StringBuilder sb = new StringBuilder();
        sb.append(moneyViewModel2.getMin);
        sb.append(moneyViewModel2.setMin);
        objArr[0] = sb.toString();
        String string = savingUpdateActivity.getString(R.string.minimum_savings_target_warning, objArr);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.minim…unt().getDisplayAmount())");
        savingUpdateActivity.showErrorWarning(string);
    }

    public static final /* synthetic */ void access$goToSavingGoalPage(SavingUpdateActivity savingUpdateActivity) {
        Intent intent = new Intent(savingUpdateActivity, SavingsActivity.class);
        intent.setFlags(603979776);
        savingUpdateActivity.startActivity(intent);
        savingUpdateActivity.finish();
    }

    public static final /* synthetic */ void access$finishUpdateGoalSaving(SavingUpdateActivity savingUpdateActivity) {
        savingUpdateActivity.setResult(1001);
        savingUpdateActivity.finish();
    }

    public static final /* synthetic */ deleteAppInfoById access$getLoadingDialog$p(SavingUpdateActivity savingUpdateActivity) {
        return (deleteAppInfoById) savingUpdateActivity.getMin.getValue();
    }
}

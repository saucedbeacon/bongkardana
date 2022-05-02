package id.dana.savings.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import butterknife.OnClick;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.danah5.DanaH5;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.SavingCreateModule;
import id.dana.di.modules.SavingUpdateModule;
import id.dana.dialog.DialogWithImage;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CameraView;
import o.GriverManifest;
import o.PrepareException;
import o.SightCameraTextureView;
import o.autoGenerate;
import o.convertDipToPx;
import o.convertSpToPx;
import o.deleteAppInfoById;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getBigInteger;
import o.getProgressViewStartOffset;
import o.notifyMicError;
import o.observedEntities;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.readTarStreamIntoMemory;
import o.resetInternal;
import o.setViewType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 G2\u00020\u0001:\u0001GB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010'\u001a\u00020(H\u0014J\u0010\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020(H\u0016J\b\u0010/\u001a\u00020(H\u0014J\b\u00100\u001a\u00020(H\u0002J\b\u00101\u001a\u00020(H\u0016J\b\u00102\u001a\u00020(H\u0007J\u0010\u00103\u001a\u00020(2\u0006\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020(H\u0002J\u000e\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0004J&\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020-J&\u0010=\u001a\u00020(2\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020-2\u0006\u0010<\u001a\u00020-J\u0010\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020@H\u0004J\u0010\u0010A\u001a\u00020(2\u0006\u0010?\u001a\u00020@H\u0004J\u0006\u0010B\u001a\u00020(J \u0010C\u001a\u00020(2\u0006\u0010D\u001a\u00020+2\u0006\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u00020+H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006H"}, d2 = {"Lid/dana/savings/activity/SavingCreateActivity;", "Lid/dana/base/BaseActivity;", "()V", "isUpdate", "", "()Z", "setUpdate", "(Z)V", "loadingDialog", "Lid/dana/dialog/LoadingDialog;", "getLoadingDialog", "()Lid/dana/dialog/LoadingDialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "presenter", "Lid/dana/savings/contract/SavingCreateContract$Presenter;", "getPresenter", "()Lid/dana/savings/contract/SavingCreateContract$Presenter;", "setPresenter", "(Lid/dana/savings/contract/SavingCreateContract$Presenter;)V", "savingCreateInitModel", "Lid/dana/savings/model/SavingCreateInitModel;", "savingCreateModule", "Lid/dana/di/modules/SavingCreateModule;", "getSavingCreateModule", "()Lid/dana/di/modules/SavingCreateModule;", "savingCreateModule$delegate", "savingModel", "Lid/dana/savings/model/SavingModel;", "getSavingModel", "()Lid/dana/savings/model/SavingModel;", "setSavingModel", "(Lid/dana/savings/model/SavingModel;)V", "savingUpdateComponent", "Lid/dana/di/component/SavingUpdateComponent;", "getSavingUpdateComponent", "()Lid/dana/di/component/SavingUpdateComponent;", "setSavingUpdateComponent", "(Lid/dana/di/component/SavingUpdateComponent;)V", "configToolbar", "", "finishCreateGoalSaving", "getActionButtonTitle", "", "getLayout", "", "init", "initComponent", "initViews", "onBackPressed", "onTotalSavingLimitAboutClick", "openH5Container", "url", "openKycContainer", "setButtonEnable", "enable", "showCancelDialog", "titleResId", "messageResId", "positiveBtnResId", "negativeBtnResId", "showQuitEditingDialog", "showTotalSavingLimitInfoDialog", "context", "Landroid/content/Context;", "showUpgradeToKycDialog", "trackCanceledCreateActivity", "trackingCreateSaving", "category", "name", "level", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class SavingCreateActivity extends BaseActivity {
    @NotNull
    public static final getMax Companion = new getMax((byte) 0);
    @NotNull
    public static final String EXTRA_CREATED_SAVING = "created_saving_model";
    @NotNull
    public static final String EXTRA_SAVING = "extra_saving";
    /* access modifiers changed from: private */
    public setViewType getMax;
    private final Lazy getMin = LazyKt.lazy(new setMax(this));
    private HashMap isInside;
    @Inject
    public notifyMicError.getMin presenter;
    public SavingModel savingModel;
    protected getBigInteger savingUpdateComponent;
    private boolean setMax;
    private final Lazy toFloatRange = LazyKt.lazy(new isInside(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onGetCheckoutH5EventSuccess"}, k = 3, mv = {1, 4, 2})
    static final class length implements GriverManifest.AnonymousClass22.length {
        public static final length length = new length();

        length() {
        }

        public final void setMin(boolean z) {
        }
    }

    @JvmStatic
    public static final void startActivityForResult(@NotNull BaseActivity baseActivity, int i) {
        getMax.length(baseActivity, i);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1162900715, oncanceled);
            onCancelLoad.getMin(1162900715, oncanceled);
        }
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getLayout() {
        return R.layout.activity_create_update_saving;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SavingCreateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(SavingCreateActivity savingCreateActivity) {
            super(1);
            this.this$0 = savingCreateActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.this$0.trackCanceledCreateActivity();
            SavingCreateActivity.super.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SavingCreateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(SavingCreateActivity savingCreateActivity) {
            super(1);
            this.this$0 = savingCreateActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            this.this$0.trackCanceledCreateActivity();
            SavingCreateActivity.super.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<View, Unit> {
        public static final toDoubleRange INSTANCE = new toDoubleRange();

        toDoubleRange() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<View, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<View, Unit> {
        public static final toIntRange INSTANCE = new toIntRange();

        toIntRange() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ SavingCreateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(SavingCreateActivity savingCreateActivity) {
            super(1);
            this.this$0 = savingCreateActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            DanaH5.startContainerFullUrl("https://m.dana.id/m/kyc/landingPage?entryPoint=goalSaving");
        }
    }

    public static final /* synthetic */ void access$finishCreateGoalSaving(SavingCreateActivity savingCreateActivity, SavingModel savingModel2) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1825032819, oncanceled);
            onCancelLoad.getMin(-1825032819, oncanceled);
        }
        Intent intent = new Intent();
        intent.putExtra(EXTRA_CREATED_SAVING, savingModel2);
        savingCreateActivity.setResult(-1, intent);
        savingCreateActivity.finish();
    }

    @NotNull
    public final notifyMicError.getMin getPresenter() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1041895037 == (max = dispatchOnCancelled.getMax(applicationContext, 1041895037)))) {
            onCanceled oncanceled = new onCanceled(1041895037, max, 512);
            onCancelLoad.setMax(1041895037, oncanceled);
            onCancelLoad.getMin(1041895037, oncanceled);
        }
        notifyMicError.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return getmin;
    }

    public final void setPresenter(@NotNull notifyMicError.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.presenter = getmin;
    }

    @NotNull
    public final SavingModel getSavingModel() {
        SavingModel savingModel2 = this.savingModel;
        if (savingModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingModel");
        }
        return savingModel2;
    }

    public final void setSavingModel(@NotNull SavingModel savingModel2) {
        Intrinsics.checkNotNullParameter(savingModel2, "<set-?>");
        this.savingModel = savingModel2;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final getBigInteger getSavingUpdateComponent() {
        getBigInteger getbiginteger = this.savingUpdateComponent;
        if (getbiginteger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("savingUpdateComponent");
        }
        return getbiginteger;
    }

    /* access modifiers changed from: protected */
    public final void setSavingUpdateComponent(@NotNull getBigInteger getbiginteger) {
        Intrinsics.checkNotNullParameter(getbiginteger, "<set-?>");
        this.savingUpdateComponent = getbiginteger;
    }

    /* access modifiers changed from: protected */
    public final boolean isUpdate() {
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    public final void setUpdate(boolean z) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1114875381 == (max = dispatchOnCancelled.getMax(applicationContext, 1114875381)))) {
            onCanceled oncanceled = new onCanceled(1114875381, max, 512);
            onCancelLoad.setMax(1114875381, oncanceled);
            onCancelLoad.getMin(1114875381, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(1114875381, oncanceled2);
            onCancelLoad.getMin(1114875381, oncanceled2);
        }
        this.setMax = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/LoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<deleteAppInfoById> {
        final /* synthetic */ SavingCreateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(SavingCreateActivity savingCreateActivity) {
            super(0);
            this.this$0 = savingCreateActivity;
        }

        @NotNull
        public final deleteAppInfoById invoke() {
            return new deleteAppInfoById(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/di/modules/SavingCreateModule;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<SavingCreateModule> {
        final /* synthetic */ SavingCreateActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(SavingCreateActivity savingCreateActivity) {
            super(0);
            this.this$0 = savingCreateActivity;
        }

        @NotNull
        public final SavingCreateModule invoke() {
            return new SavingCreateModule(new notifyMicError.setMax(this) {
                final /* synthetic */ isInside getMin;

                @JvmDefault
                public final void onError(@Nullable String str) {
                }

                {
                    this.getMin = r1;
                }

                public final void getMin(@NotNull setViewType setviewtype) {
                    Intrinsics.checkNotNullParameter(setviewtype, "savingCreateInitModel");
                    this.getMin.this$0.getMax = setviewtype;
                    SavingGoalEntryView savingGoalEntryView = (SavingGoalEntryView) this.getMin.this$0._$_findCachedViewById(resetInternal.setMax.isUseOnHide);
                    if (savingGoalEntryView != null) {
                        savingGoalEntryView.setMaximumAmount(setviewtype.getMin);
                    }
                    CategorySelectorView categorySelectorView = (CategorySelectorView) this.getMin.this$0._$_findCachedViewById(resetInternal.setMax.setFirstVerticalStyle);
                    if (categorySelectorView != null) {
                        categorySelectorView.setCategories(setviewtype.setMax);
                    }
                }

                public final void getMax(@NotNull SavingModel savingModel) {
                    Intrinsics.checkNotNullParameter(savingModel, "savingModel");
                    SavingCreateActivity savingCreateActivity = this.getMin.this$0;
                    String str = savingModel.setMin;
                    String str2 = savingModel.getMin;
                    String string = this.getMin.this$0.getString(R.string.saving_level, new Object[]{CameraView.WrapperListener.length(savingModel)});
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.savin…getSavingLevelByAmount())");
                    SavingCreateActivity.access$trackingCreateSaving(savingCreateActivity, str, str2, string);
                    SavingCreateActivity.access$finishCreateGoalSaving(this.getMin.this$0, savingModel);
                }

                public final void setMax() {
                    this.getMin.this$0.setButtonEnable(false);
                    this.getMin.this$0.getPresenter().setMin();
                }

                public final void getMax(boolean z) {
                    if (z) {
                        this.getMin.this$0.showTotalSavingLimitInfoDialog(this.getMin.this$0);
                    } else {
                        this.getMin.this$0.showUpgradeToKycDialog(this.getMin.this$0);
                    }
                }

                public final void showProgress() {
                    deleteAppInfoById access$getLoadingDialog$p = SavingCreateActivity.access$getLoadingDialog$p(this.getMin.this$0);
                    if (!access$getLoadingDialog$p.length.isShowing()) {
                        try {
                            access$getLoadingDialog$p.length.show();
                        } catch (Exception unused) {
                        }
                    }
                }

                public final void dismissProgress() {
                    SavingCreateActivity.access$getLoadingDialog$p(this.getMin.this$0).getMin();
                }
            });
        }
    }

    public final void setButtonEnable(boolean z) {
        String str;
        String str2;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1098840019, oncanceled);
            onCancelLoad.getMin(1098840019, oncanceled);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.postMessage);
        if (danaButtonPrimaryView != null) {
            if (z) {
                if (this.setMax) {
                    str2 = getString(R.string.saving_save_changes);
                    Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.saving_save_changes)");
                } else {
                    str2 = getString(R.string.create_savings);
                    Intrinsics.checkNotNullExpressionValue(str2, "getString(R.string.create_savings)");
                }
                danaButtonPrimaryView.setActiveButton(str2, (Drawable) null);
            } else {
                if (this.setMax) {
                    str = getString(R.string.saving_save_changes);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.saving_save_changes)");
                } else {
                    str = getString(R.string.create_savings);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(R.string.create_savings)");
                }
                danaButtonPrimaryView.setDisabled(str);
            }
            danaButtonPrimaryView.setEnabled(z);
        }
    }

    public void init() {
        initComponent();
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.postMessage);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new getMin(this, this));
        }
        SavingGoalEntryView savingGoalEntryView = (SavingGoalEntryView) _$_findCachedViewById(resetInternal.setMax.isUseOnHide);
        if (savingGoalEntryView != null) {
            savingGoalEntryView.setOnGoalChangeListener(new setMin(this));
        }
        notifyMicError.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/savings/activity/SavingCreateActivity$initViews$1", "Lid/dana/base/SingleClickListener;", "singleClick", "", "v", "Landroid/view/View;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends observedEntities {
        final /* synthetic */ SavingCreateActivity getMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(SavingCreateActivity savingCreateActivity, autoGenerate autogenerate) {
            super(autogenerate);
            this.getMin = savingCreateActivity;
        }

        public final void getMin(@Nullable View view) {
            MoneyViewModel moneyViewModel;
            MoneyViewModel moneyViewModel2;
            notifyMicError.getMin presenter = this.getMin.getPresenter();
            CategorySelectorView categorySelectorView = (CategorySelectorView) this.getMin._$_findCachedViewById(resetInternal.setMax.setFirstVerticalStyle);
            String selectedCategoryCode = categorySelectorView != null ? categorySelectorView.getSelectedCategoryCode() : null;
            String str = "";
            if (selectedCategoryCode == null) {
                selectedCategoryCode = str;
            }
            SavingGoalEntryView savingGoalEntryView = (SavingGoalEntryView) this.getMin._$_findCachedViewById(resetInternal.setMax.isUseOnHide);
            String title = savingGoalEntryView != null ? savingGoalEntryView.getTitle() : null;
            if (title != null) {
                str = title;
            }
            SavingGoalEntryView savingGoalEntryView2 = (SavingGoalEntryView) this.getMin._$_findCachedViewById(resetInternal.setMax.isUseOnHide);
            if (savingGoalEntryView2 == null || (moneyViewModel = savingGoalEntryView2.getTargetAmount()) == null) {
                moneyViewModel = new MoneyViewModel("0", "Rp", (String) null, 4);
            }
            setViewType access$getSavingCreateInitModel$p = this.getMin.getMax;
            if (access$getSavingCreateInitModel$p == null || (moneyViewModel2 = access$getSavingCreateInitModel$p.getMin) == null) {
                moneyViewModel2 = new MoneyViewModel("0", "Rp", (String) null, 4);
            }
            presenter.getMin(selectedCategoryCode, str, moneyViewModel, moneyViewModel2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/savings/activity/SavingCreateActivity$initViews$2", "Lid/dana/savings/view/SavingGoalEntryView$OnGoalChangeListener;", "onTargetAmountChange", "", "valid", "", "onTittleChange", "title", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements SavingGoalEntryView.setMin {
        final /* synthetic */ SavingCreateActivity getMax;

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "title");
        }

        setMin(SavingCreateActivity savingCreateActivity) {
            this.getMax = savingCreateActivity;
        }

        public final void setMin(boolean z) {
            this.getMax.setButtonEnable(z);
        }
    }

    /* access modifiers changed from: protected */
    public void initComponent() {
        int length2;
        readTarStreamIntoMemory.length min = readTarStreamIntoMemory.setMin();
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            min.setMax = applicationComponent;
            Context baseContext = getBaseContext();
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
                onCanceled oncanceled = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-1744529136, oncanceled);
                onCancelLoad.getMin(-1744529136, oncanceled);
            }
            SavingCreateModule savingCreateModule = (SavingCreateModule) this.toFloatRange.getValue();
            if (savingCreateModule != null) {
                min.getMin = savingCreateModule;
                min.length = new SavingUpdateModule(new CameraView.AnonymousClass1.getMin() {
                    @JvmDefault
                    public final void dismissProgress() {
                    }

                    public final void length(boolean z) {
                    }

                    @JvmDefault
                    public final void onError(@Nullable String str) {
                    }

                    public final void setMax(@NotNull SavingModel savingModel) {
                        Intrinsics.checkNotNullParameter(savingModel, "savingModel");
                    }

                    public final void setMax(@NotNull SightCameraTextureView.AnonymousClass1 r2) {
                        Intrinsics.checkNotNullParameter(r2, "savingUpdateInitModel");
                    }

                    @JvmDefault
                    public final void showProgress() {
                    }
                });
                min.getMax = new CheckoutH5EventModule(length.length);
                getBigInteger max = min.getMax();
                Intrinsics.checkNotNullExpressionValue(max, "DaggerSavingUpdateCompon… }))\n            .build()");
                this.savingUpdateComponent = max;
                if (max == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("savingUpdateComponent");
                }
                max.getMin(this);
                onDelete.getMin[] getminArr = new onDelete.getMin[1];
                notifyMicError.getMin getmin = this.presenter;
                if (getmin == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("presenter");
                }
                getminArr[0] = getmin;
                registerPresenter(getminArr);
                return;
            }
            throw null;
        }
        throw null;
    }

    public void configToolbar() {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1564866853, oncanceled);
            onCancelLoad.getMin(-1564866853, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1564866853, oncanceled2);
            onCancelLoad.getMin(-1564866853, oncanceled2);
        }
        setTitle(getString(R.string.create_savings_title));
        setMenuLeftButton((int) R.drawable.btn_arrow_left);
    }

    public void onBackPressed() {
        showCancelDialog(R.string.pop_up_title_cancel_create_saving_goal, R.string.pop_up_description_cancel_create_saving_goal, R.string.pop_up_positive_button_cancel_create_saving_goal, R.string.pop_up_negative_button_cancel_create_saving_goal);
    }

    public final void showCancelDialog(int i, int i2, int i3, int i4) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(843592335, oncanceled);
            onCancelLoad.getMin(843592335, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(843592335, oncanceled2);
            onCancelLoad.getMin(843592335, oncanceled2);
        }
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this);
        getmax.toFloatRange = getString(i);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = getString(i2);
        getProgressViewStartOffset.getMax max2 = getmax2.IsOverlapping().setMax(false);
        max2.toIntRange = 0;
        getProgressViewStartOffset.getMax max3 = max2.setMin(getString(i3), toFloatRange.INSTANCE).getMax(getString(i4), new equals(this));
        new getProgressViewStartOffset(max3.invoke, max3.length, max3, max3.equals, (byte) 0).getMin().show();
    }

    public final void showQuitEditingDialog(int i, int i2, int i3, int i4) {
        int min;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(1069554582, oncanceled);
            onCancelLoad.getMin(1069554582, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(1069554582, oncanceled2);
            onCancelLoad.getMin(1069554582, oncanceled2);
        }
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this);
        getmax.toFloatRange = getString(i);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = getString(i2);
        getProgressViewStartOffset.getMax max = getmax2.IsOverlapping().setMax(false);
        max.toIntRange = 0;
        getProgressViewStartOffset.getMax max2 = max.setMin(getString(i3), new IsOverlapping(this)).getMax(getString(i4), toIntRange.INSTANCE);
        new getProgressViewStartOffset(max2.invoke, max2.length, max2, max2.equals, (byte) 0).getMin().show();
    }

    @OnClick({2131363662})
    public final void onTotalSavingLimitAboutClick() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(341808609, oncanceled);
            onCancelLoad.getMin(341808609, oncanceled);
        }
        notifyMicError.getMin getmin = this.presenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        getmin.setMin();
    }

    /* access modifiers changed from: protected */
    public final void showTotalSavingLimitInfoDialog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        DialogWithImage.getMin getmin = new DialogWithImage.getMin();
        getmin.getMax = getString(R.string.pop_up_title_saving_limit_about_info);
        getmin.setMin = getString(R.string.pop_up_description_saving_limit_about_info);
        DialogWithImage.getMin max = getmin.getMax(false).setMax(false);
        max.getMin = getString(R.string.pop_up_positive_button_saving_limit_info);
        max.toFloatRange = R.drawable.maximum_limit;
        new DialogWithImage(context, max.setMax, max, (byte) 0).setMin();
    }

    /* access modifiers changed from: protected */
    public final void showUpgradeToKycDialog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(context);
        getmax.toFloatRange = getString(R.string.saving_withdrawal_title_dialog);
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = getString(R.string.pop_up_description_saving_limit_about_info_non_kyc);
        getProgressViewStartOffset.getMax getmax3 = getmax2;
        getmax3.setMax = R.drawable.ic_premium_feature;
        getProgressViewStartOffset.getMax getmax4 = getmax3;
        getmax4.toIntRange = 0;
        getProgressViewStartOffset.getMax min = getmax4.IsOverlapping().setMax(false).getMax(getString(R.string.saving_withdrawal_negative_dialog), toDoubleRange.INSTANCE).setMin(getString(R.string.upgrade), new toString(this));
        new getProgressViewStartOffset(min.invoke, min.length, min, min.equals, (byte) 0).getMin().show();
    }

    public final void trackCanceledCreateActivity() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 448413203 == (max = dispatchOnCancelled.getMax(applicationContext, 448413203)))) {
            onCanceled oncanceled = new onCanceled(448413203, max, 512);
            onCancelLoad.setMax(448413203, oncanceled);
            onCancelLoad.getMin(448413203, oncanceled);
        }
        convertDipToPx.length length2 = new convertDipToPx.length(getApplicationContext());
        length2.getMax = TrackerKey.Event.GOAL_SAVINGS_CANCELLED;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/savings/activity/SavingCreateActivity$Companion;", "", "()V", "EXTRA_CREATED_SAVING", "", "EXTRA_SAVING", "startActivityForResult", "", "activity", "Lid/dana/base/BaseActivity;", "requestCode", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }

        @JvmStatic
        public static void length(@NotNull BaseActivity baseActivity, int i) {
            Intrinsics.checkNotNullParameter(baseActivity, AkuEventParamsKey.KEY_ACTIVITY);
            baseActivity.startActivityForResult(baseActivity.getIntentClassWithTracking(SavingCreateActivity.class), i);
        }
    }

    public static final /* synthetic */ void access$trackingCreateSaving(SavingCreateActivity savingCreateActivity, String str, String str2, String str3) {
        convertDipToPx.length length2 = new convertDipToPx.length(savingCreateActivity.getApplicationContext());
        length2.getMax = TrackerKey.Event.GOAL_SAVINGS_CREATED;
        convertDipToPx.length max = length2.setMax(TrackerKey.Property.GOAL_CATEGORY, str).setMax(TrackerKey.Property.GOAL_NAME, str2).setMax(TrackerKey.Property.GOAL_AMOUNT, str3);
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ deleteAppInfoById access$getLoadingDialog$p(SavingCreateActivity savingCreateActivity) {
        return (deleteAppInfoById) savingCreateActivity.getMin.getValue();
    }
}

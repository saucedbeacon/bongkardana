package id.dana.sendmoney_v2.recipient.activity;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.cellcomponent.DanaCellRightView;
import id.dana.di.modules.SortingSendMoneyModule;
import id.dana.sendmoney_v2.constants.SortingByConst;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.Action;
import o.BeaconParser;
import o.BindArray;
import o.NebulaLoadingView;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onTimeout;
import o.resetInternal;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\nH\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/SortBankAccountBottomSheetActivity;", "Lid/dana/base/BaseActivity;", "()V", "presenterSorting", "Lid/dana/contract/sendmoney/v2/SortingSendMoneyPresenter;", "getPresenterSorting", "()Lid/dana/contract/sendmoney/v2/SortingSendMoneyPresenter;", "setPresenterSorting", "(Lid/dana/contract/sendmoney/v2/SortingSendMoneyPresenter;)V", "closeBottomSheet", "", "getLayout", "", "init", "injectComponent", "onStart", "saveSortBankAccount", "sortedBy", "", "setSortIcon", "setupSortBankAccount", "setupSwipeListener", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SortBankAccountBottomSheetActivity extends BaseActivity {
    @NotNull
    public static final length Companion = new length((byte) 0);
    public static final int SORT_REQUEST_CODE = 69;
    private HashMap getMin;
    @Inject
    public Action presenterSorting;

    public final void _$_clearFindViewByIdCache() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(352602714, oncanceled);
            onCancelLoad.getMin(352602714, oncanceled);
        }
        HashMap hashMap = this.getMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (length2 = dispatchOnCancelled.length(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, length2, 4);
            onCancelLoad.setMax(1953381646, oncanceled);
            onCancelLoad.getMin(1953381646, oncanceled);
        }
        if (this.getMin == null) {
            this.getMin = new HashMap();
        }
        View view = (View) this.getMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.getMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (applicationContext == null || 1643242144 == (max = dispatchOnCancelled.getMax(applicationContext, 1643242144))) {
            return R.layout.activity_sort_bank_account_bottom_sheet;
        }
        onCanceled oncanceled = new onCanceled(1643242144, max, 512);
        onCancelLoad.setMax(1643242144, oncanceled);
        onCancelLoad.getMin(1643242144, oncanceled);
        return R.layout.activity_sort_bank_account_bottom_sheet;
    }

    @NotNull
    public final Action getPresenterSorting() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1634191102, oncanceled);
            onCancelLoad.getMin(1634191102, oncanceled);
        }
        Action action = this.presenterSorting;
        if (action == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenterSorting");
        }
        return action;
    }

    public final void setPresenterSorting(@NotNull Action action) {
        Intrinsics.checkNotNullParameter(action, "<set-?>");
        this.presenterSorting = action;
    }

    public final void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    public final void init() {
        int max;
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1123018520, oncanceled);
            onCancelLoad.getMin(1123018520, oncanceled);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.add);
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(new isInside(this, this));
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1012021737 == (max = dispatchOnCancelled.getMax(applicationContext2, 1012021737)))) {
            onCanceled oncanceled2 = new onCanceled(1012021737, max, 512);
            onCancelLoad.setMax(1012021737, oncanceled2);
            onCancelLoad.getMin(1012021737, oncanceled2);
        }
        ((AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setTheme)).setOnClickListener(new getMax(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.clear);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new setMax(this));
        }
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.removeGroup);
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new getMin(this));
        }
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.clearAll);
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new toIntRange(this));
        }
        onTimeout.getMax getmax = new onTimeout.getMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            getmax.setMax = applicationComponent;
            getmax.getMax = new SortingSendMoneyModule(new setMin(this));
            stopIgnoring.setMin(getmax.getMax, SortingSendMoneyModule.class);
            stopIgnoring.setMin(getmax.setMax, PrepareException.AnonymousClass1.class);
            new onTimeout(getmax.getMax, getmax.setMax, (byte) 0).getMin(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            Action action = this.presenterSorting;
            if (action == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenterSorting");
            }
            getminArr[0] = action;
            registerPresenter(getminArr);
            Action action2 = this.presenterSorting;
            if (action2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenterSorting");
            }
            action2.getMax();
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"id/dana/sendmoney_v2/recipient/activity/SortBankAccountBottomSheetActivity$injectComponent$1", "Lid/dana/contract/sendmoney/v2/SortingSendMoneyContract$View;", "onErrorSaveSortSendMoney", "", "onGetSortingSendMoney", "sortedBy", "", "onSuccessSaveSortingSendMoney", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements BindArray.getMin {
        final /* synthetic */ SortBankAccountBottomSheetActivity getMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity) {
            this.getMin = sortBankAccountBottomSheetActivity;
        }

        public final void setMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "sortedBy");
            SortBankAccountBottomSheetActivity.access$setSortIcon(this.getMin, str);
        }

        public final void setMin() {
            this.getMin.setResult(-1);
            this.getMin.finish();
        }

        public final void getMax() {
            this.getMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ SortBankAccountBottomSheetActivity setMax;

        setMax(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity) {
            this.setMax = sortBankAccountBottomSheetActivity;
        }

        public final void onClick(View view) {
            SortBankAccountBottomSheetActivity.access$saveSortBankAccount(this.setMax, SortingByConst.FREQUENT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ SortBankAccountBottomSheetActivity getMin;

        getMin(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity) {
            this.getMin = sortBankAccountBottomSheetActivity;
        }

        public final void onClick(View view) {
            SortBankAccountBottomSheetActivity.access$saveSortBankAccount(this.getMin, "RECENT");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ SortBankAccountBottomSheetActivity getMin;

        toIntRange(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity) {
            this.getMin = sortBankAccountBottomSheetActivity;
        }

        public final void onClick(View view) {
            SortBankAccountBottomSheetActivity.access$saveSortBankAccount(this.getMin, "ALPHABET");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ SortBankAccountBottomSheetActivity getMax;

        getMax(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity) {
            this.getMax = sortBankAccountBottomSheetActivity;
        }

        public final void onClick(View view) {
            this.getMax.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/sendmoney_v2/recipient/activity/SortBankAccountBottomSheetActivity$setupSwipeListener$1", "Lid/dana/utils/OnSwipeListener;", "onSwipeTop", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends NebulaLoadingView {
        final /* synthetic */ SortBankAccountBottomSheetActivity setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity, Context context) {
            super(context);
            this.setMin = sortBankAccountBottomSheetActivity;
        }

        public final void length() {
            this.setMin.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/sendmoney_v2/recipient/activity/SortBankAccountBottomSheetActivity$Companion;", "", "()V", "SORT_REQUEST_CODE", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void access$setSortIcon(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1881589157) {
            if (hashCode == -1591814541 && str.equals("ALPHABET")) {
                DanaCellRightView danaCellRightView = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.getPopupTheme);
                Intrinsics.checkNotNullExpressionValue(danaCellRightView, "rightViewFrequent");
                danaCellRightView.setVisibility(8);
                DanaCellRightView danaCellRightView2 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.setPresenter);
                Intrinsics.checkNotNullExpressionValue(danaCellRightView2, "rightViewRecent");
                danaCellRightView2.setVisibility(8);
                DanaCellRightView danaCellRightView3 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.setPopupTheme);
                Intrinsics.checkNotNullExpressionValue(danaCellRightView3, "rightViewAlphabet");
                danaCellRightView3.setVisibility(0);
                return;
            }
        } else if (str.equals("RECENT")) {
            DanaCellRightView danaCellRightView4 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.getPopupTheme);
            Intrinsics.checkNotNullExpressionValue(danaCellRightView4, "rightViewFrequent");
            danaCellRightView4.setVisibility(8);
            DanaCellRightView danaCellRightView5 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.setPresenter);
            Intrinsics.checkNotNullExpressionValue(danaCellRightView5, "rightViewRecent");
            danaCellRightView5.setVisibility(0);
            DanaCellRightView danaCellRightView6 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.setPopupTheme);
            Intrinsics.checkNotNullExpressionValue(danaCellRightView6, "rightViewAlphabet");
            danaCellRightView6.setVisibility(8);
            return;
        }
        DanaCellRightView danaCellRightView7 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.getPopupTheme);
        Intrinsics.checkNotNullExpressionValue(danaCellRightView7, "rightViewFrequent");
        danaCellRightView7.setVisibility(0);
        DanaCellRightView danaCellRightView8 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.setPresenter);
        Intrinsics.checkNotNullExpressionValue(danaCellRightView8, "rightViewRecent");
        danaCellRightView8.setVisibility(8);
        DanaCellRightView danaCellRightView9 = (DanaCellRightView) sortBankAccountBottomSheetActivity._$_findCachedViewById(resetInternal.setMax.setPopupTheme);
        Intrinsics.checkNotNullExpressionValue(danaCellRightView9, "rightViewAlphabet");
        danaCellRightView9.setVisibility(8);
    }

    public static final /* synthetic */ void access$saveSortBankAccount(SortBankAccountBottomSheetActivity sortBankAccountBottomSheetActivity, String str) {
        Action action = sortBankAccountBottomSheetActivity.presenterSorting;
        if (action == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenterSorting");
        }
        Intrinsics.checkNotNullParameter(str, "sortedBy");
        action.setMin.execute(new BeaconParser.getMax(str), new Action.length(action), new Action.getMax(action));
    }
}

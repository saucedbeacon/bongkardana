package id.dana.bank;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.di.modules.RequestMoneyBankListModule;
import id.dana.richview.EmptyState;
import id.dana.richview.SearchView;
import id.dana.sendmoney.model.BankModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.EmptyResultSetException;
import o.Ignore;
import o.IntRange;
import o.NebulaLoadingView;
import o.PrepareException;
import o.RedDotDrawable;
import o.RedDotManager;
import o.ResourceUtils;
import o.bind;
import o.dispatchOnCancelled;
import o.getScrimColor;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.ignoredColumns;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onLoadChildren;
import o.primaryKeys;
import o.resetInternal;
import o.setOnWheelViewListener;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u001aH\u0016J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\b\u0010&\u001a\u00020\u001aH\u0002J\b\u0010'\u001a\u00020\u001aH\u0002J\b\u0010(\u001a\u00020\u001aH\u0007J\b\u0010)\u001a\u00020\u001aH\u0014J\b\u0010*\u001a\u00020\u001aH\u0014J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001aH\u0002J\b\u0010.\u001a\u00020\u001aH\u0002J\b\u0010/\u001a\u00020\u001aH\u0002J\b\u00100\u001a\u00020\u001aH\u0002J\u0018\u00101\u001a\u00020\u001a2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u000103H\u0002J\b\u00104\u001a\u00020\u001aH\u0002J\b\u00105\u001a\u00020\u001aH\u0002J\b\u00106\u001a\u00020\u001aH\u0002J\u0010\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u0014H\u0002J\u0010\u00109\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u0014H\u0002J\f\u0010:\u001a\u00020\u001a*\u00020\u0007H\u0002J0\u0010;\u001a&\u0012\f\u0012\n =*\u0004\u0018\u00010\u001e0\u001e =*\u0012\u0012\f\u0012\n =*\u0004\u0018\u00010\u001e0\u001e\u0018\u00010<0<*\u00020>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lid/dana/bank/BottomSheetBankListActivity;", "Lid/dana/base/BaseActivity;", "()V", "allBankSkeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "bankList", "Ljava/util/ArrayList;", "Lid/dana/sendmoney/model/BankModel;", "Lkotlin/collections/ArrayList;", "bankListAdapter", "Lid/dana/bank/adapter/BankListAdapter;", "bankListPresenter", "Lid/dana/bank/contract/BankListContract$Presenter;", "getBankListPresenter", "()Lid/dana/bank/contract/BankListContract$Presenter;", "setBankListPresenter", "(Lid/dana/bank/contract/BankListContract$Presenter;)V", "featuredBankListAdapter", "Lid/dana/bank/adapter/FeaturedBankAdapter;", "isKeyboardShown", "", "topBankSkeletonScreen", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getAllBank", "", "getLayout", "", "getSearchHint", "", "hideSkeletonLoading", "hideSoftInputOnTouchOutsideSearchView", "event", "init", "initAllBankAdapter", "initAllBankRecyclerView", "initTopBankAdapter", "initTopBankRecyclerView", "injectComponent", "onCloseButtonClicked", "onPause", "onStart", "performSearch", "keyword", "setupEmptyStateActionListener", "setupKeyboardListener", "setupSearchView", "setupSwipeListener", "showBankSearchResult", "banks", "", "showBottomSkeleton", "showSkeletonLoading", "showTopSkeleton", "toggleBankListEmptyState", "isEmpty", "toggleSearchEmptyState", "onBankSelectedThenFinish", "watchSearchEditText", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "Landroid/widget/EditText;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BottomSheetBankListActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    private onDetachedFromLayoutParams IsOverlapping;
    @Inject
    public primaryKeys.setMin bankListPresenter;
    private HashMap equals;
    private onDetachedFromLayoutParams getMax;
    /* access modifiers changed from: private */
    public bind getMin;
    /* access modifiers changed from: private */
    public ignoredColumns setMax;
    /* access modifiers changed from: private */
    public boolean toFloatRange;
    /* access modifiers changed from: private */
    public final ArrayList<BankModel> toIntRange = new ArrayList<>();

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.equals;
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
            onCancelLoad.setMax(-1283032384, oncanceled);
            onCancelLoad.getMin(-1283032384, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled2 = new onCanceled(i, max, 16);
            onCancelLoad.setMax(-1283032384, oncanceled2);
            onCancelLoad.getMin(-1283032384, oncanceled2);
        }
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_bottom_sheet_bank_list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class IsOverlapping extends FunctionReferenceImpl implements Function1<String, Unit> {
        IsOverlapping(BottomSheetBankListActivity bottomSheetBankListActivity) {
            super(1, bottomSheetBankListActivity, BottomSheetBankListActivity.class, "performSearch", "performSearch(Ljava/lang/String;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "p1");
            BottomSheetBankListActivity.access$performSearch((BottomSheetBankListActivity) this.receiver, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "isClicked", "", "accept", "id/dana/bank/BottomSheetBankListActivity$setupSearchView$1$1"}, k = 3, mv = {1, 4, 2})
    static final class equals<T> implements RedDotManager<Boolean> {
        final /* synthetic */ BottomSheetBankListActivity getMax;

        equals(BottomSheetBankListActivity bottomSheetBankListActivity) {
            this.getMax = bottomSheetBankListActivity;
        }

        public final /* synthetic */ void accept(Object obj) {
            AppBarLayout appBarLayout;
            if (((Boolean) obj).booleanValue() && (appBarLayout = (AppBarLayout) this.getMax._$_findCachedViewById(resetInternal.setMax.getMin)) != null) {
                appBarLayout.setExpanded(false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "obj", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<CharSequence, String> {
        public static final toFloatRange getMax = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            CharSequence charSequence = (CharSequence) obj;
            Intrinsics.checkNotNullParameter(charSequence, "obj");
            return charSequence.toString();
        }
    }

    public static final /* synthetic */ ignoredColumns access$getBankListAdapter$p(BottomSheetBankListActivity bottomSheetBankListActivity) {
        ignoredColumns ignoredcolumns = bottomSheetBankListActivity.setMax;
        if (ignoredcolumns == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankListAdapter");
        }
        return ignoredcolumns;
    }

    public static final /* synthetic */ bind access$getFeaturedBankListAdapter$p(BottomSheetBankListActivity bottomSheetBankListActivity) {
        bind bind = bottomSheetBankListActivity.getMin;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("featuredBankListAdapter");
        }
        return bind;
    }

    @NotNull
    public final primaryKeys.setMin getBankListPresenter() {
        primaryKeys.setMin setmin = this.bankListPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankListPresenter");
        }
        return setmin;
    }

    public final void setBankListPresenter(@NotNull primaryKeys.setMin setmin) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(702960423, oncanceled);
            onCancelLoad.getMin(702960423, oncanceled);
        }
        Intrinsics.checkNotNullParameter(setmin, "<set-?>");
        this.bankListPresenter = setmin;
    }

    public final void onStart() {
        super.onStart();
        overridePendingTransition(R.anim.f782130772050, R.anim.f822130772054);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ BottomSheetBankListActivity getMin;

        length(BottomSheetBankListActivity bottomSheetBankListActivity) {
            this.getMin = bottomSheetBankListActivity;
        }

        public final void onClick(View view) {
            this.getMin.length();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"id/dana/bank/BottomSheetBankListActivity$injectComponent$1", "Lid/dana/bank/contract/BankListContract$View;", "dismissProgress", "", "onGetAllBanksError", "message", "", "onGetFeaturedAllBanks", "featuredBanks", "", "Lid/dana/sendmoney/model/BankModel;", "onGetFeaturedTopBanks", "onSearchBank", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements primaryKeys.setMax {
        final /* synthetic */ BottomSheetBankListActivity setMax;

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        setMax(BottomSheetBankListActivity bottomSheetBankListActivity) {
            this.setMax = bottomSheetBankListActivity;
        }

        public final void length(@NotNull List<? extends BankModel> list) {
            Intrinsics.checkNotNullParameter(list, "featuredBanks");
            BottomSheetBankListActivity.access$getFeaturedBankListAdapter$p(this.setMax).getMin(list);
            BottomSheetBankListActivity.access$toggleBankListEmptyState(this.setMax, false);
        }

        public final void getMin(@NotNull List<? extends BankModel> list) {
            Intrinsics.checkNotNullParameter(list, "featuredBanks");
            BottomSheetBankListActivity.access$getBankListAdapter$p(this.setMax).getMin(list);
            this.setMax.toIntRange.addAll(list);
            this.setMax.length(false);
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            BottomSheetBankListActivity.access$toggleBankListEmptyState(this.setMax, true);
        }

        public final void setMax(@NotNull List<? extends BankModel> list) {
            Intrinsics.checkNotNullParameter(list, "featuredBanks");
            BottomSheetBankListActivity.access$showBankSearchResult(this.setMax, list);
        }

        public final void showProgress() {
            BottomSheetBankListActivity.access$toggleBankListEmptyState(this.setMax, false);
            BottomSheetBankListActivity.access$showSkeletonLoading(this.setMax);
        }

        public final void dismissProgress() {
            BottomSheetBankListActivity.access$hideSkeletonLoading(this.setMax);
        }
    }

    /* access modifiers changed from: private */
    public final void length() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-275773366, oncanceled);
            onCancelLoad.getMin(-275773366, oncanceled);
        }
        primaryKeys.setMin setmin = this.bankListPresenter;
        if (setmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankListPresenter");
        }
        setmin.length();
    }

    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            overridePendingTransition(R.anim.f752130772047, R.anim.f792130772051);
        }
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && this.toFloatRange) {
            View currentFocus = getCurrentFocus();
            if (!(currentFocus instanceof EditText)) {
                currentFocus = null;
            }
            EditText editText = (EditText) currentFocus;
            if (editText != null) {
                Rect rect = new Rect();
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    setOnWheelViewListener.getMax((Activity) this);
                    editText.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "position", "", "onItemClick", "id/dana/bank/BottomSheetBankListActivity$initTopBankAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements Ignore.setMin {
        final /* synthetic */ BottomSheetBankListActivity getMax;
        final /* synthetic */ bind setMax;

        getMax(bind bind, BottomSheetBankListActivity bottomSheetBankListActivity) {
            this.setMax = bind;
            this.getMax = bottomSheetBankListActivity;
        }

        public final void length(int i) {
            BankModel bankModel = (BankModel) this.setMax.setMin(i);
            if (bankModel != null) {
                BottomSheetBankListActivity.access$onBankSelectedThenFinish(this.getMax, bankModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "position", "", "onItemClick", "id/dana/bank/BottomSheetBankListActivity$initAllBankAdapter$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Ignore.setMin {
        final /* synthetic */ BottomSheetBankListActivity getMax;
        final /* synthetic */ ignoredColumns setMin;

        setMin(ignoredColumns ignoredcolumns, BottomSheetBankListActivity bottomSheetBankListActivity) {
            this.setMin = ignoredcolumns;
            this.getMax = bottomSheetBankListActivity;
        }

        public final void length(int i) {
            BankModel bankModel = (BankModel) this.setMin.setMin(i);
            if (bankModel != null) {
                BottomSheetBankListActivity.access$onBankSelectedThenFinish(this.getMax, bankModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"id/dana/bank/BottomSheetBankListActivity$setupKeyboardListener$1", "Lid/dana/utils/KeyboardHelper$KeyboardVisibilityListener;", "onKeyboardHide", "", "onKeyboardShow", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements setOnWheelViewListener.length {
        final /* synthetic */ BottomSheetBankListActivity getMax;

        isInside(BottomSheetBankListActivity bottomSheetBankListActivity) {
            this.getMax = bottomSheetBankListActivity;
        }

        public final void length() {
            this.getMax.toFloatRange = true;
        }

        public final void setMax() {
            this.getMax.toFloatRange = false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/bank/BottomSheetBankListActivity$setupSwipeListener$1", "Lid/dana/utils/OnSwipeListener;", "onSwipeTop", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends NebulaLoadingView {
        final /* synthetic */ BottomSheetBankListActivity getMax;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(BottomSheetBankListActivity bottomSheetBankListActivity, Context context) {
            super(context);
            this.getMax = bottomSheetBankListActivity;
        }

        public final void length() {
            this.getMax.finish();
        }
    }

    @OnClick({2131363391})
    public final void onCloseButtonClicked() {
        finish();
    }

    /* access modifiers changed from: private */
    public final void length(boolean z) {
        EmptyState emptyState = (EmptyState) _$_findCachedViewById(resetInternal.setMax.flagMapping);
        int i = 0;
        if (emptyState != null) {
            View view = emptyState;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.ActionMenuView$LayoutParams);
        if (recyclerView != null) {
            View view2 = recyclerView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z2 ? 0 : 8);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.setDividerDrawable);
        if (textView != null) {
            View view3 = textView;
            boolean z3 = !z;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            if (!z3) {
                i = 8;
            }
            view3.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/bank/BottomSheetBankListActivity$Companion;", "", "()V", "MIN_KEYWORD_CHAR", "", "SHIMMERING_ANGLE", "SHIMMERING_COLOR", "SHIMMERING_DURATION", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public final void init() {
        int length2;
        int min;
        bind bind = new bind();
        bind.getMax((Ignore.setMin) new getMax(bind, this));
        Unit unit = Unit.INSTANCE;
        this.getMin = bind;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(658512464, oncanceled);
            onCancelLoad.getMin(658512464, oncanceled);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.getSupportBackgroundTintList);
        if (recyclerView != null) {
            bind bind2 = this.getMin;
            if (bind2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("featuredBankListAdapter");
            }
            recyclerView.setAdapter(bind2);
            recyclerView.setNestedScrollingEnabled(true);
        }
        ignoredColumns ignoredcolumns = new ignoredColumns();
        ignoredcolumns.getMax((Ignore.setMin) new setMin(ignoredcolumns, this));
        Unit unit2 = Unit.INSTANCE;
        this.setMax = ignoredcolumns;
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.ActionMenuView$LayoutParams);
        if (recyclerView2 != null) {
            ignoredColumns ignoredcolumns2 = this.setMax;
            if (ignoredcolumns2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankListAdapter");
            }
            recyclerView2.setAdapter(ignoredcolumns2);
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
            recyclerView2.setNestedScrollingEnabled(true);
        }
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        setOnWheelViewListener.getMax(window.getDecorView(), new isInside(this));
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.add);
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(new toIntRange(this, this));
        }
        SearchView searchView = (SearchView) _$_findCachedViewById(resetInternal.setMax.getTextMetricsParamsCompat);
        if (searchView != null) {
            String string = getString(R.string.request_money_bank_search_hint);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.request_money_bank_search_hint)");
            searchView.setSearchHint(string);
            EditText editText = searchView.getEditText();
            searchView.getResources();
            editText.setTextColor(-13553359);
            searchView.addDisposable(searchView.getOnSearchClickedEvent().subscribe(new equals(this)));
            EditText editText2 = searchView.getEditText();
            Intrinsics.checkNotNullExpressionValue(editText2, "this.editText");
            searchView.addDisposable(onLoadChildren.textChanges(editText2).skipInitialValue().debounce(500, TimeUnit.MILLISECONDS).subscribeOn(getSecureSignatureComp.setMin()).observeOn(hideProgress.length()).map(toFloatRange.getMax).subscribe(new EmptyResultSetException(new IsOverlapping(this))));
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-909009998, oncanceled2);
            onCancelLoad.getMin(-909009998, oncanceled2);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-909009998, oncanceled3);
            onCancelLoad.getMin(-909009998, oncanceled3);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.toIntRange);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new length(this));
        }
        ResourceUtils.AnonymousClass2.setMax setmax = new ResourceUtils.AnonymousClass2.setMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmax.setMax = applicationComponent;
            setmax.setMin = new RequestMoneyBankListModule(new setMax(this));
            stopIgnoring.setMin(setmax.setMin, RequestMoneyBankListModule.class);
            stopIgnoring.setMin(setmax.setMax, PrepareException.AnonymousClass1.class);
            new ResourceUtils.AnonymousClass2(setmax.setMin, setmax.setMax, (byte) 0).getMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            primaryKeys.setMin setmin = this.bankListPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankListPresenter");
            }
            getminArr[0] = setmin;
            registerPresenter(getminArr);
            length();
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$toggleBankListEmptyState(BottomSheetBankListActivity bottomSheetBankListActivity, boolean z) {
        ConstraintLayout constraintLayout = (ConstraintLayout) bottomSheetBankListActivity._$_findCachedViewById(resetInternal.setMax.hasAttributeId);
        int i = 0;
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        AppBarLayout appBarLayout = (AppBarLayout) bottomSheetBankListActivity._$_findCachedViewById(resetInternal.setMax.getMin);
        if (appBarLayout != null) {
            View view2 = appBarLayout;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z2 ? 0 : 8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) bottomSheetBankListActivity._$_findCachedViewById(resetInternal.setMax.isCaptioningEnabled);
        if (constraintLayout2 != null) {
            View view3 = constraintLayout2;
            boolean z3 = !z;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            if (!z3) {
                i = 8;
            }
            view3.setVisibility(i);
        }
    }

    public static final /* synthetic */ void access$showBankSearchResult(BottomSheetBankListActivity bottomSheetBankListActivity, List list) {
        if (list == null) {
            return;
        }
        if (!list.isEmpty()) {
            bottomSheetBankListActivity.length(false);
            ignoredColumns ignoredcolumns = bottomSheetBankListActivity.setMax;
            if (ignoredcolumns == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankListAdapter");
            }
            ignoredcolumns.getMin(list);
            return;
        }
        bottomSheetBankListActivity.length(true);
    }

    public static final /* synthetic */ void access$showSkeletonLoading(BottomSheetBankListActivity bottomSheetBankListActivity) {
        int max;
        getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) bottomSheetBankListActivity._$_findCachedViewById(resetInternal.setMax.getSupportBackgroundTintList));
        getmax.getMax = R.layout.view_skeleton_top_bank_list;
        bind bind = bottomSheetBankListActivity.getMin;
        if (bind == null) {
            Intrinsics.throwUninitializedPropertyAccessException("featuredBankListAdapter");
        }
        getmax.length = bind;
        getmax.IsOverlapping = 1500;
        getmax.getMin = true;
        getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
        getmax.toIntRange = 20;
        getmax.setMin = 6;
        getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
        getscrimcolor.getMin();
        Intrinsics.checkNotNullExpressionValue(getscrimcolor, "Skeleton.bind(rvTopBank)…nt(6)\n            .show()");
        bottomSheetBankListActivity.getMax = getscrimcolor;
        Context baseContext = bottomSheetBankListActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1225928926 == (max = dispatchOnCancelled.getMax(applicationContext, -1225928926)))) {
            onCanceled oncanceled = new onCanceled(-1225928926, max, 512);
            onCancelLoad.setMax(-1225928926, oncanceled);
            onCancelLoad.getMin(-1225928926, oncanceled);
        }
        getScrimColor.getMax getmax2 = new getScrimColor.getMax((RecyclerView) bottomSheetBankListActivity._$_findCachedViewById(resetInternal.setMax.ActionMenuView$LayoutParams));
        getmax2.getMax = R.layout.view_skeleton_all_bank_list;
        ignoredColumns ignoredcolumns = bottomSheetBankListActivity.setMax;
        if (ignoredcolumns == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankListAdapter");
        }
        getmax2.length = ignoredcolumns;
        getmax2.IsOverlapping = 1500;
        getmax2.getMin = true;
        getmax2.toFloatRange = IntRange.setMax(getmax2.setMax.getContext(), R.color.f24782131100433);
        getmax2.toIntRange = 20;
        getScrimColor getscrimcolor2 = new getScrimColor(getmax2, (byte) 0);
        getscrimcolor2.getMin();
        Intrinsics.checkNotNullExpressionValue(getscrimcolor2, "Skeleton.bind(rvAllBank)…NGLE)\n            .show()");
        bottomSheetBankListActivity.IsOverlapping = getscrimcolor2;
    }

    public static final /* synthetic */ void access$hideSkeletonLoading(BottomSheetBankListActivity bottomSheetBankListActivity) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = bottomSheetBankListActivity.getMax;
        if (ondetachedfromlayoutparams == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topBankSkeletonScreen");
        }
        ondetachedfromlayoutparams.length();
        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = bottomSheetBankListActivity.IsOverlapping;
        if (ondetachedfromlayoutparams2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allBankSkeletonScreen");
        }
        ondetachedfromlayoutparams2.length();
    }

    public static final /* synthetic */ void access$onBankSelectedThenFinish(BottomSheetBankListActivity bottomSheetBankListActivity, BankModel bankModel) {
        bottomSheetBankListActivity.setResult(-1, new Intent().putExtra("data", bankModel));
        bottomSheetBankListActivity.finish();
    }

    public static final /* synthetic */ void access$performSearch(BottomSheetBankListActivity bottomSheetBankListActivity, String str) {
        if (str.length() > 2) {
            primaryKeys.setMin setmin = bottomSheetBankListActivity.bankListPresenter;
            if (setmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankListPresenter");
            }
            setmin.length(str);
        }
        if (str.length() == 0) {
            ignoredColumns ignoredcolumns = bottomSheetBankListActivity.setMax;
            if (ignoredcolumns == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankListAdapter");
            }
            ignoredcolumns.getMin(bottomSheetBankListActivity.toIntRange);
            bottomSheetBankListActivity.length(false);
        }
    }
}

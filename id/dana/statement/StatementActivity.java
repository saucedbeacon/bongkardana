package id.dana.statement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.OnClick;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.UserStatementModule;
import id.dana.domain.statement.StatementType;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.statement.StatementChartView;
import id.dana.statement.model.StatementDetailModel;
import id.dana.statement.model.StatementSummaryModel;
import id.dana.statement.model.StatementViewModel;
import id.dana.statement.model.UserStatementModel;
import id.dana.statement.view.AccumulateStatementAmountView;
import id.dana.statement.view.StatementDateView;
import id.dana.statement.view.StatementDownloadActivity;
import id.dana.statement.view.StatementOnBoardingView;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.AUAbsTheme;
import o.AUTextView;
import o.AUThemeKey;
import o.PrepareException;
import o.chooseSizeAndMargin;
import o.containsFavoriteMenuItem;
import o.convertDipToPx;
import o.convertSpToPx;
import o.dispatchOnCancelled;
import o.genTextSelector;
import o.getCurrentTheme;
import o.getInsetDodgeRect;
import o.getSelectedIndex;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.onDownloadStart;
import o.onTextViewTextChange;
import o.resetInternal;
import o.setShadowResourceRight;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 j2\u00020\u0001:\u0001jB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u0019H\u0002J\u001e\u0010D\u001a\u00020@2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0F2\u0006\u0010G\u001a\u000204H\u0002J\u0010\u0010H\u001a\u00020@2\u0006\u0010I\u001a\u00020\u0004H\u0002J\b\u0010J\u001a\u00020KH\u0016J\n\u0010L\u001a\u0004\u0018\u00010MH\u0002J\b\u0010N\u001a\u00020@H\u0016J\b\u0010O\u001a\u00020@H\u0002J\b\u0010P\u001a\u00020@H\u0002J\u0010\u0010Q\u001a\u00020\n2\u0006\u0010R\u001a\u00020.H\u0002J\u0010\u0010S\u001a\u00020\n2\u0006\u0010R\u001a\u00020.H\u0002J\b\u0010T\u001a\u00020@H\u0007J\b\u0010U\u001a\u00020@H\u0002J\b\u0010V\u001a\u00020@H\u0002J\u0018\u0010W\u001a\u00020@2\u000e\u0010X\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010FH\u0002J\b\u0010Z\u001a\u00020@H\u0002J\b\u0010[\u001a\u00020@H\u0002J\b\u0010\\\u001a\u00020@H\u0002J\u001f\u0010]\u001a\u0004\u0018\u00010@2\u000e\u0010^\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010FH\u0002¢\u0006\u0002\u0010_J\b\u0010`\u001a\u00020@H\u0002J\b\u0010a\u001a\u00020@H\u0002J\u0012\u0010b\u001a\u00020@2\b\u0010G\u001a\u0004\u0018\u000104H\u0002J\b\u0010c\u001a\u00020@H\u0002J\b\u0010d\u001a\u00020@H\u0002J\u0010\u0010e\u001a\u00020@2\u0006\u0010f\u001a\u00020\nH\u0002J\u0010\u0010g\u001a\u00020@2\u0006\u0010f\u001a\u00020\nH\u0002J\u0012\u0010h\u001a\u00020@2\b\u0010i\u001a\u0004\u0018\u000104H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR*\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R \u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0010\u00103\u001a\u0004\u0018\u000104X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0004¢\u0006\u0002\n\u0000R\u001c\u00107\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00109\"\u0004\b>\u0010;¨\u0006k"}, d2 = {"Lid/dana/statement/StatementActivity;", "Lid/dana/base/BaseActivity;", "()V", "currentDate", "", "getCurrentDate", "()J", "currentDate$delegate", "Lkotlin/Lazy;", "isDownloadEnable", "", "onBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "getOnBoardingPresenter", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "setOnBoardingPresenter", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;)V", "presenter", "Lid/dana/statement/UserStatementContract$Presenter;", "getPresenter", "()Lid/dana/statement/UserStatementContract$Presenter;", "setPresenter", "(Lid/dana/statement/UserStatementContract$Presenter;)V", "selectedDate", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "getSkeletonScreen", "()Lcom/ethanhua/skeleton/SkeletonScreen;", "skeletonScreen$delegate", "statementExpenseDetails", "Ljava/util/ArrayList;", "Lid/dana/statement/model/StatementDetailModel;", "Lkotlin/collections/ArrayList;", "getStatementExpenseDetails", "()Ljava/util/ArrayList;", "setStatementExpenseDetails", "(Ljava/util/ArrayList;)V", "statementIncomeDetails", "getStatementIncomeDetails", "setStatementIncomeDetails", "statementModel", "Lid/dana/statement/model/UserStatementModel;", "statementOnBoardingView", "Lid/dana/statement/view/StatementOnBoardingView;", "statementViewModels", "", "Lid/dana/statement/model/StatementViewModel;", "getStatementViewModels", "()Ljava/util/List;", "setStatementViewModels", "(Ljava/util/List;)V", "tabMenuSelected", "", "transactionStatementAdapter", "Lid/dana/statement/adapter/TransactionStatementAdapter;", "userStatementExpense", "getUserStatementExpense", "()Lid/dana/statement/model/UserStatementModel;", "setUserStatementExpense", "(Lid/dana/statement/model/UserStatementModel;)V", "userStatementIncome", "getUserStatementIncome", "setUserStatementIncome", "closeOnBoardingView", "", "decorView", "Landroid/view/ViewGroup;", "createSkeletonScreen", "fillDataToChart", "statementDetails", "", "type", "getAllStatementSummary", "date", "getLayout", "", "getStatementMenuListener", "Lid/dana/statement/StatementMenuListener;", "init", "initChartData", "initComponent", "isTypeExpense", "item", "isTypeIncome", "onClickDownloadStatement", "prepareBundle", "resetStatementItems", "setAdapterStatementItems", "statementSummaries", "Lid/dana/statement/model/StatementSummaryModel;", "setOnBoardingOverlayHeight", "setStatementMenuListener", "setStatementModel", "setStatementSummary", "viewModels", "(Ljava/util/List;)Lkotlin/Unit;", "setToolbar", "setupRecyclerView", "setupTabMenuSelected", "showChartWithNoData", "showOnBoardingLottieView", "showShimmeringLayout", "show", "showStatementEmptyState", "track", "source", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementActivity extends BaseActivity {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    @NotNull
    public static final String EXTRA_SOURCE = "EXTRA_SOURCE";
    @NotNull
    public static final String TAB_MENU_SELECTED = "TAB_MENU_SELECTED";
    private final Lazy FastBitmap$CoordinateSystem = LazyKt.lazy(new toFloatRange(this));
    private HashMap Grayscale$Algorithm;
    private String IsOverlapping;
    @NotNull
    private ArrayList<StatementDetailModel> equals = new ArrayList<>();
    private final AUThemeKey getMax = new AUThemeKey();
    /* access modifiers changed from: private */
    public StatementOnBoardingView getMin;
    /* access modifiers changed from: private */
    public long hashCode = getMax();
    @Nullable
    private UserStatementModel isInside;
    @Inject
    public getSelectedIndex.length onBoardingPresenter;
    @Inject
    public AUTextView.OnVisibilityChangeListener.setMax presenter;
    @NotNull
    private List<StatementViewModel> setMax = new ArrayList();
    private UserStatementModel toDoubleRange;
    @NotNull
    private ArrayList<StatementDetailModel> toFloatRange = new ArrayList<>();
    @Nullable
    private UserStatementModel toIntRange;
    /* access modifiers changed from: private */
    public boolean toString = true;
    private final Lazy values = LazyKt.lazy(setMax.INSTANCE);

    private final long getMax() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1382421580, oncanceled);
            onCancelLoad.getMin(-1382421580, oncanceled);
        }
        return ((Number) this.values.getValue()).longValue();
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.Grayscale$Algorithm;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(1828668730, oncanceled);
            onCancelLoad.getMin(1828668730, oncanceled);
        }
        if (this.Grayscale$Algorithm == null) {
            this.Grayscale$Algorithm = new HashMap();
        }
        View view = (View) this.Grayscale$Algorithm.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.Grayscale$Algorithm.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_statement;
    }

    public static final /* synthetic */ onDetachedFromLayoutParams access$createSkeletonScreen(StatementActivity statementActivity) {
        int length2;
        int min;
        Context baseContext = statementActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(2025897625, oncanceled);
            onCancelLoad.getMin(2025897625, oncanceled);
        }
        getInsetDodgeRect min2 = containsFavoriteMenuItem.getMin(statementActivity._$_findCachedViewById(resetInternal.setMax.setCallback), R.layout.layout_statement_summary_skeleton);
        Intrinsics.checkNotNullExpressionValue(min2, "ShimmeringUtil.bind(layo…atement_summary_skeleton)");
        return min2;
    }

    public static final /* synthetic */ void access$showOnBoardingLottieView(StatementActivity statementActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1883043625, oncanceled);
            onCancelLoad.getMin(1883043625, oncanceled);
        }
        Window window = statementActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        View decorView = window.getDecorView();
        if (decorView != null) {
            ViewGroup viewGroup = (ViewGroup) decorView;
            statementActivity.getMin = new StatementOnBoardingView(statementActivity, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            StatementChartView statementChartView = (StatementChartView) statementActivity._$_findCachedViewById(resetInternal.setMax.removeItem);
            Intrinsics.checkNotNullExpressionValue(statementChartView, "lineChart");
            statementChartView.getViewTreeObserver().addOnGlobalLayoutListener(new IsOverlapping(statementActivity));
            viewGroup.addView(statementActivity.getMin);
            StatementOnBoardingView statementOnBoardingView = statementActivity.getMin;
            if (statementOnBoardingView != null) {
                statementOnBoardingView.setOnClickListener(new toIntRange(statementActivity, viewGroup));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static final /* synthetic */ void access$showShimmeringLayout(StatementActivity statementActivity, boolean z) {
        int i = 0;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1273974027, oncanceled);
            onCancelLoad.getMin(1273974027, oncanceled);
        }
        if (z) {
            ((onDetachedFromLayoutParams) statementActivity.FastBitmap$CoordinateSystem.getValue()).getMin();
        } else {
            ((onDetachedFromLayoutParams) statementActivity.FastBitmap$CoordinateSystem.getValue()).length();
        }
        View _$_findCachedViewById = statementActivity._$_findCachedViewById(resetInternal.setMax.setCallback);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_statement_summary");
        if (!(!z)) {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    @NotNull
    public final AUTextView.OnVisibilityChangeListener.setMax getPresenter() {
        AUTextView.OnVisibilityChangeListener.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        return setmax;
    }

    public final void setPresenter(@NotNull AUTextView.OnVisibilityChangeListener.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "<set-?>");
        this.presenter = setmax;
    }

    @NotNull
    public final getSelectedIndex.length getOnBoardingPresenter() {
        getSelectedIndex.length length2 = this.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        return length2;
    }

    public final void setOnBoardingPresenter(@NotNull getSelectedIndex.length length2) {
        int length3;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1066084161, oncanceled);
            onCancelLoad.getMin(-1066084161, oncanceled);
        }
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        this.onBoardingPresenter = length2;
    }

    @NotNull
    public final List<StatementViewModel> getStatementViewModels() {
        return this.setMax;
    }

    public final void setStatementViewModels(@NotNull List<StatementViewModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.setMax = list;
    }

    @Nullable
    public final UserStatementModel getUserStatementIncome() {
        return this.toIntRange;
    }

    public final void setUserStatementIncome(@Nullable UserStatementModel userStatementModel) {
        this.toIntRange = userStatementModel;
    }

    @Nullable
    public final UserStatementModel getUserStatementExpense() {
        return this.isInside;
    }

    public final void setUserStatementExpense(@Nullable UserStatementModel userStatementModel) {
        this.isInside = userStatementModel;
    }

    @NotNull
    public final ArrayList<StatementDetailModel> getStatementIncomeDetails() {
        return this.toFloatRange;
    }

    public final void setStatementIncomeDetails(@NotNull ArrayList<StatementDetailModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.toFloatRange = arrayList;
    }

    @NotNull
    public final ArrayList<StatementDetailModel> getStatementExpenseDetails() {
        return this.equals;
    }

    public final void setStatementExpenseDetails(@NotNull ArrayList<StatementDetailModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.equals = arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ethanhua/skeleton/SkeletonScreen;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function0<onDetachedFromLayoutParams> {
        final /* synthetic */ StatementActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(StatementActivity statementActivity) {
            super(0);
            this.this$0 = statementActivity;
        }

        @NotNull
        public final onDetachedFromLayoutParams invoke() {
            return StatementActivity.access$createSkeletonScreen(this.this$0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Long> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(0);
        }

        public final long invoke() {
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
            return instance.getTimeInMillis();
        }
    }

    public final void init() {
        String str;
        int length2;
        int min;
        TextView textView;
        int max;
        int max2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -497618067 == (max2 = dispatchOnCancelled.getMax(applicationContext, -497618067)))) {
            onCanceled oncanceled = new onCanceled(-497618067, max2, 512);
            onCancelLoad.setMax(-497618067, oncanceled);
            onCancelLoad.getMin(-497618067, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1418415036 == (max = dispatchOnCancelled.getMax(applicationContext2, 1418415036)))) {
            onCanceled oncanceled2 = new onCanceled(1418415036, max, 512);
            onCancelLoad.setMax(1418415036, oncanceled2);
            onCancelLoad.getMin(1418415036, oncanceled2);
        }
        onDownloadStart.setMin setmin = new onDownloadStart.setMin((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmin.setMax = applicationComponent;
            setmin.length = new UserStatementModule(new getMax(this));
            setmin.getMin = new BottomSheetOnBoardingModule(new isInside(this));
            stopIgnoring.setMin(setmin.length, UserStatementModule.class);
            stopIgnoring.setMin(setmin.getMin, BottomSheetOnBoardingModule.class);
            stopIgnoring.setMin(setmin.setMax, PrepareException.AnonymousClass1.class);
            new onDownloadStart(setmin.length, setmin.getMin, setmin.setMax, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            AUTextView.OnVisibilityChangeListener.setMax setmax = this.presenter;
            if (setmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = setmax;
            getSelectedIndex.length length3 = this.onBoardingPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
            }
            getminArr[1] = length3;
            registerPresenter(getminArr);
            setTitle(getString(R.string.dana_statement_title));
            setMenuLeftButton((int) R.drawable.arrow_left_white);
            View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.addSubMenu);
            if (!(_$_findCachedViewById == null || (textView = (TextView) _$_findCachedViewById.findViewById(resetInternal.setMax.hasWindowFocus)) == null)) {
                textView.setContentDescription(getString(R.string.lblStatement));
            }
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            String string = extras != null ? extras.getString("EXTRA_SOURCE", "") : null;
            if (extras != null) {
                str = extras.getString(TAB_MENU_SELECTED, "");
            } else {
                str = null;
            }
            this.IsOverlapping = str;
            convertDipToPx.length length4 = new convertDipToPx.length(getApplicationContext());
            length4.getMax = TrackerKey.Event.DANA_STATEMENT_OPEN;
            convertDipToPx.length max3 = length4.setMax("Source", string);
            max3.setMin();
            genTextSelector.getMax(new convertDipToPx(max3, (byte) 0));
            ((StatementChartView) _$_findCachedViewById(resetInternal.setMax.removeItem)).setStartPosition(Calendar.getInstance().get(5) - 2);
            ((StatementChartView) _$_findCachedViewById(resetInternal.setMax.removeItem)).build();
            ((StatementDateView) _$_findCachedViewById(resetInternal.setMax.onTransitionChange)).setOnStatementDateChangeListener(new setMin(this));
            getSelectedIndex.length length5 = this.onBoardingPresenter;
            if (length5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
            }
            length5.setMin("statement");
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
                onCanceled oncanceled3 = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(275645956, oncanceled3);
                onCancelLoad.getMin(275645956, oncanceled3);
            }
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatRadioButton);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.addItemDecoration(new setShadowResourceRight(recyclerView.getContext(), R.dimen.f26272131165275));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(this.getMax);
            ((AccumulateStatementAmountView) _$_findCachedViewById(resetInternal.setMax.setWrapMode)).setStatementMenuListener(new length(this));
            ((StatementDateView) _$_findCachedViewById(resetInternal.setMax.onTransitionChange)).setStatementMenuListener(new length(this));
            getMin(this.IsOverlapping);
            getMin(getMax());
            AUTextView.OnVisibilityChangeListener.setMax setmax2 = this.presenter;
            if (setmax2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setmax2.getMin();
            AUTextView.OnVisibilityChangeListener.setMax setmax3 = this.presenter;
            if (setmax3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            setmax3.setMin();
            return;
        }
        throw null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016¨\u0006\u0017"}, d2 = {"id/dana/statement/StatementActivity$initComponent$1", "Lid/dana/statement/UserStatementListener;", "dismissProgress", "", "onCheckFeatureDownloadStatementEnable", "downloadStatementEnable", "", "onGetAllStatementSummary", "viewModels", "", "Lid/dana/statement/model/StatementViewModel;", "onGetDetailError", "onGetStatementDetailExpense", "userStatementDetailModelExpense", "Lid/dana/statement/model/UserStatementDetailModel;", "onGetStatementDetailIncome", "userStatementDetailModelIncome", "onGetStatementSummaryExpense", "userStatementModelExpense", "Lid/dana/statement/model/UserStatementModel;", "onGetStatementSummaryIncome", "userStatementModelIncome", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends AUTextView.OnTvGlobalLayoutListener {
        final /* synthetic */ StatementActivity setMin;

        getMax(StatementActivity statementActivity) {
            this.setMin = statementActivity;
        }

        public final void getMax(@NotNull List<StatementViewModel> list) {
            Intrinsics.checkNotNullParameter(list, "viewModels");
            StatementActivity.access$setStatementSummary(this.setMin, list);
            this.setMin.getStatementViewModels().addAll(list);
        }

        public final void setMin(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelIncome");
            StatementActivity statementActivity = this.setMin;
            List<StatementDetailModel> list = choosesizeandmargin.getMin;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
            StatementActivity.access$fillDataToChart(statementActivity, list, AUAbsTheme.setMax());
        }

        public final void getMax(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelExpense");
            StatementActivity statementActivity = this.setMin;
            List<StatementDetailModel> list = choosesizeandmargin.getMin;
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
            StatementActivity.access$fillDataToChart(statementActivity, list, AUAbsTheme.getMin());
        }

        public final void getMax(@NotNull UserStatementModel userStatementModel) {
            List<StatementSummaryModel> list;
            Intrinsics.checkNotNullParameter(userStatementModel, "userStatementModelIncome");
            this.setMin.setUserStatementIncome(userStatementModel);
            StatementActivity statementActivity = this.setMin;
            UserStatementModel userStatementIncome = statementActivity.getUserStatementIncome();
            if (userStatementIncome != null) {
                list = userStatementIncome.getMin;
            } else {
                list = null;
            }
            StatementActivity.access$setAdapterStatementItems(statementActivity, list);
        }

        public final void length(@NotNull UserStatementModel userStatementModel) {
            List<StatementSummaryModel> list;
            Intrinsics.checkNotNullParameter(userStatementModel, "userStatementModelExpense");
            this.setMin.setUserStatementExpense(userStatementModel);
            StatementActivity statementActivity = this.setMin;
            UserStatementModel userStatementExpense = statementActivity.getUserStatementExpense();
            if (userStatementExpense != null) {
                list = userStatementExpense.getMin;
            } else {
                list = null;
            }
            StatementActivity.access$setAdapterStatementItems(statementActivity, list);
        }

        public final void showProgress() {
            StatementActivity.access$showShimmeringLayout(this.setMin, true);
        }

        public final void dismissProgress() {
            StatementActivity.access$showShimmeringLayout(this.setMin, false);
        }

        public final void setMin(boolean z) {
            this.setMin.toString = z;
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) this.setMin._$_findCachedViewById(resetInternal.setMax.cancelNotification);
            if (danaButtonPrimaryView != null) {
                View view = danaButtonPrimaryView;
                boolean access$isDownloadEnable$p = this.setMin.toString;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(access$isDownloadEnable$p ? 0 : 8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/statement/StatementActivity$initComponent$2", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "onGetBottomSheetOnBoardingAvailability", "", "show", "", "url", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside implements getSelectedIndex.setMax {
        final /* synthetic */ StatementActivity getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMax(boolean z, @Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        isInside(StatementActivity statementActivity) {
            this.getMax = statementActivity;
        }

        public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
            if (z) {
                StatementActivity.access$showOnBoardingLottieView(this.getMax);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getMin(String str) {
        if (Intrinsics.areEqual((Object) StatementType.EXPENSE.name(), (Object) str)) {
            AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
            ((AccumulateStatementAmountView) _$_findCachedViewById(resetInternal.setMax.setWrapMode)).selectTransactionHistory(AUAbsTheme.getMin());
            return;
        }
        AUAbsTheme aUAbsTheme2 = AUAbsTheme.getMin;
        ((AccumulateStatementAmountView) _$_findCachedViewById(resetInternal.setMax.setWrapMode)).selectTransactionHistory(AUAbsTheme.setMax());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/statement/StatementActivity$getStatementMenuListener$1", "Lid/dana/statement/StatementMenuListener;", "onClickExpense", "", "onClickIncome", "onMonthRolled", "date", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements AUTextView.OnTextViewTextChangeListener {
        final /* synthetic */ StatementActivity setMax;

        length(StatementActivity statementActivity) {
            this.setMax = statementActivity;
        }

        public final void getMin() {
            UserStatementModel userStatementIncome = this.setMax.getUserStatementIncome();
            if (userStatementIncome != null) {
                StatementActivity.access$setAdapterStatementItems(this.setMax, userStatementIncome.getMin);
            } else {
                this.setMax.getPresenter().setMin(new getCurrentTheme(this.setMax.hashCode, TimeUnitInterval.MONTH, StatementType.INCOME));
            }
        }

        public final void setMin() {
            UserStatementModel userStatementExpense = this.setMax.getUserStatementExpense();
            if (userStatementExpense != null) {
                StatementActivity.access$setAdapterStatementItems(this.setMax, userStatementExpense.getMin);
            } else {
                this.setMax.getPresenter().setMin(new getCurrentTheme(this.setMax.hashCode, TimeUnitInterval.MONTH, StatementType.EXPENSE));
            }
        }

        public final void getMax(long j) {
            this.setMax.hashCode = j;
            StatementActivity.access$setAdapterStatementItems(this.setMax, (List) null);
            StatementActivity.access$resetStatementItems(this.setMax);
            StatementActivity statementActivity = this.setMax;
            statementActivity.getMin(((AccumulateStatementAmountView) statementActivity._$_findCachedViewById(resetInternal.setMax.setWrapMode)).getActiveTabMenu());
            this.setMax.getMin(j);
        }
    }

    /* access modifiers changed from: private */
    public final void getMin(long j) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-885288983, oncanceled);
            onCancelLoad.getMin(-885288983, oncanceled);
        }
        AUTextView.OnVisibilityChangeListener.setMax setmax = this.presenter;
        if (setmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        setmax.getMax(new getCurrentTheme(j, TimeUnitInterval.MONTH, StatementType.ALL));
    }

    private final void getMax(boolean z) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(849928277, oncanceled);
            onCancelLoad.getMin(849928277, oncanceled);
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatRadioButton);
        int i = 8;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(resetInternal.setMax.changeMenuMode);
        if (linearLayout != null) {
            View view = linearLayout;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.PlaybackStateCompat);
        if (constraintLayout != null) {
            View view2 = constraintLayout;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z ? 0 : 8);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.AppCompatRadioButton);
        if (recyclerView2 != null) {
            View view3 = recyclerView2;
            boolean z3 = !z;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(z3 ? 0 : 8);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.cancelNotification);
        if (danaButtonPrimaryView != null) {
            View view4 = danaButtonPrimaryView;
            boolean z4 = this.toString;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            if (z4) {
                i = 0;
            }
            view4.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"id/dana/statement/StatementActivity$initChartData$1", "Lid/dana/statement/StatementDateChangeListener;", "onDateChanged", "", "from", "", "to", "onHiglightDateChanged", "timestamp", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements onTextViewTextChange {
        final /* synthetic */ StatementActivity getMin;

        setMin(StatementActivity statementActivity) {
            this.getMin = statementActivity;
        }

        public final void getMax(long j, long j2) {
            this.getMin.getPresenter().setMin(j, j2);
        }

        public final void setMax(long j) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            ((StatementChartView) this.getMin._$_findCachedViewById(resetInternal.setMax.removeItem)).setStartPosition(instance.get(5));
        }
    }

    private static boolean getMin(StatementViewModel statementViewModel) {
        return Intrinsics.areEqual((Object) StatementType.EXPENSE.name(), (Object) statementViewModel.setMin.setMin);
    }

    private static boolean getMax(StatementViewModel statementViewModel) {
        return Intrinsics.areEqual((Object) StatementType.INCOME.name(), (Object) statementViewModel.setMin.setMin);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ ViewGroup $decorView;
        final /* synthetic */ StatementActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(StatementActivity statementActivity, ViewGroup viewGroup) {
            super(0);
            this.this$0 = statementActivity;
            this.$decorView = viewGroup;
        }

        public final void invoke() {
            StatementActivity.access$closeOnBoardingView(this.this$0, this.$decorView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/statement/StatementActivity$setOnBoardingOverlayHeight$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ StatementActivity setMax;

        IsOverlapping(StatementActivity statementActivity) {
            this.setMax = statementActivity;
        }

        public final void onGlobalLayout() {
            StatementChartView statementChartView = (StatementChartView) this.setMax._$_findCachedViewById(resetInternal.setMax.removeItem);
            Intrinsics.checkNotNullExpressionValue(statementChartView, "lineChart");
            statementChartView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            StatementOnBoardingView access$getStatementOnBoardingView$p = this.setMax.getMin;
            if (access$getStatementOnBoardingView$p != null) {
                StatementChartView statementChartView2 = (StatementChartView) this.setMax._$_findCachedViewById(resetInternal.setMax.removeItem);
                Intrinsics.checkNotNullExpressionValue(statementChartView2, "lineChart");
                int measuredHeight = statementChartView2.getMeasuredHeight();
                Toolbar toolbar = (Toolbar) this.setMax._$_findCachedViewById(resetInternal.setMax.getFixedHeightMajor);
                Intrinsics.checkNotNullExpressionValue(toolbar, "toolbar");
                int height = measuredHeight + toolbar.getHeight();
                Context context = this.setMax;
                int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                access$getStatementOnBoardingView$p.setLayoutHeight(height + (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/statement/StatementActivity$Companion;", "", "()V", "EXTRA_SOURCE", "", "TAB_MENU_SELECTED", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @OnClick({2131362076})
    public final void onClickDownloadStatement() {
        UserStatementModel userStatementModel = new UserStatementModel((CurrencyAmountModel) null, (List) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 248);
        this.toDoubleRange = userStatementModel;
        if (userStatementModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementModel");
        }
        userStatementModel.IsOverlapping = ((StatementDateView) _$_findCachedViewById(resetInternal.setMax.onTransitionChange)).getMonth();
        UserStatementModel userStatementModel2 = this.toDoubleRange;
        if (userStatementModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementModel");
        }
        userStatementModel2.equals = ((StatementDateView) _$_findCachedViewById(resetInternal.setMax.onTransitionChange)).getRunningDate();
        UserStatementModel userStatementModel3 = this.toDoubleRange;
        if (userStatementModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementModel");
        }
        userStatementModel3.length = ((AccumulateStatementAmountView) _$_findCachedViewById(resetInternal.setMax.setWrapMode)).getTotalIncome();
        UserStatementModel userStatementModel4 = this.toDoubleRange;
        if (userStatementModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementModel");
        }
        userStatementModel4.toIntRange = ((AccumulateStatementAmountView) _$_findCachedViewById(resetInternal.setMax.setWrapMode)).getTotalExpense();
        StatementDownloadActivity.setMax setmax = StatementDownloadActivity.Companion;
        Context context = this;
        List<StatementViewModel> list = this.setMax;
        UserStatementModel userStatementModel5 = this.toDoubleRange;
        if (userStatementModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementModel");
        }
        startActivity(StatementDownloadActivity.setMax.getMax(context, list, userStatementModel5, this.toFloatRange, this.equals));
        convertDipToPx.length length2 = new convertDipToPx.length(getApplicationContext());
        length2.getMax = TrackerKey.Event.DANA_STATEMENT_DOWNLOAD;
        convertDipToPx.length max = length2.setMax("Source", getSource());
        max.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
    }

    public static final /* synthetic */ Unit access$setStatementSummary(StatementActivity statementActivity, List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatementViewModel statementViewModel = (StatementViewModel) it.next();
            if (1 == statementViewModel.setMax && getMax(statementViewModel)) {
                CurrencyAmountModel currencyAmountModel = statementViewModel.setMin.setMax;
                ((AccumulateStatementAmountView) statementActivity._$_findCachedViewById(resetInternal.setMax.setWrapMode)).setTotalIncome(currencyAmountModel != null ? currencyAmountModel.setMax() : null);
                statementActivity.toIntRange = statementViewModel.setMin;
            } else if (1 == statementViewModel.setMax && getMin(statementViewModel)) {
                CurrencyAmountModel currencyAmountModel2 = statementViewModel.setMin.setMax;
                ((AccumulateStatementAmountView) statementActivity._$_findCachedViewById(resetInternal.setMax.setWrapMode)).setTotalExpense(currencyAmountModel2 != null ? currencyAmountModel2.setMax() : null);
                statementActivity.isInside = statementViewModel.setMin;
            }
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$fillDataToChart(StatementActivity statementActivity, List list, String str) {
        StatementChartView statementChartView = (StatementChartView) statementActivity._$_findCachedViewById(resetInternal.setMax.removeItem);
        statementChartView.fitScreen();
        statementChartView.invalidate();
        statementChartView.clear();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatementDetailModel statementDetailModel = (StatementDetailModel) it.next();
            String str2 = statementDetailModel.setMin.getMax;
            Intrinsics.checkNotNullExpressionValue(str2, "it.amount.amount");
            float parseFloat = Float.parseFloat(StringsKt.replace$default(str2, ".", "", false, 4, (Object) null));
            long j = statementDetailModel.getMax;
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            arrayList.add(new Entry((float) instance.get(5), parseFloat, str));
        }
        AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
        if (Intrinsics.areEqual((Object) str, (Object) AUAbsTheme.setMax())) {
            AUAbsTheme aUAbsTheme2 = AUAbsTheme.getMin;
            ((StatementChartView) statementActivity._$_findCachedViewById(resetInternal.setMax.removeItem)).setLineDataSet1(new LineDataSet(arrayList, AUAbsTheme.setMax()));
            statementActivity.toFloatRange.clear();
            statementActivity.toFloatRange.addAll(list);
        } else {
            AUAbsTheme aUAbsTheme3 = AUAbsTheme.getMin;
            if (Intrinsics.areEqual((Object) str, (Object) AUAbsTheme.getMin())) {
                AUAbsTheme aUAbsTheme4 = AUAbsTheme.getMin;
                ((StatementChartView) statementActivity._$_findCachedViewById(resetInternal.setMax.removeItem)).setLineDataSet2(new LineDataSet(arrayList, AUAbsTheme.getMin()));
                statementActivity.equals.clear();
                statementActivity.equals.addAll(list);
            }
        }
        ((StatementChartView) statementActivity._$_findCachedViewById(resetInternal.setMax.removeItem)).setMaxXAxisRange(list.size());
        ((StatementChartView) statementActivity._$_findCachedViewById(resetInternal.setMax.removeItem)).build();
    }

    public static final /* synthetic */ void access$setAdapterStatementItems(StatementActivity statementActivity, List list) {
        if (list != null) {
            statementActivity.getMax.getMin(list);
            statementActivity.getMax(list.isEmpty());
            return;
        }
        statementActivity.getMax(true);
    }

    public static final /* synthetic */ void access$showChartWithNoData(StatementActivity statementActivity) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Entry((byte) 0));
        AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
        ((StatementChartView) statementActivity._$_findCachedViewById(resetInternal.setMax.removeItem)).setLineDataSet1(new LineDataSet(arrayList, AUAbsTheme.setMax()));
    }

    public static final /* synthetic */ void access$resetStatementItems(StatementActivity statementActivity) {
        statementActivity.toIntRange = null;
        statementActivity.isInside = null;
        statementActivity.getMax.getMin((List) null);
        statementActivity.setMax.clear();
    }

    public static final /* synthetic */ void access$closeOnBoardingView(StatementActivity statementActivity, ViewGroup viewGroup) {
        getSelectedIndex.length length2 = statementActivity.onBoardingPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onBoardingPresenter");
        }
        length2.getMax("statement");
        viewGroup.removeView(statementActivity.getMin);
    }
}

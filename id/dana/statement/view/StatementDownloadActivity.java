package id.dana.statement.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.statement.StatementType;
import id.dana.richview.statement.StatementChartView;
import id.dana.statement.model.StatementDetailModel;
import id.dana.statement.model.StatementViewModel;
import id.dana.statement.model.UserStatementModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import o.AUAbsTheme;
import o.dispatchOnCancelled;
import o.getDimension;
import o.onCancelLoad;
import o.onCanceled;
import o.resetInternal;
import o.setCancelText;
import o.setCustomPopMenu;
import o.setLeftSelectedIndex;
import o.setStateOn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J8\u0010\u0010\u001a\u00020\u000f2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J-\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00172\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J.\u0010#\u001a\u00020\u000f2\u001a\u0010$\u001a\u0016\u0012\u0004\u0012\u00020%\u0018\u00010\u0012j\n\u0012\u0004\u0012\u00020%\u0018\u0001`\u00142\b\u0010&\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010'\u001a\u00020\u000fH\u0002J\b\u0010(\u001a\u00020\u000fH\u0002J\b\u0010)\u001a\u00020\u000fH\u0002J\b\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u000fH\u0002J\u0010\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020/H\u0002J8\u00100\u001a\u0012\u0012\u0004\u0012\u0002010\u0012j\b\u0012\u0004\u0012\u000201`\u00142\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00142\u0006\u00103\u001a\u000204H\u0002R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lid/dana/statement/view/StatementDownloadActivity;", "Lid/dana/base/BaseActivity;", "()V", "screenShotPermission", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "getScreenShotPermission", "()Lid/dana/utils/permission/Permission;", "screenShotPermission$delegate", "Lkotlin/Lazy;", "statementData", "Lid/dana/statement/model/UserStatementModel;", "statementDownloadAdapter", "Lid/dana/statement/adapter/StatementDownloadAdapter;", "checkRecyclerViewFullyLoaded", "", "constructChart", "incomeData", "Ljava/util/ArrayList;", "Lid/dana/statement/model/StatementDetailModel;", "Lkotlin/collections/ArrayList;", "expenseData", "getLayout", "", "init", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "prepareBundleData", "prepareViewToSnap", "setStatementData", "statementModel", "Lid/dana/statement/model/StatementViewModel;", "userStatementModel", "setToolbar", "setupRecyclerView", "setupView", "showToastDownloadFailed", "showToastDownloadSuccess", "startScreenShot", "takeScreenShot", "view", "Landroid/view/View;", "toEntries", "Lcom/github/mikephil/charting/data/Entry;", "statementDetails", "statementType", "Lid/dana/domain/statement/StatementType;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementDownloadActivity extends BaseActivity {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private UserStatementModel getMax;
    private getDimension getMin = new getDimension();
    private final Lazy setMax = LazyKt.lazy(new getMax(this));
    private HashMap toFloatRange;

    private final setStateOn getMin() {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1072266473, oncanceled);
            onCancelLoad.getMin(1072266473, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1072266473, oncanceled2);
            onCancelLoad.getMin(1072266473, oncanceled2);
        }
        return (setStateOn) this.setMax.getValue();
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toFloatRange;
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
            onCancelLoad.setMax(-2066751336, oncanceled);
            onCancelLoad.getMin(-2066751336, oncanceled);
        }
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_download_statement;
    }

    public static final /* synthetic */ void access$checkRecyclerViewFullyLoaded(StatementDownloadActivity statementDownloadActivity) {
        int length;
        int min;
        Context baseContext = statementDownloadActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1134219422, oncanceled);
            onCancelLoad.getMin(1134219422, oncanceled);
        }
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        RecyclerView recyclerView = (RecyclerView) statementDownloadActivity._$_findCachedViewById(resetInternal.setMax.hasOverlappingRendering);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_statement_history");
        recyclerView.setLayoutManager(new StatementDownloadActivity$checkRecyclerViewFullyLoaded$1(statementDownloadActivity, intRef, statementDownloadActivity));
    }

    public static final /* synthetic */ void access$prepareViewToSnap(StatementDownloadActivity statementDownloadActivity) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1896422748, oncanceled);
            onCancelLoad.getMin(-1896422748, oncanceled);
        }
        ScrollView scrollView = (ScrollView) statementDownloadActivity._$_findCachedViewById(resetInternal.setMax.setCompoundDrawablesRelative);
        Intrinsics.checkNotNullExpressionValue(scrollView, "view");
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new getMin(statementDownloadActivity, scrollView));
    }

    private final ArrayList<Entry> getMin(ArrayList<StatementDetailModel> arrayList, StatementType statementType) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(892811514, oncanceled);
            onCancelLoad.getMin(892811514, oncanceled);
        }
        ArrayList<Entry> arrayList2 = new ArrayList<>();
        for (StatementDetailModel statementDetailModel : arrayList) {
            String str = statementDetailModel.setMin.getMax;
            Intrinsics.checkNotNullExpressionValue(str, "it.amount.amount");
            String replace$default = StringsKt.replace$default(str, ".", "", false, 4, (Object) null);
            long j = statementDetailModel.getMax;
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            arrayList2.add(new Entry((float) instance.get(5), Float.parseFloat(replace$default), statementType));
        }
        return arrayList2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"id/dana/statement/view/StatementDownloadActivity$prepareViewToSnap$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ScrollView getMin;
        final /* synthetic */ StatementDownloadActivity setMax;

        getMin(StatementDownloadActivity statementDownloadActivity, ScrollView scrollView) {
            this.setMax = statementDownloadActivity;
            this.getMin = scrollView;
        }

        public final void onGlobalLayout() {
            ScrollView scrollView = this.getMin;
            Intrinsics.checkNotNullExpressionValue(scrollView, "view");
            scrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            StatementDownloadActivity statementDownloadActivity = this.setMax;
            ScrollView scrollView2 = this.getMin;
            Intrinsics.checkNotNullExpressionValue(scrollView2, "view");
            StatementDownloadActivity.access$takeScreenShot(statementDownloadActivity, scrollView2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ StatementDownloadActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(StatementDownloadActivity statementDownloadActivity) {
            super(0);
            this.this$0 = statementDownloadActivity;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin = new setStateOn.getMin((Activity) this.this$0);
            getmin.length.add("android.permission.WRITE_EXTERNAL_STORAGE");
            getmin.getMax = new setStateOn.length(this) {
                final /* synthetic */ getMax setMin;

                {
                    this.setMin = r1;
                }

                public final void getMin(@Nullable setStateOn.setMin setmin) {
                    StatementDownloadActivity.access$checkRecyclerViewFullyLoaded(this.setMin.this$0);
                }

                public final void setMin(@Nullable setStateOn.setMin setmin) {
                    setCancelText.length(this.setMin.this$0, R.drawable.failed, R.drawable.bg_rounded_toast_failed, this.setMin.this$0.getString(R.string.download_statement_failed_message), 48, 60, false, (String) null, 384);
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }

    public final void onRequestPermissionsResult(int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        Intrinsics.checkNotNullParameter(iArr, RequestPermission.GRANT_RESULTS);
        if (!getMin().getMin(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¨\u0006\u0011"}, d2 = {"Lid/dana/statement/view/StatementDownloadActivity$Companion;", "", "()V", "createStatementDownloadIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "statementViewModels", "", "Lid/dana/statement/model/StatementViewModel;", "userStatementModel", "Lid/dana/statement/model/UserStatementModel;", "lineDataSetIncome", "Ljava/util/ArrayList;", "Lid/dana/statement/model/StatementDetailModel;", "Lkotlin/collections/ArrayList;", "lineDataSetExpense", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        @NotNull
        public static Intent getMax(@NotNull Context context, @NotNull List<StatementViewModel> list, @NotNull UserStatementModel userStatementModel, @NotNull ArrayList<StatementDetailModel> arrayList, @NotNull ArrayList<StatementDetailModel> arrayList2) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(list, "statementViewModels");
            Intrinsics.checkNotNullParameter(userStatementModel, "userStatementModel");
            Intrinsics.checkNotNullParameter(arrayList, "lineDataSetIncome");
            Intrinsics.checkNotNullParameter(arrayList2, "lineDataSetExpense");
            Intent intent = new Intent(context, StatementDownloadActivity.class);
            intent.putParcelableArrayListExtra("data", new ArrayList(list));
            intent.putExtra("source", userStatementModel);
            intent.putParcelableArrayListExtra("statement_income_data", arrayList);
            intent.putParcelableArrayListExtra("statement_expense_data", arrayList2);
            return intent;
        }
    }

    public final void init() {
        int length;
        int min;
        int length2;
        TextView textView;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1320501375 == (max = dispatchOnCancelled.getMax(applicationContext, 1320501375)))) {
            onCanceled oncanceled = new onCanceled(1320501375, max, 512);
            onCancelLoad.setMax(1320501375, oncanceled);
            onCancelLoad.getMin(1320501375, oncanceled);
        }
        setTitle(getString(R.string.statement_summary));
        setMenuLeftButton((int) R.drawable.ic_close);
        View _$_findCachedViewById = _$_findCachedViewById(resetInternal.setMax.addSubMenu);
        if (!(_$_findCachedViewById == null || (textView = (TextView) _$_findCachedViewById.findViewById(resetInternal.setMax.hasWindowFocus)) == null)) {
            textView.setContentDescription(getString(R.string.lblStatementSummary));
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1750465244, oncanceled2);
            onCancelLoad.getMin(1750465244, oncanceled2);
        }
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ArrayList parcelableArrayList = extras.getParcelableArrayList("data");
            UserStatementModel userStatementModel = (UserStatementModel) extras.getParcelable("source");
            if (parcelableArrayList != null) {
                this.getMin.getMin(parcelableArrayList);
            }
            if (userStatementModel != null) {
                this.getMax = userStatementModel;
            }
            Collection parcelableArrayList2 = extras.getParcelableArrayList("statement_income_data");
            if (parcelableArrayList2 == null) {
                parcelableArrayList2 = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(parcelableArrayList2);
            Collection parcelableArrayList3 = extras.getParcelableArrayList("statement_expense_data");
            if (parcelableArrayList3 == null) {
                parcelableArrayList3 = CollectionsKt.emptyList();
            }
            ArrayList arrayList2 = new ArrayList(parcelableArrayList3);
            ArrayList<Entry> min2 = getMin(arrayList, StatementType.INCOME);
            ArrayList<Entry> min3 = getMin(arrayList2, StatementType.EXPENSE);
            StatementChartView statementChartView = (StatementChartView) _$_findCachedViewById(resetInternal.setMax.removeItem);
            AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
            statementChartView.setLineDataSet1(new LineDataSet(min2, AUAbsTheme.setMax()));
            statementChartView.getLineDataSet1().IsOverlapping();
            AUAbsTheme aUAbsTheme2 = AUAbsTheme.getMin;
            statementChartView.setLineDataSet2(new LineDataSet(min3, AUAbsTheme.getMin()));
            statementChartView.getLineDataSet2().IsOverlapping();
            XAxis xAxis = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis, "xAxis");
            xAxis.getMin(4.0f);
            statementChartView.setAnimationEnable(false);
            statementChartView.build();
        }
        StatementDateView statementDateView = (StatementDateView) _$_findCachedViewById(resetInternal.setMax.onTransitionChange);
        statementDateView.hideRollingMonthArrow();
        UserStatementModel userStatementModel2 = this.getMax;
        if (userStatementModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementData");
        }
        statementDateView.setMonth(userStatementModel2.IsOverlapping);
        UserStatementModel userStatementModel3 = this.getMax;
        if (userStatementModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementData");
        }
        statementDateView.setRunningDate(userStatementModel3.equals);
        AccumulateStatementAmountView accumulateStatementAmountView = (AccumulateStatementAmountView) _$_findCachedViewById(resetInternal.setMax.setWrapMode);
        UserStatementModel userStatementModel4 = this.getMax;
        if (userStatementModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementData");
        }
        accumulateStatementAmountView.setTotalIncome(userStatementModel4.length);
        UserStatementModel userStatementModel5 = this.getMax;
        if (userStatementModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("statementData");
        }
        accumulateStatementAmountView.setTotalExpense(userStatementModel5.toIntRange);
        accumulateStatementAmountView.disableClickOptionStatementMenu();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.hasOverlappingRendering);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.getMin);
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1335151433, oncanceled3);
            onCancelLoad.getMin(1335151433, oncanceled3);
        }
        getMin().setMin();
    }

    public static final /* synthetic */ void access$takeScreenShot(StatementDownloadActivity statementDownloadActivity, View view) {
        String str;
        int length;
        int min;
        int max;
        String str2;
        StatementDownloadActivity statementDownloadActivity2 = statementDownloadActivity;
        View view2 = view;
        setCustomPopMenu setcustompopmenu = setCustomPopMenu.getMax;
        Context context = statementDownloadActivity2;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(view2, "view");
        Intrinsics.checkNotNullParameter(DanaLogConstants.TAG.STATEMENT, "tag");
        if (setLeftSelectedIndex.setMin() <= 100) {
            str = "004";
        } else {
            if (view2 instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view2;
                int childCount = scrollView.getChildCount();
                int i = 0;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = scrollView.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "view.getChildAt(i)");
                    i += childAt.getHeight();
                }
                Bitmap max2 = setCustomPopMenu.getMax(scrollView, scrollView.getWidth(), i);
                StringBuilder sb = new StringBuilder();
                sb.append(DanaLogConstants.TAG.STATEMENT);
                sb.append("-");
                sb.append(String.valueOf(System.currentTimeMillis()));
                str2 = setCustomPopMenu.setMax(context, max2, sb.toString());
                if (max2 != null && Intrinsics.areEqual((Object) "001", (Object) str2) && !max2.isRecycled()) {
                    max2.recycle();
                }
            } else {
                Bitmap length2 = setCustomPopMenu.length(view);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(DanaLogConstants.TAG.STATEMENT);
                sb2.append("-");
                sb2.append(String.valueOf(System.currentTimeMillis()));
                str2 = setCustomPopMenu.setMax(context, length2, sb2.toString());
                if (length2 != null && Intrinsics.areEqual((Object) "001", (Object) str2) && !length2.isRecycled()) {
                    length2.recycle();
                }
            }
            str = str2;
        }
        if (Intrinsics.areEqual((Object) "001", (Object) str)) {
            Context baseContext = statementDownloadActivity.getBaseContext();
            Context context2 = null;
            Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
            if (!(applicationContext == null || -886711320 == (max = dispatchOnCancelled.getMax(applicationContext, -886711320)))) {
                onCanceled oncanceled = new onCanceled(-886711320, max, 512);
                onCancelLoad.setMax(-886711320, oncanceled);
                onCancelLoad.getMin(-886711320, oncanceled);
            }
            Context baseContext2 = statementDownloadActivity.getBaseContext();
            if (baseContext2 != null) {
                context2 = baseContext2.getApplicationContext();
            }
            if (!(context2 == null || (length = context2.fileList().length) == (min = dispatchOnCancelled.getMin(context2, length)))) {
                onCanceled oncanceled2 = new onCanceled(length, min, 32);
                onCancelLoad.setMax(-886711320, oncanceled2);
                onCancelLoad.getMin(-886711320, oncanceled2);
            }
            setCancelText.length(statementDownloadActivity2, R.drawable.ic_success, R.drawable.bg_rounded_toast_success, statementDownloadActivity2.getString(R.string.download_statement_success_message), 48, 60, false, statementDownloadActivity2.getString(R.string.toastDownloadSuccess), 128);
            return;
        }
        setCancelText.length(statementDownloadActivity2, R.drawable.failed, R.drawable.bg_rounded_toast_failed, statementDownloadActivity2.getString(R.string.download_statement_failed_message), 48, 60, false, (String) null, 384);
    }
}

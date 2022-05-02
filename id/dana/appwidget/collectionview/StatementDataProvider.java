package id.dana.appwidget.collectionview;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import com.j256.ormlite.field.FieldType;
import id.dana.DanaApplication;
import id.dana.di.modules.DanaAppWidgetModule;
import id.dana.domain.statement.StatementType;
import id.dana.model.CurrencyAmountModel;
import id.dana.statement.model.StatementSummaryModel;
import id.dana.statement.model.StatementViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin._Assertions;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.ViewBoundsCheck$ViewBounds;
import o.autoMigrations;
import o.chooseSizeAndMargin;
import o.getPresetPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u0003/01B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020 H\u0016JM\u0010%\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00112\u0010\u0010'\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010)J\u0016\u0010*\u001a\u00020\u001b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0,H\u0002J9\u0010-\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010.R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u001a\u0012\b\u0012\u00060\u000bR\u00020\u00000\nj\f\u0012\b\u0012\u00060\u000bR\u00020\u0000`\fX\u0004¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u001a\u0012\b\u0012\u00060\u000bR\u00020\u00000\nj\f\u0012\b\u0012\u00060\u000bR\u00020\u0000`\fX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lid/dana/appwidget/collectionview/StatementDataProvider;", "Landroid/content/ContentProvider;", "()V", "danaAppWidgetPresenter", "Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "getDanaAppWidgetPresenter", "()Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "setDanaAppWidgetPresenter", "(Lid/dana/appwidget/DanaAppWidgetContract$Presenter;)V", "dataExpenseSummaries", "Ljava/util/ArrayList;", "Lid/dana/appwidget/collectionview/StatementDataProvider$StatementItem;", "Lkotlin/collections/ArrayList;", "dataIncomeSummaries", "delete", "", "uri", "Landroid/net/Uri;", "selection", "", "selectionArgs", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getDanaWidgetModule", "Lid/dana/di/modules/DanaAppWidgetModule;", "getType", "initComponent", "", "insert", "values", "Landroid/content/ContentValues;", "isTypeExpense", "", "item", "Lid/dana/statement/model/StatementViewModel;", "isTypeIncome", "onCreate", "query", "Landroid/database/Cursor;", "projection", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "setStatementSummary", "listStatementViewModel", "", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Columns", "Companion", "StatementItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementDataProvider extends ContentProvider {
    @NotNull
    public static final length Companion = new length((byte) 0);
    /* access modifiers changed from: private */
    @NotNull
    public static final Uri length;
    @Inject
    public ViewBoundsCheck$ViewBounds.getMin danaAppWidgetPresenter;
    private final ArrayList<setMax> setMax = new ArrayList<>();
    private final ArrayList<setMax> setMin = new ArrayList<>();

    public final int delete(@NotNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return 0;
    }

    @NotNull
    public final String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return "®";
    }

    @Nullable
    public final Uri insert(@NotNull Uri uri, @Nullable ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    @NotNull
    public final ViewBoundsCheck$ViewBounds.getMin getDanaAppWidgetPresenter() {
        ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        return getmin;
    }

    public final void setDanaAppWidgetPresenter(@NotNull ViewBoundsCheck$ViewBounds.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.danaAppWidgetPresenter = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/appwidget/collectionview/StatementDataProvider$Companion;", "", "()V", "CONTENT_URI", "Landroid/net/Uri;", "getCONTENT_URI", "()Landroid/net/Uri;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @NotNull
        public static Uri setMax() {
            return StatementDataProvider.length;
        }
    }

    static {
        Uri parse = Uri.parse("content://id.dana.appwidget.collectionview");
        Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(\"content://id.…ppwidget.collectionview\")");
        length = parse;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/appwidget/collectionview/StatementDataProvider$getDanaWidgetModule$1", "Lid/dana/appwidget/DanaAppWidgetContract$View;", "onGetAllStatementSummary", "", "listStatementViewModel", "", "Lid/dana/statement/model/StatementViewModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ViewBoundsCheck$ViewBounds.setMin {
        final /* synthetic */ StatementDataProvider setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMin() {
        }

        public final void length(@NotNull CurrencyAmountModel currencyAmountModel) {
            Intrinsics.checkNotNullParameter(currencyAmountModel, "balance");
        }

        public final void length(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelExpense");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMax() {
        }

        public final void setMax(@NotNull autoMigrations automigrations) {
            Intrinsics.checkNotNullParameter(automigrations, "incomeAndExpenseEntryChartModel");
        }

        public final void setMin(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelIncome");
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMin(StatementDataProvider statementDataProvider) {
            this.setMax = statementDataProvider;
        }

        public final void getMax(@NotNull List<StatementViewModel> list) {
            Intrinsics.checkNotNullParameter(list, "listStatementViewModel");
            StatementDataProvider.access$setStatementSummary(this.setMax, list);
        }
    }

    @NotNull
    public final synchronized Cursor query(@NotNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        MatrixCursor matrixCursor;
        DanaApplication danaApplication;
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean isEmpty = uri.getPathSegments().isEmpty();
        if (_Assertions.ENABLED) {
            if (!isEmpty) {
                throw new AssertionError("Assertion failed");
            }
        }
        if (this.danaAppWidgetPresenter == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                Context applicationContext = requireContext.getApplicationContext();
                if (applicationContext != null) {
                    danaApplication = (DanaApplication) applicationContext;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
                }
            } else {
                Context context = getContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.checkNotNullExpressionValue(context, "context!!");
                Context applicationContext2 = context.getApplicationContext();
                if (applicationContext2 != null) {
                    danaApplication = (DanaApplication) applicationContext2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
                }
            }
            PrepareException.AnonymousClass1 applicationComponent = danaApplication.getApplicationComponent();
            if (applicationComponent != null) {
                getPresetPackage.getMin getmin = new getPresetPackage.getMin((byte) 0);
                if (applicationComponent != null) {
                    getmin.length = applicationComponent;
                    getmin.setMin = new DanaAppWidgetModule(new getMin(this));
                    getmin.getMin().getMax(this);
                } else {
                    throw new NullPointerException();
                }
            }
            ViewBoundsCheck$ViewBounds.getMin getmin2 = this.danaAppWidgetPresenter;
            if (getmin2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
            }
            getmin2.setMin();
        }
        matrixCursor = new MatrixCursor(new String[]{FieldType.FOREIGN_ID_FIELD_SUFFIX, "biz_type", "amount"});
        if (Intrinsics.areEqual((Object) str, (Object) StatementType.INCOME.name())) {
            int size = this.setMax.size();
            for (int i = 0; i < size; i++) {
                setMax setmax = this.setMax.get(i);
                Intrinsics.checkNotNullExpressionValue(setmax, "dataIncomeSummaries[i]");
                setMax setmax2 = setmax;
                matrixCursor.addRow(new Object[]{Integer.valueOf(i), setmax2.setMax, setmax2.setMin});
            }
        } else if (Intrinsics.areEqual((Object) str, (Object) StatementType.EXPENSE.name())) {
            int size2 = this.setMin.size();
            for (int i2 = 0; i2 < size2; i2++) {
                setMax setmax3 = this.setMin.get(i2);
                Intrinsics.checkNotNullExpressionValue(setmax3, "dataExpenseSummaries[i]");
                setMax setmax4 = setmax3;
                matrixCursor.addRow(new Object[]{Integer.valueOf(i2), setmax4.setMax, setmax4.setMin});
            }
        }
        return matrixCursor;
    }

    public final synchronized int update(@NotNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context context = getContext();
        if (!(context == null || (contentResolver = context.getContentResolver()) == null)) {
            contentResolver.notifyChange(uri, (ContentObserver) null);
        }
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lid/dana/appwidget/collectionview/StatementDataProvider$StatementItem;", "", "statementId", "", "bizType", "", "description", "statementAmount", "(Lid/dana/appwidget/collectionview/StatementDataProvider;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getStatementAmount", "setStatementAmount", "getStatementId", "()I", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class setMax {
        private final int getMax;
        @NotNull
        private String getMin;
        final /* synthetic */ StatementDataProvider length;
        @NotNull
        String setMax;
        @NotNull
        String setMin;

        public setMax(StatementDataProvider statementDataProvider, @NotNull int i, @NotNull String str, @NotNull String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "bizType");
            Intrinsics.checkNotNullParameter(str2, "description");
            Intrinsics.checkNotNullParameter(str3, "statementAmount");
            this.length = statementDataProvider;
            this.getMax = i;
            this.setMax = str;
            this.getMin = str2;
            this.setMin = str3;
        }
    }

    private static boolean setMax(StatementViewModel statementViewModel) {
        return 1 == statementViewModel.setMax && Intrinsics.areEqual((Object) StatementType.INCOME.name(), (Object) statementViewModel.setMin.setMin);
    }

    private static boolean getMin(StatementViewModel statementViewModel) {
        return 1 == statementViewModel.setMax && Intrinsics.areEqual((Object) StatementType.EXPENSE.name(), (Object) statementViewModel.setMin.setMin);
    }

    public static final /* synthetic */ void access$setStatementSummary(StatementDataProvider statementDataProvider, List list) {
        ContentResolver contentResolver;
        List<StatementSummaryModel> list2;
        statementDataProvider.setMax.clear();
        statementDataProvider.setMin.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatementViewModel statementViewModel = (StatementViewModel) it.next();
            if (setMax(statementViewModel)) {
                List<StatementSummaryModel> list3 = statementViewModel.setMin.getMin;
                if (list3 != null) {
                    for (StatementSummaryModel statementSummaryModel : list3) {
                        ArrayList<setMax> arrayList = statementDataProvider.setMax;
                        int hashCode = statementSummaryModel.hashCode();
                        String str = statementSummaryModel.setMax;
                        String str2 = statementSummaryModel.getMax;
                        String str3 = statementSummaryModel.setMin.getMax;
                        Intrinsics.checkNotNullExpressionValue(str3, "statementSummaryModel.amount.amount");
                        arrayList.add(new setMax(statementDataProvider, hashCode, str, str2, str3));
                    }
                }
            } else if (getMin(statementViewModel) && (list2 = statementViewModel.setMin.getMin) != null) {
                for (StatementSummaryModel statementSummaryModel2 : list2) {
                    ArrayList<setMax> arrayList2 = statementDataProvider.setMin;
                    int hashCode2 = statementSummaryModel2.hashCode();
                    String str4 = statementSummaryModel2.setMax;
                    String str5 = statementSummaryModel2.getMax;
                    String str6 = statementSummaryModel2.setMin.getMax;
                    Intrinsics.checkNotNullExpressionValue(str6, "statementSummaryModel.amount.amount");
                    arrayList2.add(new setMax(statementDataProvider, hashCode2, str4, str5, str6));
                }
            }
        }
        Context context = statementDataProvider.getContext();
        if (context != null && (contentResolver = context.getContentResolver()) != null) {
            contentResolver.notifyChange(length, (ContentObserver) null);
        }
    }
}

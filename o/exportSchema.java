package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.appwidget.collectionview.StatementDataProvider;
import id.dana.domain.statement.StatementType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/appwidget/collectionview/StatementListRemoteViewsFactory;", "Landroid/widget/RemoteViewsService$RemoteViewsFactory;", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "forIncomePurpose", "", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "appWidgetId", "", "cursor", "Landroid/database/Cursor;", "getCount", "getItemId", "", "position", "getLoadingView", "Landroid/widget/RemoteViews;", "getViewAt", "getViewTypeCount", "hasStableIds", "onCreate", "", "onDataSetChanged", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class exportSchema implements RemoteViewsService.RemoteViewsFactory {
    private Cursor getMax;
    private final boolean getMin;
    private final Context setMax;
    private int setMin;

    public final long getItemId(int i) {
        return (long) i;
    }

    @Nullable
    public final RemoteViews getLoadingView() {
        return null;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final void onCreate() {
    }

    public exportSchema(@NotNull Context context, @NotNull Intent intent, boolean z) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        this.setMax = context;
        this.getMin = z;
        this.setMin = intent.getIntExtra("appWidgetId", 0);
    }

    public /* synthetic */ exportSchema(Context context, Intent intent) {
        this(context, intent, true);
    }

    public final void onDestroy() {
        Cursor cursor = this.getMax;
        if (cursor != null) {
            cursor.close();
        }
    }

    public final int getCount() {
        Cursor cursor = this.getMax;
        if (cursor != null) {
            return cursor.getCount();
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r7 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r7 == null) goto L_0x0052;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.widget.RemoteViews getViewAt(int r7) {
        /*
            r6 = this;
            android.database.Cursor r0 = r6.getMax
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x005c
            boolean r7 = r0.moveToPosition(r7)
            r0 = 1
            if (r7 != r0) goto L_0x005c
            android.database.Cursor r7 = r6.getMax
            r0 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r1 = "amount"
            int r7 = r7.getColumnIndex(r1)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x001e
        L_0x001d:
            r7 = r0
        L_0x001e:
            android.database.Cursor r1 = r6.getMax
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = "biz_type"
            int r0 = r1.getColumnIndex(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002c:
            android.database.Cursor r1 = r6.getMax
            r2 = 0
            if (r1 == 0) goto L_0x003f
            if (r7 == 0) goto L_0x0038
            int r7 = r7.intValue()
            goto L_0x0039
        L_0x0038:
            r7 = 0
        L_0x0039:
            java.lang.String r7 = r1.getString(r7)
            if (r7 != 0) goto L_0x0041
        L_0x003f:
            java.lang.String r7 = "-"
        L_0x0041:
            r1 = r7
            android.database.Cursor r7 = r6.getMax
            if (r7 == 0) goto L_0x0052
            if (r0 == 0) goto L_0x004c
            int r2 = r0.intValue()
        L_0x004c:
            java.lang.String r7 = r7.getString(r2)
            if (r7 != 0) goto L_0x0058
        L_0x0052:
            id.dana.statement.StatementTransactionType r7 = id.dana.statement.StatementTransactionType.DEFAULT
            java.lang.String r7 = r7.name()
        L_0x0058:
            r5 = r1
            r1 = r7
            r7 = r5
            goto L_0x005d
        L_0x005c:
            r7 = r1
        L_0x005d:
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.content.Context r2 = r6.setMax
            java.lang.String r2 = r2.getPackageName()
            r3 = 2131559009(0x7f0d0261, float:1.874335E38)
            r0.<init>(r2, r3)
            r2 = 2131363512(0x7f0a06b8, float:1.8346835E38)
            id.dana.statement.StatementTransactionType$getMin r3 = id.dana.statement.StatementTransactionType.Companion
            id.dana.statement.StatementTransactionType r3 = id.dana.statement.StatementTransactionType.getMin.setMin(r1)
            int r3 = r3.getDrawableIcon()
            r0.setImageViewResource(r2, r3)
            r2 = 2131365321(0x7f0a0dc9, float:1.8350504E38)
            android.content.Context r3 = r6.setMax
            id.dana.statement.StatementTransactionType$getMin r4 = id.dana.statement.StatementTransactionType.Companion
            id.dana.statement.StatementTransactionType r1 = id.dana.statement.StatementTransactionType.getMin.setMin(r1)
            int r1 = r1.getLocalizedTitle()
            java.lang.String r1 = r3.getString(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setTextViewText(r2, r1)
            r1 = 2131365322(0x7f0a0dca, float:1.8350506E38)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r2 = "Rp"
            java.lang.String r7 = r2.concat(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r0.setTextViewText(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.exportSchema.getViewAt(int):android.widget.RemoteViews");
    }

    public final void onDataSetChanged() {
        String str;
        if (this.getMin) {
            str = StatementType.INCOME.name();
        } else {
            str = StatementType.EXPENSE.name();
        }
        String str2 = str;
        Cursor cursor = this.getMax;
        if (cursor != null) {
            cursor.close();
        }
        ContentResolver contentResolver = this.setMax.getContentResolver();
        StatementDataProvider.length length = StatementDataProvider.Companion;
        this.getMax = contentResolver.query(StatementDataProvider.length.setMax(), (String[]) null, str2, (String[]) null, (String) null);
    }
}

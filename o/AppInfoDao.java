package o;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/dialog/KycAmlEddDialog;", "", "context", "Landroid/content/Context;", "mandatoryDialog", "", "cancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;Landroid/view/View$OnClickListener;)V", "getContext", "()Landroid/content/Context;", "showDialog", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AppInfoDao {
    public final DialogInterface.OnCancelListener getMin;
    public final boolean length;
    @NotNull
    public final Context setMax;
    public final View.OnClickListener setMin;

    public AppInfoDao(@NotNull Context context, boolean z, @NotNull DialogInterface.OnCancelListener onCancelListener, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(onCancelListener, "cancelListener");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.setMax = context;
        this.length = z;
        this.getMin = onCancelListener;
        this.setMin = onClickListener;
    }
}

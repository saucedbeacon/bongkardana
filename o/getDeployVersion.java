package o;

import android.content.Context;
import android.content.DialogInterface;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.dialog.DialogWithImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/dialog/BillerX2BDialog;", "", "context", "Landroid/content/Context;", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V", "getContext", "()Landroid/content/Context;", "showDialog", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getDeployVersion {
    private final DialogInterface.OnClickListener length;
    @NotNull
    private final Context setMin;

    public getDeployVersion(@NotNull Context context, @NotNull DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.setMin = context;
        this.length = onClickListener;
    }

    public final void setMax() {
        DialogWithImage.getMin getmin = new DialogWithImage.getMin();
        getmin.toFloatRange = R.drawable.ic_allbiller_x2b;
        getmin.getMax = this.setMin.getString(R.string.allbiller_x2b_title);
        getmin.setMin = this.setMin.getString(R.string.allbiller_x2b_desc);
        getmin.getMin = this.setMin.getString(R.string.allbiller_x2b_button);
        getmin.length = this.length;
        new DialogWithImage(this.setMin, getmin.setMax, getmin, (byte) 0).setMin();
    }
}

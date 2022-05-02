package id.dana.sendmoney_v2.recipient.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lid/dana/sendmoney_v2/recipient/model/EmptyStateViewModel;", "Lid/dana/sendmoney/model/RecipientViewModel;", "viewType", "", "iconDrawable", "titleStringRes", "descStringRes", "actionStringRes", "hasAction", "", "(IIIIIZ)V", "getActionStringRes", "()I", "getDescStringRes", "getHasAction", "()Z", "getIconDrawable", "getTitleStringRes", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EmptyStateViewModel extends RecipientViewModel {
    public final int Grayscale$Algorithm;
    public final int Mean$Arithmetic;
    private final boolean invoke;
    public final int invokeSuspend;
    public final int valueOf;

    public /* synthetic */ EmptyStateViewModel(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, R.string.contact_not_found_message, false);
    }

    public final boolean IsOverlapping() {
        return this.invoke;
    }

    public EmptyStateViewModel(int i, @DrawableRes int i2, @StringRes int i3, @StringRes int i4, @StringRes int i5, boolean z) {
        super(i);
        this.Grayscale$Algorithm = i2;
        this.invokeSuspend = i3;
        this.Mean$Arithmetic = i4;
        this.valueOf = i5;
        this.invoke = z;
    }
}

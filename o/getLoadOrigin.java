package o;

import android.content.Context;
import android.text.TextUtils;
import id.dana.R;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.recipient.RecipientType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.PhotoBrowseView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u001f\u001a\u00020\u000bH\u0002J\u0010\u0010 \u001a\n !*\u0004\u0018\u00010\u00050\u0005H\u0002J\u0006\u0010\"\u001a\u00020\u0005J\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u0005J\u0010\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'J\u0012\u0010(\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010'H\u0002J\u0006\u0010)\u001a\u00020\u0005R\u0011\u0010\u0007\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lid/dana/sendmoney/summary/view/SummaryViewState;", "", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "remarks", "", "(Lid/dana/sendmoney/model/RecipientModel;Ljava/lang/String;)V", "imageUrl", "getImageUrl", "()Ljava/lang/String;", "isAmountLocked", "", "()Z", "isRecipientDanaUser", "isSendToBank", "isSendToContact", "isSendToLink", "isSendToOtc", "isSendToRecentContact", "isSendToScanner", "getRecipientModel", "()Lid/dana/sendmoney/model/RecipientModel;", "setRecipientModel", "(Lid/dana/sendmoney/model/RecipientModel;)V", "getRemarks", "setRemarks", "(Ljava/lang/String;)V", "totalFreeTransfer", "", "getTotalFreeTransfer", "()I", "checkAmountLocked", "getBankNumber", "kotlin.jvm.PlatformType", "getCurrencyAndAmountValue", "getImagePlaceHolder", "getRecipientSubtitle", "getRecipientTitle", "context", "Landroid/content/Context;", "getSendToLinkTitle", "getTransferType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getLoadOrigin {
    @NotNull
    public String getMin;
    @NotNull
    public RecipientModel length;

    public getLoadOrigin(@NotNull RecipientModel recipientModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(recipientModel, "recipientModel");
        Intrinsics.checkNotNullParameter(str, "remarks");
        this.length = recipientModel;
        this.getMin = str;
    }

    public final boolean length() {
        return Intrinsics.areEqual((Object) this.length.onNavigationEvent, (Object) "bank");
    }

    public final boolean setMin() {
        return Intrinsics.areEqual((Object) this.length.onNavigationEvent, (Object) "contact");
    }

    private boolean toIntRange() {
        return Intrinsics.areEqual((Object) this.length.onNavigationEvent, (Object) "link");
    }

    public final boolean getMin() {
        return this.length.isInside();
    }

    public final boolean setMax() {
        return equals();
    }

    public final int getMax() {
        String str = this.length.onNavigationEvent;
        if (str != null) {
            switch (str.hashCode()) {
                case 110366:
                    if (str.equals(RecipientType.OTC)) {
                        return R.drawable.ic_p2c;
                    }
                    break;
                case 3016252:
                    if (str.equals("bank")) {
                        return R.drawable.ic_other_bank;
                    }
                    break;
                case 3321850:
                    if (str.equals("link")) {
                        PhotoBrowseView.AnonymousClass1 r0 = PhotoBrowseView.AnonymousClass1.setMax;
                        String max = this.length.getMax();
                        Intrinsics.checkNotNullExpressionValue(max, "recipientModel.imageUrl");
                        return PhotoBrowseView.AnonymousClass1.setMax(max);
                    }
                    break;
                case 951526432:
                    if (str.equals("contact")) {
                        return R.drawable.ic_avatar_grey_default;
                    }
                    break;
            }
        }
        return R.drawable.ic_avatar_grey_default;
    }

    @NotNull
    public final String isInside() {
        String str = this.length.onNavigationEvent;
        if (str == null) {
            return "Not Supported";
        }
        switch (str.hashCode()) {
            case 110366:
                return str.equals(RecipientType.OTC) ? "OTC" : "Not Supported";
            case 3016252:
                if (str.equals("bank")) {
                    return "BANK_TRANSFER";
                }
                return "Not Supported";
            case 3321850:
                if (str.equals("link")) {
                    return "LINK";
                }
                return "Not Supported";
            case 951526432:
                if (str.equals("contact")) {
                    return "BALANCE";
                }
                return "Not Supported";
            default:
                return "Not Supported";
        }
    }

    @NotNull
    public final String getMax(@Nullable Context context) {
        if (toIntRange()) {
            return setMin(context);
        }
        if (!setMin() || getMin() || !Intrinsics.areEqual((Object) this.length.invokeSuspend, (Object) RecipientSource.MANUAL_INPUT)) {
            CharSequence length2 = this.length.length();
            boolean z = false;
            if (length2 == null || length2.length() == 0) {
                CharSequence charSequence = this.length.onTransact;
                if (charSequence == null || charSequence.length() == 0) {
                    String str = this.length.setMin;
                    Intrinsics.checkNotNullExpressionValue(str, "recipientModel.alias");
                    return str;
                }
            }
            if (!Intrinsics.areEqual((Object) this.length.length(), (Object) this.length.length)) {
                CharSequence charSequence2 = this.length.onTransact;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                }
                if (z || Intrinsics.areEqual((Object) this.length.onTransact, (Object) this.length.isInside)) {
                    String length3 = this.length.length();
                    Intrinsics.checkNotNullExpressionValue(length3, "recipientModel.name");
                    return length3;
                }
            }
            String str2 = this.length.onTransact;
            Intrinsics.checkNotNullExpressionValue(str2, "recipientModel.recipientName");
            return str2;
        }
        String str3 = this.length.isInside;
        Intrinsics.checkNotNullExpressionValue(str3, "recipientModel.number");
        return str3;
    }

    private final String setMin(Context context) {
        String equals = this.length.equals();
        String str = null;
        if (equals != null) {
            if (!(!StringsKt.isBlank(equals))) {
                equals = null;
            }
            if (equals != null) {
                return equals;
            }
        }
        if (context != null) {
            str = context.getString(R.string.send_as_link);
        }
        return str == null ? "" : str;
    }

    @NotNull
    public final String toFloatRange() {
        if (length()) {
            String format = String.format("%s | %s", Arrays.copyOf(new Object[]{this.length.length, IsOverlapping()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            return format;
        } else if (toIntRange()) {
            return "";
        } else {
            if (setMin() && !getMin() && Intrinsics.areEqual((Object) this.length.invokeSuspend, (Object) RecipientSource.MANUAL_INPUT)) {
                return "";
            }
            String str = this.length.isInside;
            Intrinsics.checkNotNullExpressionValue(str, "recipientModel.number");
            return str;
        }
    }

    private final String IsOverlapping() {
        if (Intrinsics.areEqual((Object) this.length.invokeSuspend, (Object) RecipientSource.MANUAL_INPUT)) {
            return this.length.isInside;
        }
        String str = this.length.isInside;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(" ", "");
        }
        Object[] objArr = new Object[1];
        if (str.length() >= 4) {
            str = str.substring(str.length() - 4);
        }
        objArr[0] = str;
        return String.format("•••• %s", objArr);
    }

    private final boolean equals() {
        return (Intrinsics.areEqual((Object) "split_bill", (Object) this.length.ICustomTabsCallback) || Intrinsics.areEqual((Object) "request_money", (Object) this.length.ICustomTabsCallback)) && !TextUtils.isEmpty(this.length.valueOf);
    }
}

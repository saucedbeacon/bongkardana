package id.dana.sendmoney_v2.x2l.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.RVParams;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.CornerMarkingDataProvider;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001c\u001a\u00020\u0013HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006#"}, d2 = {"Lid/dana/sendmoney_v2/x2l/model/SocialLinkModel;", "Landroid/os/Parcelable;", "title", "", "subTitle", "action", "icon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getIcon", "getSubTitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "getLocalizeText", "context", "Landroid/content/Context;", "key", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class SocialLinkModel implements Parcelable {
    public static final Parcelable.Creator<SocialLinkModel> CREATOR = new getMin();
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialLinkModel)) {
            return false;
        }
        SocialLinkModel socialLinkModel = (SocialLinkModel) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) socialLinkModel.length) && Intrinsics.areEqual((Object) this.getMin, (Object) socialLinkModel.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) socialLinkModel.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) socialLinkModel.setMin);
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMin;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialLinkModel(title=");
        sb.append(this.length);
        sb.append(", subTitle=");
        sb.append(this.getMin);
        sb.append(", action=");
        sb.append(this.setMax);
        sb.append(", icon=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.length);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMax);
        parcel.writeString(this.setMin);
    }

    public SocialLinkModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, RVParams.LONG_SUB_TITLE);
        Intrinsics.checkNotNullParameter(str3, "action");
        Intrinsics.checkNotNullParameter(str4, "icon");
        this.length = str;
        this.getMin = str2;
        this.setMax = str3;
        this.setMin = str4;
    }

    public static String setMax(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length2 = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length2);
            if (length2 != min) {
                onCanceled oncanceled = new onCanceled(length2, min, 8);
                onCancelLoad.setMax(-917852520, oncanceled);
                onCancelLoad.getMin(-917852520, oncanceled);
            }
        }
        return CornerMarkingDataProvider.AnonymousClass3.setMin(context, str, str);
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<SocialLinkModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SocialLinkModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new SocialLinkModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}

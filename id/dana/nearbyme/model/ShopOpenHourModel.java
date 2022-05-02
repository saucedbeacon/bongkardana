package id.dana.nearbyme.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.H5Worker;
import o.getBadgeList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\b\u0018\u0000 22\u00020\u0001:\u000223B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB7\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\b\u0010#\u001a\u00020$H\u0016J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\u000e\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020$HÖ\u0001J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\u0018\u0010/\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00101\u001a\u00020$H\u0016R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\r\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012¨\u00064"}, d2 = {"Lid/dana/nearbyme/model/ShopOpenHourModel;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "day", "", "openHour", "", "closeHour", "(Ljava/lang/String;JJ)V", "isToday", "", "isFullDay", "(Ljava/lang/String;JJZZ)V", "getCloseHour", "()J", "setCloseHour", "(J)V", "getDay", "()Ljava/lang/String;", "setDay", "(Ljava/lang/String;)V", "()Z", "setFullDay", "(Z)V", "setToday", "getOpenHour", "setOpenHour", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "getOpenHourText", "context", "Landroid/content/Context;", "getOpenHourType", "Lid/dana/nearbyme/model/ShopOpenHourModel$OpenHourType;", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "OpenHourType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ShopOpenHourModel implements Parcelable {
    @NotNull
    public static final setMax CREATOR = new setMax((byte) 0);
    public boolean getMax;
    private boolean getMin;
    @NotNull
    public String length;
    public long setMax;
    public long setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lid/dana/nearbyme/model/ShopOpenHourModel$OpenHourType;", "", "(Ljava/lang/String;I)V", "NONE", "OPEN", "OPENING_SOON", "CLOSING_SOON", "CLOSE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public enum OpenHourType {
        NONE,
        OPEN,
        OPENING_SOON,
        CLOSING_SOON,
        CLOSE
    }

    public ShopOpenHourModel() {
        this((String) null, false, 31);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopOpenHourModel)) {
            return false;
        }
        ShopOpenHourModel shopOpenHourModel = (ShopOpenHourModel) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) shopOpenHourModel.length) && this.setMin == shopOpenHourModel.setMin && this.setMax == shopOpenHourModel.setMax && this.getMax == shopOpenHourModel.getMax && this.getMin == shopOpenHourModel.getMin;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShopOpenHourModel(day=");
        sb.append(this.length);
        sb.append(", openHour=");
        sb.append(this.setMin);
        sb.append(", closeHour=");
        sb.append(this.setMax);
        sb.append(", isToday=");
        sb.append(this.getMax);
        sb.append(", isFullDay=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    private ShopOpenHourModel(@NotNull String str, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "day");
        this.length = str;
        this.setMin = j;
        this.setMax = j2;
        this.getMax = false;
        this.getMin = z;
    }

    public final boolean setMin() {
        return this.getMax;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShopOpenHourModel(String str, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, 0, 0, (i & 16) != 0 ? false : z);
    }

    public final boolean getMax() {
        return this.getMin;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShopOpenHourModel(@org.jetbrains.annotations.NotNull android.os.Parcel r8) {
        /*
            r7 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = r8.readString()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
        L_0x000d:
            r2 = r0
            java.lang.String r0 = "parcel.readString() ?: \"\""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            long r3 = r8.readLong()
            long r5 = r8.readLong()
            r1 = r7
            r1.<init>((java.lang.String) r2, (long) r3, (long) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.model.ShopOpenHourModel.<init>(android.os.Parcel):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShopOpenHourModel(@NotNull String str, long j, long j2) {
        this(str, j, j2, false);
        Intrinsics.checkNotNullParameter(str, "day");
    }

    @NotNull
    public final String length(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        int i = H5Worker.WorkerReadyListener.getMin[length().ordinal()];
        if (i == 1) {
            return "";
        }
        if (i == 2) {
            String string = context.getString(R.string.open);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.open)");
            return string;
        } else if (i == 3) {
            String string2 = context.getString(R.string.opening_soon);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.opening_soon)");
            return string2;
        } else if (i == 4) {
            String string3 = context.getString(R.string.closing_soon);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.string.closing_soon)");
            return string3;
        } else if (i == 5) {
            String string4 = context.getString(R.string.closed);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.string.closed)");
            return string4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final OpenHourType length() {
        if (this.setMin == 0 || this.setMax == 0) {
            return OpenHourType.NONE;
        }
        long nowDateInEpoch = getBadgeList.getNowDateInEpoch();
        long j = (this.setMin - nowDateInEpoch) / 60;
        long j2 = (this.setMax - nowDateInEpoch) / 60;
        if (1 <= j && 30 >= j) {
            return OpenHourType.OPENING_SOON;
        }
        if (nowDateInEpoch > this.setMin && j2 > 30) {
            return OpenHourType.OPEN;
        }
        if (1 <= j2 && 30 >= j2) {
            return OpenHourType.CLOSING_SOON;
        }
        return OpenHourType.CLOSE;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.length);
        parcel.writeLong(this.setMin);
        parcel.writeLong(this.setMax);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/nearbyme/model/ShopOpenHourModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lid/dana/nearbyme/model/ShopOpenHourModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lid/dana/nearbyme/model/ShopOpenHourModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax implements Parcelable.Creator<ShopOpenHourModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        }

        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopOpenHourModel(parcel);
        }
    }

    public final int hashCode() {
        String str = this.length;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.setMin).hashCode()) * 31) + Long.valueOf(this.setMax).hashCode()) * 31;
        boolean z = this.getMax;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.getMin;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }
}

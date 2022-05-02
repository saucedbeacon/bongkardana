package id.dana.nearbyme.merchantdetail.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 #2\u00020\u0001:\u0001#B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "Landroid/os/Parcelable;", "userId", "", "userName", "avatar", "imageUrl", "viewType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAvatar", "()Ljava/lang/String;", "getImageUrl", "getUserId", "getUserName", "getViewType", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class MerchantImageModel implements Parcelable {
    public static final Parcelable.Creator<MerchantImageModel> CREATOR = new setMax();
    @NotNull
    public static final getMin setMax = new getMin((byte) 0);
    @NotNull
    private final String IsOverlapping;
    @NotNull
    public final String getMax;
    public final int getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMin;

    public MerchantImageModel() {
        this((String) null, (String) null, (String) null, (String) null, 0, 31);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantImageModel)) {
            return false;
        }
        MerchantImageModel merchantImageModel = (MerchantImageModel) obj;
        return Intrinsics.areEqual((Object) this.IsOverlapping, (Object) merchantImageModel.IsOverlapping) && Intrinsics.areEqual((Object) this.getMax, (Object) merchantImageModel.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) merchantImageModel.setMin) && Intrinsics.areEqual((Object) this.length, (Object) merchantImageModel.length) && this.getMin == merchantImageModel.getMin;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantImageModel(userId=");
        sb.append(this.IsOverlapping);
        sb.append(", userName=");
        sb.append(this.getMax);
        sb.append(", avatar=");
        sb.append(this.setMin);
        sb.append(", imageUrl=");
        sb.append(this.length);
        sb.append(", viewType=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.length);
        parcel.writeInt(this.getMin);
    }

    public MerchantImageModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "userName");
        Intrinsics.checkNotNullParameter(str3, "avatar");
        Intrinsics.checkNotNullParameter(str4, "imageUrl");
        this.IsOverlapping = str;
        this.getMax = str2;
        this.setMin = str3;
        this.length = str4;
        this.getMin = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MerchantImageModel(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9, int r10) {
        /*
            r4 = this;
            r0 = r10 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r5
        L_0x0009:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r6
        L_0x0010:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0016
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r7
        L_0x0017:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0024
            r9 = 0
            r10 = 0
            goto L_0x0025
        L_0x0024:
            r10 = r9
        L_0x0025:
            r5 = r4
            r6 = r0
            r7 = r2
            r8 = r3
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyme.merchantdetail.model.MerchantImageModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel$Companion;", "", "()V", "GALLERY_VIEW_TYPE", "", "PREVIEW_SEE_MORE_VIEW_TYPE", "PREVIEW_VIEW_TYPE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMax implements Parcelable.Creator<MerchantImageModel> {
        public final /* synthetic */ Object[] newArray(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1757707200, oncanceled);
                onCancelLoad.getMin(-1757707200, oncanceled);
            }
            return new MerchantImageModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new MerchantImageModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }
    }

    public static /* synthetic */ MerchantImageModel setMax(MerchantImageModel merchantImageModel) {
        String str = merchantImageModel.IsOverlapping;
        String str2 = merchantImageModel.getMax;
        String str3 = merchantImageModel.setMin;
        String str4 = merchantImageModel.length;
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "userName");
        Intrinsics.checkNotNullParameter(str3, "avatar");
        Intrinsics.checkNotNullParameter(str4, "imageUrl");
        return new MerchantImageModel(str, str2, str3, str4, 2);
    }

    public final int hashCode() {
        String str = this.IsOverlapping;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.length;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((hashCode3 + i) * 31) + Integer.valueOf(this.getMin).hashCode();
    }
}

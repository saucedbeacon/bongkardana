package id.dana.nearbyme.merchantdetail.merchantphoto;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.nearbyme.merchantdetail.mediaviewer.MediaViewerModel;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lid/dana/nearbyme/merchantdetail/merchantphoto/MerchantPhotoViewerModel;", "Landroid/os/Parcelable;", "merchantName", "", "merchantId", "models", "Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;)V", "getMerchantId", "()Ljava/lang/String;", "getMerchantName", "getModels", "()Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class MerchantPhotoViewerModel implements Parcelable {
    public static final Parcelable.Creator<MerchantPhotoViewerModel> CREATOR = new getMin();
    @NotNull
    final String getMax;
    @NotNull
    private final String getMin;
    @NotNull
    final MediaViewerModel setMax;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantPhotoViewerModel)) {
            return false;
        }
        MerchantPhotoViewerModel merchantPhotoViewerModel = (MerchantPhotoViewerModel) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) merchantPhotoViewerModel.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) merchantPhotoViewerModel.getMin) && Intrinsics.areEqual((Object) this.setMax, (Object) merchantPhotoViewerModel.setMax);
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        MediaViewerModel mediaViewerModel = this.setMax;
        if (mediaViewerModel != null) {
            i = mediaViewerModel.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantPhotoViewerModel(merchantName=");
        sb.append(this.getMax);
        sb.append(", merchantId=");
        sb.append(this.getMin);
        sb.append(", models=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMax);
        parcel.writeString(this.getMin);
        this.setMax.writeToParcel(parcel, 0);
    }

    public MerchantPhotoViewerModel(@NotNull String str, @NotNull String str2, @NotNull MediaViewerModel mediaViewerModel) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        Intrinsics.checkNotNullParameter(mediaViewerModel, "models");
        this.getMax = str;
        this.getMin = str2;
        this.setMax = mediaViewerModel;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMin implements Parcelable.Creator<MerchantPhotoViewerModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MerchantPhotoViewerModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new MerchantPhotoViewerModel(parcel.readString(), parcel.readString(), MediaViewerModel.CREATOR.createFromParcel(parcel));
        }
    }
}

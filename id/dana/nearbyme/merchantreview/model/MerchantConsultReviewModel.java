package id.dana.nearbyme.merchantreview.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.nearbyme.model.ShopModel;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010#\u001a\u00020\fHÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\fHÖ\u0001J\t\u0010)\u001a\u00020\tHÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fHÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001b¨\u0006/"}, d2 = {"Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "Landroid/os/Parcelable;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "positiveTags", "", "Lid/dana/nearbyme/merchantreview/model/MerchantReviewTagModel;", "negativeTags", "source", "", "merchantId", "ratingStar", "", "(Lid/dana/nearbyme/model/ShopModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;I)V", "getMerchantId", "()Ljava/lang/String;", "getNegativeTags", "()Ljava/util/List;", "getPositiveTags", "getRatingStar", "()I", "setRatingStar", "(I)V", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "getSource", "setSource", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class MerchantConsultReviewModel implements Parcelable {
    public static final Parcelable.Creator<MerchantConsultReviewModel> CREATOR = new setMin();
    @NotNull
    public String getMax;
    @NotNull
    public final List<MerchantReviewTagModel> getMin;
    @NotNull
    public final List<MerchantReviewTagModel> length;
    @NotNull
    public final ShopModel setMax;
    public int setMin;
    @NotNull
    private final String toIntRange;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantConsultReviewModel)) {
            return false;
        }
        MerchantConsultReviewModel merchantConsultReviewModel = (MerchantConsultReviewModel) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) merchantConsultReviewModel.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) merchantConsultReviewModel.getMin) && Intrinsics.areEqual((Object) this.length, (Object) merchantConsultReviewModel.length) && Intrinsics.areEqual((Object) this.getMax, (Object) merchantConsultReviewModel.getMax) && Intrinsics.areEqual((Object) this.toIntRange, (Object) merchantConsultReviewModel.toIntRange) && this.setMin == merchantConsultReviewModel.setMin;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantConsultReviewModel(shopModel=");
        sb.append(this.setMax);
        sb.append(", positiveTags=");
        sb.append(this.getMin);
        sb.append(", negativeTags=");
        sb.append(this.length);
        sb.append(", source=");
        sb.append(this.getMax);
        sb.append(", merchantId=");
        sb.append(this.toIntRange);
        sb.append(", ratingStar=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.setMax, i);
        List<MerchantReviewTagModel> list = this.getMin;
        parcel.writeInt(list.size());
        for (MerchantReviewTagModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        List<MerchantReviewTagModel> list2 = this.length;
        parcel.writeInt(list2.size());
        for (MerchantReviewTagModel writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, 0);
        }
        parcel.writeString(this.getMax);
        parcel.writeString(this.toIntRange);
        parcel.writeInt(this.setMin);
    }

    public MerchantConsultReviewModel(@NotNull ShopModel shopModel, @NotNull List<MerchantReviewTagModel> list, @NotNull List<MerchantReviewTagModel> list2, @NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(list, "positiveTags");
        Intrinsics.checkNotNullParameter(list2, "negativeTags");
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        this.setMax = shopModel;
        this.getMin = list;
        this.length = list2;
        this.getMax = str;
        this.toIntRange = str2;
        this.setMin = i;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMin implements Parcelable.Creator<MerchantConsultReviewModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MerchantConsultReviewModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            ShopModel shopModel = (ShopModel) parcel.readParcelable(MerchantConsultReviewModel.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(MerchantReviewTagModel.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add(MerchantReviewTagModel.CREATOR.createFromParcel(parcel));
                readInt2--;
            }
            return new MerchantConsultReviewModel(shopModel, arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readInt());
        }
    }

    public final int hashCode() {
        ShopModel shopModel = this.setMax;
        int i = 0;
        int hashCode = (shopModel != null ? shopModel.hashCode() : 0) * 31;
        List<MerchantReviewTagModel> list = this.getMin;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<MerchantReviewTagModel> list2 = this.length;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.getMax;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.toIntRange;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode4 + i) * 31) + Integer.valueOf(this.setMin).hashCode();
    }
}

package id.dana.nearbyme.merchantdetail.mediaviewer;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0013\u0010!\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0013¨\u0006,"}, d2 = {"Lid/dana/nearbyme/merchantdetail/mediaviewer/MediaViewerModel;", "Landroid/os/Parcelable;", "defaultPosition", "", "pageSize", "lastPage", "previousPage", "paginationEnable", "", "initialData", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "(IIIIZLjava/util/List;)V", "getDefaultPosition", "()I", "getInitialData", "()Ljava/util/List;", "getLastPage", "setLastPage", "(I)V", "getPageSize", "getPaginationEnable", "()Z", "getPreviousPage", "setPreviousPage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class MediaViewerModel implements Parcelable {
    public static final Parcelable.Creator<MediaViewerModel> CREATOR = new getMax();
    public final int getMax;
    public int getMin;
    @NotNull
    public final List<MerchantImageModel> length;
    public final int setMax;
    public int setMin;
    private final boolean toIntRange;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaViewerModel)) {
            return false;
        }
        MediaViewerModel mediaViewerModel = (MediaViewerModel) obj;
        return this.getMax == mediaViewerModel.getMax && this.setMax == mediaViewerModel.setMax && this.setMin == mediaViewerModel.setMin && this.getMin == mediaViewerModel.getMin && this.toIntRange == mediaViewerModel.toIntRange && Intrinsics.areEqual((Object) this.length, (Object) mediaViewerModel.length);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaViewerModel(defaultPosition=");
        sb.append(this.getMax);
        sb.append(", pageSize=");
        sb.append(this.setMax);
        sb.append(", lastPage=");
        sb.append(this.setMin);
        sb.append(", previousPage=");
        sb.append(this.getMin);
        sb.append(", paginationEnable=");
        sb.append(this.toIntRange);
        sb.append(", initialData=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.getMax);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.setMin);
        parcel.writeInt(this.getMin);
        parcel.writeInt(this.toIntRange ? 1 : 0);
        List<MerchantImageModel> list = this.length;
        parcel.writeInt(list.size());
        for (MerchantImageModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public MediaViewerModel(int i, int i2, int i3, int i4, boolean z, @NotNull List<MerchantImageModel> list) {
        Intrinsics.checkNotNullParameter(list, "initialData");
        this.getMax = i;
        this.setMax = i2;
        this.setMin = i3;
        this.getMin = i4;
        this.toIntRange = z;
        this.length = list;
    }

    public /* synthetic */ MediaViewerModel(int i, int i2, int i3, List list) {
        this(i, i2, i3, 0, true, list);
    }

    public final boolean length() {
        return this.toIntRange;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<MediaViewerModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaViewerModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            int readInt5 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt5);
            while (readInt5 != 0) {
                arrayList.add(MerchantImageModel.CREATOR.createFromParcel(parcel));
                readInt5--;
            }
            return new MediaViewerModel(readInt, readInt2, readInt3, readInt4, z, arrayList);
        }
    }

    public final int hashCode() {
        int hashCode = ((((((Integer.valueOf(this.getMax).hashCode() * 31) + Integer.valueOf(this.setMax).hashCode()) * 31) + Integer.valueOf(this.setMin).hashCode()) * 31) + Integer.valueOf(this.getMin).hashCode()) * 31;
        boolean z = this.toIntRange;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        List<MerchantImageModel> list = this.length;
        return i + (list != null ? list.hashCode() : 0);
    }
}

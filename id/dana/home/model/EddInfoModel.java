package id.dana.home.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lid/dana/home/model/EddInfoModel;", "Landroid/os/Parcelable;", "amlOrderId", "", "eddQuestionInfoModels", "", "Lid/dana/home/model/EddQuestionInfoDTOModel;", "(Ljava/lang/String;Ljava/util/List;)V", "getAmlOrderId", "()Ljava/lang/String;", "getEddQuestionInfoModels", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class EddInfoModel implements Parcelable {
    public static final Parcelable.Creator<EddInfoModel> CREATOR = new length();
    @NotNull
    public final String getMin;
    @NotNull
    public final List<EddQuestionInfoDTOModel> setMin;

    public EddInfoModel() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EddInfoModel)) {
            return false;
        }
        EddInfoModel eddInfoModel = (EddInfoModel) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) eddInfoModel.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) eddInfoModel.setMin);
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<EddQuestionInfoDTOModel> list = this.setMin;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EddInfoModel(amlOrderId=");
        sb.append(this.getMin);
        sb.append(", eddQuestionInfoModels=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMin);
        List<EddQuestionInfoDTOModel> list = this.setMin;
        parcel.writeInt(list.size());
        for (EddQuestionInfoDTOModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }

    public EddInfoModel(@NotNull String str, @NotNull List<EddQuestionInfoDTOModel> list) {
        Intrinsics.checkNotNullParameter(str, "amlOrderId");
        Intrinsics.checkNotNullParameter(list, "eddQuestionInfoModels");
        this.getMin = str;
        this.setMin = list;
    }

    public /* synthetic */ EddInfoModel(byte b) {
        this("", CollectionsKt.emptyList());
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class length implements Parcelable.Creator<EddInfoModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new EddInfoModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(EddQuestionInfoDTOModel.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new EddInfoModel(readString, arrayList);
        }
    }
}

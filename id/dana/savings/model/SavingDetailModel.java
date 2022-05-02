package id.dana.savings.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lid/dana/savings/model/SavingDetailModel;", "Landroid/os/Parcelable;", "savingModel", "Lid/dana/savings/model/SavingModel;", "topUpModels", "", "Lid/dana/savings/model/TopUpModel;", "hasNext", "", "(Lid/dana/savings/model/SavingModel;Ljava/util/List;Z)V", "getHasNext", "()Z", "getSavingModel", "()Lid/dana/savings/model/SavingModel;", "getTopUpModels", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class SavingDetailModel implements Parcelable {
    public static final Parcelable.Creator<SavingDetailModel> CREATOR = new setMin();
    @NotNull
    public final SavingModel getMin;
    private final boolean setMax;
    @NotNull
    public final List<TopUpModel> setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingDetailModel)) {
            return false;
        }
        SavingDetailModel savingDetailModel = (SavingDetailModel) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) savingDetailModel.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) savingDetailModel.setMin) && this.setMax == savingDetailModel.setMax;
    }

    public final int hashCode() {
        SavingModel savingModel = this.getMin;
        int i = 0;
        int hashCode = (savingModel != null ? savingModel.hashCode() : 0) * 31;
        List<TopUpModel> list = this.setMin;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.setMax;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingDetailModel(savingModel=");
        sb.append(this.getMin);
        sb.append(", topUpModels=");
        sb.append(this.setMin);
        sb.append(", hasNext=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.getMin.writeToParcel(parcel, 0);
        List<TopUpModel> list = this.setMin;
        parcel.writeInt(list.size());
        for (TopUpModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.setMax ? 1 : 0);
    }

    public SavingDetailModel(@NotNull SavingModel savingModel, @NotNull List<TopUpModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(savingModel, "savingModel");
        Intrinsics.checkNotNullParameter(list, "topUpModels");
        this.getMin = savingModel;
        this.setMin = list;
        this.setMax = z;
    }

    public final boolean setMin() {
        return this.setMax;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMin implements Parcelable.Creator<SavingDetailModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SavingDetailModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            SavingModel createFromParcel = SavingModel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(TopUpModel.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new SavingDetailModel(createFromParcel, arrayList, parcel.readInt() != 0);
        }
    }
}

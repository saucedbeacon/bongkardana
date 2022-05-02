package id.dana.statement.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lid/dana/statement/model/StatementDetailModel;", "Landroid/os/Parcelable;", "date", "", "amount", "Lid/dana/model/CurrencyAmountModel;", "(JLid/dana/model/CurrencyAmountModel;)V", "getAmount", "()Lid/dana/model/CurrencyAmountModel;", "getDate", "()J", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class StatementDetailModel implements Parcelable {
    public static final Parcelable.Creator<StatementDetailModel> CREATOR = new setMax();
    public final long getMax;
    @NotNull
    public final CurrencyAmountModel setMin;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.getMax);
        parcel.writeParcelable(this.setMin, i);
    }

    public StatementDetailModel(long j, @NotNull CurrencyAmountModel currencyAmountModel) {
        Intrinsics.checkNotNullParameter(currencyAmountModel, "amount");
        this.getMax = j;
        this.setMin = currencyAmountModel;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMax implements Parcelable.Creator<StatementDetailModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StatementDetailModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new StatementDetailModel(parcel.readLong(), (CurrencyAmountModel) parcel.readParcelable(StatementDetailModel.class.getClassLoader()));
        }
    }
}

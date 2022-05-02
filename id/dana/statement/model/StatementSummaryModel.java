package id.dana.statement.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lid/dana/statement/model/StatementSummaryModel;", "Landroid/os/Parcelable;", "amount", "Lid/dana/model/CurrencyAmountModel;", "bizType", "", "description", "percentProgress", "", "(Lid/dana/model/CurrencyAmountModel;Ljava/lang/String;Ljava/lang/String;F)V", "getAmount", "()Lid/dana/model/CurrencyAmountModel;", "getBizType", "()Ljava/lang/String;", "getDescription", "getPercentProgress", "()F", "setPercentProgress", "(F)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class StatementSummaryModel implements Parcelable {
    public static final Parcelable.Creator<StatementSummaryModel> CREATOR = new setMax();
    @NotNull
    public final String getMax;
    public float length;
    @NotNull
    public final String setMax;
    @NotNull
    public final CurrencyAmountModel setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatementSummaryModel)) {
            return false;
        }
        StatementSummaryModel statementSummaryModel = (StatementSummaryModel) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) statementSummaryModel.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) statementSummaryModel.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) statementSummaryModel.getMax) && Float.compare(this.length, statementSummaryModel.length) == 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatementSummaryModel(amount=");
        sb.append(this.setMin);
        sb.append(", bizType=");
        sb.append(this.setMax);
        sb.append(", description=");
        sb.append(this.getMax);
        sb.append(", percentProgress=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.setMin, i);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMax);
        parcel.writeFloat(this.length);
    }

    public StatementSummaryModel(@NotNull CurrencyAmountModel currencyAmountModel, @NotNull String str, @NotNull String str2, float f) {
        Intrinsics.checkNotNullParameter(currencyAmountModel, "amount");
        Intrinsics.checkNotNullParameter(str, "bizType");
        Intrinsics.checkNotNullParameter(str2, "description");
        this.setMin = currencyAmountModel;
        this.setMax = str;
        this.getMax = str2;
        this.length = f;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMax implements Parcelable.Creator<StatementSummaryModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StatementSummaryModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new StatementSummaryModel((CurrencyAmountModel) parcel.readParcelable(StatementSummaryModel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readFloat());
        }
    }

    public final int hashCode() {
        CurrencyAmountModel currencyAmountModel = this.setMin;
        int i = 0;
        int hashCode = (currencyAmountModel != null ? currencyAmountModel.hashCode() : 0) * 31;
        String str = this.setMax;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.getMax;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + Float.valueOf(this.length).hashCode();
    }
}

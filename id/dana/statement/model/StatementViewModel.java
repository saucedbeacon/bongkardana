package id.dana.statement.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lid/dana/statement/model/StatementViewModel;", "Landroid/os/Parcelable;", "type", "", "userStatementModel", "Lid/dana/statement/model/UserStatementModel;", "(ILid/dana/statement/model/UserStatementModel;)V", "getType", "()I", "getUserStatementModel", "()Lid/dana/statement/model/UserStatementModel;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class StatementViewModel implements Parcelable {
    public static final Parcelable.Creator<StatementViewModel> CREATOR = new setMax();
    public final int setMax;
    @NotNull
    public final UserStatementModel setMin;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatementViewModel)) {
            return false;
        }
        StatementViewModel statementViewModel = (StatementViewModel) obj;
        return this.setMax == statementViewModel.setMax && Intrinsics.areEqual((Object) this.setMin, (Object) statementViewModel.setMin);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatementViewModel(type=");
        sb.append(this.setMax);
        sb.append(", userStatementModel=");
        sb.append(this.setMin);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.setMax);
        this.setMin.writeToParcel(parcel, 0);
    }

    public StatementViewModel(int i, @NotNull UserStatementModel userStatementModel) {
        Intrinsics.checkNotNullParameter(userStatementModel, "userStatementModel");
        this.setMax = i;
        this.setMin = userStatementModel;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMax implements Parcelable.Creator<StatementViewModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new StatementViewModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new StatementViewModel(parcel.readInt(), UserStatementModel.CREATOR.createFromParcel(parcel));
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.setMax).hashCode() * 31;
        UserStatementModel userStatementModel = this.setMin;
        return hashCode + (userStatementModel != null ? userStatementModel.hashCode() : 0);
    }
}

package id.dana.social.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0005HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lid/dana/social/model/ReactionCountModel;", "Landroid/os/Parcelable;", "kind", "", "count", "", "selectedReaction", "", "ownReactionId", "(Ljava/lang/String;IZLjava/lang/String;)V", "getCount", "()I", "setCount", "(I)V", "getKind", "()Ljava/lang/String;", "getOwnReactionId", "setOwnReactionId", "(Ljava/lang/String;)V", "getSelectedReaction", "()Z", "setSelectedReaction", "(Z)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class ReactionCountModel implements Parcelable {
    public static final Parcelable.Creator<ReactionCountModel> CREATOR = new setMin();
    @Nullable
    public String getMax;
    @NotNull
    public final String getMin;
    public boolean length;
    public int setMax;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionCountModel)) {
            return false;
        }
        ReactionCountModel reactionCountModel = (ReactionCountModel) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) reactionCountModel.getMin) && this.setMax == reactionCountModel.setMax && this.length == reactionCountModel.length && Intrinsics.areEqual((Object) this.getMax, (Object) reactionCountModel.getMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionCountModel(kind=");
        sb.append(this.getMin);
        sb.append(", count=");
        sb.append(this.setMax);
        sb.append(", selectedReaction=");
        sb.append(this.length);
        sb.append(", ownReactionId=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMin);
        parcel.writeInt(this.setMax);
        parcel.writeInt(this.length ? 1 : 0);
        parcel.writeString(this.getMax);
    }

    public ReactionCountModel(@NotNull String str, int i, boolean z, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "kind");
        this.getMin = str;
        this.setMax = i;
        this.length = z;
        this.getMax = str2;
    }

    public final boolean getMax() {
        return this.length;
    }

    public /* synthetic */ ReactionCountModel(String str) {
        this(str, 1, true, (String) null);
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMin implements Parcelable.Creator<ReactionCountModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ReactionCountModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new ReactionCountModel(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.setMax).hashCode()) * 31;
        boolean z = this.length;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.getMax;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }
}

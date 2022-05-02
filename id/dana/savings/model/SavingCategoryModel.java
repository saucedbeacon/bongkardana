package id.dana.savings.model;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u00182\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\u000e\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020*J\t\u00100\u001a\u00020*HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR \u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00067"}, d2 = {"Lid/dana/savings/model/SavingCategoryModel;", "Landroid/os/Parcelable;", "categoryCode", "", "name", "iconUrlDefault", "iconUrlSelected", "iconUrlLevel1", "iconUrlLevel2", "iconUrlLevel3", "iconUrlLevel4", "iconUrlLevel5", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryCode", "()Ljava/lang/String;", "getIconUrlDefault", "getIconUrlLevel1", "getIconUrlLevel2", "getIconUrlLevel3", "getIconUrlLevel4", "getIconUrlLevel5", "getIconUrlSelected", "getName", "selected", "", "getSelected$annotations", "()V", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "getIconUrlByLevel", "level", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class SavingCategoryModel implements Parcelable {
    public static final Parcelable.Creator<SavingCategoryModel> CREATOR = new getMax();
    @NotNull
    private final String IsOverlapping;
    @NotNull
    private final String equals;
    public boolean getMax;
    @NotNull
    public final String getMin;
    @NotNull
    private final String isInside;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;
    @NotNull
    public final String toFloatRange;
    @NotNull
    private final String toIntRange;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingCategoryModel)) {
            return false;
        }
        SavingCategoryModel savingCategoryModel = (SavingCategoryModel) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) savingCategoryModel.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) savingCategoryModel.getMin) && Intrinsics.areEqual((Object) this.length, (Object) savingCategoryModel.length) && Intrinsics.areEqual((Object) this.setMax, (Object) savingCategoryModel.setMax) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) savingCategoryModel.IsOverlapping) && Intrinsics.areEqual((Object) this.equals, (Object) savingCategoryModel.equals) && Intrinsics.areEqual((Object) this.isInside, (Object) savingCategoryModel.isInside) && Intrinsics.areEqual((Object) this.toIntRange, (Object) savingCategoryModel.toIntRange) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) savingCategoryModel.toFloatRange);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMax;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.IsOverlapping;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.equals;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.isInside;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.toIntRange;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.toFloatRange;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingCategoryModel(categoryCode=");
        sb.append(this.setMin);
        sb.append(", name=");
        sb.append(this.getMin);
        sb.append(", iconUrlDefault=");
        sb.append(this.length);
        sb.append(", iconUrlSelected=");
        sb.append(this.setMax);
        sb.append(", iconUrlLevel1=");
        sb.append(this.IsOverlapping);
        sb.append(", iconUrlLevel2=");
        sb.append(this.equals);
        sb.append(", iconUrlLevel3=");
        sb.append(this.isInside);
        sb.append(", iconUrlLevel4=");
        sb.append(this.toIntRange);
        sb.append(", iconUrlLevel5=");
        sb.append(this.toFloatRange);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.equals);
        parcel.writeString(this.isInside);
        parcel.writeString(this.toIntRange);
        parcel.writeString(this.toFloatRange);
    }

    public SavingCategoryModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "categoryCode");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "iconUrlDefault");
        Intrinsics.checkNotNullParameter(str4, "iconUrlSelected");
        Intrinsics.checkNotNullParameter(str5, "iconUrlLevel1");
        Intrinsics.checkNotNullParameter(str6, "iconUrlLevel2");
        Intrinsics.checkNotNullParameter(str7, "iconUrlLevel3");
        Intrinsics.checkNotNullParameter(str8, "iconUrlLevel4");
        Intrinsics.checkNotNullParameter(str9, "iconUrlLevel5");
        this.setMin = str;
        this.getMin = str2;
        this.length = str3;
        this.setMax = str4;
        this.IsOverlapping = str5;
        this.equals = str6;
        this.isInside = str7;
        this.toIntRange = str8;
        this.toFloatRange = str9;
    }

    public final boolean getMin() {
        return this.getMax;
    }

    @NotNull
    public final String getMax(int i) {
        if (i == 1) {
            return this.IsOverlapping;
        }
        if (i == 2) {
            return this.equals;
        }
        if (i == 3) {
            return this.isInside;
        }
        if (i == 4) {
            return this.toIntRange;
        }
        if (i != 5) {
            return this.IsOverlapping;
        }
        return this.toFloatRange;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<SavingCategoryModel> {
        public final /* synthetic */ Object[] newArray(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1874375603, oncanceled);
                onCancelLoad.getMin(-1874375603, oncanceled);
            }
            return new SavingCategoryModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new SavingCategoryModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }
}

package id.dana.savings.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.richview.CurrencyTextView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0015\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\t\u0010,\u001a\u00020\u0013HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¡\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\t\u00106\u001a\u000207HÖ\u0001J\u0013\u00108\u001a\u00020\u00132\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u000207HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001J\u0019\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u000207HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010 \"\u0004\b!\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u0006B"}, d2 = {"Lid/dana/savings/model/SavingModel;", "Landroid/os/Parcelable;", "savingId", "", "title", "categoryCode", "currentAmount", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "targetAmount", "orderStatus", "orderSubStatus", "createdTime", "achievedTime", "completedTime", "categoryModel", "Lid/dana/savings/model/SavingCategoryModel;", "extendInfo", "", "isSavingBalanceVisible", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/savings/model/SavingCategoryModel;Ljava/util/Map;Z)V", "getAchievedTime", "()Ljava/lang/String;", "getCategoryCode", "getCategoryModel", "()Lid/dana/savings/model/SavingCategoryModel;", "getCompletedTime", "getCreatedTime", "getCurrentAmount", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "getExtendInfo", "()Ljava/util/Map;", "()Z", "setSavingBalanceVisible", "(Z)V", "getOrderStatus", "getOrderSubStatus", "getSavingId", "getTargetAmount", "getTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class SavingModel implements Parcelable {
    public static final Parcelable.Creator<SavingModel> CREATOR = new getMax();
    @Nullable
    private final String FastBitmap$CoordinateSystem;
    @Nullable
    public final String IsOverlapping;
    @Nullable
    public final String equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    private final Map<String, String> hashCode;
    public boolean isInside;
    @NotNull
    public final MoneyViewModel length;
    @NotNull
    public final MoneyViewModel setMax;
    @NotNull
    public final String setMin;
    @Nullable
    private final String toDoubleRange;
    @NotNull
    private final String toFloatRange;
    @Nullable
    public final SavingCategoryModel toIntRange;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingModel)) {
            return false;
        }
        SavingModel savingModel = (SavingModel) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) savingModel.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) savingModel.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) savingModel.setMin) && Intrinsics.areEqual((Object) this.length, (Object) savingModel.length) && Intrinsics.areEqual((Object) this.setMax, (Object) savingModel.setMax) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) savingModel.toFloatRange) && Intrinsics.areEqual((Object) this.toDoubleRange, (Object) savingModel.toDoubleRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) savingModel.IsOverlapping) && Intrinsics.areEqual((Object) this.equals, (Object) savingModel.equals) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) savingModel.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.toIntRange, (Object) savingModel.toIntRange) && Intrinsics.areEqual((Object) this.hashCode, (Object) savingModel.hashCode) && this.isInside == savingModel.isInside;
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel = this.length;
        int hashCode5 = (hashCode4 + (moneyViewModel != null ? moneyViewModel.hashCode() : 0)) * 31;
        MoneyViewModel moneyViewModel2 = this.setMax;
        int hashCode6 = (hashCode5 + (moneyViewModel2 != null ? moneyViewModel2.hashCode() : 0)) * 31;
        String str4 = this.toFloatRange;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.toDoubleRange;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.IsOverlapping;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.equals;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.FastBitmap$CoordinateSystem;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        SavingCategoryModel savingCategoryModel = this.toIntRange;
        int hashCode12 = (hashCode11 + (savingCategoryModel != null ? savingCategoryModel.hashCode() : 0)) * 31;
        Map<String, String> map = this.hashCode;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode12 + i) * 31;
        boolean z = this.isInside;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingModel(savingId=");
        sb.append(this.getMax);
        sb.append(", title=");
        sb.append(this.getMin);
        sb.append(", categoryCode=");
        sb.append(this.setMin);
        sb.append(", currentAmount=");
        sb.append(this.length);
        sb.append(", targetAmount=");
        sb.append(this.setMax);
        sb.append(", orderStatus=");
        sb.append(this.toFloatRange);
        sb.append(", orderSubStatus=");
        sb.append(this.toDoubleRange);
        sb.append(", createdTime=");
        sb.append(this.IsOverlapping);
        sb.append(", achievedTime=");
        sb.append(this.equals);
        sb.append(", completedTime=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", categoryModel=");
        sb.append(this.toIntRange);
        sb.append(", extendInfo=");
        sb.append(this.hashCode);
        sb.append(", isSavingBalanceVisible=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMin);
        this.length.writeToParcel(parcel, 0);
        this.setMax.writeToParcel(parcel, 0);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.toDoubleRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.equals);
        parcel.writeString(this.FastBitmap$CoordinateSystem);
        SavingCategoryModel savingCategoryModel = this.toIntRange;
        if (savingCategoryModel != null) {
            parcel.writeInt(1);
            savingCategoryModel.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Map<String, String> map = this.hashCode;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> next : map.entrySet()) {
            parcel.writeString(next.getKey());
            parcel.writeString(next.getValue());
        }
        parcel.writeInt(this.isInside ? 1 : 0);
    }

    public SavingModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull MoneyViewModel moneyViewModel, @NotNull MoneyViewModel moneyViewModel2, @NotNull String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable SavingCategoryModel savingCategoryModel, @NotNull Map<String, String> map, boolean z) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        Intrinsics.checkNotNullParameter(str2, "title");
        Intrinsics.checkNotNullParameter(str3, "categoryCode");
        Intrinsics.checkNotNullParameter(moneyViewModel, "currentAmount");
        Intrinsics.checkNotNullParameter(moneyViewModel2, "targetAmount");
        Intrinsics.checkNotNullParameter(str4, "orderStatus");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        this.getMax = str;
        this.getMin = str2;
        this.setMin = str3;
        this.length = moneyViewModel;
        this.setMax = moneyViewModel2;
        this.toFloatRange = str4;
        this.toDoubleRange = str5;
        this.IsOverlapping = str6;
        this.equals = str7;
        this.FastBitmap$CoordinateSystem = str8;
        this.toIntRange = savingCategoryModel;
        this.hashCode = map;
        this.isInside = z;
    }

    public /* synthetic */ SavingModel(String str, String str2, String str3, MoneyViewModel moneyViewModel, MoneyViewModel moneyViewModel2, String str4, String str5, String str6, String str7, String str8, SavingCategoryModel savingCategoryModel, Map map) {
        this(str, str2, str3, moneyViewModel, moneyViewModel2, str4, str5, str6, str7, str8, savingCategoryModel, map, false);
    }

    public final boolean getMin() {
        return this.isInside;
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class getMax implements Parcelable.Creator<SavingModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SavingModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            MoneyViewModel createFromParcel = MoneyViewModel.CREATOR.createFromParcel(parcel2);
            MoneyViewModel createFromParcel2 = MoneyViewModel.CREATOR.createFromParcel(parcel2);
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            SavingCategoryModel createFromParcel3 = parcel.readInt() != 0 ? SavingCategoryModel.CREATOR.createFromParcel(parcel2) : null;
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            while (readInt != 0) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                readInt--;
                Parcel parcel3 = parcel;
            }
            return new SavingModel(readString, readString2, readString3, createFromParcel, createFromParcel2, readString4, readString5, readString6, readString7, readString8, createFromParcel3, linkedHashMap, parcel.readInt() != 0);
        }
    }
}

package id.dana.promoquest.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.MyBeaconServiceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003Jg\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010.\u001a\u00020\u0018HÖ\u0001J\u0013\u0010/\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\u000e\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003J\t\u00104\u001a\u00020\u0018HÖ\u0001J\u0006\u00105\u001a\u00020\u000bJ\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010¨\u0006<"}, d2 = {"Lid/dana/promoquest/model/QuestModel;", "Landroid/os/Parcelable;", "id", "", "name", "description", "status", "actionType", "redirectType", "redirectValue", "hasPrize", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getActionType", "()Ljava/lang/String;", "setActionType", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getHasPrize", "()Z", "setHasPrize", "(Z)V", "iconRes", "", "getIconRes", "()I", "getId", "setId", "getName", "setName", "getRedirectType", "setRedirectType", "getRedirectValue", "setRedirectValue", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "getCleanUrlRedirectValue", "entryPoint", "hashCode", "isCompletedAndHasPrize", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class QuestModel implements Parcelable {
    public static final Parcelable.Creator<QuestModel> CREATOR = new setMin();
    @Nullable
    public String IsOverlapping;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    private boolean isInside;
    @Nullable
    public String length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    public String toIntRange;

    public QuestModel() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestModel)) {
            return false;
        }
        QuestModel questModel = (QuestModel) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) questModel.getMin) && Intrinsics.areEqual((Object) this.length, (Object) questModel.length) && Intrinsics.areEqual((Object) this.setMax, (Object) questModel.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) questModel.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) questModel.setMin) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) questModel.IsOverlapping) && Intrinsics.areEqual((Object) this.toIntRange, (Object) questModel.toIntRange) && this.isInside == questModel.isInside;
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMax;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.setMin;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.IsOverlapping;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.toIntRange;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i2 = (hashCode6 + i) * 31;
        boolean z = this.isInside;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestModel(id=");
        sb.append(this.getMin);
        sb.append(", name=");
        sb.append(this.length);
        sb.append(", description=");
        sb.append(this.setMax);
        sb.append(", status=");
        sb.append(this.getMax);
        sb.append(", actionType=");
        sb.append(this.setMin);
        sb.append(", redirectType=");
        sb.append(this.IsOverlapping);
        sb.append(", redirectValue=");
        sb.append(this.toIntRange);
        sb.append(", hasPrize=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.getMin);
        parcel.writeString(this.length);
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMin);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.toIntRange);
        parcel.writeInt(this.isInside ? 1 : 0);
    }

    public QuestModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z) {
        this.getMin = str;
        this.length = str2;
        this.setMax = str3;
        this.getMax = str4;
        this.setMin = str5;
        this.IsOverlapping = str6;
        this.toIntRange = str7;
        this.isInside = z;
    }

    private /* synthetic */ QuestModel(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
    }

    public final boolean setMin() {
        return this.isInside;
    }

    public final int getMax() {
        if (this.isInside) {
            String str = this.getMax;
            if (str == null) {
                return R.drawable.ic_promo_quest_item_not_available;
            }
            int hashCode = str.hashCode();
            if (hashCode == 183181625) {
                return str.equals("COMPLETE") ? R.drawable.ic_promo_quest_item_not_claimed : R.drawable.ic_promo_quest_item_not_available;
            }
            if (hashCode == 2073854099 && str.equals("FINISH")) {
                return R.drawable.ic_promo_quest_item_claimed;
            }
            return R.drawable.ic_promo_quest_item_not_available;
        }
        return MyBeaconServiceImpl.getMin(this.getMax, "COMPLETE", "FINISH") ? R.drawable.ic_promo_quest_item_success : R.drawable.ic_promo_quest_item_incomplete;
    }

    public final boolean setMax() {
        return this.isInside && Intrinsics.areEqual((Object) this.getMax, (Object) "COMPLETE");
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMin implements Parcelable.Creator<QuestModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new QuestModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new QuestModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }
}

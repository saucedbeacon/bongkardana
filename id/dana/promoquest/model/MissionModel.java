package id.dana.promoquest.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.android.parcel.Parcelize;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\rHÆ\u0003J\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\t\u0010H\u001a\u00020IHÖ\u0001J\u0013\u0010J\u001a\u00020\r2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020IHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\u0019\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020IHÖ\u0001R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u001c\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u001d\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u001e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010 \"\u0004\b(\u0010\"R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010 \"\u0004\b*\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010 \"\u0004\b,\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010 \"\u0004\b.\u0010\"R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010 \"\u0004\b2\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010 \"\u0004\b4\u0010\"R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006T"}, d2 = {"Lid/dana/promoquest/model/MissionModel;", "Landroid/os/Parcelable;", "missionId", "", "missionName", "missionStatus", "missionDescription", "missionExpireTime", "Ljava/util/Date;", "missionFinishImage", "missionImage", "missionThumbnail", "hasPrize", "", "quests", "", "Lid/dana/promoquest/model/QuestModel;", "isFlexibleMission", "missionTnc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;ZLjava/lang/String;)V", "getHasPrize", "()Z", "setHasPrize", "(Z)V", "isActiveMission", "setFlexibleMission", "isMissionActive", "isMissionCompleted", "isMissionExpired", "isMissionFinish", "isPastMission", "getMissionDescription", "()Ljava/lang/String;", "setMissionDescription", "(Ljava/lang/String;)V", "getMissionExpireTime", "()Ljava/util/Date;", "setMissionExpireTime", "(Ljava/util/Date;)V", "getMissionFinishImage", "setMissionFinishImage", "getMissionId", "setMissionId", "getMissionImage", "setMissionImage", "getMissionName", "setMissionName", "missionOriginImage", "getMissionOriginImage", "getMissionStatus", "setMissionStatus", "getMissionThumbnail", "setMissionThumbnail", "getMissionTnc", "setMissionTnc", "getQuests", "()Ljava/util/List;", "setQuests", "(Ljava/util/List;)V", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class MissionModel implements Parcelable {
    public static final Parcelable.Creator<MissionModel> CREATOR = new length();
    @Nullable
    public String IsOverlapping;
    @NotNull
    public String equals;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    private boolean hashCode;
    @Nullable
    private String isInside;
    @Nullable
    public Date length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    public String toFloatRange;
    @NotNull
    public List<QuestModel> toIntRange;
    private boolean values;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionModel)) {
            return false;
        }
        MissionModel missionModel = (MissionModel) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) missionModel.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) missionModel.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) missionModel.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) missionModel.setMin) && Intrinsics.areEqual((Object) this.length, (Object) missionModel.length) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) missionModel.toFloatRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) missionModel.IsOverlapping) && Intrinsics.areEqual((Object) this.isInside, (Object) missionModel.isInside) && this.hashCode == missionModel.hashCode && Intrinsics.areEqual((Object) this.toIntRange, (Object) missionModel.toIntRange) && this.values == missionModel.values && Intrinsics.areEqual((Object) this.equals, (Object) missionModel.equals);
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMin;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMin;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Date date = this.length;
        int hashCode6 = (hashCode5 + (date != null ? date.hashCode() : 0)) * 31;
        String str5 = this.toFloatRange;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.IsOverlapping;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.isInside;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z = this.hashCode;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        List<QuestModel> list = this.toIntRange;
        int hashCode10 = (i2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z3 = this.values;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode10 + (z2 ? 1 : 0)) * 31;
        String str8 = this.equals;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MissionModel(missionId=");
        sb.append(this.setMax);
        sb.append(", missionName=");
        sb.append(this.getMax);
        sb.append(", missionStatus=");
        sb.append(this.getMin);
        sb.append(", missionDescription=");
        sb.append(this.setMin);
        sb.append(", missionExpireTime=");
        sb.append(this.length);
        sb.append(", missionFinishImage=");
        sb.append(this.toFloatRange);
        sb.append(", missionImage=");
        sb.append(this.IsOverlapping);
        sb.append(", missionThumbnail=");
        sb.append(this.isInside);
        sb.append(", hasPrize=");
        sb.append(this.hashCode);
        sb.append(", quests=");
        sb.append(this.toIntRange);
        sb.append(", isFlexibleMission=");
        sb.append(this.values);
        sb.append(", missionTnc=");
        sb.append(this.equals);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1278367981, oncanceled);
            onCancelLoad.getMin(-1278367981, oncanceled);
        }
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.setMax);
        parcel.writeString(this.getMax);
        parcel.writeString(this.getMin);
        parcel.writeString(this.setMin);
        parcel.writeSerializable(this.length);
        parcel.writeString(this.toFloatRange);
        parcel.writeString(this.IsOverlapping);
        parcel.writeString(this.isInside);
        parcel.writeInt(this.hashCode ? 1 : 0);
        List<QuestModel> list = this.toIntRange;
        parcel.writeInt(list.size());
        for (QuestModel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeString(this.equals);
    }

    public MissionModel(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Date date, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z, @NotNull List<QuestModel> list, boolean z2, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(list, "quests");
        Intrinsics.checkNotNullParameter(str8, "missionTnc");
        this.setMax = str;
        this.getMax = str2;
        this.getMin = str3;
        this.setMin = str4;
        this.length = date;
        this.toFloatRange = str5;
        this.IsOverlapping = str6;
        this.isInside = str7;
        this.hashCode = z;
        this.toIntRange = list;
        this.values = z2;
        this.equals = str8;
    }

    public final boolean setMin() {
        return this.hashCode;
    }

    public final boolean setMax() {
        return this.values;
    }

    private boolean getMin() {
        return StringsKt.equals("ACTIVE", this.getMin, true);
    }

    private boolean toIntRange() {
        return StringsKt.equals("FINISH", this.getMin, true);
    }

    private boolean equals() {
        return StringsKt.equals("COMPLETE", this.getMin, true);
    }

    private boolean IsOverlapping() {
        return StringsKt.equals("CLOSE", this.getMin, true);
    }

    public final boolean getMax() {
        return getMin() || equals();
    }

    public final boolean length() {
        return toIntRange() || IsOverlapping();
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class length implements Parcelable.Creator<MissionModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MissionModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(QuestModel.CREATOR.createFromParcel(parcel2));
                readInt--;
            }
            return new MissionModel(readString, readString2, readString3, readString4, date, readString5, readString6, readString7, z, arrayList, parcel.readInt() != 0, parcel.readString());
        }
    }
}

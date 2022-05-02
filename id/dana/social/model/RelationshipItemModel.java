package id.dana.social.model;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import o.setBuildNumber;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 .2\u00020\u0001:\u0001.BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003JQ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0013\u0010$\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020#HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020#HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u0014¨\u0006/"}, d2 = {"Lid/dana/social/model/RelationshipItemModel;", "Landroid/os/Parcelable;", "userId", "", "loginId", "nickName", "status", "avatar", "username", "isNonReciprocal", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatar", "()Ljava/lang/String;", "()Z", "setNonReciprocal", "(Z)V", "getLoginId", "getNickName", "setNickName", "(Ljava/lang/String;)V", "getStatus", "setStatus", "getUserId", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class RelationshipItemModel implements Parcelable {
    public static final Parcelable.Creator<RelationshipItemModel> CREATOR = new setMax();
    @NotNull
    public static final length equals = new length((byte) 0);
    @NotNull
    public String getMax;
    @NotNull
    public String getMin;
    @NotNull
    public String isInside;
    @NotNull
    public final String length;
    @Nullable
    public final String setMax;
    @NotNull
    public final String setMin;
    public boolean toIntRange;

    public RelationshipItemModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationshipItemModel)) {
            return false;
        }
        RelationshipItemModel relationshipItemModel = (RelationshipItemModel) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) relationshipItemModel.length) && Intrinsics.areEqual((Object) this.setMin, (Object) relationshipItemModel.setMin) && Intrinsics.areEqual((Object) this.getMin, (Object) relationshipItemModel.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) relationshipItemModel.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) relationshipItemModel.setMax) && Intrinsics.areEqual((Object) this.isInside, (Object) relationshipItemModel.isInside) && this.toIntRange == relationshipItemModel.toIntRange;
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMax;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.setMax;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.isInside;
        if (str6 != null) {
            i = str6.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.toIntRange;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelationshipItemModel(userId=");
        sb.append(this.length);
        sb.append(", loginId=");
        sb.append(this.setMin);
        sb.append(", nickName=");
        sb.append(this.getMin);
        sb.append(", status=");
        sb.append(this.getMax);
        sb.append(", avatar=");
        sb.append(this.setMax);
        sb.append(", username=");
        sb.append(this.isInside);
        sb.append(", isNonReciprocal=");
        sb.append(this.toIntRange);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.length);
        parcel.writeString(this.setMin);
        parcel.writeString(this.getMin);
        parcel.writeString(this.getMax);
        parcel.writeString(this.setMax);
        parcel.writeString(this.isInside);
        parcel.writeInt(this.toIntRange ? 1 : 0);
    }

    public RelationshipItemModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.Params.LOGIN_ID);
        Intrinsics.checkNotNullParameter(str3, "nickName");
        Intrinsics.checkNotNullParameter(str4, "status");
        Intrinsics.checkNotNullParameter(str6, setBuildNumber.USERNAME_KEY);
        this.length = str;
        this.setMin = str2;
        this.getMin = str3;
        this.getMax = str4;
        this.setMax = str5;
        this.isInside = str6;
        this.toIntRange = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RelationshipItemModel(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, false);
    }

    public final boolean getMax() {
        return this.toIntRange;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/social/model/RelationshipItemModel$Companion;", "", "()V", "fromActivityReactionsUserModel", "Lid/dana/social/model/RelationshipItemModel;", "activityReactionsUserModel", "Lid/dana/social/model/ActivityReactionsUserModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMax implements Parcelable.Creator<RelationshipItemModel> {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RelationshipItemModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new RelationshipItemModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }
    }
}

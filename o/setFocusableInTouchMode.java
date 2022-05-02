package o;

import id.dana.social.model.FeedModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\r\u0012.\b\u0002\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\r0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J)\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\rHÆ\u0003J/\u00100\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\r0\tHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J¥\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2(\b\u0002\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\r2.\b\u0002\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\r0\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u00103\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u00105\u001a\u0004\u0018\u00010\nJ\t\u00106\u001a\u00020\u0006HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR1\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR@\u0010\u000e\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\fj\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003`\r0\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00068"}, d2 = {"Lid/dana/social/model/GroupedFeedModel;", "", "id", "", "group", "activityCount", "", "actorCount", "activities", "", "Lid/dana/social/model/FeedModel;", "groupedExtendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "orderedNonDuplicateActorNames", "read", "", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/HashMap;Ljava/util/List;Z)V", "getActivities", "()Ljava/util/List;", "setActivities", "(Ljava/util/List;)V", "getActivityCount", "()I", "setActivityCount", "(I)V", "getActorCount", "setActorCount", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "getGroupedExtendInfo", "()Ljava/util/HashMap;", "getId", "setId", "getOrderedNonDuplicateActorNames", "setOrderedNonDuplicateActorNames", "getRead", "()Z", "setRead", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "getFirstActivity", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFocusableInTouchMode {
    private int equals;
    @NotNull
    public String getMax;
    public boolean getMin;
    private int isInside;
    @NotNull
    public final HashMap<String, String> length;
    @NotNull
    public List<? extends HashMap<String, String>> setMax;
    @NotNull
    public List<FeedModel> setMin;
    @NotNull
    private String toFloatRange;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFocusableInTouchMode)) {
            return false;
        }
        setFocusableInTouchMode setfocusableintouchmode = (setFocusableInTouchMode) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) setfocusableintouchmode.getMax) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) setfocusableintouchmode.toFloatRange) && this.equals == setfocusableintouchmode.equals && this.isInside == setfocusableintouchmode.isInside && Intrinsics.areEqual((Object) this.setMin, (Object) setfocusableintouchmode.setMin) && Intrinsics.areEqual((Object) this.length, (Object) setfocusableintouchmode.length) && Intrinsics.areEqual((Object) this.setMax, (Object) setfocusableintouchmode.setMax) && this.getMin == setfocusableintouchmode.getMin;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedFeedModel(id=");
        sb.append(this.getMax);
        sb.append(", group=");
        sb.append(this.toFloatRange);
        sb.append(", activityCount=");
        sb.append(this.equals);
        sb.append(", actorCount=");
        sb.append(this.isInside);
        sb.append(", activities=");
        sb.append(this.setMin);
        sb.append(", groupedExtendInfo=");
        sb.append(this.length);
        sb.append(", orderedNonDuplicateActorNames=");
        sb.append(this.setMax);
        sb.append(", read=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public setFocusableInTouchMode(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<FeedModel> list, @NotNull HashMap<String, String> hashMap, @NotNull List<? extends HashMap<String, String>> list2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "group");
        Intrinsics.checkNotNullParameter(list, "activities");
        Intrinsics.checkNotNullParameter(hashMap, "groupedExtendInfo");
        Intrinsics.checkNotNullParameter(list2, "orderedNonDuplicateActorNames");
        this.getMax = str;
        this.toFloatRange = str2;
        this.equals = i;
        this.isInside = i2;
        this.setMin = list;
        this.length = hashMap;
        this.setMax = list2;
        this.getMin = z;
    }

    public /* synthetic */ setFocusableInTouchMode(String str, String str2, int i, int i2, List list, HashMap hashMap, List list2) {
        this(str, str2, i, i2, list, hashMap, list2, false);
    }

    public final boolean setMax() {
        return this.getMin;
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.toFloatRange;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.valueOf(this.equals).hashCode()) * 31) + Integer.valueOf(this.isInside).hashCode()) * 31;
        List<FeedModel> list = this.setMin;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        HashMap<String, String> hashMap = this.length;
        int hashCode4 = (hashCode3 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<? extends HashMap<String, String>> list2 = this.setMax;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.getMin;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }
}

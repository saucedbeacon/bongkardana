package o;

import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J%\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003Jk\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072$\b\u0002\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\fHÖ\u0001J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R-\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lid/dana/social/model/FeedHighlightModel;", "", "activityId", "", "iconUrl", "description", "read", "", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "viewType", "", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/HashMap;ILjava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getContentType", "getDescription", "getExtendInfo", "()Ljava/util/HashMap;", "getIconUrl", "getRead", "()Z", "getViewType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toFeedRegexData", "Lid/dana/social/utils/FeedRegexData;", "context", "Landroid/content/Context;", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getContextMenuInfo {
    @NotNull
    public final String IsOverlapping;
    private final boolean equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final HashMap<String, String> getMin;
    public final int length;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;

    public getContextMenuInfo() {
        this((String) null, (String) null, (String) null, false, (HashMap) null, 0, (String) null, 127);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getContextMenuInfo)) {
            return false;
        }
        getContextMenuInfo getcontextmenuinfo = (getContextMenuInfo) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) getcontextmenuinfo.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) getcontextmenuinfo.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) getcontextmenuinfo.getMax) && this.equals == getcontextmenuinfo.equals && Intrinsics.areEqual((Object) this.getMin, (Object) getcontextmenuinfo.getMin) && this.length == getcontextmenuinfo.length && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) getcontextmenuinfo.IsOverlapping);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedHighlightModel(activityId=");
        sb.append(this.setMax);
        sb.append(", iconUrl=");
        sb.append(this.setMin);
        sb.append(", description=");
        sb.append(this.getMax);
        sb.append(", read=");
        sb.append(this.equals);
        sb.append(", extendInfo=");
        sb.append(this.getMin);
        sb.append(", viewType=");
        sb.append(this.length);
        sb.append(", contentType=");
        sb.append(this.IsOverlapping);
        sb.append(")");
        return sb.toString();
    }

    private getContextMenuInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull HashMap<String, String> hashMap, int i, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str2, "iconUrl");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(hashMap, "extendInfo");
        Intrinsics.checkNotNullParameter(str4, "contentType");
        this.setMax = str;
        this.setMin = str2;
        this.getMax = str3;
        this.equals = z;
        this.getMin = hashMap;
        this.length = i;
        this.IsOverlapping = str4;
    }

    public final boolean length() {
        return this.equals;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getContextMenuInfo(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, java.util.HashMap r12, int r13, java.lang.String r14, int r15) {
        /*
            r7 = this;
            r0 = r15 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r8
        L_0x0009:
            r8 = r15 & 2
            if (r8 == 0) goto L_0x000f
            r2 = r1
            goto L_0x0010
        L_0x000f:
            r2 = r9
        L_0x0010:
            r8 = r15 & 4
            if (r8 == 0) goto L_0x0016
            r3 = r1
            goto L_0x0017
        L_0x0016:
            r3 = r10
        L_0x0017:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x001e
            r11 = 1
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = r11
        L_0x001f:
            r8 = r15 & 16
            if (r8 == 0) goto L_0x0028
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
        L_0x0028:
            r5 = r12
            r8 = r15 & 32
            if (r8 == 0) goto L_0x0030
            r13 = 2
            r6 = 2
            goto L_0x0031
        L_0x0030:
            r6 = r13
        L_0x0031:
            r8 = r15 & 64
            if (r8 == 0) goto L_0x0037
            r15 = r1
            goto L_0x0038
        L_0x0037:
            r15 = r14
        L_0x0038:
            r8 = r7
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getContextMenuInfo.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.util.HashMap, int, java.lang.String, int):void");
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.equals;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        HashMap<String, String> hashMap = this.getMin;
        int hashCode4 = (((i2 + (hashMap != null ? hashMap.hashCode() : 0)) * 31) + Integer.valueOf(this.length).hashCode()) * 31;
        String str4 = this.IsOverlapping;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }
}

package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b/\b\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0011J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010+J\t\u00108\u001a\u00020\u0003HÆ\u0003J|\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\f2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\nHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006?"}, d2 = {"Lid/dana/tutorial/model/TutorialModel;", "", "contentId", "", "thumbnailTitle", "thumbnailSubtitle", "thumbnailIcon", "thumbnailCreated", "thumbnailModified", "thumbnailPriority", "", "thumbnailUpdated", "", "thumbnailBackground", "thumbnailContents", "", "Lid/dana/tutorial/model/TutorialContentModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)V", "getContentId", "()Ljava/lang/String;", "setContentId", "(Ljava/lang/String;)V", "getThumbnailBackground", "setThumbnailBackground", "getThumbnailContents", "()Ljava/util/List;", "setThumbnailContents", "(Ljava/util/List;)V", "getThumbnailCreated", "setThumbnailCreated", "getThumbnailIcon", "setThumbnailIcon", "getThumbnailModified", "setThumbnailModified", "getThumbnailPriority", "()I", "setThumbnailPriority", "(I)V", "getThumbnailSubtitle", "setThumbnailSubtitle", "getThumbnailTitle", "setThumbnailTitle", "getThumbnailUpdated", "()Ljava/lang/Boolean;", "setThumbnailUpdated", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;)Lid/dana/tutorial/model/TutorialModel;", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onReachPullRefreshDistance {
    @NotNull
    private String IsOverlapping;
    @NotNull
    private String equals;
    @NotNull
    public String getMax;
    @Nullable
    public Boolean getMin;
    @NotNull
    private List<Object> isInside;
    @NotNull
    public String length;
    @Nullable
    public String setMax;
    public int setMin;
    @NotNull
    private String toFloatRange;
    @NotNull
    private String toIntRange;

    public onReachPullRefreshDistance() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onReachPullRefreshDistance)) {
            return false;
        }
        onReachPullRefreshDistance onreachpullrefreshdistance = (onReachPullRefreshDistance) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) onreachpullrefreshdistance.setMax) && Intrinsics.areEqual((Object) this.length, (Object) onreachpullrefreshdistance.length) && Intrinsics.areEqual((Object) this.equals, (Object) onreachpullrefreshdistance.equals) && Intrinsics.areEqual((Object) this.getMax, (Object) onreachpullrefreshdistance.getMax) && Intrinsics.areEqual((Object) this.toIntRange, (Object) onreachpullrefreshdistance.toIntRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) onreachpullrefreshdistance.IsOverlapping) && this.setMin == onreachpullrefreshdistance.setMin && Intrinsics.areEqual((Object) this.getMin, (Object) onreachpullrefreshdistance.getMin) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) onreachpullrefreshdistance.toFloatRange) && Intrinsics.areEqual((Object) this.isInside, (Object) onreachpullrefreshdistance.isInside);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialModel(contentId=");
        sb.append(this.setMax);
        sb.append(", thumbnailTitle=");
        sb.append(this.length);
        sb.append(", thumbnailSubtitle=");
        sb.append(this.equals);
        sb.append(", thumbnailIcon=");
        sb.append(this.getMax);
        sb.append(", thumbnailCreated=");
        sb.append(this.toIntRange);
        sb.append(", thumbnailModified=");
        sb.append(this.IsOverlapping);
        sb.append(", thumbnailPriority=");
        sb.append(this.setMin);
        sb.append(", thumbnailUpdated=");
        sb.append(this.getMin);
        sb.append(", thumbnailBackground=");
        sb.append(this.toFloatRange);
        sb.append(", thumbnailContents=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    private onReachPullRefreshDistance(@Nullable String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @Nullable Boolean bool, @NotNull String str7, @NotNull List<Object> list) {
        Intrinsics.checkNotNullParameter(str2, "thumbnailTitle");
        Intrinsics.checkNotNullParameter(str3, "thumbnailSubtitle");
        Intrinsics.checkNotNullParameter(str4, "thumbnailIcon");
        Intrinsics.checkNotNullParameter(str5, "thumbnailCreated");
        Intrinsics.checkNotNullParameter(str6, "thumbnailModified");
        Intrinsics.checkNotNullParameter(str7, "thumbnailBackground");
        Intrinsics.checkNotNullParameter(list, "thumbnailContents");
        this.setMax = str;
        this.length = str2;
        this.equals = str3;
        this.getMax = str4;
        this.toIntRange = str5;
        this.IsOverlapping = str6;
        this.setMin = 0;
        this.getMin = bool;
        this.toFloatRange = str7;
        this.isInside = list;
    }

    private /* synthetic */ onReachPullRefreshDistance(byte b) {
        this("", "", "", "", "", "", Boolean.FALSE, "", CollectionsKt.emptyList());
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.length;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.equals;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMax;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.toIntRange;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.IsOverlapping;
        int hashCode6 = (((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + Integer.valueOf(this.setMin).hashCode()) * 31;
        Boolean bool = this.getMin;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str7 = this.toFloatRange;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        List<Object> list = this.isInside;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode8 + i;
    }
}

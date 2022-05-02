package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\rHÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0014R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014¨\u0006A"}, d2 = {"Lid/dana/richview/moreforyou/model/MoreForYouModel;", "", "clientId", "", "scopes", "redirectType", "icon", "title", "subtitle", "redirectUrl", "contentId", "spaceCode", "priority", "", "createdDate", "bizScenario", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getBizScenario", "()Ljava/lang/String;", "setBizScenario", "(Ljava/lang/String;)V", "getClientId", "setClientId", "getContentId", "setContentId", "getCreatedDate", "()Ljava/lang/Integer;", "setCreatedDate", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIcon", "setIcon", "getPriority", "setPriority", "getRedirectType", "setRedirectType", "getRedirectUrl", "setRedirectUrl", "getScopes", "setScopes", "getSpaceCode", "setSpaceCode", "getSubtitle", "setSubtitle", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lid/dana/richview/moreforyou/model/MoreForYouModel;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CameraParams {
    @Nullable
    private String IsOverlapping;
    @Nullable
    private String equals;
    @Nullable
    public String getMax;
    @Nullable
    public String getMin;
    @Nullable
    private String hashCode;
    @Nullable
    public Integer isInside;
    @Nullable
    public String length;
    @Nullable
    public String setMax;
    @Nullable
    public String setMin;
    @Nullable
    public String toFloatRange;
    @Nullable
    public String toIntRange;
    @Nullable
    private Integer toString;

    public CameraParams() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraParams)) {
            return false;
        }
        CameraParams cameraParams = (CameraParams) obj;
        return Intrinsics.areEqual((Object) this.equals, (Object) cameraParams.equals) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) cameraParams.IsOverlapping) && Intrinsics.areEqual((Object) this.hashCode, (Object) cameraParams.hashCode) && Intrinsics.areEqual((Object) this.setMin, (Object) cameraParams.setMin) && Intrinsics.areEqual((Object) this.length, (Object) cameraParams.length) && Intrinsics.areEqual((Object) this.setMax, (Object) cameraParams.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) cameraParams.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) cameraParams.getMin) && Intrinsics.areEqual((Object) this.toIntRange, (Object) cameraParams.toIntRange) && Intrinsics.areEqual((Object) this.isInside, (Object) cameraParams.isInside) && Intrinsics.areEqual((Object) this.toString, (Object) cameraParams.toString) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) cameraParams.toFloatRange);
    }

    public final int hashCode() {
        String str = this.equals;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.IsOverlapping;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hashCode;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.setMin;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.length;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.setMax;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.getMax;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.getMin;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.toIntRange;
        int hashCode10 = (hashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31;
        Integer num = this.isInside;
        int hashCode11 = (hashCode10 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.toString;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str10 = this.toFloatRange;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode12 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MoreForYouModel(clientId=");
        sb.append(this.equals);
        sb.append(", scopes=");
        sb.append(this.IsOverlapping);
        sb.append(", redirectType=");
        sb.append(this.hashCode);
        sb.append(", icon=");
        sb.append(this.setMin);
        sb.append(", title=");
        sb.append(this.length);
        sb.append(", subtitle=");
        sb.append(this.setMax);
        sb.append(", redirectUrl=");
        sb.append(this.getMax);
        sb.append(", contentId=");
        sb.append(this.getMin);
        sb.append(", spaceCode=");
        sb.append(this.toIntRange);
        sb.append(", priority=");
        sb.append(this.isInside);
        sb.append(", createdDate=");
        sb.append(this.toString);
        sb.append(", bizScenario=");
        sb.append(this.toFloatRange);
        sb.append(")");
        return sb.toString();
    }

    private CameraParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable Integer num2, @Nullable String str10) {
        this.equals = str;
        this.IsOverlapping = str2;
        this.hashCode = str3;
        this.setMin = str4;
        this.length = str5;
        this.setMax = str6;
        this.getMax = str7;
        this.getMin = str8;
        this.toIntRange = str9;
        this.isInside = num;
        this.toString = num2;
        this.toFloatRange = str10;
    }

    public /* synthetic */ CameraParams(byte b) {
        this("", "", "", "", "", "", "", "", "", (Integer) null, 0, "");
    }
}

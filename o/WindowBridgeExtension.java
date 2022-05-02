package o;

import androidx.annotation.NonNull;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/lib/electronicmoney/bri/model/BrizziRequest;", "", "token", "", "consumerSecret", "username", "reffNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConsumerSecret", "()Ljava/lang/String;", "getReffNumber", "getToken", "getUsername", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class WindowBridgeExtension {
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMin;

    /* renamed from: o.WindowBridgeExtension$2  reason: invalid class name */
    public interface AnonymousClass2 {
        TitleBarRightButtonView.AnonymousClass1<File> download(@NonNull String str, @NonNull String str2, @NonNull String str3);
    }

    public WindowBridgeExtension(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "consumerSecret");
        Intrinsics.checkNotNullParameter(str3, setBuildNumber.USERNAME_KEY);
        Intrinsics.checkNotNullParameter(str4, "reffNumber");
        this.setMin = str;
        this.getMax = str2;
        this.getMin = str3;
        this.length = str4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowBridgeExtension)) {
            return false;
        }
        WindowBridgeExtension windowBridgeExtension = (WindowBridgeExtension) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) windowBridgeExtension.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) windowBridgeExtension.getMax) && Intrinsics.areEqual((Object) this.getMin, (Object) windowBridgeExtension.getMin) && Intrinsics.areEqual((Object) this.length, (Object) windowBridgeExtension.length);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMax;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.length;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrizziRequest(token=");
        sb.append(this.setMin);
        sb.append(", consumerSecret=");
        sb.append(this.getMax);
        sb.append(", username=");
        sb.append(this.getMin);
        sb.append(", reffNumber=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }
}

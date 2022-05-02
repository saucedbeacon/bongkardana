package o;

import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\b\b\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB+\b\u0016\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0000H\u0002J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u0007J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u001e"}, d2 = {"Lid/dana/domain/version/SemanticVersion;", "", "major", "", "minor", "patch", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "(III)V", "getMajor", "()I", "setMajor", "(I)V", "getMinor", "setMinor", "getPatch", "setPatch", "compareTo", "other", "component1", "component2", "component3", "copy", "equals", "", "", "hashCode", "toInt", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ErrorConstants implements Comparable<ErrorConstants> {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private int major;
    private int minor;
    private int patch;

    public ErrorConstants() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ErrorConstants copy$default(ErrorConstants errorConstants, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = errorConstants.major;
        }
        if ((i4 & 2) != 0) {
            i2 = errorConstants.minor;
        }
        if ((i4 & 4) != 0) {
            i3 = errorConstants.patch;
        }
        return errorConstants.copy(i, i2, i3);
    }

    @JvmStatic
    @NotNull
    public static final ErrorConstants fromVersion(@NotNull String str) {
        return Companion.fromVersion(str);
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.patch;
    }

    @NotNull
    public final ErrorConstants copy(int i, int i2, int i3) {
        return new ErrorConstants(i, i2, i3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorConstants)) {
            return false;
        }
        ErrorConstants errorConstants = (ErrorConstants) obj;
        return this.major == errorConstants.major && this.minor == errorConstants.minor && this.patch == errorConstants.patch;
    }

    public ErrorConstants(int i, int i2, int i3) {
        this.major = i;
        this.minor = i2;
        this.patch = i3;
    }

    public final int getMajor() {
        return this.major;
    }

    public final void setMajor(int i) {
        this.major = i;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final void setMinor(int i) {
        this.minor = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorConstants(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getPatch() {
        return this.patch;
    }

    public final void setPatch(int i) {
        this.patch = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ErrorConstants(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = kotlin.text.StringsKt.toIntOrNull(r2);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ErrorConstants(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.Nullable java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L_0x000e
            java.lang.Integer r2 = kotlin.text.StringsKt.toIntOrNull(r2)
            if (r2 == 0) goto L_0x000e
            int r2 = r2.intValue()
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            if (r3 == 0) goto L_0x001c
            java.lang.Integer r3 = kotlin.text.StringsKt.toIntOrNull(r3)
            if (r3 == 0) goto L_0x001c
            int r3 = r3.intValue()
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            if (r4 == 0) goto L_0x0029
            java.lang.Integer r4 = kotlin.text.StringsKt.toIntOrNull(r4)
            if (r4 == 0) goto L_0x0029
            int r0 = r4.intValue()
        L_0x0029:
            r1.<init>((int) r2, (int) r3, (int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ErrorConstants.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final int compareTo(@NotNull ErrorConstants errorConstants) {
        Intrinsics.checkNotNullParameter(errorConstants, H5ResourceHandlerUtil.OTHER);
        int i = this.major;
        int i2 = errorConstants.major;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        int i3 = this.minor;
        int i4 = errorConstants.minor;
        if (i3 > i4) {
            return 1;
        }
        if (i3 < i4) {
            return -1;
        }
        int i5 = this.patch;
        int i6 = errorConstants.patch;
        if (i5 > i6) {
            return 1;
        }
        if (i5 < i6) {
            return -1;
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append('.');
        sb.append(this.minor);
        sb.append('.');
        sb.append(this.patch);
        return sb.toString();
    }

    public final int toInt() {
        return (this.major * 10000) + (this.minor * 100) + this.patch;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/version/SemanticVersion$Companion;", "", "()V", "fromVersion", "Lid/dana/domain/version/SemanticVersion;", "version", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final ErrorConstants fromVersion(@NotNull String str) {
            String str2 = str;
            Intrinsics.checkNotNullParameter(str2, "version");
            Collection arrayList = new ArrayList();
            Iterator it = StringsKt.split$default((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null).iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((String) next).length() <= 0) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            if (list.size() >= 3) {
                return new ErrorConstants((String) list.get(0), (String) list.get(1), (String) list.get(2));
            }
            if (list.size() == 2) {
                return new ErrorConstants((String) list.get(0), (String) list.get(1), (String) null, 4, (DefaultConstructorMarker) null);
            }
            if (list.size() == 1) {
                return new ErrorConstants((String) list.get(0), (String) null, (String) null, 6, (DefaultConstructorMarker) null);
            }
            return new ErrorConstants(0, 0, 0, 6, (DefaultConstructorMarker) null);
        }
    }

    public final int hashCode() {
        return (((Integer.valueOf(this.major).hashCode() * 31) + Integer.valueOf(this.minor).hashCode()) * 31) + Integer.valueOf(this.patch).hashCode();
    }
}

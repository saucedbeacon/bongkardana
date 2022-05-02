package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lid/dana/domain/zendesk/model/ZendeskBasicTicket;", "", "priority", "", "subject", "body", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getPriority", "getSubject", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ScanRecord {
    @NotNull
    private final String body;
    @NotNull
    private final String priority;
    @NotNull
    private final String subject;

    public static /* synthetic */ ScanRecord copy$default(ScanRecord scanRecord, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scanRecord.priority;
        }
        if ((i & 2) != 0) {
            str2 = scanRecord.subject;
        }
        if ((i & 4) != 0) {
            str3 = scanRecord.body;
        }
        return scanRecord.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.priority;
    }

    @NotNull
    public final String component2() {
        return this.subject;
    }

    @NotNull
    public final String component3() {
        return this.body;
    }

    @NotNull
    public final ScanRecord copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "priority");
        Intrinsics.checkNotNullParameter(str2, "subject");
        Intrinsics.checkNotNullParameter(str3, TtmlNode.TAG_BODY);
        return new ScanRecord(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanRecord)) {
            return false;
        }
        ScanRecord scanRecord = (ScanRecord) obj;
        return Intrinsics.areEqual((Object) this.priority, (Object) scanRecord.priority) && Intrinsics.areEqual((Object) this.subject, (Object) scanRecord.subject) && Intrinsics.areEqual((Object) this.body, (Object) scanRecord.body);
    }

    public final int hashCode() {
        String str = this.priority;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subject;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.body;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ZendeskBasicTicket(priority=");
        sb.append(this.priority);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", body=");
        sb.append(this.body);
        sb.append(")");
        return sb.toString();
    }

    public ScanRecord(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "priority");
        Intrinsics.checkNotNullParameter(str2, "subject");
        Intrinsics.checkNotNullParameter(str3, TtmlNode.TAG_BODY);
        this.priority = str;
        this.subject = str2;
        this.body = str3;
    }

    @NotNull
    public final String getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getSubject() {
        return this.subject;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }
}

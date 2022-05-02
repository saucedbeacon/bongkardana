package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest;", "", "ticket", "Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Ticket;", "(Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Ticket;)V", "getTicket", "()Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Ticket;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Comment", "Ticket", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isNeedShowFail {
    @NotNull
    private final getMin ticket;

    public static /* synthetic */ isNeedShowFail copy$default(isNeedShowFail isneedshowfail, getMin getmin, int i, Object obj) {
        if ((i & 1) != 0) {
            getmin = isneedshowfail.ticket;
        }
        return isneedshowfail.copy(getmin);
    }

    @NotNull
    public final getMin component1() {
        return this.ticket;
    }

    @NotNull
    public final isNeedShowFail copy(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "ticket");
        return new isNeedShowFail(getmin);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof isNeedShowFail) && Intrinsics.areEqual((Object) this.ticket, (Object) ((isNeedShowFail) obj).ticket);
        }
        return true;
    }

    public final int hashCode() {
        getMin getmin = this.ticket;
        if (getmin != null) {
            return getmin.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateZendeskTicketRequest(ticket=");
        sb.append(this.ticket);
        sb.append(")");
        return sb.toString();
    }

    public isNeedShowFail(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "ticket");
        this.ticket = getmin;
    }

    @NotNull
    public final getMin getTicket() {
        return this.ticket;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Ticket;", "", "comment", "Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Comment;", "priority", "", "subject", "(Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Comment;Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Comment;", "getPriority", "()Ljava/lang/String;", "getSubject", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @NotNull
        private final setMin comment;
        @NotNull
        private final String priority;
        @NotNull
        private final String subject;

        public getMin(@NotNull setMin setmin, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(setmin, "comment");
            Intrinsics.checkNotNullParameter(str, "priority");
            Intrinsics.checkNotNullParameter(str2, "subject");
            this.comment = setmin;
            this.priority = str;
            this.subject = str2;
        }

        @NotNull
        public final setMin getComment() {
            return this.comment;
        }

        @NotNull
        public final String getPriority() {
            return this.priority;
        }

        @NotNull
        public final String getSubject() {
            return this.subject;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest$Comment;", "", "body", "", "(Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String body;

        public setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, TtmlNode.TAG_BODY);
            this.body = str;
        }

        @NotNull
        public final String getBody() {
            return this.body;
        }
    }
}

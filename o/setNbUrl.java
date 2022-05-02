package o;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse;", "", "ticket", "Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Ticket;", "(Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Ticket;)V", "getTicket", "()Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Ticket;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "CustomFields", "StatisfactionRating", "Ticket", "Via", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setNbUrl {
    @NotNull
    private final getMax ticket;

    public static /* synthetic */ setNbUrl copy$default(setNbUrl setnburl, getMax getmax, int i, Object obj) {
        if ((i & 1) != 0) {
            getmax = setnburl.ticket;
        }
        return setnburl.copy(getmax);
    }

    @NotNull
    public final getMax component1() {
        return this.ticket;
    }

    @NotNull
    public final setNbUrl copy(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "ticket");
        return new setNbUrl(getmax);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof setNbUrl) && Intrinsics.areEqual((Object) this.ticket, (Object) ((setNbUrl) obj).ticket);
        }
        return true;
    }

    public final int hashCode() {
        getMax getmax = this.ticket;
        if (getmax != null) {
            return getmax.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateZendeskTicketResponse(ticket=");
        sb.append(this.ticket);
        sb.append(")");
        return sb.toString();
    }

    public setNbUrl(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "ticket");
        this.ticket = getmax;
    }

    @NotNull
    public final getMax getTicket() {
        return this.ticket;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B±\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010!¢\u0006\u0002\u0010\"R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010$R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010$R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010$R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010$R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010$R\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Ticket;", "", "assigneeId", "", "collaboratorIds", "", "createdAt", "customFields", "Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$CustomFields;", "description", "dueAt", "externalId", "followerIds", "groupId", "hasIncidents", "id", "organizationId", "priority", "problemId", "rawSubject", "recipient", "requesterId", "satisfactionRating", "Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$StatisfactionRating;", "sharingAgreementIds", "status", "subject", "submitterId", "tags", "type", "updatedAt", "url", "via", "Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Via;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$StatisfactionRating;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Via;)V", "getAssigneeId", "()Ljava/lang/String;", "getCollaboratorIds", "()Ljava/util/List;", "getCreatedAt", "getCustomFields", "getDescription", "getDueAt", "getExternalId", "getFollowerIds", "getGroupId", "getHasIncidents", "getId", "getOrganizationId", "getPriority", "getProblemId", "getRawSubject", "getRecipient", "getRequesterId", "getSatisfactionRating", "()Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$StatisfactionRating;", "getSharingAgreementIds", "getStatus", "getSubject", "getSubmitterId", "getTags", "getType", "getUpdatedAt", "getUrl", "getVia", "()Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Via;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        @SerializedName("assignee_id")
        @Nullable
        private final String assigneeId;
        @SerializedName("collaborator_ids")
        @Nullable
        private final List<String> collaboratorIds;
        @SerializedName("created_at")
        @Nullable
        private final String createdAt;
        @SerializedName("custom_fields")
        @Nullable
        private final List<setMax> customFields;
        @SerializedName("description")
        @Nullable
        private final String description;
        @SerializedName("due_at")
        @Nullable
        private final String dueAt;
        @SerializedName("external_id")
        @Nullable
        private final String externalId;
        @SerializedName("follower_ids")
        @Nullable
        private final List<String> followerIds;
        @SerializedName("group_id")
        @Nullable
        private final String groupId;
        @SerializedName("has_incidents")
        @Nullable
        private final String hasIncidents;
        @SerializedName("id")
        @Nullable

        /* renamed from: id  reason: collision with root package name */
        private final String f9944id;
        @SerializedName("organization_id")
        @Nullable
        private final String organizationId;
        @SerializedName("priority")
        @Nullable
        private final String priority;
        @SerializedName("problem_id")
        @Nullable
        private final String problemId;
        @SerializedName("raw_subject")
        @Nullable
        private final String rawSubject;
        @SerializedName("recipient")
        @Nullable
        private final String recipient;
        @SerializedName("requester_id")
        @Nullable
        private final String requesterId;
        @SerializedName("satisfaction_rating")
        @Nullable
        private final setMin satisfactionRating;
        @SerializedName("sharing_agreement_ids")
        @Nullable
        private final List<String> sharingAgreementIds;
        @SerializedName("status")
        @Nullable
        private final String status;
        @SerializedName("subject")
        @Nullable
        private final String subject;
        @SerializedName("submitter_id")
        @Nullable
        private final String submitterId;
        @SerializedName("tags")
        @Nullable
        private final List<String> tags;
        @SerializedName("type")
        @Nullable
        private final String type;
        @SerializedName("updated_at")
        @Nullable
        private final String updatedAt;
        @SerializedName("url")
        @Nullable
        private final String url;
        @SerializedName("via")
        @Nullable
        private final getMin via;

        public getMax(@Nullable String str, @Nullable List<String> list, @Nullable String str2, @Nullable List<setMax> list2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable List<String> list3, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable setMin setmin, @Nullable List<String> list4, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable List<String> list5, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable getMin getmin) {
            this.assigneeId = str;
            this.collaboratorIds = list;
            this.createdAt = str2;
            this.customFields = list2;
            this.description = str3;
            this.dueAt = str4;
            this.externalId = str5;
            this.followerIds = list3;
            this.groupId = str6;
            this.hasIncidents = str7;
            this.f9944id = str8;
            this.organizationId = str9;
            this.priority = str10;
            this.problemId = str11;
            this.rawSubject = str12;
            this.recipient = str13;
            this.requesterId = str14;
            this.satisfactionRating = setmin;
            this.sharingAgreementIds = list4;
            this.status = str15;
            this.subject = str16;
            this.submitterId = str17;
            this.tags = list5;
            this.type = str18;
            this.updatedAt = str19;
            this.url = str20;
            this.via = getmin;
        }

        @Nullable
        public final String getAssigneeId() {
            return this.assigneeId;
        }

        @Nullable
        public final List<String> getCollaboratorIds() {
            return this.collaboratorIds;
        }

        @Nullable
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final List<setMax> getCustomFields() {
            return this.customFields;
        }

        @Nullable
        public final String getDescription() {
            return this.description;
        }

        @Nullable
        public final String getDueAt() {
            return this.dueAt;
        }

        @Nullable
        public final String getExternalId() {
            return this.externalId;
        }

        @Nullable
        public final List<String> getFollowerIds() {
            return this.followerIds;
        }

        @Nullable
        public final String getGroupId() {
            return this.groupId;
        }

        @Nullable
        public final String getHasIncidents() {
            return this.hasIncidents;
        }

        @Nullable
        public final String getId() {
            return this.f9944id;
        }

        @Nullable
        public final String getOrganizationId() {
            return this.organizationId;
        }

        @Nullable
        public final String getPriority() {
            return this.priority;
        }

        @Nullable
        public final String getProblemId() {
            return this.problemId;
        }

        @Nullable
        public final String getRawSubject() {
            return this.rawSubject;
        }

        @Nullable
        public final String getRecipient() {
            return this.recipient;
        }

        @Nullable
        public final String getRequesterId() {
            return this.requesterId;
        }

        @Nullable
        public final setMin getSatisfactionRating() {
            return this.satisfactionRating;
        }

        @Nullable
        public final List<String> getSharingAgreementIds() {
            return this.sharingAgreementIds;
        }

        @Nullable
        public final String getStatus() {
            return this.status;
        }

        @Nullable
        public final String getSubject() {
            return this.subject;
        }

        @Nullable
        public final String getSubmitterId() {
            return this.submitterId;
        }

        @Nullable
        public final List<String> getTags() {
            return this.tags;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getUpdatedAt() {
            return this.updatedAt;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final getMin getVia() {
            return this.via;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$CustomFields;", "", "id", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @SerializedName("id")
        @Nullable

        /* renamed from: id  reason: collision with root package name */
        private final String f9945id;
        @SerializedName("value")
        @Nullable
        private final String value;

        public setMax(@Nullable String str, @Nullable String str2) {
            this.f9945id = str;
            this.value = str2;
        }

        @Nullable
        public final String getId() {
            return this.f9945id;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$Via;", "", "channel", "", "(Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        @SerializedName("channel")
        @Nullable
        private final String channel;

        public getMin(@Nullable String str) {
            this.channel = str;
        }

        @Nullable
        public final String getChannel() {
            return this.channel;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse$StatisfactionRating;", "", "comment", "", "id", "score", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getId", "getScore", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @SerializedName("comment")
        @Nullable
        private final String comment;
        @SerializedName("id")
        @Nullable

        /* renamed from: id  reason: collision with root package name */
        private final String f9946id;
        @SerializedName("score")
        @Nullable
        private final String score;

        public setMin(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.comment = str;
            this.f9946id = str2;
            this.score = str3;
        }

        @Nullable
        public final String getComment() {
            return this.comment;
        }

        @Nullable
        public final String getId() {
            return this.f9946id;
        }

        @Nullable
        public final String getScore() {
            return this.score;
        }
    }
}

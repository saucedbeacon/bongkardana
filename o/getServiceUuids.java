package o;

import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0002bcBû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0002\u0010!J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0017HÆ\u0003J\u000f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003Jµ\u0002\u0010[\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u0003HÆ\u0001J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020`HÖ\u0001J\t\u0010a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010&R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b8\u0010&R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#¨\u0006d"}, d2 = {"Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult;", "", "assigneeId", "", "collaboratorIds", "", "createdAt", "customFields", "Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult$CustomFields;", "description", "dueAt", "externalId", "followerIds", "groupId", "hasIncidents", "id", "organizationId", "priority", "problemId", "rawSubject", "recipient", "requesterId", "satisfactionRating", "Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult$StatisfactionRating;", "sharingAgreementIds", "status", "subject", "submitterId", "tags", "type", "updatedAt", "url", "channel", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult$StatisfactionRating;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAssigneeId", "()Ljava/lang/String;", "getChannel", "getCollaboratorIds", "()Ljava/util/List;", "getCreatedAt", "getCustomFields", "getDescription", "getDueAt", "getExternalId", "getFollowerIds", "getGroupId", "getHasIncidents", "getId", "getOrganizationId", "getPriority", "getProblemId", "getRawSubject", "getRecipient", "getRequesterId", "getSatisfactionRating", "()Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult$StatisfactionRating;", "getSharingAgreementIds", "getStatus", "getSubject", "getSubmitterId", "getTags", "getType", "getUpdatedAt", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "CustomFields", "StatisfactionRating", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getServiceUuids {
    @NotNull
    private final String assigneeId;
    @NotNull
    private final String channel;
    @NotNull
    private final List<String> collaboratorIds;
    @NotNull
    private final String createdAt;
    @NotNull
    private final List<length> customFields;
    @NotNull
    private final String description;
    @NotNull
    private final String dueAt;
    @NotNull
    private final String externalId;
    @NotNull
    private final List<String> followerIds;
    @NotNull
    private final String groupId;
    @NotNull
    private final String hasIncidents;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9930id;
    @NotNull
    private final String organizationId;
    @NotNull
    private final String priority;
    @NotNull
    private final String problemId;
    @NotNull
    private final String rawSubject;
    @NotNull
    private final String recipient;
    @NotNull
    private final String requesterId;
    @NotNull
    private final setMin satisfactionRating;
    @NotNull
    private final List<String> sharingAgreementIds;
    @NotNull
    private final String status;
    @NotNull
    private final String subject;
    @NotNull
    private final String submitterId;
    @NotNull
    private final List<String> tags;
    @NotNull
    private final String type;
    @NotNull
    private final String updatedAt;
    @NotNull
    private final String url;

    public static /* synthetic */ getServiceUuids copy$default(getServiceUuids getserviceuuids, String str, List list, String str2, List list2, String str3, String str4, String str5, List list3, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, setMin setmin, List list4, String str15, String str16, String str17, List list5, String str18, String str19, String str20, String str21, int i, Object obj) {
        getServiceUuids getserviceuuids2 = getserviceuuids;
        int i2 = i;
        return getserviceuuids.copy((i2 & 1) != 0 ? getserviceuuids2.assigneeId : str, (i2 & 2) != 0 ? getserviceuuids2.collaboratorIds : list, (i2 & 4) != 0 ? getserviceuuids2.createdAt : str2, (i2 & 8) != 0 ? getserviceuuids2.customFields : list2, (i2 & 16) != 0 ? getserviceuuids2.description : str3, (i2 & 32) != 0 ? getserviceuuids2.dueAt : str4, (i2 & 64) != 0 ? getserviceuuids2.externalId : str5, (i2 & 128) != 0 ? getserviceuuids2.followerIds : list3, (i2 & 256) != 0 ? getserviceuuids2.groupId : str6, (i2 & 512) != 0 ? getserviceuuids2.hasIncidents : str7, (i2 & 1024) != 0 ? getserviceuuids2.f9930id : str8, (i2 & 2048) != 0 ? getserviceuuids2.organizationId : str9, (i2 & 4096) != 0 ? getserviceuuids2.priority : str10, (i2 & 8192) != 0 ? getserviceuuids2.problemId : str11, (i2 & 16384) != 0 ? getserviceuuids2.rawSubject : str12, (i2 & 32768) != 0 ? getserviceuuids2.recipient : str13, (i2 & 65536) != 0 ? getserviceuuids2.requesterId : str14, (i2 & 131072) != 0 ? getserviceuuids2.satisfactionRating : setmin, (i2 & 262144) != 0 ? getserviceuuids2.sharingAgreementIds : list4, (i2 & 524288) != 0 ? getserviceuuids2.status : str15, (i2 & 1048576) != 0 ? getserviceuuids2.subject : str16, (i2 & 2097152) != 0 ? getserviceuuids2.submitterId : str17, (i2 & 4194304) != 0 ? getserviceuuids2.tags : list5, (i2 & 8388608) != 0 ? getserviceuuids2.type : str18, (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? getserviceuuids2.updatedAt : str19, (i2 & 33554432) != 0 ? getserviceuuids2.url : str20, (i2 & 67108864) != 0 ? getserviceuuids2.channel : str21);
    }

    @NotNull
    public final String component1() {
        return this.assigneeId;
    }

    @NotNull
    public final String component10() {
        return this.hasIncidents;
    }

    @NotNull
    public final String component11() {
        return this.f9930id;
    }

    @NotNull
    public final String component12() {
        return this.organizationId;
    }

    @NotNull
    public final String component13() {
        return this.priority;
    }

    @NotNull
    public final String component14() {
        return this.problemId;
    }

    @NotNull
    public final String component15() {
        return this.rawSubject;
    }

    @NotNull
    public final String component16() {
        return this.recipient;
    }

    @NotNull
    public final String component17() {
        return this.requesterId;
    }

    @NotNull
    public final setMin component18() {
        return this.satisfactionRating;
    }

    @NotNull
    public final List<String> component19() {
        return this.sharingAgreementIds;
    }

    @NotNull
    public final List<String> component2() {
        return this.collaboratorIds;
    }

    @NotNull
    public final String component20() {
        return this.status;
    }

    @NotNull
    public final String component21() {
        return this.subject;
    }

    @NotNull
    public final String component22() {
        return this.submitterId;
    }

    @NotNull
    public final List<String> component23() {
        return this.tags;
    }

    @NotNull
    public final String component24() {
        return this.type;
    }

    @NotNull
    public final String component25() {
        return this.updatedAt;
    }

    @NotNull
    public final String component26() {
        return this.url;
    }

    @NotNull
    public final String component27() {
        return this.channel;
    }

    @NotNull
    public final String component3() {
        return this.createdAt;
    }

    @NotNull
    public final List<length> component4() {
        return this.customFields;
    }

    @NotNull
    public final String component5() {
        return this.description;
    }

    @NotNull
    public final String component6() {
        return this.dueAt;
    }

    @NotNull
    public final String component7() {
        return this.externalId;
    }

    @NotNull
    public final List<String> component8() {
        return this.followerIds;
    }

    @NotNull
    public final String component9() {
        return this.groupId;
    }

    @NotNull
    public final getServiceUuids copy(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull List<length> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list3, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull setMin setmin, @NotNull List<String> list4, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull List<String> list5, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
        String str22 = str;
        Intrinsics.checkNotNullParameter(str22, "assigneeId");
        Intrinsics.checkNotNullParameter(list, "collaboratorIds");
        Intrinsics.checkNotNullParameter(str2, "createdAt");
        Intrinsics.checkNotNullParameter(list2, "customFields");
        Intrinsics.checkNotNullParameter(str3, "description");
        Intrinsics.checkNotNullParameter(str4, "dueAt");
        Intrinsics.checkNotNullParameter(str5, "externalId");
        Intrinsics.checkNotNullParameter(list3, "followerIds");
        Intrinsics.checkNotNullParameter(str6, "groupId");
        Intrinsics.checkNotNullParameter(str7, "hasIncidents");
        Intrinsics.checkNotNullParameter(str8, "id");
        Intrinsics.checkNotNullParameter(str9, "organizationId");
        Intrinsics.checkNotNullParameter(str10, "priority");
        Intrinsics.checkNotNullParameter(str11, "problemId");
        Intrinsics.checkNotNullParameter(str12, "rawSubject");
        Intrinsics.checkNotNullParameter(str13, "recipient");
        Intrinsics.checkNotNullParameter(str14, "requesterId");
        Intrinsics.checkNotNullParameter(setmin, "satisfactionRating");
        Intrinsics.checkNotNullParameter(list4, "sharingAgreementIds");
        Intrinsics.checkNotNullParameter(str15, "status");
        Intrinsics.checkNotNullParameter(str16, "subject");
        Intrinsics.checkNotNullParameter(str17, "submitterId");
        Intrinsics.checkNotNullParameter(list5, "tags");
        Intrinsics.checkNotNullParameter(str18, "type");
        Intrinsics.checkNotNullParameter(str19, "updatedAt");
        Intrinsics.checkNotNullParameter(str20, "url");
        Intrinsics.checkNotNullParameter(str21, "channel");
        return new getServiceUuids(str22, list, str2, list2, str3, str4, str5, list3, str6, str7, str8, str9, str10, str11, str12, str13, str14, setmin, list4, str15, str16, str17, list5, str18, str19, str20, str21);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getServiceUuids)) {
            return false;
        }
        getServiceUuids getserviceuuids = (getServiceUuids) obj;
        return Intrinsics.areEqual((Object) this.assigneeId, (Object) getserviceuuids.assigneeId) && Intrinsics.areEqual((Object) this.collaboratorIds, (Object) getserviceuuids.collaboratorIds) && Intrinsics.areEqual((Object) this.createdAt, (Object) getserviceuuids.createdAt) && Intrinsics.areEqual((Object) this.customFields, (Object) getserviceuuids.customFields) && Intrinsics.areEqual((Object) this.description, (Object) getserviceuuids.description) && Intrinsics.areEqual((Object) this.dueAt, (Object) getserviceuuids.dueAt) && Intrinsics.areEqual((Object) this.externalId, (Object) getserviceuuids.externalId) && Intrinsics.areEqual((Object) this.followerIds, (Object) getserviceuuids.followerIds) && Intrinsics.areEqual((Object) this.groupId, (Object) getserviceuuids.groupId) && Intrinsics.areEqual((Object) this.hasIncidents, (Object) getserviceuuids.hasIncidents) && Intrinsics.areEqual((Object) this.f9930id, (Object) getserviceuuids.f9930id) && Intrinsics.areEqual((Object) this.organizationId, (Object) getserviceuuids.organizationId) && Intrinsics.areEqual((Object) this.priority, (Object) getserviceuuids.priority) && Intrinsics.areEqual((Object) this.problemId, (Object) getserviceuuids.problemId) && Intrinsics.areEqual((Object) this.rawSubject, (Object) getserviceuuids.rawSubject) && Intrinsics.areEqual((Object) this.recipient, (Object) getserviceuuids.recipient) && Intrinsics.areEqual((Object) this.requesterId, (Object) getserviceuuids.requesterId) && Intrinsics.areEqual((Object) this.satisfactionRating, (Object) getserviceuuids.satisfactionRating) && Intrinsics.areEqual((Object) this.sharingAgreementIds, (Object) getserviceuuids.sharingAgreementIds) && Intrinsics.areEqual((Object) this.status, (Object) getserviceuuids.status) && Intrinsics.areEqual((Object) this.subject, (Object) getserviceuuids.subject) && Intrinsics.areEqual((Object) this.submitterId, (Object) getserviceuuids.submitterId) && Intrinsics.areEqual((Object) this.tags, (Object) getserviceuuids.tags) && Intrinsics.areEqual((Object) this.type, (Object) getserviceuuids.type) && Intrinsics.areEqual((Object) this.updatedAt, (Object) getserviceuuids.updatedAt) && Intrinsics.areEqual((Object) this.url, (Object) getserviceuuids.url) && Intrinsics.areEqual((Object) this.channel, (Object) getserviceuuids.channel);
    }

    public final int hashCode() {
        String str = this.assigneeId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<String> list = this.collaboratorIds;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.createdAt;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<length> list2 = this.customFields;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.description;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.dueAt;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.externalId;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<String> list3 = this.followerIds;
        int hashCode8 = (hashCode7 + (list3 != null ? list3.hashCode() : 0)) * 31;
        String str6 = this.groupId;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.hasIncidents;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f9930id;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.organizationId;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.priority;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.problemId;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.rawSubject;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.recipient;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.requesterId;
        int hashCode17 = (hashCode16 + (str14 != null ? str14.hashCode() : 0)) * 31;
        setMin setmin = this.satisfactionRating;
        int hashCode18 = (hashCode17 + (setmin != null ? setmin.hashCode() : 0)) * 31;
        List<String> list4 = this.sharingAgreementIds;
        int hashCode19 = (hashCode18 + (list4 != null ? list4.hashCode() : 0)) * 31;
        String str15 = this.status;
        int hashCode20 = (hashCode19 + (str15 != null ? str15.hashCode() : 0)) * 31;
        String str16 = this.subject;
        int hashCode21 = (hashCode20 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.submitterId;
        int hashCode22 = (hashCode21 + (str17 != null ? str17.hashCode() : 0)) * 31;
        List<String> list5 = this.tags;
        int hashCode23 = (hashCode22 + (list5 != null ? list5.hashCode() : 0)) * 31;
        String str18 = this.type;
        int hashCode24 = (hashCode23 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.updatedAt;
        int hashCode25 = (hashCode24 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.url;
        int hashCode26 = (hashCode25 + (str20 != null ? str20.hashCode() : 0)) * 31;
        String str21 = this.channel;
        if (str21 != null) {
            i = str21.hashCode();
        }
        return hashCode26 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ZendeskBasicTicketResult(assigneeId=");
        sb.append(this.assigneeId);
        sb.append(", collaboratorIds=");
        sb.append(this.collaboratorIds);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", customFields=");
        sb.append(this.customFields);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", dueAt=");
        sb.append(this.dueAt);
        sb.append(", externalId=");
        sb.append(this.externalId);
        sb.append(", followerIds=");
        sb.append(this.followerIds);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", hasIncidents=");
        sb.append(this.hasIncidents);
        sb.append(", id=");
        sb.append(this.f9930id);
        sb.append(", organizationId=");
        sb.append(this.organizationId);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", problemId=");
        sb.append(this.problemId);
        sb.append(", rawSubject=");
        sb.append(this.rawSubject);
        sb.append(", recipient=");
        sb.append(this.recipient);
        sb.append(", requesterId=");
        sb.append(this.requesterId);
        sb.append(", satisfactionRating=");
        sb.append(this.satisfactionRating);
        sb.append(", sharingAgreementIds=");
        sb.append(this.sharingAgreementIds);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", subject=");
        sb.append(this.subject);
        sb.append(", submitterId=");
        sb.append(this.submitterId);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", channel=");
        sb.append(this.channel);
        sb.append(")");
        return sb.toString();
    }

    public getServiceUuids(@NotNull String str, @NotNull List<String> list, @NotNull String str2, @NotNull List<length> list2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list3, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull setMin setmin, @NotNull List<String> list4, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull List<String> list5, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21) {
        String str22 = str;
        List<String> list6 = list;
        String str23 = str2;
        List<length> list7 = list2;
        String str24 = str3;
        String str25 = str4;
        String str26 = str5;
        List<String> list8 = list3;
        String str27 = str6;
        String str28 = str7;
        String str29 = str8;
        String str30 = str9;
        String str31 = str10;
        String str32 = str11;
        String str33 = str13;
        Intrinsics.checkNotNullParameter(str22, "assigneeId");
        Intrinsics.checkNotNullParameter(list6, "collaboratorIds");
        Intrinsics.checkNotNullParameter(str23, "createdAt");
        Intrinsics.checkNotNullParameter(list7, "customFields");
        Intrinsics.checkNotNullParameter(str24, "description");
        Intrinsics.checkNotNullParameter(str25, "dueAt");
        Intrinsics.checkNotNullParameter(str26, "externalId");
        Intrinsics.checkNotNullParameter(list8, "followerIds");
        Intrinsics.checkNotNullParameter(str27, "groupId");
        Intrinsics.checkNotNullParameter(str28, "hasIncidents");
        Intrinsics.checkNotNullParameter(str29, "id");
        Intrinsics.checkNotNullParameter(str30, "organizationId");
        Intrinsics.checkNotNullParameter(str31, "priority");
        Intrinsics.checkNotNullParameter(str32, "problemId");
        Intrinsics.checkNotNullParameter(str12, "rawSubject");
        Intrinsics.checkNotNullParameter(str13, "recipient");
        Intrinsics.checkNotNullParameter(str14, "requesterId");
        Intrinsics.checkNotNullParameter(setmin, "satisfactionRating");
        Intrinsics.checkNotNullParameter(list4, "sharingAgreementIds");
        Intrinsics.checkNotNullParameter(str15, "status");
        Intrinsics.checkNotNullParameter(str16, "subject");
        Intrinsics.checkNotNullParameter(str17, "submitterId");
        Intrinsics.checkNotNullParameter(list5, "tags");
        Intrinsics.checkNotNullParameter(str18, "type");
        Intrinsics.checkNotNullParameter(str19, "updatedAt");
        Intrinsics.checkNotNullParameter(str20, "url");
        Intrinsics.checkNotNullParameter(str21, "channel");
        this.assigneeId = str22;
        this.collaboratorIds = list6;
        this.createdAt = str23;
        this.customFields = list7;
        this.description = str24;
        this.dueAt = str25;
        this.externalId = str26;
        this.followerIds = list8;
        this.groupId = str27;
        this.hasIncidents = str28;
        this.f9930id = str29;
        this.organizationId = str30;
        this.priority = str31;
        this.problemId = str32;
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
        this.channel = str21;
    }

    @NotNull
    public final String getAssigneeId() {
        return this.assigneeId;
    }

    @NotNull
    public final List<String> getCollaboratorIds() {
        return this.collaboratorIds;
    }

    @NotNull
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final List<length> getCustomFields() {
        return this.customFields;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDueAt() {
        return this.dueAt;
    }

    @NotNull
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    public final List<String> getFollowerIds() {
        return this.followerIds;
    }

    @NotNull
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final String getHasIncidents() {
        return this.hasIncidents;
    }

    @NotNull
    public final String getId() {
        return this.f9930id;
    }

    @NotNull
    public final String getOrganizationId() {
        return this.organizationId;
    }

    @NotNull
    public final String getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getProblemId() {
        return this.problemId;
    }

    @NotNull
    public final String getRawSubject() {
        return this.rawSubject;
    }

    @NotNull
    public final String getRecipient() {
        return this.recipient;
    }

    @NotNull
    public final String getRequesterId() {
        return this.requesterId;
    }

    @NotNull
    public final setMin getSatisfactionRating() {
        return this.satisfactionRating;
    }

    @NotNull
    public final List<String> getSharingAgreementIds() {
        return this.sharingAgreementIds;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubject() {
        return this.subject;
    }

    @NotNull
    public final String getSubmitterId() {
        return this.submitterId;
    }

    @NotNull
    public final List<String> getTags() {
        return this.tags;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String getChannel() {
        return this.channel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult$CustomFields;", "", "id", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getValue", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        @NotNull

        /* renamed from: id  reason: collision with root package name */
        private final String f9931id;
        @NotNull
        private final String value;

        public length(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "value");
            this.f9931id = str;
            this.value = str2;
        }

        @NotNull
        public final String getId() {
            return this.f9931id;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult$StatisfactionRating;", "", "comment", "", "id", "score", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getComment", "()Ljava/lang/String;", "getId", "getScore", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        private final String comment;
        @NotNull

        /* renamed from: id  reason: collision with root package name */
        private final String f9932id;
        @NotNull
        private final String score;

        public setMin(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "comment");
            Intrinsics.checkNotNullParameter(str2, "id");
            Intrinsics.checkNotNullParameter(str3, FirebaseAnalytics.Param.SCORE);
            this.comment = str;
            this.f9932id = str2;
            this.score = str3;
        }

        @NotNull
        public final String getComment() {
            return this.comment;
        }

        @NotNull
        public final String getId() {
            return this.f9932id;
        }

        @NotNull
        public final String getScore() {
            return this.score;
        }
    }
}

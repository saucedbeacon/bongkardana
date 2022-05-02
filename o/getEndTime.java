package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.isNeedShowFail;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"toCreateZendeskTicketRequest", "Lid/dana/data/zendesk/repository/source/network/request/CreateZendeskTicketRequest;", "Lid/dana/domain/zendesk/model/ZendeskBasicTicket;", "toZendeskBasicTicketResult", "Lid/dana/domain/zendesk/model/ZendeskBasicTicketResult;", "Lid/dana/data/zendesk/repository/source/network/response/CreateZendeskTicketResponse;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getEndTime {
    @NotNull
    public static final isNeedShowFail toCreateZendeskTicketRequest(@NotNull ScanRecord scanRecord) {
        Intrinsics.checkNotNullParameter(scanRecord, "$this$toCreateZendeskTicketRequest");
        return new isNeedShowFail(new isNeedShowFail.getMin(new isNeedShowFail.setMin(scanRecord.getBody()), scanRecord.getPriority(), scanRecord.getSubject()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0132  */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final o.getServiceUuids toZendeskBasicTicketResult(@org.jetbrains.annotations.NotNull o.setNbUrl r34) {
        /*
            java.lang.String r0 = "$this$toZendeskBasicTicketResult"
            r1 = r34
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            o.setNbUrl$getMax r0 = r34.getTicket()
            java.util.List r1 = r0.getCustomFields()
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x0055
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r1.next()
            o.setNbUrl$setMax r5 = (o.setNbUrl.setMax) r5
            o.getServiceUuids$length r6 = new o.getServiceUuids$length
            if (r5 == 0) goto L_0x003c
            java.lang.String r7 = r5.getId()
            goto L_0x003d
        L_0x003c:
            r7 = r2
        L_0x003d:
            if (r7 != 0) goto L_0x0040
            r7 = r3
        L_0x0040:
            if (r5 == 0) goto L_0x0047
            java.lang.String r5 = r5.getValue()
            goto L_0x0048
        L_0x0047:
            r5 = r2
        L_0x0048:
            if (r5 != 0) goto L_0x004b
            r5 = r3
        L_0x004b:
            r6.<init>(r7, r5)
            r4.add(r6)
            goto L_0x0027
        L_0x0052:
            java.util.List r4 = (java.util.List) r4
            goto L_0x0056
        L_0x0055:
            r4 = r2
        L_0x0056:
            o.setNbUrl$setMin r1 = r0.getSatisfactionRating()
            if (r1 == 0) goto L_0x0080
            o.setNbUrl$setMin r1 = r0.getSatisfactionRating()
            if (r1 == 0) goto L_0x007d
            o.getServiceUuids$setMin r5 = new o.getServiceUuids$setMin
            java.lang.String r6 = r1.getComment()
            if (r6 != 0) goto L_0x006b
            r6 = r3
        L_0x006b:
            java.lang.String r7 = r1.getId()
            if (r7 != 0) goto L_0x0072
            r7 = r3
        L_0x0072:
            java.lang.String r1 = r1.getScore()
            if (r1 != 0) goto L_0x0079
            r1 = r3
        L_0x0079:
            r5.<init>(r6, r7, r1)
            goto L_0x0085
        L_0x007d:
            r24 = r2
            goto L_0x0087
        L_0x0080:
            o.getServiceUuids$setMin r5 = new o.getServiceUuids$setMin
            r5.<init>(r3, r3, r3)
        L_0x0085:
            r24 = r5
        L_0x0087:
            o.getServiceUuids r1 = new o.getServiceUuids
            java.lang.String r5 = r0.getAssigneeId()
            if (r5 != 0) goto L_0x0091
            r7 = r3
            goto L_0x0092
        L_0x0091:
            r7 = r5
        L_0x0092:
            java.util.List r5 = r0.getCollaboratorIds()
            if (r5 != 0) goto L_0x009c
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
        L_0x009c:
            r8 = r5
            java.lang.String r5 = r0.getCreatedAt()
            if (r5 != 0) goto L_0x00a5
            r9 = r3
            goto L_0x00a6
        L_0x00a5:
            r9 = r5
        L_0x00a6:
            if (r4 != 0) goto L_0x00ac
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00ac:
            r10 = r4
            java.lang.String r4 = r0.getDescription()
            if (r4 != 0) goto L_0x00b5
            r11 = r3
            goto L_0x00b6
        L_0x00b5:
            r11 = r4
        L_0x00b6:
            java.lang.String r4 = r0.getDueAt()
            if (r4 != 0) goto L_0x00be
            r12 = r3
            goto L_0x00bf
        L_0x00be:
            r12 = r4
        L_0x00bf:
            java.lang.String r4 = r0.getExternalId()
            if (r4 != 0) goto L_0x00c7
            r13 = r3
            goto L_0x00c8
        L_0x00c7:
            r13 = r4
        L_0x00c8:
            java.util.List r4 = r0.getFollowerIds()
            if (r4 != 0) goto L_0x00d2
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00d2:
            r14 = r4
            java.lang.String r4 = r0.getGroupId()
            if (r4 != 0) goto L_0x00db
            r15 = r3
            goto L_0x00dc
        L_0x00db:
            r15 = r4
        L_0x00dc:
            java.lang.String r4 = r0.getHasIncidents()
            if (r4 != 0) goto L_0x00e5
            r16 = r3
            goto L_0x00e7
        L_0x00e5:
            r16 = r4
        L_0x00e7:
            java.lang.String r4 = r0.getId()
            if (r4 != 0) goto L_0x00f0
            r17 = r3
            goto L_0x00f2
        L_0x00f0:
            r17 = r4
        L_0x00f2:
            java.lang.String r4 = r0.getOrganizationId()
            if (r4 != 0) goto L_0x00fb
            r18 = r3
            goto L_0x00fd
        L_0x00fb:
            r18 = r4
        L_0x00fd:
            java.lang.String r4 = r0.getPriority()
            if (r4 != 0) goto L_0x0106
            r19 = r3
            goto L_0x0108
        L_0x0106:
            r19 = r4
        L_0x0108:
            java.lang.String r4 = r0.getProblemId()
            if (r4 != 0) goto L_0x0111
            r20 = r3
            goto L_0x0113
        L_0x0111:
            r20 = r4
        L_0x0113:
            java.lang.String r4 = r0.getRawSubject()
            if (r4 != 0) goto L_0x011c
            r21 = r3
            goto L_0x011e
        L_0x011c:
            r21 = r4
        L_0x011e:
            java.lang.String r4 = r0.getRecipient()
            if (r4 != 0) goto L_0x0127
            r22 = r3
            goto L_0x0129
        L_0x0127:
            r22 = r4
        L_0x0129:
            java.lang.String r4 = r0.getRequesterId()
            if (r4 != 0) goto L_0x0132
            r23 = r3
            goto L_0x0134
        L_0x0132:
            r23 = r4
        L_0x0134:
            java.util.List r4 = r0.getSharingAgreementIds()
            if (r4 != 0) goto L_0x013e
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x013e:
            r25 = r4
            java.lang.String r4 = r0.getStatus()
            if (r4 != 0) goto L_0x0149
            r26 = r3
            goto L_0x014b
        L_0x0149:
            r26 = r4
        L_0x014b:
            java.lang.String r4 = r0.getSubject()
            if (r4 != 0) goto L_0x0154
            r27 = r3
            goto L_0x0156
        L_0x0154:
            r27 = r4
        L_0x0156:
            java.lang.String r4 = r0.getSubmitterId()
            if (r4 != 0) goto L_0x015f
            r28 = r3
            goto L_0x0161
        L_0x015f:
            r28 = r4
        L_0x0161:
            java.util.List r4 = r0.getTags()
            if (r4 != 0) goto L_0x016b
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L_0x016b:
            r29 = r4
            java.lang.String r4 = r0.getType()
            if (r4 != 0) goto L_0x0176
            r30 = r3
            goto L_0x0178
        L_0x0176:
            r30 = r4
        L_0x0178:
            java.lang.String r4 = r0.getUpdatedAt()
            if (r4 != 0) goto L_0x0181
            r31 = r3
            goto L_0x0183
        L_0x0181:
            r31 = r4
        L_0x0183:
            java.lang.String r4 = r0.getUrl()
            if (r4 != 0) goto L_0x018c
            r32 = r3
            goto L_0x018e
        L_0x018c:
            r32 = r4
        L_0x018e:
            o.setNbUrl$getMin r0 = r0.getVia()
            if (r0 == 0) goto L_0x0198
            java.lang.String r2 = r0.getChannel()
        L_0x0198:
            if (r2 != 0) goto L_0x019d
            r33 = r3
            goto L_0x019f
        L_0x019d:
            r33 = r2
        L_0x019f:
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getEndTime.toZendeskBasicTicketResult(o.setNbUrl):o.getServiceUuids");
    }
}

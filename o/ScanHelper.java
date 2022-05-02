package o;

import id.dana.domain.social.InitStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.forThisDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lid/dana/domain/social/model/Following;", "", "followingItemList", "", "Lid/dana/domain/social/model/RelationshipItem;", "paginator", "Lid/dana/domain/social/model/Paginator;", "(Ljava/util/List;Lid/dana/domain/social/model/Paginator;)V", "getFollowingItemList", "()Ljava/util/List;", "setFollowingItemList", "(Ljava/util/List;)V", "getPaginator", "()Lid/dana/domain/social/model/Paginator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ScanHelper {
    @NotNull
    private List<processScanResult> followingItemList;
    @NotNull
    private final setExtraDataBeaconTracker paginator;

    public ScanHelper() {
        this((List) null, (setExtraDataBeaconTracker) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ScanHelper copy$default(ScanHelper scanHelper, List<processScanResult> list, setExtraDataBeaconTracker setextradatabeacontracker, int i, Object obj) {
        if ((i & 1) != 0) {
            list = scanHelper.followingItemList;
        }
        if ((i & 2) != 0) {
            setextradatabeacontracker = scanHelper.paginator;
        }
        return scanHelper.copy(list, setextradatabeacontracker);
    }

    @NotNull
    public final List<processScanResult> component1() {
        return this.followingItemList;
    }

    @NotNull
    public final setExtraDataBeaconTracker component2() {
        return this.paginator;
    }

    @NotNull
    public final ScanHelper copy(@NotNull List<processScanResult> list, @NotNull setExtraDataBeaconTracker setextradatabeacontracker) {
        Intrinsics.checkNotNullParameter(list, "followingItemList");
        Intrinsics.checkNotNullParameter(setextradatabeacontracker, "paginator");
        return new ScanHelper(list, setextradatabeacontracker);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanHelper)) {
            return false;
        }
        ScanHelper scanHelper = (ScanHelper) obj;
        return Intrinsics.areEqual((Object) this.followingItemList, (Object) scanHelper.followingItemList) && Intrinsics.areEqual((Object) this.paginator, (Object) scanHelper.paginator);
    }

    public final int hashCode() {
        List<processScanResult> list = this.followingItemList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        setExtraDataBeaconTracker setextradatabeacontracker = this.paginator;
        if (setextradatabeacontracker != null) {
            i = setextradatabeacontracker.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Following(followingItemList=");
        sb.append(this.followingItemList);
        sb.append(", paginator=");
        sb.append(this.paginator);
        sb.append(")");
        return sb.toString();
    }

    public ScanHelper(@NotNull List<processScanResult> list, @NotNull setExtraDataBeaconTracker setextradatabeacontracker) {
        Intrinsics.checkNotNullParameter(list, "followingItemList");
        Intrinsics.checkNotNullParameter(setextradatabeacontracker, "paginator");
        this.followingItemList = list;
        this.paginator = setextradatabeacontracker;
    }

    public /* synthetic */ ScanHelper(List list, setExtraDataBeaconTracker setextradatabeacontracker, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ScanHelper scanHelper;
        setExtraDataBeaconTracker setextradatabeacontracker2;
        List arrayList = (i & 1) != 0 ? new ArrayList() : list;
        if ((i & 2) != 0) {
            setextradatabeacontracker2 = new setExtraDataBeaconTracker(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (ArrayList) null, 8191, (DefaultConstructorMarker) null);
            scanHelper = this;
        } else {
            scanHelper = this;
            setextradatabeacontracker2 = setextradatabeacontracker;
        }
        new ScanHelper(arrayList, setextradatabeacontracker2);
    }

    @NotNull
    public final List<processScanResult> getFollowingItemList() {
        return this.followingItemList;
    }

    public final void setFollowingItemList(@NotNull List<processScanResult> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.followingItemList = list;
    }

    @NotNull
    public final setExtraDataBeaconTracker getPaginator() {
        return this.paginator;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lid/dana/domain/social/model/SocialContact;", "", "contactId", "", "displayName", "", "phoneNumber", "contactRawId", "lastUpdatedTime", "isEmpty", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getContactId", "()I", "getContactRawId", "()Ljava/lang/String;", "getDisplayName", "()Z", "getLastUpdatedTime", "getPhoneNumber", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class ScanData {
        private final int contactId;
        @NotNull
        private final String contactRawId;
        @NotNull
        private final String displayName;
        private final boolean isEmpty;
        @NotNull
        private final String lastUpdatedTime;
        @NotNull
        private final String phoneNumber;

        public ScanData() {
            this(0, (String) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ ScanData copy$default(ScanData scanData, int i, String str, String str2, String str3, String str4, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = scanData.contactId;
            }
            if ((i2 & 2) != 0) {
                str = scanData.displayName;
            }
            String str5 = str;
            if ((i2 & 4) != 0) {
                str2 = scanData.phoneNumber;
            }
            String str6 = str2;
            if ((i2 & 8) != 0) {
                str3 = scanData.contactRawId;
            }
            String str7 = str3;
            if ((i2 & 16) != 0) {
                str4 = scanData.lastUpdatedTime;
            }
            String str8 = str4;
            if ((i2 & 32) != 0) {
                z = scanData.isEmpty;
            }
            return scanData.copy(i, str5, str6, str7, str8, z);
        }

        public final int component1() {
            return this.contactId;
        }

        @NotNull
        public final String component2() {
            return this.displayName;
        }

        @NotNull
        public final String component3() {
            return this.phoneNumber;
        }

        @NotNull
        public final String component4() {
            return this.contactRawId;
        }

        @NotNull
        public final String component5() {
            return this.lastUpdatedTime;
        }

        public final boolean component6() {
            return this.isEmpty;
        }

        @NotNull
        public final ScanData copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-1874676705, oncanceled);
                onCancelLoad.getMin(-1874676705, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, setBuildNumber.DISPLAY_NAME_KEY);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            Intrinsics.checkNotNullParameter(str3, "contactRawId");
            Intrinsics.checkNotNullParameter(str4, "lastUpdatedTime");
            return new ScanData(i, str, str2, str3, str4, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScanData)) {
                return false;
            }
            ScanData scanData = (ScanData) obj;
            return this.contactId == scanData.contactId && Intrinsics.areEqual((Object) this.displayName, (Object) scanData.displayName) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) scanData.phoneNumber) && Intrinsics.areEqual((Object) this.contactRawId, (Object) scanData.contactRawId) && Intrinsics.areEqual((Object) this.lastUpdatedTime, (Object) scanData.lastUpdatedTime) && this.isEmpty == scanData.isEmpty;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("SocialContact(contactId=");
            sb.append(this.contactId);
            sb.append(", displayName=");
            sb.append(this.displayName);
            sb.append(", phoneNumber=");
            sb.append(this.phoneNumber);
            sb.append(", contactRawId=");
            sb.append(this.contactRawId);
            sb.append(", lastUpdatedTime=");
            sb.append(this.lastUpdatedTime);
            sb.append(", isEmpty=");
            sb.append(this.isEmpty);
            sb.append(")");
            return sb.toString();
        }

        public ScanData(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
            Intrinsics.checkNotNullParameter(str, setBuildNumber.DISPLAY_NAME_KEY);
            Intrinsics.checkNotNullParameter(str2, "phoneNumber");
            Intrinsics.checkNotNullParameter(str3, "contactRawId");
            Intrinsics.checkNotNullParameter(str4, "lastUpdatedTime");
            this.contactId = i;
            this.displayName = str;
            this.phoneNumber = str2;
            this.contactRawId = str3;
            this.lastUpdatedTime = str4;
            this.isEmpty = z;
        }

        public final int getContactId() {
            return this.contactId;
        }

        @NotNull
        public final String getDisplayName() {
            return this.displayName;
        }

        @NotNull
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NotNull
        public final String getContactRawId() {
            return this.contactRawId;
        }

        @NotNull
        public final String getLastUpdatedTime() {
            return this.lastUpdatedTime;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ ScanData(int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = 0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                java.lang.String r1 = ""
                if (r6 == 0) goto L_0x0010
                r2 = r1
                goto L_0x0011
            L_0x0010:
                r2 = r7
            L_0x0011:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0017
                r3 = r1
                goto L_0x0018
            L_0x0017:
                r3 = r8
            L_0x0018:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001e
                r4 = r1
                goto L_0x001f
            L_0x001e:
                r4 = r9
            L_0x001f:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r1 = r10
            L_0x0025:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002b
                r12 = 0
                goto L_0x002c
            L_0x002b:
                r12 = r11
            L_0x002c:
                r6 = r5
                r7 = r13
                r8 = r2
                r9 = r3
                r10 = r4
                r11 = r1
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ScanHelper.ScanData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final boolean isEmpty() {
            return this.isEmpty;
        }

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.contactId).hashCode() * 31;
            String str = this.displayName;
            int i = 0;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.phoneNumber;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.contactRawId;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.lastUpdatedTime;
            if (str4 != null) {
                i = str4.hashCode();
            }
            int i2 = (hashCode4 + i) * 31;
            boolean z = this.isEmpty;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\u000e\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0011\u0010\u000f\u001a\u00020\bH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u001eH@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010 \u001a\u00020\u001bH@ø\u0001\u0000¢\u0006\u0002\u0010!J%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH@ø\u0001\u0000¢\u0006\u0002\u0010$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lid/dana/domain/social/sync/BaseSyncContactRunner;", "Lid/dana/domain/social/SyncRunner;", "socialSyncContactRepository", "Lid/dana/domain/social/SocialSyncRepository;", "(Lid/dana/domain/social/SocialSyncRepository;)V", "getSocialSyncContactRepository", "()Lid/dana/domain/social/SocialSyncRepository;", "doesntHaveContactPermission", "", "getContactToBeSynched", "", "Lid/dana/domain/social/model/SocialContact;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isContactSyncConfigDisabled", "isInitFeedNotFinished", "isUnableToSync", "onSyncContactError", "Lid/dana/domain/social/Result$Error;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSyncContactSuccess", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;", "result", "Lid/dana/domain/social/Result$Success;", "", "(Lid/dana/domain/social/Result$Success;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSyncStarting", "", "sync", "runAttempt", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncContacts", "contactToBeSynced", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public abstract class ScanProcessor implements findCalculatorForModelWithLock {
        @NotNull
        private final getRequestedModel socialSyncContactRepository;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H@"}, d2 = {"syncContacts", "", "contactToBeSynced", "", "Lid/dana/domain/social/model/SocialContact;", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result$Success;", ""}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.domain.social.sync.BaseSyncContactRunner", f = "BaseSyncContactRunner.kt", i = {}, l = {54, 54}, m = "syncContacts", n = {}, s = {})
        static final class getMax extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ ScanProcessor this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(ScanProcessor scanProcessor, Continuation continuation) {
                super(continuation);
                this.this$0 = scanProcessor;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.syncContacts((List<ScanData>) null, this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H@"}, d2 = {"sync", "", "runAttempt", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lid/dana/domain/social/Result;", "Lid/dana/domain/social/model/SyncResult;"}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.domain.social.sync.BaseSyncContactRunner", f = "BaseSyncContactRunner.kt", i = {0, 1, 2, 3, 4}, l = {27, 30, 31, 31, 31, 33}, m = "sync$suspendImpl", n = {"this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
        static final class getMin extends ContinuationImpl {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ ScanProcessor this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMin(ScanProcessor scanProcessor, Continuation continuation) {
                super(continuation);
                this.this$0 = scanProcessor;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return ScanProcessor.sync$suspendImpl(this.this$0, 0, this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"isUnableToSync", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.domain.social.sync.BaseSyncContactRunner", f = "BaseSyncContactRunner.kt", i = {0}, l = {60, 61}, m = "isUnableToSync", n = {"this"}, s = {"L$0"})
        static final class length extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ ScanProcessor this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(ScanProcessor scanProcessor, Continuation continuation) {
                super(continuation);
                this.this$0 = scanProcessor;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.isUnableToSync(this);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"isContactSyncConfigDisabled", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 4, 2})
        @DebugMetadata(c = "id.dana.domain.social.sync.BaseSyncContactRunner", f = "BaseSyncContactRunner.kt", i = {}, l = {63}, m = "isContactSyncConfigDisabled", n = {}, s = {})
        static final class setMax extends ContinuationImpl {
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ ScanProcessor this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            setMax(ScanProcessor scanProcessor, Continuation continuation) {
                super(continuation);
                this.this$0 = scanProcessor;
            }

            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.isContactSyncConfigDisabled(this);
            }
        }

        @Nullable
        public abstract Object getContactToBeSynched(@NotNull Continuation<? super List<ScanData>> continuation);

        /* access modifiers changed from: protected */
        @Nullable
        public Object onSyncContactError(@NotNull Exception exc, @NotNull Continuation<? super forThisDevice.getMin> continuation) {
            return onSyncContactError$suspendImpl(this, exc, continuation);
        }

        @Nullable
        public abstract Object onSyncContactSuccess(@NotNull forThisDevice.setMax<Integer> setmax, @NotNull Continuation<? super forThisDevice<onLeScan>> continuation);

        /* access modifiers changed from: protected */
        @Nullable
        public Object onSyncStarting(@NotNull Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }

        @Nullable
        public Object sync(int i, @NotNull Continuation<? super forThisDevice<onLeScan>> continuation) {
            return sync$suspendImpl(this, i, continuation);
        }

        public ScanProcessor(@NotNull getRequestedModel getrequestedmodel) {
            Intrinsics.checkNotNullParameter(getrequestedmodel, "socialSyncContactRepository");
            this.socialSyncContactRepository = getrequestedmodel;
        }

        /* access modifiers changed from: protected */
        @NotNull
        public final getRequestedModel getSocialSyncContactRepository() {
            return this.socialSyncContactRepository;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
            if (((java.lang.Boolean) r7).booleanValue() != false) goto L_0x00cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
            r6.L$0 = r5;
            r6.label = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
            if (r5.onSyncStarting(r6) != r0) goto L_0x0093;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0093, code lost:
            r6.L$0 = r5;
            r6.L$1 = r5;
            r6.L$2 = r5;
            r6.label = 3;
            r7 = r5.getContactToBeSynched(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
            if (r7 != r0) goto L_0x00a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
            r1 = r5;
            r3 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            r6.L$0 = r3;
            r6.L$1 = r1;
            r6.L$2 = null;
            r6.label = 4;
            r7 = r5.syncContacts((java.util.List) r7, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
            if (r7 != r0) goto L_0x00b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b6, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b7, code lost:
            r5 = r1;
            r1 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r6.L$0 = r1;
            r6.L$1 = null;
            r6.label = 5;
            r7 = r5.onSyncContactSuccess((o.forThisDevice.setMax) r7, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c6, code lost:
            if (r7 != r0) goto L_0x00c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c8, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c9, code lost:
            r5 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d4, code lost:
            throw new id.dana.domain.social.SocialSyncConditionNotMetException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            return (o.forThisDevice) r7;
         */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ java.lang.Object sync$suspendImpl(o.ScanHelper.ScanProcessor r5, int r6, kotlin.coroutines.Continuation r7) {
            /*
                boolean r6 = r7 instanceof o.ScanHelper.ScanProcessor.getMin
                if (r6 == 0) goto L_0x0014
                r6 = r7
                o.ScanHelper$ScanProcessor$getMin r6 = (o.ScanHelper.ScanProcessor.getMin) r6
                int r0 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L_0x0014
                int r7 = r6.label
                int r7 = r7 - r1
                r6.label = r7
                goto L_0x0019
            L_0x0014:
                o.ScanHelper$ScanProcessor$getMin r6 = new o.ScanHelper$ScanProcessor$getMin
                r6.<init>(r5, r7)
            L_0x0019:
                java.lang.Object r7 = r6.result
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x0070;
                    case 1: goto L_0x0068;
                    case 2: goto L_0x0060;
                    case 3: goto L_0x004c;
                    case 4: goto L_0x003b;
                    case 5: goto L_0x0032;
                    case 6: goto L_0x002d;
                    default: goto L_0x0025;
                }
            L_0x0025:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x002d:
                kotlin.ResultKt.throwOnFailure(r7)
                goto L_0x00e6
            L_0x0032:
                java.lang.Object r5 = r6.L$0
                o.ScanHelper$ScanProcessor r5 = (o.ScanHelper.ScanProcessor) r5
                kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ Exception -> 0x00d5 }
                goto L_0x00ca
            L_0x003b:
                java.lang.Object r5 = r6.L$1
                o.ScanHelper$ScanProcessor r5 = (o.ScanHelper.ScanProcessor) r5
                java.lang.Object r1 = r6.L$0
                o.ScanHelper$ScanProcessor r1 = (o.ScanHelper.ScanProcessor) r1
                kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ Exception -> 0x0048 }
                goto L_0x00b9
            L_0x0048:
                r7 = move-exception
                r5 = r1
                goto L_0x00d6
            L_0x004c:
                java.lang.Object r5 = r6.L$2
                o.ScanHelper$ScanProcessor r5 = (o.ScanHelper.ScanProcessor) r5
                java.lang.Object r1 = r6.L$1
                o.ScanHelper$ScanProcessor r1 = (o.ScanHelper.ScanProcessor) r1
                java.lang.Object r3 = r6.L$0
                o.ScanHelper$ScanProcessor r3 = (o.ScanHelper.ScanProcessor) r3
                kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ Exception -> 0x005c }
                goto L_0x00a5
            L_0x005c:
                r7 = move-exception
                r5 = r3
                goto L_0x00d6
            L_0x0060:
                java.lang.Object r5 = r6.L$0
                o.ScanHelper$ScanProcessor r5 = (o.ScanHelper.ScanProcessor) r5
                kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ Exception -> 0x00d5 }
                goto L_0x0093
            L_0x0068:
                java.lang.Object r5 = r6.L$0
                o.ScanHelper$ScanProcessor r5 = (o.ScanHelper.ScanProcessor) r5
                kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ Exception -> 0x00d5 }
                goto L_0x007f
            L_0x0070:
                kotlin.ResultKt.throwOnFailure(r7)
                r6.L$0 = r5     // Catch:{ Exception -> 0x00d5 }
                r7 = 1
                r6.label = r7     // Catch:{ Exception -> 0x00d5 }
                java.lang.Object r7 = r5.isUnableToSync(r6)     // Catch:{ Exception -> 0x00d5 }
                if (r7 != r0) goto L_0x007f
                return r0
            L_0x007f:
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ Exception -> 0x00d5 }
                boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x00d5 }
                if (r7 != 0) goto L_0x00cd
                r6.L$0 = r5     // Catch:{ Exception -> 0x00d5 }
                r7 = 2
                r6.label = r7     // Catch:{ Exception -> 0x00d5 }
                java.lang.Object r7 = r5.onSyncStarting(r6)     // Catch:{ Exception -> 0x00d5 }
                if (r7 != r0) goto L_0x0093
                return r0
            L_0x0093:
                r6.L$0 = r5     // Catch:{ Exception -> 0x00d5 }
                r6.L$1 = r5     // Catch:{ Exception -> 0x00d5 }
                r6.L$2 = r5     // Catch:{ Exception -> 0x00d5 }
                r7 = 3
                r6.label = r7     // Catch:{ Exception -> 0x00d5 }
                java.lang.Object r7 = r5.getContactToBeSynched(r6)     // Catch:{ Exception -> 0x00d5 }
                if (r7 != r0) goto L_0x00a3
                return r0
            L_0x00a3:
                r1 = r5
                r3 = r1
            L_0x00a5:
                java.util.List r7 = (java.util.List) r7     // Catch:{ Exception -> 0x005c }
                r6.L$0 = r3     // Catch:{ Exception -> 0x005c }
                r6.L$1 = r1     // Catch:{ Exception -> 0x005c }
                r6.L$2 = r2     // Catch:{ Exception -> 0x005c }
                r4 = 4
                r6.label = r4     // Catch:{ Exception -> 0x005c }
                java.lang.Object r7 = r5.syncContacts(r7, r6)     // Catch:{ Exception -> 0x005c }
                if (r7 != r0) goto L_0x00b7
                return r0
            L_0x00b7:
                r5 = r1
                r1 = r3
            L_0x00b9:
                o.forThisDevice$setMax r7 = (o.forThisDevice.setMax) r7     // Catch:{ Exception -> 0x0048 }
                r6.L$0 = r1     // Catch:{ Exception -> 0x0048 }
                r6.L$1 = r2     // Catch:{ Exception -> 0x0048 }
                r3 = 5
                r6.label = r3     // Catch:{ Exception -> 0x0048 }
                java.lang.Object r7 = r5.onSyncContactSuccess(r7, r6)     // Catch:{ Exception -> 0x0048 }
                if (r7 != r0) goto L_0x00c9
                return r0
            L_0x00c9:
                r5 = r1
            L_0x00ca:
                o.forThisDevice r7 = (o.forThisDevice) r7     // Catch:{ Exception -> 0x00d5 }
                goto L_0x00e8
            L_0x00cd:
                id.dana.domain.social.SocialSyncConditionNotMetException r7 = new id.dana.domain.social.SocialSyncConditionNotMetException     // Catch:{ Exception -> 0x00d5 }
                r7.<init>()     // Catch:{ Exception -> 0x00d5 }
                java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ Exception -> 0x00d5 }
                throw r7     // Catch:{ Exception -> 0x00d5 }
            L_0x00d5:
                r7 = move-exception
            L_0x00d6:
                r6.L$0 = r2
                r6.L$1 = r2
                r6.L$2 = r2
                r1 = 6
                r6.label = r1
                java.lang.Object r7 = r5.onSyncContactError(r7, r6)
                if (r7 != r0) goto L_0x00e6
                return r0
            L_0x00e6:
                o.forThisDevice r7 = (o.forThisDevice) r7
            L_0x00e8:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ScanHelper.ScanProcessor.sync$suspendImpl(o.ScanHelper$ScanProcessor, int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        static /* synthetic */ Object onSyncContactError$suspendImpl(ScanProcessor scanProcessor, Exception exc, Continuation continuation) {
            return new forThisDevice.getMin(exc);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x006e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object syncContacts(java.util.List<o.ScanHelper.ScanData> r7, kotlin.coroutines.Continuation<? super o.forThisDevice.setMax<java.lang.Integer>> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof o.ScanHelper.ScanProcessor.getMax
                if (r0 == 0) goto L_0x0014
                r0 = r8
                o.ScanHelper$ScanProcessor$getMax r0 = (o.ScanHelper.ScanProcessor.getMax) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r8 = r0.label
                int r8 = r8 - r2
                r0.label = r8
                goto L_0x0019
            L_0x0014:
                o.ScanHelper$ScanProcessor$getMax r0 = new o.ScanHelper$ScanProcessor$getMax
                r0.<init>(r6, r8)
            L_0x0019:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003d
                if (r2 == r4) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x006f
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                java.lang.Object r7 = r0.L$0
                o.getRequestedModel r7 = (o.getRequestedModel) r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x0061
            L_0x003d:
                kotlin.ResultKt.throwOnFailure(r8)
                boolean r8 = r7.isEmpty()
                if (r8 == 0) goto L_0x0051
                o.forThisDevice$setMax r7 = new o.forThisDevice$setMax
                r8 = 0
                java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
                r7.<init>(r8)
                return r7
            L_0x0051:
                o.getRequestedModel r8 = r6.socialSyncContactRepository
                r0.L$0 = r8
                r0.label = r4
                java.lang.Object r7 = r8.filterDanaUser(r7, r0)
                if (r7 != r1) goto L_0x005e
                return r1
            L_0x005e:
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x0061:
                java.util.List r8 = (java.util.List) r8
                r2 = 0
                r0.L$0 = r2
                r0.label = r3
                java.lang.Object r8 = r7.syncContacts(r8, r0)
                if (r8 != r1) goto L_0x006f
                return r1
            L_0x006f:
                o.forThisDevice$setMax r7 = new o.forThisDevice$setMax
                r7.<init>(r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ScanHelper.ScanProcessor.syncContacts(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object isUnableToSync(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof o.ScanHelper.ScanProcessor.length
                if (r0 == 0) goto L_0x0014
                r0 = r6
                o.ScanHelper$ScanProcessor$length r0 = (o.ScanHelper.ScanProcessor.length) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r6 = r0.label
                int r6 = r6 - r2
                r0.label = r6
                goto L_0x0019
            L_0x0014:
                o.ScanHelper$ScanProcessor$length r0 = new o.ScanHelper$ScanProcessor$length
                r0.<init>(r5, r6)
            L_0x0019:
                java.lang.Object r6 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x003d
                if (r2 == r4) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                kotlin.ResultKt.throwOnFailure(r6)
                goto L_0x0066
            L_0x002d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x0035:
                java.lang.Object r2 = r0.L$0
                o.ScanHelper$ScanProcessor r2 = (o.ScanHelper.ScanProcessor) r2
                kotlin.ResultKt.throwOnFailure(r6)
                goto L_0x0052
            L_0x003d:
                kotlin.ResultKt.throwOnFailure(r6)
                boolean r6 = r5.doesntHaveContactPermission()
                if (r6 != 0) goto L_0x0070
                r0.L$0 = r5
                r0.label = r4
                java.lang.Object r6 = r5.isContactSyncConfigDisabled(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r2 = r5
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L_0x0070
                r6 = 0
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r6 = r2.isInitFeedNotFinished(r0)
                if (r6 != r1) goto L_0x0066
                return r1
            L_0x0066:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x006f
                goto L_0x0070
            L_0x006f:
                r4 = 0
            L_0x0070:
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ScanHelper.ScanProcessor.isUnableToSync(kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object isContactSyncConfigDisabled(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof o.ScanHelper.ScanProcessor.setMax
                if (r0 == 0) goto L_0x0014
                r0 = r5
                o.ScanHelper$ScanProcessor$setMax r0 = (o.ScanHelper.ScanProcessor.setMax) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L_0x0014
                int r5 = r0.label
                int r5 = r5 - r2
                r0.label = r5
                goto L_0x0019
            L_0x0014:
                o.ScanHelper$ScanProcessor$setMax r0 = new o.ScanHelper$ScanProcessor$setMax
                r0.<init>(r4, r5)
            L_0x0019:
                java.lang.Object r5 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r5)
                goto L_0x0040
            L_0x002a:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r5)
                o.getRequestedModel r5 = r4.socialSyncContactRepository
                r0.label = r3
                java.lang.Object r5 = r5.isContactSyncEnabled(r0)
                if (r5 != r1) goto L_0x0040
                return r1
            L_0x0040:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                r5 = r5 ^ r3
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ScanHelper.ScanProcessor.isContactSyncConfigDisabled(kotlin.coroutines.Continuation):java.lang.Object");
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ Object isInitFeedNotFinished(Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(this.socialSyncContactRepository.getSocialFeedInitStatus().blockingFirst().getStatus() != InitStatus.FINISH);
        }

        private final boolean doesntHaveContactPermission() {
            return !this.socialSyncContactRepository.hasContactPermission();
        }
    }
}

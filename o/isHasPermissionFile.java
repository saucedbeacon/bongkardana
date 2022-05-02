package o;

import id.dana.domain.nearbyme.IoDispatcher;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import o.APExpansion;
import o.ScanHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0011\u0010$\u001a\u00020%H@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0011\u0010'\u001a\u00020%H@ø\u0001\u0000¢\u0006\u0002\u0010&J\u001f\u0010(\u001a\u00020)2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H@ø\u0001\u0000¢\u0006\u0002\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\u0014XD¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lid/dana/data/social/repository/RecurringSyncContactRepository;", "Lid/dana/data/social/repository/SocialSyncContactRepository;", "contactProvider", "Lid/dana/data/social/sync/SocialContactProvider;", "amcsConfig", "Lid/dana/data/config/source/amcs/AmcsConfigEntityData;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "socialSyncFactory", "Lid/dana/data/social/repository/SocialSyncEntityDataFactory;", "socialSyncProcessFactory", "Lid/dana/data/social/repository/SocialSyncProcessEntityDataFactory;", "socialPreferences", "Lid/dana/data/social/repository/source/local/SocialPreferences;", "socialPreferencesDataFactory", "Lid/dana/data/social/repository/SocialPreferencesDataFactory;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lid/dana/data/social/sync/SocialContactProvider;Lid/dana/data/config/source/amcs/AmcsConfigEntityData;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/social/repository/SocialSyncEntityDataFactory;Lid/dana/data/social/repository/SocialSyncProcessEntityDataFactory;Lid/dana/data/social/repository/source/local/SocialPreferences;Lid/dana/data/social/repository/SocialPreferencesDataFactory;Lkotlinx/coroutines/CoroutineDispatcher;)V", "firstTimeInitFeedKey", "", "getFirstTimeInitFeedKey", "()Ljava/lang/String;", "fullSyncFinishedKey", "getFullSyncFinishedKey", "lastOffsetSyncContactKey", "getLastOffsetSyncContactKey", "lastSyncContactTimeKey", "getLastSyncContactTimeKey", "offsetAtSpecificSyncTimeKey", "getOffsetAtSpecificSyncTimeKey", "filterDanaUser", "", "Lid/dana/domain/social/model/SocialContact;", "contactForSync", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isContactSyncEnabled", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFirstTimeInitFeedFinished", "syncContacts", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isHasPermissionFile extends RVGroupInit {
    private final handleMessage amcsConfig;
    @NotNull
    private final String firstTimeInitFeedKey = "save_contact_first_time_init_feed";
    @NotNull
    private final String fullSyncFinishedKey = "save_contact_fullsync_finished";
    @NotNull
    private final String lastOffsetSyncContactKey = "save_contact_last_offset_sync_contact";
    @NotNull
    private final String lastSyncContactTimeKey = "save_contact_last_sync_contact_time";
    @NotNull
    private final String offsetAtSpecificSyncTimeKey = "save_contact_offset_at_specific_sync_time";

    @Nullable
    public final Object filterDanaUser(@NotNull List<ScanHelper.ScanData> list, @NotNull Continuation<? super List<ScanHelper.ScanData>> continuation) {
        return list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public isHasPermissionFile(@NotNull getAuthContentResult getauthcontentresult, @NotNull handleMessage handlemessage, @NotNull DialogLayout dialogLayout, @NotNull setAuthRequestContext setauthrequestcontext, @NotNull getExtInfo getextinfo, @NotNull getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude, @NotNull getLink getlink, @NotNull @IoDispatcher APExpansion.AnonymousClass1 r9) {
        super(getauthcontentresult, handlemessage, dialogLayout, setauthrequestcontext, getextinfo, getcurrentlongitudeandlatitude, getlink, r9);
        Intrinsics.checkNotNullParameter(getauthcontentresult, "contactProvider");
        Intrinsics.checkNotNullParameter(handlemessage, "amcsConfig");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(setauthrequestcontext, "socialSyncFactory");
        Intrinsics.checkNotNullParameter(getextinfo, "socialSyncProcessFactory");
        Intrinsics.checkNotNullParameter(getcurrentlongitudeandlatitude, "socialPreferences");
        Intrinsics.checkNotNullParameter(getlink, "socialPreferencesDataFactory");
        Intrinsics.checkNotNullParameter(r9, "ioDispatcher");
        this.amcsConfig = handlemessage;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getFirstTimeInitFeedKey() {
        return this.firstTimeInitFeedKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getOffsetAtSpecificSyncTimeKey() {
        return this.offsetAtSpecificSyncTimeKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getLastSyncContactTimeKey() {
        return this.lastSyncContactTimeKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getLastOffsetSyncContactKey() {
        return this.lastOffsetSyncContactKey;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String getFullSyncFinishedKey() {
        return this.fullSyncFinishedKey;
    }

    @Nullable
    public final Object syncContacts(@NotNull List<ScanHelper.ScanData> list, @NotNull Continuation<? super Integer> continuation) {
        list.size();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ScanHelper.ScanData scanData = list.get(i);
            scanData.getDisplayName();
            scanData.getPhoneNumber();
        }
        return Boxing.boxInt(list.size());
    }

    @Nullable
    public final Object isContactSyncEnabled(@NotNull Continuation<? super Boolean> continuation) {
        Boolean blockingSingle = this.amcsConfig.isRecurringContactSyncEnabled().blockingSingle();
        return Boxing.boxBoolean(blockingSingle != null ? blockingSingle.booleanValue() : false);
    }

    @Nullable
    public final Object isFirstTimeInitFeedFinished(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }
}

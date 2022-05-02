package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import o.ScanDataProcessor;
import o.ScanHelper;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&J\u0011\u0010\u0019\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001b\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010#J\u0011\u0010$\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H&J\b\u0010(\u001a\u00020\u0003H&J\u0011\u0010)\u001a\u00020\u0018H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010*\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010+\u001a\u00020\u0018H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010,\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010-\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u00101J\u0019\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u0010#J!\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001aH¦@ø\u0001\u0000¢\u0006\u0002\u00106J\u0019\u00107\u001a\u00020/2\u0006\u00105\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u00108J\u001f\u00109\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Lid/dana/domain/social/SocialSyncRepository;", "", "deviceFeedFeatureSwitch", "", "getDeviceFeedFeatureSwitch", "()Z", "setDeviceFeedFeatureSwitch", "(Z)V", "filterDanaUser", "", "Lid/dana/domain/social/model/SocialContact;", "contactForSync", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllContact", "maxContactPerbatch", "", "syncContactOffset", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFullSyncFinishedFlag", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getInitFeedJob", "Lkotlinx/coroutines/Job;", "getInitFeedObservable", "Lio/reactivex/subjects/BehaviorSubject;", "Lid/dana/domain/social/model/InitFeed;", "getLastSynchedTime", "", "getMaxContactPerbatch", "getModifiedContactSinceSpecificTime", "maxContactPerBatch", "lastSyncContactOffset", "lastSyncTime", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffsetAtSpecificSyncTime", "specificTime", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffsetLastSynchedContact", "getSocialFeedInitStatus", "Lio/reactivex/Observable;", "Lid/dana/domain/social/model/FeedInit;", "hasContactPermission", "initFeedFirstTime", "initFeedPeriodically", "initFeedWithoutContact", "isContactSyncEnabled", "isFirstTimeInitFeedFinished", "saveFullSyncFinishedFlag", "", "isFinished", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastSynchedTime", "lastSyncTimeToSave", "saveOffsetAtSpecificSyncTime", "offsetToSave", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOffsetLastSynchedContact", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncContacts", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface getRequestedModel {
    @Nullable
    Object filterDanaUser(@NotNull List<ScanHelper.ScanData> list, @NotNull Continuation<? super List<ScanHelper.ScanData>> continuation);

    @Nullable
    Object getAllContact(int i, int i2, @NotNull Continuation<? super List<ScanHelper.ScanData>> continuation);

    boolean getDeviceFeedFeatureSwitch();

    @Nullable
    Object getFullSyncFinishedFlag(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    DictionaryKeys getInitFeedJob();

    @NotNull
    removeString<setBeaconParsers> getInitFeedObservable();

    @Nullable
    Object getLastSynchedTime(@NotNull Continuation<? super String> continuation);

    @Nullable
    Object getMaxContactPerbatch(@NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getModifiedContactSinceSpecificTime(int i, int i2, @NotNull String str, @NotNull Continuation<? super List<ScanHelper.ScanData>> continuation);

    @Nullable
    Object getOffsetAtSpecificSyncTime(@NotNull String str, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getOffsetLastSynchedContact(@NotNull Continuation<? super Integer> continuation);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<ScanDataProcessor.ScanData> getSocialFeedInitStatus();

    boolean hasContactPermission();

    @Nullable
    Object initFeedFirstTime(@NotNull Continuation<? super setBeaconParsers> continuation);

    @Nullable
    Object initFeedPeriodically(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object initFeedWithoutContact(@NotNull Continuation<? super setBeaconParsers> continuation);

    @Nullable
    Object isContactSyncEnabled(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object isFirstTimeInitFeedFinished(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object saveFullSyncFinishedFlag(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveLastSynchedTime(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveOffsetAtSpecificSyncTime(int i, @NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveOffsetLastSynchedContact(int i, @NotNull Continuation<? super Unit> continuation);

    void setDeviceFeedFeatureSwitch(boolean z);

    @Nullable
    Object syncContacts(@NotNull List<ScanHelper.ScanData> list, @NotNull Continuation<? super Integer> continuation);
}

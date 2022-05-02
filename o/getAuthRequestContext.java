package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&J)\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J)\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ1\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ \u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H&ø\u0001\u0001\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/SocialSyncEntityData;", "", "getFullSyncFinishedFlag", "", "phoneNumber", "", "fullSyncFinishedKey", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastSynchedTime", "lastSyncContactTimeKey", "getOffsetAtSpecificSyncTime", "", "specificTime", "offsetAtSpecificSyncTimeKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOffsetLastSynchedContact", "lastOffsetSyncContactKey", "isFirstTimeInitFeedFinished", "firstTimeInitFeedKey", "saveFullSyncFinishedFlag", "", "isFinished", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastSynchedTime", "lastSynchedTime", "saveOffsetAtSpecificSyncTime", "offsetToSave", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOffsetLastSynchedContact", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFirstTimeInitFeedFinished", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getAuthRequestContext {
    @Nullable
    Object getFullSyncFinishedFlag(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object getLastSynchedTime(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super String> continuation);

    @Nullable
    Object getOffsetAtSpecificSyncTime(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Integer> continuation);

    @Nullable
    Object getOffsetLastSynchedContact(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Integer> continuation);

    boolean isFirstTimeInitFeedFinished(@NotNull String str, @NotNull String str2);

    @Nullable
    Object saveFullSyncFinishedFlag(boolean z, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveLastSynchedTime(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveOffsetAtSpecificSyncTime(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object saveOffsetLastSynchedContact(int i, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    void setFirstTimeInitFeedFinished(boolean z, @NotNull String str, @NotNull String str2);
}

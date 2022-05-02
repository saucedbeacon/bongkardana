package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import o.RVOpenAuthHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006ø\u0001\u0001\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/SocialSyncProcessEntityData;", "", "filterDanaUser", "", "", "phoneNumbersToCheck", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initFeed", "Lid/dana/data/social/repository/source/network/result/InitFeedResponse;", "totalPhoneContactSize", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncContact", "Lid/dana/data/social/repository/source/network/result/SocialSyncResponse;", "userContacts", "Lid/dana/data/social/model/SocialUserContact;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setScopeNicks {
    @Nullable
    Object filterDanaUser(@NotNull List<String> list, @NotNull Continuation<? super List<String>> continuation);

    @Nullable
    Object initFeed(int i, @NotNull Continuation<? super setAuthCode> continuation);

    @Nullable
    Object syncContact(@NotNull List<RVOpenAuthHelper.AnonymousClass4> list, @NotNull Continuation<? super getErrorScopes> continuation);
}

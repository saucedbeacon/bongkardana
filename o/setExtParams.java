package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lid/dana/data/social/repository/source/network/SocialSyncFacade;", "", "checkDanaUser", "Lid/dana/data/synccontact/repository/source/network/result/BizTransferSyncContactResult;", "danaUserCheckRequest", "Lid/dana/data/synccontact/repository/source/network/request/BizTransferSyncContactRequest;", "initFeed", "Lid/dana/data/social/repository/source/network/result/InitFeedResponse;", "initFeedRequest", "Lid/dana/data/social/repository/source/network/request/InitFeedRequest;", "syncSocialContact", "Lid/dana/data/social/repository/source/network/result/SocialSyncResponse;", "contactToSync", "Lid/dana/data/social/repository/source/network/request/SocialSyncRequest;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setExtParams {
    @OperationType("alipayplus.mobilewallet.biztransfer.contact.sync")
    @NotNull
    @SignCheck
    updateApp checkDanaUser(@NotNull setNeedShowError setneedshowerror);

    @OperationType("alipayplus.mobilewallet.socialmedia.initfeed")
    @NotNull
    @SignCheck
    setAuthCode initFeed(@NotNull getAuthText getauthtext);

    @OperationType("alipayplus.mobilewallet.socialmedia.synccontact")
    @NotNull
    @SignCheck
    getErrorScopes syncSocialContact(@NotNull setAuthText setauthtext);
}

package com.alibaba.griver.core.rpc;

import com.alibaba.griver.core.model.aboutinfo.GetAboutInfoRequest;
import com.alibaba.griver.core.model.aboutinfo.GetAboutInfoResult;
import com.alibaba.griver.core.model.applist.FetchAppListResult;
import com.alibaba.griver.core.model.applist.FetchAppsByIdsRequest;
import com.alibaba.griver.core.model.applist.FetchAppsByKeyWordsRequest;
import com.alibaba.griver.core.model.applist.FetchAppsRequest;
import com.alibaba.griver.core.model.applist.FetchAppsResult;
import com.alibaba.griver.core.model.codec.UrlCodecRequest;
import com.alibaba.griver.core.model.codec.UrlCodecResult;
import com.alibaba.griver.core.model.share.ShareShortUrlRequest;
import com.alibaba.griver.core.model.share.ShareShortUrlResult;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface MiniProgramFacade {
    @OperationType("alipay.intl.gmp.rpc.app.info.list.query")
    @SignCheck
    FetchAppListResult fetchAppInfoListByIds(FetchAppsByIdsRequest fetchAppsByIdsRequest);

    @OperationType("alipay.intl.gmp.rpc.app.info.search")
    @SignCheck
    FetchAppListResult fetchAppInfoListByKeyword(FetchAppsByKeyWordsRequest fetchAppsByKeyWordsRequest);

    @OperationType("alipay.intl.gmp.rpc.app.info.list.query")
    @SignCheck
    FetchAppsResult fetchAppList(FetchAppsRequest fetchAppsRequest);

    @OperationType("alipay.intl.gmp.rpc.miniprogram.about.query")
    @SignCheck
    GetAboutInfoResult getAboutInfo(GetAboutInfoRequest getAboutInfoRequest);

    @OperationType("gmp.openplatform.app.share.urlshorten")
    @SignCheck
    ShareShortUrlResult getShareShortUrl(ShareShortUrlRequest shareShortUrlRequest);

    @OperationType("alipay.intl.gmp.rpc.app.codec.route")
    @SignCheck
    UrlCodecResult getUrlCodec(UrlCodecRequest urlCodecRequest);
}

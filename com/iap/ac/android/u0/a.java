package com.iap.ac.android.u0;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.mpm.base.model.oauth.request.PrepareCollectionCodeAuthRequest;
import com.iap.ac.android.mpm.base.model.oauth.result.PrepareCollectionCodeAuthResult;
import com.iap.ac.android.mpm.oauth.collectioncode.source.CollectionCodeAuthFacade;

public class a extends BaseNetwork<CollectionCodeAuthFacade> {

    /* renamed from: com.iap.ac.android.u0.a$a  reason: collision with other inner class name */
    public class C0031a implements BaseNetwork.a<CollectionCodeAuthFacade, PrepareCollectionCodeAuthResult> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PrepareCollectionCodeAuthRequest f9772a;

        public C0031a(PrepareCollectionCodeAuthRequest prepareCollectionCodeAuthRequest) {
            this.f9772a = prepareCollectionCodeAuthRequest;
        }

        public Object a(Object obj) {
            return ((CollectionCodeAuthFacade) a.this.getFacade()).prepare(this.f9772a);
        }
    }

    public PrepareCollectionCodeAuthResult a(@NonNull String str, @NonNull String str2) throws Exception {
        PrepareCollectionCodeAuthRequest prepareCollectionCodeAuthRequest = new PrepareCollectionCodeAuthRequest();
        prepareCollectionCodeAuthRequest.acquirerAuthUrl = str;
        prepareCollectionCodeAuthRequest.acquirerId = str2;
        return (PrepareCollectionCodeAuthResult) wrapper(new C0031a(prepareCollectionCodeAuthRequest));
    }

    public Class<CollectionCodeAuthFacade> getFacadeClass() {
        return CollectionCodeAuthFacade.class;
    }
}

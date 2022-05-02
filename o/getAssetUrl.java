package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getAssetUrl extends parseFailed<getMD5String, getMin> {
    private final getMD5Byte oauthRepository;

    @Inject
    getAssetUrl(appxLoadFailed appxloadfailed, getScheme getscheme, getMD5Byte getmd5byte) {
        super(appxloadfailed, getscheme);
        this.oauthRepository = getmd5byte;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getMD5String> buildUseCaseObservable(getMin getmin) {
        return this.oauthRepository.getOauthScope(getmin.codeChallenge, getmin.clientId, getmin.scopes, getmin.redirectUrl, getmin.needMobileToken);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public String clientId;
        /* access modifiers changed from: private */
        public String codeChallenge;
        /* access modifiers changed from: private */
        public boolean needMobileToken;
        /* access modifiers changed from: private */
        public String redirectUrl;
        /* access modifiers changed from: private */
        public List<String> scopes;

        private getMin(String str, String str2, List<String> list, String str3, boolean z) {
            this.codeChallenge = str;
            this.clientId = str2;
            this.scopes = list;
            this.redirectUrl = str3;
            this.needMobileToken = z;
        }

        public static getMin forGetScopeList(String str, String str2, List<String> list, String str3, boolean z) {
            return new getMin(str, str2, list, str3, z);
        }
    }
}

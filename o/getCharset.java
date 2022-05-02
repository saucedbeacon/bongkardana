package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getCharset extends parseFailed<getMD5Digest, getMax> {
    private final getMD5Byte oauthRepository;

    @Inject
    getCharset(appxLoadFailed appxloadfailed, getScheme getscheme, getMD5Byte getmd5byte) {
        super(appxloadfailed, getscheme);
        this.oauthRepository = getmd5byte;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getMD5Digest> buildUseCaseObservable(getMax getmax) {
        return this.oauthRepository.confirmOauthScope(getmax.codeChallenge, getmax.clientId, getmax.scopes, getmax.redirectUrl, getmax.needMobileToken);
    }

    public static class getMax {
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

        private getMax(String str, String str2, List<String> list, String str3, boolean z) {
            this.codeChallenge = str;
            this.clientId = str2;
            this.scopes = list;
            this.redirectUrl = str3;
            this.needMobileToken = z;
        }

        public static getMax forConfirmScopes(String str, String str2, List<String> list, String str3, boolean z) {
            return new getMax(str, str2, list, str3, z);
        }
    }
}

package o;

import javax.inject.Singleton;

@Singleton
public class getTabSize {
    public GriverRVExecutorServiceImpl transform(renderView renderview) {
        if (renderview == null) {
            return null;
        }
        GriverRVExecutorServiceImpl griverRVExecutorServiceImpl = new GriverRVExecutorServiceImpl();
        griverRVExecutorServiceImpl.setRedirectUrl(renderview.redirectUrl);
        griverRVExecutorServiceImpl.setNeedUserConsent(renderview.needUserConsent);
        griverRVExecutorServiceImpl.setUserConsentConfigKey(renderview.userConsentConfigKey);
        griverRVExecutorServiceImpl.setUserConsentMessage(renderview.userConsentMessage);
        return griverRVExecutorServiceImpl;
    }
}

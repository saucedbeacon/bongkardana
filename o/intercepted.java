package o;

public class intercepted extends setSpeed<SplashEntryInfo, getMD5Digest> {
    /* access modifiers changed from: protected */
    public getMD5Digest map(SplashEntryInfo splashEntryInfo) {
        if (splashEntryInfo == null) {
            return null;
        }
        getMD5Digest getmd5digest = new getMD5Digest();
        getmd5digest.setServerAuthCode(splashEntryInfo.getAuthCode());
        getmd5digest.setMobileAuthCode(splashEntryInfo.getMobileAuthCode());
        return getmd5digest;
    }
}

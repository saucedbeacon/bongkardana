package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.referralengagement.ShowReferralEngagementDialogBridge;
import o.b;

public final class hasActionButton implements getBindingAdapter<ShowReferralEngagementDialogBridge> {
    private final b.C0007b<Constants> saveReferralEngagementDialogCacheProvider;

    public hasActionButton(b.C0007b<Constants> bVar) {
        this.saveReferralEngagementDialogCacheProvider = bVar;
    }

    public static getBindingAdapter<ShowReferralEngagementDialogBridge> create(b.C0007b<Constants> bVar) {
        return new hasActionButton(bVar);
    }

    public final void injectMembers(ShowReferralEngagementDialogBridge showReferralEngagementDialogBridge) {
        injectSaveReferralEngagementDialogCache(showReferralEngagementDialogBridge, this.saveReferralEngagementDialogCacheProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.referralengagement.ShowReferralEngagementDialogBridge.saveReferralEngagementDialogCache")
    public static void injectSaveReferralEngagementDialogCache(ShowReferralEngagementDialogBridge showReferralEngagementDialogBridge, Constants constants) {
        showReferralEngagementDialogBridge.saveReferralEngagementDialogCache = constants;
    }
}

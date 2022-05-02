package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.danah5.twilioverifysecurityproduct.TwilioVerifySecurityProductBridge;
import o.b;

public final class checkItems implements getBindingAdapter<TwilioVerifySecurityProductBridge> {
    private final b.C0007b<disableItems> twilioVerifySecurityProductManagerProvider;

    public checkItems(b.C0007b<disableItems> bVar) {
        this.twilioVerifySecurityProductManagerProvider = bVar;
    }

    public static getBindingAdapter<TwilioVerifySecurityProductBridge> create(b.C0007b<disableItems> bVar) {
        return new checkItems(bVar);
    }

    public final void injectMembers(TwilioVerifySecurityProductBridge twilioVerifySecurityProductBridge) {
        injectTwilioVerifySecurityProductManager(twilioVerifySecurityProductBridge, this.twilioVerifySecurityProductManagerProvider.get());
    }

    @InjectedFieldSignature("id.dana.danah5.twilioverifysecurityproduct.TwilioVerifySecurityProductBridge.twilioVerifySecurityProductManager")
    public static void injectTwilioVerifySecurityProductManager(TwilioVerifySecurityProductBridge twilioVerifySecurityProductBridge, disableItems disableitems) {
        twilioVerifySecurityProductBridge.twilioVerifySecurityProductManager = disableitems;
    }
}

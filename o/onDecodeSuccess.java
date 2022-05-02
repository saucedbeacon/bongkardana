package o;

import id.dana.di.modules.OtherBankAccountModule;
import o.setPriority;

public final class onDecodeSuccess implements getAdapterPosition<setPriority.length> {
    private final OtherBankAccountModule setMax;

    private onDecodeSuccess(OtherBankAccountModule otherBankAccountModule) {
        this.setMax = otherBankAccountModule;
    }

    public static onDecodeSuccess getMax(OtherBankAccountModule otherBankAccountModule) {
        return new onDecodeSuccess(otherBankAccountModule);
    }

    public final /* synthetic */ Object get() {
        setPriority.length length = this.setMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

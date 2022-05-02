package o;

import id.dana.di.modules.DonationModule;
import o.parseFromBytes;

public final class getWriter implements getAdapterPosition<parseFromBytes.getMin> {
    private final DonationModule length;

    private getWriter(DonationModule donationModule) {
        this.length = donationModule;
    }

    public static getWriter length(DonationModule donationModule) {
        return new getWriter(donationModule);
    }

    public final /* synthetic */ Object get() {
        parseFromBytes.getMin min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

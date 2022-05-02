package o;

import id.dana.di.modules.DonationModule;
import o.b;
import o.parseFromBytes;

public final class JavaBeanSerializer implements getAdapterPosition<parseFromBytes.getMax> {
    private final b.C0007b<getAdvertiseFlags> getMax;
    private final DonationModule length;

    private JavaBeanSerializer(DonationModule donationModule, b.C0007b<getAdvertiseFlags> bVar) {
        this.length = donationModule;
        this.getMax = bVar;
    }

    public static JavaBeanSerializer getMin(DonationModule donationModule, b.C0007b<getAdvertiseFlags> bVar) {
        return new JavaBeanSerializer(donationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        parseFromBytes.getMax length2 = this.length.length(this.getMax.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

package o;

import id.dana.di.modules.OpenBankAccountModule;
import o.b;
import o.onPageScrolled;

public final class handleBridgeCallNotFound implements getAdapterPosition<onPageScrolled.setMax> {
    private final OpenBankAccountModule getMin;
    private final b.C0007b<pageScrolled> length;

    public static onPageScrolled.setMax length(OpenBankAccountModule openBankAccountModule, pageScrolled pagescrolled) {
        onPageScrolled.setMax length2 = openBankAccountModule.length(pagescrolled);
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onPageScrolled.setMax length2 = this.getMin.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

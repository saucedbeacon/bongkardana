package o;

import id.dana.sendmoney.contact.provider.ContactProvider;
import java.util.concurrent.Callable;

public final class PermissionHelper implements Callable {
    private final ContactProvider getMax;

    public PermissionHelper(ContactProvider contactProvider) {
        this.getMax = contactProvider;
    }

    public final Object call() {
        return ContactProvider.setMin(this.getMax);
    }
}

package o;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsSessionToken;

public final class seekTo implements IBinder.DeathRecipient {
    private final CustomTabsService.AnonymousClass1 getMax;
    private final CustomTabsSessionToken setMin;

    public seekTo(CustomTabsService.AnonymousClass1 r1, CustomTabsSessionToken customTabsSessionToken) {
        this.getMax = r1;
        this.setMin = customTabsSessionToken;
    }

    public final void binderDied() {
        CustomTabsService.this.cleanUpSession(this.setMin);
    }
}

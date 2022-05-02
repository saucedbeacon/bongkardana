package o;

import io.split.android.client.events.SplitEvent;
import io.split.android.client.events.executors.SplitEventExecutorResources;

public final class dynamicDecrypt {

    /* renamed from: o.dynamicDecrypt$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$events$SplitEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.split.android.client.events.SplitEvent[] r0 = io.split.android.client.events.SplitEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$events$SplitEvent = r0
                io.split.android.client.events.SplitEvent r1 = io.split.android.client.events.SplitEvent.SDK_READY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.events.SplitEvent r1 = io.split.android.client.events.SplitEvent.SDK_READY_FROM_CACHE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.split.android.client.events.SplitEvent r1 = io.split.android.client.events.SplitEvent.SDK_UPDATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.split.android.client.events.SplitEvent r1 = io.split.android.client.events.SplitEvent.SDK_READY_TIMED_OUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.dynamicDecrypt.AnonymousClass1.<clinit>():void");
        }
    }

    public static dynamicEncrypt factory(SplitEvent splitEvent, atlasSafeEncrypt atlassafeencrypt, SplitEventExecutorResources splitEventExecutorResources) {
        int i = AnonymousClass1.$SwitchMap$io$split$android$client$events$SplitEvent[splitEvent.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return new dynamicDecryptByteArray(atlassafeencrypt, splitEventExecutorResources.getSplitClient());
        }
        throw new IllegalArgumentException();
    }
}

package o;

import androidx.annotation.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.split.android.client.events.ISplitEventsManager;
import io.split.android.client.events.SplitEvent;
import io.split.android.client.events.SplitInternalEvent;
import io.split.android.client.events.executors.SplitEventExecutorResources;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class setNick implements ISplitEventsManager, Runnable {
    private static final int QUEUE_CAPACITY = 20;
    /* access modifiers changed from: private */
    public getPackageValidityCheckComp _config;
    private Map<SplitEvent, Integer> _executionTimes = new ConcurrentHashMap();
    private ArrayBlockingQueue<SplitInternalEvent> _queue = new ArrayBlockingQueue<>(20);
    private SplitEventExecutorResources _resources = new dynamicEncryptDDp();
    private final ScheduledExecutorService _scheduler;
    private Map<SplitEvent, List<atlasSafeEncrypt>> _suscriptions = new ConcurrentHashMap();
    private Set<SplitInternalEvent> _triggered = new onUMIDInitFinishedEx();

    @VisibleForTesting
    public void setExecutionResources(SplitEventExecutorResources splitEventExecutorResources) {
        this._resources = splitEventExecutorResources;
    }

    public setNick(getPackageValidityCheckComp getpackagevaliditycheckcomp) {
        this._config = getpackagevaliditycheckcomp;
        registerMaxAllowebExecutionTimesPerEvent();
        new Thread(new Runnable() {
            public final void run() {
                try {
                    if (setNick.this._config.blockUntilReady() > 0) {
                        Thread.sleep((long) setNick.this._config.blockUntilReady());
                        setNick.this.notifyInternalEvent(SplitInternalEvent.SDK_READY_TIMEOUT_REACHED);
                    }
                } catch (InterruptedException e) {
                    createLoadingDialog.d("Waiting before to check if SDK is READY has been interrupted", e.getMessage());
                    setNick.this.notifyInternalEvent(SplitInternalEvent.SDK_READY_TIMEOUT_REACHED);
                } catch (Throwable th) {
                    createLoadingDialog.d("Waiting before to check if SDK is READY interrupted ", th.getMessage());
                    setNick.this.notifyInternalEvent(SplitInternalEvent.SDK_READY_TIMEOUT_REACHED);
                }
            }
        }).start();
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryBuilder().setDaemon(true).setNameFormat("Split-EventsManager-%d").setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public final void uncaughtException(Thread thread, Throwable th) {
                StringBuilder sb = new StringBuilder("Unexpected error ");
                sb.append(th.getLocalizedMessage());
                createLoadingDialog.e(sb.toString());
            }
        }).build());
        this._scheduler = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.submit(this);
    }

    private void registerMaxAllowebExecutionTimesPerEvent() {
        this._executionTimes.put(SplitEvent.SDK_READY, 1);
        this._executionTimes.put(SplitEvent.SDK_READY_TIMED_OUT, 1);
        this._executionTimes.put(SplitEvent.SDK_READY_FROM_CACHE, 1);
        this._executionTimes.put(SplitEvent.SDK_UPDATE, -1);
    }

    public SplitEventExecutorResources getExecutorResources() {
        return this._resources;
    }

    public void notifyInternalEvent(SplitInternalEvent splitInternalEvent) {
        Preconditions.checkNotNull(splitInternalEvent);
        if ((splitInternalEvent != SplitInternalEvent.SPLITS_FETCHED && splitInternalEvent != SplitInternalEvent.MY_SEGMENTS_FETCHED) || !isTriggered(SplitEvent.SDK_READY)) {
            try {
                this._queue.add(splitInternalEvent);
            } catch (IllegalStateException unused) {
                createLoadingDialog.d("Internal events queue is full");
            }
        }
    }

    public void register(SplitEvent splitEvent, atlasSafeEncrypt atlassafeencrypt) {
        Preconditions.checkNotNull(splitEvent);
        Preconditions.checkNotNull(atlassafeencrypt);
        if (!this._executionTimes.containsKey(splitEvent) || this._executionTimes.get(splitEvent).intValue() != 0) {
            if (!this._suscriptions.containsKey(splitEvent)) {
                this._suscriptions.put(splitEvent, new ArrayList());
            }
            this._suscriptions.get(splitEvent).add(atlassafeencrypt);
            return;
        }
        executeTask(splitEvent, atlassafeencrypt);
    }

    public boolean eventAlreadyTriggered(SplitEvent splitEvent) {
        return this._executionTimes.get(splitEvent).intValue() == 0;
    }

    private boolean wasTriggered(SplitInternalEvent splitInternalEvent) {
        return this._triggered.contains(splitInternalEvent);
    }

    public void run() {
        while (true) {
            triggerEventsWhenAreAvailable();
        }
    }

    private void triggerEventsWhenAreAvailable() {
        try {
            SplitInternalEvent take = this._queue.take();
            this._triggered.add(take);
            switch (AnonymousClass1.$SwitchMap$io$split$android$client$events$SplitInternalEvent[take.ordinal()]) {
                case 1:
                case 2:
                    if (isTriggered(SplitEvent.SDK_READY)) {
                        trigger(SplitEvent.SDK_UPDATE);
                        return;
                    } else {
                        triggerSdkReadyIfNeeded();
                        return;
                    }
                case 3:
                case 4:
                    if (!isTriggered(SplitEvent.SDK_READY)) {
                        triggerSdkReadyIfNeeded();
                        return;
                    }
                    return;
                case 5:
                case 6:
                    if (wasTriggered(SplitInternalEvent.SPLITS_LOADED_FROM_STORAGE) && wasTriggered(SplitInternalEvent.MY_SEGMENTS_LOADED_FROM_STORAGE)) {
                        trigger(SplitEvent.SDK_READY_FROM_CACHE);
                        return;
                    }
                    return;
                case 7:
                    if (isTriggered(SplitEvent.SDK_READY)) {
                        trigger(SplitEvent.SDK_UPDATE);
                        return;
                    }
                    return;
                case 8:
                    if (!isTriggered(SplitEvent.SDK_READY)) {
                        trigger(SplitEvent.SDK_READY_TIMED_OUT);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (InterruptedException e) {
            createLoadingDialog.d(e.getMessage());
        }
    }

    /* renamed from: o.setNick$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$split$android$client$events$SplitInternalEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                io.split.android.client.events.SplitInternalEvent[] r0 = io.split.android.client.events.SplitInternalEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$io$split$android$client$events$SplitInternalEvent = r0
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.SPLITS_UPDATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitInternalEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.MY_SEGMENTS_UPDATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitInternalEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.SPLITS_FETCHED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitInternalEvent     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.MY_SEGMENTS_FETCHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitInternalEvent     // Catch:{ NoSuchFieldError -> 0x003e }
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.SPLITS_LOADED_FROM_STORAGE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitInternalEvent     // Catch:{ NoSuchFieldError -> 0x0049 }
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.MY_SEGMENTS_LOADED_FROM_STORAGE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitInternalEvent     // Catch:{ NoSuchFieldError -> 0x0054 }
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.SPLIT_KILLED_NOTIFICATION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$io$split$android$client$events$SplitInternalEvent     // Catch:{ NoSuchFieldError -> 0x0060 }
                io.split.android.client.events.SplitInternalEvent r1 = io.split.android.client.events.SplitInternalEvent.SDK_READY_TIMEOUT_REACHED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setNick.AnonymousClass1.<clinit>():void");
        }
    }

    private boolean isTriggered(SplitEvent splitEvent) {
        Integer num = this._executionTimes.get(splitEvent);
        if (num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    private void triggerSdkReadyIfNeeded() {
        if (!wasTriggered(SplitInternalEvent.MY_SEGMENTS_UPDATED) && !wasTriggered(SplitInternalEvent.MY_SEGMENTS_FETCHED)) {
            return;
        }
        if ((wasTriggered(SplitInternalEvent.SPLITS_UPDATED) || wasTriggered(SplitInternalEvent.SPLITS_FETCHED)) && !isTriggered(SplitEvent.SDK_READY)) {
            trigger(SplitEvent.SDK_READY);
        }
    }

    private void trigger(SplitEvent splitEvent) {
        if (this._executionTimes.get(splitEvent).intValue() != 0) {
            if (this._executionTimes.get(splitEvent).intValue() > 0) {
                Map<SplitEvent, Integer> map = this._executionTimes;
                map.put(splitEvent, Integer.valueOf(map.get(splitEvent).intValue() - 1));
            }
            if (this._suscriptions.containsKey(splitEvent)) {
                for (atlasSafeEncrypt executeTask : this._suscriptions.get(splitEvent)) {
                    executeTask(splitEvent, executeTask);
                }
            }
        }
    }

    private void executeTask(SplitEvent splitEvent, atlasSafeEncrypt atlassafeencrypt) {
        dynamicEncrypt factory = dynamicDecrypt.factory(splitEvent, atlassafeencrypt, this._resources);
        if (factory != null) {
            factory.execute();
        }
    }
}

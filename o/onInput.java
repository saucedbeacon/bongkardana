package o;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.ThreadMode;

public class onInput {
    private static final onOK DEFAULT_BUILDER = new onOK();
    public static String TAG = "EventBus";
    static volatile onInput defaultInstance;
    private static final Map<Class<?>, List<Class<?>>> eventTypesCache = new HashMap();
    private final AbstractKeyboard asyncPoster;
    private final onDel backgroundPoster;
    private final ThreadLocal<length> currentPostingThreadState;
    private final boolean eventInheritance;
    private final ExecutorService executorService;
    private final int indexCount;
    private final boolean logNoSubscriberMessages;
    private final boolean logSubscriberExceptions;
    private final AliKeyboardType logger;
    private final initializeKeyboard mainThreadPoster;
    private final AlipayKeyboard mainThreadSupport;
    private final boolean sendNoSubscriberEvent;
    private final boolean sendSubscriberExceptionEvent;
    private final Map<Class<?>, Object> stickyEvents;
    private final initializeMoneyKeyboard subscriberMethodFinder;
    private final Map<Class<?>, CopyOnWriteArrayList<initializeNoneKeyboard>> subscriptionsByEventType;
    private final boolean throwSubscriberException;
    private final Map<Object, List<Class<?>>> typesBySubscriber;

    public static onInput getDefault() {
        onInput oninput;
        onInput oninput2 = defaultInstance;
        if (oninput2 != null) {
            return oninput2;
        }
        synchronized (onInput.class) {
            oninput = defaultInstance;
            if (oninput == null) {
                oninput = new onInput();
                defaultInstance = oninput;
            }
        }
        return oninput;
    }

    public static onOK builder() {
        return new onOK();
    }

    public static void clearCaches() {
        initializeMoneyKeyboard.clearCaches();
        eventTypesCache.clear();
    }

    public onInput() {
        this(DEFAULT_BUILDER);
    }

    onInput(onOK onok) {
        this.currentPostingThreadState = new ThreadLocal<length>() {
            /* access modifiers changed from: protected */
            public final length initialValue() {
                return new length();
            }
        };
        this.logger = onok.getLogger();
        this.subscriptionsByEventType = new HashMap();
        this.typesBySubscriber = new HashMap();
        this.stickyEvents = new ConcurrentHashMap();
        AlipayKeyboard mainThreadSupport2 = onok.getMainThreadSupport();
        this.mainThreadSupport = mainThreadSupport2;
        this.mainThreadPoster = mainThreadSupport2 != null ? mainThreadSupport2.createPoster(this) : null;
        this.backgroundPoster = new onDel(this);
        this.asyncPoster = new AbstractKeyboard(this);
        this.indexCount = onok.subscriberInfoIndexes != null ? onok.subscriberInfoIndexes.size() : 0;
        this.subscriberMethodFinder = new initializeMoneyKeyboard(onok.subscriberInfoIndexes, onok.strictMethodVerification, onok.ignoreGeneratedIndex);
        this.logSubscriberExceptions = onok.logSubscriberExceptions;
        this.logNoSubscriberMessages = onok.logNoSubscriberMessages;
        this.sendSubscriberExceptionEvent = onok.sendSubscriberExceptionEvent;
        this.sendNoSubscriberEvent = onok.sendNoSubscriberEvent;
        this.throwSubscriberException = onok.throwSubscriberException;
        this.eventInheritance = onok.eventInheritance;
        this.executorService = onok.executorService;
    }

    public void register(Object obj) {
        List<initializeNumKeyboard> findSubscriberMethods = this.subscriberMethodFinder.findSubscriberMethods(obj.getClass());
        synchronized (this) {
            for (initializeNumKeyboard subscribe : findSubscriberMethods) {
                subscribe(obj, subscribe);
            }
        }
    }

    private void subscribe(Object obj, initializeNumKeyboard initializenumkeyboard) {
        Class<?> cls = initializenumkeyboard.eventType;
        initializeNoneKeyboard initializenonekeyboard = new initializeNoneKeyboard(obj, initializenumkeyboard);
        CopyOnWriteArrayList copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.subscriptionsByEventType.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(initializenonekeyboard)) {
            StringBuilder sb = new StringBuilder("Subscriber ");
            sb.append(obj.getClass());
            sb.append(" already registered to event ");
            sb.append(cls);
            throw new EventBusException(sb.toString());
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || initializenumkeyboard.priority > ((initializeNoneKeyboard) copyOnWriteArrayList.get(i)).subscriberMethod.priority) {
                copyOnWriteArrayList.add(i, initializenonekeyboard);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, initializenonekeyboard);
        List list = this.typesBySubscriber.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.typesBySubscriber.put(obj, list);
        }
        list.add(cls);
        if (!initializenumkeyboard.sticky) {
            return;
        }
        if (this.eventInheritance) {
            for (Map.Entry next : this.stickyEvents.entrySet()) {
                if (cls.isAssignableFrom((Class) next.getKey())) {
                    checkPostStickyEventToSubscription(initializenonekeyboard, next.getValue());
                }
            }
            return;
        }
        checkPostStickyEventToSubscription(initializenonekeyboard, this.stickyEvents.get(cls));
    }

    private void checkPostStickyEventToSubscription(initializeNoneKeyboard initializenonekeyboard, Object obj) {
        if (obj != null) {
            postToSubscription(initializenonekeyboard, obj, isMainThread());
        }
    }

    private boolean isMainThread() {
        AlipayKeyboard alipayKeyboard = this.mainThreadSupport;
        return alipayKeyboard == null || alipayKeyboard.isMainThread();
    }

    public synchronized boolean isRegistered(Object obj) {
        return this.typesBySubscriber.containsKey(obj);
    }

    private void unsubscribeByEventType(Object obj, Class<?> cls) {
        List list = this.subscriptionsByEventType.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                initializeNoneKeyboard initializenonekeyboard = (initializeNoneKeyboard) list.get(i);
                if (initializenonekeyboard.subscriber == obj) {
                    initializenonekeyboard.active = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public synchronized void unregister(Object obj) {
        List<Class> list = this.typesBySubscriber.get(obj);
        if (list != null) {
            for (Class unsubscribeByEventType : list) {
                unsubscribeByEventType(obj, unsubscribeByEventType);
            }
            this.typesBySubscriber.remove(obj);
            return;
        }
        AliKeyboardType aliKeyboardType = this.logger;
        Level level = Level.WARNING;
        StringBuilder sb = new StringBuilder("Subscriber to unregister was not registered before: ");
        sb.append(obj.getClass());
        aliKeyboardType.log(level, sb.toString());
    }

    public void post(Object obj) {
        length length2 = this.currentPostingThreadState.get();
        List<Object> list = length2.eventQueue;
        list.add(obj);
        if (!length2.isPosting) {
            length2.isMainThread = isMainThread();
            length2.isPosting = true;
            if (!length2.canceled) {
                while (!list.isEmpty()) {
                    try {
                        postSingleEvent(list.remove(0), length2);
                    } finally {
                        length2.isPosting = false;
                        length2.isMainThread = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    public void cancelEventDelivery(Object obj) {
        length length2 = this.currentPostingThreadState.get();
        if (!length2.isPosting) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        } else if (obj == null) {
            throw new EventBusException("Event may not be null");
        } else if (length2.event != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        } else if (length2.subscription.subscriberMethod.threadMode == ThreadMode.POSTING) {
            length2.canceled = true;
        } else {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
    }

    public void postSticky(Object obj) {
        synchronized (this.stickyEvents) {
            this.stickyEvents.put(obj.getClass(), obj);
        }
        post(obj);
    }

    public <T> T getStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.stickyEvents) {
            cast = cls.cast(this.stickyEvents.get(cls));
        }
        return cast;
    }

    public <T> T removeStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.stickyEvents) {
            cast = cls.cast(this.stickyEvents.remove(cls));
        }
        return cast;
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.stickyEvents) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.stickyEvents.get(cls))) {
                return false;
            }
            this.stickyEvents.remove(cls);
            return true;
        }
    }

    public void removeAllStickyEvents() {
        synchronized (this.stickyEvents) {
            this.stickyEvents.clear();
        }
    }

    public boolean hasSubscriberForEvent(Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        List<Class<?>> lookupAllEventTypes = lookupAllEventTypes(cls);
        if (lookupAllEventTypes != null) {
            int size = lookupAllEventTypes.size();
            for (int i = 0; i < size; i++) {
                Class cls2 = lookupAllEventTypes.get(i);
                synchronized (this) {
                    copyOnWriteArrayList = this.subscriptionsByEventType.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void postSingleEvent(Object obj, length length2) throws Error {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.eventInheritance) {
            List<Class<?>> lookupAllEventTypes = lookupAllEventTypes(cls);
            int size = lookupAllEventTypes.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= postSingleEventForEventType(obj, length2, lookupAllEventTypes.get(i));
            }
        } else {
            z = postSingleEventForEventType(obj, length2, cls);
        }
        if (!z) {
            if (this.logNoSubscriberMessages) {
                this.logger.log(Level.FINE, "No subscribers registered for event ".concat(String.valueOf(cls)));
            }
            if (this.sendNoSubscriberEvent && cls != getRelatePoint.class && cls != initializeQwertyKeyboard.class) {
                post(new getRelatePoint(this, obj));
            }
        }
    }

    private boolean postSingleEventForEventType(Object obj, length length2, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.subscriptionsByEventType.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            initializeNoneKeyboard initializenonekeyboard = (initializeNoneKeyboard) it.next();
            length2.event = obj;
            length2.subscription = initializenonekeyboard;
            try {
                postToSubscription(initializenonekeyboard, obj, length2.isMainThread);
                if (length2.canceled) {
                    return true;
                }
            } finally {
                length2.event = null;
                length2.subscription = null;
                length2.canceled = false;
            }
        }
        return true;
    }

    /* renamed from: o.onInput$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$greenrobot$eventbus$ThreadMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$greenrobot$eventbus$ThreadMode = r0
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$greenrobot$eventbus$ThreadMode     // Catch:{ NoSuchFieldError -> 0x001d }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$greenrobot$eventbus$ThreadMode     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$greenrobot$eventbus$ThreadMode     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$org$greenrobot$eventbus$ThreadMode     // Catch:{ NoSuchFieldError -> 0x003e }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onInput.AnonymousClass2.<clinit>():void");
        }
    }

    private void postToSubscription(initializeNoneKeyboard initializenonekeyboard, Object obj, boolean z) {
        int i = AnonymousClass2.$SwitchMap$org$greenrobot$eventbus$ThreadMode[initializenonekeyboard.subscriberMethod.threadMode.ordinal()];
        if (i == 1) {
            invokeSubscriber(initializenonekeyboard, obj);
        } else if (i != 2) {
            if (i == 3) {
                initializeKeyboard initializekeyboard = this.mainThreadPoster;
                if (initializekeyboard != null) {
                    initializekeyboard.enqueue(initializenonekeyboard, obj);
                } else {
                    invokeSubscriber(initializenonekeyboard, obj);
                }
            } else if (i != 4) {
                if (i == 5) {
                    this.asyncPoster.enqueue(initializenonekeyboard, obj);
                    return;
                }
                StringBuilder sb = new StringBuilder("Unknown thread mode: ");
                sb.append(initializenonekeyboard.subscriberMethod.threadMode);
                throw new IllegalStateException(sb.toString());
            } else if (z) {
                this.backgroundPoster.enqueue(initializenonekeyboard, obj);
            } else {
                invokeSubscriber(initializenonekeyboard, obj);
            }
        } else if (z) {
            invokeSubscriber(initializenonekeyboard, obj);
        } else {
            this.mainThreadPoster.enqueue(initializenonekeyboard, obj);
        }
    }

    private static List<Class<?>> lookupAllEventTypes(Class<?> cls) {
        List<Class<?>> list;
        synchronized (eventTypesCache) {
            list = eventTypesCache.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    addInterfaces(list, cls2.getInterfaces());
                }
                eventTypesCache.put(cls, list);
            }
        }
        return list;
    }

    static void addInterfaces(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                addInterfaces(list, cls.getInterfaces());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void invokeSubscriber(switchKeyboard switchkeyboard) {
        Object obj = switchkeyboard.event;
        initializeNoneKeyboard initializenonekeyboard = switchkeyboard.subscription;
        switchKeyboard.releasePendingPost(switchkeyboard);
        if (initializenonekeyboard.active) {
            invokeSubscriber(initializenonekeyboard, obj);
        }
    }

    /* access modifiers changed from: package-private */
    public void invokeSubscriber(initializeNoneKeyboard initializenonekeyboard, Object obj) {
        try {
            initializenonekeyboard.subscriberMethod.method.invoke(initializenonekeyboard.subscriber, new Object[]{obj});
        } catch (InvocationTargetException e) {
            handleSubscriberException(initializenonekeyboard, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    private void handleSubscriberException(initializeNoneKeyboard initializenonekeyboard, Object obj, Throwable th) {
        if (obj instanceof initializeQwertyKeyboard) {
            if (this.logSubscriberExceptions) {
                AliKeyboardType aliKeyboardType = this.logger;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder("SubscriberExceptionEvent subscriber ");
                sb.append(initializenonekeyboard.subscriber.getClass());
                sb.append(" threw an exception");
                aliKeyboardType.log(level, sb.toString(), th);
                initializeQwertyKeyboard initializeqwertykeyboard = (initializeQwertyKeyboard) obj;
                AliKeyboardType aliKeyboardType2 = this.logger;
                Level level2 = Level.SEVERE;
                StringBuilder sb2 = new StringBuilder("Initial event ");
                sb2.append(initializeqwertykeyboard.causingEvent);
                sb2.append(" caused exception in ");
                sb2.append(initializeqwertykeyboard.causingSubscriber);
                aliKeyboardType2.log(level2, sb2.toString(), initializeqwertykeyboard.throwable);
            }
        } else if (!this.throwSubscriberException) {
            if (this.logSubscriberExceptions) {
                AliKeyboardType aliKeyboardType3 = this.logger;
                Level level3 = Level.SEVERE;
                StringBuilder sb3 = new StringBuilder("Could not dispatch event: ");
                sb3.append(obj.getClass());
                sb3.append(" to subscribing class ");
                sb3.append(initializenonekeyboard.subscriber.getClass());
                aliKeyboardType3.log(level3, sb3.toString(), th);
            }
            if (this.sendSubscriberExceptionEvent) {
                post(new initializeQwertyKeyboard(this, th, obj, initializenonekeyboard.subscriber));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    static final class length {
        boolean canceled;
        Object event;
        final List<Object> eventQueue = new ArrayList();
        boolean isMainThread;
        boolean isPosting;
        initializeNoneKeyboard subscription;

        length() {
        }
    }

    /* access modifiers changed from: package-private */
    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public AliKeyboardType getLogger() {
        return this.logger;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EventBus[indexCount=");
        sb.append(this.indexCount);
        sb.append(", eventInheritance=");
        sb.append(this.eventInheritance);
        sb.append("]");
        return sb.toString();
    }
}

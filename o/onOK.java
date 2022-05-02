package o;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import o.AliKeyboardType;
import o.AlipayKeyboard;
import org.greenrobot.eventbus.EventBusException;

public class onOK {
    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = Executors.newCachedThreadPool();
    boolean eventInheritance = true;
    ExecutorService executorService = DEFAULT_EXECUTOR_SERVICE;
    boolean ignoreGeneratedIndex;
    boolean logNoSubscriberMessages = true;
    boolean logSubscriberExceptions = true;
    AliKeyboardType logger;
    AlipayKeyboard mainThreadSupport;
    boolean sendNoSubscriberEvent = true;
    boolean sendSubscriberExceptionEvent = true;
    List<Class<?>> skipMethodVerificationForClasses;
    boolean strictMethodVerification;
    List<setStatisticInterface> subscriberInfoIndexes;
    boolean throwSubscriberException;

    onOK() {
    }

    public onOK logSubscriberExceptions(boolean z) {
        this.logSubscriberExceptions = z;
        return this;
    }

    public onOK logNoSubscriberMessages(boolean z) {
        this.logNoSubscriberMessages = z;
        return this;
    }

    public onOK sendSubscriberExceptionEvent(boolean z) {
        this.sendSubscriberExceptionEvent = z;
        return this;
    }

    public onOK sendNoSubscriberEvent(boolean z) {
        this.sendNoSubscriberEvent = z;
        return this;
    }

    public onOK throwSubscriberException(boolean z) {
        this.throwSubscriberException = z;
        return this;
    }

    public onOK eventInheritance(boolean z) {
        this.eventInheritance = z;
        return this;
    }

    public onOK executorService(ExecutorService executorService2) {
        this.executorService = executorService2;
        return this;
    }

    public onOK skipMethodVerificationFor(Class<?> cls) {
        if (this.skipMethodVerificationForClasses == null) {
            this.skipMethodVerificationForClasses = new ArrayList();
        }
        this.skipMethodVerificationForClasses.add(cls);
        return this;
    }

    public onOK ignoreGeneratedIndex(boolean z) {
        this.ignoreGeneratedIndex = z;
        return this;
    }

    public onOK strictMethodVerification(boolean z) {
        this.strictMethodVerification = z;
        return this;
    }

    public onOK addIndex(setStatisticInterface setstatisticinterface) {
        if (this.subscriberInfoIndexes == null) {
            this.subscriberInfoIndexes = new ArrayList();
        }
        this.subscriberInfoIndexes.add(setstatisticinterface);
        return this;
    }

    public onOK logger(AliKeyboardType aliKeyboardType) {
        this.logger = aliKeyboardType;
        return this;
    }

    /* access modifiers changed from: package-private */
    public AliKeyboardType getLogger() {
        AliKeyboardType aliKeyboardType = this.logger;
        if (aliKeyboardType != null) {
            return aliKeyboardType;
        }
        return AliKeyboardType.setMin.get();
    }

    /* access modifiers changed from: package-private */
    public AlipayKeyboard getMainThreadSupport() {
        Object androidMainLooperOrNull;
        AlipayKeyboard alipayKeyboard = this.mainThreadSupport;
        if (alipayKeyboard != null) {
            return alipayKeyboard;
        }
        if (!showKeyboard.isAndroidLogAvailable() || (androidMainLooperOrNull = getAndroidMainLooperOrNull()) == null) {
            return null;
        }
        return new AlipayKeyboard.setMax((Looper) androidMainLooperOrNull);
    }

    static Object getAndroidMainLooperOrNull() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public onInput installDefaultEventBus() {
        onInput build;
        synchronized (onInput.class) {
            if (onInput.defaultInstance == null) {
                build = build();
                onInput.defaultInstance = build;
            } else {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return build;
    }

    public onInput build() {
        return new onInput(this);
    }
}

package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.UnregisterListenerMethod;
import com.google.android.gms.common.api.internal.zabi;
import com.google.android.gms.common.api.internal.zacc;
import com.google.android.gms.common.api.internal.zay;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Set;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@KeepForSdk
public class GoogleApi<O extends Api.ApiOptions> implements HasApiKey<O> {
    private final Context zaa;
    @Nullable
    private final String zab;
    private final Api<O> zac;
    private final O zad;
    private final ApiKey<O> zae;
    private final Looper zaf;
    private final int zag;
    @NotOnlyInitialized
    private final GoogleApiClient zah;
    private final StatusExceptionMapper zai;
    private final GoogleApiManager zaj;

    @KeepForSdk
    public static class Settings {
        @KeepForSdk
        public static final Settings DEFAULT_SETTINGS = new Builder().build();
        public final StatusExceptionMapper zaa;
        public final Looper zab;

        @KeepForSdk
        public static class Builder {
            private StatusExceptionMapper zaa;
            private Looper zab;

            @KeepForSdk
            public Builder setMapper(StatusExceptionMapper statusExceptionMapper) {
                Preconditions.checkNotNull(statusExceptionMapper, "StatusExceptionMapper must not be null.");
                this.zaa = statusExceptionMapper;
                return this;
            }

            @KeepForSdk
            public Builder setLooper(Looper looper) {
                Preconditions.checkNotNull(looper, "Looper must not be null.");
                this.zab = looper;
                return this;
            }

            @KeepForSdk
            public Settings build() {
                if (this.zaa == null) {
                    this.zaa = new ApiExceptionMapper();
                }
                if (this.zab == null) {
                    this.zab = Looper.getMainLooper();
                }
                return new Settings(this.zaa, this.zab);
            }
        }

        @KeepForSdk
        private Settings(StatusExceptionMapper statusExceptionMapper, Account account, Looper looper) {
            this.zaa = statusExceptionMapper;
            this.zab = looper;
        }
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, Api<O> api, O o2, Looper looper, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o2, new Settings.Builder().setLooper(looper).setMapper(statusExceptionMapper).build());
    }

    @MainThread
    @KeepForSdk
    public GoogleApi(@NonNull Activity activity, Api<O> api, O o2, Settings settings) {
        Preconditions.checkNotNull(activity, "Null activity is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zaa = activity.getApplicationContext();
        this.zab = zaa(activity);
        this.zac = api;
        this.zad = o2;
        this.zaf = settings.zab;
        this.zae = ApiKey.getSharedApiKey(this.zac, this.zad);
        this.zah = new zabi(this);
        GoogleApiManager zaa2 = GoogleApiManager.zaa(this.zaa);
        this.zaj = zaa2;
        this.zag = zaa2.zab();
        this.zai = settings.zaa;
        if (!(activity instanceof GoogleApiActivity)) {
            try {
                zay.zaa(activity, this.zaj, this.zae);
            } catch (IllegalStateException | ConcurrentModificationException unused) {
            }
        }
        this.zaj.zaa((GoogleApi<?>) this);
    }

    @KeepForSdk
    public GoogleApi(@NonNull Context context, Api<O> api, O o2, Settings settings) {
        Preconditions.checkNotNull(context, "Null context is not permitted.");
        Preconditions.checkNotNull(api, "Api must not be null.");
        Preconditions.checkNotNull(settings, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zaa = context.getApplicationContext();
        this.zab = zaa(context);
        this.zac = api;
        this.zad = o2;
        this.zaf = settings.zab;
        this.zae = ApiKey.getSharedApiKey(this.zac, this.zad);
        this.zah = new zabi(this);
        GoogleApiManager zaa2 = GoogleApiManager.zaa(this.zaa);
        this.zaj = zaa2;
        this.zag = zaa2.zab();
        this.zai = settings.zaa;
        this.zaj.zaa((GoogleApi<?>) this);
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Activity activity, Api<O> api, O o2, StatusExceptionMapper statusExceptionMapper) {
        this(activity, api, o2, new Settings.Builder().setMapper(statusExceptionMapper).setLooper(activity.getMainLooper()).build());
    }

    @KeepForSdk
    @Deprecated
    public GoogleApi(@NonNull Context context, Api<O> api, O o2, StatusExceptionMapper statusExceptionMapper) {
        this(context, api, o2, new Settings.Builder().setMapper(statusExceptionMapper).build());
    }

    private final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaa(int i, @NonNull T t) {
        t.zab();
        this.zaj.zaa(this, i, t);
        return t;
    }

    private final <TResult, A extends Api.AnyClient> Task<TResult> zaa(int i, @NonNull TaskApiCall<A, TResult> taskApiCall) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2117736443, oncanceled);
            onCancelLoad.getMin(-2117736443, oncanceled);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaj.zaa(this, i, taskApiCall, taskCompletionSource, this.zai);
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doRead(@NonNull T t) {
        return zaa(0, t);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doRead(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(0, taskApiCall);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doWrite(@NonNull T t) {
        return zaa(1, t);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(1, taskApiCall);
    }

    @KeepForSdk
    public <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T doBestEffortWrite(@NonNull T t) {
        return zaa(2, t);
    }

    @KeepForSdk
    public <TResult, A extends Api.AnyClient> Task<TResult> doBestEffortWrite(TaskApiCall<A, TResult> taskApiCall) {
        return zaa(2, taskApiCall);
    }

    @KeepForSdk
    @Deprecated
    public <A extends Api.AnyClient, T extends RegisterListenerMethod<A, ?>, U extends UnregisterListenerMethod<A, ?>> Task<Void> doRegisterEventListener(@NonNull T t, U u) {
        Preconditions.checkNotNull(t);
        Preconditions.checkNotNull(u);
        Preconditions.checkNotNull(t.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(u.getListenerKey(), "Listener has already been released.");
        Preconditions.checkArgument(Objects.equal(t.getListenerKey(), u.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaj.zaa(this, t, u, zac.zaa);
    }

    @KeepForSdk
    public <A extends Api.AnyClient> Task<Void> doRegisterEventListener(@NonNull RegistrationMethods<A, ?> registrationMethods) {
        Preconditions.checkNotNull(registrationMethods);
        Preconditions.checkNotNull(registrationMethods.zaa.getListenerKey(), "Listener has already been released.");
        Preconditions.checkNotNull(registrationMethods.zab.getListenerKey(), "Listener has already been released.");
        return this.zaj.zaa(this, registrationMethods.zaa, registrationMethods.zab, registrationMethods.zac);
    }

    @KeepForSdk
    public Task<Boolean> doUnregisterEventListener(@NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        Preconditions.checkNotNull(listenerKey, "Listener key cannot be null.");
        return this.zaj.zaa(this, listenerKey);
    }

    @KeepForSdk
    public <L> ListenerHolder<L> registerListener(@NonNull L l, String str) {
        return ListenerHolders.createListenerHolder(l, this.zaf, str);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public Task<Boolean> disconnectService() {
        return this.zaj.zab((GoogleApi<?>) this);
    }

    @WorkerThread
    public final Api.Client zaa(Looper looper, GoogleApiManager.zaa<O> zaa2) {
        return ((Api.AbstractClientBuilder) Preconditions.checkNotNull(this.zac.zab())).buildClient(this.zaa, looper, createClientSettingsBuilder().build(), this.zad, (GoogleApiClient.ConnectionCallbacks) zaa2, (GoogleApiClient.OnConnectionFailedListener) zaa2);
    }

    @KeepForSdk
    public O getApiOptions() {
        return this.zad;
    }

    public ApiKey<O> getApiKey() {
        return this.zae;
    }

    public final int zaa() {
        return this.zag;
    }

    @KeepForSdk
    public GoogleApiClient asGoogleApiClient() {
        return this.zah;
    }

    @KeepForSdk
    public Looper getLooper() {
        return this.zaf;
    }

    @KeepForSdk
    public Context getApplicationContext() {
        return this.zaa;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Deprecated
    @Nullable
    public String getContextFeatureId() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    public String getContextAttributionTag() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public ClientSettings.Builder createClientSettingsBuilder() {
        Account account;
        Set<Scope> set;
        GoogleSignInAccount googleSignInAccount;
        GoogleSignInAccount googleSignInAccount2;
        ClientSettings.Builder builder = new ClientSettings.Builder();
        O o2 = this.zad;
        if (!(o2 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount2 = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o2).getGoogleSignInAccount()) == null) {
            O o3 = this.zad;
            account = o3 instanceof Api.ApiOptions.HasAccountOptions ? ((Api.ApiOptions.HasAccountOptions) o3).getAccount() : null;
        } else {
            account = googleSignInAccount2.getAccount();
        }
        ClientSettings.Builder zaa2 = builder.zaa(account);
        O o4 = this.zad;
        if (!(o4 instanceof Api.ApiOptions.HasGoogleSignInAccountOptions) || (googleSignInAccount = ((Api.ApiOptions.HasGoogleSignInAccountOptions) o4).getGoogleSignInAccount()) == null) {
            set = Collections.emptySet();
        } else {
            set = googleSignInAccount.getRequestedScopes();
        }
        return zaa2.zaa((Collection<Scope>) set).zaa(this.zaa.getClass().getName()).setRealClientPackageName(this.zaa.getPackageName());
    }

    @Nullable
    private static String zaa(Object obj) {
        if (!PlatformVersion.isAtLeastR()) {
            return null;
        }
        try {
            return (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public final zacc zaa(Context context, Handler handler) {
        return new zacc(context, handler, createClientSettingsBuilder().build());
    }
}

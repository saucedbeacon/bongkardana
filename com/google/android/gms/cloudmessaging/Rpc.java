package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.GmsRpc;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import o.PlaybackStateCompat;

public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc = zzz.zza;
    @GuardedBy("responseCallbacks")
    private final PlaybackStateCompat.RepeatMode<String, TaskCompletionSource<Bundle>> zzd = new PlaybackStateCompat.RepeatMode<>();
    private final Context zze;
    private final zzr zzf;
    private final ScheduledExecutorService zzg;
    private Messenger zzh;
    private Messenger zzi;
    private zza zzj;

    public Rpc(@NonNull Context context) {
        this.zze = context;
        this.zzf = new zzr(context);
        this.zzh = new Messenger(new zzy(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzg = scheduledThreadPoolExecutor;
    }

    /* access modifiers changed from: private */
    public final void zza(Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new zza.C0074zza());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zza) {
                    this.zzj = (zza) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.zzi = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        intent2.getExtras();
                    } else if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            zza(str, intent2.putExtra("error", str2).getExtras());
                        }
                    } else {
                        synchronized (this.zzd) {
                            for (int i = 0; i < this.zzd.size(); i++) {
                                zza((String) this.zzd.isInside[i << 1], intent2.getExtras());
                            }
                        }
                    }
                } else {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            zza(group, extras);
                        }
                    }
                }
            }
        }
    }

    private static synchronized void zza(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzb = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", zzb);
        }
    }

    private final void zza(String str, @Nullable Bundle bundle) {
        synchronized (this.zzd) {
            TaskCompletionSource remove = this.zzd.remove(str);
            if (remove != null) {
                remove.setResult(bundle);
            }
        }
    }

    @NonNull
    public Task<Bundle> send(@NonNull Bundle bundle) {
        boolean z = true;
        if (this.zzf.zzb() >= 12000000) {
            return zze.zza(this.zze).zzb(1, bundle).continueWith(zzc, zzt.zza);
        }
        if (this.zzf.zza() == 0) {
            z = false;
        }
        if (!z) {
            return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return zzc(bundle).continueWithTask(zzc, new zzv(this, bundle));
    }

    private static boolean zzb(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized String zza() {
        String num;
        synchronized (Rpc.class) {
            int i = zza;
            zza = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    @AnyThread
    private final Task<Bundle> zzc(Bundle bundle) {
        String zza2 = zza();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.zzd) {
            this.zzd.put(zza2, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zzf.zza() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        zza(this.zze, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 5);
        sb.append("|ID|");
        sb.append(zza2);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            intent.getExtras();
        }
        intent.putExtra("google.messenger", this.zzh);
        if (!(this.zzi == null && this.zzj == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                if (this.zzi != null) {
                    this.zzi.send(obtain);
                } else {
                    this.zzj.zza(obtain);
                }
            } catch (RemoteException unused) {
            }
            taskCompletionSource.getTask().addOnCompleteListener(zzc, new zzx(this, zza2, this.zzg.schedule(new zzu(taskCompletionSource), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.zzf.zza() == 2) {
            this.zze.sendBroadcast(intent);
        } else {
            this.zze.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new zzx(this, zza2, this.zzg.schedule(new zzu(taskCompletionSource), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.zzd) {
            this.zzd.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task zza(Bundle bundle, Task task) throws Exception {
        if (task.isSuccessful() && zzb((Bundle) task.getResult())) {
            return zzc(bundle).onSuccessTask(zzc, zzw.zza);
        }
        return task;
    }

    static final /* synthetic */ Task zza(Bundle bundle) throws Exception {
        if (zzb(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    static final /* synthetic */ Bundle zza(Task task) throws Exception {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            task.getException();
        }
        throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, task.getException());
    }
}

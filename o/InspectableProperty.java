package o;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class InspectableProperty {

    static class setMax {
        private static boolean getMax;
        private static Method length;
        private static boolean setMax;
        private static Method setMin;

        public static IBinder getMax(Bundle bundle, String str) {
            if (!getMax) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    setMin = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                getMax = true;
            }
            Method method2 = setMin;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    setMin = null;
                }
            }
            return null;
        }

        public static void getMin(Bundle bundle, String str, IBinder iBinder) {
            if (!setMax) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    length = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                setMax = true;
            }
            Method method2 = length;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
                    length = null;
                }
            }
        }
    }

    public final class EnumEntry implements Iterable<Intent> {
        public final Context length;
        public final ArrayList<Intent> setMax = new ArrayList<>();

        public interface setMin {
            @Nullable
            Intent getSupportParentActivityIntent();
        }

        private EnumEntry(Context context) {
            this.length = context;
        }

        @NonNull
        public static EnumEntry setMax(@NonNull Context context) {
            return new EnumEntry(context);
        }

        public final EnumEntry length(ComponentName componentName) {
            int size = this.setMax.size();
            try {
                Intent max = valueType.getMax(this.length, componentName);
                while (max != null) {
                    this.setMax.add(size, max);
                    max = valueType.getMax(this.length, max.getComponent());
                }
                return this;
            } catch (PackageManager.NameNotFoundException e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Deprecated
        public final Iterator<Intent> iterator() {
            return this.setMax.iterator();
        }
    }

    @Nullable
    public static IBinder setMin(@NonNull Bundle bundle, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return setMax.getMax(bundle, str);
    }

    public static void setMax(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            setMax.getMin(bundle, str, iBinder);
        }
    }

    public final class ValueType {
        @GuardedBy("sEnabledNotificationListenersLock")
        private static String getMin;
        @GuardedBy("sEnabledNotificationListenersLock")
        private static Set<String> length = new HashSet();
        private static final Object setMin = new Object();
        private static final Object toFloatRange = new Object();
        @GuardedBy("sLock")
        private static setMax toIntRange;
        private final Context getMax;
        private final NotificationManager setMax;

        interface getMin {
            void length(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
        }

        @NonNull
        public static ValueType getMin(@NonNull Context context) {
            return new ValueType(context);
        }

        private ValueType(Context context) {
            this.getMax = context;
            this.setMax = (NotificationManager) context.getSystemService("notification");
        }

        public final void setMin(int i) {
            setMax((String) null, i);
        }

        public final void setMax(@Nullable String str, int i) {
            this.setMax.cancel(str, i);
            if (Build.VERSION.SDK_INT <= 19) {
                setMin((getMin) new getMax(this.getMax.getPackageName(), i, str));
            }
        }

        public final void setMax(int i, @NonNull Notification notification) {
            length((String) null, i, notification);
        }

        public final void length(@Nullable String str, int i, @NonNull Notification notification) {
            if (getMin(notification)) {
                setMin((getMin) new setMin(this.getMax.getPackageName(), i, str, notification));
                this.setMax.cancel(str, i);
                return;
            }
            this.setMax.notify(str, i, notification);
        }

        public final boolean length() {
            if (Build.VERSION.SDK_INT >= 24) {
                return this.setMax.areNotificationsEnabled();
            }
            if (Build.VERSION.SDK_INT >= 19) {
                AppOpsManager appOpsManager = (AppOpsManager) this.getMax.getSystemService("appops");
                ApplicationInfo applicationInfo = this.getMax.getApplicationInfo();
                String packageName = this.getMax.getApplicationContext().getPackageName();
                int i = applicationInfo.uid;
                try {
                    Class<?> cls = Class.forName(AppOpsManager.class.getName());
                    if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                        return true;
                    }
                    return false;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                }
            }
            return true;
        }

        public final void getMin(@NonNull NotificationChannel notificationChannel) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.setMax.createNotificationChannel(notificationChannel);
            }
        }

        @NonNull
        public static Set<String> getMax(@NonNull Context context) {
            Set<String> set;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (setMin) {
                if (string != null) {
                    if (!string.equals(getMin)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        length = hashSet;
                        getMin = string;
                    }
                }
                set = length;
            }
            return set;
        }

        private static boolean getMin(Notification notification) {
            Bundle length2 = NotificationCompat.length(notification);
            return length2 != null && length2.getBoolean("android.support.useSideChannel");
        }

        private void setMin(getMin getmin) {
            synchronized (toFloatRange) {
                if (toIntRange == null) {
                    toIntRange = new setMax(this.getMax.getApplicationContext());
                }
                toIntRange.setMax(getmin);
            }
        }

        static class setMax implements Handler.Callback, ServiceConnection {
            private final HandlerThread getMax;
            private final Handler getMin;
            private Set<String> length = new HashSet();
            private final Context setMax;
            private final Map<ComponentName, length> setMin = new HashMap();

            setMax(Context context) {
                this.setMax = context;
                HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
                this.getMax = handlerThread;
                handlerThread.start();
                this.getMin = new Handler(this.getMax.getLooper(), this);
            }

            public void setMax(getMin getmin) {
                this.getMin.obtainMessage(0, getmin).sendToTarget();
            }

            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    getMin((getMin) message.obj);
                    return true;
                } else if (i == 1) {
                    length length2 = (length) message.obj;
                    length(length2.getMax, length2.setMin);
                    return true;
                } else if (i == 2) {
                    length((ComponentName) message.obj);
                    return true;
                } else if (i != 3) {
                    return false;
                } else {
                    getMin((ComponentName) message.obj);
                    return true;
                }
            }

            private void getMin(getMin getmin) {
                getMin();
                for (length next : this.setMin.values()) {
                    next.setMin.add(getmin);
                    getMax(next);
                }
            }

            private void length(ComponentName componentName, IBinder iBinder) {
                length length2 = this.setMin.get(componentName);
                if (length2 != null) {
                    length2.getMin = INotificationSideChannel.Stub.asInterface(iBinder);
                    length2.length = 0;
                    getMax(length2);
                }
            }

            private void length(ComponentName componentName) {
                length length2 = this.setMin.get(componentName);
                if (length2 != null) {
                    length(length2);
                }
            }

            private void getMin(ComponentName componentName) {
                length length2 = this.setMin.get(componentName);
                if (length2 != null) {
                    getMax(length2);
                }
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                this.getMin.obtainMessage(1, new length(componentName, iBinder)).sendToTarget();
            }

            public void onServiceDisconnected(ComponentName componentName) {
                this.getMin.obtainMessage(2, componentName).sendToTarget();
            }

            private void getMin() {
                Set<String> max = ValueType.getMax(this.setMax);
                if (!max.equals(this.length)) {
                    this.length = max;
                    List<ResolveInfo> queryIntentServices = this.setMax.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet<ComponentName> hashSet = new HashSet<>();
                    for (ResolveInfo next : queryIntentServices) {
                        if (max.contains(next.serviceInfo.packageName)) {
                            ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                            if (next.serviceInfo.permission == null) {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    for (ComponentName componentName2 : hashSet) {
                        if (!this.setMin.containsKey(componentName2)) {
                            this.setMin.put(componentName2, new length(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, length>> it = this.setMin.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry next2 = it.next();
                        if (!hashSet.contains(next2.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                next2.getKey();
                            }
                            length((length) next2.getValue());
                            it.remove();
                        }
                    }
                }
            }

            private boolean setMax(length length2) {
                if (length2.getMax) {
                    return true;
                }
                length2.getMax = this.setMax.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(length2.setMax), this, 33);
                if (length2.getMax) {
                    length2.length = 0;
                } else {
                    this.setMax.unbindService(this);
                }
                return length2.getMax;
            }

            private void length(length length2) {
                if (length2.getMax) {
                    this.setMax.unbindService(this);
                    length2.getMax = false;
                }
                length2.getMin = null;
            }

            private void getMin(length length2) {
                if (!this.getMin.hasMessages(3, length2.setMax)) {
                    length2.length++;
                    if (length2.length > 6) {
                        length2.setMin.size();
                        length2.setMin.clear();
                        return;
                    }
                    this.getMin.sendMessageDelayed(this.getMin.obtainMessage(3, length2.setMax), (long) ((1 << (length2.length - 1)) * 1000));
                }
            }

            private void getMax(length length2) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    length2.setMin.size();
                }
                if (!length2.setMin.isEmpty()) {
                    if (!setMax(length2) || length2.getMin == null) {
                        getMin(length2);
                        return;
                    }
                    while (true) {
                        getMin peek = length2.setMin.peek();
                        if (peek == null) {
                            break;
                        }
                        try {
                            peek.length(length2.getMin);
                            length2.setMin.remove();
                        } catch (DeadObjectException | RemoteException unused) {
                        }
                    }
                    if (!length2.setMin.isEmpty()) {
                        getMin(length2);
                    }
                }
            }

            static class length {
                boolean getMax = false;
                INotificationSideChannel getMin;
                int length = 0;
                final ComponentName setMax;
                ArrayDeque<getMin> setMin = new ArrayDeque<>();

                length(ComponentName componentName) {
                    this.setMax = componentName;
                }
            }
        }

        static class length {
            final ComponentName getMax;
            final IBinder setMin;

            length(ComponentName componentName, IBinder iBinder) {
                this.getMax = componentName;
                this.setMin = iBinder;
            }
        }

        static class setMin implements getMin {
            final Notification getMax;
            final String getMin;
            final int setMax;
            final String setMin;

            setMin(String str, int i, String str2, Notification notification) {
                this.getMin = str;
                this.setMax = i;
                this.setMin = str2;
                this.getMax = notification;
            }

            public void length(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
                iNotificationSideChannel.notify(this.getMin, this.setMax, this.setMin, this.getMax);
            }

            @NonNull
            public String toString() {
                StringBuilder sb = new StringBuilder("NotifyTask[");
                sb.append("packageName:");
                sb.append(this.getMin);
                sb.append(", id:");
                sb.append(this.setMax);
                sb.append(", tag:");
                sb.append(this.setMin);
                sb.append("]");
                return sb.toString();
            }
        }

        static class getMax implements getMin {
            final String getMax;
            final String getMin;
            final int length;
            final boolean setMax = false;

            getMax(String str, int i, String str2) {
                this.getMax = str;
                this.length = i;
                this.getMin = str2;
            }

            public void length(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
                if (this.setMax) {
                    iNotificationSideChannel.cancelAll(this.getMax);
                } else {
                    iNotificationSideChannel.cancel(this.getMax, this.length, this.getMin);
                }
            }

            @NonNull
            public String toString() {
                StringBuilder sb = new StringBuilder("CancelTask[");
                sb.append("packageName:");
                sb.append(this.getMax);
                sb.append(", id:");
                sb.append(this.length);
                sb.append(", tag:");
                sb.append(this.getMin);
                sb.append(", all:");
                sb.append(this.setMax);
                sb.append("]");
                return sb.toString();
            }
        }
    }

    public final class FlagEntry {
        public boolean IsOverlapping;
        @Nullable
        public CharSequence getMax;
        @Nullable
        IconCompat getMin;
        @Nullable
        public String length;
        public boolean setMax;
        @Nullable
        public String setMin;

        @RequiresApi(28)
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final Person setMax() {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(this.getMax);
            IconCompat iconCompat = this.getMin;
            if (iconCompat != null) {
                icon = iconCompat.isInside();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(this.setMin).setKey(this.length).setBot(getMin()).setImportant(getMax()).build();
        }

        private boolean getMin() {
            return this.setMax;
        }

        private boolean getMax() {
            return this.IsOverlapping;
        }
    }
}

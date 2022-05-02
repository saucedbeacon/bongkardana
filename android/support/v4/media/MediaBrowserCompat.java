package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.MediaBrowserServiceCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.InspectableProperty;
import o.PlaybackStateCompat;
import o.extraCommand;
import o.newSession;
import o.savePresenterStates;
import o.warmup;

public final class MediaBrowserCompat {
    static final boolean getMin = Log.isLoggable("MediaBrowserCompat", 3);
    private final length setMax;

    public static abstract class getMin {
        public void getMin(String str, Bundle bundle, Bundle bundle2) {
        }

        public void length(String str, Bundle bundle, Bundle bundle2) {
        }

        public void setMax(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    public static abstract class hashCode {
        public void getMax(@NonNull String str, Bundle bundle) {
        }

        public void getMin(@NonNull String str, Bundle bundle, @NonNull List<MediaItem> list) {
        }
    }

    interface length {
        @NonNull
        MediaSessionCompat.Token IsOverlapping();

        void getMax();

        void getMin();
    }

    interface toFloatRange {
        void getMax(Messenger messenger);

        void getMin(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void length(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, getMax getmax, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.setMax = new isInside(context, componentName, getmax, bundle);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.setMax = new IsOverlapping(context, componentName, getmax, bundle);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.setMax = new toIntRange(context, componentName, getmax, bundle);
        } else {
            this.setMax = new equals(context, componentName, getmax, bundle);
        }
    }

    public final void getMax() {
        this.setMax.getMax();
    }

    public final void getMin() {
        this.setMax.getMin();
    }

    @NonNull
    public final MediaSessionCompat.Token setMax() {
        return this.setMax.IsOverlapping();
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() {
            /* renamed from: length */
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: length */
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final MediaDescriptionCompat length;
        private final int setMax;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface Flags {
        }

        public int describeContents() {
            return 0;
        }

        public static MediaItem setMin(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.getMax(warmup.setMin.setMax(obj)), warmup.setMin.getMax(obj));
        }

        public static List<MediaItem> getMax(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object min : list) {
                arrayList.add(setMin(min));
            }
            return arrayList;
        }

        public MediaItem(@NonNull MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.setMin())) {
                this.setMax = i;
                this.length = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        MediaItem(Parcel parcel) {
            this.setMax = parcel.readInt();
            this.length = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.setMax);
            this.length.writeToParcel(parcel, i);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.setMax);
            sb.append(", mDescription=");
            sb.append(this.length);
            sb.append('}');
            return sb.toString();
        }
    }

    public static class getMax {
        final Object getMin;
        setMax setMin;

        interface setMax {
            void length();

            void setMax();

            void setMin();
        }

        public void getMax() {
        }

        public void length() {
        }

        public void setMin() {
        }

        public getMax() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.getMin = warmup.getMin((warmup.length) new length());
            } else {
                this.getMin = null;
            }
        }

        /* access modifiers changed from: package-private */
        public void setMin(setMax setmax) {
            this.setMin = setmax;
        }

        class length implements warmup.length {
            length() {
            }

            public void getMin() {
                if (getMax.this.setMin != null) {
                    getMax.this.setMin.setMin();
                }
                getMax.this.setMin();
            }

            public void length() {
                if (getMax.this.setMin != null) {
                    getMax.this.setMin.setMax();
                }
                getMax.this.length();
            }

            public void setMin() {
                if (getMax.this.setMin != null) {
                    getMax.this.setMin.length();
                }
                getMax.this.getMax();
            }
        }
    }

    public static abstract class values {
        final Object getMax;
        final IBinder length = new Binder();
        WeakReference<toString> setMin;

        public void getMax(@NonNull String str, @NonNull Bundle bundle) {
        }

        public void getMin(@NonNull String str) {
        }

        public void length(@NonNull String str, @NonNull List<MediaItem> list, @NonNull Bundle bundle) {
        }

        public void setMax(@NonNull String str, @NonNull List<MediaItem> list) {
        }

        public values() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.getMax = newSession.getMin(new setMin());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.getMax = warmup.getMax((warmup.setMax) new setMax());
            } else {
                this.getMax = null;
            }
        }

        class setMax implements warmup.setMax {
            setMax() {
            }

            public void setMin(@NonNull String str, List<?> list) {
                toString tostring = values.this.setMin == null ? null : values.this.setMin.get();
                if (tostring == null) {
                    values.this.setMax(str, MediaItem.getMax(list));
                    return;
                }
                List<MediaItem> max = MediaItem.getMax(list);
                List<values> max2 = tostring.setMax();
                List<Bundle> length = tostring.length();
                for (int i = 0; i < max2.size(); i++) {
                    Bundle bundle = length.get(i);
                    if (bundle == null) {
                        values.this.setMax(str, max);
                    } else {
                        values.this.length(str, getMin(max, bundle), bundle);
                    }
                }
            }

            public void length(@NonNull String str) {
                values.this.getMin(str);
            }

            /* access modifiers changed from: package-private */
            public List<MediaItem> getMin(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 <= 0 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }
        }

        class setMin extends setMax implements newSession.length {
            setMin() {
                super();
            }

            public void setMin(@NonNull String str, List<?> list, @NonNull Bundle bundle) {
                values.this.length(str, MediaItem.getMax(list), bundle);
            }

            public void setMax(@NonNull String str, @NonNull Bundle bundle) {
                values.this.getMax(str, bundle);
            }
        }
    }

    public static abstract class setMax {
        final Object setMax;

        public void getMax(@NonNull String str) {
        }

        public void setMax(MediaItem mediaItem) {
        }

        public setMax() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.setMax = extraCommand.getMax(new setMin());
            } else {
                this.setMax = null;
            }
        }

        class setMin implements extraCommand.length {
            setMin() {
            }

            public void setMin(Parcel parcel) {
                if (parcel == null) {
                    setMax.this.setMax((MediaItem) null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                setMax.this.setMax(MediaItem.CREATOR.createFromParcel(parcel));
            }

            public void getMax(@NonNull String str) {
                setMax.this.getMax(str);
            }
        }
    }

    static class equals implements length, toFloatRange {
        private Bundle FastBitmap$CoordinateSystem;
        int IsOverlapping = 1;
        Messenger equals;
        final getMax getMax;
        final Bundle getMin;
        private Bundle hashCode;
        toDoubleRange isInside;
        final Context length;
        final setMin setMax = new setMin(this);
        final ComponentName setMin;
        private String toDoubleRange;
        setMin toFloatRange;
        private final PlaybackStateCompat<String, toString> toIntRange = new PlaybackStateCompat<>();
        private MediaSessionCompat.Token toString;

        public equals(Context context, ComponentName componentName, getMax getmax, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (getmax != null) {
                this.length = context;
                this.setMin = componentName;
                this.getMax = getmax;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.getMin = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        public void getMax() {
            int i = this.IsOverlapping;
            if (i == 0 || i == 1) {
                this.IsOverlapping = 2;
                this.setMax.post(new Runnable() {
                    public void run() {
                        if (equals.this.IsOverlapping != 0) {
                            equals.this.IsOverlapping = 2;
                            if (MediaBrowserCompat.getMin && equals.this.toFloatRange != null) {
                                StringBuilder sb = new StringBuilder("mServiceConnection should be null. Instead it is ");
                                sb.append(equals.this.toFloatRange);
                                throw new RuntimeException(sb.toString());
                            } else if (equals.this.isInside != null) {
                                StringBuilder sb2 = new StringBuilder("mServiceBinderWrapper should be null. Instead it is ");
                                sb2.append(equals.this.isInside);
                                throw new RuntimeException(sb2.toString());
                            } else if (equals.this.equals == null) {
                                Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
                                intent.setComponent(equals.this.setMin);
                                equals equals = equals.this;
                                equals.toFloatRange = new setMin();
                                boolean z = false;
                                try {
                                    z = equals.this.length.bindService(intent, equals.this.toFloatRange, 1);
                                } catch (Exception unused) {
                                }
                                if (!z) {
                                    equals.this.length();
                                    equals.this.getMax.getMax();
                                }
                                if (MediaBrowserCompat.getMin) {
                                    equals.this.setMax();
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder("mCallbacksMessenger should be null. Instead it is ");
                                sb3.append(equals.this.equals);
                                throw new RuntimeException(sb3.toString());
                            }
                        }
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("connect() called while neigther disconnecting nor disconnected (state=");
            sb.append(length(this.IsOverlapping));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        public void getMin() {
            this.IsOverlapping = 0;
            this.setMax.post(new Runnable() {
                public void run() {
                    if (equals.this.equals != null) {
                        try {
                            equals.this.isInside.getMax(equals.this.equals);
                        } catch (RemoteException unused) {
                        }
                    }
                    int i = equals.this.IsOverlapping;
                    equals.this.length();
                    if (i != 0) {
                        equals.this.IsOverlapping = i;
                    }
                    if (MediaBrowserCompat.getMin) {
                        equals.this.setMax();
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void length() {
            setMin setmin = this.toFloatRange;
            if (setmin != null) {
                this.length.unbindService(setmin);
            }
            this.IsOverlapping = 1;
            this.toFloatRange = null;
            this.isInside = null;
            this.equals = null;
            this.setMax.getMax((Messenger) null);
            this.toDoubleRange = null;
            this.toString = null;
        }

        public boolean setMin() {
            return this.IsOverlapping == 3;
        }

        @NonNull
        public MediaSessionCompat.Token IsOverlapping() {
            if (setMin()) {
                return this.toString;
            }
            StringBuilder sb = new StringBuilder("getSessionToken() called while not connected(state=");
            sb.append(this.IsOverlapping);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        public void length(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (setMax(messenger, "onConnect")) {
                int i = this.IsOverlapping;
                if (i != 2) {
                    length(i);
                    return;
                }
                this.toDoubleRange = str;
                this.toString = token;
                this.hashCode = bundle;
                this.IsOverlapping = 3;
                if (MediaBrowserCompat.getMin) {
                    setMax();
                }
                this.getMax.setMin();
                try {
                    for (Map.Entry next : this.toIntRange.entrySet()) {
                        String str2 = (String) next.getKey();
                        toString tostring = (toString) next.getValue();
                        List<values> max = tostring.setMax();
                        List<Bundle> length2 = tostring.length();
                        for (int i2 = 0; i2 < max.size(); i2++) {
                            this.isInside.setMin(str2, max.get(i2).length, length2.get(i2), this.equals);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        public void getMax(Messenger messenger) {
            if (setMax(messenger, "onConnectFailed")) {
                int i = this.IsOverlapping;
                if (i != 2) {
                    length(i);
                    return;
                }
                length();
                this.getMax.getMax();
            }
        }

        public void getMin(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            toString tostring;
            values length2;
            if (setMax(messenger, "onLoadChildren") && (tostring = this.toIntRange.get(str)) != null && (length2 = tostring.length(bundle)) != null) {
                if (bundle == null) {
                    if (list == null) {
                        length2.getMin(str);
                        return;
                    }
                    this.FastBitmap$CoordinateSystem = bundle2;
                    length2.setMax(str, list);
                    this.FastBitmap$CoordinateSystem = null;
                } else if (list == null) {
                    length2.getMax(str, bundle);
                } else {
                    this.FastBitmap$CoordinateSystem = bundle2;
                    length2.length(str, list, bundle);
                    this.FastBitmap$CoordinateSystem = null;
                }
            }
        }

        private static String length(int i) {
            if (i == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i != 3) {
                return i != 4 ? "UNKNOWN/".concat(String.valueOf(i)) : "CONNECT_STATE_SUSPENDED";
            }
            return "CONNECT_STATE_CONNECTED";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r1 = r0.IsOverlapping;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean setMax(android.os.Messenger r1, java.lang.String r2) {
            /*
                r0 = this;
                android.os.Messenger r2 = r0.equals
                if (r2 != r1) goto L_0x000d
                int r1 = r0.IsOverlapping
                if (r1 == 0) goto L_0x000d
                r2 = 1
                if (r1 != r2) goto L_0x000c
                goto L_0x000d
            L_0x000c:
                return r2
            L_0x000d:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.equals.setMax(android.os.Messenger, java.lang.String):boolean");
        }

        /* access modifiers changed from: package-private */
        public void setMax() {
            length(this.IsOverlapping);
        }

        class setMin implements ServiceConnection {
            setMin() {
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                setMax((Runnable) new Runnable() {
                    public void run() {
                        if (MediaBrowserCompat.getMin) {
                            equals.this.setMax();
                        }
                        if (setMin.this.setMax("onServiceConnected")) {
                            equals.this.isInside = new toDoubleRange(iBinder, equals.this.getMin);
                            equals.this.equals = new Messenger(equals.this.setMax);
                            equals.this.setMax.getMax(equals.this.equals);
                            equals.this.IsOverlapping = 2;
                            try {
                                if (MediaBrowserCompat.getMin) {
                                    equals.this.setMax();
                                }
                                equals.this.isInside.getMax(equals.this.length, equals.this.equals);
                            } catch (RemoteException unused) {
                                if (MediaBrowserCompat.getMin) {
                                    equals.this.setMax();
                                }
                            }
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                setMax((Runnable) new Runnable() {
                    public void run() {
                        if (MediaBrowserCompat.getMin) {
                            equals.this.setMax();
                        }
                        if (setMin.this.setMax("onServiceDisconnected")) {
                            equals.this.isInside = null;
                            equals.this.equals = null;
                            equals.this.setMax.getMax((Messenger) null);
                            equals.this.IsOverlapping = 4;
                            equals.this.getMax.length();
                        }
                    }
                });
            }

            private void setMax(Runnable runnable) {
                if (Thread.currentThread() == equals.this.setMax.getLooper().getThread()) {
                    runnable.run();
                } else {
                    equals.this.setMax.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            public boolean setMax(String str) {
                return (equals.this.toFloatRange != this || equals.this.IsOverlapping == 0 || equals.this.IsOverlapping == 1) ? false : true;
            }
        }
    }

    @RequiresApi(21)
    static class toIntRange implements length, toFloatRange, getMax.setMax {
        protected Messenger IsOverlapping;
        private MediaSessionCompat.Token equals;
        final Context getMax;
        protected final Bundle getMin;
        protected toDoubleRange isInside;
        protected final Object length;
        protected int setMax;
        protected final setMin setMin = new setMin(this);
        private Bundle toFloatRange;
        private final PlaybackStateCompat<String, toString> toIntRange = new PlaybackStateCompat<>();

        public void getMax(Messenger messenger) {
        }

        public void length() {
        }

        public void length(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        toIntRange(Context context, ComponentName componentName, getMax getmax, Bundle bundle) {
            Bundle bundle2;
            this.getMax = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.getMin = bundle2;
            bundle2.putInt("extra_client_version", 1);
            getmax.setMin(this);
            this.length = warmup.getMin(context, componentName, getmax.getMin, this.getMin);
        }

        public void getMax() {
            warmup.getMin(this.length);
        }

        public void getMin() {
            Messenger messenger;
            toDoubleRange todoublerange = this.isInside;
            if (!(todoublerange == null || (messenger = this.IsOverlapping) == null)) {
                try {
                    todoublerange.setMin(messenger);
                } catch (RemoteException unused) {
                }
            }
            warmup.setMin(this.length);
        }

        @NonNull
        public MediaSessionCompat.Token IsOverlapping() {
            if (this.equals == null) {
                this.equals = MediaSessionCompat.Token.setMin(warmup.getMax(this.length));
            }
            return this.equals;
        }

        public void setMin() {
            Bundle length2 = warmup.length(this.length);
            if (length2 != null) {
                this.setMax = length2.getInt("extra_service_version", 0);
                IBinder min = InspectableProperty.setMin(length2, "extra_messenger");
                if (min != null) {
                    this.isInside = new toDoubleRange(min, this.getMin);
                    Messenger messenger = new Messenger(this.setMin);
                    this.IsOverlapping = messenger;
                    this.setMin.getMax(messenger);
                    try {
                        this.isInside.getMin(this.getMax, this.IsOverlapping);
                    } catch (RemoteException unused) {
                    }
                }
                IMediaSession asInterface = IMediaSession.Stub.asInterface(InspectableProperty.setMin(length2, "extra_session_binder"));
                if (asInterface != null) {
                    this.equals = MediaSessionCompat.Token.setMin(warmup.getMax(this.length), asInterface);
                }
            }
        }

        public void setMax() {
            this.isInside = null;
            this.IsOverlapping = null;
            this.equals = null;
            this.setMin.getMax((Messenger) null);
        }

        public void getMin(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            toString tostring;
            values length2;
            if (this.IsOverlapping == messenger && (tostring = this.toIntRange.get(str)) != null && (length2 = tostring.length(bundle)) != null) {
                if (bundle == null) {
                    if (list == null) {
                        length2.getMin(str);
                        return;
                    }
                    this.toFloatRange = bundle2;
                    length2.setMax(str, list);
                    this.toFloatRange = null;
                } else if (list == null) {
                    length2.getMax(str, bundle);
                } else {
                    this.toFloatRange = bundle2;
                    length2.length(str, list, bundle);
                    this.toFloatRange = null;
                }
            }
        }
    }

    @RequiresApi(23)
    static class IsOverlapping extends toIntRange {
        IsOverlapping(Context context, ComponentName componentName, getMax getmax, Bundle bundle) {
            super(context, componentName, getmax, bundle);
        }
    }

    @RequiresApi(26)
    static class isInside extends IsOverlapping {
        isInside(Context context, ComponentName componentName, getMax getmax, Bundle bundle) {
            super(context, componentName, getmax, bundle);
        }
    }

    static class toString {
        private final List<Bundle> getMax = new ArrayList();
        private final List<values> setMin = new ArrayList();

        public List<Bundle> length() {
            return this.getMax;
        }

        public List<values> setMax() {
            return this.setMin;
        }

        public values length(Bundle bundle) {
            for (int i = 0; i < this.getMax.size(); i++) {
                if (savePresenterStates.setMin(this.getMax.get(i), bundle)) {
                    return this.setMin.get(i);
                }
            }
            return null;
        }
    }

    static class setMin extends Handler {
        private WeakReference<Messenger> getMax;
        private final WeakReference<toFloatRange> length;

        setMin(toFloatRange tofloatrange) {
            this.length = new WeakReference<>(tofloatrange);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.getMax;
            if (weakReference != null && weakReference.get() != null && this.length.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.setMax(data);
                toFloatRange tofloatrange = this.length.get();
                Messenger messenger = this.getMax.get();
                try {
                    int i = message.what;
                    if (i == 1) {
                        Bundle bundle = data.getBundle("data_root_hints");
                        MediaSessionCompat.setMax(bundle);
                        tofloatrange.length(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                    } else if (i == 2) {
                        tofloatrange.getMax(messenger);
                    } else if (i != 3) {
                        int i2 = message.arg1;
                    } else {
                        Bundle bundle2 = data.getBundle("data_options");
                        MediaSessionCompat.setMax(bundle2);
                        Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                        MediaSessionCompat.setMax(bundle3);
                        tofloatrange.getMin(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        tofloatrange.getMax(messenger);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void getMax(Messenger messenger) {
            this.getMax = new WeakReference<>(messenger);
        }
    }

    static class toDoubleRange {
        private Messenger setMax;
        private Bundle setMin;

        public toDoubleRange(IBinder iBinder, Bundle bundle) {
            this.setMax = new Messenger(iBinder);
            this.setMin = bundle;
        }

        /* access modifiers changed from: package-private */
        public void getMax(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.setMin);
            getMax(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void getMax(Messenger messenger) throws RemoteException {
            getMax(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        public void setMin(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            InspectableProperty.setMax(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            getMax(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        public void getMin(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.setMin);
            getMax(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        public void setMin(Messenger messenger) throws RemoteException {
            getMax(7, (Bundle) null, messenger);
        }

        private void getMax(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.setMax.send(obtain);
        }
    }

    static class ItemReceiver extends ResultReceiver {
        private final setMax length;
        private final String setMin;

        public void setMin(int i, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
                this.length.getMax(this.setMin);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.length.setMax((MediaItem) parcelable);
            } else {
                this.length.getMax(this.setMin);
            }
        }
    }

    static class SearchResultReceiver extends ResultReceiver {
        private final String length;
        private final Bundle setMin;
        private final hashCode toFloatRange;

        public void setMin(int i, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
                this.toFloatRange.getMax(this.length, this.setMin);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.toFloatRange.getMin(this.length, this.setMin, arrayList);
        }
    }

    static class CustomActionResultReceiver extends ResultReceiver {
        private final getMin isInside;
        private final String length;
        private final Bundle setMin;

        public void setMin(int i, Bundle bundle) {
            if (this.isInside != null) {
                MediaSessionCompat.setMax(bundle);
                if (i == -1) {
                    this.isInside.setMax(this.length, this.setMin, bundle);
                } else if (i == 0) {
                    this.isInside.getMin(this.length, this.setMin, bundle);
                } else if (i == 1) {
                    this.isInside.length(this.length, this.setMin, bundle);
                }
            }
        }
    }
}

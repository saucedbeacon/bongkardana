package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
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
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o.InspectableProperty;
import o.PlaybackStateCompat;
import o.addInternal;
import o.createNewMenuItem;
import o.getActionViewStatesKey;
import o.savePresenterStates;
import o.setCallback;
import o.setNegativeButton;

public abstract class MediaBrowserServiceCompat extends Service {
    static final boolean DEBUG = Log.isLoggable(TAG, 3);
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_MEDIA_ITEM = "media_item";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String KEY_SEARCH_RESULTS = "search_results";
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_OK = 0;
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    static final String TAG = "MBServiceCompat";
    private setMax getMax;
    final PlaybackStateCompat<IBinder, getMax> mConnections = new PlaybackStateCompat<>();
    getMax mCurConnection;
    final hashCode mHandler = new hashCode();
    MediaSessionCompat.Token mSession;

    interface setMax {
        getActionViewStatesKey.length getMax();

        void getMin(MediaSessionCompat.Token token);

        IBinder length(Intent intent);

        void length(String str, Bundle bundle);

        Bundle setMax();

        void setMin();

        void setMin(getActionViewStatesKey.length length, String str, Bundle bundle);
    }

    interface values {
        void setMax() throws RemoteException;

        void setMax(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;

        void setMax(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder setMin();
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Nullable
    public abstract getMin onGetRoot(@NonNull String str, int i, @Nullable Bundle bundle);

    public abstract void onLoadChildren(@NonNull String str, @NonNull IsOverlapping<List<MediaBrowserCompat.MediaItem>> isOverlapping);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onSubscribe(String str, Bundle bundle) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onUnsubscribe(String str) {
    }

    class equals implements setMax {
        private Messenger length;

        equals() {
        }

        public void setMin() {
            this.length = new Messenger(MediaBrowserServiceCompat.this.mHandler);
        }

        public IBinder length(Intent intent) {
            if (MediaBrowserServiceCompat.SERVICE_INTERFACE.equals(intent.getAction())) {
                return this.length.getBinder();
            }
            return null;
        }

        public void getMin(final MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    Iterator<getMax> it = MediaBrowserServiceCompat.this.mConnections.values().iterator();
                    while (it.hasNext()) {
                        getMax next = it.next();
                        try {
                            next.equals.setMax(next.isInside.getMax(), token, next.isInside.setMax());
                        } catch (RemoteException unused) {
                            it.remove();
                        }
                    }
                }
            });
        }

        public void length(@NonNull final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (IBinder iBinder : MediaBrowserServiceCompat.this.mConnections.keySet()) {
                        PlaybackStateCompat<IBinder, getMax> playbackStateCompat = MediaBrowserServiceCompat.this.mConnections;
                        equals.this.length(playbackStateCompat.get(iBinder), str, bundle);
                    }
                }
            });
        }

        public void setMin(@NonNull final getActionViewStatesKey.length length2, @NonNull final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                        getMax getmax = (getMax) MediaBrowserServiceCompat.this.mConnections.isInside[(i << 1) + 1];
                        if (getmax.setMin.equals(length2)) {
                            equals.this.length(getmax, str, bundle);
                            return;
                        }
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void length(getMax getmax, String str, Bundle bundle) {
            List<setNegativeButton> list = getmax.toIntRange.get(str);
            if (list != null) {
                for (setNegativeButton setnegativebutton : list) {
                    if (savePresenterStates.getMin(bundle, (Bundle) setnegativebutton.getMin)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, getmax, (Bundle) setnegativebutton.getMin, bundle);
                    }
                }
            }
        }

        public Bundle setMax() {
            if (MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (MediaBrowserServiceCompat.this.mCurConnection.length == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.length);
            }
        }

        public getActionViewStatesKey.length getMax() {
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.setMin;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    @RequiresApi(21)
    class length implements setMax, createNewMenuItem.length {
        final List<Bundle> getMax = new ArrayList();
        Messenger length;
        Object setMin;

        length() {
        }

        public void setMin() {
            Object min = createNewMenuItem.setMin((Context) MediaBrowserServiceCompat.this, (createNewMenuItem.length) this);
            this.setMin = min;
            createNewMenuItem.getMax(min);
        }

        public IBinder length(Intent intent) {
            return createNewMenuItem.getMax(this.setMin, intent);
        }

        public void getMin(final MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                public void run() {
                    if (!length.this.getMax.isEmpty()) {
                        IMediaSession max = token.setMax();
                        if (max != null) {
                            for (Bundle max2 : length.this.getMax) {
                                InspectableProperty.setMax(max2, "extra_session_binder", max.asBinder());
                            }
                        }
                        length.this.getMax.clear();
                    }
                    createNewMenuItem.setMin(length.this.setMin, token.setMin());
                }
            });
        }

        public void length(String str, Bundle bundle) {
            setMax(str, bundle);
            setMin(str, bundle);
        }

        public void setMin(getActionViewStatesKey.length length2, String str, Bundle bundle) {
            length(length2, str, bundle);
        }

        public createNewMenuItem.setMax setMax(String str, int i, Bundle bundle) {
            Bundle bundle2;
            IBinder iBinder;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove("extra_client_version");
                this.length = new Messenger(MediaBrowserServiceCompat.this.mHandler);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                InspectableProperty.setMax(bundle2, "extra_messenger", this.length.getBinder());
                if (MediaBrowserServiceCompat.this.mSession != null) {
                    IMediaSession max = MediaBrowserServiceCompat.this.mSession.setMax();
                    if (max == null) {
                        iBinder = null;
                    } else {
                        iBinder = max.asBinder();
                    }
                    InspectableProperty.setMax(bundle2, "extra_session_binder", iBinder);
                } else {
                    this.getMax.add(bundle2);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.mCurConnection = new getMax(str, -1, i, bundle, (values) null);
            getMin onGetRoot = MediaBrowserServiceCompat.this.onGetRoot(str, i, bundle);
            MediaBrowserServiceCompat.this.mCurConnection = null;
            if (onGetRoot == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = onGetRoot.setMax();
            } else if (onGetRoot.setMax() != null) {
                bundle2.putAll(onGetRoot.setMax());
            }
            return new createNewMenuItem.setMax(onGetRoot.getMax(), bundle2);
        }

        public void setMin(String str, final createNewMenuItem.setMin<List<Parcel>> setmin) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new IsOverlapping<List<MediaBrowserCompat.MediaItem>>(str) {
                /* access modifiers changed from: package-private */
                /* renamed from: setMin */
                public void getMax(List<MediaBrowserCompat.MediaItem> list) {
                    ArrayList arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                            Parcel obtain = Parcel.obtain();
                            writeToParcel.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    setmin.setMin(arrayList);
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void setMax(String str, Bundle bundle) {
            createNewMenuItem.getMax(this.setMin, str);
        }

        /* access modifiers changed from: package-private */
        public void setMin(final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (IBinder iBinder : MediaBrowserServiceCompat.this.mConnections.keySet()) {
                        PlaybackStateCompat<IBinder, getMax> playbackStateCompat = MediaBrowserServiceCompat.this.mConnections;
                        length.this.getMin(playbackStateCompat.get(iBinder), str, bundle);
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void length(final getActionViewStatesKey.length length2, final String str, final Bundle bundle) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    for (int i = 0; i < MediaBrowserServiceCompat.this.mConnections.size(); i++) {
                        getMax getmax = (getMax) MediaBrowserServiceCompat.this.mConnections.isInside[(i << 1) + 1];
                        if (getmax.setMin.equals(length2)) {
                            length.this.getMin(getmax, str, bundle);
                        }
                    }
                }
            });
        }

        /* access modifiers changed from: package-private */
        public void getMin(getMax getmax, String str, Bundle bundle) {
            List<setNegativeButton> list = getmax.toIntRange.get(str);
            if (list != null) {
                for (setNegativeButton setnegativebutton : list) {
                    if (savePresenterStates.getMin(bundle, (Bundle) setnegativebutton.getMin)) {
                        MediaBrowserServiceCompat.this.performLoadChildren(str, getmax, (Bundle) setnegativebutton.getMin, bundle);
                    }
                }
            }
        }

        public Bundle setMax() {
            if (this.length == null) {
                return null;
            }
            if (MediaBrowserServiceCompat.this.mCurConnection == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (MediaBrowserServiceCompat.this.mCurConnection.length == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.length);
            }
        }

        public getActionViewStatesKey.length getMax() {
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.setMin;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
    }

    @RequiresApi(23)
    class setMin extends length implements addInternal.getMin {
        setMin() {
            super();
        }

        public void setMin() {
            this.setMin = addInternal.length(MediaBrowserServiceCompat.this, this);
            createNewMenuItem.getMax(this.setMin);
        }

        public void length(String str, final createNewMenuItem.setMin<Parcel> setmin) {
            MediaBrowserServiceCompat.this.onLoadItem(str, new IsOverlapping<MediaBrowserCompat.MediaItem>(str) {
                /* access modifiers changed from: package-private */
                /* renamed from: getMin */
                public void getMax(MediaBrowserCompat.MediaItem mediaItem) {
                    if (mediaItem == null) {
                        setmin.setMin(null);
                        return;
                    }
                    Parcel obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    setmin.setMin(obtain);
                }
            });
        }
    }

    @RequiresApi(26)
    class toFloatRange extends setMin implements setCallback.setMax {
        toFloatRange() {
            super();
        }

        public void setMin() {
            this.setMin = setCallback.getMin(MediaBrowserServiceCompat.this, this);
            createNewMenuItem.getMax(this.setMin);
        }

        public void getMax(String str, final setCallback.getMin getmin, Bundle bundle) {
            MediaBrowserServiceCompat.this.onLoadChildren(str, new IsOverlapping<List<MediaBrowserCompat.MediaItem>>(str) {
                /* access modifiers changed from: package-private */
                /* renamed from: getMin */
                public void getMax(List<MediaBrowserCompat.MediaItem> list) {
                    ArrayList arrayList;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                            Parcel obtain = Parcel.obtain();
                            writeToParcel.writeToParcel(obtain, 0);
                            arrayList.add(obtain);
                        }
                    } else {
                        arrayList = null;
                    }
                    getmin.length(arrayList, setMin());
                }
            }, bundle);
        }

        public Bundle setMax() {
            if (MediaBrowserServiceCompat.this.mCurConnection == null) {
                return setCallback.length(this.setMin);
            }
            if (MediaBrowserServiceCompat.this.mCurConnection.length == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.mCurConnection.length);
        }

        /* access modifiers changed from: package-private */
        public void setMax(String str, Bundle bundle) {
            if (bundle != null) {
                setCallback.setMin(this.setMin, str, bundle);
            } else {
                super.setMax(str, bundle);
            }
        }
    }

    @RequiresApi(28)
    class isInside extends toFloatRange {
        isInside() {
            super();
        }

        public getActionViewStatesKey.length getMax() {
            if (MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.setMin;
            }
            return new getActionViewStatesKey.length(((MediaBrowserService) this.setMin).getCurrentBrowserInfo());
        }
    }

    final class hashCode extends Handler {
        private final toIntRange length = new toIntRange();

        hashCode() {
        }

        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.setMax(bundle);
                    this.length.setMin(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                case 2:
                    this.length.setMax(new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.setMax(bundle2);
                    this.length.setMin(data.getString("data_media_item_id"), InspectableProperty.setMin(data, "data_callback_token"), bundle2, new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                case 4:
                    this.length.setMin(data.getString("data_media_item_id"), InspectableProperty.setMin(data, "data_callback_token"), new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                case 5:
                    this.length.getMin(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.setMax(bundle3);
                    toIntRange tointrange = this.length;
                    MediaBrowserServiceCompat$FastBitmap$CoordinateSystem mediaBrowserServiceCompat$FastBitmap$CoordinateSystem = new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo);
                    tointrange.getMax(mediaBrowserServiceCompat$FastBitmap$CoordinateSystem, data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.length.length(new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.setMax(bundle4);
                    this.length.getMin(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.setMax(bundle5);
                    this.length.getMax(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new MediaBrowserServiceCompat$FastBitmap$CoordinateSystem(message.replyTo));
                    return;
                default:
                    int i = message.arg1;
                    return;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }

        public final void length(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }
    }

    class getMax implements IBinder.DeathRecipient {
        public final values equals;
        public final int getMax;
        public final int getMin;
        public getMin isInside;
        public final Bundle length;
        public final String setMax;
        public final getActionViewStatesKey.length setMin;
        public final HashMap<String, List<setNegativeButton<IBinder, Bundle>>> toIntRange = new HashMap<>();

        getMax(String str, int i, int i2, Bundle bundle, values values) {
            this.setMax = str;
            this.getMax = i;
            this.getMin = i2;
            this.setMin = new getActionViewStatesKey.length(str, i, i2);
            this.length = bundle;
            this.equals = values;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    MediaBrowserServiceCompat.this.mConnections.remove(getMax.this.equals.setMin());
                }
            });
        }
    }

    public static class IsOverlapping<T> {
        private boolean getMax;
        private int getMin;
        private boolean length;
        private boolean setMax;
        private final Object setMin;

        /* access modifiers changed from: package-private */
        public void getMax(T t) {
        }

        IsOverlapping(Object obj) {
            this.setMin = obj;
        }

        public void length(T t) {
            if (this.setMax || this.length) {
                StringBuilder sb = new StringBuilder("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.setMin);
                throw new IllegalStateException(sb.toString());
            }
            this.setMax = true;
            getMax(t);
        }

        public void setMin(Bundle bundle) {
            if (this.setMax || this.length) {
                StringBuilder sb = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.setMin);
                throw new IllegalStateException(sb.toString());
            }
            this.length = true;
            setMax(bundle);
        }

        /* access modifiers changed from: package-private */
        public boolean getMin() {
            return this.getMax || this.setMax || this.length;
        }

        /* access modifiers changed from: package-private */
        public void setMin(int i) {
            this.getMin = i;
        }

        /* access modifiers changed from: package-private */
        public int setMin() {
            return this.getMin;
        }

        /* access modifiers changed from: package-private */
        public void setMax(Bundle bundle) {
            StringBuilder sb = new StringBuilder("It is not supported to send an error for ");
            sb.append(this.setMin);
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    class toIntRange {
        toIntRange() {
        }

        public void setMin(String str, int i, int i2, Bundle bundle, values values) {
            if (MediaBrowserServiceCompat.this.isValidPackage(str, i2)) {
                final values values2 = values;
                final String str2 = str;
                final int i3 = i;
                final int i4 = i2;
                final Bundle bundle2 = bundle;
                MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                    public void run() {
                        IBinder min = values2.setMin();
                        MediaBrowserServiceCompat.this.mConnections.remove(min);
                        getMax getmax = new getMax(str2, i3, i4, bundle2, values2);
                        MediaBrowserServiceCompat.this.mCurConnection = getmax;
                        getmax.isInside = MediaBrowserServiceCompat.this.onGetRoot(str2, i4, bundle2);
                        MediaBrowserServiceCompat.this.mCurConnection = null;
                        if (getmax.isInside == null) {
                            try {
                                values2.setMax();
                            } catch (RemoteException unused) {
                            }
                        } else {
                            try {
                                MediaBrowserServiceCompat.this.mConnections.put(min, getmax);
                                min.linkToDeath(getmax, 0);
                                if (MediaBrowserServiceCompat.this.mSession != null) {
                                    values2.setMax(getmax.isInside.getMax(), MediaBrowserServiceCompat.this.mSession, getmax.isInside.setMax());
                                }
                            } catch (RemoteException unused2) {
                                MediaBrowserServiceCompat.this.mConnections.remove(min);
                            }
                        }
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("Package/uid mismatch: uid=");
            sb.append(i2);
            sb.append(" package=");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public void setMax(final values values) {
            MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                public void run() {
                    getMax remove = MediaBrowserServiceCompat.this.mConnections.remove(values.setMin());
                    if (remove != null) {
                        remove.equals.setMin().unlinkToDeath(remove, 0);
                    }
                }
            });
        }

        public void setMin(String str, IBinder iBinder, Bundle bundle, values values) {
            final values values2 = values;
            final String str2 = str;
            final IBinder iBinder2 = iBinder;
            final Bundle bundle2 = bundle;
            MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                public void run() {
                    getMax getmax = MediaBrowserServiceCompat.this.mConnections.get(values2.setMin());
                    if (getmax != null) {
                        MediaBrowserServiceCompat.this.addSubscription(str2, getmax, iBinder2, bundle2);
                    }
                }
            });
        }

        public void setMin(final String str, final IBinder iBinder, final values values) {
            MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                public void run() {
                    getMax getmax = MediaBrowserServiceCompat.this.mConnections.get(values.setMin());
                    if (getmax != null) {
                        MediaBrowserServiceCompat.this.removeSubscription(str, getmax, iBinder);
                    }
                }
            });
        }

        public void getMin(final String str, final ResultReceiver resultReceiver, final values values) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                    public void run() {
                        getMax getmax = MediaBrowserServiceCompat.this.mConnections.get(values.setMin());
                        if (getmax != null) {
                            MediaBrowserServiceCompat.this.performLoadItem(str, getmax, resultReceiver);
                        }
                    }
                });
            }
        }

        public void getMax(values values, String str, int i, int i2, Bundle bundle) {
            final values values2 = values;
            final String str2 = str;
            final int i3 = i;
            final int i4 = i2;
            final Bundle bundle2 = bundle;
            MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                public void run() {
                    IBinder min = values2.setMin();
                    MediaBrowserServiceCompat.this.mConnections.remove(min);
                    getMax getmax = new getMax(str2, i3, i4, bundle2, values2);
                    MediaBrowserServiceCompat.this.mConnections.put(min, getmax);
                    try {
                        min.linkToDeath(getmax, 0);
                    } catch (RemoteException unused) {
                    }
                }
            });
        }

        public void length(final values values) {
            MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                public void run() {
                    IBinder min = values.setMin();
                    getMax remove = MediaBrowserServiceCompat.this.mConnections.remove(min);
                    if (remove != null) {
                        min.unlinkToDeath(remove, 0);
                    }
                }
            });
        }

        public void getMin(String str, Bundle bundle, ResultReceiver resultReceiver, values values) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                final values values2 = values;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                    public void run() {
                        getMax getmax = MediaBrowserServiceCompat.this.mConnections.get(values2.setMin());
                        if (getmax != null) {
                            MediaBrowserServiceCompat.this.performSearch(str2, bundle2, getmax, resultReceiver2);
                        }
                    }
                });
            }
        }

        public void getMax(String str, Bundle bundle, ResultReceiver resultReceiver, values values) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                final values values2 = values;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                MediaBrowserServiceCompat.this.mHandler.length(new Runnable() {
                    public void run() {
                        getMax getmax = MediaBrowserServiceCompat.this.mConnections.get(values2.setMin());
                        if (getmax != null) {
                            MediaBrowserServiceCompat.this.performCustomAction(str2, bundle2, getmax, resultReceiver2);
                        }
                    }
                });
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void attachToBaseContext(Context context) {
        attachBaseContext(context);
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 28) {
            this.getMax = new isInside();
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.getMax = new toFloatRange();
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.getMax = new setMin();
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.getMax = new length();
        } else {
            this.getMax = new equals();
        }
        this.getMax.setMin();
    }

    public IBinder onBind(Intent intent) {
        return this.getMax.length(intent);
    }

    public void onLoadChildren(@NonNull String str, @NonNull IsOverlapping<List<MediaBrowserCompat.MediaItem>> isOverlapping, @NonNull Bundle bundle) {
        isOverlapping.setMin(1);
        onLoadChildren(str, isOverlapping);
    }

    public void onLoadItem(String str, @NonNull IsOverlapping<MediaBrowserCompat.MediaItem> isOverlapping) {
        isOverlapping.setMin(2);
        isOverlapping.length(null);
    }

    public void onSearch(@NonNull String str, Bundle bundle, @NonNull IsOverlapping<List<MediaBrowserCompat.MediaItem>> isOverlapping) {
        isOverlapping.setMin(4);
        isOverlapping.length(null);
    }

    public void onCustomAction(@NonNull String str, Bundle bundle, @NonNull IsOverlapping<Bundle> isOverlapping) {
        isOverlapping.setMin((Bundle) null);
    }

    public void setSessionToken(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.mSession == null) {
            this.mSession = token;
            this.getMax.getMin(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }

    @Nullable
    public MediaSessionCompat.Token getSessionToken() {
        return this.mSession;
    }

    public final Bundle getBrowserRootHints() {
        return this.getMax.setMax();
    }

    @NonNull
    public final getActionViewStatesKey.length getCurrentBrowserInfo() {
        return this.getMax.getMax();
    }

    public void notifyChildrenChanged(@NonNull String str) {
        if (str != null) {
            this.getMax.length(str, (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(@NonNull String str, @NonNull Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.getMax.length(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void notifyChildrenChanged(@NonNull getActionViewStatesKey.length length2, @NonNull String str, @NonNull Bundle bundle) {
        if (length2 == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.getMax.setMin(length2, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isValidPackage(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals2 : getPackageManager().getPackagesForUid(i)) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void addSubscription(String str, getMax getmax, IBinder iBinder, Bundle bundle) {
        List<setNegativeButton> list = getmax.toIntRange.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (setNegativeButton setnegativebutton : list) {
            if (iBinder == setnegativebutton.setMax && savePresenterStates.setMin(bundle, (Bundle) setnegativebutton.getMin)) {
                return;
            }
        }
        list.add(new setNegativeButton(iBinder, bundle));
        getmax.toIntRange.put(str, list);
        performLoadChildren(str, getmax, bundle, (Bundle) null);
        this.mCurConnection = getmax;
        onSubscribe(str, bundle);
        this.mCurConnection = null;
    }

    /* access modifiers changed from: package-private */
    public boolean removeSubscription(String str, getMax getmax, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (getmax.toIntRange.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.mCurConnection = getmax;
                onUnsubscribe(str);
                this.mCurConnection = null;
            }
        } else {
            List list = getmax.toIntRange.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((setNegativeButton) it.next()).setMax) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    getmax.toIntRange.remove(str);
                }
            }
            this.mCurConnection = getmax;
            onUnsubscribe(str);
            this.mCurConnection = null;
            return z2;
        }
    }

    /* access modifiers changed from: package-private */
    public void performLoadChildren(String str, getMax getmax, Bundle bundle, Bundle bundle2) {
        final getMax getmax2 = getmax;
        final String str2 = str;
        final Bundle bundle3 = bundle;
        final Bundle bundle4 = bundle2;
        AnonymousClass5 r0 = new IsOverlapping<List<MediaBrowserCompat.MediaItem>>(str) {
            /* access modifiers changed from: package-private */
            /* renamed from: length */
            public void getMax(List<MediaBrowserCompat.MediaItem> list) {
                if (MediaBrowserServiceCompat.this.mConnections.get(getmax2.equals.setMin()) != getmax2) {
                    boolean z = MediaBrowserServiceCompat.DEBUG;
                    return;
                }
                if ((setMin() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.applyOptions(list, bundle3);
                }
                try {
                    getmax2.equals.setMax(str2, list, bundle3, bundle4);
                } catch (RemoteException unused) {
                }
            }
        };
        this.mCurConnection = getmax;
        if (bundle == null) {
            onLoadChildren(str, r0);
        } else {
            onLoadChildren(str, r0, bundle);
        }
        this.mCurConnection = null;
        if (!r0.getMin()) {
            StringBuilder sb = new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(getmax.setMax);
            sb.append(" id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public List<MediaBrowserCompat.MediaItem> applyOptions(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    /* access modifiers changed from: package-private */
    public void performLoadItem(String str, getMax getmax, final ResultReceiver resultReceiver) {
        AnonymousClass1 r0 = new IsOverlapping<MediaBrowserCompat.MediaItem>(str) {
            /* access modifiers changed from: package-private */
            /* renamed from: setMax */
            public void getMax(MediaBrowserCompat.MediaItem mediaItem) {
                if ((setMin() & 2) != 0) {
                    resultReceiver.getMax(-1, (Bundle) null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaItem);
                resultReceiver.getMax(0, bundle);
            }
        };
        this.mCurConnection = getmax;
        onLoadItem(str, r0);
        this.mCurConnection = null;
        if (!r0.getMin()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: package-private */
    public void performSearch(String str, Bundle bundle, getMax getmax, final ResultReceiver resultReceiver) {
        AnonymousClass2 r0 = new IsOverlapping<List<MediaBrowserCompat.MediaItem>>(str) {
            /* access modifiers changed from: package-private */
            /* renamed from: setMin */
            public void getMax(List<MediaBrowserCompat.MediaItem> list) {
                if ((setMin() & 4) != 0 || list == null) {
                    resultReceiver.getMax(-1, (Bundle) null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
                resultReceiver.getMax(0, bundle);
            }
        };
        this.mCurConnection = getmax;
        onSearch(str, bundle, r0);
        this.mCurConnection = null;
        if (!r0.getMin()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: package-private */
    public void performCustomAction(String str, Bundle bundle, getMax getmax, final ResultReceiver resultReceiver) {
        AnonymousClass3 r0 = new IsOverlapping<Bundle>(str) {
            /* access modifiers changed from: package-private */
            /* renamed from: getMin */
            public void getMax(Bundle bundle) {
                resultReceiver.getMax(0, bundle);
            }

            /* access modifiers changed from: package-private */
            public void setMax(Bundle bundle) {
                resultReceiver.getMax(-1, bundle);
            }
        };
        this.mCurConnection = getmax;
        onCustomAction(str, bundle, r0);
        this.mCurConnection = null;
        if (!r0.getMin()) {
            StringBuilder sb = new StringBuilder("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            sb.append(str);
            sb.append(" extras=");
            sb.append(bundle);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final class getMin {
        private final Bundle getMax;
        private final String setMin;

        public final String getMax() {
            return this.setMin;
        }

        public final Bundle setMax() {
            return this.getMax;
        }
    }
}

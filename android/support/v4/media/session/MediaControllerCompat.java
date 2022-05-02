package android.support.v4.media.session;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o.InspectableProperty;
import o.updateVisuals;

public final class MediaControllerCompat {
    private final setMax getMax;
    private final HashSet<Callback> length = new HashSet<>();
    private final MediaSessionCompat.Token setMax;

    interface setMax {
        boolean setMin(KeyEvent keyEvent);
    }

    public MediaControllerCompat(Context context, @NonNull MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.setMax = token;
            if (Build.VERSION.SDK_INT >= 24) {
                this.getMax = new setMin(context, token);
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.getMax = new getMax(context, token);
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.getMax = new MediaControllerImplApi21(context, token);
            } else {
                this.getMax = new length(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public final boolean getMin(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.getMax.setMin(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public static abstract class Callback implements IBinder.DeathRecipient {
        setMax getMax;
        IMediaControllerCallback getMin;
        final Object setMin;

        public void getMax(getMin getmin) {
        }

        public void getMax(String str, Bundle bundle) {
        }

        public void getMin(PlaybackStateCompat playbackStateCompat) {
        }

        public void getMin(List<MediaSessionCompat.QueueItem> list) {
        }

        public void getMin(boolean z) {
        }

        public void length() {
        }

        public void length(int i) {
        }

        public void length(Bundle bundle) {
        }

        public void length(CharSequence charSequence) {
        }

        public void setMin() {
        }

        public void setMin(int i) {
        }

        public void setMin(MediaMetadataCompat mediaMetadataCompat) {
        }

        public Callback() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.setMin = updateVisuals.length(new getMin(this));
                return;
            }
            StubCompat stubCompat = new StubCompat(this);
            this.getMin = stubCompat;
            this.setMin = stubCompat;
        }

        /* access modifiers changed from: package-private */
        public void getMax(int i, Object obj, Bundle bundle) {
            setMax setmax = this.getMax;
            if (setmax != null) {
                Message obtainMessage = setmax.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        static class getMin implements updateVisuals.getMin {
            private final WeakReference<Callback> length;

            getMin(Callback callback) {
                this.length = new WeakReference<>(callback);
            }

            public void setMax() {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.length();
                }
            }

            public void setMin(String str, Bundle bundle) {
                Callback callback = this.length.get();
                if (callback == null) {
                    return;
                }
                if (callback.getMin == null || Build.VERSION.SDK_INT >= 23) {
                    callback.getMax(str, bundle);
                }
            }

            public void setMin(Object obj) {
                Callback callback = this.length.get();
                if (callback != null && callback.getMin == null) {
                    callback.getMin(PlaybackStateCompat.length(obj));
                }
            }

            public void length(Object obj) {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.setMin(MediaMetadataCompat.getMax(obj));
                }
            }

            public void getMin(List<?> list) {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMin(MediaSessionCompat.QueueItem.setMin(list));
                }
            }

            public void setMin(CharSequence charSequence) {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.length(charSequence);
                }
            }

            public void setMin(Bundle bundle) {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.length(bundle);
                }
            }

            public void getMin(int i, int i2, int i3, int i4, int i5) {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(new getMin(i, i2, i3, i4, i5));
                }
            }
        }

        static class StubCompat extends IMediaControllerCallback.Stub {
            private final WeakReference<Callback> length;

            public void onShuffleModeChangedRemoved(boolean z) throws RemoteException {
            }

            StubCompat(Callback callback) {
                this.length = new WeakReference<>(callback);
            }

            public void onEvent(String str, Bundle bundle) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(1, str, bundle);
                }
            }

            public void onSessionDestroyed() throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(8, (Object) null, (Bundle) null);
                }
            }

            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(2, playbackStateCompat, (Bundle) null);
                }
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(5, list, (Bundle) null);
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(6, charSequence, (Bundle) null);
                }
            }

            public void onCaptioningEnabledChanged(boolean z) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            public void onRepeatModeChanged(int i) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            public void onShuffleModeChanged(int i) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(7, bundle, (Bundle) null);
                }
            }

            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(4, parcelableVolumeInfo != null ? new getMin(parcelableVolumeInfo.length, parcelableVolumeInfo.setMin, parcelableVolumeInfo.setMax, parcelableVolumeInfo.getMax, parcelableVolumeInfo.getMin) : null, (Bundle) null);
                }
            }

            public void onSessionReady() throws RemoteException {
                Callback callback = this.length.get();
                if (callback != null) {
                    callback.getMax(13, (Object) null, (Bundle) null);
                }
            }
        }

        class setMax extends Handler {
            boolean getMin;
            final /* synthetic */ Callback length;

            public void handleMessage(Message message) {
                if (this.getMin) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.setMax(data);
                            this.length.getMax((String) message.obj, data);
                            return;
                        case 2:
                            this.length.getMin((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.length.setMin((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.length.getMax((getMin) message.obj);
                            return;
                        case 5:
                            this.length.getMin((List<MediaSessionCompat.QueueItem>) (List) message.obj);
                            return;
                        case 6:
                            this.length.length((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.setMax(bundle);
                            this.length.length(bundle);
                            return;
                        case 8:
                            this.length.length();
                            return;
                        case 9:
                            this.length.length(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            this.length.getMin(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            this.length.setMin(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            this.length.setMin();
                            return;
                        default:
                            return;
                    }
                }
            }
        }
    }

    public static final class getMin {
        private final int getMax;
        private final int getMin;
        private final int length;
        private final int setMax;
        private final int setMin;

        getMin(int i, int i2, int i3, int i4, int i5) {
            this.getMax = i;
            this.setMax = i2;
            this.getMin = i3;
            this.setMin = i4;
            this.length = i5;
        }
    }

    static class length implements setMax {
        private IMediaSession setMin;

        public length(MediaSessionCompat.Token token) {
            this.setMin = IMediaSession.Stub.asInterface((IBinder) token.setMin());
        }

        public boolean setMin(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.setMin.sendMediaButton(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }
    }

    @RequiresApi(21)
    static class MediaControllerImplApi21 implements setMax {
        final Object getMax = new Object();
        @GuardedBy("mLock")
        private final List<Callback> getMin = new ArrayList();
        private HashMap<Callback, ExtraCallback> length = new HashMap<>();
        final MediaSessionCompat.Token setMax;
        protected final Object setMin;

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.setMax = token;
            Object max = updateVisuals.getMax(context, token.setMin());
            this.setMin = max;
            if (max == null) {
                throw new RemoteException();
            } else if (this.setMax.setMax() == null) {
                getMin();
            }
        }

        public boolean setMin(KeyEvent keyEvent) {
            return updateVisuals.length(this.setMin, keyEvent);
        }

        public void length(String str, Bundle bundle, ResultReceiver resultReceiver) {
            updateVisuals.getMin(this.setMin, str, bundle, resultReceiver);
        }

        private void getMin() {
            length("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        /* access modifiers changed from: package-private */
        @GuardedBy("mLock")
        public void setMax() {
            if (this.setMax.setMax() != null) {
                for (Callback next : this.getMin) {
                    ExtraCallback extraCallback = new ExtraCallback(next);
                    this.length.put(next, extraCallback);
                    next.getMin = extraCallback;
                    try {
                        this.setMax.setMax().registerCallbackListener(extraCallback);
                        next.getMax(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                }
                this.getMin.clear();
            }
        }

        static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> length;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.length = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.length.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.getMax) {
                        mediaControllerImplApi21.setMax.length(IMediaSession.Stub.asInterface(InspectableProperty.setMin(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.setMax.getMax(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                        mediaControllerImplApi21.setMax();
                    }
                }
            }
        }

        static class ExtraCallback extends Callback.StubCompat {
            ExtraCallback(Callback callback) {
                super(callback);
            }

            public void onSessionDestroyed() throws RemoteException {
                throw new AssertionError();
            }

            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            public void onQueueTitleChanged(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            public void onExtrasChanged(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }
        }
    }

    @RequiresApi(23)
    static class getMax extends MediaControllerImplApi21 {
        public getMax(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }

    @RequiresApi(24)
    static class setMin extends getMax {
        public setMin(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }
    }
}

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.getActionViewStatesKey;
import o.postMessage;
import o.requestPostMessageChannel;
import o.requestPostMessageChannelWithExtras;

public class MediaSessionCompat {
    private final MediaControllerCompat getMax;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SessionFlags {
    }

    interface setMax {
        void getMin(getActionViewStatesKey.length length);

        PlaybackStateCompat length();

        getActionViewStatesKey.length setMin();
    }

    public MediaControllerCompat setMax() {
        return this.getMax;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void setMax(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat setMin(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.setMin() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.length() != 3 && playbackStateCompat.length() != 4 && playbackStateCompat.length() != 5) {
            return playbackStateCompat;
        }
        long max = playbackStateCompat.getMax();
        if (max <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max2 = ((long) (playbackStateCompat.setMax() * ((float) (elapsedRealtime - max)))) + playbackStateCompat.setMin();
        if (mediaMetadataCompat != null && mediaMetadataCompat.setMin("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.getMin("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.setMin(playbackStateCompat).length(playbackStateCompat.length(), (j < 0 || max2 <= j) ? max2 < 0 ? 0 : max2 : j, playbackStateCompat.setMax(), elapsedRealtime).length();
    }

    public static abstract class getMin {
        WeakReference<setMax> getMax;
        final Object length;
        private boolean setMax;
        private setMin setMin = null;

        public void IsOverlapping() {
        }

        public void getMax() {
        }

        public void getMax(long j) {
        }

        public void getMax(String str, Bundle bundle) {
        }

        public void getMin() {
        }

        public void getMin(long j) {
        }

        public void getMin(String str, Bundle bundle) {
        }

        public void isInside() {
        }

        public void length() {
        }

        public void length(Uri uri, Bundle bundle) {
        }

        public void length(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void length(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void length(String str, Bundle bundle) {
        }

        public void setMax() {
        }

        public void setMax(int i) {
        }

        public void setMax(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void setMax(String str, Bundle bundle) {
        }

        public void setMin() {
        }

        public void setMin(int i) {
        }

        public void setMin(Uri uri, Bundle bundle) {
        }

        public void setMin(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void setMin(RatingCompat ratingCompat) {
        }

        public void setMin(String str, Bundle bundle) {
        }

        public void setMin(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void setMin(boolean z) {
        }

        public void toIntRange() {
        }

        public getMin() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.length = requestPostMessageChannelWithExtras.getMin(new C0069getMin());
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.length = postMessage.setMax(new getMax());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.length = requestPostMessageChannel.setMax((requestPostMessageChannel.length) new length());
            } else {
                this.length = null;
            }
        }

        public boolean setMin(Intent intent) {
            setMax setmax;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27 || (setmax = this.getMax.get()) == null || this.setMin == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            getActionViewStatesKey.length min = setmax.setMin();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    setMax(min);
                } else if (this.setMax) {
                    this.setMin.removeMessages(1);
                    this.setMax = false;
                    PlaybackStateCompat length2 = setmax.length();
                    if (length2 == null) {
                        j = 0;
                    } else {
                        j = length2.getMin();
                    }
                    if ((j & 32) != 0) {
                        getMax();
                    }
                } else {
                    this.setMax = true;
                    setMin setmin = this.setMin;
                    setmin.sendMessageDelayed(setmin.obtainMessage(1, min), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            setMax(min);
            return false;
        }

        /* access modifiers changed from: package-private */
        public void setMax(getActionViewStatesKey.length length2) {
            long j;
            if (this.setMax) {
                boolean z = false;
                this.setMax = false;
                this.setMin.removeMessages(1);
                setMax setmax = this.getMax.get();
                if (setmax != null) {
                    PlaybackStateCompat length3 = setmax.length();
                    if (length3 == null) {
                        j = 0;
                    } else {
                        j = length3.getMin();
                    }
                    boolean z2 = length3 != null && length3.length() == 3;
                    boolean z3 = (516 & j) != 0;
                    if ((j & 514) != 0) {
                        z = true;
                    }
                    setmax.getMin(length2);
                    if (z2 && z) {
                        length();
                    } else if (!z2 && z3) {
                        setMax();
                    }
                    setmax.getMin((getActionViewStatesKey.length) null);
                }
            }
        }

        class setMin extends Handler {
            final /* synthetic */ getMin getMin;

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    this.getMin.setMax((getActionViewStatesKey.length) message.obj);
                }
            }
        }

        @RequiresApi(21)
        class length implements requestPostMessageChannel.length {
            length() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void setMax(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                /*
                    r4 = this;
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r1 = 0
                    if (r0 == 0) goto L_0x003c
                    android.support.v4.media.session.MediaSessionCompat$getMin r5 = android.support.v4.media.session.MediaSessionCompat.getMin.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$setMax> r5 = r5.getMax     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r5 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21) r5     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r5 == 0) goto L_0x003b
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00c1 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.setMax()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.IMediaSession r0 = r5.setMax()     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L_0x0027
                    goto L_0x002b
                L_0x0027:
                    android.os.IBinder r1 = r0.asBinder()     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x002b:
                    o.InspectableProperty.setMax(r6, r2, r1)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Bundle r5 = r5.length()     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                    r6.putBundle(r0, r5)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5 = 0
                    r7.send(r5, r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x003b:
                    return
                L_0x003c:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L_0x0052
                    android.support.v4.media.session.MediaSessionCompat$getMin r5 = android.support.v4.media.session.MediaSessionCompat.getMin.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5.setMax((android.support.v4.media.MediaDescriptionCompat) r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    return
                L_0x0052:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L_0x006c
                    android.support.v4.media.session.MediaSessionCompat$getMin r5 = android.support.v4.media.session.MediaSessionCompat.getMin.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00c1 }
                    int r6 = r6.getInt(r3)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5.length((android.support.v4.media.MediaDescriptionCompat) r7, (int) r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    return
                L_0x006c:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r0 == 0) goto L_0x0080
                    android.support.v4.media.session.MediaSessionCompat$getMin r5 = android.support.v4.media.session.MediaSessionCompat.getMin.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5.setMin((android.support.v4.media.MediaDescriptionCompat) r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    return
                L_0x0080:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r0 == 0) goto L_0x00bc
                    android.support.v4.media.session.MediaSessionCompat$getMin r5 = android.support.v4.media.session.MediaSessionCompat.getMin.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$setMax> r5 = r5.getMax     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21 r5 = (android.support.v4.media.session.MediaSessionCompat.MediaSessionImplApi21) r5     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r5 == 0) goto L_0x00bb
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.toFloatRange     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r7 == 0) goto L_0x00bb
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r6 < 0) goto L_0x00b0
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.toFloatRange     // Catch:{ BadParcelableException -> 0x00c1 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00c1 }
                    if (r6 >= r7) goto L_0x00b0
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.toFloatRange     // Catch:{ BadParcelableException -> 0x00c1 }
                    java.lang.Object r5 = r5.get(r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x00b0:
                    if (r1 == 0) goto L_0x00bb
                    android.support.v4.media.session.MediaSessionCompat$getMin r5 = android.support.v4.media.session.MediaSessionCompat.getMin.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.length()     // Catch:{ BadParcelableException -> 0x00c1 }
                    r5.setMin((android.support.v4.media.MediaDescriptionCompat) r6)     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x00bb:
                    return
                L_0x00bc:
                    android.support.v4.media.session.MediaSessionCompat$getMin r0 = android.support.v4.media.session.MediaSessionCompat.getMin.this     // Catch:{ BadParcelableException -> 0x00c1 }
                    r0.setMin(r5, r6, r7)     // Catch:{ BadParcelableException -> 0x00c1 }
                L_0x00c1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.getMin.length.setMax(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public boolean setMin(Intent intent) {
                return getMin.this.setMin(intent);
            }

            public void setMin() {
                getMin.this.setMax();
            }

            public void getMin(String str, Bundle bundle) {
                getMin.this.length(str, bundle);
            }

            public void setMin(String str, Bundle bundle) {
                getMin.this.getMax(str, bundle);
            }

            public void getMin(long j) {
                getMin.this.getMin(j);
            }

            public void getMin() {
                getMin.this.length();
            }

            public void getMax() {
                getMin.this.getMax();
            }

            public void length() {
                getMin.this.getMin();
            }

            public void setMax() {
                getMin.this.IsOverlapping();
            }

            public void equals() {
                getMin.this.toIntRange();
            }

            public void isInside() {
                getMin.this.isInside();
            }

            public void length(long j) {
                getMin.this.getMax(j);
            }

            public void getMin(Object obj) {
                getMin.this.setMin(RatingCompat.getMax(obj));
            }

            public void setMax(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                MediaSessionCompat.setMax(bundle2);
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    getMin.this.setMin((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                    getMin.this.setMin();
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                    getMin.this.setMax(bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                    getMin.this.setMin(bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                    getMin.this.length((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                    getMin.this.setMin(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                    getMin.this.setMin(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                    getMin.this.setMax(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                    getMin.this.length((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle2);
                } else {
                    getMin.this.getMin(str, bundle);
                }
            }
        }

        @RequiresApi(23)
        class getMax extends length implements postMessage.setMax {
            getMax() {
                super();
            }

            public void length(Uri uri, Bundle bundle) {
                getMin.this.setMin(uri, bundle);
            }
        }

        @RequiresApi(24)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$getMin$getMin  reason: collision with other inner class name */
        class C0069getMin extends getMax implements requestPostMessageChannelWithExtras.length {
            C0069getMin() {
                super();
            }

            public void IsOverlapping() {
                getMin.this.setMin();
            }

            public void length(String str, Bundle bundle) {
                getMin.this.setMax(str, bundle);
            }

            public void getMax(String str, Bundle bundle) {
                getMin.this.setMin(str, bundle);
            }

            public void getMax(Uri uri, Bundle bundle) {
                getMin.this.length(uri, bundle);
            }
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() {
            /* renamed from: setMin */
            public final Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }

            /* renamed from: getMax */
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private IMediaSession getMin;
        private Bundle length;
        private final Object setMax;

        public final int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, (IMediaSession) null, (Bundle) null);
        }

        Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, (Bundle) null);
        }

        Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
            this.setMax = obj;
            this.getMin = iMediaSession;
            this.length = bundle;
        }

        public static Token setMin(Object obj) {
            return setMin(obj, (IMediaSession) null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static Token setMin(Object obj, IMediaSession iMediaSession) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(requestPostMessageChannel.setMax(obj), iMediaSession);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.setMax, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.setMax);
            }
        }

        public final int hashCode() {
            Object obj = this.setMax;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.setMax;
            if (obj2 == null) {
                return token.setMax == null;
            }
            Object obj3 = token.setMax;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final Object setMin() {
            return this.setMax;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final IMediaSession setMax() {
            return this.getMin;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void length(IMediaSession iMediaSession) {
            this.getMin = iMediaSession;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final Bundle length() {
            return this.length;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void getMax(Bundle bundle) {
            this.length = bundle;
        }
    }

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() {
            /* renamed from: length */
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: getMin */
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        };
        private final MediaDescriptionCompat getMax;
        private Object getMin;
        private final long length;

        public final int describeContents() {
            return 0;
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.getMax = mediaDescriptionCompat;
                this.length = j;
                this.getMin = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.getMax = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.length = parcel.readLong();
        }

        public final MediaDescriptionCompat length() {
            return this.getMax;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.getMax.writeToParcel(parcel, i);
            parcel.writeLong(this.length);
        }

        public static QueueItem setMin(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.getMax(requestPostMessageChannel.setMin.getMin(obj)), requestPostMessageChannel.setMin.setMin(obj));
        }

        public static List<QueueItem> setMin(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object min : list) {
                arrayList.add(setMin((Object) min));
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.getMax);
            sb.append(", Id=");
            sb.append(this.length);
            sb.append(" }");
            return sb.toString();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() {
            /* renamed from: setMax */
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: setMin */
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        ResultReceiver length;

        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.length = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.length.writeToParcel(parcel, i);
        }
    }

    static class MediaSessionImplBase implements setMax {
        PendingIntent FastBitmap$CoordinateSystem;
        Bundle Grayscale$Algorithm;
        int IsOverlapping;
        int Mean$Arithmetic;
        VolumeProviderCompat create;
        PlaybackStateCompat equals;
        private getMin getCause;
        final String getMax;
        final AudioManager getMin;
        List<QueueItem> hashCode;
        int invoke;
        int invokeSuspend;
        volatile getMin isInside;
        final RemoteCallbackList<IMediaControllerCallback> length;
        private getActionViewStatesKey.length onNavigationEvent;
        final Object setMax;
        final String setMin;
        boolean toDoubleRange;
        boolean toFloatRange;
        MediaMetadataCompat toIntRange;
        CharSequence toString;
        int valueOf;
        int values;

        /* access modifiers changed from: package-private */
        public void setMin(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.setMax) {
                if (this.getCause != null) {
                    Message obtainMessage = this.getCause.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_calling_pkg", "android.media.session.MediaController");
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        public PlaybackStateCompat length() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.setMax) {
                playbackStateCompat = this.equals;
            }
            return playbackStateCompat;
        }

        public getActionViewStatesKey.length setMin() {
            getActionViewStatesKey.length length2;
            synchronized (this.setMax) {
                length2 = this.onNavigationEvent;
            }
            return length2;
        }

        public void getMin(getActionViewStatesKey.length length2) {
            synchronized (this.setMax) {
                this.onNavigationEvent = length2;
            }
        }

        /* access modifiers changed from: package-private */
        public void setMin(int i, int i2) {
            if (this.Mean$Arithmetic == 2) {
                VolumeProviderCompat volumeProviderCompat = this.create;
                if (volumeProviderCompat != null) {
                    volumeProviderCompat.setMin(i);
                    return;
                }
                return;
            }
            this.getMin.adjustStreamVolume(this.invokeSuspend, i, i2);
        }

        /* access modifiers changed from: package-private */
        public void setMax(int i, int i2) {
            if (this.Mean$Arithmetic == 2) {
                VolumeProviderCompat volumeProviderCompat = this.create;
                if (volumeProviderCompat != null) {
                    volumeProviderCompat.setMax(i);
                    return;
                }
                return;
            }
            this.getMin.setStreamVolume(this.invokeSuspend, i, i2);
        }

        class MediaSessionStub extends IMediaSession.Stub {
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
            }

            MediaSessionStub() {
            }

            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                postToHandler(1, (Object) new getMax(str, bundle, resultReceiverWrapper.length));
            }

            public boolean sendMediaButton(KeyEvent keyEvent) {
                boolean z = true;
                if ((MediaSessionImplBase.this.IsOverlapping & 1) == 0) {
                    z = false;
                }
                if (z) {
                    postToHandler(21, (Object) keyEvent);
                }
                return z;
            }

            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (MediaSessionImplBase.this.toFloatRange) {
                    try {
                        iMediaControllerCallback.onSessionDestroyed();
                    } catch (Exception unused) {
                    }
                } else {
                    MediaSessionImplBase.this.length.register(iMediaControllerCallback, new getActionViewStatesKey.length("android.media.session.MediaController", getCallingPid(), getCallingUid()));
                }
            }

            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplBase.this.length.unregister(iMediaControllerCallback);
            }

            public String getPackageName() {
                return MediaSessionImplBase.this.getMax;
            }

            public String getTag() {
                return MediaSessionImplBase.this.setMin;
            }

            public PendingIntent getLaunchPendingIntent() {
                PendingIntent pendingIntent;
                synchronized (MediaSessionImplBase.this.setMax) {
                    pendingIntent = MediaSessionImplBase.this.FastBitmap$CoordinateSystem;
                }
                return pendingIntent;
            }

            public long getFlags() {
                long j;
                synchronized (MediaSessionImplBase.this.setMax) {
                    j = (long) MediaSessionImplBase.this.IsOverlapping;
                }
                return j;
            }

            public ParcelableVolumeInfo getVolumeAttributes() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (MediaSessionImplBase.this.setMax) {
                    i = MediaSessionImplBase.this.Mean$Arithmetic;
                    i2 = MediaSessionImplBase.this.invokeSuspend;
                    VolumeProviderCompat volumeProviderCompat = MediaSessionImplBase.this.create;
                    if (i == 2) {
                        int min = volumeProviderCompat.getMin();
                        int max = volumeProviderCompat.getMax();
                        i3 = volumeProviderCompat.setMax();
                        i4 = max;
                        i5 = min;
                    } else {
                        i4 = MediaSessionImplBase.this.getMin.getStreamMaxVolume(i2);
                        i3 = MediaSessionImplBase.this.getMin.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i5, i4, i3);
            }

            public void adjustVolume(int i, int i2, String str) {
                MediaSessionImplBase.this.setMin(i, i2);
            }

            public void setVolumeTo(int i, int i2, String str) {
                MediaSessionImplBase.this.setMax(i, i2);
            }

            public void prepare() throws RemoteException {
                postToHandler(3);
            }

            public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
                postToHandler(4, (Object) str, bundle);
            }

            public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
                postToHandler(5, (Object) str, bundle);
            }

            public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
                postToHandler(6, (Object) uri, bundle);
            }

            public void play() throws RemoteException {
                postToHandler(7);
            }

            public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
                postToHandler(8, (Object) str, bundle);
            }

            public void playFromSearch(String str, Bundle bundle) throws RemoteException {
                postToHandler(9, (Object) str, bundle);
            }

            public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
                postToHandler(10, (Object) uri, bundle);
            }

            public void skipToQueueItem(long j) {
                postToHandler(11, (Object) Long.valueOf(j));
            }

            public void pause() throws RemoteException {
                postToHandler(12);
            }

            public void stop() throws RemoteException {
                postToHandler(13);
            }

            public void next() throws RemoteException {
                postToHandler(14);
            }

            public void previous() throws RemoteException {
                postToHandler(15);
            }

            public void fastForward() throws RemoteException {
                postToHandler(16);
            }

            public void rewind() throws RemoteException {
                postToHandler(17);
            }

            public void seekTo(long j) throws RemoteException {
                postToHandler(18, (Object) Long.valueOf(j));
            }

            public void rate(RatingCompat ratingCompat) throws RemoteException {
                postToHandler(19, (Object) ratingCompat);
            }

            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                postToHandler(31, (Object) ratingCompat, bundle);
            }

            public void setCaptioningEnabled(boolean z) throws RemoteException {
                postToHandler(29, (Object) Boolean.valueOf(z));
            }

            public void setRepeatMode(int i) throws RemoteException {
                postToHandler(23, i);
            }

            public void setShuffleMode(int i) throws RemoteException {
                postToHandler(30, i);
            }

            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                postToHandler(20, (Object) str, bundle);
            }

            public MediaMetadataCompat getMetadata() {
                return MediaSessionImplBase.this.toIntRange;
            }

            public PlaybackStateCompat getPlaybackState() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (MediaSessionImplBase.this.setMax) {
                    playbackStateCompat = MediaSessionImplBase.this.equals;
                    mediaMetadataCompat = MediaSessionImplBase.this.toIntRange;
                }
                return MediaSessionCompat.setMin(playbackStateCompat, mediaMetadataCompat);
            }

            public List<QueueItem> getQueue() {
                List<QueueItem> list;
                synchronized (MediaSessionImplBase.this.setMax) {
                    list = MediaSessionImplBase.this.hashCode;
                }
                return list;
            }

            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(25, (Object) mediaDescriptionCompat);
            }

            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                postToHandler(26, (Object) mediaDescriptionCompat, i);
            }

            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                postToHandler(27, (Object) mediaDescriptionCompat);
            }

            public void removeQueueItemAt(int i) {
                postToHandler(28, i);
            }

            public CharSequence getQueueTitle() {
                return MediaSessionImplBase.this.toString;
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (MediaSessionImplBase.this.setMax) {
                    bundle = MediaSessionImplBase.this.Grayscale$Algorithm;
                }
                return bundle;
            }

            public int getRatingType() {
                return MediaSessionImplBase.this.values;
            }

            public boolean isCaptioningEnabled() {
                return MediaSessionImplBase.this.toDoubleRange;
            }

            public int getRepeatMode() {
                return MediaSessionImplBase.this.invoke;
            }

            public int getShuffleMode() {
                return MediaSessionImplBase.this.valueOf;
            }

            public boolean isTransportControlEnabled() {
                return (MediaSessionImplBase.this.IsOverlapping & 2) != 0;
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i) {
                MediaSessionImplBase.this.setMin(i, 0, 0, (Object) null, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, int i2) {
                MediaSessionImplBase.this.setMin(i, i2, 0, (Object) null, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, Object obj) {
                MediaSessionImplBase.this.setMin(i, 0, 0, obj, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, Object obj, int i2) {
                MediaSessionImplBase.this.setMin(i, i2, 0, obj, (Bundle) null);
            }

            /* access modifiers changed from: package-private */
            public void postToHandler(int i, Object obj, Bundle bundle) {
                MediaSessionImplBase.this.setMin(i, 0, 0, obj, bundle);
            }
        }

        static final class getMax {
            public final Bundle getMin;
            public final String length;
            public final ResultReceiver setMax;

            public getMax(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.length = str;
                this.getMin = bundle;
                this.setMax = resultReceiver;
            }
        }

        class getMin extends Handler {
            final /* synthetic */ MediaSessionImplBase setMax;

            public void handleMessage(Message message) {
                getMin getmin = this.setMax.isInside;
                if (getmin != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.setMax(data);
                    this.setMax.getMin(new getActionViewStatesKey.length(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.setMax(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                getMax getmax = (getMax) message.obj;
                                getmin.setMin(getmax.length, getmax.getMin, getmax.setMax);
                                break;
                            case 2:
                                this.setMax.setMin(message.arg1, 0);
                                break;
                            case 3:
                                getmin.setMin();
                                break;
                            case 4:
                                getmin.setMax((String) message.obj, bundle);
                                break;
                            case 5:
                                getmin.setMin((String) message.obj, bundle);
                                break;
                            case 6:
                                getmin.length((Uri) message.obj, bundle);
                                break;
                            case 7:
                                getmin.setMax();
                                break;
                            case 8:
                                getmin.length((String) message.obj, bundle);
                                break;
                            case 9:
                                getmin.getMax((String) message.obj, bundle);
                                break;
                            case 10:
                                getmin.setMin((Uri) message.obj, bundle);
                                break;
                            case 11:
                                getmin.getMin(((Long) message.obj).longValue());
                                break;
                            case 12:
                                getmin.length();
                                break;
                            case 13:
                                getmin.isInside();
                                break;
                            case 14:
                                getmin.getMax();
                                break;
                            case 15:
                                getmin.getMin();
                                break;
                            case 16:
                                getmin.IsOverlapping();
                                break;
                            case 17:
                                getmin.toIntRange();
                                break;
                            case 18:
                                getmin.getMax(((Long) message.obj).longValue());
                                break;
                            case 19:
                                getmin.setMin((RatingCompat) message.obj);
                                break;
                            case 20:
                                getmin.getMin((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!getmin.setMin(intent)) {
                                    setMax(keyEvent, getmin);
                                    break;
                                }
                                break;
                            case 22:
                                this.setMax.setMax(message.arg1, 0);
                                break;
                            case 23:
                                getmin.setMin(message.arg1);
                                break;
                            case 25:
                                getmin.setMax((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                getmin.length((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                getmin.setMin((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                if (this.setMax.hashCode != null) {
                                    QueueItem queueItem = (message.arg1 < 0 || message.arg1 >= this.setMax.hashCode.size()) ? null : this.setMax.hashCode.get(message.arg1);
                                    if (queueItem != null) {
                                        getmin.setMin(queueItem.length());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                getmin.setMin(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                getmin.setMax(message.arg1);
                                break;
                            case 31:
                                getmin.length((RatingCompat) message.obj, bundle);
                                break;
                        }
                    } finally {
                        this.setMax.getMin((getActionViewStatesKey.length) null);
                    }
                }
            }

            private void setMax(KeyEvent keyEvent, getMin getmin) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    long min = this.setMax.equals == null ? 0 : this.setMax.equals.getMin();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 86:
                                    if ((min & 1) != 0) {
                                        getmin.isInside();
                                        return;
                                    }
                                    return;
                                case 87:
                                    if ((min & 32) != 0) {
                                        getmin.getMax();
                                        return;
                                    }
                                    return;
                                case 88:
                                    if ((min & 16) != 0) {
                                        getmin.getMin();
                                        return;
                                    }
                                    return;
                                case 89:
                                    if ((min & 8) != 0) {
                                        getmin.toIntRange();
                                        return;
                                    }
                                    return;
                                case 90:
                                    if ((min & 64) != 0) {
                                        getmin.IsOverlapping();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if ((min & 2) != 0) {
                            getmin.length();
                        }
                    } else if ((min & 4) != 0) {
                        getmin.setMax();
                    }
                }
            }
        }
    }

    @RequiresApi(21)
    static class MediaSessionImplApi21 implements setMax {
        int IsOverlapping;
        int equals;
        boolean getMax;
        PlaybackStateCompat getMin;
        MediaMetadataCompat isInside;
        final Token length;
        final RemoteCallbackList<IMediaControllerCallback> setMax;
        final Object setMin;
        List<QueueItem> toFloatRange;
        boolean toIntRange;
        int toString;

        public void getMin(getActionViewStatesKey.length length2) {
        }

        public getActionViewStatesKey.length setMin() {
            return null;
        }

        public Token setMax() {
            return this.length;
        }

        public PlaybackStateCompat length() {
            return this.getMin;
        }

        public String getMin() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return requestPostMessageChannelWithExtras.setMin(this.setMin);
        }

        class ExtraSession extends IMediaSession.Stub {
            public List<QueueItem> getQueue() {
                return null;
            }

            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            public void setShuffleModeEnabledRemoved(boolean z) throws RemoteException {
            }

            ExtraSession() {
            }

            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                if (!MediaSessionImplApi21.this.getMax) {
                    String min = MediaSessionImplApi21.this.getMin();
                    if (min == null) {
                        min = "android.media.session.MediaController";
                    }
                    MediaSessionImplApi21.this.setMax.register(iMediaControllerCallback, new getActionViewStatesKey.length(min, getCallingPid(), getCallingUid()));
                }
            }

            public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
                MediaSessionImplApi21.this.setMax.unregister(iMediaControllerCallback);
            }

            public String getPackageName() {
                throw new AssertionError();
            }

            public String getTag() {
                throw new AssertionError();
            }

            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            public long getFlags() {
                throw new AssertionError();
            }

            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            public void adjustVolume(int i, int i2, String str) {
                throw new AssertionError();
            }

            public void setVolumeTo(int i, int i2, String str) {
                throw new AssertionError();
            }

            public void prepare() throws RemoteException {
                throw new AssertionError();
            }

            public void prepareFromMediaId(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void prepareFromSearch(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void prepareFromUri(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void play() throws RemoteException {
                throw new AssertionError();
            }

            public void playFromMediaId(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void playFromSearch(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void playFromUri(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void skipToQueueItem(long j) {
                throw new AssertionError();
            }

            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            public void fastForward() throws RemoteException {
                throw new AssertionError();
            }

            public void rewind() throws RemoteException {
                throw new AssertionError();
            }

            public void seekTo(long j) throws RemoteException {
                throw new AssertionError();
            }

            public void rate(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void setCaptioningEnabled(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            public void setRepeatMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            public void setShuffleMode(int i) throws RemoteException {
                throw new AssertionError();
            }

            public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            public PlaybackStateCompat getPlaybackState() {
                return MediaSessionCompat.setMin(MediaSessionImplApi21.this.getMin, MediaSessionImplApi21.this.isInside);
            }

            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void removeQueueItemAt(int i) {
                throw new AssertionError();
            }

            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public int getRatingType() {
                return MediaSessionImplApi21.this.equals;
            }

            public boolean isCaptioningEnabled() {
                return MediaSessionImplApi21.this.toIntRange;
            }

            public int getRepeatMode() {
                return MediaSessionImplApi21.this.IsOverlapping;
            }

            public int getShuffleMode() {
                return MediaSessionImplApi21.this.toString;
            }

            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }
        }
    }
}

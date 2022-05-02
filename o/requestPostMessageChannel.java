package o;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
public class requestPostMessageChannel {

    public interface length {
        void equals();

        void getMax();

        void getMin();

        void getMin(long j);

        void getMin(Object obj);

        void getMin(String str, Bundle bundle);

        void isInside();

        void length();

        void length(long j);

        void setMax();

        void setMax(String str, Bundle bundle);

        void setMax(String str, Bundle bundle, ResultReceiver resultReceiver);

        void setMin();

        void setMin(String str, Bundle bundle);

        boolean setMin(Intent intent);
    }

    public static Object setMax(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    public static Object setMax(length length2) {
        return new getMin(length2);
    }

    static class getMin<T extends length> extends MediaSession.Callback {
        protected final T setMin;

        public getMin(T t) {
            this.setMin = t;
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.setMax(bundle);
            this.setMin.setMax(str, bundle, resultReceiver);
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return this.setMin.setMin(intent) || super.onMediaButtonEvent(intent);
        }

        public void onPlay() {
            this.setMin.setMin();
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            this.setMin.getMin(str, bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            this.setMin.setMin(str, bundle);
        }

        public void onSkipToQueueItem(long j) {
            this.setMin.getMin(j);
        }

        public void onPause() {
            this.setMin.getMin();
        }

        public void onSkipToNext() {
            this.setMin.getMax();
        }

        public void onSkipToPrevious() {
            this.setMin.length();
        }

        public void onFastForward() {
            this.setMin.setMax();
        }

        public void onRewind() {
            this.setMin.equals();
        }

        public void onStop() {
            this.setMin.isInside();
        }

        public void onSeekTo(long j) {
            this.setMin.length(j);
        }

        public void onSetRating(Rating rating) {
            this.setMin.getMin((Object) rating);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.setMax(bundle);
            this.setMin.setMax(str, bundle);
        }
    }

    public static class setMin {
        public static Object getMin(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        public static long setMin(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }
}

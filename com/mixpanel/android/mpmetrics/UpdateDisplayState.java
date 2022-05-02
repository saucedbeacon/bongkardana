package com.mixpanel.android.mpmetrics;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import o.dispatchOnCancelled;
import o.findOnePartiallyOrCompletelyInvisibleChild;
import o.onCancelLoad;
import o.onCanceled;

@TargetApi(16)
public class UpdateDisplayState implements Parcelable {
    public static final Parcelable.Creator<UpdateDisplayState> CREATOR = new Parcelable.Creator<UpdateDisplayState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UpdateDisplayState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Bundle bundle = new Bundle(UpdateDisplayState.class.getClassLoader());
            bundle.readFromParcel(parcel);
            return new UpdateDisplayState(bundle, (byte) 0);
        }
    };
    private static UpdateDisplayState IsOverlapping = null;
    private static int equals = 0;
    private static long getMax = -1;
    private static int isInside = -1;
    private static final ReentrantLock setMax = new ReentrantLock();
    public final DisplayState getMin;
    private final String length;
    public final String setMin;

    public int describeContents() {
        return 0;
    }

    /* synthetic */ UpdateDisplayState(Bundle bundle, byte b) {
        this(bundle);
    }

    public static abstract class DisplayState implements Parcelable {
        public static final Parcelable.Creator<DisplayState> CREATOR = new Parcelable.Creator<DisplayState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new DisplayState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Bundle bundle = new Bundle(DisplayState.class.getClassLoader());
                bundle.readFromParcel(parcel);
                String string = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_TYPE_KEY");
                Bundle bundle2 = bundle.getBundle("com.mixpanel.android.mpmetrics.UpdateDisplayState.DisplayState.STATE_IMPL_KEY");
                if ("InAppNotificationState".equals(string)) {
                    return new InAppNotificationState(bundle2, (byte) 0);
                }
                throw new RuntimeException("Unrecognized display state type ".concat(String.valueOf(string)));
            }
        };

        /* synthetic */ DisplayState(byte b) {
            this();
        }

        private DisplayState() {
        }

        public static final class InAppNotificationState extends DisplayState {
            public static final Parcelable.Creator<InAppNotificationState> CREATOR = new Parcelable.Creator<InAppNotificationState>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new InAppNotificationState[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    Bundle bundle = new Bundle(InAppNotificationState.class.getClassLoader());
                    bundle.readFromParcel(parcel);
                    return new InAppNotificationState(bundle, (byte) 0);
                }
            };
            private static String getMax = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.HIGHLIGHT_KEY";
            private static String setMin = "com.com.mixpanel.android.mpmetrics.UpdateDisplayState.InAppNotificationState.INAPP_KEY";
            private final int getMin;
            public final InAppNotification setMax;

            public final int describeContents() {
                return 0;
            }

            /* synthetic */ InAppNotificationState(Bundle bundle, byte b) {
                this(bundle);
            }

            public InAppNotificationState(InAppNotification inAppNotification, int i) {
                super((byte) 0);
                this.setMax = inAppNotification;
                this.getMin = i;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                int max = dispatchOnCancelled.setMax(i);
                if (i != max) {
                    onCanceled oncanceled = new onCanceled(i, max, 1);
                    onCancelLoad.setMax(690563624, oncanceled);
                    onCancelLoad.getMin(690563624, oncanceled);
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(setMin, this.setMax);
                bundle.putInt(getMax, this.getMin);
                parcel.writeBundle(bundle);
            }

            private InAppNotificationState(Bundle bundle) {
                super((byte) 0);
                this.setMax = (InAppNotification) bundle.getParcelable(setMin);
                this.getMin = bundle.getInt(getMax);
            }
        }
    }

    public static class AnswerMap implements Parcelable {
        public static final Parcelable.Creator<AnswerMap> CREATOR = new Parcelable.Creator<AnswerMap>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new AnswerMap[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Bundle bundle = new Bundle(AnswerMap.class.getClassLoader());
                AnswerMap answerMap = new AnswerMap();
                bundle.readFromParcel(parcel);
                for (String str : bundle.keySet()) {
                    answerMap.setMax.put(Integer.valueOf(str), bundle.getString(str));
                }
                return answerMap;
            }
        };
        final HashMap<Integer, String> setMax = new HashMap<>();

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.setMax.entrySet()) {
                bundle.putString(Integer.toString(((Integer) next.getKey()).intValue()), (String) next.getValue());
            }
            parcel.writeBundle(bundle);
        }
    }

    public static ReentrantLock length() {
        return setMax;
    }

    public static boolean setMax() {
        if (setMax.isHeldByCurrentThread()) {
            long currentTimeMillis = System.currentTimeMillis() - getMax;
            if (equals > 0 && currentTimeMillis > 43200000) {
                findOnePartiallyOrCompletelyInvisibleChild.IsOverlapping();
                IsOverlapping = null;
            }
            return IsOverlapping != null;
        }
        throw new AssertionError();
    }

    public static int setMax(DisplayState displayState, String str, String str2) {
        if (!setMax.isHeldByCurrentThread()) {
            throw new AssertionError();
        } else if (!setMax()) {
            getMax = System.currentTimeMillis();
            IsOverlapping = new UpdateDisplayState(displayState, str, str2);
            int i = equals + 1;
            equals = i;
            return i;
        } else {
            findOnePartiallyOrCompletelyInvisibleChild.getMax();
            return -1;
        }
    }

    public static void setMax(int i) {
        setMax.lock();
        try {
            if (i == isInside) {
                isInside = -1;
                IsOverlapping = null;
            }
        } finally {
            setMax.unlock();
        }
    }

    public static UpdateDisplayState setMin(int i) {
        setMax.lock();
        try {
            if (isInside <= 0 || isInside == i) {
                if (IsOverlapping != null) {
                    getMax = System.currentTimeMillis();
                    isInside = i;
                    UpdateDisplayState updateDisplayState = IsOverlapping;
                    setMax.unlock();
                    return updateDisplayState;
                }
            }
            return null;
        } finally {
            setMax.unlock();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY", this.length);
        bundle.putString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY", this.setMin);
        bundle.putParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY", this.getMin);
        parcel.writeBundle(bundle);
    }

    private UpdateDisplayState(DisplayState displayState, String str, String str2) {
        this.length = str;
        this.setMin = str2;
        this.getMin = displayState;
    }

    private UpdateDisplayState(Bundle bundle) {
        this.length = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISTINCT_ID_BUNDLE_KEY");
        this.setMin = bundle.getString("com.mixpanel.android.mpmetrics.UpdateDisplayState.TOKEN_BUNDLE_KEY");
        this.getMin = (DisplayState) bundle.getParcelable("com.mixpanel.android.mpmetrics.UpdateDisplayState.DISPLAYSTATE_BUNDLE_KEY");
    }
}

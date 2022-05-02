package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import com.facebook.flipper.core.FlipperReceiver;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class access$onHandlerMessage implements FlipperPlugin {
    /* access modifiers changed from: private */
    public dispatchKeyShortcutEvent mConnection;
    protected final Map<SharedPreferences, length> mSharedPreferences;
    protected final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener;

    public String getId() {
        return "Preferences";
    }

    public boolean runInBackground() {
        return false;
    }

    public access$onHandlerMessage(Context context) {
        this(context, context.getPackageName());
    }

    public access$onHandlerMessage(Context context, String str) {
        this(context, str, 0);
    }

    public access$onHandlerMessage(Context context, String str, int i) {
        this(context, (List<length>) Arrays.asList(new length[]{new length(str, i)}));
    }

    public access$onHandlerMessage(Context context, List<length> list) {
        this.onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                length length;
                if (access$onHandlerMessage.this.mConnection != null && (length = access$onHandlerMessage.this.mSharedPreferences.get(sharedPreferences)) != null) {
                    access$onHandlerMessage.this.mConnection.setMax("sharedPreferencesChange", new FlipperObject(new FlipperObject.setMax().getMax("preferences", length.length).getMax("name", str).getMin("deleted", Boolean.valueOf(!sharedPreferences.contains(str))).length(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, Long.valueOf(System.currentTimeMillis())).setMax("value", (Object) sharedPreferences.getAll().get(str)).getMax));
                }
            }
        };
        if (context != null) {
            this.mSharedPreferences = new HashMap(list.size());
            for (length next : list) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(next.length, next.setMin);
                sharedPreferences.registerOnSharedPreferenceChangeListener(this.onSharedPreferenceChangeListener);
                this.mSharedPreferences.put(sharedPreferences, next);
            }
            return;
        }
        throw new IllegalArgumentException("Given null context");
    }

    /* access modifiers changed from: private */
    public SharedPreferences getSharedPreferencesFor(String str) {
        for (Map.Entry next : this.mSharedPreferences.entrySet()) {
            if (((length) next.getValue()).length.equals(str)) {
                return (SharedPreferences) next.getKey();
            }
        }
        throw new IllegalStateException("Unknown shared preferences ".concat(String.valueOf(str)));
    }

    /* access modifiers changed from: private */
    public FlipperObject getFlipperObjectFor(String str) {
        return getFlipperObjectFor(getSharedPreferencesFor(str));
    }

    /* access modifiers changed from: private */
    public FlipperObject getFlipperObjectFor(SharedPreferences sharedPreferences) {
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        for (Map.Entry next : sharedPreferences.getAll().entrySet()) {
            setmax.setMax((String) next.getKey(), next.getValue());
        }
        return new FlipperObject(setmax.getMax);
    }

    public void onConnect(dispatchKeyShortcutEvent dispatchkeyshortcutevent) {
        this.mConnection = dispatchkeyshortcutevent;
        dispatchkeyshortcutevent.receive("getAllSharedPreferences", new FlipperReceiver() {
        });
        dispatchkeyshortcutevent.receive("getSharedPreferences", new FlipperReceiver() {
        });
        dispatchkeyshortcutevent.receive("setSharedPreference", new FlipperReceiver() {
        });
    }

    public void onDisconnect() {
        this.mConnection = null;
    }

    public static class length {
        public final String length;
        public final int setMin;

        public length(String str, int i) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Given null or empty name");
            }
            this.length = str;
            this.setMin = i;
        }
    }
}

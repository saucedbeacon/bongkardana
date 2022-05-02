package o;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.Reader;
import com.google.zxing.common.HybridBinarizer;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.getVerticalSnapPreference;
import org.json.JSONException;
import org.json.JSONObject;

public final class LinearLayoutManager extends ContiguousPagedList$FetchState {
    public LinearLayoutManager(Reader reader) {
        super(reader);
    }

    final class SavedState implements getVerticalSnapPreference.isInside {
        private static String getMin = "MixpanelAPI.DynamicEventTracker";
        private final Runnable getMax = new setMax(this, (byte) 0);
        /* access modifiers changed from: private */
        public final Handler length;
        /* access modifiers changed from: private */
        public final convertFocusDirectionToLayoutDirection setMax;
        /* access modifiers changed from: private */
        public final Map<length, getMin> setMin = new HashMap();

        public SavedState(convertFocusDirectionToLayoutDirection convertfocusdirectiontolayoutdirection, Handler handler) {
            this.setMax = convertfocusdirectiontolayoutdirection;
            this.length = handler;
        }

        public final void getMin(View view, String str, boolean z) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("$text", getMin(view));
                jSONObject.put("$from_binding", true);
                jSONObject.put(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, currentTimeMillis / 1000);
            } catch (JSONException unused) {
                findOnePartiallyOrCompletelyInvisibleChild.values();
            }
            if (z) {
                length length2 = new length(view, str);
                getMin getmin = new getMin(str, jSONObject, currentTimeMillis);
                synchronized (this.setMin) {
                    boolean isEmpty = this.setMin.isEmpty();
                    this.setMin.put(length2, getmin);
                    if (isEmpty) {
                        this.length.postDelayed(this.getMax, 1000);
                    }
                }
                return;
            }
            this.setMax.setMin(str, jSONObject);
        }

        final class setMax implements Runnable {
            private setMax() {
            }

            /* synthetic */ setMax(SavedState savedState, byte b) {
                this();
            }

            public final void run() {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (SavedState.this.setMin) {
                    Iterator it = SavedState.this.setMin.entrySet().iterator();
                    while (it.hasNext()) {
                        getMin getmin = (getMin) ((Map.Entry) it.next()).getValue();
                        if (currentTimeMillis - getmin.setMin > 1000) {
                            SavedState.this.setMax.setMin(getmin.getMax, getmin.length);
                            it.remove();
                        }
                    }
                    if (!SavedState.this.setMin.isEmpty()) {
                        SavedState.this.length.postDelayed(this, 500);
                    }
                }
            }
        }

        private static String getMin(View view) {
            if (view instanceof TextView) {
                CharSequence text = ((TextView) view).getText();
                if (text != null) {
                    return text.toString();
                }
                return null;
            } else if (!(view instanceof ViewGroup)) {
                return null;
            } else {
                StringBuilder sb = new StringBuilder();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                boolean z = false;
                for (int i = 0; i < childCount && sb.length() < 128; i++) {
                    String min = getMin(viewGroup.getChildAt(i));
                    if (min != null && min.length() > 0) {
                        if (z) {
                            sb.append(", ");
                        }
                        sb.append(min);
                        z = true;
                    }
                }
                if (sb.length() > 128) {
                    return sb.substring(0, 128);
                }
                if (z) {
                    return sb.toString();
                }
                return null;
            }
        }

        static class length {
            private final int getMax;

            public length(View view, String str) {
                this.getMax = view.hashCode() ^ str.hashCode();
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof length) || this.getMax != obj.hashCode()) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return this.getMax;
            }
        }

        static class getMin {
            public final String getMax;
            public final JSONObject length;
            public final long setMin;

            public getMin(String str, JSONObject jSONObject, long j) {
                this.getMax = str;
                this.length = jSONObject;
                this.setMin = j;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final BinaryBitmap getMax(LuminanceSource luminanceSource) {
        return new BinaryBitmap(new HybridBinarizer(luminanceSource.invert()));
    }
}

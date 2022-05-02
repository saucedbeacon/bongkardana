package o;

import android.graphics.Rect;
import android.text.TextUtils;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.proguard.annotations.DoNotStrip;

public final class attachInfo {
    @DoNotStrip
    public static void addViewDescription(int i, int i2, RemoteInput$EditChoicesBeforeSending remoteInput$EditChoicesBeforeSending, StringBuilder sb, boolean z) {
        sb.append("litho.");
        sb.append(remoteInput$EditChoicesBeforeSending.getMax.setMax.get(remoteInput$EditChoicesBeforeSending.getMin).valueOf);
        sb.append('{');
        sb.append(Integer.toHexString(remoteInput$EditChoicesBeforeSending.hashCode()));
        sb.append(' ');
        ensureProcessorRunningLocked ensureprocessorrunninglocked = remoteInput$EditChoicesBeforeSending.getMax.getMax;
        String str = null;
        ComponentTree componentTree = ensureprocessorrunninglocked == null ? null : ensureprocessorrunninglocked.toString;
        LithoView lithoView = componentTree == null ? null : componentTree.getLithoView();
        FileProvider fileProvider = remoteInput$EditChoicesBeforeSending.setMax() ? new FileProvider(remoteInput$EditChoicesBeforeSending.getMax) : null;
        String str2 = "V";
        String str3 = ".";
        sb.append((lithoView == null || lithoView.getVisibility() != 0) ? str3 : str2);
        sb.append((fileProvider == null || !fileProvider.length()) ? str3 : "F");
        sb.append((lithoView == null || !lithoView.isEnabled()) ? str3 : "E");
        sb.append(str3);
        sb.append((lithoView == null || !lithoView.isHorizontalScrollBarEnabled()) ? str3 : "H");
        if (lithoView == null || !lithoView.isVerticalScrollBarEnabled()) {
            str2 = str3;
        }
        sb.append(str2);
        if (fileProvider != null) {
            sendAccessibilityEvent sendaccessibilityevent = fileProvider.setMin;
            if (sendaccessibilityevent.FastBitmap$CoordinateSystem == null) {
                ViewCompat$ScrollIndicators min = NotificationCompatSideChannelService.setMin();
                if (min.getMax.getAndSet(1) == 0) {
                    sendaccessibilityevent.FastBitmap$CoordinateSystem = min;
                } else {
                    throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
                }
            }
            if (sendaccessibilityevent.FastBitmap$CoordinateSystem.values != null) {
                str3 = "C";
            }
        }
        sb.append(str3);
        sb.append(". .. ");
        int min2 = remoteInput$EditChoicesBeforeSending.getMax.getMin();
        int length = remoteInput$EditChoicesBeforeSending.getMax.length();
        Rect rect = new Rect(min2, length, remoteInput$EditChoicesBeforeSending.getMax.setMax() + min2, remoteInput$EditChoicesBeforeSending.getMax.setMin() + length);
        sb.append(rect.left + i);
        sb.append(",");
        sb.append(rect.top + i2);
        sb.append("-");
        sb.append(i + rect.right);
        sb.append(",");
        sb.append(i2 + rect.bottom);
        if (remoteInput$EditChoicesBeforeSending.setMax()) {
            str = remoteInput$EditChoicesBeforeSending.getMax.onMessageChannelReady;
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            sb.append(String.format(" litho:id/%s", new Object[]{str.replace(' ', '_')}));
        }
        String max = remoteInput$EditChoicesBeforeSending.getMax();
        if (max != null && !TextUtils.isEmpty(max)) {
            sb.append(String.format(" text=\"%s\"", new Object[]{max.replace("\n", "").replace("\"", "")}));
        }
        if (!z && fileProvider != null) {
            sendAccessibilityEvent sendaccessibilityevent2 = fileProvider.setMin;
            if (sendaccessibilityevent2.FastBitmap$CoordinateSystem == null) {
                ViewCompat$ScrollIndicators min3 = NotificationCompatSideChannelService.setMin();
                if (min3.getMax.getAndSet(1) == 0) {
                    sendaccessibilityevent2.FastBitmap$CoordinateSystem = min3;
                } else {
                    throw new IllegalStateException("The NodeInfo reference acquired from the pool  wasn't correctly released.");
                }
            }
            if (sendaccessibilityevent2.FastBitmap$CoordinateSystem.values != null) {
                sb.append(" [clickable]");
            }
        }
        sb.append('}');
    }
}

package o;

import android.widget.TextView;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LayoutState;
import com.facebook.litho.LithoView;
import com.facebook.litho.TextContent;
import com.facebook.litho.ThreadUtils;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

public final class RemoteInput$EditChoicesBeforeSending {
    private static final Map<String, setMax> setMin = new HashMap();
    public sendAccessibilityEvent getMax;
    public int getMin;
    private String length;

    public interface setMax {
    }

    private RemoteInput$EditChoicesBeforeSending() {
    }

    public static synchronized RemoteInput$EditChoicesBeforeSending setMin(sendAccessibilityEvent sendaccessibilityevent, int i) {
        RemoteInput$EditChoicesBeforeSending remoteInput$EditChoicesBeforeSending;
        synchronized (RemoteInput$EditChoicesBeforeSending.class) {
            remoteInput$EditChoicesBeforeSending = new RemoteInput$EditChoicesBeforeSending();
            ComponentTree componentTree = sendaccessibilityevent.getMax.toString;
            String str = sendaccessibilityevent.setMax.get(i).toFloatRange;
            StringBuilder sb = new StringBuilder();
            sb.append(System.identityHashCode(componentTree));
            sb.append(str);
            remoteInput$EditChoicesBeforeSending.length = sb.toString();
            remoteInput$EditChoicesBeforeSending.getMax = sendaccessibilityevent;
            remoteInput$EditChoicesBeforeSending.getMin = i;
            sendaccessibilityevent.ICustomTabsCallback$Default.add(remoteInput$EditChoicesBeforeSending);
        }
        return remoteInput$EditChoicesBeforeSending;
    }

    @Nullable
    public static RemoteInput$EditChoicesBeforeSending getMax(LithoView lithoView) {
        ComponentTree componentTree = lithoView.getComponentTree();
        LayoutState layoutState = componentTree == null ? null : componentTree.ICustomTabsCallback;
        sendAccessibilityEvent sendaccessibilityevent = layoutState == null ? null : layoutState.hashCode;
        if (sendaccessibilityevent != null) {
            return setMin(sendaccessibilityevent, Math.max(0, sendaccessibilityevent.setMax.size() - 1));
        }
        return null;
    }

    public final boolean setMax() {
        return this.getMin == 0;
    }

    public static void setMin(ensureProcessorRunningLocked ensureprocessorrunninglocked, isStopped isstopped) {
        ComponentTree componentTree = ensureprocessorrunninglocked.toString;
        String str = isstopped.toFloatRange;
        StringBuilder sb = new StringBuilder();
        sb.append(System.identityHashCode(componentTree));
        sb.append(str);
        setMin.get(sb.toString());
    }

    static void getMax(ensureProcessorRunningLocked ensureprocessorrunninglocked, sendAccessibilityEvent sendaccessibilityevent) {
        ComponentTree componentTree = ensureprocessorrunninglocked.toString;
        String str = sendaccessibilityevent.setMax.get(0).toFloatRange;
        StringBuilder sb = new StringBuilder();
        sb.append(System.identityHashCode(componentTree));
        sb.append(str);
        if (setMin.get(sb.toString()) != null) {
            new FileProvider(sendaccessibilityevent);
        }
    }

    @Nullable
    public final String getMax() {
        ensureProcessorRunningLocked ensureprocessorrunninglocked = this.getMax.getMax;
        ComponentTree componentTree = ensureprocessorrunninglocked == null ? null : ensureprocessorrunninglocked.toString;
        LithoView lithoView = componentTree == null ? null : componentTree.getLithoView();
        isStopped isstopped = this.getMax.setMax.get(this.getMin);
        if (lithoView == null) {
            return null;
        }
        WindowInsetsCompat$Type$InsetsType mountState = lithoView.getMountState();
        StringBuilder sb = new StringBuilder();
        ThreadUtils.getMax();
        int length2 = mountState.setMin == null ? 0 : mountState.setMin.length;
        for (int i = 0; i < length2; i++) {
            ThreadUtils.getMax();
            WindowInsetsAnimationCompat$Callback$DispatchMode max = mountState.length.getMax(mountState.setMin[i], null);
            isStopped isstopped2 = max == null ? null : max.setMin;
            if (isstopped2 != null && isstopped2.length(isstopped)) {
                Object obj = max.setMax;
                if (obj instanceof TextContent) {
                    for (CharSequence append : ((TextContent) obj).getTextItems()) {
                        sb.append(append);
                    }
                } else if (obj instanceof TextView) {
                    sb.append(((TextView) obj).getText());
                }
            }
        }
        return sb.toString();
    }
}

package com.facebook.litho;

import android.text.TextUtils;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.yoga.YogaNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import o.RemoteInput$EditChoicesBeforeSending;
import o.attachInfo;
import o.sendAccessibilityEvent;

@DoNotStrip
public class LithoViewTestHelper {
    @DoNotStrip
    @Nullable
    public static TestItem findTestItem(LithoView lithoView, String str) {
        Deque<TestItem> findTestItems = lithoView.findTestItems(str);
        if (findTestItems.isEmpty()) {
            return null;
        }
        return findTestItems.getLast();
    }

    @DoNotStrip
    @NonNull
    public static Deque<TestItem> findTestItems(LithoView lithoView, String str) {
        return lithoView.findTestItems(str);
    }

    @DoNotStrip
    public static String viewToString(LithoView lithoView) {
        return viewToString(lithoView, false);
    }

    @DoNotStrip
    public static String viewToString(LithoView lithoView, boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            int left = lithoView.getLeft();
            int top = lithoView.getTop();
            int i4 = 2;
            for (ViewParent parent = lithoView.getParent(); parent != null; parent = parent.getParent()) {
                i4++;
            }
            i3 = left;
            i2 = top;
            i = i4;
        } else {
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        setMin(i3, i2, RemoteInput$EditChoicesBeforeSending.getMax(lithoView), sb, z, i);
        return sb.toString();
    }

    private static void setMin(int i, int i2, @Nullable RemoteInput$EditChoicesBeforeSending remoteInput$EditChoicesBeforeSending, StringBuilder sb, boolean z, int i3) {
        List<RemoteInput$EditChoicesBeforeSending> list;
        sendAccessibilityEvent sendaccessibilityevent;
        if (remoteInput$EditChoicesBeforeSending != null) {
            attachInfo.addViewDescription(i, i2, remoteInput$EditChoicesBeforeSending, sb, z);
            if (!remoteInput$EditChoicesBeforeSending.setMax()) {
                list = Arrays.asList(new RemoteInput$EditChoicesBeforeSending[]{RemoteInput$EditChoicesBeforeSending.setMin(remoteInput$EditChoicesBeforeSending.getMax, remoteInput$EditChoicesBeforeSending.getMin - 1)});
            } else {
                list = new ArrayList<>();
                YogaNode yogaNode = remoteInput$EditChoicesBeforeSending.getMax.length;
                int size = yogaNode.setMax == null ? 0 : yogaNode.setMax.size();
                int i4 = 0;
                while (true) {
                    sendAccessibilityEvent sendaccessibilityevent2 = null;
                    if (i4 >= size) {
                        break;
                    }
                    sendAccessibilityEvent sendaccessibilityevent3 = remoteInput$EditChoicesBeforeSending.getMax;
                    if (sendaccessibilityevent3.length.setMin(i4) != null) {
                        sendaccessibilityevent2 = (sendAccessibilityEvent) sendaccessibilityevent3.length.setMin(i4).toFloatRange;
                    }
                    list.add(RemoteInput$EditChoicesBeforeSending.setMin(sendaccessibilityevent2, Math.max(0, sendaccessibilityevent2.setMax.size() - 1)));
                    i4++;
                }
                sendAccessibilityEvent sendaccessibilityevent4 = remoteInput$EditChoicesBeforeSending.getMax.toFloatRange;
                if (sendaccessibilityevent4 != null && sendaccessibilityevent4.getMax()) {
                    YogaNode yogaNode2 = sendaccessibilityevent4.length;
                    int size2 = yogaNode2.setMax == null ? 0 : yogaNode2.setMax.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (sendaccessibilityevent4.length.setMin(i5) == null) {
                            sendaccessibilityevent = null;
                        } else {
                            sendaccessibilityevent = (sendAccessibilityEvent) sendaccessibilityevent4.length.setMin(i5).toFloatRange;
                        }
                        list.add(RemoteInput$EditChoicesBeforeSending.setMin(sendaccessibilityevent, Math.max(0, sendaccessibilityevent.setMax.size() - 1)));
                    }
                }
            }
            for (RemoteInput$EditChoicesBeforeSending remoteInput$EditChoicesBeforeSending2 : list) {
                sb.append("\n");
                for (int i6 = 0; i6 <= i3; i6++) {
                    sb.append("  ");
                }
                setMin(0, 0, remoteInput$EditChoicesBeforeSending2, sb, z, i3 + 1);
            }
        }
    }

    public static String getMin(@Nullable LithoView lithoView) {
        if (lithoView == null) {
            return "";
        }
        String viewToString = viewToString(lithoView, true);
        if (!TextUtils.isEmpty(viewToString)) {
            return viewToString;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(lithoView.getLeft());
        sb.append(",");
        sb.append(lithoView.getTop());
        sb.append("-");
        sb.append(lithoView.getRight());
        sb.append(",");
        sb.append(lithoView.getBottom());
        sb.append(")");
        return sb.toString();
    }
}

package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import o.setPositiveButtonIcon;

public final class updateHoveredVirtualView {
    private static final setPositiveButtonIcon.setMax<setMax> length = new setPositiveButtonIcon.setMax<>(20);
    private static updateHoveredVirtualView setMax;
    private boolean equals = false;
    @GuardedBy("this")
    private final ArrayList<createNodeForChild> getMax = new ArrayList<>();
    @GuardedBy("this")
    private final onVirtualViewKeyboardFocusChanged getMin;
    @GuardedBy("this")
    private final ArrayList<getFocusedVirtualView> setMin = new ArrayList<>();
    @GuardedBy("this")
    private final Map<createNodeForChild, setMax> toIntRange = new HashMap();

    public static updateHoveredVirtualView setMax() {
        if (setMax == null) {
            clickKeyboardFocusedVirtualView clickkeyboardfocusedvirtualview = new clickKeyboardFocusedVirtualView();
            updateHoveredVirtualView updatehoveredvirtualview = new updateHoveredVirtualView(clickkeyboardfocusedvirtualview);
            setMax = updatehoveredvirtualview;
            clickkeyboardfocusedvirtualview.length = updatehoveredvirtualview;
        }
        return setMax;
    }

    static class setMax {
        int length;
        /* access modifiers changed from: package-private */
        public boolean setMax;

        private setMax() {
            this.setMax = false;
            this.length = 0;
        }

        /* synthetic */ setMax(byte b) {
            this();
        }
    }

    private updateHoveredVirtualView(onVirtualViewKeyboardFocusChanged onvirtualviewkeyboardfocuschanged) {
        this.getMin = onvirtualviewkeyboardfocuschanged;
    }

    public final synchronized void setMax(getFocusedVirtualView getfocusedvirtualview) {
        if (getfocusedvirtualview.getMax()) {
            this.setMin.add(getfocusedvirtualview);
            getMax(getfocusedvirtualview);
            if (this.setMin.size() == 1) {
                this.getMin.length();
            }
            this.equals = true;
        } else {
            throw new RuntimeException("Expected added GraphBinding to be active: ".concat(String.valueOf(getfocusedvirtualview)));
        }
    }

    public final synchronized void setMin(getFocusedVirtualView getfocusedvirtualview) {
        if (this.setMin.remove(getfocusedvirtualview)) {
            getMin(getfocusedvirtualview);
            if (this.setMin.isEmpty()) {
                this.getMin.getMin();
                this.getMax.clear();
                if (!this.toIntRange.isEmpty()) {
                    throw new RuntimeException("Failed to clean up all nodes");
                }
            }
            this.equals = true;
        } else {
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0143 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void setMax(long r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.equals     // Catch:{ all -> 0x0198 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00f2
            java.util.ArrayList<o.createNodeForChild> r0 = r11.getMax     // Catch:{ all -> 0x0198 }
            r0.clear()     // Catch:{ all -> 0x0198 }
            java.util.ArrayList<o.getFocusedVirtualView> r0 = r11.setMin     // Catch:{ all -> 0x0198 }
            int r0 = r0.size()     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x00f2
            o.onPopulateEventForHost r0 = o.NotificationCompatSideChannelService.toDoubleRange()     // Catch:{ all -> 0x0198 }
            o.PlaybackStateCompat$RepeatMode r3 = new o.PlaybackStateCompat$RepeatMode     // Catch:{ all -> 0x0198 }
            r3.<init>()     // Catch:{ all -> 0x0198 }
            java.util.ArrayList<o.getFocusedVirtualView> r4 = r11.setMin     // Catch:{ all -> 0x0198 }
            int r4 = r4.size()     // Catch:{ all -> 0x0198 }
            r5 = 0
        L_0x0024:
            if (r5 >= r4) goto L_0x005c
            java.util.ArrayList<o.getFocusedVirtualView> r6 = r11.setMin     // Catch:{ all -> 0x0198 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0198 }
            o.getFocusedVirtualView r6 = (o.getFocusedVirtualView) r6     // Catch:{ all -> 0x0198 }
            java.util.ArrayList<o.createNodeForChild> r6 = r6.length     // Catch:{ all -> 0x0198 }
            int r7 = r6.size()     // Catch:{ all -> 0x0198 }
            r8 = 0
        L_0x0035:
            if (r8 >= r7) goto L_0x0059
            java.lang.Object r9 = r6.get(r8)     // Catch:{ all -> 0x0198 }
            o.createNodeForChild r9 = (o.createNodeForChild) r9     // Catch:{ all -> 0x0198 }
            java.util.ArrayList<o.createNodeForChild> r10 = r9.getMin     // Catch:{ all -> 0x0198 }
            if (r10 != 0) goto L_0x0043
            r10 = 0
            goto L_0x0049
        L_0x0043:
            java.util.ArrayList<o.createNodeForChild> r10 = r9.getMin     // Catch:{ all -> 0x0198 }
            int r10 = r10.size()     // Catch:{ all -> 0x0198 }
        L_0x0049:
            if (r10 != 0) goto L_0x004f
            r0.add(r9)     // Catch:{ all -> 0x0198 }
            goto L_0x0056
        L_0x004f:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0198 }
            r3.put(r9, r10)     // Catch:{ all -> 0x0198 }
        L_0x0056:
            int r8 = r8 + 1
            goto L_0x0035
        L_0x0059:
            int r5 = r5 + 1
            goto L_0x0024
        L_0x005c:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x0071
            boolean r4 = r0.isEmpty()     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x0069
            goto L_0x0071
        L_0x0069:
            com.facebook.litho.dataflow.DetectedCycleException r12 = new com.facebook.litho.dataflow.DetectedCycleException     // Catch:{ all -> 0x0198 }
            java.lang.String r13 = "Graph has nodes, but they represent a cycle with no leaf nodes!"
            r12.<init>(r13)     // Catch:{ all -> 0x0198 }
            throw r12     // Catch:{ all -> 0x0198 }
        L_0x0071:
            java.util.ArrayDeque r4 = o.NotificationCompatSideChannelService.FastBitmap$CoordinateSystem()     // Catch:{ all -> 0x0198 }
            r4.addAll(r0)     // Catch:{ all -> 0x0198 }
        L_0x0078:
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0198 }
            if (r5 != 0) goto L_0x00cb
            java.lang.Object r5 = r4.pollFirst()     // Catch:{ all -> 0x0198 }
            o.createNodeForChild r5 = (o.createNodeForChild) r5     // Catch:{ all -> 0x0198 }
            java.util.ArrayList<o.createNodeForChild> r6 = r11.getMax     // Catch:{ all -> 0x0198 }
            r6.add(r5)     // Catch:{ all -> 0x0198 }
            java.util.Map<java.lang.String, o.createNodeForChild> r6 = r5.length     // Catch:{ all -> 0x0198 }
            if (r6 != 0) goto L_0x0092
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0198 }
            goto L_0x0098
        L_0x0092:
            java.util.Map<java.lang.String, o.createNodeForChild> r5 = r5.length     // Catch:{ all -> 0x0198 }
            java.util.Collection r5 = r5.values()     // Catch:{ all -> 0x0198 }
        L_0x0098:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0198 }
        L_0x009c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0198 }
            if (r6 == 0) goto L_0x0078
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0198 }
            o.createNodeForChild r6 = (o.createNodeForChild) r6     // Catch:{ all -> 0x0198 }
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0198 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0198 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0198 }
            int r7 = r7 - r1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0198 }
            r3.put(r6, r8)     // Catch:{ all -> 0x0198 }
            if (r7 != 0) goto L_0x00c0
            r4.addLast(r6)     // Catch:{ all -> 0x0198 }
            goto L_0x009c
        L_0x00c0:
            if (r7 < 0) goto L_0x00c3
            goto L_0x009c
        L_0x00c3:
            com.facebook.litho.dataflow.DetectedCycleException r12 = new com.facebook.litho.dataflow.DetectedCycleException     // Catch:{ all -> 0x0198 }
            java.lang.String r13 = "Detected cycle."
            r12.<init>(r13)     // Catch:{ all -> 0x0198 }
            throw r12     // Catch:{ all -> 0x0198 }
        L_0x00cb:
            int r3 = r3.size()     // Catch:{ all -> 0x0198 }
            int r5 = r0.size()     // Catch:{ all -> 0x0198 }
            int r3 = r3 + r5
            java.util.ArrayList<o.createNodeForChild> r5 = r11.getMax     // Catch:{ all -> 0x0198 }
            int r5 = r5.size()     // Catch:{ all -> 0x0198 }
            if (r5 != r3) goto L_0x00ea
            java.util.ArrayList<o.createNodeForChild> r3 = r11.getMax     // Catch:{ all -> 0x0198 }
            java.util.Collections.reverse(r3)     // Catch:{ all -> 0x0198 }
            r11.equals = r2     // Catch:{ all -> 0x0198 }
            o.NotificationCompatSideChannelService.setMax((java.util.ArrayDeque) r4)     // Catch:{ all -> 0x0198 }
            o.NotificationCompatSideChannelService.setMax((o.onPopulateEventForHost) r0)     // Catch:{ all -> 0x0198 }
            goto L_0x00f2
        L_0x00ea:
            com.facebook.litho.dataflow.DetectedCycleException r12 = new com.facebook.litho.dataflow.DetectedCycleException     // Catch:{ all -> 0x0198 }
            java.lang.String r13 = "Had unreachable nodes in graph -- this likely means there was a cycle"
            r12.<init>(r13)     // Catch:{ all -> 0x0198 }
            throw r12     // Catch:{ all -> 0x0198 }
        L_0x00f2:
            java.util.ArrayList<o.createNodeForChild> r0 = r11.getMax     // Catch:{ all -> 0x0198 }
            int r0 = r0.size()     // Catch:{ all -> 0x0198 }
            r3 = 0
        L_0x00f9:
            if (r3 >= r0) goto L_0x0109
            java.util.ArrayList<o.createNodeForChild> r4 = r11.getMax     // Catch:{ all -> 0x0198 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0198 }
            o.createNodeForChild r4 = (o.createNodeForChild) r4     // Catch:{ all -> 0x0198 }
            r4.getMax((long) r12)     // Catch:{ all -> 0x0198 }
            int r3 = r3 + 1
            goto L_0x00f9
        L_0x0109:
            java.util.ArrayList<o.createNodeForChild> r12 = r11.getMax     // Catch:{ all -> 0x0198 }
            int r12 = r12.size()     // Catch:{ all -> 0x0198 }
            r13 = 0
        L_0x0110:
            if (r13 >= r12) goto L_0x0146
            java.util.ArrayList<o.createNodeForChild> r0 = r11.getMax     // Catch:{ all -> 0x0198 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x0198 }
            o.createNodeForChild r0 = (o.createNodeForChild) r0     // Catch:{ all -> 0x0198 }
            java.util.Map<o.createNodeForChild, o.updateHoveredVirtualView$setMax> r3 = r11.toIntRange     // Catch:{ all -> 0x0198 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0198 }
            o.updateHoveredVirtualView$setMax r3 = (o.updateHoveredVirtualView.setMax) r3     // Catch:{ all -> 0x0198 }
            boolean r4 = r3.setMax     // Catch:{ all -> 0x0198 }
            if (r4 != 0) goto L_0x0143
            boolean r4 = r11.setMax((o.createNodeForChild) r0)     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x0143
            boolean r4 = r0 instanceof o.invalidateVirtualView     // Catch:{ all -> 0x0198 }
            if (r4 == 0) goto L_0x013d
            o.invalidateVirtualView r0 = (o.invalidateVirtualView) r0     // Catch:{ all -> 0x0198 }
            boolean r0 = r0.getMin()     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            r0 = 0
            goto L_0x013e
        L_0x013d:
            r0 = 1
        L_0x013e:
            if (r0 == 0) goto L_0x0143
            boolean unused = r3.setMax = true     // Catch:{ all -> 0x0198 }
        L_0x0143:
            int r13 = r13 + 1
            goto L_0x0110
        L_0x0146:
            java.util.ArrayList<o.getFocusedVirtualView> r12 = r11.setMin     // Catch:{ all -> 0x0198 }
            int r12 = r12.size()     // Catch:{ all -> 0x0198 }
            int r12 = r12 - r1
        L_0x014d:
            if (r12 < 0) goto L_0x0196
            java.util.ArrayList<o.getFocusedVirtualView> r13 = r11.setMin     // Catch:{ all -> 0x0198 }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ all -> 0x0198 }
            o.getFocusedVirtualView r13 = (o.getFocusedVirtualView) r13     // Catch:{ all -> 0x0198 }
            java.util.ArrayList<o.createNodeForChild> r0 = r13.length     // Catch:{ all -> 0x0198 }
            int r3 = r0.size()     // Catch:{ all -> 0x0198 }
            r4 = 0
        L_0x015e:
            if (r4 >= r3) goto L_0x0177
            java.util.Map<o.createNodeForChild, o.updateHoveredVirtualView$setMax> r5 = r11.toIntRange     // Catch:{ all -> 0x0198 }
            java.lang.Object r6 = r0.get(r4)     // Catch:{ all -> 0x0198 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0198 }
            o.updateHoveredVirtualView$setMax r5 = (o.updateHoveredVirtualView.setMax) r5     // Catch:{ all -> 0x0198 }
            boolean r5 = r5.setMax     // Catch:{ all -> 0x0198 }
            if (r5 != 0) goto L_0x0174
            r0 = 0
            goto L_0x0178
        L_0x0174:
            int r4 = r4 + 1
            goto L_0x015e
        L_0x0177:
            r0 = 1
        L_0x0178:
            if (r0 == 0) goto L_0x0193
            o.invalidateRoot r0 = r13.getMin     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0183
            o.invalidateRoot r0 = r13.getMin     // Catch:{ all -> 0x0198 }
            r0.getMax()     // Catch:{ all -> 0x0198 }
        L_0x0183:
            boolean r0 = r13.setMin     // Catch:{ all -> 0x0198 }
            if (r0 == 0) goto L_0x0193
            r13.setMin = r2     // Catch:{ all -> 0x0198 }
            o.updateHoveredVirtualView r0 = r13.getMax     // Catch:{ all -> 0x0198 }
            r0.setMin(r13)     // Catch:{ all -> 0x0198 }
            o.getFocusedVirtualView$getMin r13 = r13.setMax     // Catch:{ all -> 0x0198 }
            r13.setMax()     // Catch:{ all -> 0x0198 }
        L_0x0193:
            int r12 = r12 + -1
            goto L_0x014d
        L_0x0196:
            monitor-exit(r11)
            return
        L_0x0198:
            r12 = move-exception
            monitor-exit(r11)
            goto L_0x019c
        L_0x019b:
            throw r12
        L_0x019c:
            goto L_0x019b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.updateHoveredVirtualView.setMax(long):void");
    }

    @GuardedBy("this")
    private boolean setMax(createNodeForChild createnodeforchild) {
        Collection<createNodeForChild> collection;
        if (createnodeforchild.length == null) {
            collection = Collections.emptySet();
        } else {
            collection = createnodeforchild.length.values();
        }
        for (createNodeForChild createnodeforchild2 : collection) {
            if (!this.toIntRange.get(createnodeforchild2).setMax) {
                return false;
            }
        }
        return true;
    }

    @GuardedBy("this")
    private void getMax(getFocusedVirtualView getfocusedvirtualview) {
        ArrayList<createNodeForChild> arrayList = getfocusedvirtualview.length;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            createNodeForChild createnodeforchild = arrayList.get(i);
            setMax setmax = this.toIntRange.get(createnodeforchild);
            if (setmax != null) {
                setmax.length++;
            } else {
                setMax max = length.getMax();
                if (max == null) {
                    max = new setMax((byte) 0);
                }
                max.length = 1;
                this.toIntRange.put(createnodeforchild, max);
            }
        }
    }

    @GuardedBy("this")
    private void getMin(getFocusedVirtualView getfocusedvirtualview) {
        ArrayList<createNodeForChild> arrayList = getfocusedvirtualview.length;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            createNodeForChild createnodeforchild = arrayList.get(i);
            setMax setmax = this.toIntRange.get(createnodeforchild);
            setmax.length--;
            if (setmax.length == 0) {
                setMax remove = this.toIntRange.remove(createnodeforchild);
                remove.setMax = false;
                remove.length = 0;
                length.getMin(remove);
            }
        }
    }
}

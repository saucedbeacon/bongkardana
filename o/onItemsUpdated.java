package o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zhuinden.simplestack.PendingStateChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import o.viewNeedsUpdate;

public class onItemsUpdated {
    public static final int INITIALIZE = 0;
    public static final int REATTACH = 1;
    private LinkedList<setMin> completionListeners = new LinkedList<>();
    private final List<Object> initialKeys;
    private List<Object> initialParameters;
    private final List<Object> originalStack;
    private LinkedList<PendingStateChange> queuedStateChanges = new LinkedList<>();
    private List<Object> stack;
    private viewNeedsUpdate stateChanger;

    public interface setMin {
        void stateChangeCompleted(@NonNull isItemRemoved isitemremoved);
    }

    public static <K> K getKey(@NonNull Context context) {
        return getColumnCountForAccessibility.getKey(context);
    }

    public onItemsUpdated(@NonNull Object... objArr) {
        ArrayList arrayList = new ArrayList();
        this.originalStack = arrayList;
        this.stack = arrayList;
        if (objArr == null || objArr.length <= 0) {
            throw new IllegalArgumentException("At least one initial key must be defined");
        }
        this.initialKeys = Collections.unmodifiableList(new ArrayList(Arrays.asList(objArr)));
        setInitialParameters(new ArrayList(this.initialKeys));
    }

    public onItemsUpdated(@NonNull List<?> list) {
        ArrayList arrayList = new ArrayList();
        this.originalStack = arrayList;
        this.stack = arrayList;
        if (list == null) {
            throw new NullPointerException("Initial key list should not be null");
        } else if (list.size() > 0) {
            this.initialKeys = Collections.unmodifiableList(new ArrayList(list));
            setInitialParameters(new ArrayList(this.initialKeys));
        } else {
            throw new IllegalArgumentException("Initial key list should contain at least one element");
        }
    }

    /* access modifiers changed from: package-private */
    public void setInitialParameters(List<?> list) {
        if (list == null || list.size() <= 0) {
            throw new IllegalArgumentException("At least one initial key must be defined");
        }
        this.initialParameters = new ArrayList(list);
    }

    public boolean hasStateChanger() {
        return this.stateChanger != null;
    }

    public void setStateChanger(@NonNull viewNeedsUpdate viewneedsupdate) {
        setStateChanger(viewneedsupdate, 0);
    }

    public void setStateChanger(@NonNull viewNeedsUpdate viewneedsupdate, int i) {
        if (viewneedsupdate != null) {
            this.stateChanger = viewneedsupdate;
            if (i != 0 || (this.queuedStateChanges.size() > 1 && !this.stack.isEmpty())) {
                beginStateChangeIfPossible();
            } else if (!beginStateChangeIfPossible()) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(selectActiveHistory());
                this.stack = this.initialParameters;
                enqueueStateChange(arrayList, 0, true);
            }
        } else {
            throw new NullPointerException("New state changer cannot be null");
        }
    }

    public void removeStateChanger() {
        this.stateChanger = null;
    }

    public void goTo(@NonNull Object obj) {
        int i;
        checkNewKey(obj);
        isLayoutHierarchical builderFrom = performAccessibilityActionForItem.builderFrom(selectActiveHistory());
        if (builderFrom.contains(obj)) {
            builderFrom.removeUntil(obj);
            i = -1;
        } else {
            builderFrom.add(obj);
            i = 1;
        }
        setHistory(builderFrom.build(), i);
    }

    public void replaceTop(@NonNull Object obj, int i) {
        checkNewKey(obj);
        isLayoutHierarchical builderFrom = performAccessibilityActionForItem.builderFrom(selectActiveHistory());
        if (!builderFrom.isEmpty()) {
            builderFrom.removeLast();
        }
        builderFrom.add(obj);
        setHistory(builderFrom.build(), i);
    }

    public void goUp(@NonNull Object obj) {
        goUp(obj, false);
    }

    public void goUp(@NonNull Object obj, boolean z) {
        checkNewKey(obj);
        List<?> selectActiveHistory = selectActiveHistory();
        if (selectActiveHistory.size() <= 1) {
            replaceTop(obj, -1);
        } else if (!selectActiveHistory.contains(obj)) {
            replaceTop(obj, -1);
        } else if (z) {
            setHistory(performAccessibilityActionForItem.builderFrom(selectActiveHistory).removeLast().build(), -1);
        } else {
            goTo(obj);
        }
    }

    public void moveToTop(@NonNull Object obj, boolean z) {
        checkNewKey(obj);
        boolean z2 = !z;
        isLayoutHierarchical builderFrom = performAccessibilityActionForItem.builderFrom(selectActiveHistory());
        if (builderFrom.contains(obj)) {
            builderFrom.remove(obj);
        }
        builderFrom.add(obj);
        setHistory(builderFrom.build(), z2 ? 1 : 0);
    }

    public void moveToTop(@NonNull Object obj) {
        moveToTop(obj, false);
    }

    public void jumpToRoot() {
        setHistory(performAccessibilityActionForItem.of(performAccessibilityActionForItem.from(selectActiveHistory()).root()), -1);
    }

    public void goUpChain(@NonNull List<?> list) {
        goUpChain(list, false);
    }

    public void goUpChain(@NonNull List<?> list, boolean z) {
        checkNewHistory(list);
        int size = list.size();
        if (size == 1) {
            goUp(list.get(0), z);
            return;
        }
        isLayoutHierarchical builderFrom = performAccessibilityActionForItem.builderFrom(selectActiveHistory());
        builderFrom.removeLast();
        if (Collections.indexOfSubList(builderFrom.build(), list) == -1) {
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (builderFrom.contains(obj)) {
                    int indexOf = builderFrom.indexOf(obj);
                    isLayoutHierarchical newBuilder = performAccessibilityActionForItem.newBuilder();
                    for (int i2 = 0; i2 < indexOf; i2++) {
                        newBuilder.add(builderFrom.get(i2));
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        Object obj2 = list.get(i3);
                        if (newBuilder.contains(obj2)) {
                            newBuilder.remove(obj2);
                        }
                        newBuilder.add(obj2);
                    }
                    setHistory(newBuilder.build(), -1);
                    return;
                }
            }
            setHistory(builderFrom.addAll(list).build(), -1);
        } else if (z) {
            setHistory(builderFrom.build(), -1);
        } else {
            goTo(list.get(size - 1));
        }
    }

    public boolean goBack() {
        if (isStateChangePending()) {
            return true;
        }
        if (this.stack.size() <= 1) {
            return false;
        }
        isLayoutHierarchical builderFrom = performAccessibilityActionForItem.builderFrom(selectActiveHistory());
        builderFrom.removeLast();
        setHistory(builderFrom.build(), -1);
        return true;
    }

    private void resetBackstack() {
        this.stack.clear();
        this.initialParameters = new ArrayList(this.initialKeys);
    }

    public void reset() {
        assertNoStateChange();
        resetBackstack();
    }

    public void setHistory(@NonNull List<?> list, int i) {
        checkNewHistory(list);
        enqueueStateChange(list, i, false);
    }

    @Nullable
    public <K> K root() {
        if (this.stack.isEmpty()) {
            return null;
        }
        return this.stack.get(0);
    }

    @Nullable
    public <K> K top() {
        if (this.stack.isEmpty()) {
            return null;
        }
        List<Object> list = this.stack;
        return list.get(list.size() - 1);
    }

    @NonNull
    public <K> K fromTop(int i) {
        int size = this.stack.size();
        if (size > 0) {
            int i2 = -size;
            if (i < i2 || i >= size) {
                StringBuilder sb = new StringBuilder("The provided offset value [");
                sb.append(i);
                sb.append("] was out of range: [");
                sb.append(i2);
                sb.append("; ");
                sb.append(size);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
            while (i < 0) {
                i += size;
            }
            return this.stack.get(((size - 1) - (i % size)) % size);
        }
        throw new IllegalStateException("Cannot obtain elements from an uninitialized backstack.");
    }

    @NonNull
    public <K> performAccessibilityActionForItem<K> getHistory() {
        ArrayList arrayList = new ArrayList(this.stack.size());
        for (Object add : this.stack) {
            arrayList.add(add);
        }
        return performAccessibilityActionForItem.from(arrayList);
    }

    @NonNull
    public <K> performAccessibilityActionForItem<K> getInitialKeys() {
        ArrayList arrayList = new ArrayList(this.initialKeys.size());
        for (Object add : this.initialKeys) {
            arrayList.add(add);
        }
        return performAccessibilityActionForItem.from(arrayList);
    }

    public boolean isStateChangePending() {
        return !this.queuedStateChanges.isEmpty();
    }

    private void enqueueStateChange(List<?> list, int i, boolean z) {
        this.queuedStateChanges.add(new PendingStateChange(list, i, z));
        beginStateChangeIfPossible();
    }

    private List<?> selectActiveHistory() {
        if (this.stack.isEmpty() && this.queuedStateChanges.size() <= 0) {
            return this.initialParameters;
        }
        if (this.queuedStateChanges.size() <= 0) {
            return this.stack;
        }
        return this.queuedStateChanges.getLast().newHistory;
    }

    private boolean beginStateChangeIfPossible() {
        if (!hasStateChanger() || !isStateChangePending()) {
            return false;
        }
        PendingStateChange first = this.queuedStateChanges.getFirst();
        if (first.getStatus() != PendingStateChange.Status.ENQUEUED) {
            return false;
        }
        first.setStatus(PendingStateChange.Status.IN_PROGRESS);
        changeState(first);
        return true;
    }

    private void changeState(final PendingStateChange pendingStateChange) {
        List list;
        boolean z = pendingStateChange.initialization;
        List<?> list2 = pendingStateChange.newHistory;
        int i = pendingStateChange.direction;
        if (z) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList();
            list.addAll(this.stack);
        }
        final isItemRemoved isitemremoved = new isItemRemoved(this, Collections.unmodifiableList(list), Collections.unmodifiableList(list2), i);
        AnonymousClass1 r0 = new viewNeedsUpdate.getMax() {
            public final void stateChangeComplete() {
                if (pendingStateChange.didForceExecute) {
                    return;
                }
                if (pendingStateChange.getStatus() != PendingStateChange.Status.COMPLETED) {
                    onItemsUpdated.this.completeStateChange(isitemremoved);
                    return;
                }
                throw new IllegalStateException("State change completion cannot be called multiple times!");
            }
        };
        pendingStateChange.completionCallback = r0;
        this.stateChanger.handleStateChange(isitemremoved, r0);
    }

    /* access modifiers changed from: private */
    public void completeStateChange(isItemRemoved isitemremoved) {
        if (this.initialParameters == this.stack) {
            this.stack = this.originalStack;
        }
        this.stack.clear();
        this.stack.addAll(isitemremoved.newState);
        this.queuedStateChanges.removeFirst().setStatus(PendingStateChange.Status.COMPLETED);
        notifyCompletionListeners(isitemremoved);
        beginStateChangeIfPossible();
    }

    public void addCompletionListener(@NonNull setMin setmin) {
        if (setmin != null) {
            this.completionListeners.add(setmin);
            return;
        }
        throw new IllegalArgumentException("Null completion listener cannot be added!");
    }

    public void removeCompletionListener(@NonNull setMin setmin) {
        if (setmin != null) {
            this.completionListeners.remove(setmin);
            return;
        }
        throw new IllegalArgumentException("Null completion listener cannot be removed!");
    }

    public void removeCompletionListeners() {
        this.completionListeners.clear();
    }

    private void notifyCompletionListeners(isItemRemoved isitemremoved) {
        Iterator<setMin> it = this.completionListeners.iterator();
        while (it.hasNext()) {
            it.next().stateChangeCompleted(isitemremoved);
        }
    }

    public void executePendingStateChange() {
        if (isStateChangePending()) {
            PendingStateChange first = this.queuedStateChanges.getFirst();
            if (first.getStatus() == PendingStateChange.Status.IN_PROGRESS) {
                first.completionCallback.stateChangeComplete();
                first.didForceExecute = true;
            }
        }
    }

    private void checkNewHistory(List<?> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("New history cannot be null or empty");
        }
    }

    private void checkNewKey(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
    }

    private void assertNoStateChange() {
        if (isStateChangePending()) {
            throw new IllegalStateException("This operation is not allowed while there are enqueued state changes.");
        }
    }
}

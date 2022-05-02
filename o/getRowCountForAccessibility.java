package o;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zhuinden.simplestack.ParcelledState;
import com.zhuinden.statebundle.StateBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.onItemsUpdated;
import o.viewNeedsUpdate;

public class getRowCountForAccessibility implements requestSimpleAnimationsInNextLayout {
    private static final String HISTORY_TAG = "HISTORY";
    private static final String STATES_TAG = "STATES";
    onItemsUpdated backstack;
    private getProperties keyFilter = new removeAndRecycleAllViews();
    private hasFlexibleChildInBothOrientations keyParceler = new onInitializeAccessibilityNodeInfoForItem();
    Map<Object, isViewInvalid> keyStateMap = new HashMap();
    private final viewNeedsUpdate managedStateChanger = new viewNeedsUpdate() {
        public void handleStateChange(@NonNull final isItemRemoved isitemremoved, @NonNull final viewNeedsUpdate.getMax getmax) {
            getRowCountForAccessibility.this.stateChanger.handleStateChange(isitemremoved, new viewNeedsUpdate.getMax() {
                public final void stateChangeComplete() {
                    getmax.stateChangeComplete();
                    if (!getRowCountForAccessibility.this.backstack.isStateChangePending()) {
                        getRowCountForAccessibility.this.stateClearStrategy.clearStatesNotIn(getRowCountForAccessibility.this.keyStateMap, isitemremoved);
                    }
                }
            });
        }
    };
    viewNeedsUpdate stateChanger;
    /* access modifiers changed from: private */
    public getMax stateClearStrategy = new setExactMeasureSpecsFrom();

    public interface getMax {
        void clearStatesNotIn(@NonNull Map<Object, isViewInvalid> map, @NonNull isItemRemoved isitemremoved);
    }

    static String getHistoryTag() {
        return HISTORY_TAG;
    }

    static String getStatesTag() {
        return STATES_TAG;
    }

    public void setKeyFilter(@NonNull getProperties getproperties) {
        if (this.backstack != null) {
            throw new IllegalStateException("Custom key filter should be set before calling `setup()`");
        } else if (getproperties != null) {
            this.keyFilter = getproperties;
        } else {
            throw new IllegalArgumentException("The key filter cannot be null!");
        }
    }

    public void setKeyParceler(@NonNull hasFlexibleChildInBothOrientations hasflexiblechildinbothorientations) {
        if (this.backstack != null) {
            throw new IllegalStateException("Custom key parceler should be set before calling `setup()`");
        } else if (hasflexiblechildinbothorientations != null) {
            this.keyParceler = hasflexiblechildinbothorientations;
        } else {
            throw new IllegalArgumentException("The key parceler cannot be null!");
        }
    }

    public void setStateClearStrategy(@NonNull getMax getmax) {
        if (this.backstack != null) {
            throw new IllegalStateException("Custom state clear strategy should be set before calling `setup()`");
        } else if (getmax != null) {
            this.stateClearStrategy = getmax;
        } else {
            throw new IllegalArgumentException("The state clear strategy cannot be null!");
        }
    }

    public void setup(@NonNull List<?> list) {
        this.backstack = new onItemsUpdated(list);
    }

    public onItemsUpdated getBackstack() {
        checkBackstack("You must call `setup()` before calling `getBackstack()`");
        return this.backstack;
    }

    private void initializeBackstack(viewNeedsUpdate viewneedsupdate) {
        if (viewneedsupdate != null) {
            this.backstack.setStateChanger(this.managedStateChanger);
        }
    }

    public void setStateChanger(@Nullable viewNeedsUpdate viewneedsupdate) {
        checkBackstack("You must call `setup()` before calling `setStateChanger().");
        if (this.backstack.hasStateChanger()) {
            this.backstack.removeStateChanger();
        }
        this.stateChanger = viewneedsupdate;
        initializeBackstack(viewneedsupdate);
    }

    public void detachStateChanger() {
        checkBackstack("You must call `setup()` before calling `detachStateChanger().`");
        if (this.backstack.hasStateChanger()) {
            this.backstack.removeStateChanger();
        }
    }

    public void reattachStateChanger() {
        checkBackstack("You must call `setup()` before calling `reattachStateChanger().`");
        if (!this.backstack.hasStateChanger()) {
            this.backstack.setStateChanger(this.managedStateChanger, 1);
        }
    }

    @NonNull
    public isViewInvalid getSavedState(@NonNull Object obj) {
        if (obj != null) {
            if (!this.keyStateMap.containsKey(obj)) {
                this.keyStateMap.put(obj, isViewInvalid.builder().setKey(obj).build());
            }
            return this.keyStateMap.get(obj);
        }
        throw new IllegalArgumentException("Key cannot be null!");
    }

    public void persistViewToState(@Nullable View view) {
        if (view != null) {
            Object key = getColumnCountForAccessibility.getKey(view.getContext());
            if (key != null) {
                SparseArray sparseArray = new SparseArray();
                view.saveHierarchyState(sparseArray);
                StateBundle stateBundle = null;
                if (view instanceof requestSimpleAnimationsInNextLayout) {
                    stateBundle = ((requestSimpleAnimationsInNextLayout) view).toBundle();
                }
                this.keyStateMap.put(key, isViewInvalid.builder().setKey(key).setViewHierarchyState(sparseArray).setBundle(stateBundle).build());
                return;
            }
            StringBuilder sb = new StringBuilder("The view [");
            sb.append(view);
            sb.append("] contained no key in its context hierarchy. The view or its parent hierarchy should be inflated by a layout inflater from `stateChange.createContext(baseContext, key)`, or a KeyContextWrapper.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void restoreViewFromState(@NonNull View view) {
        if (view != null) {
            isViewInvalid savedState = getSavedState(getColumnCountForAccessibility.getKey(view.getContext()));
            view.restoreHierarchyState(savedState.getViewHierarchyState());
            if (view instanceof requestSimpleAnimationsInNextLayout) {
                ((requestSimpleAnimationsInNextLayout) view).fromBundle(savedState.getBundle());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You cannot restore state into null view!");
    }

    public void addStateChangeCompletionListener(@NonNull onItemsUpdated.setMin setmin) {
        checkBackstack("A backstack must be set up before a state change completion listener is added to it.");
        if (setmin != null) {
            this.backstack.addCompletionListener(setmin);
            return;
        }
        throw new IllegalArgumentException("StateChangeCompletionListener cannot be null!");
    }

    public void removeStateChangeCompletionListener(@NonNull onItemsUpdated.setMin setmin) {
        checkBackstack("A backstack must be set up before a state change completion listener is removed from it.");
        if (setmin != null) {
            this.backstack.removeCompletionListener(setmin);
            return;
        }
        throw new IllegalArgumentException("StateChangeCompletionListener cannot be null!");
    }

    public void removeAllStateChangeCompletionListeners() {
        checkBackstack("A backstack must be set up before state change completion listeners are removed from it.");
        this.backstack.removeCompletionListeners();
    }

    public void fromBundle(@Nullable StateBundle stateBundle) {
        checkBackstack("A backstack must be set up before it is restored!");
        if (stateBundle != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Parcelable> min = stateBundle.getMin(getHistoryTag());
            if (min != null) {
                for (Parcelable fromParcelable : min) {
                    arrayList.add(this.keyParceler.fromParcelable(fromParcelable));
                }
            }
            List<Object> filterHistory = this.keyFilter.filterHistory(new ArrayList(arrayList));
            if (filterHistory == null) {
                filterHistory = Collections.emptyList();
            }
            if (!filterHistory.isEmpty()) {
                this.backstack.setInitialParameters(filterHistory);
            }
            ArrayList<ParcelledState> min2 = stateBundle.getMin(getStatesTag());
            if (min2 != null) {
                for (ParcelledState parcelledState : min2) {
                    Object fromParcelable2 = this.keyParceler.fromParcelable(parcelledState.parcelableKey);
                    if (filterHistory.contains(fromParcelable2)) {
                        isViewInvalid build = isViewInvalid.builder().setKey(fromParcelable2).setViewHierarchyState(parcelledState.viewHierarchyState).setBundle(parcelledState.bundle).build();
                        this.keyStateMap.put(build.getKey(), build);
                    }
                }
            }
        }
    }

    private void checkBackstack(String str) {
        if (this.backstack == null) {
            throw new IllegalStateException(str);
        }
    }

    @NonNull
    public StateBundle toBundle() {
        StateBundle stateBundle = new StateBundle();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.backstack.getHistory().iterator();
        while (it.hasNext()) {
            arrayList.add(this.keyParceler.toParcelable(it.next()));
        }
        String historyTag = getHistoryTag();
        stateBundle.setMin.put(historyTag, arrayList);
        stateBundle.length.put(historyTag, 29);
        ArrayList arrayList2 = new ArrayList();
        for (isViewInvalid next : this.keyStateMap.values()) {
            ParcelledState parcelledState = new ParcelledState();
            parcelledState.parcelableKey = this.keyParceler.toParcelable(next.getKey());
            parcelledState.viewHierarchyState = next.getViewHierarchyState();
            parcelledState.bundle = next.getBundle();
            arrayList2.add(parcelledState);
        }
        String statesTag = getStatesTag();
        stateBundle.setMin.put(statesTag, arrayList2);
        stateBundle.length.put(statesTag, 29);
        return stateBundle;
    }
}

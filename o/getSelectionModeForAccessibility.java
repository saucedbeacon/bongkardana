package o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zhuinden.statebundle.StateBundle;
import java.util.LinkedList;
import java.util.List;
import o.getRowCountForAccessibility;
import o.onItemsUpdated;

public class getSelectionModeForAccessibility {
    private static final String HISTORY = "simplestack.HISTORY";
    private static final String UNINITIALIZED = "";
    private getRowCountForAccessibility backstackManager;
    private getProperties keyFilter;
    private hasFlexibleChildInBothOrientations keyParceler;
    private String persistenceTag;
    private List<onItemsUpdated.setMin> stateChangeCompletionListeners;
    private viewNeedsUpdate stateChanger;
    private getRowCountForAccessibility.getMax stateClearStrategy;

    public void setKeyFilter(@NonNull getProperties getproperties) {
        getRowCountForAccessibility getrowcountforaccessibility = this.backstackManager;
        if (getrowcountforaccessibility != null && getrowcountforaccessibility.getBackstack() != null) {
            throw new IllegalStateException("If set, key filter must be set before calling `onCreate()`");
        } else if (getproperties != null) {
            this.keyFilter = getproperties;
        } else {
            throw new IllegalArgumentException("Specified custom key filter should not be null!");
        }
    }

    public void setKeyParceler(@NonNull hasFlexibleChildInBothOrientations hasflexiblechildinbothorientations) {
        getRowCountForAccessibility getrowcountforaccessibility = this.backstackManager;
        if (getrowcountforaccessibility != null && getrowcountforaccessibility.getBackstack() != null) {
            throw new IllegalStateException("If set, key parceler must set before calling `onCreate()`");
        } else if (hasflexiblechildinbothorientations != null) {
            this.keyParceler = hasflexiblechildinbothorientations;
        } else {
            throw new IllegalArgumentException("Specified custom key parceler should not be null!");
        }
    }

    public void setStateClearStrategy(@NonNull getRowCountForAccessibility.getMax getmax) {
        getRowCountForAccessibility getrowcountforaccessibility = this.backstackManager;
        if (getrowcountforaccessibility != null && getrowcountforaccessibility.getBackstack() != null) {
            throw new IllegalStateException("If set, state clear strategy must be set before calling `onCreate()`");
        } else if (getmax != null) {
            this.stateClearStrategy = getmax;
        } else {
            throw new IllegalArgumentException("Specified state clear strategy should not be null!");
        }
    }

    public void addStateChangeCompletionListener(@NonNull onItemsUpdated.setMin setmin) {
        getRowCountForAccessibility getrowcountforaccessibility = this.backstackManager;
        if (getrowcountforaccessibility != null && getrowcountforaccessibility.getBackstack() != null) {
            throw new IllegalStateException("If adding, completion listener must be added before calling `onCreate()`");
        } else if (setmin != null) {
            this.stateChangeCompletionListeners.add(setmin);
        } else {
            throw new IllegalArgumentException("Specified state change completion listener should not be null!");
        }
    }

    public void setPersistenceTag(@NonNull String str) {
        getRowCountForAccessibility getrowcountforaccessibility = this.backstackManager;
        if (getrowcountforaccessibility != null && getrowcountforaccessibility.getBackstack() != null) {
            throw new IllegalStateException("Persistence tag should be set before calling `onCreate()`");
        } else if (str != null) {
            String str2 = this.persistenceTag;
            if (str2 == "") {
                this.persistenceTag = str;
            } else if (!str2.equals(str)) {
                throw new IllegalStateException("The persistence tag cannot be set to a new value once it's already set!");
            }
        } else {
            throw new IllegalArgumentException("Null persistence tag is not allowed!");
        }
    }

    /* access modifiers changed from: package-private */
    public String getHistoryTag() {
        if ("".equals(this.persistenceTag)) {
            return HISTORY;
        }
        StringBuilder sb = new StringBuilder(HISTORY);
        sb.append(this.persistenceTag);
        return sb.toString();
    }

    public getSelectionModeForAccessibility() {
        this((viewNeedsUpdate) null);
    }

    public getSelectionModeForAccessibility(@Nullable viewNeedsUpdate viewneedsupdate) {
        this.persistenceTag = "";
        this.keyFilter = new removeAndRecycleAllViews();
        this.keyParceler = new onInitializeAccessibilityNodeInfoForItem();
        this.stateClearStrategy = new setExactMeasureSpecsFrom();
        this.stateChangeCompletionListeners = new LinkedList();
        this.stateChanger = viewneedsupdate;
    }

    @TargetApi(14)
    public void registerForLifecycleCallbacks(@NonNull final Activity activity) {
        if (activity != null) {
            getManager();
            final Application application = activity.getApplication();
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityResumed(Activity activity) {
                    if (activity == activity) {
                        getSelectionModeForAccessibility.this.onPostResume();
                    }
                }

                public final void onActivityPaused(Activity activity) {
                    if (activity == activity) {
                        getSelectionModeForAccessibility.this.onPause();
                    }
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    if (activity == activity) {
                        getSelectionModeForAccessibility.this.onSaveInstanceState(bundle);
                    }
                }

                public final void onActivityDestroyed(Activity activity) {
                    if (activity == activity) {
                        getSelectionModeForAccessibility.this.onDestroy();
                        application.unregisterActivityLifecycleCallbacks(this);
                    }
                }
            });
            return;
        }
        throw new NullPointerException("Activity is null");
    }

    public void onCreate(@Nullable Bundle bundle, @Nullable Object obj, @NonNull List<?> list) {
        if (obj == null || (obj instanceof getMax)) {
            getMax getmax = (getMax) obj;
            if (getmax != null) {
                this.backstackManager = getmax.getBackstackManager();
            }
            if (this.backstackManager == null) {
                getRowCountForAccessibility getrowcountforaccessibility = new getRowCountForAccessibility();
                this.backstackManager = getrowcountforaccessibility;
                getrowcountforaccessibility.setKeyFilter(this.keyFilter);
                this.backstackManager.setKeyParceler(this.keyParceler);
                this.backstackManager.setStateClearStrategy(this.stateClearStrategy);
                this.backstackManager.setup(list);
                for (onItemsUpdated.setMin addStateChangeCompletionListener : this.stateChangeCompletionListeners) {
                    this.backstackManager.addStateChangeCompletionListener(addStateChangeCompletionListener);
                }
                if (bundle != null) {
                    this.backstackManager.fromBundle((StateBundle) bundle.getParcelable(getHistoryTag()));
                }
            }
            this.backstackManager.setStateChanger(this.stateChanger);
            return;
        }
        throw new IllegalArgumentException("The provided non configuration instance must be of type BackstackDelegate.NonConfigurationInstance!");
    }

    public void setStateChanger(@Nullable viewNeedsUpdate viewneedsupdate) {
        this.stateChanger = viewneedsupdate;
        getRowCountForAccessibility getrowcountforaccessibility = this.backstackManager;
        if (getrowcountforaccessibility != null) {
            getrowcountforaccessibility.setStateChanger(viewneedsupdate);
        }
    }

    public getMax onRetainCustomNonConfigurationInstance() {
        return new getMax(this.backstackManager);
    }

    public boolean onBackPressed() {
        return getBackstack().goBack();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putParcelable(getHistoryTag(), getManager().toBundle());
    }

    public void onPostResume() {
        if (this.stateChanger != null) {
            getManager().reattachStateChanger();
            return;
        }
        throw new IllegalStateException("State changer is still not set in `onPostResume`!");
    }

    public void onPause() {
        getManager().detachStateChanger();
    }

    public void onDestroy() {
        getBackstack().executePendingStateChange();
    }

    @NonNull
    public onItemsUpdated getBackstack() {
        return getManager().getBackstack();
    }

    public void persistViewToState(@Nullable View view) {
        getManager().persistViewToState(view);
    }

    public void restoreViewFromState(@NonNull View view) {
        getManager().restoreViewFromState(view);
    }

    @NonNull
    public isViewInvalid getSavedState(@NonNull Object obj) {
        return getManager().getSavedState(obj);
    }

    @NonNull
    public getRowCountForAccessibility getManager() {
        getRowCountForAccessibility getrowcountforaccessibility = this.backstackManager;
        if (getrowcountforaccessibility != null) {
            return getrowcountforaccessibility;
        }
        throw new IllegalStateException("This method can only be called after calling `onCreate()`");
    }

    public static class getMax {
        private getRowCountForAccessibility backstackManager;

        getMax(getRowCountForAccessibility getrowcountforaccessibility) {
            this.backstackManager = getrowcountforaccessibility;
        }

        /* access modifiers changed from: package-private */
        public getRowCountForAccessibility getBackstackManager() {
            return this.backstackManager;
        }
    }
}

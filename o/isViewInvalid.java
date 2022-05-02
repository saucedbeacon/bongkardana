package o;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zhuinden.statebundle.StateBundle;

public class isViewInvalid {
    /* access modifiers changed from: private */
    public StateBundle bundle;
    /* access modifiers changed from: private */
    public Object key;
    /* access modifiers changed from: private */
    public SparseArray<Parcelable> viewHierarchyState;

    private isViewInvalid() {
    }

    @NonNull
    public Object getKey() {
        return this.key;
    }

    @NonNull
    public SparseArray<Parcelable> getViewHierarchyState() {
        return this.viewHierarchyState;
    }

    public void setViewHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.viewHierarchyState = sparseArray;
    }

    @Nullable
    public StateBundle getBundle() {
        return this.bundle;
    }

    public void setBundle(@Nullable StateBundle stateBundle) {
        this.bundle = stateBundle;
    }

    public static getMin builder() {
        return new getMin();
    }

    public static class getMin {
        private StateBundle bundle;
        private Object key;
        private SparseArray<Parcelable> viewHierarchyState = new SparseArray<>();

        getMin() {
        }

        public getMin setKey(@NonNull Object obj) {
            if (obj != null) {
                this.key = obj;
                return this;
            }
            throw new IllegalArgumentException("Key cannot be null");
        }

        public getMin setViewHierarchyState(@NonNull SparseArray<Parcelable> sparseArray) {
            if (sparseArray != null) {
                this.viewHierarchyState = sparseArray;
                return this;
            }
            throw new IllegalArgumentException("Provided sparse array for view hierarchy state cannot be null");
        }

        public getMin setBundle(@Nullable StateBundle stateBundle) {
            this.bundle = stateBundle;
            return this;
        }

        public isViewInvalid build() {
            if (this.key != null) {
                isViewInvalid isviewinvalid = new isViewInvalid();
                Object unused = isviewinvalid.key = this.key;
                SparseArray unused2 = isviewinvalid.viewHierarchyState = this.viewHierarchyState;
                StateBundle unused3 = isviewinvalid.bundle = this.bundle;
                return isviewinvalid;
            }
            throw new IllegalStateException("You cannot create a SavedState without associating a Key with it.");
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof isViewInvalid)) {
            return ((isViewInvalid) obj).getKey().equals(this.key);
        }
        return false;
    }

    public int hashCode() {
        return this.key.hashCode();
    }
}

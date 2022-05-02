package o;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import o.IResultReceiver;
import o.dispatchRestoreInstanceState;
import o.dispatchSubMenuSelected;
import o.onFinishInflate;

final class setDefaultShowAsAction extends dispatchSubMenuSelected {
    static boolean setMax = false;
    @NonNull
    private final setMax length;
    @NonNull
    private final setChecked setMin;

    public static class getMin<D> extends CascadingMenuPopup$HorizPosition<D> implements dispatchRestoreInstanceState.getMin<D> {
        @Nullable
        final Bundle IsOverlapping = null;
        length<D> hashCode;
        final int isInside = 0;
        private dispatchRestoreInstanceState<D> toDoubleRange;
        @NonNull
        final dispatchRestoreInstanceState<D> toIntRange;
        private setChecked values;

        getMin(@NonNull dispatchRestoreInstanceState<D> dispatchrestoreinstancestate) {
            this.toIntRange = dispatchrestoreinstancestate;
            this.toDoubleRange = null;
            dispatchrestoreinstancestate.registerListener(0, this);
        }

        public final void getMax() {
            boolean z = setDefaultShowAsAction.setMax;
            this.toIntRange.startLoading();
        }

        public final void length() {
            boolean z = setDefaultShowAsAction.setMax;
            this.toIntRange.stopLoading();
        }

        /* access modifiers changed from: package-private */
        @MainThread
        @NonNull
        public final dispatchRestoreInstanceState<D> getMax(@NonNull setChecked setchecked, @NonNull dispatchSubMenuSelected.getMax<D> getmax) {
            length<D> length = new length<>(this.toIntRange, getmax);
            getMax(setchecked, length);
            length<D> length2 = this.hashCode;
            if (length2 != null) {
                super.length(length2);
                this.values = null;
                this.hashCode = null;
            }
            this.values = setchecked;
            this.hashCode = length;
            return this.toIntRange;
        }

        /* access modifiers changed from: package-private */
        public final void getMin() {
            setChecked setchecked = this.values;
            length<D> length = this.hashCode;
            if (setchecked != null && length != null) {
                super.length(length);
                getMax(setchecked, length);
            }
        }

        public final void length(@NonNull onMeasure<? super D> onmeasure) {
            super.length(onmeasure);
            this.values = null;
            this.hashCode = null;
        }

        /* access modifiers changed from: package-private */
        @MainThread
        public final dispatchRestoreInstanceState<D> toFloatRange() {
            boolean z = setDefaultShowAsAction.setMax;
            this.toIntRange.cancelLoad();
            this.toIntRange.abandon();
            length<D> length = this.hashCode;
            if (length != null) {
                super.length(length);
                this.values = null;
                this.hashCode = null;
                if (length.setMax) {
                    boolean z2 = setDefaultShowAsAction.setMax;
                    length.getMax.onLoaderReset(length.getMin);
                }
            }
            this.toIntRange.unregisterListener(this);
            if (length != null) {
                length.length();
            }
            this.toIntRange.reset();
            return this.toDoubleRange;
        }

        public final void getMax(@NonNull dispatchRestoreInstanceState<D> dispatchrestoreinstancestate, @Nullable D d) {
            boolean z = setDefaultShowAsAction.setMax;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                super.getMax(d);
                dispatchRestoreInstanceState<D> dispatchrestoreinstancestate2 = this.toDoubleRange;
                if (dispatchrestoreinstancestate2 != null) {
                    dispatchrestoreinstancestate2.reset();
                    this.toDoubleRange = null;
                    return;
                }
                return;
            }
            boolean z2 = setDefaultShowAsAction.setMax;
            setMax(d);
        }

        public final void getMax(D d) {
            super.getMax(d);
            dispatchRestoreInstanceState<D> dispatchrestoreinstancestate = this.toDoubleRange;
            if (dispatchrestoreinstancestate != null) {
                dispatchrestoreinstancestate.reset();
                this.toDoubleRange = null;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.isInside);
            sb.append(" : ");
            setPositiveButton.setMax(this.toIntRange, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    static class length<D> implements onMeasure<D> {
        @NonNull
        final dispatchSubMenuSelected.getMax<D> getMax;
        @NonNull
        final dispatchRestoreInstanceState<D> getMin;
        boolean setMax = false;

        length(@NonNull dispatchRestoreInstanceState<D> dispatchrestoreinstancestate, @NonNull dispatchSubMenuSelected.getMax<D> getmax) {
            this.getMin = dispatchrestoreinstancestate;
            this.getMax = getmax;
        }

        public final void onChanged(@Nullable D d) {
            if (setDefaultShowAsAction.setMax) {
                this.getMin.dataToString(d);
            }
            this.getMax.onLoadFinished(this.getMin, d);
            this.setMax = true;
        }

        /* access modifiers changed from: package-private */
        public final boolean length() {
            return this.setMax;
        }

        public final String toString() {
            return this.getMax.toString();
        }
    }

    static class setMax extends setGroupDividerEnabled {
        private static final onFinishInflate.setMax length = new onFinishInflate.setMax() {
            @NonNull
            public final <T extends setGroupDividerEnabled> T getMin(@NonNull Class<T> cls) {
                return new setMax();
            }
        };
        boolean getMax = false;
        IResultReceiver.Stub<getMin> getMin = new IResultReceiver.Stub<>();

        setMax() {
        }

        @NonNull
        static setMax setMin(adjustListItemSelectionBounds adjustlistitemselectionbounds) {
            return (setMax) new onFinishInflate(adjustlistitemselectionbounds, length).setMax(setMax.class);
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax() {
            return this.getMax;
        }

        public final void getMin() {
            super.getMin();
            int min = this.getMin.getMin();
            for (int i = 0; i < min; i++) {
                this.getMin.IsOverlapping(i).toFloatRange();
            }
            this.getMin.length();
        }
    }

    setDefaultShowAsAction(@NonNull setChecked setchecked, @NonNull adjustListItemSelectionBounds adjustlistitemselectionbounds) {
        this.setMin = setchecked;
        this.length = setMax.setMin(adjustlistitemselectionbounds);
    }

    /* JADX INFO: finally extract failed */
    @MainThread
    @NonNull
    private <D> dispatchRestoreInstanceState<D> getMin(@NonNull dispatchSubMenuSelected.getMax<D> getmax) {
        try {
            this.length.getMax = true;
            dispatchRestoreInstanceState<D> onCreateLoader = getmax.onCreateLoader(0, (Bundle) null);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: ".concat(String.valueOf(onCreateLoader)));
                    }
                }
                getMin getmin = new getMin(onCreateLoader);
                this.length.getMin.setMax(0, getmin);
                this.length.getMax = false;
                return getmin.getMax(this.setMin, getmax);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.length.getMax = false;
            throw th;
        }
    }

    @MainThread
    @NonNull
    public final <D> dispatchRestoreInstanceState<D> getMax(@NonNull dispatchSubMenuSelected.getMax<D> getmax) {
        if (this.length.getMax()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            getMin min = this.length.getMin.setMin(0);
            if (min == null) {
                return getMin(getmax);
            }
            return min.getMax(this.setMin, getmax);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void getMax() {
        setMax setmax = this.length;
        int min = setmax.getMin.getMin();
        for (int i = 0; i < min; i++) {
            setmax.getMin.IsOverlapping(i).getMin();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        setPositiveButton.setMax(this.setMin, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Deprecated
    public final void setMin(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        setMax setmax = this.length;
        if (setmax.getMin.getMin() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("    ");
            String obj = sb.toString();
            for (int i = 0; i < setmax.getMin.getMin(); i++) {
                getMin IsOverlapping = setmax.getMin.IsOverlapping(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(setmax.getMin.getMin(i));
                printWriter.print(": ");
                printWriter.println(IsOverlapping.toString());
                printWriter.print(obj);
                printWriter.print("mId=");
                printWriter.print(IsOverlapping.isInside);
                printWriter.print(" mArgs=");
                printWriter.println(IsOverlapping.IsOverlapping);
                printWriter.print(obj);
                printWriter.print("mLoader=");
                printWriter.println(IsOverlapping.toIntRange);
                dispatchRestoreInstanceState<D> dispatchrestoreinstancestate = IsOverlapping.toIntRange;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("  ");
                dispatchrestoreinstancestate.dump(sb2.toString(), fileDescriptor, printWriter, strArr);
                if (IsOverlapping.hashCode != null) {
                    printWriter.print(obj);
                    printWriter.print("mCallbacks=");
                    printWriter.println(IsOverlapping.hashCode);
                    length<D> length2 = IsOverlapping.hashCode;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append("  ");
                    printWriter.print(sb3.toString());
                    printWriter.print("mDeliveredData=");
                    printWriter.println(length2.setMax);
                }
                printWriter.print(obj);
                printWriter.print("mData=");
                dispatchRestoreInstanceState<D> dispatchrestoreinstancestate2 = IsOverlapping.toIntRange;
                Object obj2 = IsOverlapping.setMin;
                if (obj2 == LiveData.setMax) {
                    obj2 = null;
                }
                printWriter.println(dispatchrestoreinstancestate2.dataToString(obj2));
                printWriter.print(obj);
                printWriter.print("mStarted=");
                printWriter.println(IsOverlapping.setMin());
            }
        }
    }
}

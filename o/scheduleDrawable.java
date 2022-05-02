package o;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class scheduleDrawable {
    public getMinimumWidth getMax;
    public final ArrayList<Fragment> getMin = new ArrayList<>();
    public final HashMap<String, unscheduleDrawable> length = new HashMap<>();

    public final void getMin(@Nullable List<String> list) {
        Fragment fragment;
        this.getMin.clear();
        if (list != null) {
            for (String next : list) {
                unscheduleDrawable unscheduledrawable = this.length.get(next);
                if (unscheduledrawable != null) {
                    fragment = unscheduledrawable.getMax;
                } else {
                    fragment = null;
                }
                if (fragment != null) {
                    FragmentManager.getMin(2);
                    setMin(fragment);
                } else {
                    StringBuilder sb = new StringBuilder("No instantiated fragment for (");
                    sb.append(next);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    public final void setMin(@NonNull Fragment fragment) {
        if (!this.getMin.contains(fragment)) {
            synchronized (this.getMin) {
                this.getMin.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
    }

    public final void getMin(int i) {
        for (unscheduleDrawable next : this.length.values()) {
            if (next != null) {
                next.setMin = i;
            }
        }
    }

    public final void setMax() {
        Iterator<Fragment> it = this.getMin.iterator();
        while (it.hasNext()) {
            unscheduleDrawable unscheduledrawable = this.length.get(it.next().mWho);
            if (unscheduledrawable != null) {
                unscheduledrawable.setMax();
            }
        }
        for (unscheduleDrawable next : this.length.values()) {
            if (next != null) {
                next.setMax();
                Fragment fragment = next.getMax;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    getMax(next);
                }
            }
        }
    }

    @Nullable
    public final ArrayList<String> setMin() {
        synchronized (this.getMin) {
            if (this.getMin.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.getMin.size());
            Iterator<Fragment> it = this.getMin.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mWho);
                FragmentManager.getMin(2);
            }
            return arrayList;
        }
    }

    @NonNull
    public final List<unscheduleDrawable> length() {
        ArrayList arrayList = new ArrayList();
        for (unscheduleDrawable next : this.length.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<Fragment> getMin() {
        ArrayList arrayList;
        if (this.getMin.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.getMin) {
            arrayList = new ArrayList(this.getMin);
        }
        return arrayList;
    }

    @NonNull
    public final List<Fragment> getMax() {
        ArrayList arrayList = new ArrayList();
        for (unscheduleDrawable next : this.length.values()) {
            if (next != null) {
                arrayList.add(next.getMax);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public final boolean setMax(@NonNull String str) {
        return this.length.get(str) != null;
    }

    @Nullable
    public final Fragment getMin(@NonNull String str) {
        Fragment findFragmentByWho;
        for (unscheduleDrawable next : this.length.values()) {
            if (next != null && (findFragmentByWho = next.getMax.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final int getMin(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.getMin.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.getMin.get(i);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return viewGroup.indexOfChild(fragment2.mView) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.getMin.size()) {
                return -1;
            }
            Fragment fragment3 = this.getMin.get(indexOf);
            if (fragment3.mContainer == viewGroup && fragment3.mView != null) {
                return viewGroup.indexOfChild(fragment3.mView);
            }
        }
    }

    public final void setMin(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        if (!this.length.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (unscheduleDrawable next : this.length.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment fragment = next.getMax;
                    printWriter.println(fragment);
                    fragment.dump(obj, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.getMin.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.getMin.get(i).toString());
            }
        }
    }

    public final void getMin(@NonNull unscheduleDrawable unscheduledrawable) {
        Fragment fragment = unscheduledrawable.getMax;
        if (!setMax(fragment.mWho)) {
            this.length.put(fragment.mWho, unscheduledrawable);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.getMax.length(fragment);
                } else {
                    this.getMax.getMax(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            FragmentManager.getMin(2);
        }
    }

    public final void getMax(@NonNull unscheduleDrawable unscheduledrawable) {
        Fragment fragment = unscheduledrawable.getMax;
        if (fragment.mRetainInstance) {
            this.getMax.getMax(fragment);
        }
        if (this.length.put(fragment.mWho, (Object) null) != null) {
            FragmentManager.getMin(2);
        }
    }
}

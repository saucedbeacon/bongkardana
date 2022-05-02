package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;
import o.invalidateDrawable;

public final class setColorFilter extends invalidateDrawable implements FragmentManager.getMax {
    public final FragmentManager getMax;
    public int length;
    boolean setMin;

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.length >= 0) {
            sb.append(" #");
            sb.append(this.length);
        }
        if (this.toString != null) {
            sb.append(" ");
            sb.append(this.toString);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void getMax(String str, PrintWriter printWriter) {
        setMax(str, printWriter, true);
    }

    public final void setMax(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.toString);
            printWriter.print(" mIndex=");
            printWriter.print(this.length);
            printWriter.print(" mCommitted=");
            printWriter.println(this.setMin);
            if (this.toFloatRange != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.toFloatRange));
            }
            if (!(this.setMax == 0 && this.isInside == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.setMax));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.isInside));
            }
            if (!(this.equals == 0 && this.toIntRange == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.equals));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.toIntRange));
            }
            if (!(this.toDoubleRange == 0 && this.FastBitmap$CoordinateSystem == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.toDoubleRange));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.FastBitmap$CoordinateSystem);
            }
            if (!(this.values == 0 && this.invoke == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.values));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.invoke);
            }
        }
        if (!this.getMin.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.getMin.size();
            for (int i = 0; i < size; i++) {
                invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(i);
                switch (length2.setMin) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("cmd=");
                        sb.append(length2.setMin);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(length2.getMin);
                if (z) {
                    if (!(length2.getMax == 0 && length2.setMax == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(length2.getMax));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(length2.setMax));
                    }
                    if (length2.length != 0 || length2.toIntRange != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(length2.length));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(length2.toIntRange));
                    }
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setColorFilter(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager.ICustomTabsCallback(), fragmentManager.hashCode != null ? fragmentManager.hashCode.setMax.getClassLoader() : null);
        this.length = -1;
        this.getMax = fragmentManager;
    }

    /* access modifiers changed from: package-private */
    public final void length(int i, Fragment fragment, @Nullable String str, int i2) {
        super.length(i, fragment, str, i2);
        fragment.mFragmentManager = this.getMax;
    }

    @NonNull
    public final invalidateDrawable length(@NonNull Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.getMax) {
            return super.length(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @NonNull
    public final invalidateDrawable setMin(@NonNull Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.getMax) {
            return super.setMin(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @NonNull
    public final invalidateDrawable getMax(@NonNull Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.getMax) {
            return super.getMax(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @NonNull
    public final invalidateDrawable getMin(@NonNull Fragment fragment) {
        if (fragment.mFragmentManager == null || fragment.mFragmentManager == this.getMax) {
            return super.getMin(fragment);
        }
        StringBuilder sb = new StringBuilder("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    @NonNull
    public final invalidateDrawable getMax(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.mFragmentManager != this.getMax) {
            StringBuilder sb = new StringBuilder("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.getMax);
            throw new IllegalArgumentException(sb.toString());
        } else if (state == Lifecycle.State.INITIALIZED && fragment.mState >= 0) {
            StringBuilder sb2 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb2.append(state);
            sb2.append(" after the Fragment has been created");
            throw new IllegalArgumentException(sb2.toString());
        } else if (state != Lifecycle.State.DESTROYED) {
            return super.getMax(fragment, state);
        } else {
            StringBuilder sb3 = new StringBuilder("Cannot set maximum Lifecycle to ");
            sb3.append(state);
            sb3.append(". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public final void getMin(int i) {
        if (this.IsOverlapping) {
            FragmentManager.getMin(2);
            int size = this.getMin.size();
            for (int i2 = 0; i2 < size; i2++) {
                invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(i2);
                if (length2.getMin != null) {
                    length2.getMin.mBackStackNesting += i;
                    FragmentManager.getMin(2);
                }
            }
        }
    }

    public final void getMax() {
        if (this.valueOf != null) {
            for (int i = 0; i < this.valueOf.size(); i++) {
                ((Runnable) this.valueOf.get(i)).run();
            }
            this.valueOf = null;
        }
    }

    public final int setMin() {
        return length(false);
    }

    public final int length() {
        return length(true);
    }

    private int length(boolean z) {
        if (!this.setMin) {
            if (FragmentManager.getMin(2)) {
                PrintWriter printWriter = new PrintWriter(new isAutoMirrored("FragmentManager"));
                getMax("  ", printWriter);
                printWriter.close();
            }
            this.setMin = true;
            if (this.IsOverlapping) {
                this.length = this.getMax.IsOverlapping.getAndIncrement();
            } else {
                this.length = -1;
            }
            this.getMax.getMax((FragmentManager.getMax) this, z);
            return this.length;
        }
        throw new IllegalStateException("commit already called");
    }

    public final boolean setMin(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        FragmentManager.getMin(2);
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.IsOverlapping) {
            return true;
        }
        FragmentManager fragmentManager = this.getMax;
        if (fragmentManager.setMin == null) {
            fragmentManager.setMin = new ArrayList<>();
        }
        fragmentManager.setMin.add(this);
        return true;
    }

    public final boolean setMax(int i) {
        int size = this.getMin.size();
        for (int i2 = 0; i2 < size; i2++) {
            invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(i2);
            int i3 = length2.getMin != null ? length2.getMin.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean length(ArrayList<setColorFilter> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.getMin.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(i4);
            int i5 = length2.getMin != null ? length2.getMin.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    setColorFilter setcolorfilter = arrayList.get(i6);
                    int size2 = setcolorfilter.getMin.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        invalidateDrawable.length length3 = (invalidateDrawable.length) setcolorfilter.getMin.get(i7);
                        if ((length3.getMin != null ? length3.getMin.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public final void equals() {
        int size = this.getMin.size();
        for (int i = 0; i < size; i++) {
            invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(i);
            Fragment fragment = length2.getMin;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.toFloatRange);
                fragment.setSharedElementNames(this.Mean$Arithmetic, this.invokeSuspend);
            }
            switch (length2.setMin) {
                case 1:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.getMin(fragment, false);
                    this.getMax.isInside(fragment);
                    break;
                case 3:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.FastBitmap$CoordinateSystem(fragment);
                    break;
                case 4:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.toDoubleRange(fragment);
                    break;
                case 5:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.getMin(fragment, false);
                    FragmentManager.hashCode(fragment);
                    break;
                case 6:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.toString(fragment);
                    break;
                case 7:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.getMin(fragment, false);
                    this.getMax.values(fragment);
                    break;
                case 8:
                    this.getMax.valueOf(fragment);
                    break;
                case 9:
                    this.getMax.valueOf((Fragment) null);
                    break;
                case 10:
                    this.getMax.setMin(fragment, length2.isInside);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(length2.setMin);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!this.Grayscale$Algorithm && length2.setMin != 1 && fragment != null && !FragmentManager.getMax) {
                this.getMax.IsOverlapping(fragment);
            }
        }
        if (!this.Grayscale$Algorithm && !FragmentManager.getMax) {
            FragmentManager fragmentManager = this.getMax;
            fragmentManager.length(fragmentManager.FastBitmap$CoordinateSystem, true);
        }
    }

    public final void setMin(boolean z) {
        for (int size = this.getMin.size() - 1; size >= 0; size--) {
            invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(size);
            Fragment fragment = length2.getMin;
            if (fragment != null) {
                fragment.setPopDirection(true);
                fragment.setNextTransition(FragmentManager.setMin(this.toFloatRange));
                fragment.setSharedElementNames(this.invokeSuspend, this.Mean$Arithmetic);
            }
            switch (length2.setMin) {
                case 1:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.getMin(fragment, true);
                    this.getMax.FastBitmap$CoordinateSystem(fragment);
                    break;
                case 3:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.isInside(fragment);
                    break;
                case 4:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    FragmentManager.hashCode(fragment);
                    break;
                case 5:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.getMin(fragment, true);
                    this.getMax.toDoubleRange(fragment);
                    break;
                case 6:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.values(fragment);
                    break;
                case 7:
                    fragment.setAnimations(length2.getMax, length2.setMax, length2.length, length2.toIntRange);
                    this.getMax.getMin(fragment, true);
                    this.getMax.toString(fragment);
                    break;
                case 8:
                    this.getMax.valueOf((Fragment) null);
                    break;
                case 9:
                    this.getMax.valueOf(fragment);
                    break;
                case 10:
                    this.getMax.setMin(fragment, length2.equals);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown cmd: ");
                    sb.append(length2.setMin);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!this.Grayscale$Algorithm && length2.setMin != 3 && fragment != null && !FragmentManager.getMax) {
                this.getMax.IsOverlapping(fragment);
            }
        }
        if (!this.Grayscale$Algorithm && z && !FragmentManager.getMax) {
            FragmentManager fragmentManager = this.getMax;
            fragmentManager.length(fragmentManager.FastBitmap$CoordinateSystem, true);
        }
    }

    public final Fragment setMin(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.getMin.size()) {
            invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(i);
            int i2 = length2.setMin;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = length2.getMin;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList2.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.getMin.add(i, new invalidateDrawable.length(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                invalidateDrawable.length length3 = new invalidateDrawable.length(3, fragment4);
                                length3.getMax = length2.getMax;
                                length3.length = length2.length;
                                length3.setMax = length2.setMax;
                                length3.toIntRange = length2.toIntRange;
                                this.getMin.add(i, length3);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.getMin.remove(i);
                        i--;
                    } else {
                        length2.setMin = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(length2.getMin);
                    if (length2.getMin == fragment2) {
                        this.getMin.add(i, new invalidateDrawable.length(9, length2.getMin));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.getMin.add(i, new invalidateDrawable.length(9, fragment2));
                        i++;
                        fragment2 = length2.getMin;
                    }
                }
                i++;
            }
            arrayList2.add(length2.getMin);
            i++;
        }
        return fragment2;
    }

    public final Fragment setMax(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.getMin.size() - 1; size >= 0; size--) {
            invalidateDrawable.length length2 = (invalidateDrawable.length) this.getMin.get(size);
            int i = length2.setMin;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = length2.getMin;
                            break;
                        case 10:
                            length2.isInside = length2.equals;
                            break;
                    }
                }
                arrayList.add(length2.getMin);
            }
            arrayList.remove(length2.getMin);
        }
        return fragment;
    }

    public final boolean toFloatRange() {
        for (int i = 0; i < this.getMin.size(); i++) {
            if (length((invalidateDrawable.length) this.getMin.get(i))) {
                return true;
            }
        }
        return false;
    }

    public final void length(Fragment.length length2) {
        for (int i = 0; i < this.getMin.size(); i++) {
            invalidateDrawable.length length3 = (invalidateDrawable.length) this.getMin.get(i);
            if (length(length3)) {
                length3.getMin.setOnStartEnterTransitionListener(length2);
            }
        }
    }

    private static boolean length(invalidateDrawable.length length2) {
        Fragment fragment = length2.getMin;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    public final boolean toIntRange() {
        return this.getMin.isEmpty();
    }

    public final void setMax() {
        if (!this.IsOverlapping) {
            this.hashCode = false;
            this.getMax.getMin((FragmentManager.getMax) this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void getMin() {
        if (!this.IsOverlapping) {
            this.hashCode = false;
            this.getMax.getMin((FragmentManager.getMax) this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}

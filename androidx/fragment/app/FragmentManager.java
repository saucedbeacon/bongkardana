package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o.FontRes;
import o.ITrustedWebActivityCallback;
import o.IntRange;
import o.MediaSessionCompat$Token;
import o.StringRes;
import o.adjustListItemSelectionBounds;
import o.areNotificationsEnabled;
import o.getIntrinsicWidth;
import o.getMinimumHeight;
import o.getMinimumWidth;
import o.getOpacity;
import o.getPadding;
import o.getState;
import o.invalidateDrawable;
import o.isAutoMirrored;
import o.isStateful;
import o.jumpToCurrentState;
import o.name;
import o.receiveFile;
import o.scheduleDrawable;
import o.setAlpha;
import o.setChecked;
import o.setColorFilter;
import o.setHotspotBounds;
import o.setPopupCallback;
import o.setState;
import o.setVisible;
import o.unscheduleDrawable;

public abstract class FragmentManager {
    private static boolean b = false;
    public static boolean getMax = true;
    public int FastBitmap$CoordinateSystem = -1;
    ArrayDeque<LaunchedFragmentInfo> Grayscale$Algorithm = new ArrayDeque<>();
    /* access modifiers changed from: private */
    public final Map<String, Object> ICustomTabsCallback = Collections.synchronizedMap(new HashMap());
    private setHotspotBounds ICustomTabsCallback$Default = new setHotspotBounds() {
        @NonNull
        public final SpecialEffectsController setMax(@NonNull ViewGroup viewGroup) {
            return new setState(viewGroup);
        }
    };
    private ITrustedWebActivityCallback<IntentSenderRequest> ICustomTabsCallback$Stub;
    private ArrayList<Boolean> ICustomTabsCallback$Stub$Proxy;
    private boolean ICustomTabsService;
    public final AtomicInteger IsOverlapping = new AtomicInteger();
    getMinimumWidth Mean$Arithmetic;
    private ITrustedWebActivityCallback<String[]> asBinder;
    private setHotspotBounds asInterface = null;
    private ArrayList<Fragment> create;
    public final getMinimumHeight equals = new getMinimumHeight(this);
    private final CopyOnWriteArrayList<getIntrinsicWidth> extraCallback = new CopyOnWriteArrayList<>();
    private setVisible extraCallbackWithResult = new setVisible() {
        @NonNull
        public final Fragment getMax(@NonNull ClassLoader classLoader, @NonNull String str) {
            return getOpacity.getMax(FragmentManager.this.hashCode.setMax, str);
        }
    };
    private Runnable extraCommand = new Runnable() {
        public final void run() {
            FragmentManager.this.setMax(true);
        }
    };
    private final ArrayList<getMax> getCause = new ArrayList<>();
    private ArrayList<setColorFilter> getDefaultImpl;
    private boolean getInterfaceDescriptor;
    public final scheduleDrawable getMin = new scheduleDrawable();
    public getOpacity<?> hashCode;
    boolean invoke;
    boolean invokeSuspend;
    /* access modifiers changed from: package-private */
    public final Map<String, Bundle> isInside = Collections.synchronizedMap(new HashMap());
    OnBackPressedDispatcher length;
    private ArrayList<setMin> newSessionWithExtras;
    private setVisible onMessageChannelReady = null;
    private boolean onNavigationEvent;
    private final getPadding.getMin onPostMessage = new getPadding.getMin() {
        public final void getMax(@NonNull Fragment fragment, @NonNull StringRes stringRes) {
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.toFloatRange.get(fragment) == null) {
                fragmentManager.toFloatRange.put(fragment, new HashSet());
            }
            fragmentManager.toFloatRange.get(fragment).add(stringRes);
        }

        public final void setMin(@NonNull Fragment fragment, @NonNull StringRes stringRes) {
            if (!stringRes.getMax()) {
                FragmentManager fragmentManager = FragmentManager.this;
                HashSet hashSet = fragmentManager.toFloatRange.get(fragment);
                if (hashSet != null && hashSet.remove(stringRes) && hashSet.isEmpty()) {
                    fragmentManager.toFloatRange.remove(fragment);
                    if (fragment.mState < 5) {
                        fragmentManager.equals(fragment);
                        fragmentManager.getMax(fragment, fragmentManager.FastBitmap$CoordinateSystem);
                    }
                }
            }
        }
    };
    private ArrayList<Object> onRelationshipValidationResult;
    private ITrustedWebActivityCallback<Intent> onTransact;
    private ArrayList<Fragment> setDefaultImpl;
    final getState setMax = new getState(this);
    public ArrayList<setColorFilter> setMin;
    public jumpToCurrentState toDoubleRange;
    Map<Fragment, HashSet<StringRes>> toFloatRange = Collections.synchronizedMap(new HashMap());
    final receiveFile toIntRange = new receiveFile() {
        public final void getMin() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.setMax(true);
            if (fragmentManager.toIntRange.length()) {
                fragmentManager.getMax();
            } else {
                fragmentManager.length.getMax();
            }
        }
    };
    @Nullable
    Fragment toString;
    public boolean valueOf;
    public Fragment values;

    public interface getMax {
        boolean setMin(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public static abstract class setMax {
        public void getMin(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view) {
        }
    }

    public static int setMin(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    @Deprecated
    public static void getMin() {
        b = true;
    }

    public static boolean getMin(int i) {
        return b || Log.isLoggable("FragmentManager", i);
    }

    private void getMin(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new isAutoMirrored("FragmentManager"));
        getOpacity<?> getopacity = this.hashCode;
        if (getopacity != null) {
            try {
                getopacity.setMin("  ", printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            getMin("  ", (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    @NonNull
    public final invalidateDrawable length() {
        return new setColorFilter(this);
    }

    public final boolean setMax() {
        boolean max = setMax(true);
        asInterface();
        return max;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (getMin(r4.values) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.length = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.toIntRange;
        r1 = r4.setMin;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void onPostMessage() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$getMax> r0 = r4.getCause
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$getMax> r1 = r4.getCause     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            o.receiveFile r1 = r4.toIntRange     // Catch:{ all -> 0x002f }
            r1.length = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)
            o.receiveFile r0 = r4.toIntRange
            java.util.ArrayList<o.setColorFilter> r1 = r4.setMin
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.Fragment r1 = r4.values
            boolean r1 = r4.getMin((androidx.fragment.app.Fragment) r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.length = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.onPostMessage():void");
    }

    /* access modifiers changed from: package-private */
    public final boolean getMin(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.toString) || !getMin(fragmentManager.values)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public final boolean getMax() {
        return onRelationshipValidationResult();
    }

    private boolean onRelationshipValidationResult() {
        setMax(false);
        length(true);
        Fragment fragment = this.toString;
        if (fragment != null && fragment.getChildFragmentManager().getMax()) {
            return true;
        }
        boolean length2 = length(this.getDefaultImpl, this.ICustomTabsCallback$Stub$Proxy, (String) null, -1, 0);
        if (length2) {
            this.onNavigationEvent = true;
            try {
                setMin(this.getDefaultImpl, this.ICustomTabsCallback$Stub$Proxy);
            } finally {
                this.onNavigationEvent = false;
                this.ICustomTabsCallback$Stub$Proxy.clear();
                this.getDefaultImpl.clear();
            }
        }
        onPostMessage();
        if (this.ICustomTabsService) {
            this.ICustomTabsService = false;
            extraCallbackWithResult();
        }
        this.getMin.length.values().removeAll(Collections.singleton((Object) null));
        return length2;
    }

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    class AnonymousClass6 implements setPopupCallback {
        final /* synthetic */ FragmentManager getMax;
        final /* synthetic */ Lifecycle setMax;
        final /* synthetic */ String setMin;

        public void setMax(@NonNull setChecked setchecked, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START && ((Bundle) this.getMax.isInside.get(this.setMin)) != null) {
                FragmentManager fragmentManager = this.getMax;
                fragmentManager.isInside.remove(this.setMin);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.setMax.length(this);
                this.getMax.ICustomTabsCallback.remove(this.setMin);
            }
        }
    }

    public final void getMin(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            getMin((RuntimeException) new IllegalStateException(sb.toString()));
        }
        bundle.putString(str, fragment.mWho);
    }

    @Nullable
    public final Fragment getMin(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        Fragment fragment = null;
        if (string == null) {
            return null;
        }
        unscheduleDrawable unscheduledrawable = this.getMin.length.get(string);
        if (unscheduledrawable != null) {
            fragment = unscheduledrawable.getMax;
        }
        if (fragment == null) {
            StringBuilder sb = new StringBuilder("Fragment no longer exists for key ");
            sb.append(str);
            sb.append(": unique id ");
            sb.append(string);
            getMin((RuntimeException) new IllegalStateException(sb.toString()));
        }
        return fragment;
    }

    @Nullable
    static Fragment length(@NonNull View view) {
        Object tag = view.getTag(setAlpha.getMax.getMin);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void setMax(@NonNull FragmentContainerView fragmentContainerView) {
        for (unscheduleDrawable next : this.getMin.length()) {
            Fragment fragment = next.getMax;
            if (fragment.mContainerId == fragmentContainerView.getId() && fragment.mView != null && fragment.mView.getParent() == null) {
                fragment.mContainer = fragmentContainerView;
                next.getMax.mContainer.addView(next.getMax.mView, next.getMin.getMin(next.getMax));
            }
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final adjustListItemSelectionBounds setMin(@NonNull Fragment fragment) {
        getMinimumWidth getminimumwidth = this.Mean$Arithmetic;
        adjustListItemSelectionBounds adjustlistitemselectionbounds = getminimumwidth.setMin.get(fragment.mWho);
        if (adjustlistitemselectionbounds != null) {
            return adjustlistitemselectionbounds;
        }
        adjustListItemSelectionBounds adjustlistitemselectionbounds2 = new adjustListItemSelectionBounds();
        getminimumwidth.setMin.put(fragment.mWho, adjustlistitemselectionbounds2);
        return adjustlistitemselectionbounds2;
    }

    @NonNull
    private getMinimumWidth invokeSuspend(@NonNull Fragment fragment) {
        getMinimumWidth getminimumwidth = this.Mean$Arithmetic;
        getMinimumWidth getminimumwidth2 = getminimumwidth.length.get(fragment.mWho);
        if (getminimumwidth2 != null) {
            return getminimumwidth2;
        }
        getMinimumWidth getminimumwidth3 = new getMinimumWidth(getminimumwidth.getMin);
        getminimumwidth.length.put(fragment.mWho, getminimumwidth3);
        return getminimumwidth3;
    }

    /* access modifiers changed from: package-private */
    public final void getMax(@NonNull Fragment fragment) {
        this.Mean$Arithmetic.length(fragment);
    }

    /* access modifiers changed from: package-private */
    public final void setMax(@NonNull Fragment fragment) {
        this.Mean$Arithmetic.getMax(fragment);
    }

    @Nullable
    public final Fragment.SavedState toFloatRange(@NonNull Fragment fragment) {
        Bundle isInside2;
        scheduleDrawable scheduledrawable = this.getMin;
        unscheduleDrawable unscheduledrawable = scheduledrawable.length.get(fragment.mWho);
        if (unscheduledrawable == null || !unscheduledrawable.getMax.equals(fragment)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            getMin((RuntimeException) new IllegalStateException(sb.toString()));
        }
        if (unscheduledrawable.getMax.mState < 0 || (isInside2 = unscheduledrawable.isInside()) == null) {
            return null;
        }
        return new Fragment.SavedState(isInside2);
    }

    public final boolean setMin() {
        return this.getInterfaceDescriptor;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.values;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.values)));
            sb.append("}");
        } else {
            getOpacity<?> getopacity = this.hashCode;
            if (getopacity != null) {
                sb.append(getopacity.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.hashCode)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void getMin(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        this.getMin.setMin(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.create;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.create.get(i).toString());
            }
        }
        ArrayList<setColorFilter> arrayList2 = this.setMin;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                setColorFilter setcolorfilter = this.setMin.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(setcolorfilter.toString());
                setcolorfilter.getMax(obj, printWriter);
            }
        }
        printWriter.print(str);
        StringBuilder sb2 = new StringBuilder("Back Stack Index: ");
        sb2.append(this.IsOverlapping.get());
        printWriter.println(sb2.toString());
        synchronized (this.getCause) {
            int size3 = this.getCause.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(this.getCause.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.hashCode);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.toDoubleRange);
        if (this.values != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.values);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.FastBitmap$CoordinateSystem);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.invokeSuspend);
        printWriter.print(" mStopped=");
        printWriter.print(this.invoke);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.getInterfaceDescriptor);
        if (this.valueOf) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.valueOf);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean length(int i) {
        return this.FastBitmap$CoordinateSystem > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r1 != 5) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(@androidx.annotation.NonNull androidx.fragment.app.Fragment r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            o.scheduleDrawable r1 = r0.getMin
            java.lang.String r2 = r7.mWho
            java.util.HashMap<java.lang.String, o.unscheduleDrawable> r1 = r1.length
            java.lang.Object r1 = r1.get(r2)
            o.unscheduleDrawable r1 = (o.unscheduleDrawable) r1
            r8 = 1
            if (r1 != 0) goto L_0x001e
            o.unscheduleDrawable r1 = new o.unscheduleDrawable
            o.getMinimumHeight r2 = r0.equals
            o.scheduleDrawable r3 = r0.getMin
            r1.<init>(r2, r3, r7)
            r1.setMin = r8
        L_0x001e:
            r9 = r1
            boolean r1 = r7.mFromLayout
            r10 = 2
            if (r1 == 0) goto L_0x0033
            boolean r1 = r7.mInLayout
            if (r1 == 0) goto L_0x0033
            int r1 = r7.mState
            if (r1 != r10) goto L_0x0033
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L_0x0035
        L_0x0033:
            r1 = r18
        L_0x0035:
            int r2 = r9.setMin()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.mState
            r2 = 5
            r3 = 4
            r12 = 3
            if (r1 > r11) goto L_0x0095
            int r1 = r7.mState
            if (r1 >= r11) goto L_0x0053
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<o.StringRes>> r1 = r0.toFloatRange
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0053
            r16.Mean$Arithmetic(r17)
        L_0x0053:
            int r1 = r7.mState
            r4 = -1
            if (r1 == r4) goto L_0x0064
            if (r1 == 0) goto L_0x0069
            if (r1 == r8) goto L_0x006e
            if (r1 == r10) goto L_0x0078
            if (r1 == r3) goto L_0x007d
            if (r1 == r2) goto L_0x008e
            goto L_0x01ab
        L_0x0064:
            if (r11 < 0) goto L_0x0069
            r9.getMin()
        L_0x0069:
            if (r11 <= 0) goto L_0x006e
            r9.getMax()
        L_0x006e:
            if (r11 < 0) goto L_0x0073
            r9.length()
        L_0x0073:
            if (r11 <= r8) goto L_0x0078
            r9.toFloatRange()
        L_0x0078:
            if (r11 <= r10) goto L_0x007d
            r9.toIntRange()
        L_0x007d:
            if (r11 <= r3) goto L_0x008e
            getMin((int) r12)
            androidx.fragment.app.Fragment r1 = r9.getMax
            r1.performStart()
            o.getMinimumHeight r1 = r9.setMax
            androidx.fragment.app.Fragment r3 = r9.getMax
            r1.length(r3)
        L_0x008e:
            if (r11 <= r2) goto L_0x01ab
            r9.equals()
            goto L_0x01ab
        L_0x0095:
            int r1 = r7.mState
            if (r1 <= r11) goto L_0x01ab
            int r1 = r7.mState
            if (r1 == 0) goto L_0x01a4
            if (r1 == r8) goto L_0x0195
            if (r1 == r10) goto L_0x00e4
            if (r1 == r3) goto L_0x00cc
            if (r1 == r2) goto L_0x00bb
            r4 = 7
            if (r1 == r4) goto L_0x00aa
            goto L_0x01ab
        L_0x00aa:
            if (r11 >= r4) goto L_0x00bb
            getMin((int) r12)
            androidx.fragment.app.Fragment r1 = r9.getMax
            r1.performPause()
            o.getMinimumHeight r1 = r9.setMax
            androidx.fragment.app.Fragment r4 = r9.getMax
            r1.setMax(r4)
        L_0x00bb:
            if (r11 >= r2) goto L_0x00cc
            getMin((int) r12)
            androidx.fragment.app.Fragment r1 = r9.getMax
            r1.performStop()
            o.getMinimumHeight r1 = r9.setMax
            androidx.fragment.app.Fragment r2 = r9.getMax
            r1.equals(r2)
        L_0x00cc:
            if (r11 >= r3) goto L_0x00e4
            getMin((int) r12)
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x00e4
            o.getOpacity<?> r1 = r0.hashCode
            boolean r1 = r1.setMax()
            if (r1 == 0) goto L_0x00e4
            android.util.SparseArray<android.os.Parcelable> r1 = r7.mSavedViewState
            if (r1 != 0) goto L_0x00e4
            r9.IsOverlapping()
        L_0x00e4:
            if (r11 >= r10) goto L_0x0195
            r1 = 0
            android.view.View r2 = r7.mView
            if (r2 == 0) goto L_0x018a
            android.view.ViewGroup r2 = r7.mContainer
            if (r2 == 0) goto L_0x018a
            android.view.ViewGroup r2 = r7.mContainer
            android.view.View r3 = r7.mView
            r2.endViewTransition(r3)
            android.view.View r2 = r7.mView
            r2.clearAnimation()
            boolean r2 = r17.isRemovingParent()
            if (r2 != 0) goto L_0x018a
            int r2 = r0.FastBitmap$CoordinateSystem
            r3 = 0
            if (r2 < 0) goto L_0x0125
            boolean r2 = r0.getInterfaceDescriptor
            if (r2 != 0) goto L_0x0125
            android.view.View r2 = r7.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0125
            float r2 = r7.mPostponedAlpha
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0125
            o.getOpacity<?> r1 = r0.hashCode
            android.content.Context r1 = r1.setMax
            r2 = 0
            boolean r4 = r17.getPopDirection()
            o.isStateful$length r1 = o.isStateful.length(r1, r7, r2, r4)
        L_0x0125:
            r7.mPostponedAlpha = r3
            android.view.ViewGroup r13 = r7.mContainer
            android.view.View r14 = r7.mView
            if (r1 == 0) goto L_0x017f
            o.getPadding$getMin r5 = r0.onPostMessage
            android.view.View r3 = r7.mView
            android.view.ViewGroup r2 = r7.mContainer
            r2.startViewTransition(r3)
            o.StringRes r6 = new o.StringRes
            r6.<init>()
            o.isStateful$5 r4 = new o.isStateful$5
            r4.<init>()
            r6.getMax(r4)
            r5.getMax(r7, r6)
            android.view.animation.Animation r4 = r1.length
            if (r4 == 0) goto L_0x0164
            o.isStateful$getMax r4 = new o.isStateful$getMax
            android.view.animation.Animation r1 = r1.length
            r4.<init>(r1, r2, r3)
            android.view.View r1 = r7.mView
            r7.setAnimatingAway(r1)
            o.isStateful$4 r1 = new o.isStateful$4
            r1.<init>(r2, r7, r5, r6)
            r4.setAnimationListener(r1)
            android.view.View r1 = r7.mView
            r1.startAnimation(r4)
            goto L_0x017f
        L_0x0164:
            android.animation.Animator r15 = r1.setMin
            android.animation.Animator r1 = r1.setMin
            r7.setAnimator(r1)
            o.isStateful$2 r4 = new o.isStateful$2
            r1 = r4
            r8 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r15.addListener(r8)
            android.view.View r1 = r7.mView
            r15.setTarget(r1)
            r15.start()
        L_0x017f:
            r13.removeView(r14)
            getMin((int) r10)
            android.view.ViewGroup r1 = r7.mContainer
            if (r13 == r1) goto L_0x018a
            return
        L_0x018a:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<o.StringRes>> r1 = r0.toFloatRange
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L_0x0195
            r9.values()
        L_0x0195:
            if (r11 > 0) goto L_0x01a4
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<o.StringRes>> r1 = r0.toFloatRange
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x01a1
            r8 = 1
            goto L_0x01a5
        L_0x01a1:
            r9.toDoubleRange()
        L_0x01a4:
            r8 = r11
        L_0x01a5:
            if (r8 >= 0) goto L_0x01aa
            r9.FastBitmap$CoordinateSystem()
        L_0x01aa:
            r11 = r8
        L_0x01ab:
            int r1 = r7.mState
            if (r1 == r11) goto L_0x01b4
            getMin((int) r12)
            r7.mState = r11
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.getMax(androidx.fragment.app.Fragment, int):void");
    }

    private void Mean$Arithmetic(@NonNull Fragment fragment) {
        HashSet hashSet = this.toFloatRange.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((StringRes) it.next()).setMax();
            }
            hashSet.clear();
            equals(fragment);
            this.toFloatRange.remove(fragment);
        }
    }

    public final void getMin(@NonNull Fragment fragment, boolean z) {
        ViewGroup ICustomTabsCallback2 = ICustomTabsCallback(fragment);
        if (ICustomTabsCallback2 != null && (ICustomTabsCallback2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) ICustomTabsCallback2).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: package-private */
    public final void equals(@NonNull Fragment fragment) {
        fragment.performDestroyView();
        this.equals.IsOverlapping(fragment);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.getMax(null);
        fragment.mInLayout = false;
    }

    private void b(@NonNull final Fragment fragment) {
        if (fragment.mView != null) {
            isStateful.length length2 = isStateful.length(this.hashCode.setMax, fragment, !fragment.mHidden, fragment.getPopDirection());
            if (length2 == null || length2.setMin == null) {
                if (length2 != null) {
                    fragment.mView.startAnimation(length2.length);
                    length2.length.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                length2.setMin.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    final ViewGroup viewGroup = fragment.mContainer;
                    final View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    length2.setMin.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            viewGroup.endViewTransition(view);
                            animator.removeListener(this);
                            if (fragment.mView != null && fragment.mHidden) {
                                fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }
                length2.setMin.start();
            }
        }
        if (fragment.mAdded && invoke(fragment)) {
            this.valueOf = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public final void IsOverlapping(@NonNull Fragment fragment) {
        if (!this.getMin.setMax(fragment.mWho)) {
            getMin(3);
            return;
        }
        getMax(fragment, this.FastBitmap$CoordinateSystem);
        if (!(fragment.mView == null || !fragment.mIsNewlyAdded || fragment.mContainer == null)) {
            if (fragment.mPostponedAlpha > 0.0f) {
                fragment.mView.setAlpha(fragment.mPostponedAlpha);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            isStateful.length length2 = isStateful.length(this.hashCode.setMax, fragment, true, fragment.getPopDirection());
            if (length2 != null) {
                if (length2.length != null) {
                    fragment.mView.startAnimation(length2.length);
                } else {
                    length2.setMin.setTarget(fragment.mView);
                    length2.setMin.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            b(fragment);
        }
    }

    public final void length(int i, boolean z) {
        getOpacity<?> getopacity;
        if (this.hashCode == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.FastBitmap$CoordinateSystem) {
            this.FastBitmap$CoordinateSystem = i;
            if (getMax) {
                this.getMin.setMax();
            } else {
                for (Fragment IsOverlapping2 : this.getMin.getMin()) {
                    IsOverlapping(IsOverlapping2);
                }
                for (unscheduleDrawable next : this.getMin.length()) {
                    Fragment fragment = next.getMax;
                    if (!fragment.mIsNewlyAdded) {
                        IsOverlapping(fragment);
                    }
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        this.getMin.getMax(next);
                    }
                }
            }
            extraCallbackWithResult();
            if (this.valueOf && (getopacity = this.hashCode) != null && this.FastBitmap$CoordinateSystem == 7) {
                getopacity.length();
                this.valueOf = false;
            }
        }
    }

    private void extraCallbackWithResult() {
        for (unscheduleDrawable max : this.getMin.length()) {
            getMax(max);
        }
    }

    @NonNull
    public final unscheduleDrawable toIntRange(@NonNull Fragment fragment) {
        scheduleDrawable scheduledrawable = this.getMin;
        unscheduleDrawable unscheduledrawable = scheduledrawable.length.get(fragment.mWho);
        if (unscheduledrawable != null) {
            return unscheduledrawable;
        }
        unscheduleDrawable unscheduledrawable2 = new unscheduleDrawable(this.equals, this.getMin, fragment);
        unscheduledrawable2.setMin(this.hashCode.setMax.getClassLoader());
        unscheduledrawable2.setMin = this.FastBitmap$CoordinateSystem;
        return unscheduledrawable2;
    }

    public final unscheduleDrawable isInside(@NonNull Fragment fragment) {
        getMin(2);
        unscheduleDrawable intRange = toIntRange(fragment);
        fragment.mFragmentManager = this;
        this.getMin.getMin(intRange);
        if (!fragment.mDetached) {
            this.getMin.setMin(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (invoke(fragment)) {
                this.valueOf = true;
            }
        }
        return intRange;
    }

    public final void FastBitmap$CoordinateSystem(@NonNull Fragment fragment) {
        getMin(2);
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            scheduleDrawable scheduledrawable = this.getMin;
            synchronized (scheduledrawable.getMin) {
                scheduledrawable.getMin.remove(fragment);
            }
            fragment.mAdded = false;
            if (invoke(fragment)) {
                this.valueOf = true;
            }
            fragment.mRemoving = true;
            onNavigationEvent(fragment);
        }
    }

    public final void toDoubleRange(@NonNull Fragment fragment) {
        getMin(2);
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            onNavigationEvent(fragment);
        }
    }

    public static void hashCode(@NonNull Fragment fragment) {
        getMin(2);
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void toString(@NonNull Fragment fragment) {
        getMin(2);
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                getMin(2);
                scheduleDrawable scheduledrawable = this.getMin;
                synchronized (scheduledrawable.getMin) {
                    scheduledrawable.getMin.remove(fragment);
                }
                fragment.mAdded = false;
                if (invoke(fragment)) {
                    this.valueOf = true;
                }
                onNavigationEvent(fragment);
            }
        }
    }

    public final void values(@NonNull Fragment fragment) {
        getMin(2);
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.getMin.setMin(fragment);
                getMin(2);
                if (invoke(fragment)) {
                    this.valueOf = true;
                }
            }
        }
    }

    @Nullable
    public Fragment findFragmentById(@IdRes int i) {
        scheduleDrawable scheduledrawable = this.getMin;
        for (int size = scheduledrawable.getMin.size() - 1; size >= 0; size--) {
            Fragment fragment = scheduledrawable.getMin.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (unscheduleDrawable next : scheduledrawable.length.values()) {
            if (next != null) {
                Fragment fragment2 = next.getMax;
                if (fragment2.mFragmentId == i) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        scheduleDrawable scheduledrawable = this.getMin;
        if (str != null) {
            for (int size = scheduledrawable.getMin.size() - 1; size >= 0; size--) {
                Fragment fragment = scheduledrawable.getMin.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (unscheduleDrawable next : scheduledrawable.length.values()) {
            if (next != null) {
                Fragment fragment2 = next.getMax;
                if (str.equals(fragment2.mTag)) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Fragment length(@NonNull String str) {
        return this.getMin.getMin(str);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final Fragment getMin(@NonNull String str) {
        unscheduleDrawable unscheduledrawable = this.getMin.length.get(str);
        if (unscheduledrawable != null) {
            return unscheduledrawable.getMax;
        }
        return null;
    }

    public final boolean IsOverlapping() {
        return this.invokeSuspend || this.invoke;
    }

    public final void getMax(@NonNull getMax getmax, boolean z) {
        if (!z) {
            if (this.hashCode == null) {
                if (this.getInterfaceDescriptor) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (IsOverlapping()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.getCause) {
            if (this.hashCode != null) {
                this.getCause.add(getmax);
                toFloatRange();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void toFloatRange() {
        synchronized (this.getCause) {
            boolean z = false;
            boolean z2 = this.newSessionWithExtras != null && !this.newSessionWithExtras.isEmpty();
            if (this.getCause.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.hashCode.setMin.removeCallbacks(this.extraCommand);
                this.hashCode.setMin.post(this.extraCommand);
                onPostMessage();
            }
        }
    }

    private void length(boolean z) {
        if (this.onNavigationEvent) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.hashCode == null) {
            if (this.getInterfaceDescriptor) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.hashCode.setMin.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z || !IsOverlapping()) {
            if (this.getDefaultImpl == null) {
                this.getDefaultImpl = new ArrayList<>();
                this.ICustomTabsCallback$Stub$Proxy = new ArrayList<>();
            }
            this.onNavigationEvent = true;
            try {
                getMin((ArrayList<setColorFilter>) null, (ArrayList<Boolean>) null);
            } finally {
                this.onNavigationEvent = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void getMin(@NonNull getMax getmax, boolean z) {
        if (!z || (this.hashCode != null && !this.getInterfaceDescriptor)) {
            length(z);
            if (getmax.setMin(this.getDefaultImpl, this.ICustomTabsCallback$Stub$Proxy)) {
                this.onNavigationEvent = true;
                try {
                    setMin(this.getDefaultImpl, this.ICustomTabsCallback$Stub$Proxy);
                } finally {
                    this.onNavigationEvent = false;
                    this.ICustomTabsCallback$Stub$Proxy.clear();
                    this.getDefaultImpl.clear();
                }
            }
            onPostMessage();
            if (this.ICustomTabsService) {
                this.ICustomTabsService = false;
                extraCallbackWithResult();
            }
            this.getMin.length.values().removeAll(Collections.singleton((Object) null));
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean setMax(boolean z) {
        length(z);
        boolean z2 = false;
        while (getMax(this.getDefaultImpl, this.ICustomTabsCallback$Stub$Proxy)) {
            this.onNavigationEvent = true;
            try {
                setMin(this.getDefaultImpl, this.ICustomTabsCallback$Stub$Proxy);
                this.onNavigationEvent = false;
                this.ICustomTabsCallback$Stub$Proxy.clear();
                this.getDefaultImpl.clear();
                z2 = true;
            } catch (Throwable th) {
                this.onNavigationEvent = false;
                this.ICustomTabsCallback$Stub$Proxy.clear();
                this.getDefaultImpl.clear();
                throw th;
            }
        }
        onPostMessage();
        if (this.ICustomTabsService) {
            this.ICustomTabsService = false;
            extraCallbackWithResult();
        }
        this.getMin.length.values().removeAll(Collections.singleton((Object) null));
        return z2;
    }

    private void getMin(@Nullable ArrayList<setColorFilter> arrayList, @Nullable ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<setMin> arrayList3 = this.newSessionWithExtras;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            setMin setmin = this.newSessionWithExtras.get(i);
            if (arrayList != null && !setmin.getMin && (indexOf2 = arrayList.indexOf(setmin.getMax)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.newSessionWithExtras.remove(i);
                i--;
                size--;
                setmin.getMax.getMax.getMin(setmin.getMax, setmin.getMin, false, false);
            } else if (setmin.setMin() || (arrayList != null && setmin.getMax.length(arrayList, 0, arrayList.size()))) {
                this.newSessionWithExtras.remove(i);
                i--;
                size--;
                if (arrayList == null || setmin.getMin || (indexOf = arrayList.indexOf(setmin.getMax)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    setmin.getMax();
                } else {
                    setmin.getMax.getMax.getMin(setmin.getMax, setmin.getMin, false, false);
                }
            }
            i++;
        }
    }

    private void setMin(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                getMin(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!arrayList.get(i).Grayscale$Algorithm) {
                        if (i2 != i) {
                            setMax(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (arrayList2.get(i).booleanValue()) {
                            while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).Grayscale$Algorithm) {
                                i2++;
                            }
                        }
                        setMax(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    setMax(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMax(@androidx.annotation.NonNull java.util.ArrayList<o.setColorFilter> r18, @androidx.annotation.NonNull java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            o.setColorFilter r0 = (o.setColorFilter) r0
            boolean r2 = r0.Grayscale$Algorithm
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.setDefaultImpl
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.setDefaultImpl = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.setDefaultImpl
            o.scheduleDrawable r1 = r6.getMin
            java.util.List r1 = r1.getMin()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r6.toString
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0032:
            r14 = 1
            if (r7 >= r3) goto L_0x0063
            java.lang.Object r8 = r15.get(r7)
            o.setColorFilter r8 = (o.setColorFilter) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x004e
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.setDefaultImpl
            androidx.fragment.app.Fragment r0 = r8.setMin((java.util.ArrayList<androidx.fragment.app.Fragment>) r9, (androidx.fragment.app.Fragment) r0)
            goto L_0x0054
        L_0x004e:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.setDefaultImpl
            androidx.fragment.app.Fragment r0 = r8.setMax(r9, r0)
        L_0x0054:
            if (r16 != 0) goto L_0x005e
            boolean r8 = r8.IsOverlapping
            if (r8 == 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r16 = 0
            goto L_0x0060
        L_0x005e:
            r16 = 1
        L_0x0060:
            int r7 = r7 + 1
            goto L_0x0032
        L_0x0063:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.setDefaultImpl
            r0.clear()
            if (r2 != 0) goto L_0x00b9
            int r0 = r6.FastBitmap$CoordinateSystem
            if (r0 <= 0) goto L_0x00b9
            boolean r0 = getMax
            if (r0 == 0) goto L_0x00a2
            r0 = r4
        L_0x0073:
            if (r0 >= r3) goto L_0x00b9
            java.lang.Object r1 = r15.get(r0)
            o.setColorFilter r1 = (o.setColorFilter) r1
            java.util.ArrayList r1 = r1.getMin
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x009f
            java.lang.Object r7 = r1.next()
            o.invalidateDrawable$length r7 = (o.invalidateDrawable.length) r7
            androidx.fragment.app.Fragment r7 = r7.getMin
            if (r7 == 0) goto L_0x0081
            androidx.fragment.app.FragmentManager r8 = r7.mFragmentManager
            if (r8 == 0) goto L_0x0081
            o.unscheduleDrawable r7 = r6.toIntRange(r7)
            o.scheduleDrawable r8 = r6.getMin
            r8.getMin((o.unscheduleDrawable) r7)
            goto L_0x0081
        L_0x009f:
            int r0 = r0 + 1
            goto L_0x0073
        L_0x00a2:
            o.getOpacity<?> r0 = r6.hashCode
            android.content.Context r7 = r0.setMax
            o.jumpToCurrentState r8 = r6.toDoubleRange
            r13 = 0
            o.getPadding$getMin r0 = r6.onPostMessage
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            o.getPadding.getMin(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00ba
        L_0x00b9:
            r1 = 1
        L_0x00ba:
            getMax(r18, r19, r20, r21)
            boolean r0 = getMax
            if (r0 == 0) goto L_0x013e
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00ce:
            if (r2 >= r3) goto L_0x0118
            java.lang.Object r7 = r15.get(r2)
            o.setColorFilter r7 = (o.setColorFilter) r7
            if (r0 == 0) goto L_0x00f7
            java.util.ArrayList r8 = r7.getMin
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00df:
            if (r8 < 0) goto L_0x0115
            java.util.ArrayList r9 = r7.getMin
            java.lang.Object r9 = r9.get(r8)
            o.invalidateDrawable$length r9 = (o.invalidateDrawable.length) r9
            androidx.fragment.app.Fragment r9 = r9.getMin
            if (r9 == 0) goto L_0x00f4
            o.unscheduleDrawable r9 = r6.toIntRange(r9)
            r9.setMax()
        L_0x00f4:
            int r8 = r8 + -1
            goto L_0x00df
        L_0x00f7:
            java.util.ArrayList r7 = r7.getMin
            java.util.Iterator r7 = r7.iterator()
        L_0x00fd:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0115
            java.lang.Object r8 = r7.next()
            o.invalidateDrawable$length r8 = (o.invalidateDrawable.length) r8
            androidx.fragment.app.Fragment r8 = r8.getMin
            if (r8 == 0) goto L_0x00fd
            o.unscheduleDrawable r8 = r6.toIntRange(r8)
            r8.setMax()
            goto L_0x00fd
        L_0x0115:
            int r2 = r2 + 1
            goto L_0x00ce
        L_0x0118:
            int r2 = r6.FastBitmap$CoordinateSystem
            r6.length(r2, r1)
            java.util.Set r1 = r6.setMax(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0125:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.getMin = r0
            r2.getMin()
            r2.getMax()
            goto L_0x0125
        L_0x013a:
            r0 = r3
            r3 = r5
            goto L_0x0192
        L_0x013e:
            if (r2 == 0) goto L_0x0160
            o.MediaSessionCompat$Token r7 = new o.MediaSessionCompat$Token
            r7.<init>()
            r6.setMin((o.MediaSessionCompat$Token<androidx.fragment.app.Fragment>) r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.getMin(r1, r2, r3, r4, r5)
            setMax((o.MediaSessionCompat$Token<androidx.fragment.app.Fragment>) r7)
            goto L_0x0166
        L_0x0160:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x0166:
            if (r0 == r12) goto L_0x0190
            if (r8 == 0) goto L_0x0190
            int r1 = r6.FastBitmap$CoordinateSystem
            if (r1 <= 0) goto L_0x0187
            o.getOpacity<?> r1 = r6.hashCode
            android.content.Context r7 = r1.setMax
            o.jumpToCurrentState r8 = r6.toDoubleRange
            r1 = 1
            o.getPadding$getMin r2 = r6.onPostMessage
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            o.getPadding.getMin(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x018a
        L_0x0187:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x018a:
            int r2 = r6.FastBitmap$CoordinateSystem
            r6.length(r2, r1)
            goto L_0x0192
        L_0x0190:
            r3 = r11
            r0 = r13
        L_0x0192:
            r1 = r20
        L_0x0194:
            if (r1 >= r0) goto L_0x01b5
            java.lang.Object r2 = r15.get(r1)
            o.setColorFilter r2 = (o.setColorFilter) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01af
            int r4 = r2.length
            if (r4 < 0) goto L_0x01af
            r4 = -1
            r2.length = r4
        L_0x01af:
            r2.getMax()
            int r1 = r1 + 1
            goto L_0x0194
        L_0x01b5:
            if (r16 == 0) goto L_0x01ba
            r17.ICustomTabsCallback$Stub()
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.setMax(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private Set<SpecialEffectsController> setMax(@NonNull ArrayList<setColorFilter> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = arrayList.get(i).getMin.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((invalidateDrawable.length) it.next()).getMin;
                if (!(fragment == null || (viewGroup = fragment.mContainer) == null)) {
                    hashSet.add(SpecialEffectsController.length(viewGroup, extraCallback()));
                }
            }
            i++;
        }
        return hashSet;
    }

    private static void setMax(@NonNull MediaSessionCompat$Token<Fragment> mediaSessionCompat$Token) {
        int size = mediaSessionCompat$Token.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) mediaSessionCompat$Token.getMax[i];
            if (!fragment.mAdded) {
                View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    private int getMin(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2, @NonNull MediaSessionCompat$Token<Fragment> mediaSessionCompat$Token) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            setColorFilter setcolorfilter = arrayList.get(i4);
            boolean booleanValue = arrayList2.get(i4).booleanValue();
            if (setcolorfilter.toFloatRange() && !setcolorfilter.length(arrayList, i4 + 1, i2)) {
                if (this.newSessionWithExtras == null) {
                    this.newSessionWithExtras = new ArrayList<>();
                }
                setMin setmin = new setMin(setcolorfilter, booleanValue);
                this.newSessionWithExtras.add(setmin);
                setcolorfilter.length((Fragment.length) setmin);
                if (booleanValue) {
                    setcolorfilter.equals();
                } else {
                    setcolorfilter.setMin(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, setcolorfilter);
                }
                setMin(mediaSessionCompat$Token);
            }
        }
        return i3;
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@NonNull setColorFilter setcolorfilter, boolean z, boolean z2, boolean z3) {
        if (z) {
            setcolorfilter.setMin(z3);
        } else {
            setcolorfilter.equals();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(setcolorfilter);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.FastBitmap$CoordinateSystem > 0) {
            getPadding.getMin(this.hashCode.setMax, this.toDoubleRange, arrayList, arrayList2, 0, 1, true, this.onPostMessage);
        }
        if (z3) {
            length(this.FastBitmap$CoordinateSystem, true);
        }
        for (Fragment next : this.getMin.getMax()) {
            if (next != null && next.mView != null && next.mIsNewlyAdded && setcolorfilter.setMax(next.mContainerId)) {
                if (next.mPostponedAlpha > 0.0f) {
                    next.mView.setAlpha(next.mPostponedAlpha);
                }
                if (z3) {
                    next.mPostponedAlpha = 0.0f;
                } else {
                    next.mPostponedAlpha = -1.0f;
                    next.mIsNewlyAdded = false;
                }
            }
        }
    }

    private static void getMax(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            setColorFilter setcolorfilter = arrayList.get(i);
            boolean z = true;
            if (arrayList2.get(i).booleanValue()) {
                setcolorfilter.getMin(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                setcolorfilter.setMin(z);
            } else {
                setcolorfilter.getMin(1);
                setcolorfilter.equals();
            }
            i++;
        }
    }

    private void onNavigationEvent(@NonNull Fragment fragment) {
        ViewGroup ICustomTabsCallback2 = ICustomTabsCallback(fragment);
        if (ICustomTabsCallback2 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (ICustomTabsCallback2.getTag(setAlpha.getMax.setMax) == null) {
                ICustomTabsCallback2.setTag(setAlpha.getMax.setMax, fragment);
            }
            ((Fragment) ICustomTabsCallback2.getTag(setAlpha.getMax.setMax)).setPopDirection(fragment.getPopDirection());
        }
    }

    private ViewGroup ICustomTabsCallback(@NonNull Fragment fragment) {
        if (fragment.mContainer != null) {
            return fragment.mContainer;
        }
        if (fragment.mContainerId > 0 && this.toDoubleRange.setMin()) {
            View min = this.toDoubleRange.getMin(fragment.mContainerId);
            if (min instanceof ViewGroup) {
                return (ViewGroup) min;
            }
        }
        return null;
    }

    private void setMin(@NonNull MediaSessionCompat$Token<Fragment> mediaSessionCompat$Token) {
        int i = this.FastBitmap$CoordinateSystem;
        if (i > 0) {
            int min = Math.min(i, 5);
            for (Fragment next : this.getMin.getMin()) {
                if (next.mState < min) {
                    getMax(next, min);
                    if (next.mView != null && !next.mHidden && next.mIsNewlyAdded) {
                        mediaSessionCompat$Token.add(next);
                    }
                }
            }
        }
    }

    private void asInterface() {
        if (getMax) {
            for (SpecialEffectsController next : onTransact()) {
                if (next.getMax) {
                    next.getMax = false;
                    next.getMax();
                }
            }
        } else if (this.newSessionWithExtras != null) {
            while (!this.newSessionWithExtras.isEmpty()) {
                this.newSessionWithExtras.remove(0).getMax();
            }
        }
    }

    private void ICustomTabsCallback$Default() {
        if (getMax) {
            for (SpecialEffectsController length2 : onTransact()) {
                length2.length();
            }
        } else if (!this.toFloatRange.isEmpty()) {
            for (Fragment next : this.toFloatRange.keySet()) {
                Mean$Arithmetic(next);
                getMax(next, this.FastBitmap$CoordinateSystem);
            }
        }
    }

    private Set<SpecialEffectsController> onTransact() {
        HashSet hashSet = new HashSet();
        for (unscheduleDrawable unscheduledrawable : this.getMin.length()) {
            ViewGroup viewGroup = unscheduledrawable.getMax.mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.length(viewGroup, extraCallback()));
            }
        }
        return hashSet;
    }

    private boolean getMax(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        synchronized (this.getCause) {
            if (this.getCause.isEmpty()) {
                return false;
            }
            int size = this.getCause.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= this.getCause.get(i).setMin(arrayList, arrayList2);
            }
            this.getCause.clear();
            this.hashCode.setMin.removeCallbacks(this.extraCommand);
            return z;
        }
    }

    private void ICustomTabsCallback$Stub() {
        if (this.onRelationshipValidationResult != null) {
            for (int i = 0; i < this.onRelationshipValidationResult.size(); i++) {
                this.onRelationshipValidationResult.get(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean length(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i, int i2) {
        int i3;
        ArrayList<setColorFilter> arrayList3 = this.setMin;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.setMin.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i >= 0) {
                int size2 = this.setMin.size() - 1;
                while (size2 >= 0) {
                    setColorFilter setcolorfilter = this.setMin.get(size2);
                    if ((str != null && str.equals(setcolorfilter.toString)) || (i >= 0 && i == setcolorfilter.length)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        setColorFilter setcolorfilter2 = this.setMin.get(size2);
                        if ((str == null || !str.equals(setcolorfilter2.toString)) && (i < 0 || i != setcolorfilter2.length)) {
                            break;
                        }
                    }
                }
                i3 = size2;
            } else {
                i3 = -1;
            }
            if (i3 == this.setMin.size() - 1) {
                return false;
            }
            for (int size3 = this.setMin.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.setMin.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Parcelable isInside() {
        int size;
        asInterface();
        ICustomTabsCallback$Default();
        setMax(true);
        this.invokeSuspend = true;
        this.Mean$Arithmetic.getMax = true;
        scheduleDrawable scheduledrawable = this.getMin;
        ArrayList<FragmentState> arrayList = new ArrayList<>(scheduledrawable.length.size());
        for (unscheduleDrawable next : scheduledrawable.length.values()) {
            if (next != null) {
                FragmentState fragmentState = new FragmentState(next.getMax);
                if (next.getMax.mState < 0 || fragmentState.toDoubleRange != null) {
                    fragmentState.toDoubleRange = next.getMax.mSavedFragmentState;
                } else {
                    fragmentState.toDoubleRange = next.isInside();
                    if (next.getMax.mTargetWho != null) {
                        if (fragmentState.toDoubleRange == null) {
                            fragmentState.toDoubleRange = new Bundle();
                        }
                        fragmentState.toDoubleRange.putString("android:target_state", next.getMax.mTargetWho);
                        if (next.getMax.mTargetRequestCode != 0) {
                            fragmentState.toDoubleRange.putInt("android:target_req_state", next.getMax.mTargetRequestCode);
                        }
                    }
                }
                arrayList.add(fragmentState);
                getMin(2);
            }
        }
        BackStackState[] backStackStateArr = null;
        if (arrayList.isEmpty()) {
            getMin(2);
            return null;
        }
        ArrayList<String> min = this.getMin.setMin();
        ArrayList<setColorFilter> arrayList2 = this.setMin;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i = 0; i < size; i++) {
                backStackStateArr[i] = new BackStackState(this.setMin.get(i));
                if (getMin(2)) {
                    this.setMin.get(i);
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.setMin = arrayList;
        fragmentManagerState.setMax = min;
        fragmentManagerState.getMin = backStackStateArr;
        fragmentManagerState.length = this.IsOverlapping.get();
        Fragment fragment = this.toString;
        if (fragment != null) {
            fragmentManagerState.getMax = fragment.mWho;
        }
        fragmentManagerState.toFloatRange.addAll(this.isInside.keySet());
        fragmentManagerState.isInside.addAll(this.isInside.values());
        fragmentManagerState.IsOverlapping = new ArrayList<>(this.Grayscale$Algorithm);
        return fragmentManagerState;
    }

    /* access modifiers changed from: package-private */
    public final void setMin(@Nullable Parcelable parcelable) {
        Fragment fragment;
        unscheduleDrawable unscheduledrawable;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.setMin != null) {
                this.getMin.length.clear();
                Iterator<FragmentState> it = fragmentManagerState.setMin.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment fragment2 = this.Mean$Arithmetic.setMax.get(next.getMax);
                        if (fragment2 != null) {
                            getMin(2);
                            unscheduledrawable = new unscheduleDrawable(this.equals, this.getMin, fragment2, next);
                        } else {
                            unscheduledrawable = new unscheduleDrawable(this.equals, this.getMin, this.hashCode.setMax.getClassLoader(), ICustomTabsCallback(), next);
                        }
                        unscheduledrawable.getMax.mFragmentManager = this;
                        getMin(2);
                        unscheduledrawable.setMin(this.hashCode.setMax.getClassLoader());
                        this.getMin.getMin(unscheduledrawable);
                        unscheduledrawable.setMin = this.FastBitmap$CoordinateSystem;
                    }
                }
                for (Fragment fragment3 : new ArrayList(this.Mean$Arithmetic.setMax.values())) {
                    if (!this.getMin.setMax(fragment3.mWho)) {
                        getMin(2);
                        this.Mean$Arithmetic.getMax(fragment3);
                        fragment3.mFragmentManager = this;
                        unscheduleDrawable unscheduledrawable2 = new unscheduleDrawable(this.equals, this.getMin, fragment3);
                        unscheduledrawable2.setMin = 1;
                        unscheduledrawable2.setMax();
                        fragment3.mRemoving = true;
                        unscheduledrawable2.setMax();
                    }
                }
                this.getMin.getMin((List<String>) fragmentManagerState.setMax);
                Fragment fragment4 = null;
                if (fragmentManagerState.getMin != null) {
                    this.setMin = new ArrayList<>(fragmentManagerState.getMin.length);
                    for (BackStackState min : fragmentManagerState.getMin) {
                        setColorFilter min2 = min.setMin(this);
                        if (getMin(2)) {
                            PrintWriter printWriter = new PrintWriter(new isAutoMirrored("FragmentManager"));
                            min2.setMax("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.setMin.add(min2);
                    }
                } else {
                    this.setMin = null;
                }
                this.IsOverlapping.set(fragmentManagerState.length);
                if (fragmentManagerState.getMax != null) {
                    unscheduleDrawable unscheduledrawable3 = this.getMin.length.get(fragmentManagerState.getMax);
                    if (unscheduledrawable3 != null) {
                        fragment = unscheduledrawable3.getMax;
                    } else {
                        fragment = null;
                    }
                    this.toString = fragment;
                    if (fragment != null) {
                        unscheduleDrawable unscheduledrawable4 = this.getMin.length.get(fragment.mWho);
                        if (unscheduledrawable4 != null) {
                            fragment4 = unscheduledrawable4.getMax;
                        }
                        if (fragment.equals(fragment4)) {
                            fragment.performPrimaryNavigationFragmentChanged();
                        }
                    }
                }
                ArrayList<String> arrayList = fragmentManagerState.toFloatRange;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        Bundle bundle = fragmentManagerState.isInside.get(i);
                        bundle.setClassLoader(this.hashCode.setMax.getClassLoader());
                        this.isInside.put(arrayList.get(i), bundle);
                    }
                }
                this.Grayscale$Algorithm = new ArrayDeque<>(fragmentManagerState.IsOverlapping);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final getOpacity<?> equals() {
        return this.hashCode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: o.IPostMessageService} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(@androidx.annotation.NonNull o.getOpacity<?> r3, @androidx.annotation.NonNull o.jumpToCurrentState r4, @androidx.annotation.Nullable final androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            o.getOpacity<?> r0 = r2.hashCode
            if (r0 != 0) goto L_0x0105
            r2.hashCode = r3
            r2.toDoubleRange = r4
            r2.values = r5
            if (r5 == 0) goto L_0x0017
            androidx.fragment.app.FragmentManager$7 r4 = new androidx.fragment.app.FragmentManager$7
            r4.<init>(r5)
            java.util.concurrent.CopyOnWriteArrayList<o.getIntrinsicWidth> r0 = r2.extraCallback
            r0.add(r4)
            goto L_0x0023
        L_0x0017:
            boolean r4 = r3 instanceof o.getIntrinsicWidth
            if (r4 == 0) goto L_0x0023
            r4 = r3
            o.getIntrinsicWidth r4 = (o.getIntrinsicWidth) r4
            java.util.concurrent.CopyOnWriteArrayList<o.getIntrinsicWidth> r0 = r2.extraCallback
            r0.add(r4)
        L_0x0023:
            androidx.fragment.app.Fragment r4 = r2.values
            if (r4 == 0) goto L_0x002a
            r2.onPostMessage()
        L_0x002a:
            boolean r4 = r3 instanceof o.IPostMessageService
            if (r4 == 0) goto L_0x0041
            r4 = r3
            o.IPostMessageService r4 = (o.IPostMessageService) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.length = r0
            if (r5 == 0) goto L_0x003a
            r4 = r5
        L_0x003a:
            androidx.activity.OnBackPressedDispatcher r0 = r2.length
            o.receiveFile r1 = r2.toIntRange
            r0.length(r4, r1)
        L_0x0041:
            if (r5 == 0) goto L_0x004c
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            o.getMinimumWidth r3 = r3.invokeSuspend(r5)
            r2.Mean$Arithmetic = r3
            goto L_0x0065
        L_0x004c:
            boolean r4 = r3 instanceof o.ListMenuItemView
            if (r4 == 0) goto L_0x005d
            o.ListMenuItemView r3 = (o.ListMenuItemView) r3
            o.adjustListItemSelectionBounds r3 = r3.getViewModelStore()
            o.getMinimumWidth r3 = o.getMinimumWidth.getMax((o.adjustListItemSelectionBounds) r3)
            r2.Mean$Arithmetic = r3
            goto L_0x0065
        L_0x005d:
            o.getMinimumWidth r3 = new o.getMinimumWidth
            r4 = 0
            r3.<init>(r4)
            r2.Mean$Arithmetic = r3
        L_0x0065:
            o.getMinimumWidth r3 = r2.Mean$Arithmetic
            boolean r4 = r2.IsOverlapping()
            r3.getMax = r4
            o.scheduleDrawable r3 = r2.getMin
            o.getMinimumWidth r4 = r2.Mean$Arithmetic
            r3.getMax = r4
            o.getOpacity<?> r3 = r2.hashCode
            boolean r4 = r3 instanceof o.ITrustedWebActivityCallback.Default
            if (r4 == 0) goto L_0x0104
            o.ITrustedWebActivityCallback$Default r3 = (o.ITrustedWebActivityCallback.Default) r3
            o.IPostMessageService$Stub$Proxy r3 = r3.getActivityResultRegistry()
            if (r5 == 0) goto L_0x0095
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.mWho
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x0097
        L_0x0095:
            java.lang.String r4 = ""
        L_0x0097:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "FragmentManager:"
            java.lang.String r4 = r5.concat(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            o.ITrustedWebActivityCallback$Stub$Proxy$getMin r0 = new o.ITrustedWebActivityCallback$Stub$Proxy$getMin
            r0.<init>()
            androidx.fragment.app.FragmentManager$13 r1 = new androidx.fragment.app.FragmentManager$13
            r1.<init>()
            o.ITrustedWebActivityCallback r5 = r3.getMin((java.lang.String) r5, r0, r1)
            r2.onTransact = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$getMin r0 = new androidx.fragment.app.FragmentManager$getMin
            r0.<init>()
            androidx.fragment.app.FragmentManager$2 r1 = new androidx.fragment.app.FragmentManager$2
            r1.<init>()
            o.ITrustedWebActivityCallback r5 = r3.getMin((java.lang.String) r5, r0, r1)
            r2.ICustomTabsCallback$Stub = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            o.ITrustedWebActivityCallback$Stub$Proxy$setMin r5 = new o.ITrustedWebActivityCallback$Stub$Proxy$setMin
            r5.<init>()
            androidx.fragment.app.FragmentManager$5 r0 = new androidx.fragment.app.FragmentManager$5
            r0.<init>()
            o.ITrustedWebActivityCallback r3 = r3.getMin((java.lang.String) r4, r5, r0)
            r2.asBinder = r3
        L_0x0104:
            return
        L_0x0105:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.getMax(o.getOpacity, o.jumpToCurrentState, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public final void toIntRange() {
        if (this.hashCode != null) {
            this.invokeSuspend = false;
            this.invoke = false;
            this.Mean$Arithmetic.getMax = false;
            for (Fragment next : this.getMin.getMin()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, @Nullable Bundle bundle) {
        if (this.onTransact != null) {
            this.Grayscale$Algorithm.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.onTransact.getMin(intent, (name) null);
            return;
        }
        getOpacity<?> getopacity = this.hashCode;
        if (i == -1) {
            IntRange.setMin(getopacity.setMax, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* access modifiers changed from: package-private */
    public final void getMin(@NonNull Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, @Nullable Intent intent, int i2, int i3, int i4, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        int i5 = i;
        Bundle bundle2 = bundle;
        if (this.ICustomTabsCallback$Stub != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                } else {
                    intent2 = intent;
                }
                getMin(2);
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            IntentSenderRequest.setMin setmin = new IntentSenderRequest.setMin(intentSender);
            setmin.length = intent2;
            setmin.setMin = i3;
            setmin.getMax = i2;
            IntentSenderRequest intentSenderRequest = new IntentSenderRequest(setmin.getMin, setmin.length, setmin.getMax, setmin.setMin);
            this.Grayscale$Algorithm.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            getMin(2);
            this.ICustomTabsCallback$Stub.getMin(intentSenderRequest, (name) null);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i6 = i2;
        int i7 = i3;
        getOpacity<?> getopacity = this.hashCode;
        if (i5 == -1) {
            FontRes.getMin(getopacity.length, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    /* access modifiers changed from: package-private */
    public final void setMin(@NonNull Fragment fragment, @NonNull String[] strArr, int i) {
        if (this.asBinder != null) {
            this.Grayscale$Algorithm.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.asBinder.getMin(strArr, (name) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final void toDoubleRange() {
        this.invokeSuspend = false;
        this.invoke = false;
        this.Mean$Arithmetic.getMax = false;
        setMax(0);
    }

    /* access modifiers changed from: package-private */
    public final void FastBitmap$CoordinateSystem() {
        this.invokeSuspend = false;
        this.invoke = false;
        this.Mean$Arithmetic.getMax = false;
        setMax(1);
    }

    /* access modifiers changed from: package-private */
    public final void values() {
        setMax(2);
    }

    /* access modifiers changed from: package-private */
    public final void Mean$Arithmetic() {
        this.invokeSuspend = false;
        this.invoke = false;
        this.Mean$Arithmetic.getMax = false;
        setMax(4);
    }

    /* access modifiers changed from: package-private */
    public final void invoke() {
        this.invokeSuspend = false;
        this.invoke = false;
        this.Mean$Arithmetic.getMax = false;
        setMax(5);
    }

    /* access modifiers changed from: package-private */
    public final void invokeSuspend() {
        this.invokeSuspend = false;
        this.invoke = false;
        this.Mean$Arithmetic.getMax = false;
        setMax(7);
    }

    /* access modifiers changed from: package-private */
    public final void valueOf() {
        setMax(5);
    }

    /* access modifiers changed from: package-private */
    public final void Grayscale$Algorithm() {
        this.invoke = true;
        this.Mean$Arithmetic.getMax = true;
        setMax(4);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        setMax(1);
    }

    /* access modifiers changed from: package-private */
    public final void onNavigationEvent() {
        this.getInterfaceDescriptor = true;
        setMax(true);
        ICustomTabsCallback$Default();
        setMax(-1);
        this.hashCode = null;
        this.toDoubleRange = null;
        this.values = null;
        if (this.length != null) {
            this.toIntRange.setMin();
            this.length = null;
        }
        ITrustedWebActivityCallback<Intent> iTrustedWebActivityCallback = this.onTransact;
        if (iTrustedWebActivityCallback != null) {
            iTrustedWebActivityCallback.setMax();
            this.ICustomTabsCallback$Stub.setMax();
            this.asBinder.setMax();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void setMax(int i) {
        try {
            this.onNavigationEvent = true;
            this.getMin.getMin(i);
            length(i, false);
            if (getMax) {
                for (SpecialEffectsController length2 : onTransact()) {
                    length2.length();
                }
            }
            this.onNavigationEvent = false;
            setMax(true);
        } catch (Throwable th) {
            this.onNavigationEvent = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMin(boolean z) {
        for (Fragment next : this.getMin.getMin()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax(boolean z) {
        for (Fragment next : this.getMin.getMin()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax(@NonNull Configuration configuration) {
        for (Fragment next : this.getMin.getMin()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void getCause() {
        for (Fragment next : this.getMin.getMin()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    public final boolean getMin(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.FastBitmap$CoordinateSystem <= 0) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment next : this.getMin.getMin()) {
            if (next != null && length(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z = true;
            }
        }
        if (this.create != null) {
            for (int i = 0; i < this.create.size(); i++) {
                Fragment fragment = this.create.get(i);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.create = arrayList;
        return z;
    }

    public final boolean getMin(@NonNull Menu menu) {
        boolean z = false;
        if (this.FastBitmap$CoordinateSystem <= 0) {
            return false;
        }
        for (Fragment next : this.getMin.getMin()) {
            if (next != null && length(next) && next.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final boolean getMax(@NonNull MenuItem menuItem) {
        if (this.FastBitmap$CoordinateSystem <= 0) {
            return false;
        }
        for (Fragment next : this.getMin.getMin()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean length(@NonNull MenuItem menuItem) {
        if (this.FastBitmap$CoordinateSystem <= 0) {
            return false;
        }
        for (Fragment next : this.getMin.getMin()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void setMin(@NonNull Menu menu) {
        if (this.FastBitmap$CoordinateSystem > 0) {
            for (Fragment next : this.getMin.getMin()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void valueOf(@Nullable Fragment fragment) {
        Fragment fragment2;
        Fragment fragment3;
        Fragment fragment4 = null;
        if (fragment != null) {
            unscheduleDrawable unscheduledrawable = this.getMin.length.get(fragment.mWho);
            if (unscheduledrawable != null) {
                fragment3 = unscheduledrawable.getMax;
            } else {
                fragment3 = null;
            }
            if (!fragment.equals(fragment3) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        Fragment fragment5 = this.toString;
        this.toString = fragment;
        if (fragment5 != null) {
            unscheduleDrawable unscheduledrawable2 = this.getMin.length.get(fragment5.mWho);
            if (unscheduledrawable2 != null) {
                fragment2 = unscheduledrawable2.getMax;
            } else {
                fragment2 = null;
            }
            if (fragment5.equals(fragment2)) {
                fragment5.performPrimaryNavigationFragmentChanged();
            }
        }
        Fragment fragment6 = this.toString;
        if (fragment6 != null) {
            unscheduleDrawable unscheduledrawable3 = this.getMin.length.get(fragment6.mWho);
            if (unscheduledrawable3 != null) {
                fragment4 = unscheduledrawable3.getMax;
            }
            if (fragment6.equals(fragment4)) {
                fragment6.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void create() {
        Fragment fragment;
        onPostMessage();
        Fragment fragment2 = this.toString;
        if (fragment2 != null) {
            unscheduleDrawable unscheduledrawable = this.getMin.length.get(fragment2.mWho);
            if (unscheduledrawable != null) {
                fragment = unscheduledrawable.getMax;
            } else {
                fragment = null;
            }
            if (fragment2.equals(fragment)) {
                fragment2.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void setMin(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        Fragment fragment2;
        unscheduleDrawable unscheduledrawable = this.getMin.length.get(fragment.mWho);
        if (unscheduledrawable != null) {
            fragment2 = unscheduledrawable.getMax;
        } else {
            fragment2 = null;
        }
        if (!fragment.equals(fragment2) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.mMaxState = state;
    }

    @NonNull
    public final setVisible ICustomTabsCallback() {
        FragmentManager fragmentManager = this;
        while (true) {
            setVisible setvisible = fragmentManager.onMessageChannelReady;
            if (setvisible != null) {
                return setvisible;
            }
            Fragment fragment = fragmentManager.values;
            if (fragment == null) {
                return fragmentManager.extraCallbackWithResult;
            }
            fragmentManager = fragment.mFragmentManager;
        }
    }

    @NonNull
    public final setHotspotBounds extraCallback() {
        FragmentManager fragmentManager = this;
        while (true) {
            setHotspotBounds sethotspotbounds = fragmentManager.asInterface;
            if (sethotspotbounds != null) {
                return sethotspotbounds;
            }
            Fragment fragment = fragmentManager.values;
            if (fragment == null) {
                return fragmentManager.ICustomTabsCallback$Default;
            }
            fragmentManager = fragment.mFragmentManager;
        }
    }

    /* access modifiers changed from: package-private */
    public final void Grayscale$Algorithm(@NonNull Fragment fragment) {
        Iterator<getIntrinsicWidth> it = this.extraCallback.iterator();
        while (it.hasNext()) {
            it.next().getMax(fragment);
        }
    }

    private boolean asBinder() {
        boolean z = false;
        for (Fragment next : this.getMin.getMax()) {
            if (next != null) {
                z = invoke(next);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean invoke(@NonNull Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.asBinder();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final LayoutInflater.Factory2 onMessageChannelReady() {
        return this.setMax;
    }

    public class length implements getMax {
        final String getMax = null;
        final int getMin;
        final int setMax;

        public length(int i, int i2) {
            this.getMin = i;
            this.setMax = i2;
        }

        public final boolean setMin(@NonNull ArrayList<setColorFilter> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            if (FragmentManager.this.toString != null && this.getMin < 0 && this.getMax == null && FragmentManager.this.toString.getChildFragmentManager().getMax()) {
                return false;
            }
            return FragmentManager.this.length(arrayList, arrayList2, this.getMax, this.getMin, this.setMax);
        }
    }

    static class setMin implements Fragment.length {
        final setColorFilter getMax;
        final boolean getMin;
        private int setMin;

        setMin(@NonNull setColorFilter setcolorfilter, boolean z) {
            this.getMin = z;
            this.getMax = setcolorfilter;
        }

        public final void length() {
            int i = this.setMin - 1;
            this.setMin = i;
            if (i == 0) {
                this.getMax.getMax.toFloatRange();
            }
        }

        public final void setMax() {
            this.setMin++;
        }

        public final boolean setMin() {
            return this.setMin == 0;
        }

        /* access modifiers changed from: package-private */
        public final void getMax() {
            boolean z = this.setMin > 0;
            for (Fragment next : this.getMax.getMax.getMin.getMin()) {
                next.setOnStartEnterTransitionListener((Fragment.length) null);
                if (z && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            this.getMax.getMax.getMin(this.getMax, this.getMin, !z, true);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }
        };
        String getMin;
        int setMin;

        public int describeContents() {
            return 0;
        }

        LaunchedFragmentInfo(@NonNull String str, int i) {
            this.getMin = str;
            this.setMin = i;
        }

        LaunchedFragmentInfo(@NonNull Parcel parcel) {
            this.getMin = parcel.readString();
            this.setMin = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.getMin);
            parcel.writeInt(this.setMin);
        }
    }

    static class getMin extends areNotificationsEnabled<IntentSenderRequest, ActivityResult> {
        getMin() {
        }

        @NonNull
        public final /* synthetic */ Intent setMax(@NonNull Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.length;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    IntentSenderRequest.setMin setmin = new IntentSenderRequest.setMin(intentSenderRequest.getMin);
                    setmin.length = null;
                    int i = intentSenderRequest.setMax;
                    int i2 = intentSenderRequest.setMin;
                    setmin.setMin = i;
                    setmin.getMax = i2;
                    intentSenderRequest = new IntentSenderRequest(setmin.getMin, setmin.length, setmin.getMax, setmin.setMin);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            FragmentManager.getMin(2);
            return intent;
        }

        @NonNull
        public final /* synthetic */ Object setMin(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final void getMax(@NonNull unscheduleDrawable unscheduledrawable) {
        Fragment fragment = unscheduledrawable.getMax;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.onNavigationEvent) {
            this.ICustomTabsService = true;
            return;
        }
        fragment.mDeferStart = false;
        if (getMax) {
            unscheduledrawable.setMax();
        } else {
            getMax(fragment, this.FastBitmap$CoordinateSystem);
        }
    }
}

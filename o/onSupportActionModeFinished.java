package o;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.fromInclusive;
import o.setSupportProgressBarIndeterminateVisibility;

public class onSupportActionModeFinished {
    private static int setMin;
    private int getMax = -1;
    private final AccessibilityNodeInfo length;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int setMax = -1;

    private static String getMax(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static class setMax {
        public static final setMax FastBitmap$CoordinateSystem = new setMax(2048, (CharSequence) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) setSupportProgressBarIndeterminateVisibility.length.class);
        public static final setMax Grayscale$Algorithm = new setMax(65536, (CharSequence) null);
        public static final setMax ICustomTabsCallback;
        @NonNull
        public static final setMax ICustomTabsCallback$Default = new setMax(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        public static final setMax ICustomTabsCallback$Stub = new setMax(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, setSupportProgressBarIndeterminateVisibility.getMin.class);
        public static final setMax ICustomTabsCallback$Stub$Proxy;
        public static final setMax IsOverlapping = new setMax(32, (CharSequence) null);
        public static final setMax Mean$Arithmetic = new setMax(131072, (CharSequence) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) setSupportProgressBarIndeterminateVisibility.isInside.class);
        @NonNull
        public static final setMax asBinder = new setMax(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        public static final setMax asInterface;
        public static final setMax b = new setMax(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, setSupportProgressBarIndeterminateVisibility.setMin.class);
        public static final setMax create = new setMax(1048576, (CharSequence) null);
        public static final setMax equals = new setMax(64, (CharSequence) null);
        public static final setMax extraCallback = new setMax(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        public static final setMax extraCallbackWithResult = new setMax(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        public static final setMax getCause = new setMax(2097152, (CharSequence) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) setSupportProgressBarIndeterminateVisibility.toFloatRange.class);
        @NonNull
        public static final setMax getDefaultImpl;
        public static final setMax getInterfaceDescriptor = new setMax(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        public static final setMax getMax = new setMax(16, (CharSequence) null);
        public static final setMax getMin = new setMax(4, (CharSequence) null);
        public static final setMax hashCode = new setMax(16384, (CharSequence) null);
        public static final setMax invoke = new setMax(262144, (CharSequence) null);
        public static final setMax invokeSuspend = new setMax(32768, (CharSequence) null);
        public static final setMax isInside = new setMax(128, (CharSequence) null);
        public static final setMax length = new setMax(8, (CharSequence) null);
        public static final setMax onMessageChannelReady = new setMax(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        public static final setMax onNavigationEvent = new setMax(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        @NonNull
        public static final setMax onPostMessage = new setMax(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        @NonNull
        public static final setMax onRelationshipValidationResult = new setMax(Build.VERSION.SDK_INT >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        public static final setMax onTransact;
        @NonNull
        public static final setMax setDefaultImpl;
        public static final setMax setMax = new setMax(1, (CharSequence) null);
        public static final setMax setMin = new setMax(2, (CharSequence) null);
        public static final setMax toDoubleRange = new setMax(8192, (CharSequence) null);
        public static final setMax toFloatRange = new setMax(512, (CharSequence) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) setSupportProgressBarIndeterminateVisibility.getMax.class);
        public static final setMax toIntRange = new setMax(256, (CharSequence) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) setSupportProgressBarIndeterminateVisibility.getMax.class);
        public static final setMax toString = new setMax(1024, (CharSequence) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) setSupportProgressBarIndeterminateVisibility.length.class);
        public static final setMax valueOf = new setMax(524288, (CharSequence) null);
        public static final setMax values = new setMax(4096, (CharSequence) null);
        final Object ICustomTabsService;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        protected final setSupportProgressBarIndeterminateVisibility mayLaunchUrl;
        private final Class<? extends setSupportProgressBarIndeterminateVisibility.setMax> newSessionWithExtras;
        private final int warmup;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6 = null;
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityAction = null;
            }
            ICustomTabsCallback = new setMax(accessibilityAction, 16908342, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                accessibilityAction2 = null;
            }
            onTransact = new setMax(accessibilityAction2, 16908348, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction3 = null;
            }
            asInterface = new setMax(accessibilityAction3, 16908349, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, setSupportProgressBarIndeterminateVisibility.toIntRange.class);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction4 = null;
            }
            ICustomTabsCallback$Stub$Proxy = new setMax(accessibilityAction4, 16908357, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction5 = null;
            }
            setDefaultImpl = new setMax(accessibilityAction5, 16908362, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
            if (Build.VERSION.SDK_INT >= 30) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            getDefaultImpl = new setMax(accessibilityAction6, 16908372, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        }

        public setMax(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public setMax(int i, CharSequence charSequence, setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility) {
            this((Object) null, i, charSequence, setsupportprogressbarindeterminatevisibility, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        }

        setMax(Object obj) {
            this(obj, 0, (CharSequence) null, (setSupportProgressBarIndeterminateVisibility) null, (Class<? extends setSupportProgressBarIndeterminateVisibility.setMax>) null);
        }

        private setMax(int i, CharSequence charSequence, Class<? extends setSupportProgressBarIndeterminateVisibility.setMax> cls) {
            this((Object) null, i, charSequence, (setSupportProgressBarIndeterminateVisibility) null, cls);
        }

        setMax(Object obj, int i, CharSequence charSequence, setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility, Class<? extends setSupportProgressBarIndeterminateVisibility.setMax> cls) {
            this.warmup = i;
            this.mayLaunchUrl = setsupportprogressbarindeterminatevisibility;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.ICustomTabsService = obj;
            } else {
                this.ICustomTabsService = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.newSessionWithExtras = cls;
        }

        public int length() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.ICustomTabsService).getId();
            }
            return 0;
        }

        public CharSequence getMax() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.ICustomTabsService).getLabel();
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean getMin(View view, Bundle bundle) {
            if (this.mayLaunchUrl == null) {
                return false;
            }
            setSupportProgressBarIndeterminateVisibility.setMax setmax = null;
            Class<? extends setSupportProgressBarIndeterminateVisibility.setMax> cls = this.newSessionWithExtras;
            if (cls != null) {
                try {
                    setSupportProgressBarIndeterminateVisibility.setMax setmax2 = (setSupportProgressBarIndeterminateVisibility.setMax) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    try {
                        setmax2.getMax = bundle;
                    } catch (Exception unused) {
                    }
                    setmax = setmax2;
                } catch (Exception unused2) {
                }
            }
            return this.mayLaunchUrl.perform(view, setmax);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public setMax length(CharSequence charSequence, setSupportProgressBarIndeterminateVisibility setsupportprogressbarindeterminatevisibility) {
            return new setMax((Object) null, this.warmup, charSequence, setsupportprogressbarindeterminatevisibility, this.newSessionWithExtras);
        }

        public int hashCode() {
            Object obj = this.ICustomTabsService;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof setMax)) {
                return false;
            }
            setMax setmax = (setMax) obj;
            Object obj2 = this.ICustomTabsService;
            if (obj2 == null) {
                if (setmax.ICustomTabsService != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(setmax.ICustomTabsService)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static class getMax {
        final Object getMin;

        public static getMax length(int i, int i2, boolean z, int i3) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new getMax(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new getMax(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new getMax((Object) null);
        }

        public static getMax setMax(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new getMax(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new getMax((Object) null);
        }

        getMax(Object obj) {
            this.getMin = obj;
        }
    }

    public static class setMin {
        final Object setMax;

        public static setMin getMin(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new setMin(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new setMin(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new setMin((Object) null);
        }

        setMin(Object obj) {
            this.setMax = obj;
        }
    }

    public static class getMin {
        final Object getMax;

        public static getMin setMax(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new getMin(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
            }
            return new getMin((Object) null);
        }

        getMin(Object obj) {
            this.getMax = obj;
        }
    }

    @Deprecated
    public onSupportActionModeFinished(Object obj) {
        this.length = (AccessibilityNodeInfo) obj;
    }

    private onSupportActionModeFinished(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.length = accessibilityNodeInfo;
    }

    public static onSupportActionModeFinished getMin(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new onSupportActionModeFinished(accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo getMin() {
        return this.length;
    }

    public static onSupportActionModeFinished getMin(View view) {
        return getMin(AccessibilityNodeInfo.obtain(view));
    }

    public static onSupportActionModeFinished length() {
        return getMin(AccessibilityNodeInfo.obtain());
    }

    public static onSupportActionModeFinished setMin(onSupportActionModeFinished onsupportactionmodefinished) {
        return getMin(AccessibilityNodeInfo.obtain(onsupportactionmodefinished.length));
    }

    public void setMax(View view) {
        this.getMax = -1;
        this.length.setSource(view);
    }

    public void setMax(View view, int i) {
        this.getMax = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.length.setSource(view, i);
        }
    }

    public int getMax() {
        return this.length.getChildCount();
    }

    public void length(View view) {
        this.length.addChild(view);
    }

    public void getMin(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.length.addChild(view, i);
        }
    }

    public int setMax() {
        return this.length.getActions();
    }

    public void setMin(int i) {
        this.length.addAction(i);
    }

    private List<Integer> setMin(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.length.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.length.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void setMin(setMax setmax) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.length.addAction((AccessibilityNodeInfo.AccessibilityAction) setmax.ICustomTabsService);
        }
    }

    public boolean setMax(setMax setmax) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.length.removeAction((AccessibilityNodeInfo.AccessibilityAction) setmax.ICustomTabsService);
        }
        return false;
    }

    public boolean length(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.length.performAction(i, bundle);
        }
        return false;
    }

    public void getMin(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.length.setMovementGranularities(i);
        }
    }

    public int setMin() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.length.getMovementGranularities();
        }
        return 0;
    }

    public void setMin(View view) {
        this.setMax = -1;
        this.length.setParent(view);
    }

    public void setMin(View view, int i) {
        this.setMax = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.length.setParent(view, i);
        }
    }

    @Deprecated
    public void getMax(Rect rect) {
        this.length.getBoundsInParent(rect);
    }

    @Deprecated
    public void setMin(Rect rect) {
        this.length.setBoundsInParent(rect);
    }

    public void getMin(Rect rect) {
        this.length.getBoundsInScreen(rect);
    }

    public void setMax(Rect rect) {
        this.length.setBoundsInScreen(rect);
    }

    public boolean IsOverlapping() {
        return this.length.isCheckable();
    }

    public void length(boolean z) {
        this.length.setCheckable(z);
    }

    public boolean toIntRange() {
        return this.length.isChecked();
    }

    public void setMax(boolean z) {
        this.length.setChecked(z);
    }

    public boolean isInside() {
        return this.length.isFocusable();
    }

    public void getMin(boolean z) {
        this.length.setFocusable(z);
    }

    public boolean toFloatRange() {
        return this.length.isFocused();
    }

    public void setMin(boolean z) {
        this.length.setFocused(z);
    }

    public boolean equals() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.length.isVisibleToUser();
        }
        return false;
    }

    public void getMax(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.length.setVisibleToUser(z);
        }
    }

    public boolean FastBitmap$CoordinateSystem() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.length.isAccessibilityFocused();
        }
        return false;
    }

    public void toIntRange(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.length.setAccessibilityFocused(z);
        }
    }

    public boolean toDoubleRange() {
        return this.length.isSelected();
    }

    public void IsOverlapping(boolean z) {
        this.length.setSelected(z);
    }

    public boolean values() {
        return this.length.isClickable();
    }

    public void equals(boolean z) {
        this.length.setClickable(z);
    }

    public boolean invoke() {
        return this.length.isLongClickable();
    }

    public void toFloatRange(boolean z) {
        this.length.setLongClickable(z);
    }

    public boolean valueOf() {
        return this.length.isEnabled();
    }

    public void isInside(boolean z) {
        this.length.setEnabled(z);
    }

    public boolean invokeSuspend() {
        return this.length.isPassword();
    }

    public boolean Mean$Arithmetic() {
        return this.length.isScrollable();
    }

    public void values(boolean z) {
        this.length.setScrollable(z);
    }

    public CharSequence Grayscale$Algorithm() {
        return this.length.getPackageName();
    }

    public void setMin(CharSequence charSequence) {
        this.length.setPackageName(charSequence);
    }

    public CharSequence onNavigationEvent() {
        return this.length.getClassName();
    }

    public void getMax(CharSequence charSequence) {
        this.length.setClassName(charSequence);
    }

    public CharSequence b() {
        if (!extraCallback()) {
            return this.length.getText();
        }
        List<Integer> min = setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> min2 = setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> min3 = setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> min4 = setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.length.getText(), 0, this.length.getText().length()));
        for (int i = 0; i < min.size(); i++) {
            spannableString.setSpan(new onSupportActionModeStarted(min4.get(i).intValue(), this, extraCallbackWithResult().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), min.get(i).intValue(), min2.get(i).intValue(), min3.get(i).intValue());
        }
        return spannableString;
    }

    public void setMax(CharSequence charSequence) {
        this.length.setText(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void getMax(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 26) {
            onRelationshipValidationResult();
            toFloatRange(view);
            ClickableSpan[] min = getMin(charSequence);
            if (min != null && min.length > 0) {
                extraCallbackWithResult().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", fromInclusive.getMax.setMin);
                SparseArray<WeakReference<ClickableSpan>> equals = equals(view);
                int i = 0;
                while (min != null && i < min.length) {
                    int max = setMax(min[i], equals);
                    equals.put(max, new WeakReference(min[i]));
                    length(min[i], (Spanned) charSequence, max);
                    i++;
                }
            }
        }
    }

    private SparseArray<WeakReference<ClickableSpan>> equals(View view) {
        SparseArray<WeakReference<ClickableSpan>> intRange = toIntRange(view);
        if (intRange != null) {
            return intRange;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(fromInclusive.getMax.extraCommand, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> toIntRange(View view) {
        return (SparseArray) view.getTag(fromInclusive.getMax.extraCommand);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] getMin(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private int setMax(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = setMin;
        setMin = i2 + 1;
        return i2;
    }

    private boolean extraCallback() {
        return !setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private void onRelationshipValidationResult() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.length.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.length.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.length.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.length.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private void length(ClickableSpan clickableSpan, Spanned spanned, int i) {
        setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        setMin("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void toFloatRange(View view) {
        SparseArray<WeakReference<ClickableSpan>> intRange = toIntRange(view);
        if (intRange != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < intRange.size(); i++) {
                if (intRange.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                intRange.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    public CharSequence create() {
        return this.length.getContentDescription();
    }

    public void length(CharSequence charSequence) {
        this.length.setContentDescription(charSequence);
    }

    public void toIntRange(@Nullable CharSequence charSequence) {
        if (BuildCompat.getMax()) {
            this.length.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.length.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void ICustomTabsCallback() {
        this.length.recycle();
    }

    public String getCause() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.length.getViewIdResourceName();
        }
        return null;
    }

    public void getMin(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.length;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((getMax) obj).getMin;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    public void length(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.length;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((setMin) obj).setMax;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    public void length(getMin getmin) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.length.setRangeInfo((AccessibilityNodeInfo.RangeInfo) getmin.getMax);
        }
    }

    public List<setMax> onMessageChannelReady() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.length.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new setMax(actionList.get(i)));
        }
        return arrayList;
    }

    public void IsOverlapping(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.length.setHintText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.length.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void toFloatRange(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.length.setError(charSequence);
        }
    }

    public void hashCode(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.length.setCanOpenPopup(z);
        }
    }

    public Bundle extraCallbackWithResult() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.length.getExtras();
        }
        return new Bundle();
    }

    public void length(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.length.setMaxTextLength(i);
        }
    }

    public void getMax(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.length.setTraversalAfter(view);
        }
    }

    public void toDoubleRange(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.length.setDismissable(z);
        }
    }

    public void isInside(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.length.setPaneTitle(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.length.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void toString(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.length.setScreenReaderFocusable(z);
        } else {
            getMax(1, z);
        }
    }

    public boolean onPostMessage() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.length.isShowingHintText();
        }
        return setMax(4);
    }

    public void FastBitmap$CoordinateSystem(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.length.setShowingHintText(z);
        } else {
            getMax(4, z);
        }
    }

    public void invokeSuspend(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.length.setHeading(z);
        } else {
            getMax(2, z);
        }
    }

    public void equals(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.length.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.length;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof onSupportActionModeFinished)) {
            return false;
        }
        onSupportActionModeFinished onsupportactionmodefinished = (onSupportActionModeFinished) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.length;
        if (accessibilityNodeInfo == null) {
            if (onsupportactionmodefinished.length != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(onsupportactionmodefinished.length)) {
            return false;
        }
        return this.getMax == onsupportactionmodefinished.getMax && this.setMax == onsupportactionmodefinished.setMax;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        getMax(rect);
        sb.append("; boundsInParent: ".concat(String.valueOf(rect)));
        getMin(rect);
        sb.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        sb.append("; packageName: ");
        sb.append(Grayscale$Algorithm());
        sb.append("; className: ");
        sb.append(onNavigationEvent());
        sb.append("; text: ");
        sb.append(b());
        sb.append("; contentDescription: ");
        sb.append(create());
        sb.append("; viewId: ");
        sb.append(getCause());
        sb.append("; checkable: ");
        sb.append(IsOverlapping());
        sb.append("; checked: ");
        sb.append(toIntRange());
        sb.append("; focusable: ");
        sb.append(isInside());
        sb.append("; focused: ");
        sb.append(toFloatRange());
        sb.append("; selected: ");
        sb.append(toDoubleRange());
        sb.append("; clickable: ");
        sb.append(values());
        sb.append("; longClickable: ");
        sb.append(invoke());
        sb.append("; enabled: ");
        sb.append(valueOf());
        sb.append("; password: ");
        sb.append(invokeSuspend());
        StringBuilder sb2 = new StringBuilder("; scrollable: ");
        sb2.append(Mean$Arithmetic());
        sb.append(sb2.toString());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<setMax> onMessageChannelReady = onMessageChannelReady();
            for (int i = 0; i < onMessageChannelReady.size(); i++) {
                setMax setmax = onMessageChannelReady.get(i);
                String max = getMax(setmax.length());
                if (max.equals("ACTION_UNKNOWN") && setmax.getMax() != null) {
                    max = setmax.getMax().toString();
                }
                sb.append(max);
                if (i != onMessageChannelReady.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int max2 = setMax();
            while (max2 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(max2);
                max2 &= numberOfTrailingZeros ^ -1;
                sb.append(getMax(numberOfTrailingZeros));
                if (max2 != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void getMax(int i, boolean z) {
        Bundle extraCallbackWithResult = extraCallbackWithResult();
        if (extraCallbackWithResult != null) {
            int i2 = extraCallbackWithResult.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            extraCallbackWithResult.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    private boolean setMax(int i) {
        Bundle extraCallbackWithResult = extraCallbackWithResult();
        if (extraCallbackWithResult != null && (extraCallbackWithResult.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }
}

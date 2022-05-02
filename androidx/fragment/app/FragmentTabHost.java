package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import o.invalidateDrawable;
import o.setColorFilter;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private TabHost.OnTabChangeListener equals;
    private Context getMax;
    private int getMin;
    private FragmentManager length;
    private final ArrayList<length> setMax = new ArrayList<>();
    private FrameLayout setMin;
    private boolean toFloatRange;
    private length toIntRange;

    static final class length {
        @Nullable
        final Bundle getMin;
        Fragment length;
        @NonNull
        final Class<?> setMax;
        @NonNull
        final String setMin;

        length(@NonNull String str, @NonNull Class<?> cls, @Nullable Bundle bundle) {
            this.setMin = str;
            this.setMax = cls;
            this.getMin = bundle;
        }
    }

    static class getMin implements TabHost.TabContentFactory {
        private final Context setMin;

        public getMin(Context context) {
            this.setMin = context;
        }

        public final View createTabContent(String str) {
            View view = new View(this.setMin);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String getMin;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.getMin = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.getMin);
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("FragmentTabHost.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" curTab=");
            sb.append(this.getMin);
            sb.append("}");
            return sb.toString();
        }
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context) {
        super(context, (AttributeSet) null);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{16842995}, 0, 0);
        this.getMin = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public FragmentTabHost(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.getMin = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    private void setMax(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.setMin = frameLayout2;
            frameLayout2.setId(this.getMin);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        setMax(context);
        super.setup();
        this.getMax = context;
        this.length = fragmentManager;
        setMax();
    }

    @Deprecated
    public void setup(@NonNull Context context, @NonNull FragmentManager fragmentManager, int i) {
        setMax(context);
        super.setup();
        this.getMax = context;
        this.length = fragmentManager;
        this.getMin = i;
        setMax();
        this.setMin.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    private void setMax() {
        if (this.setMin == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.getMin);
            this.setMin = frameLayout;
            if (frameLayout == null) {
                StringBuilder sb = new StringBuilder("No tab content FrameLayout found for id ");
                sb.append(this.getMin);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    @Deprecated
    public void setOnTabChangedListener(@Nullable TabHost.OnTabChangeListener onTabChangeListener) {
        this.equals = onTabChangeListener;
    }

    @Deprecated
    public void addTab(@NonNull TabHost.TabSpec tabSpec, @NonNull Class<?> cls, @Nullable Bundle bundle) {
        tabSpec.setContent(new getMin(this.getMax));
        String tag = tabSpec.getTag();
        length length2 = new length(tag, cls, bundle);
        if (this.toFloatRange) {
            length2.length = this.length.findFragmentByTag(tag);
            if (length2.length != null && !length2.length.isDetached()) {
                setColorFilter setcolorfilter = new setColorFilter(this.length);
                setcolorfilter.getMin(length2.length);
                setcolorfilter.setMin();
            }
        }
        this.setMax.add(length2);
        addTab(tabSpec);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.setMax.size();
        setColorFilter setcolorfilter = null;
        for (int i = 0; i < size; i++) {
            length length2 = this.setMax.get(i);
            length2.length = this.length.findFragmentByTag(length2.setMin);
            if (length2.length != null && !length2.length.isDetached()) {
                if (length2.setMin.equals(currentTabTag)) {
                    this.toIntRange = length2;
                } else {
                    if (setcolorfilter == null) {
                        setcolorfilter = new setColorFilter(this.length);
                    }
                    setcolorfilter.getMin(length2.length);
                }
            }
        }
        this.toFloatRange = true;
        invalidateDrawable length3 = length(currentTabTag, setcolorfilter);
        if (length3 != null) {
            length3.setMin();
            this.length.setMax();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.toFloatRange = false;
    }

    /* access modifiers changed from: protected */
    @NonNull
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.getMin = getCurrentTabTag();
        return savedState;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.getMin);
    }

    @Deprecated
    public void onTabChanged(@Nullable String str) {
        invalidateDrawable length2;
        if (this.toFloatRange && (length2 = length(str, (invalidateDrawable) null)) != null) {
            length2.setMin();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.equals;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Nullable
    private invalidateDrawable length(@Nullable String str, @Nullable invalidateDrawable invalidatedrawable) {
        length length2 = length(str);
        if (this.toIntRange != length2) {
            if (invalidatedrawable == null) {
                invalidatedrawable = new setColorFilter(this.length);
            }
            length length3 = this.toIntRange;
            if (!(length3 == null || length3.length == null)) {
                invalidatedrawable.getMin(this.toIntRange.length);
            }
            if (length2 != null) {
                if (length2.length == null) {
                    length2.length = this.length.ICustomTabsCallback().getMax(this.getMax.getClassLoader(), length2.setMax.getName());
                    length2.length.setArguments(length2.getMin);
                    invalidatedrawable.length(this.getMin, length2.length, length2.setMin, 1);
                } else {
                    invalidatedrawable.getMin(new invalidateDrawable.length(7, length2.length));
                }
            }
            this.toIntRange = length2;
        }
        return invalidatedrawable;
    }

    @Nullable
    private length length(String str) {
        int size = this.setMax.size();
        for (int i = 0; i < size; i++) {
            length length2 = this.setMax.get(i);
            if (length2.setMin.equals(str)) {
                return length2;
            }
        }
        return null;
    }
}

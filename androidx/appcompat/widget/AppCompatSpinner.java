package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import o.IMediaControllerCallback;
import o.ITrustedWebActivityCallback;
import o.cancelAll;
import o.getQueue;
import o.getSmallIconId;
import o.onStart;
import o.playFromSearch;

public class AppCompatSpinner extends Spinner implements onStart {
    private static final int[] getMin = {16843505};
    private final Context getMax;
    private setMin isInside;
    private final IMediaControllerCallback.Stub.Proxy length;
    int mDropDownWidth;
    final Rect mTempRect;
    private getQueue setMax;
    private SpinnerAdapter setMin;
    private final boolean toFloatRange;

    @VisibleForTesting
    interface setMin {
        int IsOverlapping();

        Drawable getMax();

        void getMax(int i, int i2);

        void getMin(int i);

        boolean getMin();

        void length();

        void length(int i);

        int setMax();

        void setMax(int i);

        void setMax(ListAdapter listAdapter);

        void setMax(CharSequence charSequence);

        CharSequence setMin();

        void setMin(Drawable drawable);
    }

    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((SpinnerAdapter) adapter);
    }

    public AppCompatSpinner(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(@NonNull Context context, int i) {
        this(context, (AttributeSet) null, ITrustedWebActivityCallback.Stub.getMin.getDefaultImpl, i);
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.getDefaultImpl);
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r11 != null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if (r11 != null) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.mTempRect = r0
            android.content.Context r0 = r6.getContext()
            o.getShuffleMode.getMax(r0)
            int[] r0 = o.ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$MediaKeyAction
            r1 = 0
            o.prepareFromUri r0 = o.prepareFromUri.getMin(r7, r8, r0, r9, r1)
            o.IMediaControllerCallback$Stub$Proxy r2 = new o.IMediaControllerCallback$Stub$Proxy
            r2.<init>(r6)
            r6.length = r2
            if (r11 == 0) goto L_0x0029
            o.MediaBrowserCompat$MediaItem r2 = new o.MediaBrowserCompat$MediaItem
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.getMax = r2
            goto L_0x003d
        L_0x0029:
            int r11 = o.ITrustedWebActivityCallback.Stub.toIntRange.send
            android.content.res.TypedArray r2 = r0.setMin
            int r11 = r2.getResourceId(r11, r1)
            if (r11 == 0) goto L_0x003b
            o.MediaBrowserCompat$MediaItem r2 = new o.MediaBrowserCompat$MediaItem
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.getMax = r2
            goto L_0x003d
        L_0x003b:
            r6.getMax = r7
        L_0x003d:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0067
            int[] r11 = getMin     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0063, all -> 0x005c }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
            if (r3 == 0) goto L_0x0051
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x005a, all -> 0x0057 }
        L_0x0051:
            if (r11 == 0) goto L_0x0067
        L_0x0053:
            r11.recycle()
            goto L_0x0067
        L_0x0057:
            r7 = move-exception
            r2 = r11
            goto L_0x005d
        L_0x005a:
            goto L_0x0064
        L_0x005c:
            r7 = move-exception
        L_0x005d:
            if (r2 == 0) goto L_0x0062
            r2.recycle()
        L_0x0062:
            throw r7
        L_0x0063:
            r11 = r2
        L_0x0064:
            if (r11 == 0) goto L_0x0067
            goto L_0x0053
        L_0x0067:
            r11 = 1
            if (r10 == 0) goto L_0x00aa
            if (r10 == r11) goto L_0x006d
            goto L_0x00bc
        L_0x006d:
            androidx.appcompat.widget.AppCompatSpinner$getMin r10 = new androidx.appcompat.widget.AppCompatSpinner$getMin
            android.content.Context r3 = r6.getMax
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.getMax
            int[] r4 = o.ITrustedWebActivityCallback.Stub.toIntRange.PlaybackStateCompat$MediaKeyAction
            o.prepareFromUri r1 = o.prepareFromUri.getMin(r3, r8, r4, r9, r1)
            int r3 = o.ITrustedWebActivityCallback.Stub.toIntRange.IResultReceiver$Stub
            android.content.res.TypedArray r4 = r1.setMin
            r5 = -2
            int r3 = r4.getLayoutDimension(r3, r5)
            r6.mDropDownWidth = r3
            int r3 = o.ITrustedWebActivityCallback.Stub.toIntRange.IResultReceiver$Default
            android.graphics.drawable.Drawable r3 = r1.setMax(r3)
            r10.setMin((android.graphics.drawable.Drawable) r3)
            int r3 = o.ITrustedWebActivityCallback.Stub.toIntRange.IResultReceiver$Stub$Proxy
            android.content.res.TypedArray r4 = r0.setMin
            java.lang.String r3 = r4.getString(r3)
            r10.setMax((java.lang.CharSequence) r3)
            android.content.res.TypedArray r1 = r1.setMin
            r1.recycle()
            r6.isInside = r10
            androidx.appcompat.widget.AppCompatSpinner$3 r1 = new androidx.appcompat.widget.AppCompatSpinner$3
            r1.<init>(r6, r10)
            r6.setMax = r1
            goto L_0x00bc
        L_0x00aa:
            androidx.appcompat.widget.AppCompatSpinner$setMax r10 = new androidx.appcompat.widget.AppCompatSpinner$setMax
            r10.<init>()
            r6.isInside = r10
            int r1 = o.ITrustedWebActivityCallback.Stub.toIntRange.IResultReceiver$Stub$Proxy
            android.content.res.TypedArray r3 = r0.setMin
            java.lang.String r1 = r3.getString(r1)
            r10.setMax((java.lang.CharSequence) r1)
        L_0x00bc:
            int r10 = o.ITrustedWebActivityCallback.Stub.toIntRange.IResultReceiver
            android.content.res.TypedArray r1 = r0.setMin
            java.lang.CharSequence[] r10 = r1.getTextArray(r10)
            if (r10 == 0) goto L_0x00d6
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = o.ITrustedWebActivityCallback.Stub.equals.create
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        L_0x00d6:
            android.content.res.TypedArray r7 = r0.setMin
            r7.recycle()
            r6.toFloatRange = r11
            android.widget.SpinnerAdapter r7 = r6.setMin
            if (r7 == 0) goto L_0x00e6
            r6.setAdapter(r7)
            r6.setMin = r2
        L_0x00e6:
            o.IMediaControllerCallback$Stub$Proxy r7 = r6.length
            r7.setMin(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public Context getPopupContext() {
        return this.getMax;
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        setMin setmin = this.isInside;
        if (setmin != null) {
            setmin.setMin(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@DrawableRes int i) {
        setPopupBackgroundDrawable(cancelAll.getMin(getPopupContext(), i));
    }

    public Drawable getPopupBackground() {
        setMin setmin = this.isInside;
        if (setmin != null) {
            return setmin.getMax();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public void setDropDownVerticalOffset(int i) {
        setMin setmin = this.isInside;
        if (setmin != null) {
            setmin.setMax(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public int getDropDownVerticalOffset() {
        setMin setmin = this.isInside;
        if (setmin != null) {
            return setmin.setMax();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public void setDropDownHorizontalOffset(int i) {
        setMin setmin = this.isInside;
        if (setmin != null) {
            setmin.length(i);
            this.isInside.getMin(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public int getDropDownHorizontalOffset() {
        setMin setmin = this.isInside;
        if (setmin != null) {
            return setmin.IsOverlapping();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public void setDropDownWidth(int i) {
        if (this.isInside != null) {
            this.mDropDownWidth = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public int getDropDownWidth() {
        if (this.isInside != null) {
            return this.mDropDownWidth;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.toFloatRange) {
            this.setMin = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.isInside != null) {
            Context context = this.getMax;
            if (context == null) {
                context = getContext();
            }
            this.isInside.setMax((ListAdapter) new getMax(spinnerAdapter, context.getTheme()));
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setMin setmin = this.isInside;
        if (setmin != null && setmin.getMin()) {
            this.isInside.length();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        getQueue getqueue = this.setMax;
        if (getqueue == null || !getqueue.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.isInside != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public boolean performClick() {
        setMin setmin = this.isInside;
        if (setmin == null) {
            return super.performClick();
        }
        if (setmin.getMin()) {
            return true;
        }
        showPopup();
        return true;
    }

    public void setPrompt(CharSequence charSequence) {
        setMin setmin = this.isInside;
        if (setmin != null) {
            setmin.setMax(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public CharSequence getPrompt() {
        setMin setmin = this.isInside;
        return setmin != null ? setmin.setMin() : super.getPrompt();
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        IMediaControllerCallback.Stub.Proxy proxy = this.length;
        if (proxy != null) {
            proxy.setMax(i);
        }
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        IMediaControllerCallback.Stub.Proxy proxy = this.length;
        if (proxy != null) {
            proxy.getMax(drawable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        IMediaControllerCallback.Stub.Proxy proxy = this.length;
        if (proxy != null) {
            proxy.setMax(colorStateList);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        IMediaControllerCallback.Stub.Proxy proxy = this.length;
        if (proxy != null) {
            return proxy.getMax();
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        IMediaControllerCallback.Stub.Proxy proxy = this.length;
        if (proxy != null) {
            proxy.setMin(mode);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        IMediaControllerCallback.Stub.Proxy proxy = this.length;
        if (proxy != null) {
            return proxy.length();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        IMediaControllerCallback.Stub.Proxy proxy = this.length;
        if (proxy != null) {
            proxy.setMax();
        }
    }

    /* access modifiers changed from: package-private */
    public int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.mTempRect);
        return i2 + this.mTempRect.left + this.mTempRect.right;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final setMin getInternalPopup() {
        return this.isInside;
    }

    /* access modifiers changed from: package-private */
    public void showPopup() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.isInside.getMax(getTextDirection(), getTextAlignment());
        } else {
            this.isInside.getMax(-1, -1);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        setMin setmin = this.isInside;
        savedState.getMin = setmin != null && setmin.getMin();
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.getMin && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (!AppCompatSpinner.this.getInternalPopup().getMin()) {
                        AppCompatSpinner.this.showPopup();
                    }
                    ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            });
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* renamed from: length */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: getMin */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean getMin;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.getMin = parcel.readByte() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.getMin ? (byte) 1 : 0);
        }
    }

    static class getMax implements ListAdapter, SpinnerAdapter {
        private ListAdapter getMax;
        private SpinnerAdapter setMax;

        public int getItemViewType(int i) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public getMax(@Nullable SpinnerAdapter spinnerAdapter, @Nullable Resources.Theme theme) {
            this.setMax = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.getMax = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.setMax;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.setMax;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.setMax;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.setMax;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.setMax;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.setMax;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.setMax;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.getMax;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.getMax;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    @VisibleForTesting
    class setMax implements setMin, DialogInterface.OnClickListener {
        @VisibleForTesting
        getSmallIconId length;
        private ListAdapter setMax;
        private CharSequence setMin;

        public int IsOverlapping() {
            return 0;
        }

        public Drawable getMax() {
            return null;
        }

        public void getMin(int i) {
        }

        public void length(int i) {
        }

        public int setMax() {
            return 0;
        }

        public void setMax(int i) {
        }

        public void setMin(Drawable drawable) {
        }

        setMax() {
        }

        public void length() {
            getSmallIconId getsmalliconid = this.length;
            if (getsmalliconid != null) {
                getsmalliconid.dismiss();
                this.length = null;
            }
        }

        public boolean getMin() {
            getSmallIconId getsmalliconid = this.length;
            if (getsmalliconid != null) {
                return getsmalliconid.isShowing();
            }
            return false;
        }

        public void setMax(ListAdapter listAdapter) {
            this.setMax = listAdapter;
        }

        public void setMax(CharSequence charSequence) {
            this.setMin = charSequence;
        }

        public CharSequence setMin() {
            return this.setMin;
        }

        public void getMax(int i, int i2) {
            if (this.setMax != null) {
                getSmallIconId.length length2 = new getSmallIconId.length(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.setMin;
                if (charSequence != null) {
                    length2.setTitle(charSequence);
                }
                getSmallIconId create = length2.setSingleChoiceItems(this.setMax, AppCompatSpinner.this.getSelectedItemPosition(), (DialogInterface.OnClickListener) this).create();
                this.length = create;
                ListView listView = create.getMax.toFloatRange;
                if (Build.VERSION.SDK_INT >= 17) {
                    listView.setTextDirection(i);
                    listView.setTextAlignment(i2);
                }
                this.length.show();
            }
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.setMax.getItemId(i));
            }
            length();
        }
    }

    @VisibleForTesting
    class getMin extends ListPopupWindow implements setMin {
        private CharSequence equals;
        private int isInside;
        ListAdapter setMax;
        private final Rect toIntRange = new Rect();

        public getMin(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            setMax((View) AppCompatSpinner.this);
            setMin(true);
            setMin(0);
            setMax((AdapterView.OnItemClickListener) new AdapterView.OnItemClickListener(AppCompatSpinner.this) {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, getMin.this.setMax.getItemId(i));
                    }
                    getMin.this.length();
                }
            });
        }

        public void setMax(ListAdapter listAdapter) {
            super.setMax(listAdapter);
            this.setMax = listAdapter;
        }

        public CharSequence setMin() {
            return this.equals;
        }

        public void setMax(CharSequence charSequence) {
            this.equals = charSequence;
        }

        /* access modifiers changed from: package-private */
        public void toIntRange() {
            int i;
            int i2;
            Drawable max = getMax();
            int i3 = 0;
            if (max != null) {
                max.getPadding(AppCompatSpinner.this.mTempRect);
                if (playFromSearch.getMax(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.mTempRect.right;
                } else {
                    i2 = -AppCompatSpinner.this.mTempRect.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.mTempRect;
                AppCompatSpinner.this.mTempRect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.mDropDownWidth == -2) {
                int compatMeasureContentWidth = AppCompatSpinner.this.compatMeasureContentWidth((SpinnerAdapter) this.setMax, getMax());
                int i4 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.mTempRect.left) - AppCompatSpinner.this.mTempRect.right;
                if (compatMeasureContentWidth > i4) {
                    compatMeasureContentWidth = i4;
                }
                equals(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.mDropDownWidth == -1) {
                equals((width - paddingLeft) - paddingRight);
            } else {
                equals(AppCompatSpinner.this.mDropDownWidth);
            }
            if (playFromSearch.getMax(AppCompatSpinner.this)) {
                i = i3 + (((width - paddingRight) - toDoubleRange()) - toFloatRange());
            } else {
                i = i3 + paddingLeft + toFloatRange();
            }
            getMin(i);
        }

        public void getMax(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean min = getMin();
            toIntRange();
            isInside(2);
            super.b_();
            ListView c_ = c_();
            c_.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                c_.setTextDirection(i);
                c_.setTextAlignment(i2);
            }
            toIntRange(AppCompatSpinner.this.getSelectedItemPosition());
            if (!min && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                final AnonymousClass5 r6 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        getMin getmin = getMin.this;
                        if (!getmin.getMax(AppCompatSpinner.this)) {
                            getMin.this.length();
                            return;
                        }
                        getMin.this.toIntRange();
                        getMin.super.b_();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r6);
                length((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r6);
                        }
                    }
                });
            }
        }

        /* access modifiers changed from: package-private */
        public boolean getMax(View view) {
            return ViewCompat.ICustomTabsService(view) && view.getGlobalVisibleRect(this.toIntRange);
        }

        public void length(int i) {
            this.isInside = i;
        }

        public int toFloatRange() {
            return this.isInside;
        }
    }
}

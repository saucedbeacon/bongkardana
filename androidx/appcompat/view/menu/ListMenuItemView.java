package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import o.ITrustedWebActivityCallback;
import o.RatingCompat;
import o.onSessionDestroyed;
import o.prepareFromUri;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements onSessionDestroyed.setMax, AbsListView.SelectionBoundsAdjuster {
    private boolean FastBitmap$CoordinateSystem;
    private ImageView IsOverlapping;
    private boolean Mean$Arithmetic;
    private LinearLayout equals;
    private RadioButton getMax;
    private CheckBox getMin;
    private Drawable hashCode;
    private ImageView isInside;
    private TextView length;
    private RatingCompat setMax;
    private ImageView setMin;
    private Context toDoubleRange;
    private TextView toFloatRange;
    private Drawable toIntRange;
    private int toString;
    private LayoutInflater valueOf;
    private boolean values;

    public boolean prefersCondensedTitle() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ITrustedWebActivityCallback.Stub.getMin.ICustomTabsCallback$Default);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        prepareFromUri min = prepareFromUri.getMin(getContext(), attributeSet, ITrustedWebActivityCallback.Stub.toIntRange.pause, i, 0);
        this.toIntRange = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.setCaptioningEnabled);
        this.toString = min.setMin.getResourceId(ITrustedWebActivityCallback.Stub.toIntRange.rewind, -1);
        this.values = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.seekTo, false);
        this.toDoubleRange = context;
        this.hashCode = min.setMax(ITrustedWebActivityCallback.Stub.toIntRange.rate);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, ITrustedWebActivityCallback.Stub.getMin.extraCallbackWithResult, 0);
        this.FastBitmap$CoordinateSystem = obtainStyledAttributes.hasValue(0);
        min.setMin.recycle();
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.getMin((View) this, this.toIntRange);
        TextView textView = (TextView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.newSession);
        this.length = textView;
        int i = this.toString;
        if (i != -1) {
            textView.setTextAppearance(this.toDoubleRange, i);
        }
        this.toFloatRange = (TextView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.setDefaultImpl);
        ImageView imageView = (ImageView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.newSessionWithExtras);
        this.IsOverlapping = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.hashCode);
        }
        this.isInside = (ImageView) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.onNavigationEvent);
        this.equals = (LinearLayout) findViewById(ITrustedWebActivityCallback.Stub.toFloatRange.FastBitmap$CoordinateSystem);
    }

    public void initialize(RatingCompat ratingCompat, int i) {
        CharSequence charSequence;
        this.setMax = ratingCompat;
        int i2 = 0;
        setVisibility(ratingCompat.isVisible() ? 0 : 8);
        if (prefersCondensedTitle()) {
            charSequence = ratingCompat.getTitleCondensed();
        } else {
            charSequence = ratingCompat.getTitle();
        }
        setTitle(charSequence);
        setCheckable(ratingCompat.isCheckable());
        setShortcut(ratingCompat.length(), ratingCompat.getMin());
        setIcon(ratingCompat.getIcon());
        setEnabled(ratingCompat.isEnabled());
        boolean hasSubMenu = ratingCompat.hasSubMenu();
        ImageView imageView = this.IsOverlapping;
        if (imageView != null) {
            if (!hasSubMenu) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
        setContentDescription(ratingCompat.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.Mean$Arithmetic = z;
        this.values = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.length.setText(charSequence);
            if (this.length.getVisibility() != 0) {
                this.length.setVisibility(0);
            }
        } else if (this.length.getVisibility() != 8) {
            this.length.setVisibility(8);
        }
    }

    public RatingCompat getItemData() {
        return this.setMax;
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.getMax != null || this.getMin != null) {
            if (this.setMax.getMax()) {
                if (this.getMax == null) {
                    if (this.valueOf == null) {
                        this.valueOf = LayoutInflater.from(getContext());
                    }
                    RadioButton radioButton = (RadioButton) this.valueOf.inflate(ITrustedWebActivityCallback.Stub.equals.toDoubleRange, this, false);
                    this.getMax = radioButton;
                    LinearLayout linearLayout = this.equals;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.getMax;
                view = this.getMin;
            } else {
                if (this.getMin == null) {
                    if (this.valueOf == null) {
                        this.valueOf = LayoutInflater.from(getContext());
                    }
                    CheckBox checkBox = (CheckBox) this.valueOf.inflate(ITrustedWebActivityCallback.Stub.equals.toIntRange, this, false);
                    this.getMin = checkBox;
                    LinearLayout linearLayout2 = this.equals;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.getMin;
                view = this.getMax;
            }
            if (z) {
                compoundButton.setChecked(this.setMax.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.getMin;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.getMax;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.setMax.getMax()) {
            if (this.getMax == null) {
                if (this.valueOf == null) {
                    this.valueOf = LayoutInflater.from(getContext());
                }
                RadioButton radioButton = (RadioButton) this.valueOf.inflate(ITrustedWebActivityCallback.Stub.equals.toDoubleRange, this, false);
                this.getMax = radioButton;
                LinearLayout linearLayout = this.equals;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.getMax;
        } else {
            if (this.getMin == null) {
                if (this.valueOf == null) {
                    this.valueOf = LayoutInflater.from(getContext());
                }
                CheckBox checkBox = (CheckBox) this.valueOf.inflate(ITrustedWebActivityCallback.Stub.equals.toIntRange, this, false);
                this.getMin = checkBox;
                LinearLayout linearLayout2 = this.equals;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.getMin;
        }
        compoundButton.setChecked(z);
    }

    public void setShortcut(boolean z, char c) {
        String str;
        int i = (!z || !this.setMax.length()) ? 8 : 0;
        if (i == 0) {
            TextView textView = this.toFloatRange;
            RatingCompat ratingCompat = this.setMax;
            char min = ratingCompat.getMin();
            if (min == 0) {
                str = "";
            } else {
                Resources resources = ratingCompat.getMax.getContext().getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(ratingCompat.getMax.getContext()).hasPermanentMenuKey()) {
                    sb.append(resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.FastBitmap$CoordinateSystem));
                }
                int i2 = ratingCompat.getMax.isQwertyMode() ? ratingCompat.setMin : ratingCompat.length;
                RatingCompat.length(sb, i2, 65536, resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.hashCode));
                RatingCompat.length(sb, i2, 4096, resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.isInside));
                RatingCompat.length(sb, i2, 2, resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.toIntRange));
                RatingCompat.length(sb, i2, 1, resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.values));
                RatingCompat.length(sb, i2, 4, resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.toString));
                RatingCompat.length(sb, i2, 8, resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.toFloatRange));
                if (min == 8) {
                    sb.append(resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.equals));
                } else if (min == 10) {
                    sb.append(resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.IsOverlapping));
                } else if (min != ' ') {
                    sb.append(min);
                } else {
                    sb.append(resources.getString(ITrustedWebActivityCallback.Stub.IsOverlapping.toDoubleRange));
                }
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.toFloatRange.getVisibility() != i) {
            this.toFloatRange.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.setMax.toFloatRange() || this.Mean$Arithmetic;
        if (!z && !this.values) {
            return;
        }
        if (this.setMin != null || drawable != null || this.values) {
            if (this.setMin == null) {
                if (this.valueOf == null) {
                    this.valueOf = LayoutInflater.from(getContext());
                }
                ImageView imageView = (ImageView) this.valueOf.inflate(ITrustedWebActivityCallback.Stub.equals.toString, this, false);
                this.setMin = imageView;
                LinearLayout linearLayout = this.equals;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            }
            if (drawable != null || this.values) {
                ImageView imageView2 = this.setMin;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.setMin.getVisibility() != 0) {
                    this.setMin.setVisibility(0);
                    return;
                }
                return;
            }
            this.setMin.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.setMin != null && this.values) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.setMin.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean showsIcon() {
        return this.Mean$Arithmetic;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.isInside;
        if (imageView != null) {
            imageView.setVisibility((this.FastBitmap$CoordinateSystem || !z) ? 8 : 0);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.isInside;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.isInside.getLayoutParams();
            rect.top += this.isInside.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }
}

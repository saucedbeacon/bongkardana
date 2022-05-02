package com.alibaba.griver.ui.ant.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.AUImageView;
import com.alibaba.griver.ui.ant.api.IconfontInterface;
import com.alibaba.griver.ui.ant.layout.AUFrameLayout;
import com.alibaba.griver.ui.ant.utils.IconfontConstants;
import com.alibaba.griver.ui.ant.utils.TypefaceCache;
import com.alibaba.griver.ui.ant.utils.UIPropUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AUIconView extends AUFrameLayout implements IconfontInterface {

    /* renamed from: a  reason: collision with root package name */
    private String f10565a;
    private List<AUTextView> b;
    private AUImageView c;
    private boolean d;
    private float e;
    private int f;
    private boolean g;
    private int h;
    private ColorStateList i;
    private String j;

    public void destroy() {
    }

    public AUIconView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f10565a = IconfontConstants.DEFAULT_ICONFONT_BUNDLE;
        this.b = new ArrayList();
        this.d = true;
        this.e = -1.0f;
        this.f = 0;
        this.g = true;
        this.i = null;
        this.j = "default";
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griverIconView);
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_iconfontBundle)) {
            setIconfontBundle(obtainStyledAttributes.getString(R.styleable.griverIconView_iconfontBundle));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_iconfontFileName)) {
            setIconfontFileName(obtainStyledAttributes.getString(R.styleable.griverIconView_iconfontFileName));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_iconfontFonts)) {
            try {
                setIconfontFonts(new JSONArray(obtainStyledAttributes.getString(R.styleable.griverIconView_iconfontFonts)));
            } catch (JSONException e2) {
                GriverLogger.d("IconView", "JSONException = ".concat(String.valueOf(e2)));
            }
        }
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_iconfontUnicode)) {
            setIconfontUnicode(obtainStyledAttributes.getString(R.styleable.griverIconView_iconfontUnicode));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_iconfontSize)) {
            setIconfontSize(obtainStyledAttributes.getDimension(R.styleable.griverIconView_iconfontSize, 24.0f));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_iconfontColor)) {
            setIconfontColorStates(obtainStyledAttributes.getColorStateList(R.styleable.griverIconView_iconfontColor));
        }
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_iconImageSize)) {
            this.f = (int) obtainStyledAttributes.getDimension(R.styleable.griverIconView_iconImageSize, 0.0f);
        }
        if (obtainStyledAttributes.hasValue(R.styleable.griverIconView_imageresid)) {
            setImageResource(obtainStyledAttributes.getResourceId(R.styleable.griverIconView_imageresid, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public AUIconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AUIconView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AUIconView(Context context, String str, String str2) {
        this(context, (AttributeSet) null);
        this.f10565a = str;
        this.j = str2;
    }

    private void a() {
        setIconfontTypeface(TypefaceCache.getTypeface(getContext(), getIconfontBundle(), getTTFFilePath()));
    }

    public String getIconfontBundle() {
        return this.f10565a;
    }

    public AUIconView setIconfontBundle(String str) {
        this.f10565a = str;
        List<AUTextView> list = this.b;
        if (list != null && !list.isEmpty()) {
            a();
        }
        return this;
    }

    public Context getIconfontContext() {
        return getContext();
    }

    public AUIconView setIconfontTypeface(Typeface typeface) {
        if (typeface != null) {
            for (AUTextView typeface2 : this.b) {
                typeface2.setTypeface(typeface);
            }
        }
        return this;
    }

    public AUIconView setIconfontUnicode(String str) {
        return setText(str, true);
    }

    public AUIconView setText(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        c();
        AUTextView aUTextView = new AUTextView(getContext());
        aUTextView.setGravity(17);
        aUTextView.setText(str);
        setupTextViewCS(aUTextView);
        this.b.add(aUTextView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(aUTextView, layoutParams);
        if (z) {
            a();
            aUTextView.setContentDescription(" ");
        }
        return this;
    }

    public AUIconView setImageResource(int i2) {
        if (i2 == 0) {
            return this;
        }
        c();
        b();
        this.c.setImageResource(i2);
        addView(this.c);
        return this;
    }

    private void b() {
        AUImageView aUImageView = new AUImageView(getContext());
        this.c = aUImageView;
        aUImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.c.setEnabled(this.d);
        setImageViewSize(this.f);
    }

    public IconfontInterface setImageDrawable(Drawable drawable) {
        c();
        b();
        this.c.setImageDrawable(drawable);
        addView(this.c);
        return this;
    }

    public AUIconView setIconfontFonts(JSONArray jSONArray) {
        ColorStateList genTextSelector;
        if (jSONArray != null && jSONArray.length() > 0) {
            c();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(IconfontConstants.KEY_ICON_UNICODE);
                    String optString2 = optJSONObject.optString("color");
                    AUTextView aUTextView = new AUTextView(getContext());
                    aUTextView.setGravity(17);
                    aUTextView.setText(optString);
                    setupTextViewCS(aUTextView);
                    if (!TextUtils.isEmpty(optString2)) {
                        try {
                            String[] split = optString2.split(";");
                            if (split != null && split.length == 1) {
                                aUTextView.setTextColor(UIPropUtil.getColorByValue(optString2));
                            } else if (!(split == null || split.length <= 1 || (genTextSelector = UIPropUtil.genTextSelector(getContext(), split)) == null)) {
                                aUTextView.setTextColor(genTextSelector);
                            }
                        } catch (Exception e2) {
                            GriverLogger.d("IconView", "color parse Exception = ".concat(String.valueOf(e2)));
                        }
                    }
                    this.b.add(aUTextView);
                    addView(aUTextView);
                }
            }
            a();
        }
        return this;
    }

    private void c() {
        removeAllViews();
        this.c = null;
        this.b.clear();
    }

    private void setupTextViewCS(TextView textView) {
        if (textView != null) {
            boolean z = this.g;
            if (z) {
                textView.setTextColor(this.h);
            } else {
                ColorStateList colorStateList = this.i;
                if (colorStateList != null && !z) {
                    textView.setTextColor(colorStateList);
                }
            }
            float f2 = this.e;
            if (f2 != -1.0f) {
                textView.setTextSize(0, f2);
            }
            textView.setEnabled(this.d);
        }
    }

    public AUIconView setIconfontColor(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String[] split = str.split(";");
                if (split != null && split.length == 1) {
                    setIconfontColor(UIPropUtil.getColorByValue(str));
                } else if (split != null && split.length > 1) {
                    setIconfontColorStates(UIPropUtil.genTextSelector(getContext(), split));
                }
            } catch (Exception e2) {
                GriverLogger.d("IconView", "color parse Exception = ".concat(String.valueOf(e2)));
            }
        }
        return this;
    }

    public AUIconView setIconfontColor(int i2) {
        this.g = true;
        this.h = i2;
        for (AUTextView next : this.b) {
            next.setTextColor(i2);
            next.setAlpha((float) Color.alpha(i2));
        }
        return this;
    }

    public AUIconView setIconfontColorStates(ColorStateList colorStateList) {
        this.g = false;
        this.i = colorStateList;
        if (colorStateList != null) {
            for (AUTextView textColor : this.b) {
                textColor.setTextColor(colorStateList);
            }
        }
        return this;
    }

    public AUIconView setIconfontSize(String str) {
        float f2 = -1.0f;
        try {
            float px = UIPropUtil.getPx(str, getContext());
            if (px != -1.0f) {
                f2 = px;
            }
        } catch (NumberFormatException unused) {
        }
        setIconfontSize(f2);
        return this;
    }

    public AUIconView setIconfontSize(float f2) {
        this.e = f2;
        if (f2 != -1.0f) {
            for (AUTextView textSize : this.b) {
                textSize.setTextSize(0, f2);
            }
        }
        return this;
    }

    public void setIconTextMinHeight(int i2) {
        for (AUTextView minHeight : this.b) {
            minHeight.setMinHeight(i2);
        }
    }

    public void setImageViewSize(int i2) {
        if (i2 != 0) {
            this.f = i2;
            AUImageView aUImageView = this.c;
            if (aUImageView != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aUImageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i2;
                    layoutParams.width = i2;
                } else {
                    layoutParams = new FrameLayout.LayoutParams(i2, i2);
                }
                layoutParams.gravity = 17;
                this.c.setLayoutParams(layoutParams);
            }
        }
    }

    public AUImageView getImageView() {
        if (this.c == null) {
            c();
            b();
            addView(this.c);
        }
        return this.c;
    }

    public String getIconfontFileName() {
        return this.j;
    }

    public void setIconfontFileName(String str) {
        this.j = str;
    }

    private String getTTFFilePath() {
        StringBuilder sb = new StringBuilder();
        sb.append(getIconfontBundle());
        sb.append(File.separator);
        sb.append(getIconfontFileName());
        sb.append(IconfontConstants.ICONFONT_FILE_SUFFIX);
        return sb.toString();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.d = z;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setEnabled(z);
        }
    }

    public void setImportantForAccessibility(int i2) {
        super.setImportantForAccessibility(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).setImportantForAccessibility(i2);
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setContentDescription(charSequence);
        }
    }
}

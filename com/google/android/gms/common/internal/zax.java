package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.google.android.gms.base.R;
import com.google.android.gms.common.util.DeviceProperties;
import o.RequiresPermission;

public final class zax extends Button {
    public zax(Context context) {
        this(context, (AttributeSet) null);
    }

    private zax(Context context, @Nullable AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    public final void zaa(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int zaa = zaa(i2, R.drawable.common_google_signin_btn_icon_dark, R.drawable.common_google_signin_btn_icon_light, R.drawable.common_google_signin_btn_icon_light);
        int zaa2 = zaa(i2, R.drawable.common_google_signin_btn_text_dark, R.drawable.common_google_signin_btn_text_light, R.drawable.common_google_signin_btn_text_light);
        if (i == 0 || i == 1) {
            zaa = zaa2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable intRange = RequiresPermission.Read.toIntRange(resources.getDrawable(zaa));
        RequiresPermission.Read.setMin(intRange, resources.getColorStateList(R.color.common_google_signin_btn_tint));
        RequiresPermission.Read.setMin(intRange, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(intRange);
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zaa(i2, R.color.common_google_signin_btn_text_dark, R.color.common_google_signin_btn_text_light, R.color.common_google_signin_btn_text_light))));
        if (i == 0) {
            setText(resources.getString(R.string.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(R.string.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod((TransformationMethod) null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }

    private static int zaa(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}

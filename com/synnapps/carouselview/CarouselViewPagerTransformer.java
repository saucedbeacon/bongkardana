package com.synnapps.carouselview;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class CarouselViewPagerTransformer implements ViewPager.getMax {
    public static final int DEFAULT = -1;
    public static final int DEPTH = 2;
    public static final int FLOW = 0;
    private static final float MIN_ALPHA_SLIDE = 0.35f;
    private static final float MIN_ALPHA_ZOOM = 0.5f;
    private static final float MIN_SCALE_DEPTH = 0.75f;
    private static final float MIN_SCALE_ZOOM = 0.85f;
    private static final float SCALE_FACTOR_SLIDE = 0.85f;
    public static final int SLIDE_OVER = 1;
    public static final int ZOOM = 3;
    private final int mTransformType;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformer {
    }

    CarouselViewPagerTransformer(int i) {
        this.mTransformType = i;
    }

    public final void transformPage(View view, float f) {
        float f2;
        int i = this.mTransformType;
        if (i != 0) {
            float f3 = 0.0f;
            float f4 = 1.0f;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (f >= -1.0f && f <= 1.0f) {
                            f2 = Math.max(0.85f, 1.0f - Math.abs(f));
                            float f5 = (((f2 - 0.85f) / 0.14999998f) * MIN_ALPHA_ZOOM) + MIN_ALPHA_ZOOM;
                            float f6 = 1.0f - f2;
                            float height = (((float) view.getHeight()) * f6) / 2.0f;
                            float width = (((float) view.getWidth()) * f6) / 2.0f;
                            f3 = f < 0.0f ? width - (height / 2.0f) : (-width) + (height / 2.0f);
                            f4 = f5;
                            view.setAlpha(f4);
                            view.setTranslationX(f3);
                            view.setScaleX(f2);
                            view.setScaleY(f2);
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (f > 0.0f && f < 1.0f) {
                    f3 = ((float) view.getWidth()) * (-f);
                    f4 = 1.0f - f;
                    f2 = ((1.0f - Math.abs(f)) * 0.25f) + 0.75f;
                    view.setAlpha(f4);
                    view.setTranslationX(f3);
                    view.setScaleX(f2);
                    view.setScaleY(f2);
                    return;
                }
            } else if (f < 0.0f && f > -1.0f) {
                f2 = (Math.abs(Math.abs(f) - 1.0f) * 0.14999998f) + 0.85f;
                f4 = Math.max(MIN_ALPHA_SLIDE, 1.0f - Math.abs(f));
                float f7 = (float) (-view.getWidth());
                float f8 = f * f7;
                if (f8 > f7) {
                    f3 = f8;
                }
                view.setAlpha(f4);
                view.setTranslationX(f3);
                view.setScaleX(f2);
                view.setScaleY(f2);
                return;
            }
            f2 = 1.0f;
            view.setAlpha(f4);
            view.setTranslationX(f3);
            view.setScaleX(f2);
            view.setScaleY(f2);
            return;
        }
        view.setRotationY(f * -30.0f);
    }
}

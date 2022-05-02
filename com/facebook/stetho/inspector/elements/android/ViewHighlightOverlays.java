package com.facebook.stetho.inspector.elements.android;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

abstract class ViewHighlightOverlays {
    /* access modifiers changed from: package-private */
    public abstract void highlightView(View view, Rect rect, int i);

    /* access modifiers changed from: package-private */
    public abstract void removeHighlight(View view);

    ViewHighlightOverlays() {
    }

    static ViewHighlightOverlays newInstance() {
        if (Build.VERSION.SDK_INT >= 18) {
            return new ViewHighlightOverlaysJellybeanMR2();
        }
        return new NoOpViewHighlightOverlays();
    }

    static class NoOpViewHighlightOverlays extends ViewHighlightOverlays {
        /* access modifiers changed from: package-private */
        public void highlightView(View view, Rect rect, int i) {
        }

        /* access modifiers changed from: package-private */
        public void removeHighlight(View view) {
        }

        private NoOpViewHighlightOverlays() {
        }
    }

    @TargetApi(18)
    static class ViewHighlightOverlaysJellybeanMR2 extends ViewHighlightOverlays {
        private static final int MARGIN_OVERLAY_COLOR = -1426797922;
        private static final int PADDING_OVERLAY_COLOR = -1430332746;
        private final HighlightDrawable[] mHighlightDrawables;
        private final MainHighlightDrawable mMainHighlightDrawable;

        ViewHighlightOverlaysJellybeanMR2() {
            MainHighlightDrawable mainHighlightDrawable = new MainHighlightDrawable();
            this.mMainHighlightDrawable = mainHighlightDrawable;
            this.mHighlightDrawables = new HighlightDrawable[]{mainHighlightDrawable, new PaddingTopHighlightDrawable(), new PaddingBottomHighlightDrawable(), new PaddingRightHighlightDrawable(), new PaddingLeftHighlightDrawable(), new MarginTopHighlightDrawable(), new MarginBottomHighlightDrawable(), new MarginRightHighlightDrawable(), new MarginLeftHighlightDrawable()};
        }

        /* access modifiers changed from: package-private */
        public void highlightView(View view, Rect rect, int i) {
            this.mMainHighlightDrawable.setColor(i);
            if (rect.isEmpty()) {
                this.mMainHighlightDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            } else {
                this.mMainHighlightDrawable.setBounds(rect);
            }
            for (HighlightDrawable highlightDrawable : this.mHighlightDrawables) {
                highlightDrawable.highlightView(view);
                view.getOverlay().add(highlightDrawable);
            }
        }

        /* access modifiers changed from: package-private */
        public void removeHighlight(View view) {
            for (HighlightDrawable remove : this.mHighlightDrawables) {
                view.getOverlay().remove(remove);
            }
        }

        static abstract class HighlightDrawable extends ColorDrawable {
            protected final Rect mMargins = new Rect();
            protected final Rect mPaddings = new Rect();

            HighlightDrawable(int i) {
                super(i);
            }

            public HighlightDrawable() {
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    this.mMargins.left = marginLayoutParams.leftMargin;
                    this.mMargins.top = marginLayoutParams.topMargin;
                    this.mMargins.right = marginLayoutParams.rightMargin;
                    this.mMargins.bottom = marginLayoutParams.bottomMargin;
                } else {
                    this.mMargins.left = 0;
                    this.mMargins.top = 0;
                    this.mMargins.right = 0;
                    this.mMargins.bottom = 0;
                }
                this.mPaddings.left = view.getPaddingLeft();
                this.mPaddings.top = view.getPaddingTop();
                this.mPaddings.right = view.getPaddingRight();
                this.mPaddings.bottom = view.getPaddingBottom();
            }
        }

        static class MainHighlightDrawable extends HighlightDrawable {
            MainHighlightDrawable() {
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
            }

            public void draw(Canvas canvas) {
                Rect clipBounds = canvas.getClipBounds();
                clipBounds.inset(-(this.mMargins.right + this.mMargins.left), -(this.mMargins.top + this.mMargins.bottom));
                canvas.clipRect(clipBounds, Region.Op.REPLACE);
                super.draw(canvas);
            }
        }

        static class PaddingTopHighlightDrawable extends HighlightDrawable {
            PaddingTopHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(this.mPaddings.left, 0, view.getWidth() - this.mPaddings.right, this.mPaddings.top);
            }
        }

        static class PaddingBottomHighlightDrawable extends HighlightDrawable {
            PaddingBottomHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(this.mPaddings.left, view.getHeight() - this.mPaddings.bottom, view.getWidth() - this.mPaddings.right, view.getHeight());
            }
        }

        static class PaddingRightHighlightDrawable extends HighlightDrawable {
            PaddingRightHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(view.getWidth() - this.mPaddings.right, 0, view.getWidth(), view.getHeight());
            }
        }

        static class PaddingLeftHighlightDrawable extends HighlightDrawable {
            PaddingLeftHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.PADDING_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(0, 0, this.mPaddings.left, view.getHeight());
            }
        }

        static class MarginTopHighlightDrawable extends HighlightDrawable {
            MarginTopHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(0, 0, view.getWidth(), this.mMargins.top);
            }

            public void draw(Canvas canvas) {
                canvas.translate(0.0f, (float) (-this.mMargins.top));
                super.draw(canvas);
            }
        }

        static class MarginBottomHighlightDrawable extends HighlightDrawable {
            MarginBottomHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(0, view.getHeight() - this.mMargins.bottom, view.getWidth(), view.getHeight());
            }

            public void draw(Canvas canvas) {
                canvas.translate(0.0f, (float) (this.mMargins.bottom + this.mMargins.top));
                super.draw(canvas);
            }
        }

        static class MarginRightHighlightDrawable extends HighlightDrawable {
            MarginRightHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(view.getWidth() - this.mMargins.right, 0, view.getWidth(), view.getHeight() + this.mMargins.top + this.mMargins.bottom);
            }

            public void draw(Canvas canvas) {
                canvas.translate((float) this.mMargins.right, (float) (-(this.mMargins.top + this.mMargins.bottom)));
                super.draw(canvas);
            }
        }

        static class MarginLeftHighlightDrawable extends HighlightDrawable {
            MarginLeftHighlightDrawable() {
                super(ViewHighlightOverlaysJellybeanMR2.MARGIN_OVERLAY_COLOR);
            }

            /* access modifiers changed from: package-private */
            public void highlightView(View view) {
                super.highlightView(view);
                setBounds(0, 0, this.mMargins.left, view.getHeight() + this.mMargins.top + this.mMargins.bottom);
            }

            public void draw(Canvas canvas) {
                canvas.translate((float) (-(this.mMargins.left + this.mMargins.right)), 0.0f);
                super.draw(canvas);
            }
        }
    }
}

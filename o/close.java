package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class close {
    public int getMin;
    final Rect setMax;
    protected final RecyclerView.IsOverlapping setMin;

    public abstract int getMax();

    public abstract int getMax(View view);

    public abstract int getMin();

    public abstract int getMin(View view);

    public abstract void getMin(int i);

    public abstract int isInside();

    public abstract int length();

    public abstract int length(View view);

    public abstract int setMax();

    public abstract int setMax(View view);

    public abstract int setMin();

    public abstract int setMin(View view);

    public abstract int toFloatRange();

    public abstract int toFloatRange(View view);

    /* synthetic */ close(RecyclerView.IsOverlapping isOverlapping, byte b) {
        this(isOverlapping);
    }

    private close(RecyclerView.IsOverlapping isOverlapping) {
        this.getMin = Integer.MIN_VALUE;
        this.setMax = new Rect();
        this.setMin = isOverlapping;
    }

    public static close getMax(RecyclerView.IsOverlapping isOverlapping) {
        return new close(isOverlapping) {
            public final int setMax() {
                return this.setMin.getWidth() - this.setMin.getPaddingRight();
            }

            public final int getMax() {
                return this.setMin.getWidth();
            }

            public final void getMin(int i) {
                this.setMin.offsetChildrenHorizontal(i);
            }

            public final int getMin() {
                return this.setMin.getPaddingLeft();
            }

            public final int setMin(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.setMin.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            public final int toFloatRange(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.setMin.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            public final int setMax(View view) {
                return this.setMin.getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
            }

            public final int getMax(View view) {
                return this.setMin.getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
            }

            public final int getMin(View view) {
                this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                return this.setMax.right;
            }

            public final int length(View view) {
                this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                return this.setMax.left;
            }

            public final int setMin() {
                return (this.setMin.getWidth() - this.setMin.getPaddingLeft()) - this.setMin.getPaddingRight();
            }

            public final int length() {
                return this.setMin.getPaddingRight();
            }

            public final int toFloatRange() {
                return this.setMin.getWidthMode();
            }

            public final int isInside() {
                return this.setMin.getHeightMode();
            }
        };
    }

    public static close setMax(RecyclerView.IsOverlapping isOverlapping) {
        return new close(isOverlapping) {
            public final int setMax() {
                return this.setMin.getHeight() - this.setMin.getPaddingBottom();
            }

            public final int getMax() {
                return this.setMin.getHeight();
            }

            public final void getMin(int i) {
                this.setMin.offsetChildrenVertical(i);
            }

            public final int getMin() {
                return this.setMin.getPaddingTop();
            }

            public final int setMin(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.setMin.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
            }

            public final int toFloatRange(View view) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                return this.setMin.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
            }

            public final int setMax(View view) {
                return this.setMin.getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            public final int getMax(View view) {
                return this.setMin.getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
            }

            public final int getMin(View view) {
                this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                return this.setMax.bottom;
            }

            public final int length(View view) {
                this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                return this.setMax.top;
            }

            public final int setMin() {
                return (this.setMin.getHeight() - this.setMin.getPaddingTop()) - this.setMin.getPaddingBottom();
            }

            public final int length() {
                return this.setMin.getPaddingBottom();
            }

            public final int toFloatRange() {
                return this.setMin.getHeightMode();
            }

            public final int isInside() {
                return this.setMin.getWidthMode();
            }
        };
    }

    public static close setMin(RecyclerView.IsOverlapping isOverlapping, int i) {
        if (i == 0) {
            return new close(isOverlapping) {
                public final int setMax() {
                    return this.setMin.getWidth() - this.setMin.getPaddingRight();
                }

                public final int getMax() {
                    return this.setMin.getWidth();
                }

                public final void getMin(int i) {
                    this.setMin.offsetChildrenHorizontal(i);
                }

                public final int getMin() {
                    return this.setMin.getPaddingLeft();
                }

                public final int setMin(View view) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    return this.setMin.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
                }

                public final int toFloatRange(View view) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    return this.setMin.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
                }

                public final int setMax(View view) {
                    return this.setMin.getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
                }

                public final int getMax(View view) {
                    return this.setMin.getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
                }

                public final int getMin(View view) {
                    this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                    return this.setMax.right;
                }

                public final int length(View view) {
                    this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                    return this.setMax.left;
                }

                public final int setMin() {
                    return (this.setMin.getWidth() - this.setMin.getPaddingLeft()) - this.setMin.getPaddingRight();
                }

                public final int length() {
                    return this.setMin.getPaddingRight();
                }

                public final int toFloatRange() {
                    return this.setMin.getWidthMode();
                }

                public final int isInside() {
                    return this.setMin.getHeightMode();
                }
            };
        }
        if (i == 1) {
            return new close(isOverlapping) {
                public final int setMax() {
                    return this.setMin.getHeight() - this.setMin.getPaddingBottom();
                }

                public final int getMax() {
                    return this.setMin.getHeight();
                }

                public final void getMin(int i) {
                    this.setMin.offsetChildrenVertical(i);
                }

                public final int getMin() {
                    return this.setMin.getPaddingTop();
                }

                public final int setMin(View view) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    return this.setMin.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
                }

                public final int toFloatRange(View view) {
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    return this.setMin.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
                }

                public final int setMax(View view) {
                    return this.setMin.getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
                }

                public final int getMax(View view) {
                    return this.setMin.getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
                }

                public final int getMin(View view) {
                    this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                    return this.setMax.bottom;
                }

                public final int length(View view) {
                    this.setMin.getTransformedBoundingBox(view, true, this.setMax);
                    return this.setMax.top;
                }

                public final int setMin() {
                    return (this.setMin.getHeight() - this.setMin.getPaddingTop()) - this.setMin.getPaddingBottom();
                }

                public final int length() {
                    return this.setMin.getPaddingBottom();
                }

                public final int toFloatRange() {
                    return this.setMin.getHeightMode();
                }

                public final int isInside() {
                    return this.setMin.getWidthMode();
                }
            };
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}

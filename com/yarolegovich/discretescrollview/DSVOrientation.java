package com.yarolegovich.discretescrollview;

import android.graphics.Point;
import android.view.View;
import o.onItemsAdded;
import o.onItemsMoved;

public enum DSVOrientation {
    HORIZONTAL {
        /* access modifiers changed from: package-private */
        public final length createHelper() {
            return new getMax();
        }
    },
    VERTICAL {
        /* access modifiers changed from: package-private */
        public final length createHelper() {
            return new getMin();
        }
    };

    public interface length {
        void getMax(Direction direction, int i, Point point);

        boolean getMax(Point point, int i, int i2, int i3, int i4);

        boolean getMax(onItemsAdded onitemsadded);

        int getMin(int i, int i2);

        void getMin(int i, onItemsMoved onitemsmoved);

        int length(int i);

        int length(int i, int i2);

        float setMax(Point point, int i, int i2);

        void setMax(Point point, int i, Point point2);

        boolean setMax();

        int setMin(int i);

        int setMin(int i, int i2);

        boolean setMin();
    }

    public abstract length createHelper();

    protected static class getMax implements length {
        public final int getMin(int i, int i2) {
            return i;
        }

        public final int length(int i) {
            return i;
        }

        public final int length(int i, int i2) {
            return i;
        }

        public final boolean setMax() {
            return true;
        }

        public final int setMin(int i) {
            return 0;
        }

        public final int setMin(int i, int i2) {
            return i;
        }

        public final boolean setMin() {
            return false;
        }

        protected getMax() {
        }

        public final void setMax(Point point, int i, Point point2) {
            point2.set(point.x - i, point.y);
        }

        public final void getMax(Direction direction, int i, Point point) {
            point.set(point.x + direction.applyTo(i), point.y);
        }

        public final boolean getMax(Point point, int i, int i2, int i3, int i4) {
            return point.x - i < i3 + i4 && point.x + i > (-i4);
        }

        public final float setMax(Point point, int i, int i2) {
            return (float) (i - point.x);
        }

        public final boolean getMax(onItemsAdded onitemsadded) {
            View childAt = onitemsadded.invoke.length.getChildAt(0);
            View childAt2 = onitemsadded.invoke.length.getChildAt(onitemsadded.invoke.length.getChildCount() - 1);
            int i = -onitemsadded.length();
            int width = onitemsadded.getWidth() + onitemsadded.length();
            boolean z = onitemsadded.getDecoratedLeft(childAt) > i && onitemsadded.getPosition(childAt) > 0;
            boolean z2 = onitemsadded.getDecoratedRight(childAt2) < width && onitemsadded.getPosition(childAt2) < onitemsadded.getItemCount() - 1;
            if (z || z2) {
                return true;
            }
            return false;
        }

        public final void getMin(int i, onItemsMoved onitemsmoved) {
            onitemsmoved.length.offsetChildrenHorizontal(i);
        }
    }

    protected static class getMin implements length {
        public final int getMin(int i, int i2) {
            return i2;
        }

        public final int length(int i) {
            return 0;
        }

        public final int length(int i, int i2) {
            return i2;
        }

        public final boolean setMax() {
            return false;
        }

        public final int setMin(int i) {
            return i;
        }

        public final int setMin(int i, int i2) {
            return i2;
        }

        public final boolean setMin() {
            return true;
        }

        protected getMin() {
        }

        public final void setMax(Point point, int i, Point point2) {
            point2.set(point.x, point.y - i);
        }

        public final void getMax(Direction direction, int i, Point point) {
            point.set(point.x, point.y + direction.applyTo(i));
        }

        public final float setMax(Point point, int i, int i2) {
            return (float) (i2 - point.y);
        }

        public final boolean getMax(Point point, int i, int i2, int i3, int i4) {
            return point.y - i2 < i3 + i4 && point.y + i2 > (-i4);
        }

        public final void getMin(int i, onItemsMoved onitemsmoved) {
            onitemsmoved.length.offsetChildrenVertical(i);
        }

        public final boolean getMax(onItemsAdded onitemsadded) {
            View childAt = onitemsadded.invoke.length.getChildAt(0);
            View childAt2 = onitemsadded.invoke.length.getChildAt(onitemsadded.invoke.length.getChildCount() - 1);
            int i = -onitemsadded.length();
            int height = onitemsadded.getHeight() + onitemsadded.length();
            boolean z = onitemsadded.getDecoratedTop(childAt) > i && onitemsadded.getPosition(childAt) > 0;
            boolean z2 = onitemsadded.getDecoratedBottom(childAt2) < height && onitemsadded.getPosition(childAt2) < onitemsadded.getItemCount() - 1;
            if (z || z2) {
                return true;
            }
            return false;
        }
    }
}

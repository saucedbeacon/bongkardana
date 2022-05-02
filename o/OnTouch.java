package o;

import o.onDelete;

public interface OnTouch {

    public interface length extends onDelete.length {
        void getMin(String str);

        void setMin(boolean z);
    }

    public interface setMin extends onDelete.getMin {
        void getMax();

        void getMin();

        void length();

        void setMin();
    }
}

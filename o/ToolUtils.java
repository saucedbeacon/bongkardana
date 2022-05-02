package o;

import o.onDelete;

public interface ToolUtils {

    public interface length extends onDelete.length {
        void getMin(boolean z);
    }

    public interface setMin extends onDelete.getMin {
        void getMax();

        void setMin();
    }
}

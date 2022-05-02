package o;

import o.onDelete;

public interface MultilevelSelectCallBack {

    public interface getMin extends onDelete.getMin {
        void length();

        void setMin();
    }
}

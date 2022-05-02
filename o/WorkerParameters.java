package o;

import o.onDelete;

public interface WorkerParameters {

    public interface getMax extends onDelete.getMin {
        void getMax();

        void length();

        void length(String str);

        void setMin();
    }

    public interface length extends onDelete.length {
        void getMin(LoadingBridgeExtension loadingBridgeExtension);

        void setMin();
    }
}

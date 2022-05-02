package o;

import o.onDelete;

public interface GriverSessionDataExtension {

    public interface length extends onDelete.length {
        void setMax(GriverRVExecutorServiceImpl griverRVExecutorServiceImpl);

        void setMax(boolean z);

        void setMin(String str);
    }

    public interface setMax extends onDelete.getMin {
        void getMax(String str, String str2);

        void getMin();

        void length();
    }
}

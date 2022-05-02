package o;

import android.os.Bundle;
import id.dana.domain.model.rpc.response.LoginResponse;
import java.util.List;
import o.onDelete;

public interface isMainThread {

    public interface getMax extends onDelete.getMin {
        void getMax();

        void getMax(String str, String str2, boolean z, String str3, String str4);

        void getMax(String str, boolean z);

        void getMin(String str, Bundle bundle);

        void getMin(String str, String str2, boolean z);

        void length(String str, String str2, String str3, Boolean bool);

        void setMax(String str, String str2, String str3, String str4);

        void setMax(String str, String str2, String str3, boolean z);

        void setMin();
    }

    public interface getMin extends onDelete.length {
        void getMin();

        void getMin(String str, String str2, Integer num);

        void getMin(boolean z);

        void length(LoginResponse loginResponse, List<String> list);

        void length(boolean z);

        void setMax(List<String> list);
    }
}

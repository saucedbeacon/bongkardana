package o;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import o.TitleBarRightButtonView;

public interface IPCParameter {
    TitleBarRightButtonView.AnonymousClass1<Map<String, List<TitleBar>>> getAllServices();

    TitleBarRightButtonView.AnonymousClass1<List<String>> getCategories(@NonNull String str);

    TitleBarRightButtonView.AnonymousClass1<List<TitleBar>> getRawServices();
}

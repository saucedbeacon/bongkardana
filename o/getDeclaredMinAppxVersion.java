package o;

import androidx.annotation.NonNull;
import java.util.LinkedHashMap;
import o.TitleBarRightButtonView;

public interface getDeclaredMinAppxVersion {
    TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSetting(LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap);

    TitleBarRightButtonView.AnonymousClass1<getActivityClz> getSettingByKey(@NonNull String str);

    TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCategories(LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap);

    TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCollection(@NonNull String str);

    TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, getActivityClz>> getSettingKeyByCategoryKey(@NonNull String str);

    TitleBarRightButtonView.AnonymousClass1<Boolean> isSettingSplitNeedtoMigrate();
}

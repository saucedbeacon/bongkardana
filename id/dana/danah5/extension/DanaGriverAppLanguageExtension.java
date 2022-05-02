package id.dana.danah5.extension;

import com.alibaba.griver.base.common.bridge.GriverAppLanguageExtension;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TransitionRes;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/extension/DanaGriverAppLanguageExtension;", "Lcom/alibaba/griver/base/common/bridge/GriverAppLanguageExtension;", "()V", "getAppLanguage", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaGriverAppLanguageExtension implements GriverAppLanguageExtension {
    @NotNull
    public final String getAppLanguage() {
        String min = TransitionRes.setMin().getMin();
        Intrinsics.checkNotNullExpressionValue(min, "LocaleUtil.getCurrentLanguage()");
        return min;
    }
}

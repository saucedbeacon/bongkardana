package o;

import id.dana.danah5.DanaH5;
import id.dana.di.PerActivity;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0002J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/H5Launcher;", "", "dynamicUrlWrapper", "Lid/dana/data/dynamicurl/DynamicUrlWrapper;", "(Lid/dana/data/dynamicurl/DynamicUrlWrapper;)V", "getFormattedUrl", "", "entryPoint", "params", "", "launchTopUpPage", "", "url", "h5Listener", "Lid/dana/danah5/DanaH5Listener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class createPayloadsIfNeeded {
    private final getShortName length;

    @Inject
    public createPayloadsIfNeeded(@NotNull getShortName getshortname) {
        Intrinsics.checkNotNullParameter(getshortname, "dynamicUrlWrapper");
        this.length = getshortname;
    }

    public static /* synthetic */ void length(String str, Map map) {
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(map, "params");
        setH5OptionMenuTextFlag min = setH5OptionMenuTextFlag.setMin(str);
        for (Map.Entry entry : map.entrySet()) {
            min.getMin((String) entry.getKey(), (String) entry.getValue());
        }
        String max = min.getMax();
        if (max != null) {
            str = max;
        }
        DanaH5.startContainerFullUrl(str, (setCancelOnTouchOutside$core) null);
    }
}

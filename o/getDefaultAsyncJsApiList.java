package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getDefaultAsyncJsApiList extends parseFailed<resourceTypeMonitor, setMax> {
    private final GriverResourceManager promoCenterRepository;

    @Inject
    public getDefaultAsyncJsApiList(appxLoadFailed appxloadfailed, getScheme getscheme, GriverResourceManager griverResourceManager) {
        super(appxloadfailed, getscheme);
        this.promoCenterRepository = griverResourceManager;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<resourceTypeMonitor> buildUseCaseObservable(setMax setmax) {
        return this.promoCenterRepository.getPromoCategorizedList(setmax.promoCategoryRequest);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public final saveConfiguration promoCategoryRequest;

        private setMax(int i, int i2, List<String> list, String str, String str2, double d, double d2) {
            this.promoCategoryRequest = new saveConfiguration(i, i2, list, str, str2, d, d2);
        }

        public static setMax forGetPromoCategorizedList(int i, int i2, String str, String str2, String str3, double d, double d2) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                String str4 = str;
                arrayList.add(str);
            }
            return new setMax(i, i2, arrayList, str2, str3, d, d2);
        }
    }
}

package o;

import java.util.List;
import o.TitleBarRightButtonView;

public final class addData2Performance implements flowLog {
    private final errorLog exploreDanaPreferences;

    public addData2Performance(errorLog errorlog) {
        this.exploreDanaPreferences = errorlog;
    }

    public final TitleBarRightButtonView.AnonymousClass1<List<getDefaultProxy>> checkExploreDanaPreferences(List<getDefaultProxy> list) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new uploadPerfLog(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$checkExploreDanaPreferences$0(List list) throws Exception {
        return this.exploreDanaPreferences.checkExploreDanaItem(list);
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setReadDanaPreferences(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(this.exploreDanaPreferences.saveExploreDanaItem(str));
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setDismissAll(List<String> list) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new track(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$setDismissAll$1(List list) throws Exception {
        return this.exploreDanaPreferences.setDismissAll(list);
    }
}

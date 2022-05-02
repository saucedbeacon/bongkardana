package o;

import o.PackageDownloadRequest;
import o.TitleBarRightButtonView;

public final class setScale<T> implements resolveKeyPath<T> {
    private final PackageDownloadRequest.AnonymousClass1 generalPreferences;

    public setScale(PackageDownloadRequest.AnonymousClass1 r1) {
        this.generalPreferences = r1;
    }

    public final TitleBarRightButtonView.AnonymousClass1<T> getObject(String str, Class<T> cls) {
        return TitleBarRightButtonView.AnonymousClass1.create(new getScale(this, str, cls));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getObject$0(String str, Class cls, TitleBarRightButtonView.AnonymousClass2 r4) throws Exception {
        Object object = this.generalPreferences.getObject(str, cls);
        if (object != null) {
            r4.onNext(object);
        }
        r4.onComplete();
    }

    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveData(String str, T t) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.generalPreferences.saveData(str, t)));
    }
}

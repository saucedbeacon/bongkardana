package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.PackageDownloadRequest;

@Singleton
public class onAppExit extends uncheckItems<resolveKeyPath<onEmbedViewDestory>> {
    private final PackageDownloadRequest.AnonymousClass1 generalPreferences;

    @Inject
    public onAppExit(PackageDownloadRequest.AnonymousClass1 r1) {
        this.generalPreferences = r1;
    }

    public resolveKeyPath<onEmbedViewDestory> createData(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-2057599547, oncanceled);
            onCancelLoad.getMin(-2057599547, oncanceled);
        }
        return new setScale(this.generalPreferences);
    }
}

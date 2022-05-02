package id.dana.di.modules;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import o.AUHorizontalListView;
import o.GriverShareExtensionImpl;
import o.captureScreen;
import o.rememberWindowAttachCount;

@Module
public class SubMenuModule {
    private captureScreen.setMax getMax;

    @Provides
    public captureScreen.length getMin(GriverShareExtensionImpl.AnonymousClass3 r1) {
        return r1;
    }

    public SubMenuModule(captureScreen.setMax setmax) {
        this.getMax = setmax;
    }

    @Provides
    public captureScreen.setMax setMax() {
        return this.getMax;
    }

    @Provides
    public AUHorizontalListView.SelectionNotifier getMax(Context context) {
        return new rememberWindowAttachCount(context);
    }
}

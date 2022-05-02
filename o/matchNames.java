package o;

import android.content.Context;
import id.dana.R;
import id.dana.di.PerActivity;
import javax.inject.Inject;
import o.getFavicon;
import o.getTransitionProperties;

@PerActivity
public final class matchNames implements getTransitionProperties.getMax {
    private final getFavicon length;
    /* access modifiers changed from: private */
    public final Context setMax;
    /* access modifiers changed from: private */
    public final getTransitionProperties.IsOverlapping setMin;

    @Inject
    public matchNames(Context context, getFavicon getfavicon, getTransitionProperties.IsOverlapping isOverlapping) {
        this.setMax = context;
        this.length = getfavicon;
        this.setMin = isOverlapping;
    }

    public final void setMin(String str, String str2, String str3) {
        this.length.execute(new GriverAppVirtualHostProxy<APWebSettings>() {
            public final /* synthetic */ void onNext(Object obj) {
                matchNames.this.setMin.setMin(((APWebSettings) obj).getLink());
            }

            public final void onError(Throwable th) {
                super.onError(th);
                matchNames.this.setMin.onError(matchNames.this.setMax.getString(R.string.failed_generate_url));
            }
        }, getFavicon.getMax.forParams(str, str2, str3));
    }

    public final void setMax() {
        this.length.dispose();
    }
}

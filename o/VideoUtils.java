package o;

import java.util.List;
import javax.inject.Inject;
import o.OrientationDetector;

public final class VideoUtils implements OrientationDetector.MyTabOrientationListener.setMin {
    OrientationDetector.MyTabOrientationListener.length getMax;
    onPreExecute setMin;

    @Inject
    public VideoUtils(onPreExecute onpreexecute, OrientationDetector.MyTabOrientationListener.length length) {
        this.setMin = onpreexecute;
        this.getMax = length;
    }

    public final void setMin() {
        this.setMin.execute(new GriverAppVirtualHostProxy<List<String>>() {
            public final /* synthetic */ void onNext(Object obj) {
                VideoUtils.this.getMax.onSuccessGetSocialMediaCategoryShare((List) obj);
            }
        });
    }

    public final void setMax() {
        this.setMin.dispose();
    }
}

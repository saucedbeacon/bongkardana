package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public final class handleSnapshot extends setSpeed<getMD5String, captureNXView> {
    private final captureEmbedView length;
    public List<String> setMax;

    public final /* synthetic */ Object map(Object obj) {
        saveImageToGallery saveimagetogallery;
        getMD5String getmd5string = (getMD5String) obj;
        if (getmd5string == null) {
            return null;
        }
        captureNXView capturenxview = new captureNXView();
        capturenxview.getMax = getmd5string.getMerchantName();
        List<getMD5Base64> availableScope = getmd5string.getAvailableScope();
        ArrayList arrayList = new ArrayList();
        if (!(availableScope == null || this.setMax == null)) {
            for (getMD5Base64 next : availableScope) {
                for (String equals : this.setMax) {
                    if (equals.equals(next.getScopeName())) {
                        if (next != null) {
                            saveimagetogallery = new saveImageToGallery();
                            saveimagetogallery.setMax = next.getScopeName();
                            saveimagetogallery.length = next.getScopeDescription();
                        } else {
                            saveimagetogallery = null;
                        }
                        arrayList.add(saveimagetogallery);
                    }
                }
            }
        }
        capturenxview.setMin = arrayList;
        return capturenxview;
    }

    @Inject
    handleSnapshot(captureEmbedView captureembedview) {
        this.length = captureembedview;
    }

    public static captureNXView getMin(SplashEntryInfo splashEntryInfo) {
        if (splashEntryInfo == null) {
            return null;
        }
        captureNXView capturenxview = new captureNXView();
        capturenxview.getMax = splashEntryInfo.getMerchantInfo().getMerchantName();
        capturenxview.setMin = getMax(splashEntryInfo.getAgreements());
        return capturenxview;
    }

    private static List<saveImageToGallery> getMax(List<base64> list) {
        saveImageToGallery saveimagetogallery;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (base64 next : list) {
                if (next != null) {
                    saveimagetogallery = new saveImageToGallery();
                    saveimagetogallery.setMax = next.getTitle();
                    saveimagetogallery.length = next.getDescription();
                } else {
                    saveimagetogallery = null;
                }
                arrayList.add(saveimagetogallery);
            }
        }
        return arrayList;
    }
}

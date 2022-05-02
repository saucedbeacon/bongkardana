package o;

import kotlin.jvm.functions.Function1;

final class PhotoGrid implements Function1 {
    private final getPhotoPreview getMax;

    public PhotoGrid(getPhotoPreview getphotopreview) {
        this.getMax = getphotopreview;
    }

    public final Object invoke(Object obj) {
        return this.getMax.toString.onGetSendMoneyFeedConfigSuccess(((Boolean) obj).toString());
    }
}

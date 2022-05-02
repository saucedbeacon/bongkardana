package o;

import android.text.TextUtils;
import id.dana.contract.exploredana.PlayerType;
import id.dana.di.PerActivity;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import o.TakePictureProcessor;
import o.getFixedFontFamily;
import o.getTrimPathStart;
import o.setFixedFontFamily;

@PerActivity
public final class setFillAlpha implements getTrimPathStart.getMax {
    /* access modifiers changed from: private */
    public final TakePictureProcessor.AnonymousClass2 getMax;
    private final getStandardFontFamily getMin;
    private final getFixedFontFamily length;
    /* access modifiers changed from: private */
    public final getTrimPathStart.length setMax;
    private final setFixedFontFamily setMin;

    @Inject
    public setFillAlpha(getTrimPathStart.length length2, getStandardFontFamily getstandardfontfamily, setFixedFontFamily setfixedfontfamily, getFixedFontFamily getfixedfontfamily, TakePictureProcessor.AnonymousClass2 r5) {
        this.setMax = length2;
        this.getMin = getstandardfontfamily;
        this.setMin = setfixedfontfamily;
        this.length = getfixedfontfamily;
        this.getMax = r5;
    }

    public final void setMin(final String str) {
        this.setMin.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setFillAlpha.this.setMax.onRead(str);
            }
        }, setFixedFontFamily.getMax.forRead(str));
    }

    public final void setMax(List<String> list) {
        this.length.execute(new GriverAppVirtualHostProxy<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                setFillAlpha.this.setMax.onEmptyExploreDanaEntityList();
            }
        }, getFixedFontFamily.setMin.forDismiss(list));
    }

    public final void getMax() {
        this.setMax.showProgress();
        this.getMin.execute(new GriverAppVirtualHostProxy<GriverAMCSLiteAppUpdater>() {
            public final /* synthetic */ void onNext(Object obj) {
                TakePictureProcessor.AnonymousClass7 r4;
                setFillAlpha.this.setMax.dismissProgress();
                List<getDefaultProxy> cdpContents = ((GriverAMCSLiteAppUpdater) obj).getCdpContents();
                if (cdpContents == null || cdpContents.isEmpty()) {
                    setFillAlpha.this.setMax.onEmptyExploreDanaEntityList();
                    return;
                }
                getTrimPathStart.length min = setFillAlpha.this.setMax;
                TakePictureProcessor.AnonymousClass2 unused = setFillAlpha.this.getMax;
                ArrayList arrayList = null;
                if (cdpContents != null && !cdpContents.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (getDefaultProxy next : cdpContents) {
                        if (next != null) {
                            r4 = new Object() {
                                public String getMax;
                                public String getMin;
                                public String length;
                                public String setMax;
                                public String setMin;
                            };
                            r4.setMin = next.getContentName();
                            r4.getMax = next.getContentValue();
                            r4.getMin = next.getContentId();
                            r4.length = next.getRedirectUrl();
                            String redirectUrl = next.getRedirectUrl();
                            r4.setMax = (!"video".equalsIgnoreCase(next.getExtendInfo()) || TextUtils.isEmpty(redirectUrl)) ? PlayerType.H5CONTAINER : redirectUrl.contains("https://www.youtube.com") ? PlayerType.YOUTUBE : PlayerType.EXOPLAYER;
                        } else {
                            r4 = null;
                        }
                        if (r4 != null) {
                            arrayList2.add(r4);
                        }
                    }
                    arrayList = arrayList2;
                }
                min.onSuccessGetDana(arrayList);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                setFillAlpha.this.setMax.dismissProgress();
            }
        });
    }

    public final void setMax() {
        this.getMin.dispose();
        this.setMin.dispose();
        this.length.dispose();
    }
}

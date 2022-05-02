package o;

import android.net.Uri;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.H5DevConfig;
import o.debugSwitch;
import o.getDialogLayout;
import o.setInitScenario;

@PerActivity
public final class LayoutMode implements getDialogLayout.length {
    /* access modifiers changed from: private */
    public int IsOverlapping = 0;
    private final debugSwitch equals;
    /* access modifiers changed from: private */
    public final sendHttp getMax;
    private final H5DevConfig getMin;
    /* access modifiers changed from: private */
    public int isInside = 0;
    private final logFolderTree length;
    private final setInitScenario setMax;
    private final getShortName setMin;
    /* access modifiers changed from: private */
    public List<setCurrentStartToken> toFloatRange;
    /* access modifiers changed from: private */
    public final getDialogLayout.getMax toIntRange;

    @Inject
    public LayoutMode(sendHttp sendhttp, getDialogLayout.getMax getmax, H5DevConfig h5DevConfig, setInitScenario setinitscenario, debugSwitch debugswitch, logFolderTree logfoldertree, getShortName getshortname) {
        this.getMax = sendhttp;
        this.toIntRange = getmax;
        this.getMin = h5DevConfig;
        this.setMax = setinitscenario;
        this.equals = debugswitch;
        this.length = logfoldertree;
        this.setMin = getshortname;
    }

    public final void setMin() {
        this.length.execute(new GriverAppVirtualHostProxy<Long>() {
            public final /* synthetic */ void onNext(Object obj) {
                LayoutMode.this.getMin.execute(new GriverAppVirtualHostProxy<setBooleanConfig>() {
                    public final /* synthetic */ void onNext(Object obj) {
                        setBooleanConfig setbooleanconfig = (setBooleanConfig) obj;
                        if (setbooleanconfig != null && setbooleanconfig.isSuccess()) {
                            int min = LayoutMode.this.isInside + setbooleanconfig.getNumUpdated();
                            LayoutMode layoutMode = LayoutMode.this;
                            sendHttp unused = layoutMode.getMax;
                            List<setStringConfig> badgeInfos = setbooleanconfig.getBadgeInfos();
                            ArrayList arrayList = null;
                            if (badgeInfos != null && badgeInfos.size() > 0) {
                                arrayList = new ArrayList();
                                for (setStringConfig next : badgeInfos) {
                                    setCurrentStartToken setcurrentstarttoken = new setCurrentStartToken();
                                    setcurrentstarttoken.length = next.getKey();
                                    setcurrentstarttoken.getMin = next.getNumUpdated();
                                    sendHttp.getMin(setcurrentstarttoken.getMin);
                                    arrayList.add(setcurrentstarttoken);
                                }
                            }
                            List unused2 = layoutMode.toFloatRange = arrayList;
                            LayoutMode.this.equals.execute(new GriverAppVirtualHostProxy<Long>() {
                                public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                                }
                            }, debugSwitch.setMax.forSavePocketLastTimestamp(setbooleanconfig.getServerTimestamp()));
                            getDialogLayout.getMax length = LayoutMode.this.toIntRange;
                            LayoutMode layoutMode2 = LayoutMode.this;
                            length.getMin(min, LayoutMode.setMin(layoutMode2, layoutMode2.toFloatRange, setbooleanconfig.getServerTimestamp()));
                        }
                    }

                    public final void onError(Throwable th) {
                        super.onError(th);
                        LayoutMode.this.toIntRange.onError(th.getMessage());
                        StringBuilder sb = new StringBuilder(DanaLogConstants.Prefix.HOME_GETPOCKET_PREFIX);
                        sb.append(getClass().getName());
                        sb.append(":onError ");
                        updateActionSheetContent.e(DanaLogConstants.TAG.HOME_TAG, sb.toString(), th);
                    }
                }, H5DevConfig.setMin.forGetPocketNumber(((Long) obj).longValue()));
            }
        });
    }

    public final void setMax() {
        this.length.dispose();
        this.getMin.dispose();
        this.equals.dispose();
        this.setMax.dispose();
    }

    static /* synthetic */ String setMin(LayoutMode layoutMode, List list, long j) {
        Uri.Builder appendQueryParameter = Uri.parse(layoutMode.setMin.getPocketUrl()).buildUpon().appendQueryParameter(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, String.valueOf(j));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            setCurrentStartToken setcurrentstarttoken = (setCurrentStartToken) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(setcurrentstarttoken.length.substring(0, 1).toUpperCase());
            sb.append(setcurrentstarttoken.length.substring(1).toLowerCase());
            String obj = sb.toString();
            int i = layoutMode.isInside;
            layoutMode.setMax.execute(new GriverAppVirtualHostProxy<Integer>() {
                public final /* synthetic */ void onNext(Object obj) {
                    int unused = LayoutMode.this.IsOverlapping = ((Integer) obj).intValue();
                }
            }, setInitScenario.getMax.forGetPocketNumberBasedOnKey(obj.toLowerCase()));
            layoutMode.isInside = i + layoutMode.IsOverlapping;
            appendQueryParameter.appendQueryParameter(obj.toLowerCase(), String.valueOf(setcurrentstarttoken.getMin));
        }
        return appendQueryParameter.build().toString();
    }
}

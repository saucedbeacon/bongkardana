package o;

import android.content.Context;
import id.dana.R;
import id.dana.data.base.NetworkException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.BindDimen;
import o.OrientationDetector;

public final class BindColor implements BindDimen.setMax {
    private final toHexString getMax;
    /* access modifiers changed from: private */
    public final OrientationDetector.OrientationListener getMin;
    /* access modifiers changed from: private */
    public final Context length;
    /* access modifiers changed from: private */
    public final BindDimen.setMin setMax;

    @Inject
    public BindColor(BindDimen.setMin setmin, toHexString tohexstring, OrientationDetector.OrientationListener orientationListener, Context context) {
        this.setMax = setmin;
        this.getMax = tohexstring;
        this.getMin = orientationListener;
        this.length = context;
    }

    public final void setMax(final List<String> list) {
        this.setMax.showProgress();
        this.getMax.execute(new GriverAppVirtualHostProxy<List<String>>() {
            public final /* synthetic */ void onNext(Object obj) {
                List list = (List) obj;
                BindColor.this.setMax.dismissProgress();
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str.equals((String) it.next())) {
                                arrayList.add(str);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                BindColor.this.setMax.setMin(BindColor.this.getMin.getMin(arrayList));
            }

            public final void onError(Throwable th) {
                String str;
                super.onError(th);
                BindColor.this.setMax.dismissProgress();
                BindDimen.setMin length2 = BindColor.this.setMax;
                Context min = BindColor.this.length;
                if (th instanceof NetworkException) {
                    str = ((NetworkException) th).getMessage();
                } else {
                    str = min.getString(R.string.general_error_msg);
                }
                length2.onError(str);
                updateActionSheetContent.logNetworkException(DanaLogConstants.Prefix.CATEGORY_LIFESTYLE_PREFIX, DanaLogConstants.ExceptionType.LIFESTYLE_EXCEPTION, th);
            }
        });
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}

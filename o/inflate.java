package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import java.io.Closeable;
import java.io.Flushable;
import o.CustomTabsService;

public final class inflate implements Closeable, Flushable {
    final CustomTabsService.FilePurpose setMax;
    private final CustomTabsService.Result setMin;

    /* renamed from: o.inflate$default  reason: invalid class name */
    public interface Cdefault {
        @OperationType("alipayplus.mobilewallet.oauth.authcode.apply")
        @SignCheck
        maybeSetTextColor oauthAuthCodeApply(waitForWidth waitforwidth);
    }

    public final void flush() {
        this.setMin.flush();
    }

    public final void close() {
        this.setMin.close();
    }
}

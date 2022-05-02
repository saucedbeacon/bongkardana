package id.dana.danah5.base;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.page.GriverInterceptUrlEvent;
import com.alibaba.griver.api.common.page.GriverPageHelperEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lid/dana/danah5/base/UrlTransportEventHandler;", "Lcom/alibaba/griver/api/common/page/GriverPageHelperEvent;", "Lcom/alibaba/griver/api/common/page/GriverInterceptUrlEvent;", "()V", "interceptUrl", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "url", "", "onFinalized", "", "onInitialized", "onPageBacked", "onPageDestroy", "onPageExit", "onPageFinished", "onPagePause", "onPageResume", "onPageStarted", "onProgressChanged", "p2", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public class UrlTransportEventHandler implements GriverPageHelperEvent, GriverInterceptUrlEvent {
    public boolean interceptUrl(@Nullable Page page, @Nullable String str) {
        return false;
    }

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public void onPageBacked(@Nullable Page page) {
    }

    public void onPageDestroy(@Nullable Page page) {
    }

    public void onPageExit(@Nullable Page page) {
    }

    public void onPageFinished(@Nullable Page page, @Nullable String str) {
    }

    public void onPagePause(@Nullable Page page) {
    }

    public void onPageResume(@Nullable Page page) {
    }

    public void onPageStarted(@Nullable Page page, @Nullable String str) {
    }

    public void onProgressChanged(@Nullable Page page, @Nullable String str, int i) {
    }
}

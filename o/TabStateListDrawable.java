package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

public interface TabStateListDrawable {
    @OperationType("alipayplus.mobilewallet.ipg.register.url.consult")
    @SignCheck
    renderView getRegistrationUrl(EmbedAppContext embedAppContext);
}

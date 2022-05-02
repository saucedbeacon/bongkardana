package o;

import com.alibaba.griver.api.common.network.HttpRequest;
import com.alibaba.griver.api.common.network.HttpResponse;

public interface AgreementConfirmPoint {
    HttpResponse performRequest(HttpRequest httpRequest) throws Exception;
}

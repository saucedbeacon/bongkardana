package o;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.acl.payment.PaymentResult;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import o.SavedStateHandleController;

public class setDefault implements Callback {
    public static final setDefault getMin = new setDefault();

    public void result(Result result) {
        setLight.lambda$getPayRequest$0((PaymentResult) result);
    }

    public static /* synthetic */ void setMax(JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            do {
                jsonReader.peek();
                JsonToken jsonToken = JsonToken.NULL;
            } while (min == 142);
            jsonReader.skipValue();
        }
        jsonReader.endObject();
    }
}

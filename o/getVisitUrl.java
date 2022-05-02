package o;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Singleton;
import org.json.JSONObject;

@Singleton
public class getVisitUrl extends setSpeed<JSONObject, DeepLinkPayloadEntity> {
    private static final String REPLACE_TARGET = "$android";
    private static final String REPLACE_TO = "android";

    /* access modifiers changed from: protected */
    public DeepLinkPayloadEntity map(JSONObject jSONObject) {
        try {
            return (DeepLinkPayloadEntity) new GsonBuilder().disableHtmlEscaping().create().fromJson(jSONObject.toString().replace(REPLACE_TARGET, REPLACE_TO), DeepLinkPayloadEntity.class);
        } catch (JsonSyntaxException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.DEEPLINK_TAG, "[DeepLink]parsing deepLink payload error", e);
            return null;
        }
    }
}

package o;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import io.split.android.client.service.sseclient.InvalidJwtTokenException;
import io.split.android.client.service.sseclient.SseJwtToken;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class signWithToken {
    static final Type ALL_TOKEN_TYPE = new TypeToken<Map<String, Object>>() {
    }.getType();
    static final Type CHANNEL_TYPE = new TypeToken<Map<String, List<String>>>() {
    }.getType();
    private static final String PUBLISHERS_CHANNEL_METADATA = "channel-metadata:publishers";
    private static final String PUBLISHERS_CHANNEL_PREFIX = "[?occupancy=metrics.publishers]";

    public SseJwtToken parse(String str) throws InvalidJwtTokenException {
        if (str != null) {
            String extractTokenData = extractTokenData(str);
            if (extractTokenData != null) {
                String base64Decode = base64Decode(extractTokenData);
                if (base64Decode != null) {
                    try {
                        getOtp getotp = (getOtp) IUMIDInitListenerEx.fromJson(base64Decode, getOtp.class);
                        if (getotp == null || getotp.getChannelList() == null) {
                            createLoadingDialog.e("SSE JWT data is empty or not valid.");
                            throw new InvalidJwtTokenException();
                        }
                        Map map = (Map) IUMIDInitListenerEx.fromJson(getotp.getChannelList(), CHANNEL_TYPE);
                        if (map != null) {
                            ArrayList arrayList = new ArrayList();
                            for (String str2 : map.keySet()) {
                                List list = (List) map.get(str2);
                                if (list == null || !list.contains(PUBLISHERS_CHANNEL_METADATA)) {
                                    arrayList.add(str2);
                                } else {
                                    arrayList.add(PUBLISHERS_CHANNEL_PREFIX.concat(String.valueOf(str2)));
                                }
                            }
                            return new SseJwtToken(getotp.getIssuedAt(), getotp.getExpirationAt(), arrayList, str);
                        }
                        createLoadingDialog.e("SSE JWT has not channels.");
                        throw new InvalidJwtTokenException();
                    } catch (JsonSyntaxException e) {
                        StringBuilder sb = new StringBuilder("Error parsing SSE authentication JWT json ");
                        sb.append(e.getLocalizedMessage());
                        createLoadingDialog.e(sb.toString());
                        throw new InvalidJwtTokenException();
                    } catch (Exception e2) {
                        StringBuilder sb2 = new StringBuilder("Unknonwn error while parsing SSE authentication JWT: ");
                        sb2.append(e2.getLocalizedMessage());
                        createLoadingDialog.e(sb2.toString());
                        throw new InvalidJwtTokenException();
                    }
                } else {
                    createLoadingDialog.e("Could not decode SSE authentication JWT payload.");
                    throw new InvalidJwtTokenException();
                }
            } else {
                createLoadingDialog.e("SSE authentication JWT payload is not valid.");
                throw new InvalidJwtTokenException();
            }
        } else {
            createLoadingDialog.e("Error: JWT is null.");
            throw new InvalidJwtTokenException();
        }
    }

    @Nullable
    private String extractTokenData(String str) {
        String[] split = str.split("\\.");
        if (split.length > 1) {
            return split[1];
        }
        return null;
    }

    @Nullable
    private String base64Decode(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Received bytes didn't correspond to a valid Base64 encoded string.");
            sb.append(e.getLocalizedMessage());
            createLoadingDialog.e(sb.toString());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("An unknown error has ocurred ");
            sb2.append(e2.getLocalizedMessage());
            createLoadingDialog.e(sb2.toString());
        }
        return null;
    }

    private List<String> emptyChannelList() {
        return new ArrayList();
    }
}

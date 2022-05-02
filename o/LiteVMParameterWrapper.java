package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import io.split.android.client.dtos.MySegment;
import io.split.android.client.service.http.HttpResponseParser;
import io.split.android.client.service.http.HttpResponseParserException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public final class LiteVMParameterWrapper implements HttpResponseParser<List<MySegment>> {
    private static final Type MY_SEGMENTS_RESPONSE_TYPE = new TypeToken<Map<String, List<MySegment>>>() {
    }.getType();

    public final List<MySegment> parse(String str) throws HttpResponseParserException {
        try {
            return (List) ((Map) IUMIDInitListenerEx.fromJson(str, MY_SEGMENTS_RESPONSE_TYPE)).get("mySegments");
        } catch (JsonSyntaxException e) {
            StringBuilder sb = new StringBuilder("Syntax error parsing my segments http response: ");
            sb.append(e.getLocalizedMessage());
            throw new HttpResponseParserException(sb.toString());
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("Unknown error parsing my segments http response: ");
            sb2.append(e2.getLocalizedMessage());
            throw new HttpResponseParserException(sb2.toString());
        }
    }
}

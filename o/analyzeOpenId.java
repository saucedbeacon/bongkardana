package o;

import com.google.gson.JsonSyntaxException;
import io.split.android.client.dtos.SplitChange;
import io.split.android.client.service.http.HttpResponseParser;
import io.split.android.client.service.http.HttpResponseParserException;

public final class analyzeOpenId implements HttpResponseParser<SplitChange> {
    public final SplitChange parse(String str) throws HttpResponseParserException {
        try {
            return (SplitChange) IUMIDInitListenerEx.fromJson(str, SplitChange.class);
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

package o;

import java.util.List;
import o.InitParams;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.tokens.Token;

public final class LogLevel<T> extends Token {
    public final String getMax;
    public final List<T> setMin;

    public final class Level extends Token {
        public Level(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2) {
            super(r1, r2);
        }

        public final Token.ID getMin() {
            return Token.ID.FlowMappingEnd;
        }
    }

    public LogLevel(String str, List<T> list, InitParams.AnonymousClass1 r3, InitParams.AnonymousClass1 r4) {
        super(r3, r4);
        this.getMax = str;
        if (list == null || list.size() == 2) {
            this.setMin = list;
            return;
        }
        StringBuilder sb = new StringBuilder("Two strings must be provided instead of ");
        sb.append(String.valueOf(list.size()));
        throw new YAMLException(sb.toString());
    }

    public final Token.ID getMin() {
        return Token.ID.Directive;
    }
}

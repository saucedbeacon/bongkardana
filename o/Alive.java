package o;

import o.InitParams;
import org.yaml.snakeyaml.tokens.Token;

public final class Alive extends Token {
    public Alive(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2) {
        super(r1, r2);
    }

    public final Token.ID getMin() {
        return Token.ID.DocumentEnd;
    }
}

package o;

import o.InitParams;
import org.yaml.snakeyaml.tokens.Token;

public final class isZipAndSevenZip extends Token {
    public final String length;

    public isZipAndSevenZip(String str, InitParams.AnonymousClass1 r2, InitParams.AnonymousClass1 r3) {
        super(r2, r3);
        this.length = str;
    }

    public final Token.ID getMin() {
        return Token.ID.Anchor;
    }
}

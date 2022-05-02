package o;

import o.InitParams;
import org.yaml.snakeyaml.tokens.Token;

public final class getLogForSpmID extends Token {
    public final getExtInfoForSpmID length;

    public getLogForSpmID(getExtInfoForSpmID getextinfoforspmid, InitParams.AnonymousClass1 r2, InitParams.AnonymousClass1 r3) {
        super(r2, r3);
        this.length = getextinfoforspmid;
    }

    public final Token.ID getMin() {
        return Token.ID.Tag;
    }
}

package o;

import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.tokens.Token;

public final class getProcessAlias extends Token {
    public final String getMax;
    public final DumperOptions.ScalarStyle setMax;
    private final boolean setMin;

    public getProcessAlias(String str, InitParams.AnonymousClass1 r8, InitParams.AnonymousClass1 r9) {
        this(str, true, r8, r9, DumperOptions.ScalarStyle.PLAIN);
    }

    public getProcessAlias(String str, boolean z, InitParams.AnonymousClass1 r3, InitParams.AnonymousClass1 r4, DumperOptions.ScalarStyle scalarStyle) {
        super(r3, r4);
        this.getMax = str;
        this.setMin = z;
        if (scalarStyle != null) {
            this.setMax = scalarStyle;
            return;
        }
        throw new NullPointerException("Style must be provided.");
    }

    public final boolean length() {
        return this.setMin;
    }

    public final Token.ID getMin() {
        return Token.ID.Scalar;
    }
}

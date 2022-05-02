package o;

import java.util.Objects;
import o.InitParams;
import org.yaml.snakeyaml.comments.CommentType;
import org.yaml.snakeyaml.tokens.Token;

public final class apm extends Token {
    public final String getMax;
    public final CommentType setMax;

    public apm(CommentType commentType, String str, InitParams.AnonymousClass1 r3, InitParams.AnonymousClass1 r4) {
        super(r3, r4);
        Objects.requireNonNull(commentType);
        this.setMax = commentType;
        Objects.requireNonNull(str);
        this.getMax = str;
    }

    public final Token.ID getMin() {
        return Token.ID.Comment;
    }
}

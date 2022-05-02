package o;

import org.mozilla.javascript.Token;

public final class getFaceRegion extends isHasFace {
    private Token.CommentType isInside;
    private String toIntRange;

    public getFaceRegion(int i, int i2, Token.CommentType commentType, String str) {
        super(i, i2);
        this.getMin = 162;
        this.isInside = commentType;
        this.toIntRange = str;
    }
}

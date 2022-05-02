package o;

import com.j256.ormlite.stmt.query.SimpleComparison;
import o.InitParams;
import org.yaml.snakeyaml.comments.CommentType;

public final class setFeVer {
    private CommentType getMax;
    private InitParams.AnonymousClass1 length;
    public InitParams.AnonymousClass1 setMax;
    private String setMin;

    private setFeVer(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2, String str, CommentType commentType) {
        this.setMax = r1;
        this.length = r2;
        this.setMin = str;
        this.getMax = commentType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
        sb.append(getClass().getName());
        sb.append(" (type=");
        sb.append(this.getMax);
        sb.append(", value=");
        sb.append(this.setMin);
        sb.append(")>");
        return sb.toString();
    }

    public setFeVer(setLogCustomizeControl setlogcustomizecontrol) {
        this(setlogcustomizecontrol.length, setlogcustomizecontrol.setMin, setlogcustomizecontrol.setMax, setlogcustomizecontrol.getMax);
    }
}

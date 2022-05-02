package o;

import java.io.File;
import o.getConstraintSetNames;

public class access$100 implements getConstraintSetNames.setMin {
    private final long getMin = 262144000;
    private final getMax setMax;

    public interface getMax {
        File length();
    }

    public access$100(getMax getmax) {
        this.setMax = getmax;
    }

    public final getConstraintSetNames setMax() {
        File length = this.setMax.length();
        if (length == null) {
            return null;
        }
        if (length.mkdirs() || (length.exists() && length.isDirectory())) {
            return new access$300(length, this.getMin);
        }
        return null;
    }
}

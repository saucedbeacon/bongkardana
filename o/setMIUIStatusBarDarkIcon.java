package o;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import io.split.android.client.Evaluator;
import io.split.android.client.dtos.MatcherCombiner;
import java.util.List;
import java.util.Map;

public final class setMIUIStatusBarDarkIcon {
    private final MatcherCombiner getMax;
    private final ImmutableList<setTranslucentForImageView> getMin;

    public setMIUIStatusBarDarkIcon(MatcherCombiner matcherCombiner, List<setTranslucentForImageView> list) {
        ImmutableList<setTranslucentForImageView> copyOf = ImmutableList.copyOf(list);
        this.getMin = copyOf;
        this.getMax = matcherCombiner;
        Preconditions.checkArgument(copyOf.size() > 0);
    }

    public final boolean getMax(String str, String str2, Map<String, Object> map, Evaluator evaluator) {
        if (this.getMin.isEmpty()) {
            return false;
        }
        if (this.getMax == MatcherCombiner.AND) {
            return getMin(str, str2, map, evaluator);
        }
        StringBuilder sb = new StringBuilder("Unknown combiner: ");
        sb.append(this.getMax);
        throw new IllegalArgumentException(sb.toString());
    }

    private boolean getMin(String str, String str2, Map<String, Object> map, Evaluator evaluator) {
        UnmodifiableIterator<setTranslucentForImageView> it = this.getMin.iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= it.next().getMax(str, str2, map, evaluator);
        }
        return z;
    }

    public final int hashCode() {
        return (this.getMin.hashCode() * 31) + this.getMax.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if");
        UnmodifiableIterator<setTranslucentForImageView> it = this.getMin.iterator();
        boolean z = true;
        while (it.hasNext()) {
            setTranslucentForImageView next = it.next();
            if (!z) {
                sb.append(" ");
                sb.append(this.getMax);
            }
            sb.append(" ");
            sb.append(next);
            z = false;
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMIUIStatusBarDarkIcon)) {
            return false;
        }
        setMIUIStatusBarDarkIcon setmiuistatusbardarkicon = (setMIUIStatusBarDarkIcon) obj;
        return this.getMax.equals(setmiuistatusbardarkicon.getMax) && this.getMin.equals(setmiuistatusbardarkicon.getMin);
    }
}

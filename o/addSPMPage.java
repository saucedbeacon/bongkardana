package o;

import com.j256.ormlite.stmt.query.SimpleComparison;

public final class addSPMPage {
    public getLanguage getMax;
    public getLanguage length;

    public addSPMPage(getLanguage getlanguage, getLanguage getlanguage2) {
        if (getlanguage == null || getlanguage2 == null) {
            throw new NullPointerException("Nodes must be provided.");
        }
        this.getMax = getlanguage;
        this.length = getlanguage2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<NodeTuple keyNode=");
        sb.append(this.getMax.toString());
        sb.append("; valueNode=");
        sb.append(this.length.toString());
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }
}

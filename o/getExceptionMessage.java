package o;

import java.util.Iterator;
import org.mozilla.javascript.ScriptableObject;

public class getExceptionMessage implements getStackTraceMessage {
    protected getStackTraceMessage setMax;

    public void length(long j) {
    }

    public long setMax() {
        return 0;
    }

    public getExceptionMessage(int i) {
        if (i > 2000) {
            this.setMax = new getEditTextUtils();
        } else {
            this.setMax = new isSpecialManuFacturer();
        }
    }

    public int setMin() {
        return this.setMax.setMin();
    }

    public int getMax() {
        return this.setMax.setMin();
    }

    public boolean getMin() {
        return this.setMax.getMin();
    }

    public ScriptableObject.getMax setMin(Object obj, int i, ScriptableObject.SlotAccess slotAccess) {
        if (slotAccess != ScriptableObject.SlotAccess.QUERY) {
            length();
        }
        return this.setMax.setMin(obj, i, slotAccess);
    }

    public ScriptableObject.getMax getMax(Object obj, int i) {
        return this.setMax.getMax(obj, i);
    }

    public void getMin(ScriptableObject.getMax getmax) {
        length();
        this.setMax.getMin(getmax);
    }

    public void setMin(Object obj, int i) {
        this.setMax.setMin(obj, i);
    }

    public Iterator<ScriptableObject.getMax> iterator() {
        return this.setMax.iterator();
    }

    /* access modifiers changed from: protected */
    public void length() {
        getStackTraceMessage getstacktracemessage = this.setMax;
        if ((getstacktracemessage instanceof isSpecialManuFacturer) && getstacktracemessage.setMin() >= 2000) {
            getEditTextUtils getedittextutils = new getEditTextUtils();
            for (ScriptableObject.getMax min : this.setMax) {
                getedittextutils.getMin(min);
            }
            this.setMax = getedittextutils;
        }
    }
}

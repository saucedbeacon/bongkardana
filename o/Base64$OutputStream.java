package o;

public abstract class Base64$OutputStream {
    public Base64$OutputStream IsOverlapping = null;
    public Base64$OutputStream equals = null;
    private Base64$OutputStream setMin = null;
    public Base64$OutputStream toFloatRange = null;
    public Base64$OutputStream toIntRange = null;

    public abstract void setMax(stringAscii stringascii);

    /* access modifiers changed from: protected */
    public String setMin() {
        return "";
    }

    public Base64$OutputStream getMin() {
        return this.setMin;
    }

    /* access modifiers changed from: protected */
    public void getMin(Base64$OutputStream base64$OutputStream) {
        this.setMin = base64$OutputStream;
    }

    public final void getMax(Base64$OutputStream base64$OutputStream) {
        base64$OutputStream.toIntRange();
        base64$OutputStream.getMin(this);
        Base64$OutputStream base64$OutputStream2 = this.toFloatRange;
        if (base64$OutputStream2 != null) {
            base64$OutputStream2.IsOverlapping = base64$OutputStream;
            base64$OutputStream.equals = base64$OutputStream2;
            this.toFloatRange = base64$OutputStream;
            return;
        }
        this.toIntRange = base64$OutputStream;
        this.toFloatRange = base64$OutputStream;
    }

    public final void toIntRange() {
        Base64$OutputStream base64$OutputStream = this.equals;
        if (base64$OutputStream != null) {
            base64$OutputStream.IsOverlapping = this.IsOverlapping;
        } else {
            Base64$OutputStream base64$OutputStream2 = this.setMin;
            if (base64$OutputStream2 != null) {
                base64$OutputStream2.toIntRange = this.IsOverlapping;
            }
        }
        Base64$OutputStream base64$OutputStream3 = this.IsOverlapping;
        if (base64$OutputStream3 != null) {
            base64$OutputStream3.equals = this.equals;
        } else {
            Base64$OutputStream base64$OutputStream4 = this.setMin;
            if (base64$OutputStream4 != null) {
                base64$OutputStream4.toFloatRange = this.equals;
            }
        }
        this.setMin = null;
        this.IsOverlapping = null;
        this.equals = null;
    }

    public final void setMin(Base64$OutputStream base64$OutputStream) {
        base64$OutputStream.toIntRange();
        Base64$OutputStream base64$OutputStream2 = this.IsOverlapping;
        base64$OutputStream.IsOverlapping = base64$OutputStream2;
        if (base64$OutputStream2 != null) {
            base64$OutputStream2.equals = base64$OutputStream;
        }
        base64$OutputStream.equals = this;
        this.IsOverlapping = base64$OutputStream;
        Base64$OutputStream base64$OutputStream3 = this.setMin;
        base64$OutputStream.setMin = base64$OutputStream3;
        if (base64$OutputStream.IsOverlapping == null) {
            base64$OutputStream3.toFloatRange = base64$OutputStream;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(setMin());
        sb.append("}");
        return sb.toString();
    }
}

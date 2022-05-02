package o;

public final class isBindKeyboard extends AssertionError {
    private static final int MAX_CONTEXT_LENGTH = 20;
    private static final long serialVersionUID = 1;
    private String fActual;
    private String fExpected;

    public isBindKeyboard(String str, String str2, String str3) {
        super(str);
        this.fExpected = str2;
        this.fActual = str3;
    }

    public final String getMessage() {
        String str;
        String str2;
        setMax setmax = new setMax(this.fExpected, this.fActual);
        String message = super.getMessage();
        if (setmax.setMax == null || setmax.getMax == null || setmax.setMax.equals(setmax.getMax)) {
            return MoneyKeyListener.setMin(message, setmax.setMax, setmax.getMax);
        }
        setMax.getMin getmin = new setMax.getMin(setmax, (byte) 0);
        if (getmin.getMin.length() <= setMax.this.length) {
            str = getmin.getMin;
        } else {
            StringBuilder sb = new StringBuilder("...");
            sb.append(getmin.getMin.substring(getmin.getMin.length() - setMax.this.length));
            str = sb.toString();
        }
        if (getmin.length.length() <= setMax.this.length) {
            str2 = getmin.length;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getmin.length.substring(0, setMax.this.length));
            sb2.append("...");
            str2 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(getmin.getMin(setMax.this.setMax));
        sb3.append(str2);
        String obj = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(getmin.getMin(setMax.this.getMax));
        sb4.append(str2);
        return MoneyKeyListener.setMin(message, obj, sb4.toString());
    }

    public final String getActual() {
        return this.fActual;
    }

    public final String getExpected() {
        return this.fExpected;
    }

    static class setMax {
        final String getMax;
        final int length = 20;
        final String setMax;

        public setMax(String str, String str2) {
            this.setMax = str;
            this.getMax = str2;
        }

        class getMin {
            final String getMin;
            final String length;

            /* synthetic */ getMin(setMax setmax, byte b) {
                this();
            }

            private getMin() {
                String min = setMax.getMin(setMax.this);
                this.getMin = min;
                this.length = setMax.getMax(setMax.this, min);
            }

            /* access modifiers changed from: package-private */
            public final String getMin(String str) {
                StringBuilder sb = new StringBuilder("[");
                sb.append(str.substring(this.getMin.length(), str.length() - this.length.length()));
                sb.append("]");
                return sb.toString();
            }
        }

        static /* synthetic */ String getMin(setMax setmax) {
            int min = Math.min(setmax.setMax.length(), setmax.getMax.length());
            for (int i = 0; i < min; i++) {
                if (setmax.setMax.charAt(i) != setmax.getMax.charAt(i)) {
                    return setmax.setMax.substring(0, i);
                }
            }
            return setmax.setMax.substring(0, min);
        }

        static /* synthetic */ String getMax(setMax setmax, String str) {
            int min = Math.min(setmax.setMax.length() - str.length(), setmax.getMax.length() - str.length()) - 1;
            int i = 0;
            while (i <= min) {
                String str2 = setmax.setMax;
                char charAt = str2.charAt((str2.length() - 1) - i);
                String str3 = setmax.getMax;
                if (charAt != str3.charAt((str3.length() - 1) - i)) {
                    break;
                }
                i++;
            }
            String str4 = setmax.setMax;
            return str4.substring(str4.length() - i);
        }
    }
}

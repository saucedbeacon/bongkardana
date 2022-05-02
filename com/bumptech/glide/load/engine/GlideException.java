package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.setPivotY;

public final class GlideException extends Exception {
    private static final StackTraceElement[] EMPTY_ELEMENTS = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    @Nullable
    private Exception exception;
    private setPivotY key;

    public final Throwable fillInStackTrace() {
        return this;
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(EMPTY_ELEMENTS);
        this.causes = list;
    }

    /* access modifiers changed from: package-private */
    public final void setLoggingDetails(setPivotY setpivoty, DataSource dataSource2) {
        setLoggingDetails(setpivoty, dataSource2, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    public final void setLoggingDetails(setPivotY setpivoty, DataSource dataSource2, Class<?> cls) {
        this.key = setpivoty;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }

    public final void setOrigin(@Nullable Exception exc) {
        this.exception = exc;
    }

    @Nullable
    public final Exception getOrigin() {
        return this.exception;
    }

    public final List<Throwable> getCauses() {
        return this.causes;
    }

    public final List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        addRootCauses(this, arrayList);
        return arrayList;
    }

    public final void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        for (int i = 0; i < size; i++) {
            rootCauses.get(i);
        }
    }

    private void addRootCauses(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable addRootCauses : ((GlideException) th).getCauses()) {
                addRootCauses(addRootCauses, list);
            }
            return;
        }
        list.add(th);
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        printStackTrace((Appendable) printStream);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        printStackTrace((Appendable) printWriter);
    }

    private void printStackTrace(Appendable appendable) {
        appendExceptionMessage(this, appendable);
        appendCauses(getCauses(), new getMin(appendable));
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass != null) {
            StringBuilder sb2 = new StringBuilder(", ");
            sb2.append(this.dataClass);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.dataSource != null) {
            StringBuilder sb3 = new StringBuilder(", ");
            sb3.append(this.dataSource);
            str2 = sb3.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.key != null) {
            StringBuilder sb4 = new StringBuilder(", ");
            sb4.append(this.key);
            str3 = sb4.toString();
        }
        sb.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            sb.append(" causes:");
        }
        for (Throwable next : rootCauses) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    private static void appendExceptionMessage(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private static void appendCauses(List<Throwable> list, Appendable appendable) {
        try {
            appendCausesWrapped(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void appendCausesWrapped(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).printStackTrace(appendable);
            } else {
                appendExceptionMessage(th, appendable);
            }
            i = i2;
        }
    }

    static final class getMin implements Appendable {
        private final Appendable length;
        private boolean setMin = true;

        getMin(Appendable appendable) {
            this.length = appendable;
        }

        public final Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.setMin) {
                this.setMin = false;
                this.length.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.setMin = z;
            this.length.append(c);
            return this;
        }

        public final Appendable append(@Nullable CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            return append(charSequence, 0, charSequence.length());
        }

        public final Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.setMin) {
                this.setMin = false;
                this.length.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.setMin = z;
            this.length.append(charSequence, i, i2);
            return this;
        }
    }
}

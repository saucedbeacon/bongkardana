package o;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class getDefaultInstance {
    @NonNull
    public abstract Iterable<assignDescriptors> setMax(@NonNull String str);

    public static class setMax extends getDefaultInstance {
        @NonNull
        public final Iterable<assignDescriptors> setMax(@NonNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(522011021, oncanceled);
                onCancelLoad.getMin(522011021, oncanceled);
            }
            return new getMin(str);
        }

        static class getMin implements Iterable<assignDescriptors> {
            final String getMax;

            getMin(@NonNull String str) {
                this.getMax = str;
            }

            @NonNull
            public final Iterator<assignDescriptors> iterator() {
                return new C0096getMin(this, (byte) 0);
            }

            /* renamed from: o.getDefaultInstance$setMax$getMin$getMin  reason: collision with other inner class name */
            class C0096getMin implements Iterator<assignDescriptors> {
                private final int getMin;
                private final assignDescriptors length;
                private final StringBuilder setMax;
                private int setMin;

                private C0096getMin() {
                    this.length = new assignDescriptors();
                    this.setMax = new StringBuilder();
                    this.getMin = getMin.this.getMax.length();
                }

                /* synthetic */ C0096getMin(getMin getmin, byte b) {
                    this();
                }

                private boolean length() {
                    return setMin(this.length.getMax, this.length.length);
                }

                private static boolean setMin(@Nullable String str, @Nullable String str2) {
                    return !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2);
                }

                public final boolean hasNext() {
                    assignDescriptors assigndescriptors = this.length;
                    assigndescriptors.getMax = "";
                    assigndescriptors.length = "";
                    this.setMax.setLength(0);
                    int i = this.setMin;
                    String str = null;
                    String str2 = null;
                    boolean z = false;
                    while (true) {
                        if (i < this.getMin) {
                            char charAt = getMin.this.getMax.charAt(i);
                            if (str == null) {
                                if (':' == charAt) {
                                    if (this.setMax.length() > 0) {
                                        str = this.setMax.toString().trim();
                                    }
                                    this.setMax.setLength(0);
                                } else if (';' == charAt) {
                                    this.setMax.setLength(0);
                                } else if (Character.isWhitespace(charAt)) {
                                    if (this.setMax.length() > 0) {
                                        z = true;
                                    }
                                } else if (z) {
                                    this.setMax.setLength(0);
                                    this.setMax.append(charAt);
                                    z = false;
                                } else {
                                    this.setMax.append(charAt);
                                }
                            } else if (str2 != null) {
                                continue;
                            } else if (Character.isWhitespace(charAt)) {
                                if (this.setMax.length() > 0) {
                                    this.setMax.append(charAt);
                                }
                            } else if (';' == charAt) {
                                str2 = this.setMax.toString().trim();
                                this.setMax.setLength(0);
                                if (setMin(str, str2)) {
                                    this.setMin = i + 1;
                                    assignDescriptors assigndescriptors2 = this.length;
                                    assigndescriptors2.getMax = str;
                                    assigndescriptors2.length = str2;
                                    break;
                                }
                            } else {
                                this.setMax.append(charAt);
                            }
                            i++;
                        } else if (str != null && this.setMax.length() > 0) {
                            String trim = this.setMax.toString().trim();
                            assignDescriptors assigndescriptors3 = this.length;
                            assigndescriptors3.getMax = str;
                            assigndescriptors3.length = trim;
                            this.setMin = this.getMin;
                        }
                    }
                    return length();
                }

                public final /* synthetic */ Object next() {
                    if (length()) {
                        return this.length;
                    }
                    throw new NoSuchElementException();
                }
            }
        }
    }
}

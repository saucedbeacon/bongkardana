package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public final class AUScreenUtils {
    /* synthetic */ AUScreenUtils(setMax setmax, byte b) {
        this(setmax);
    }

    /* synthetic */ AUScreenUtils(setMin setmin, byte b) {
        this(setmin);
    }

    private AUScreenUtils(setMax setmax) {
        TextView max = setmax.getMax();
        final List<checkOppoConcave> list = setmax.setMin;
        final checkApFlag checkapflag = setmax.getMin;
        if (list != null && list.size() > 0) {
            max.addTextChangedListener(new TextWatcher() {
                public final void afterTextChanged(Editable editable) {
                }

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    ArrayList arrayList = new ArrayList();
                    String charSequence2 = charSequence.toString();
                    for (checkOppoConcave checkoppoconcave : r1) {
                        if (!checkoppoconcave.getMax(charSequence2)) {
                            arrayList.add(new setWhiteListAP(checkoppoconcave));
                        }
                    }
                    if (r2 == null) {
                        return;
                    }
                    if (arrayList.size() > 0) {
                        r2.getMin(charSequence2, arrayList);
                    } else {
                        r2.getMax(charSequence2);
                    }
                }
            });
        }
    }

    private AUScreenUtils(setMin setmin) {
        EditText editText = setmin.length;
        final List<checkOppoConcave> list = setmin.setMin;
        final checkApFlag checkapflag = setmin.getMin;
        if (list != null && list.size() > 0) {
            editText.addTextChangedListener(new TextWatcher() {
                public final void afterTextChanged(Editable editable) {
                }

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    ArrayList arrayList = new ArrayList();
                    String charSequence2 = charSequence.toString();
                    for (checkOppoConcave checkoppoconcave : list) {
                        if (!checkoppoconcave.getMax(charSequence2)) {
                            arrayList.add(new setWhiteListAP(checkoppoconcave));
                        }
                    }
                    if (checkapflag == null) {
                        return;
                    }
                    if (arrayList.size() > 0) {
                        checkapflag.getMin(charSequence2, arrayList);
                    } else {
                        checkapflag.getMax(charSequence2);
                    }
                }
            });
        }
        final EditText editText2 = setmin.length;
        final getIdStr getidstr = setmin.setMax;
        if (getidstr != null) {
            editText2.addTextChangedListener(new TextWatcher() {
                public final void afterTextChanged(Editable editable) {
                }

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    getidstr.getMin(editText2, i);
                }
            });
        }
    }

    public static class setMin extends setMax {
        EditText length;
        public getIdStr setMax;

        public /* synthetic */ setMin(EditText editText, byte b) {
            this(editText);
        }

        private setMin(EditText editText) {
            super(editText, (byte) 0);
            this.length = editText;
        }

        public final AUScreenUtils setMax() {
            return new AUScreenUtils(this, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ TextView getMax() {
            return this.length;
        }
    }

    public static class setMax {
        private TextView getMax;
        public checkApFlag getMin;
        public List<checkOppoConcave> setMin;

        /* synthetic */ setMax(TextView textView, byte b) {
            this(textView);
        }

        private setMax(TextView textView) {
            this.getMax = textView;
        }

        public TextView getMax() {
            return this.getMax;
        }

        public AUScreenUtils setMax() {
            return new AUScreenUtils(this, (byte) 0);
        }
    }
}

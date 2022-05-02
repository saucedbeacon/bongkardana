package o;

import android.os.Build;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class getChangingConfigurations {
    public final length getMin;

    public getChangingConfigurations(@NonNull TextView textView) {
        length length2;
        if (Build.VERSION.SDK_INT >= 19) {
            length2 = new setMax(textView);
        } else {
            length2 = new length();
        }
        this.getMin = length2;
    }

    public static class length {
        public void getMax() {
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod setMax(TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        public void setMax(boolean z) {
        }

        public InputFilter[] setMax(@NonNull InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        length() {
        }
    }

    @RequiresApi(19)
    static class setMax extends length {
        private final TextView getMax;
        private final verifyNotNull setMax;

        setMax(TextView textView) {
            this.getMax = textView;
            this.setMax = new verifyNotNull(textView);
        }

        /* access modifiers changed from: package-private */
        public void getMax() {
            TransformationMethod transformationMethod = this.getMax.getTransformationMethod();
            if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
                this.getMax.setTransformationMethod(setMax(transformationMethod));
            }
        }

        /* access modifiers changed from: package-private */
        public InputFilter[] setMax(@NonNull InputFilter[] inputFilterArr) {
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter instanceof verifyNotNull) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
            inputFilterArr2[r0] = this.setMax;
            return inputFilterArr2;
        }

        /* access modifiers changed from: package-private */
        public TransformationMethod setMax(TransformationMethod transformationMethod) {
            if (transformationMethod instanceof setDither) {
                return transformationMethod;
            }
            return new setDither(transformationMethod);
        }

        /* access modifiers changed from: package-private */
        public void setMax(boolean z) {
            if (z) {
                getMax();
            }
        }
    }
}

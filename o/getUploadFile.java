package o;

import androidx.annotation.Nullable;

public final class getUploadFile {
    public final getMax getMax;
    public final getMax getMin;

    public static class getMax {
        public final String getMin;
        public final float length;

        public getMax(float f, @Nullable String str) {
            this.length = f;
            this.getMin = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dimension{value=");
            sb.append(this.length);
            sb.append(", unit='");
            sb.append(this.getMin);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public getUploadFile(@Nullable getMax getmax, @Nullable getMax getmax2) {
        this.getMin = getmax;
        this.getMax = getmax2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageSize{width=");
        sb.append(this.getMin);
        sb.append(", height=");
        sb.append(this.getMax);
        sb.append('}');
        return sb.toString();
    }
}

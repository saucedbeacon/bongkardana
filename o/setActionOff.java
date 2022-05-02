package o;

import android.content.Context;
import android.graphics.Bitmap;
import com.alibaba.wireless.security.SecExceptionCode;
import java.io.File;

public final class setActionOff {
    public int getMax = 816;
    public int getMin = SecExceptionCode.SEC_ERROR_SIGNATURE_ILLEGEL_KEY;
    public String length;
    public Bitmap.CompressFormat setMax = Bitmap.CompressFormat.JPEG;
    public int setMin = 80;

    public setActionOff(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        sb.append(File.separator);
        sb.append("images");
        this.length = sb.toString();
    }
}

package o;

import com.twilio.verify.networking.HttpMethod;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
public final /* synthetic */ class shouldMeasureChild {
    public static final /* synthetic */ int[] length;

    static {
        int[] iArr = new int[HttpMethod.values().length];
        length = iArr;
        iArr[HttpMethod.Post.ordinal()] = 1;
        length[HttpMethod.Delete.ordinal()] = 2;
        length[HttpMethod.Get.ordinal()] = 3;
    }
}

package o;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;

public final class PageResult$ResultType implements ResultPointCallback {
    public ContiguousPagedList$FetchState setMin;

    public final void foundPossibleResultPoint(ResultPoint resultPoint) {
        ContiguousPagedList$FetchState contiguousPagedList$FetchState = this.setMin;
        if (contiguousPagedList$FetchState != null) {
            contiguousPagedList$FetchState.foundPossibleResultPoint(resultPoint);
        }
    }
}

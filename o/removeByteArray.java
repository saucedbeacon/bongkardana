package o;

import io.split.android.client.network.BaseHttpResponse;

public abstract class removeByteArray implements BaseHttpResponse {
    protected static final int HTTP_BAD_REQUEST = 400;
    protected static final int HTTP_INTERNAL_SERVER_ERROR = 500;
    protected static final int HTTP_MULTIPLE_CHOICES = 300;
    private static final int HTTP_OK = 200;
    protected static final int HTTP_UNAUTHORIZED = 401;
    private int mHttpStatus;

    protected removeByteArray(int i) {
        this.mHttpStatus = i;
    }

    public boolean isSuccess() {
        int i = this.mHttpStatus;
        return i >= 200 && i < 300;
    }

    public boolean isCredentialsError() {
        return this.mHttpStatus == 401;
    }

    public boolean isClientRelatedError() {
        int i = this.mHttpStatus;
        return i >= 400 && i < 500;
    }

    public boolean isBadRequestError() {
        return this.mHttpStatus == 400;
    }

    public int getHttpStatus() {
        return this.mHttpStatus;
    }
}

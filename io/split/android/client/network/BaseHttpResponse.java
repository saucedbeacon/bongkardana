package io.split.android.client.network;

public interface BaseHttpResponse {
    int getHttpStatus();

    boolean isBadRequestError();

    boolean isClientRelatedError();

    boolean isCredentialsError();

    boolean isSuccess();
}

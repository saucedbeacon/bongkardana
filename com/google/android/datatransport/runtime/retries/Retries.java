package com.google.android.datatransport.runtime.retries;

public final class Retries {
    private Retries() {
    }

    public static <TInput, TResult, TException extends Throwable> TResult retry(int i, TInput tinput, Function<TInput, TResult, TException> function, RetryStrategy<TInput, TResult> retryStrategy) throws Throwable {
        TResult apply;
        if (i <= 0) {
            return function.apply(tinput);
        }
        do {
            apply = function.apply(tinput);
            tinput = retryStrategy.shouldRetry(tinput, apply);
            if (tinput == null || i - 1 <= 0) {
                return apply;
            }
            apply = function.apply(tinput);
            tinput = retryStrategy.shouldRetry(tinput, apply);
            break;
        } while (i - 1 <= 0);
        return apply;
    }
}

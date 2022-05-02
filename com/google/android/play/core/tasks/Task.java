package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

public abstract class Task<ResultT> {
    @NonNull
    public abstract Task<ResultT> addOnCompleteListener(@NonNull OnCompleteListener<ResultT> onCompleteListener);

    @NonNull
    public abstract Task<ResultT> addOnCompleteListener(@NonNull Executor executor, @NonNull OnCompleteListener<ResultT> onCompleteListener);

    @NonNull
    public abstract Task<ResultT> addOnFailureListener(@NonNull OnFailureListener onFailureListener);

    @NonNull
    public abstract Task<ResultT> addOnFailureListener(@NonNull Executor executor, @NonNull OnFailureListener onFailureListener);

    @NonNull
    public abstract Task<ResultT> addOnSuccessListener(OnSuccessListener<? super ResultT> onSuccessListener);

    @NonNull
    public abstract Task<ResultT> addOnSuccessListener(@NonNull Executor executor, @NonNull OnSuccessListener<? super ResultT> onSuccessListener);

    @Nullable
    public abstract Exception getException();

    @NonNull
    public abstract ResultT getResult();

    public abstract <X extends Throwable> ResultT getResult(Class<X> cls) throws Throwable;

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();
}

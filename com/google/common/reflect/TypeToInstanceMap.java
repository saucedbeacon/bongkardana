package com.google.common.reflect;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@Beta
@DoNotMock("Use ImmutableTypeToInstanceMap or MutableTypeToInstanceMap")
public interface TypeToInstanceMap<B> extends Map<TypeToken<? extends B>, B> {
    @NullableDecl
    <T extends B> T getInstance(TypeToken<T> typeToken);

    @NullableDecl
    <T extends B> T getInstance(Class<T> cls);

    @NullableDecl
    @CanIgnoreReturnValue
    <T extends B> T putInstance(TypeToken<T> typeToken, @NullableDecl T t);

    @NullableDecl
    @CanIgnoreReturnValue
    <T extends B> T putInstance(Class<T> cls, @NullableDecl T t);
}

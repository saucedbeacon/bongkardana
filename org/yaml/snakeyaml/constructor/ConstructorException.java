package org.yaml.snakeyaml.constructor;

import o.InitParams;
import org.yaml.snakeyaml.error.MarkedYAMLException;

public class ConstructorException extends MarkedYAMLException {
    private static final long serialVersionUID = -8816339931365239910L;

    public ConstructorException(String str, InitParams.AnonymousClass1 r2, String str2, InitParams.AnonymousClass1 r4, Throwable th) {
        super(str, r2, str2, r4, th);
    }

    public ConstructorException(String str, InitParams.AnonymousClass1 r8, String str2, InitParams.AnonymousClass1 r10) {
        this(str, r8, str2, r10, (Throwable) null);
    }
}

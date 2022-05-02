package org.yaml.snakeyaml.scanner;

import o.InitParams;
import org.yaml.snakeyaml.error.MarkedYAMLException;

public class ScannerException extends MarkedYAMLException {
    private static final long serialVersionUID = 4782293188600445954L;

    public ScannerException(String str, InitParams.AnonymousClass1 r2, String str2, InitParams.AnonymousClass1 r4, String str3) {
        super(str, r2, str2, r4, str3);
    }

    public ScannerException(String str, InitParams.AnonymousClass1 r8, String str2, InitParams.AnonymousClass1 r10) {
        this(str, r8, str2, r10, (String) null);
    }
}

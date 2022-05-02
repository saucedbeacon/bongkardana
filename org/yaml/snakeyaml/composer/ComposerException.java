package org.yaml.snakeyaml.composer;

import o.InitParams;
import org.yaml.snakeyaml.error.MarkedYAMLException;

public class ComposerException extends MarkedYAMLException {
    private static final long serialVersionUID = 2146314636913113935L;

    public ComposerException(String str, InitParams.AnonymousClass1 r2, String str2, InitParams.AnonymousClass1 r4) {
        super(str, r2, str2, r4);
    }
}

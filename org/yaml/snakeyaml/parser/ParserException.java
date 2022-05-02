package org.yaml.snakeyaml.parser;

import o.InitParams;
import org.yaml.snakeyaml.error.MarkedYAMLException;

public class ParserException extends MarkedYAMLException {
    private static final long serialVersionUID = -2349253802798398038L;

    public ParserException(String str, InitParams.AnonymousClass1 r9, String str2, InitParams.AnonymousClass1 r11) {
        super(str, r9, str2, r11, (String) null, (Throwable) null);
    }
}

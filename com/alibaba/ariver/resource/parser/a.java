package com.alibaba.ariver.resource.parser;

public class a extends RuntimeException {
    public static final int CERT_PATH_NOT_EXIST = 4;
    public static final int EMPTY_RES = 8;
    public static final int INVALID_PARAM = 1;
    public static final int OFFLINE_PATH_NOT_EXIST = 2;
    public static final int TAR_PATH_NOT_EXIST = 3;
    public static final int TAR_SIGNATURE_IS_EMPTY = 5;
    public static final int UN_KNOW_EXCEPTION = 7;
    public static final int VERIFY_FAIL = 6;
    private int code;
    private ParseContext parseContext;

    public a(int i, String str) {
        super(str);
        this.code = i;
    }

    public ParseContext getParseContext() {
        return this.parseContext;
    }

    public void setParseContext(ParseContext parseContext2) {
        this.parseContext = parseContext2;
    }

    public int getCode() {
        return this.code;
    }
}

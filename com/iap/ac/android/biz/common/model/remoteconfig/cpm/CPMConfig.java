package com.iap.ac.android.biz.common.model.remoteconfig.cpm;

public class CPMConfig {
    public int clientIndexValidHours;
    public int clientOtpSeedValidHours;
    public String clientPublicKey;
    public String codeIssuer;
    public String codeType;
    public int decodeWindowLeft = -60;
    public int decodeWindowRight = 60;
    public int encodeFrequency = 30;
    public int encodeNum = 5;
    public boolean onlineCode = true;
    public int otpGenerateInterval;
}

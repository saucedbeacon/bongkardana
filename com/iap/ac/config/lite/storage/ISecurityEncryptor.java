package com.iap.ac.config.lite.storage;

public interface ISecurityEncryptor {

    public static class Mock implements ISecurityEncryptor {
        public String decrypt(String str) {
            return str;
        }

        public String encrypt(String str) {
            return str;
        }
    }

    String decrypt(String str);

    String encrypt(String str);
}

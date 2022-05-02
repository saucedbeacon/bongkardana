package com.iap.ac.config.lite.dns.lookup;

public class c {
    public static boolean a(int i) {
        if (i >= 0 && i <= 15) {
            return (i <= 0 || i > 4) && i < 12;
        }
        StringBuilder sb = new StringBuilder("DNS Header Flag");
        sb.append(i);
        sb.append("is out of range");
        throw new IllegalArgumentException(sb.toString());
    }

    static void a(long j) throws Exception {
        if (j < 0 || j > 2147483647L) {
            throw new DNSException("Invalid DNS TTL: ".concat(String.valueOf(j)));
        }
    }
}

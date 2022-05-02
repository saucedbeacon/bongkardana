package com.iap.ac.android.gol.google.supergw;

public class SuperGwRequest<T> {
    public Request<T> request;
    public String signature;

    public static class Request<U> {
        public U body;
        public SuperGwHead head;
    }
}

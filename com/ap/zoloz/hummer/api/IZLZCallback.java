package com.ap.zoloz.hummer.api;

public interface IZLZCallback {
    void onCompleted(ZLZResponse zLZResponse);

    void onInterrupted(ZLZResponse zLZResponse);
}

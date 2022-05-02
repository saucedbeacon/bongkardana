package com.alipay.mobile.security.bio.service;

import com.alipay.biometrics.common.proguard.INotProguard;

public abstract class BioUploadServiceCore<Request> extends BioService implements INotProguard {
    public abstract BioUploadResult upload(Request request, boolean z);
}

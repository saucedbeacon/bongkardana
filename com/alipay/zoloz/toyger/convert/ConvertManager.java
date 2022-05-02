package com.alipay.zoloz.toyger.convert;

import com.alipay.zoloz.toyger.blob.model.Content;
import java.lang.reflect.Constructor;

public class ConvertManager implements IContentConvert {
    private IContentConvert mConvert;

    public ConvertManager(int i) {
        try {
            Constructor<?> declaredConstructor = Class.forName(i == 2 ? "com.alipay.zoloz.toyger.convert.PBContentConvert" : "com.alipay.zoloz.toyger.convert.JsonContentConverter").getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            this.mConvert = (IContentConvert) declaredConstructor.newInstance(new Object[0]);
        } catch (Exception unused) {
        }
    }

    public byte[] convert(Content content) {
        return this.mConvert.convert(content);
    }
}

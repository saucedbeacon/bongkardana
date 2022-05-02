package com.alipay.androidinter.app.safepaybase.alikeyboard;

import com.alipay.androidinter.app.safepaybase.log.LogTracer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class KeyboardManager {
    private static Map<Integer, AlipayKeyboard> keyboardMap = new ConcurrentHashMap();

    public static void bindKeyboard(int i, AlipayKeyboard alipayKeyboard) {
        if (alipayKeyboard != null) {
            LogTracer.getInstance().traceInfo("KeyboardManager::bindKeyboard", "KeyboardManager-bindKeyboard:".concat(String.valueOf(i)));
            keyboardMap.put(Integer.valueOf(i), alipayKeyboard);
        }
    }

    public static void unBindKeyboard(int i) {
        LogTracer.getInstance().traceInfo("KeyboardManager::unBindKeyboard", "KeyboardManager-unBindKeyboard:".concat(String.valueOf(i)));
        if (keyboardMap.containsKey(Integer.valueOf(i))) {
            keyboardMap.remove(Integer.valueOf(i));
        }
    }

    public static AlipayKeyboard getKeyboard(int i) {
        LogTracer.getInstance().traceInfo("KeyboardManager::getKeyboard", "KeyboardManager-getKeyboard:".concat(String.valueOf(i)));
        if (keyboardMap.containsKey(Integer.valueOf(i))) {
            return keyboardMap.get(Integer.valueOf(i));
        }
        return null;
    }

    public static boolean isBindKeyboard(int i) {
        return getKeyboard(i) != null;
    }
}

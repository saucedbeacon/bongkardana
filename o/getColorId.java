package o;

import o.LogItem;
import o.SecureQwertyKeyboard;

final class getColorId extends setNeedComfirm implements LogItem.TracerInfo {
    static final long serialVersionUID = 541475680333911468L;
    getStyleableId idata;
    LogPrinterProxy securityController;
    Object securityDomain;

    private getColorId(getStyleableId getstyleableid, Object obj) {
        Object obj2;
        this.idata = getstyleableid;
        SecureQwertyKeyboard.AnonymousClass1 floatRange = SecureQwertyKeyboard.AnonymousClass1.toFloatRange();
        LogPrinterProxy min = LogPrinterProxy.getMin();
        min = min == null ? floatRange.hashCode : min;
        if (min != null) {
            obj2 = min.setMin(obj);
        } else if (obj == null) {
            obj2 = null;
        } else {
            throw new IllegalArgumentException();
        }
        this.securityController = min;
        this.securityDomain = obj2;
    }

    private getColorId(getColorId getcolorid, int i) {
        this.idata = getcolorid.idata.itsNestedFunctions[i];
        this.securityController = getcolorid.securityController;
        this.securityDomain = getcolorid.securityDomain;
    }

    static getColorId createScript(getStyleableId getstyleableid, Object obj) {
        return new getColorId(getstyleableid, obj);
    }

    static getColorId createFunction(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, getStyleableId getstyleableid, Object obj) {
        getColorId getcolorid = new getColorId(getstyleableid, obj);
        getcolorid.initScriptFunction(r1, logUtils);
        return getcolorid;
    }

    static getColorId createFunction(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, getColorId getcolorid, int i) {
        getColorId getcolorid2 = new getColorId(getcolorid, i);
        getcolorid2.initScriptFunction(r1, logUtils);
        return getcolorid2;
    }

    public final String getFunctionName() {
        return this.idata.itsName == null ? "" : this.idata.itsName;
    }

    public final Object call(SecureQwertyKeyboard.AnonymousClass1 r8, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (LogItem.getMax(r8)) {
            return getDimenId.getMin(this, r8, logUtils, logUtils2, objArr);
        }
        return LogItem.getMax((announceSwitchKeyboard) this, r8, logUtils, logUtils2, objArr, this.idata.isStrict);
    }

    public final Object exec(SecureQwertyKeyboard.AnonymousClass1 r8, LogUtils logUtils) {
        if (!isScript()) {
            throw new IllegalStateException();
        } else if (LogItem.getMax(r8)) {
            return getDimenId.getMin(this, r8, logUtils, logUtils, LogItem.create);
        } else {
            return LogItem.getMax((announceSwitchKeyboard) this, r8, logUtils, logUtils, LogItem.create, this.idata.isStrict);
        }
    }

    public final boolean isScript() {
        return this.idata.itsFunctionType == 0;
    }

    public final String getEncodedSource() {
        return getDimenId.getMax(this.idata);
    }

    public final paintSquare getDebuggableView() {
        return this.idata;
    }

    public final Object resumeGenerator(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, int i, Object obj, Object obj2) {
        return getDimenId.setMin(r1, i, obj, obj2);
    }

    /* access modifiers changed from: protected */
    public final int getLanguageVersion() {
        return this.idata.languageVersion;
    }

    /* access modifiers changed from: protected */
    public final int getParamCount() {
        return this.idata.argCount;
    }

    /* access modifiers changed from: protected */
    public final int getParamAndVarCount() {
        return this.idata.argNames.length;
    }

    /* access modifiers changed from: protected */
    public final String getParamOrVarName(int i) {
        return this.idata.argNames[i];
    }

    /* access modifiers changed from: protected */
    public final boolean getParamOrVarConst(int i) {
        return this.idata.argIsConst[i];
    }
}

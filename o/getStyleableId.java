package o;

import java.io.Serializable;

final class getStyleableId implements Serializable, paintSquare {
    static final int INITIAL_MAX_ICODE_LENGTH = 1024;
    static final int INITIAL_NUMBERTABLE_SIZE = 64;
    static final int INITIAL_STRINGTABLE_SIZE = 64;
    static final long serialVersionUID = 5067677351589230234L;
    int argCount;
    boolean[] argIsConst;
    String[] argNames;
    String encodedSource;
    int encodedSourceEnd;
    int encodedSourceStart;
    boolean evalScriptFlag;
    int firstLinePC = -1;
    boolean isStrict;
    double[] itsDoubleTable;
    int[] itsExceptionTable;
    int itsFunctionType;
    byte[] itsICode;
    int itsMaxCalleeArgs;
    int itsMaxFrameArray;
    int itsMaxLocals;
    int itsMaxStack;
    int itsMaxVars;
    String itsName;
    boolean itsNeedsActivation;
    getStyleableId[] itsNestedFunctions;
    Object[] itsRegExpLiterals;
    String itsSourceFile;
    String[] itsStringTable;
    int languageVersion;
    Object[] literalIds;
    switchOff longJumps;
    getStyleableId parentData;
    boolean topLevel;

    getStyleableId(int i, String str, String str2, boolean z) {
        this.languageVersion = i;
        this.itsSourceFile = str;
        this.encodedSource = str2;
        this.isStrict = z;
        init();
    }

    getStyleableId(getStyleableId getstyleableid) {
        this.parentData = getstyleableid;
        this.languageVersion = getstyleableid.languageVersion;
        this.itsSourceFile = getstyleableid.itsSourceFile;
        this.encodedSource = getstyleableid.encodedSource;
        this.isStrict = getstyleableid.isStrict;
        init();
    }

    private void init() {
        this.itsICode = new byte[1024];
        this.itsStringTable = new String[64];
    }

    public final boolean isTopLevel() {
        return this.topLevel;
    }

    public final boolean isFunction() {
        return this.itsFunctionType != 0;
    }

    public final String getFunctionName() {
        return this.itsName;
    }

    public final int getParamCount() {
        return this.argCount;
    }

    public final int getParamAndVarCount() {
        return this.argNames.length;
    }

    public final String getParamOrVarName(int i) {
        return this.argNames[i];
    }

    public final boolean getParamOrVarConst(int i) {
        return this.argIsConst[i];
    }

    public final String getSourceName() {
        return this.itsSourceFile;
    }

    public final boolean isGeneratedScript() {
        return LogItem.IsOverlapping(this.itsSourceFile);
    }

    public final int[] getLineNumbers() {
        return getDimenId.setMin(this);
    }

    public final int getFunctionCount() {
        getStyleableId[] getstyleableidArr = this.itsNestedFunctions;
        if (getstyleableidArr == null) {
            return 0;
        }
        return getstyleableidArr.length;
    }

    public final paintSquare getFunction(int i) {
        return this.itsNestedFunctions[i];
    }

    public final paintSquare getParent() {
        return this.parentData;
    }
}

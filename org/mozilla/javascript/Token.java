package org.mozilla.javascript;

import com.alibaba.ariver.kernel.RVParams;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.multigateway.sdk.decision.condition.Condition;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.j256.ormlite.stmt.query.ManyClause;
import id.dana.nearbyme.NearbyMePromoType;
import id.dana.richview.CurrencyTextView;
import id.dana.savings.activity.SavingsActivity;
import id.dana.sendmoney.summary.SummaryActivity;

public final class Token {

    public enum CommentType {
        LINE,
        BLOCK_COMMENT,
        JSDOC,
        HTML
    }

    public static boolean getMin(int i) {
        return i >= -1 && i <= 166;
    }

    public static String setMax(int i) {
        if (i == 4) {
            return "return";
        }
        if (i == 50) {
            return "throw";
        }
        if (i == 73) {
            return "yield";
        }
        if (i == 82) {
            return RVParams.DEFAULT_LONG_UP_STRATEGY;
        }
        if (i == 110) {
            return "function";
        }
        if (i == 161) {
            return "debugger";
        }
        if (i == 52) {
            return CurrencyTextView.DEFAULT_LANGUAGE_CODE;
        }
        if (i == 53) {
            return "instanceof";
        }
        if (i == 154) {
            return "let";
        }
        if (i == 155) {
            return "const";
        }
        switch (i) {
            case 30:
                return AppSettingsData.STATUS_NEW;
            case 31:
                return "delete";
            case 32:
                return "typeof";
            default:
                switch (i) {
                    case 42:
                        return "null";
                    case 43:
                        return "this";
                    case 44:
                        return "false";
                    case 45:
                        return SummaryActivity.CHECKED;
                    default:
                        switch (i) {
                            case 113:
                                return "if";
                            case 114:
                                return "else";
                            case 115:
                                return "switch";
                            case 116:
                                return "case";
                            case 117:
                                return "default";
                            case 118:
                                return "while";
                            case 119:
                                return "do";
                            case 120:
                                return "for";
                            case 121:
                                return "break";
                            case 122:
                                return "continue";
                            case 123:
                                return "var";
                            case 124:
                                return "with";
                            case 125:
                                return "catch";
                            case 126:
                                return "finally";
                            case 127:
                                return "void";
                            default:
                                return null;
                        }
                }
        }
    }

    public static String setMin(int i) {
        switch (i) {
            case -1:
                return "ERROR";
            case 0:
                return "EOF";
            case 1:
                return "EOL";
            case 2:
                return "ENTERWITH";
            case 3:
                return "LEAVEWITH";
            case 4:
                return "RETURN";
            case 5:
                return "GOTO";
            case 6:
                return "IFEQ";
            case 7:
                return "IFNE";
            case 8:
                return "SETNAME";
            case 9:
                return "BITOR";
            case 10:
                return "BITXOR";
            case 11:
                return "BITAND";
            case 12:
                return "EQ";
            case 13:
                return "NE";
            case 14:
                return Condition.MATCH_TYPE_LESS_THAN;
            case 15:
                return "LE";
            case 16:
                return Condition.MATCH_TYPE_GREATER_THAN;
            case 17:
                return "GE";
            case 18:
                return "LSH";
            case 19:
                return "RSH";
            case 20:
                return "URSH";
            case 21:
                return "ADD";
            case 22:
                return "SUB";
            case 23:
                return "MUL";
            case 24:
                return "DIV";
            case 25:
                return "MOD";
            case 26:
                return "NOT";
            case 27:
                return "BITNOT";
            case 28:
                return "POS";
            case 29:
                return "NEG";
            case 30:
                return "NEW";
            case 31:
                return "DELPROP";
            case 32:
                return "TYPEOF";
            case 33:
                return "GETPROP";
            case 34:
                return "GETPROPNOWARN";
            case 35:
                return "SETPROP";
            case 36:
                return "GETELEM";
            case 37:
                return "SETELEM";
            case 38:
                return "CALL";
            case 39:
                return "NAME";
            case 40:
                return SecurityConstants.KEY_DISPLAY_TYPE_NUMBER;
            case 41:
                return "STRING";
            case 42:
                return "NULL";
            case 43:
                return "THIS";
            case 44:
                return "FALSE";
            case 45:
                return "TRUE";
            case 46:
                return "SHEQ";
            case 47:
                return "SHNE";
            case 48:
                return Condition.MATCH_TYPE_REGEXP;
            case 49:
                return "BINDNAME";
            case 50:
                return "THROW";
            case 51:
                return "RETHROW";
            case 52:
                return "IN";
            case 53:
                return "INSTANCEOF";
            case 54:
                return "LOCAL_LOAD";
            case 55:
                return "GETVAR";
            case 56:
                return "SETVAR";
            case 57:
                return "CATCH_SCOPE";
            case 58:
                return "ENUM_INIT_KEYS";
            case 59:
                return "ENUM_INIT_VALUES";
            case 60:
                return "ENUM_INIT_ARRAY";
            case 61:
                return "ENUM_INIT_VALUES_IN_ORDER";
            case 62:
                return "ENUM_NEXT";
            case 63:
                return "ENUM_ID";
            case 64:
                return "THISFN";
            case 65:
                return "RETURN_RESULT";
            case 66:
                return "ARRAYLIT";
            case 67:
                return "OBJECTLIT";
            case 68:
                return "GET_REF";
            case 69:
                return "SET_REF";
            case 70:
                return "DEL_REF";
            case 71:
                return "REF_CALL";
            case 72:
                return "REF_SPECIAL";
            case 73:
                return "YIELD";
            case 75:
                return "DEFAULTNAMESPACE";
            case 76:
                return "ESCXMLATTR";
            case 77:
                return "ESCXMLTEXT";
            case 78:
                return "REF_MEMBER";
            case 79:
                return "REF_NS_MEMBER";
            case 80:
                return "REF_NAME";
            case 81:
                return "REF_NS_NAME";
            case 82:
                return "TRY";
            case 83:
                return "SEMI";
            case 84:
                return ExpandedProductParsedResult.POUND;
            case 85:
                return "RB";
            case 86:
                return NearbyMePromoType.LimitRangeType.LC;
            case 87:
                return "RC";
            case 88:
                return "LP";
            case 89:
                return "RP";
            case 90:
                return "COMMA";
            case 91:
                return "ASSIGN";
            case 92:
                return "ASSIGN_BITOR";
            case 93:
                return "ASSIGN_BITXOR";
            case 94:
                return "ASSIGN_BITAND";
            case 95:
                return "ASSIGN_LSH";
            case 96:
                return "ASSIGN_RSH";
            case 97:
                return "ASSIGN_URSH";
            case 98:
                return "ASSIGN_ADD";
            case 99:
                return "ASSIGN_SUB";
            case 100:
                return "ASSIGN_MUL";
            case 101:
                return "ASSIGN_DIV";
            case 102:
                return "ASSIGN_MOD";
            case 103:
                return "HOOK";
            case 104:
                return "COLON";
            case 105:
                return ManyClause.OR_OPERATION;
            case 106:
                return ManyClause.AND_OPERATION;
            case 107:
                return "INC";
            case 108:
                return "DEC";
            case 109:
                return "DOT";
            case 110:
                return "FUNCTION";
            case 111:
                return "EXPORT";
            case 112:
                return "IMPORT";
            case 113:
                return "IF";
            case 114:
                return "ELSE";
            case 115:
                return "SWITCH";
            case 116:
                return "CASE";
            case 117:
                return "DEFAULT";
            case 118:
                return "WHILE";
            case 119:
                return "DO";
            case 120:
                return "FOR";
            case 121:
                return "BREAK";
            case 122:
                return "CONTINUE";
            case 123:
                return "VAR";
            case 124:
                return "WITH";
            case 125:
                return "CATCH";
            case 126:
                return "FINALLY";
            case 127:
                return "VOID";
            case 128:
                return "RESERVED";
            case TsExtractor.TS_STREAM_TYPE_AC3:
                return "EMPTY";
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
                return "BLOCK";
            case 131:
                return "LABEL";
            case 132:
                return "TARGET";
            case 133:
                return "LOOP";
            case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO:
                return "EXPR_VOID";
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
                return "EXPR_RESULT";
            case 136:
                return "JSR";
            case 137:
                return "SCRIPT";
            case TsExtractor.TS_STREAM_TYPE_DTS:
                return "TYPEOFNAME";
            case 139:
                return "USE_STACK";
            case SavingsActivity.RV_BENEFIT_WIDTH:
                return "SETPROP_OP";
            case 141:
                return "SETELEM_OP";
            case 142:
                return "LOCAL_BLOCK";
            case 143:
                return "SET_REF_OP";
            case 144:
                return "DOTDOT";
            case 145:
                return "COLONCOLON";
            case 146:
                return "XML";
            case 147:
                return "DOTQUERY";
            case 148:
                return "XMLATTR";
            case 149:
                return "XMLEND";
            case 150:
                return "TO_OBJECT";
            case 151:
                return "TO_DOUBLE";
            case 152:
                return "GET";
            case 153:
                return "SET";
            case 154:
                return "LET";
            case 155:
                return "CONST";
            case 156:
                return "SETCONST";
            case 158:
                return "ARRAYCOMP";
            case 159:
                return "LETEXPR";
            case BlobStatic.MONITOR_IMAGE_WIDTH:
                return "WITHEXPR";
            case 161:
                return "DEBUGGER";
            case 162:
                return "COMMENT";
            case 163:
                return "GENEXPR";
            case 164:
                return "METHOD";
            case 165:
                return "ARROW";
            default:
                throw new IllegalStateException(String.valueOf(i));
        }
    }
}

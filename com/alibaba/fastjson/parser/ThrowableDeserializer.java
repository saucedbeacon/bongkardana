package com.alibaba.fastjson.parser;

public class ThrowableDeserializer extends JavaBeanDeserializer {
    public ThrowableDeserializer(ParserConfig parserConfig, Class<?> cls) {
        super(parserConfig, cls, cls);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.StackTraceElement[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.alibaba.fastjson.parser.deserializer.ObjectDeserializer] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (java.lang.Throwable.class.isAssignableFrom(r2) != false) goto L_0x0037;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0184  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T deserialze(com.alibaba.fastjson.parser.DefaultJSONParser r18, java.lang.reflect.Type r19, java.lang.Object r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            com.alibaba.fastjson.parser.JSONLexer r3 = r0.lexer
            int r4 = r3.token
            r5 = 8
            r6 = 0
            if (r4 != r5) goto L_0x0013
            r3.nextToken()
            return r6
        L_0x0013:
            int r4 = r0.resolveStatus
            java.lang.String r7 = "syntax error"
            r8 = 2
            r9 = 0
            if (r4 != r8) goto L_0x001f
            r0.resolveStatus = r9
            goto L_0x0025
        L_0x001f:
            int r4 = r3.token
            r10 = 12
            if (r4 != r10) goto L_0x01b6
        L_0x0025:
            if (r2 == 0) goto L_0x0036
            boolean r4 = r2 instanceof java.lang.Class
            if (r4 == 0) goto L_0x0036
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            boolean r4 = r4.isAssignableFrom(r2)
            if (r4 == 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            r4 = r6
            r10 = r4
            r11 = r10
            r12 = r11
        L_0x003b:
            com.alibaba.fastjson.parser.SymbolTable r13 = r0.symbolTable
            java.lang.String r13 = r3.scanSymbol(r13)
            r14 = 13
            r15 = 16
            if (r13 != 0) goto L_0x0057
            int r8 = r3.token
            if (r8 != r14) goto L_0x0050
            r3.nextToken(r15)
            goto L_0x00da
        L_0x0050:
            int r8 = r3.token
            if (r8 == r15) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r8 = 2
            goto L_0x003b
        L_0x0057:
            r8 = 58
            r3.nextTokenWithChar(r8)
            java.lang.String r8 = "@type"
            boolean r8 = r8.equals(r13)
            r14 = 4
            if (r8 == 0) goto L_0x007f
            int r2 = r3.token
            if (r2 != r14) goto L_0x0079
            java.lang.String r2 = r3.stringVal()
            com.alibaba.fastjson.parser.ParserConfig r8 = r0.config
            java.lang.ClassLoader r8 = r8.defaultClassLoader
            java.lang.Class r2 = com.alibaba.fastjson.util.TypeUtils.loadClass(r2, r8, r9)
            r3.nextToken(r15)
            goto L_0x00d1
        L_0x0079:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r7)
            throw r0
        L_0x007f:
            java.lang.String r8 = "message"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x00a0
            int r8 = r3.token
            if (r8 != r5) goto L_0x008d
            r10 = r6
            goto L_0x0096
        L_0x008d:
            int r8 = r3.token
            if (r8 != r14) goto L_0x009a
            java.lang.String r8 = r3.stringVal()
            r10 = r8
        L_0x0096:
            r3.nextToken()
            goto L_0x00d1
        L_0x009a:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r7)
            throw r0
        L_0x00a0:
            java.lang.String r8 = "cause"
            boolean r14 = r8.equals(r13)
            if (r14 == 0) goto L_0x00b0
            java.lang.Object r8 = r1.deserialze(r0, r6, r8)
            r11 = r8
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            goto L_0x00d1
        L_0x00b0:
            java.lang.String r8 = "stackTrace"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x00c3
            java.lang.Class<java.lang.StackTraceElement[]> r8 = java.lang.StackTraceElement[].class
            java.lang.Object r8 = r0.parseObject(r8)
            r12 = r8
            java.lang.StackTraceElement[] r12 = (java.lang.StackTraceElement[]) r12
            goto L_0x00d1
        L_0x00c3:
            if (r4 != 0) goto L_0x00ca
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x00ca:
            java.lang.Object r8 = r18.parse()
            r4.put(r13, r8)
        L_0x00d1:
            int r8 = r3.token
            r13 = 13
            if (r8 != r13) goto L_0x0055
            r3.nextToken(r15)
        L_0x00da:
            if (r2 != 0) goto L_0x00e3
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>(r10, r11)
            goto L_0x0164
        L_0x00e3:
            java.lang.reflect.Constructor[] r3 = r2.getConstructors()     // Catch:{ Exception -> 0x01ad }
            int r5 = r3.length     // Catch:{ Exception -> 0x01ad }
            r8 = r6
            r13 = r8
            r14 = r13
            r7 = 0
        L_0x00ec:
            r15 = 1
            if (r7 >= r5) goto L_0x0132
            r16 = r3[r7]     // Catch:{ Exception -> 0x01ad }
            java.lang.Class[] r6 = r16.getParameterTypes()     // Catch:{ Exception -> 0x01ad }
            int r6 = r6.length     // Catch:{ Exception -> 0x01ad }
            if (r6 != 0) goto L_0x00fb
            r14 = r16
            goto L_0x012e
        L_0x00fb:
            java.lang.Class[] r6 = r16.getParameterTypes()     // Catch:{ Exception -> 0x01ad }
            int r6 = r6.length     // Catch:{ Exception -> 0x01ad }
            if (r6 != r15) goto L_0x010f
            java.lang.Class[] r6 = r16.getParameterTypes()     // Catch:{ Exception -> 0x01ad }
            r6 = r6[r9]     // Catch:{ Exception -> 0x01ad }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            if (r6 != r15) goto L_0x010f
            r13 = r16
            goto L_0x012e
        L_0x010f:
            java.lang.Class[] r6 = r16.getParameterTypes()     // Catch:{ Exception -> 0x01ad }
            int r6 = r6.length     // Catch:{ Exception -> 0x01ad }
            r15 = 2
            if (r6 != r15) goto L_0x012e
            java.lang.Class[] r6 = r16.getParameterTypes()     // Catch:{ Exception -> 0x01ad }
            r6 = r6[r9]     // Catch:{ Exception -> 0x01ad }
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            if (r6 != r15) goto L_0x012e
            java.lang.Class[] r6 = r16.getParameterTypes()     // Catch:{ Exception -> 0x01ad }
            r15 = 1
            r6 = r6[r15]     // Catch:{ Exception -> 0x01ad }
            java.lang.Class<java.lang.Throwable> r15 = java.lang.Throwable.class
            if (r6 != r15) goto L_0x012e
            r8 = r16
        L_0x012e:
            int r7 = r7 + 1
            r6 = 0
            goto L_0x00ec
        L_0x0132:
            if (r8 == 0) goto L_0x0143
            r6 = 2
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01ad }
            r3[r9] = r10     // Catch:{ Exception -> 0x01ad }
            r5 = 1
            r3[r5] = r11     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r3 = r8.newInstance(r3)     // Catch:{ Exception -> 0x01ad }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ Exception -> 0x01ad }
            goto L_0x015d
        L_0x0143:
            if (r13 == 0) goto L_0x0151
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01ad }
            r3[r9] = r10     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r3 = r13.newInstance(r3)     // Catch:{ Exception -> 0x01ad }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ Exception -> 0x01ad }
            goto L_0x015d
        L_0x0151:
            if (r14 == 0) goto L_0x015c
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x01ad }
            java.lang.Object r3 = r14.newInstance(r3)     // Catch:{ Exception -> 0x01ad }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ Exception -> 0x01ad }
            goto L_0x015d
        L_0x015c:
            r3 = 0
        L_0x015d:
            if (r3 != 0) goto L_0x0164
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ Exception -> 0x01ad }
            r3.<init>(r10, r11)     // Catch:{ Exception -> 0x01ad }
        L_0x0164:
            if (r12 == 0) goto L_0x0169
            r3.setStackTrace(r12)
        L_0x0169:
            if (r4 == 0) goto L_0x01ac
            if (r2 == 0) goto L_0x0181
            java.lang.Class r5 = r1.clazz
            if (r2 != r5) goto L_0x0173
            r6 = r1
            goto L_0x0182
        L_0x0173:
            com.alibaba.fastjson.parser.ParserConfig r0 = r0.config
            com.alibaba.fastjson.parser.deserializer.ObjectDeserializer r0 = r0.getDeserializer(r2)
            boolean r2 = r0 instanceof com.alibaba.fastjson.parser.JavaBeanDeserializer
            if (r2 == 0) goto L_0x0181
            r6 = r0
            com.alibaba.fastjson.parser.JavaBeanDeserializer r6 = (com.alibaba.fastjson.parser.JavaBeanDeserializer) r6
            goto L_0x0182
        L_0x0181:
            r6 = 0
        L_0x0182:
            if (r6 == 0) goto L_0x01ac
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x018c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01ac
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r2 = r2.getValue()
            com.alibaba.fastjson.parser.deserializer.FieldDeserializer r4 = r6.getFieldDeserializer(r4)
            if (r4 == 0) goto L_0x018c
            r4.setValue((java.lang.Object) r3, (java.lang.Object) r2)
            goto L_0x018c
        L_0x01ac:
            return r3
        L_0x01ad:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            java.lang.String r3 = "create instance error"
            r2.<init>(r3, r0)
            throw r2
        L_0x01b6:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            r0.<init>(r7)
            goto L_0x01bd
        L_0x01bc:
            throw r0
        L_0x01bd:
            goto L_0x01bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.ThrowableDeserializer.deserialze(com.alibaba.fastjson.parser.DefaultJSONParser, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}

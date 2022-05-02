package com.alipay.iap.android.matamata.plugins.file.descriptor;

import com.facebook.flipper.core.FlipperObject;
import java.io.File;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class FolderDescriptor implements NodeDescriptor<File> {
    public String getId(File file) {
        return file.getAbsolutePath();
    }

    public String getName(File file) {
        return file.getName();
    }

    public Object[] getChildren(File file) {
        return file.listFiles();
    }

    public List<Named<FlipperObject>> getData(File file) throws Exception {
        ArrayList arrayList = new ArrayList();
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        FlipperObject.setMax min = setmax.getMax("Path", file.getAbsolutePath()).getMax("Last Modified", DateFormat.getDateTimeInstance().format(Long.valueOf(file.lastModified()))).getMin("Executable", Boolean.valueOf(file.canExecute())).getMin("Readable", Boolean.valueOf(file.canRead())).getMin("Hidden", Boolean.valueOf(file.isHidden()));
        StringBuilder sb = new StringBuilder();
        sb.append(file.length());
        sb.append(" bytes");
        min.getMax("Length", sb.toString()).getMin("Writable", Boolean.valueOf(file.canWrite()));
        arrayList.add(new Named("File Info", new FlipperObject(setmax.getMax)));
        return arrayList;
    }
}

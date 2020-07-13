package com.meraj;

import eu.medsea.mimeutil.MimeUtil;

import java.util.Collection;

public class MimeTypeDeterminer {

    static {
        MimeUtil.registerMimeDetector("eu.medsea.mimeutil.detector.MagicMimeMimeDetector");
    }

    public static String getMimeType(byte[] content) {
        final Collection mimeTypes = MimeUtil.getMimeTypes(content);
        return MimeUtil.getFirstMimeType(mimeTypes.toString()).toString();
    }
}

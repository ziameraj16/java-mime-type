package com.meraj;

import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;

public class MimeTypeDeterminerTest extends TestCase {

    @Test
    public void testGetMimeType_jpeg() throws IOException {
        final byte[] bytes = IOUtils.toByteArray(getClass().getClassLoader().getResourceAsStream("jpeg.jpeg"));
        final String mimeType = MimeTypeDeterminer.getMimeType(bytes);
        assertEquals("image/jpeg", mimeType);
    }

    @Test
    public void testGetMimeType_png() throws IOException {
        final byte[] bytes = IOUtils.toByteArray(getClass().getClassLoader().getResourceAsStream("png.png"));
        final String mimeType = MimeTypeDeterminer.getMimeType(bytes);
        assertEquals("image/png", mimeType);
    }
}
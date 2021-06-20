package com.witheo.marker;

import org.junit.Assert;
import org.junit.Test;

public class markersTest {
    @Test
    public void testFialtalMarker() {
        Assert.assertEquals(Markers.FATAL.getName(), "FATAL" );
    }
}

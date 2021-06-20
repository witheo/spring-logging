package com.witheo.marker;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import java.util.Iterator;

public class Markers {
    public static final Marker FATAL = MarkerFactory.getMarker("FATAL");
    public static final Marker ON_CALL = MarkerFactory.getMarker("ON-CALL");
    public static final Marker BOSS_DEVS = MarkerFactory.getMarker("BOSS-DEVS");
}

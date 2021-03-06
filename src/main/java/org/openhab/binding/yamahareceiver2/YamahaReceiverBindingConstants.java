/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.yamahareceiver2;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link YamahaReceiver2Binding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author David Graeff - Initial contribution
 */
public class YamahaReceiverBindingConstants {

    public static final String BINDING_ID = "yamahareceiver2";

    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_YAMAHAAV = new ThingTypeUID(BINDING_ID, "yamahaAV");

    // List of all Channel ids
    public final static String CHANNEL_POWER = "power";
    public final static String CHANNEL_INPUT = "input";
    public final static String CHANNEL_SURROUND = "surroundProgram";
    public final static String CHANNEL_VOLUME = "volume";
    public final static String CHANNEL_MUTE = "mute";
    public final static String CHANNEL_NETRADIO_TUNE = "netradiotune";

    public static final Object UPNP_TYPE = "MediaRenderer";

    public static final CharSequence UPNP_MANUFACTURER = "YAMAHA";

    public static final Object CONFIG_REFRESH = "REFRESH";
    public static final Object CONFIG_HOST_NAME = "HOST";
    public static final Object CONFIG_SCALE = "SCALE";
    public static final Object CONFIG_ZONE = "ZONE";

}

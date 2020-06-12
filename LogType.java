/*
 * Mugai Discord Bot (http://mugai.xyz)
 * Copyright (c) 2020. Gusuu <@Gusuu1>
 * All rights reserved
 */

package xyz.mugai.discord.logging;

import xyz.mugai.object.enums.Color;

public enum LogType {

    CHANGE_PREFIX(Color.INFO.get()),
    CHANGE_LOGCHANNEL(Color.INFO.get()),
    EDIT_ROLES(Color.INFO.get()),
    PURGE_MESSAGES(Color.DANGER.get()),
    SET_SLOWMODE(Color.DANGER.get()),
    SET_NSFW(Color.DANGER.get()),

    NONE(Color.DANGER.get());
    private java.awt.Color color;

    LogType(java.awt.Color c) { this.color = c; }

    public java.awt.Color get() { return color; }
}

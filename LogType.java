/*
 * Mugai Discord Bot (http://mugai.xyz)
 * Copyright (c) 2020. Gusuu <@Gusuu1>
 * All rights reserved
 */

package xyz.mugai.object.enums;

public enum LogType {

    /**
     * Represents the action when a user is kicked from a guild.
     */
    KICK(1, true, Color.DANGER),

    /**
     * Represents the action when a user gets warned.
     */
    WARN(2, true, Color.DANGER),

    /**
     * Represents the action when a user gets muted.
     */
    MUTE(3, true, Color.ERROR),

    /**
     * Represents the action when a user gets banned from a guild.
     */
    BAN(4, true, Color.ERROR),

    /**
     * Represents the action when a user gets unmuted.
     */
    UNMUTE(5, true, false, Color.INFO),

    /**
     * Represents the action when a user gets unbanned from a guild.
     */
    UNBAN(6, true, false, Color.INFO);

    final int id;
    final boolean notifyable;
    final boolean punishment;
    final Color color;

    LogType(int id, boolean notifyable, Color color){
        this(id, notifyable, true, color);
    }

    LogType(int id, boolean notifyable, boolean punishment, Color color) {
        this.id = id;
        this.notifyable = notifyable;
        this.punishment = punishment;
        this.color = color;
    }

    /**
     * Returns a log type found by id,
     * if it does not exists null will be returned.
     * 
     * @param id The ID that the log type has
     * @return Possibly-null, the log type with the given ID (if found)
     */
    public static LogType fromId(int id){
        for(LogType type : values()){
            if(type.getId() == id){
                return type;
            }
        }
        return null;
    }

    /**
     * Returns the ID of the current log type.
     * 
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Returns whether or not the log type is notifyable.
     * 
     * @return boolean
     */
    public boolean isNotifyable() {
        return notifyable;
    }

    /**
     * Returns whether or not the log type is a punishment.
     * 
     * @return boolean
     */
    public boolean isPunishment() {
        return punishment;
    }

    /**
     * Returns the Color of the current log type. (For rich-embed display)
     * 
     * @return Color
     */
    public Color getColor() {
        return color;
    }
}

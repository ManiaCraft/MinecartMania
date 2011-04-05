package com.afforess.minecartmaniacore.event;

import com.afforess.minecartmaniacore.MinecartManiaMinecart;
import com.afforess.minecartmaniacore.utils.DirectionUtils.CompassDirection;

public class MinecartDirectionChangeEvent  extends org.bukkit.event.Event{
	private static final long serialVersionUID = -3750213642051820486L;
	private MinecartManiaMinecart minecart;
	private CompassDirection previous;
	private CompassDirection current;
	public MinecartDirectionChangeEvent(MinecartManiaMinecart minecart, CompassDirection previous, CompassDirection current) {
		super("MinecartDirectionChangeEvent");
		this.minecart = minecart;
		this.previous = previous;
		this.current = current;
	}
	
	public MinecartManiaMinecart getMinecart() {
		return minecart;
	}
	
	public CompassDirection getPreviousDirection() {
		return previous;
	}
	
	public CompassDirection getCurrentDirection() {
		return current;
	}
}

package com.afforess.minecartmaniacore.matching;

import org.bukkit.inventory.ItemStack;

import com.afforess.minecartmaniacore.utils.StringUtils;

public class MatchInRange implements MatchToken {
    private MatchField field;
    private int start;
    private int end;
    
    public MatchInRange(MatchField field, int start, int end) {
        this.field = field;
        this.start = start;
        this.end = end;
    }
    
    public boolean match(ItemStack item) {
        int value = field.getFieldValue(item);
        return (value >= start && value <= end);
    }
    
    public boolean isComplex() {
        return true;
    }
    
    public String toString(int i) {
        return StringUtils.indent(String.format("%s IN RANGE %d - %d", field.name(), start, end), i);
    }
    
}
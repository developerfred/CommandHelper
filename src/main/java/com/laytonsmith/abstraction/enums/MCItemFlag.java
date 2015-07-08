package com.laytonsmith.abstraction.enums;

import com.laytonsmith.annotations.MEnum;

/**
 * A MCItemFlag can hide some Attributes from MCItemStacks, through MCItemMeta.
 */
@MEnum("ItemFlag")
public enum MCItemFlag {
	/**
	 * Setting to show/hide enchants
	 */
	HIDE_ENCHANTS,
	/**
	 * Setting to show/hide Attributes like Damage
	 */
	HIDE_ATTRIBUTES,
	/**
	 * Setting to show/hide the unbreakable State
	 */
	HIDE_UNBREAKABLE,
	/**
	 * Setting to show/hide what the ItemStack can break/destroy
	 */
	HIDE_DESTROYS,
	/**
	 * Setting to show/hide where this ItemStack can be build/placed on
	 */
	HIDE_PLACED_ON,
	/**
	 * Setting to show/hide potion effects on this ItemStack
	 */
	HIDE_POTION_EFFECTS;
}
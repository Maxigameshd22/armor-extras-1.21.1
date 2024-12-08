package net.maxigames.swordextras.tools.material;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class SwordMaterial implements ToolMaterial {
    public static final SwordMaterial INSTANCE = new SwordMaterial();

    @Override
    public int getDurability() {
        return 1500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.0F;
    }

    @Override
    public float getAttackDamage() {
        return 8.0F;
    }


    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_WOODEN_TOOL;
    }

    @Override
    public int getEnchantability() {
        return 55;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

}

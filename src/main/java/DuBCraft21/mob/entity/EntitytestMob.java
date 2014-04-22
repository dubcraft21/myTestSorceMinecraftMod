package DuBCraft21.mob.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntitytestMob extends EntityAnimal {

	public EntitytestMob(World par1World) {
		super(par1World);
		this.setSize(1.0F, 2.0F);
	}

	@Override
	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}

	protected String getLivingSound() {
		return "mob.creeper.death";
	}
	
	protected String getDeathSound() {
		return "mob.pig.death";
	}
	
	protected String getHurtSound() {
		return "mob.cow.death";
	}
	
	protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound("mob.chicken.step", 0.15F, 1.0F);
    }
	
	public void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(2.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
	}
}

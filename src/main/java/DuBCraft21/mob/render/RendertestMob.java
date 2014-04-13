package DuBCraft21.mob.render;

import DuBCraft21.mob.testMob;
import DuBCraft21.mob.entity.EntitytestMob;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RendertestMob extends RenderLiving {
public static final ResourceLocation testMobTexture = new ResourceLocation("TutorialMod:textures/mobs/testMob.png");
protected testMob model;
	public RendertestMob(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((testMob)mainModel);
	}

	public void renderTestMob(EntitytestMob entity, double par2, double par4, double par6, float par8, float par9) {
		super.doRender(entity, par2, par4, par6, par8, par9);
	}
	
	public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9) {
		renderTestMob((EntitytestMob)par1EntityLiving, par2, par4, par6, par8, par9);
	}
	
	public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9) {
		renderTestMob((EntitytestMob)par1Entity, par2, par4, par6, par8, par9);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return testMobTexture;
	}

}

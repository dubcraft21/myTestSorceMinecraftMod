package DuBCraft21.common;

import cpw.mods.fml.client.registry.RenderingRegistry;
import DuBCraft21.mob.testMob;
import DuBCraft21.mob.entity.EntitytestMob;
import DuBCraft21.mob.render.RendertestMob;

public class ClientProxy extends CommonProxy {
	
	public void RenderInformation() {
		RenderingRegistry.registerEntityRenderingHandler(EntitytestMob.class, new RendertestMob(new testMob(), 0.3F));
	}
}

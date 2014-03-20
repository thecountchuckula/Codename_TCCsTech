package tcc.tccTech;

import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class GhastKillHandler {

	@ForgeSubscribe
	public void onGhastKill(LivingDropsEvent event) {
		// algorithm by Pahimar
		event.drops.clear();
		if (event.source.getDamageType().equals("player")) {
			EntityPlayer p = (EntityPlayer) event.source.getEntity();

			if (event.entityLiving instanceof EntityGhast) {
				if (event.lootingLevel == 0) {
					int gold = event.entityLiving.worldObj.rand.nextInt(9);
					int gunpowder = event.entityLiving.worldObj.rand.nextInt(3);

					if (gold <= 1) {
						event.entityLiving.dropItem(Item.ingotGold.itemID, 1);
					}
					if (gunpowder <= 1) {
						event.entityLiving.dropItem(Item.gunpowder.itemID, 1);
					}
				}
				if (event.lootingLevel == 1) {
					int gold = event.entityLiving.worldObj.rand.nextInt(7);
					int gunpowder = event.entityLiving.worldObj.rand.nextInt(3);

					if (gold <= 2) {
						event.entityLiving.dropItem(Item.ingotGold.itemID, 1);
					}
					if (gunpowder <= 1) {
						event.entityLiving.dropItem(Item.gunpowder.itemID, 1);
					}
				}
				if (event.lootingLevel == 1) {
					int gold = event.entityLiving.worldObj.rand.nextInt(5);
					int gunpowder = event.entityLiving.worldObj.rand.nextInt(3);

					if (gold <= 2) {
						event.entityLiving.dropItem(Item.ingotGold.itemID, 1);
					}
					if (gunpowder <= 1) {
						event.entityLiving.dropItem(Item.gunpowder.itemID, 1);
					}
				}
				if (event.lootingLevel >= 3) {
					int gold = event.entityLiving.worldObj.rand.nextInt(3);
					int gunpowder = event.entityLiving.worldObj.rand.nextInt(3);

					if (gold <= 2) {
						event.entityLiving.dropItem(Item.ingotGold.itemID, 1);
					}
					if (gunpowder <= 1) {
						event.entityLiving.dropItem(Item.gunpowder.itemID, 1);
					}
				}
			}
		}

		if (event.source.getSourceOfDamage() instanceof EntityArrow) {
			if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null) {
				if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer) {

					EntityPlayer p = (EntityPlayer) event.source.getEntity();

					if (event.entityLiving instanceof EntityGhast) {
						if (event.lootingLevel == 0) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(9);
							int gunpowder = event.entityLiving.worldObj.rand
									.nextInt(3);

							if (gold <= 1) {
								event.entityLiving.dropItem(
										Item.ingotGold.itemID, 1);
							}
							if (gunpowder <= 1) {
								event.entityLiving.dropItem(
										Item.gunpowder.itemID, 1);
							}
						}
						if (event.lootingLevel == 1) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(7);
							int gunpowder = event.entityLiving.worldObj.rand
									.nextInt(3);

							if (gold <= 2) {
								event.entityLiving.dropItem(
										Item.ingotGold.itemID, 1);
							}
							if (gunpowder <= 1) {
								event.entityLiving.dropItem(
										Item.gunpowder.itemID, 1);
							}
						}
						if (event.lootingLevel == 1) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(5);
							int gunpowder = event.entityLiving.worldObj.rand
									.nextInt(3);

							if (gold <= 2) {
								event.entityLiving.dropItem(
										Item.ingotGold.itemID, 1);
							}
							if (gunpowder <= 1) {
								event.entityLiving.dropItem(
										Item.gunpowder.itemID, 1);
							}
						}
						if (event.lootingLevel >= 3) {
							int gold = event.entityLiving.worldObj.rand
									.nextInt(3);
							int gunpowder = event.entityLiving.worldObj.rand
									.nextInt(3);

							if (gold <= 2) {
								event.entityLiving.dropItem(
										Item.ingotGold.itemID, 1);
							}
							if (gunpowder <= 1) {
								event.entityLiving.dropItem(
										Item.gunpowder.itemID, 1);
							}
						}
					}
				}
			}
		}
	}
}
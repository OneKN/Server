package org.cloudburstmc.server.item.food;

import org.cloudburstmc.server.item.behavior.Item;
import org.cloudburstmc.server.player.Player;
import org.cloudburstmc.server.potion.Effect;

import static org.cloudburstmc.server.item.behavior.ItemIds.GLASS_BOTTLE;

public class FoodHoney extends Food {
    public FoodHoney(int restoreFood, float restoreSaturation) {
        this.setRestoreFood(restoreFood);
        this.setRestoreSaturation(restoreSaturation);
    }

    @Override
    protected boolean onEatenBy(Player player) {
        super.onEatenBy(player);
        player.getInventory().addItem(Item.get(GLASS_BOTTLE));
        player.removeEffect(Effect.POISON);
        return true;
    }
}

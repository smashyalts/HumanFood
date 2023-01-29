package guitesting.guitesting.Events;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.Material.PLAYER_HEAD;


public class onRightClick implements @NotNull Listener {
    @EventHandler
    public void onRightClick (PlayerInteractEntityEvent event) {
        if (event.getRightClicked().hasPermission("can.use"))
            if (event.getPlayer().getInventory().getItemInMainHand().toString().equals("ItemStack{SHEARS x 1}") && (event.getHand() == EquipmentSlot.HAND)){
                event.getPlayer().getInventory().addItem(new ItemStack(PLAYER_HEAD));
    }
    }
}

package guitesting.guitesting.Events;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.sound.Sound;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

import static org.bukkit.Material.PLAYER_HEAD;

public class onEat implements @NotNull Listener {
    @EventHandler
    public void onEat(PlayerInteractEvent event) {
        if (event.getAction().isRightClick() && Objects.requireNonNull(event.getItem()).getType().equals(PLAYER_HEAD)) {
            event.getPlayer().playSound(Sound.sound(Key.key("minecraft:entity.player.burp"), Sound.Source.PLAYER,1f,0.1f));
            event.getPlayer().sendHealthUpdate(20,20,20);
            if (event.getPlayer().getInventory().getItemInMainHand().equals("PLAYER_HEAD"))
                event.getPlayer().getInventory().getItemInMainHand().subtract(1);
            event.getPlayer().sendMessage(ChatColor.RED + "You enjoyed the meal, and it gave you full hunger and health");
        }
    }
}

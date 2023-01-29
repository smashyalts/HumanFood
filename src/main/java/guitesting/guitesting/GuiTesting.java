package guitesting.guitesting;

import guitesting.guitesting.Events.onEat;
import guitesting.guitesting.Events.onRightClick;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class GuiTesting extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new onRightClick(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new onEat(), this);
        this.getLogger().info(Bukkit.getName() + "Plugin Enabling");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().severe(Bukkit.getName() + "Plugin Disabling");
    }
}

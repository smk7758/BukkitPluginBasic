package com.github.smk7758.BukkitPluginBasic;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public static final String plugin_name = "BukkitPluginBasic";
	public static boolean debug_mode = false;

	@Override
	public void onEnable() {
		if (!Main.plugin_name.equals(getDescription().getName())) getPluginLoader().disablePlugin(this);
		// getServer().getPluginManager().registerEvents(command_listner, this);
		getCommand(plugin_name).setExecutor(new CommandExecuter(this));
	}

	@Override
	public void onDisable() {
	}
}

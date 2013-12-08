package com.vivi7865.GlobalPerms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	String url = "";
	String user = "";
	String password = "";
	Connection connexion = null;
	Statement statement;


	public void onDisable() {

			

	}

	@Override
	public void onEnable() {

		try {
		    Class.forName("com.mysql.jdbc.Driver");
		} catch ( ClassNotFoundException e ) {
		    e.printStackTrace();
		}
		
		try {
		    connexion = DriverManager.getConnection(url, user, password);
		    statement = connexion.createStatement();
		    
		} catch (SQLException e) {
		    e.printStackTrace();
		}

		Bukkit.getPluginManager().registerEvents(this, this);
	}

	public void onPJ(PlayerJoinEvent event) {

		

	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

			

		return true;
		
	}

}

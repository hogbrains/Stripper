package me.abaris.stripper;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Strip implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(!(commandSender instanceof Player)) {
            commandSender.sendMessage("You must be a player to run this command");
            return true;
        }
        Player p = (Player) commandSender;
        HashMap<Material, Material> mats = new HashMap<>();
        mats.put(Material.OAK_LOG, Material.STRIPPED_OAK_LOG);
        mats.put(Material.OAK_WOOD, Material.STRIPPED_OAK_WOOD);
        mats.put(Material.BIRCH_LOG, Material.STRIPPED_BIRCH_LOG);
        mats.put(Material.BIRCH_WOOD, Material.STRIPPED_BIRCH_WOOD);
        mats.put(Material.SPRUCE_LOG, Material.STRIPPED_SPRUCE_LOG);
        mats.put(Material.SPRUCE_WOOD, Material.STRIPPED_SPRUCE_WOOD);
        mats.put(Material.JUNGLE_LOG, Material.STRIPPED_JUNGLE_LOG);
        mats.put(Material.JUNGLE_WOOD, Material.STRIPPED_JUNGLE_WOOD);
        mats.put(Material.ACACIA_LOG, Material.STRIPPED_ACACIA_LOG);
        mats.put(Material.ACACIA_WOOD, Material.STRIPPED_ACACIA_WOOD);
        mats.put(Material.DARK_OAK_LOG, Material.STRIPPED_DARK_OAK_LOG);
        mats.put(Material.DARK_OAK_WOOD, Material.STRIPPED_DARK_OAK_WOOD);
        mats.put(Material.MANGROVE_LOG, Material.STRIPPED_MANGROVE_LOG);
        mats.put(Material.MANGROVE_WOOD, Material.STRIPPED_MANGROVE_WOOD);
        mats.put(Material.CRIMSON_STEM, Material.STRIPPED_CRIMSON_STEM);
        mats.put(Material.CRIMSON_HYPHAE, Material.STRIPPED_CRIMSON_HYPHAE);
        mats.put(Material.WARPED_STEM, Material.STRIPPED_WARPED_STEM);
        mats.put(Material.WARPED_HYPHAE, Material.STRIPPED_WARPED_HYPHAE);

        boolean stripped = false;

        for(Map.Entry<Material, Material> mat : mats.entrySet()) {
            if(p.getInventory().getItemInMainHand().getType() == mat.getKey()) {
                p.getInventory().getItemInMainHand().setType(mat.getValue());
                stripped = true;
            }
        }

        if(!stripped) p.sendMessage("You're not holding a strippable item!");

        return true;
    }
}

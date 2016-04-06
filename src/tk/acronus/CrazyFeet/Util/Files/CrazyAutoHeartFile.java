package tk.acronus.CrazyFeet.Util.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.bukkit.entity.Player;

public class CrazyAutoHeartFile {
	
	private final File auCrazyHeartPlayers;
	public static ArrayList<String> HPPPlayers;
	
	public CrazyAutoHeartFile(File file){
		
		auCrazyHeartPlayers = file;
		HPPPlayers = new ArrayList<String>();
		
		if(auCrazyHeartPlayers.exists() == false){
			try {
				auCrazyHeartPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoHeartPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(HPPPlayers.contains(player.getName()) == false){
			HPPPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(HPPPlayers.contains(player.getName()) == true){
			HPPPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoHeartPlayers() {
		return HPPPlayers;
	}
	
	public void loadAutoHeartPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyHeartPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(HPPPlayers.contains(line)){
					HPPPlayers.add(line);
				} else {
					HPPPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoHeart players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoHeartPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyHeartPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : HPPPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoHeart players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return HPPPlayers.contains(player);
	}
}

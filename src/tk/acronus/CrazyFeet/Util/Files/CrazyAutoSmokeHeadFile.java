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

public class CrazyAutoSmokeHeadFile {
	
	private final File auCrazySmokeHeadPlayers;
	public static ArrayList<String> cSHPlayers;
	
	public CrazyAutoSmokeHeadFile(File file){
		
		auCrazySmokeHeadPlayers = file;
		cSHPlayers = new ArrayList<String>();
		
		if(auCrazySmokeHeadPlayers.exists() == false){
			try {
				auCrazySmokeHeadPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoSmokeHeadPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cSHPlayers.contains(player.getName()) == false){
			cSHPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cSHPlayers.contains(player.getName()) == true){
			cSHPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoSmokePlayers() {
		return cSHPlayers;
	}
	
	public void loadAutoSmokeHeadPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazySmokeHeadPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cSHPlayers.contains(line)){
					cSHPlayers.add(line);
				} else {
					cSHPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoSmokeHead players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoSmokeHeadPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazySmokeHeadPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cSHPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoSmokeHead players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cSHPlayers.contains(player);
	}
}
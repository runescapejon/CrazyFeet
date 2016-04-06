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

public class CrazyAutoSmokeFile {
	private final File auCrazySmokePlayers;
	public static ArrayList<String> cSPlayers;
	
	public CrazyAutoSmokeFile(File file){
		auCrazySmokePlayers = file;
		cSPlayers = new ArrayList<String>();
		
		if(auCrazySmokePlayers.exists() == false){
			try {
				auCrazySmokePlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoSmokePlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cSPlayers.contains(player.getName()) == false){
			cSPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cSPlayers.contains(player.getName()) == true){
			cSPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoSmokePlayers() {
		return cSPlayers;
	}
	
	public void loadAutoSmokePlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazySmokePlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cSPlayers.contains(line)){
					cSPlayers.add(line);
				} else {
					cSPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoSmoke players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoSmokePlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazySmokePlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cSPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoSmoke players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cSPlayers.contains(player);
	}
}

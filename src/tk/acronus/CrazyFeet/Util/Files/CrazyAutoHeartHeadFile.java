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

public class CrazyAutoHeartHeadFile {
	
	private final File auCrazyHeartHeadPlayers;
	public static ArrayList<String> cHHPlayers;
	
	public CrazyAutoHeartHeadFile(File file){
		
		auCrazyHeartHeadPlayers = file;
		cHHPlayers = new ArrayList<String>();
		
		if(auCrazyHeartHeadPlayers.exists() == false){
			try {
				auCrazyHeartHeadPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoHeartHeadPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cHHPlayers.contains(player.getName()) == false){
			cHHPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cHHPlayers.contains(player.getName()) == true){
			cHHPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoHeartPlayers() {
		return cHHPlayers;
	}
	
	public void loadAutoHeartHeadPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyHeartHeadPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cHHPlayers.contains(line)){
					cHHPlayers.add(line);
				} else {
					cHHPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoHeartHead players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoHeartHeadPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyHeartHeadPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cHHPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoHeartHead players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cHHPlayers.contains(player);
	}
}
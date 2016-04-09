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

public class CrazyAutoMagicHeadFile {
	
	private final File auCrazyMagicHeadPlayers;
	public static ArrayList<String> cMHPlayers;
	
	public CrazyAutoMagicHeadFile(File file){
		
		auCrazyMagicHeadPlayers = file;
		cMHPlayers = new ArrayList<String>();
		
		if(auCrazyMagicHeadPlayers.exists() == false){
			try {
				auCrazyMagicHeadPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoMagicHeadPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cMHPlayers.contains(player.getName()) == false){
			cMHPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cMHPlayers.contains(player.getName()) == true){
			cMHPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoMagicPlayers() {
		return cMHPlayers;
	}
	
	public void loadAutoMagicHeadPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyMagicHeadPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cMHPlayers.contains(line)){
					cMHPlayers.add(line);
				} else {
					cMHPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoMagicHead players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoMagicHeadPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyMagicHeadPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cMHPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoMagicHead players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cMHPlayers.contains(player);
	}
}
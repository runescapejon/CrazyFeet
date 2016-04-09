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

public class CrazyAutoWitchHeadFile {
	
	private final File auCrazyWitchHeadPlayers;
	public static ArrayList<String> cWHPlayers;
	
	public CrazyAutoWitchHeadFile(File file){
		
		auCrazyWitchHeadPlayers = file;
		cWHPlayers = new ArrayList<String>();
		
		if(auCrazyWitchHeadPlayers.exists() == false){
			try {
				auCrazyWitchHeadPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoWitchHeadPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cWHPlayers.contains(player.getName()) == false){
			cWHPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cWHPlayers.contains(player.getName()) == true){
			cWHPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoWitchPlayers() {
		return cWHPlayers;
	}
	
	public void loadAutoWitchHeadPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyWitchHeadPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cWHPlayers.contains(line)){
					cWHPlayers.add(line);
				} else {
					cWHPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoWitchHead players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoWitchHeadPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyWitchHeadPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cWHPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoWitchHead players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cWHPlayers.contains(player);
	}
}
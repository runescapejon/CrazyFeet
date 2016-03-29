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

public class CrazyAutonoteFile {
	
	private final File auCrazynotePlayers;
	public static ArrayList<String> cNPlayers;
	
	public CrazyAutonoteFile(File file){
		auCrazynotePlayers = file;
		cNPlayers = new ArrayList<String>();
		
		if(auCrazynotePlayers.exists() == false){
			try {
				auCrazynotePlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutonotePlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cNPlayers.contains(player.getName()) == false){
			cNPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cNPlayers.contains(player.getName()) == true){
			cNPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutonotePlayers() {
		return cNPlayers;
	}
	
	public void loadAutonotePlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazynotePlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cNPlayers.contains(line)){
					cNPlayers.add(line);
				} else {
					cNPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoNote players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutonotePlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazynotePlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cNPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoNotes players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cNPlayers.contains(player);
	}
}
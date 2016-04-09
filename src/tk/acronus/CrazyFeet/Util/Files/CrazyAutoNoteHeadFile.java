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

public class CrazyAutoNoteHeadFile {
	
	private final File auCrazyNoteHeadPlayers;
	public static ArrayList<String> cNHPlayers;
	
	public CrazyAutoNoteHeadFile(File file){
		
		auCrazyNoteHeadPlayers = file;
		cNHPlayers = new ArrayList<String>();
		
		if(auCrazyNoteHeadPlayers.exists() == false){
			try {
				auCrazyNoteHeadPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoNoteHeadPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cNHPlayers.contains(player.getName()) == false){
			cNHPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cNHPlayers.contains(player.getName()) == true){
			cNHPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoNotePlayers() {
		return cNHPlayers;
	}
	
	public void loadAutoNoteHeadPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyNoteHeadPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cNHPlayers.contains(line)){
					cNHPlayers.add(line);
				} else {
					cNHPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoNoteHead players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoNoteHeadPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyNoteHeadPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cNHPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoNoteHead players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cNHPlayers.contains(player);
	}
}
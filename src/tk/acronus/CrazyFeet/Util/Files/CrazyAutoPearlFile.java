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

public class CrazyAutoPearlFile {
	
	private final File auCrazyPearlPlayers;
	public static ArrayList<String> cPPlayers;
	
	public CrazyAutoPearlFile(File file){
		auCrazyPearlPlayers = file;
		cPPlayers = new ArrayList<String>();
		
		if(auCrazyPearlPlayers.exists() == false){
			try {
				auCrazyPearlPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the auCrazyPearlPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cPPlayers.contains(player.getName()) == false){
			cPPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cPPlayers.contains(player.getName()) == true){
			cPPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoPearlPlayers() {
		return cPPlayers;
	}
	
	public void loadAutoPearlPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyPearlPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cPPlayers.contains(line)){
					cPPlayers.add(line);
				} else {
					cPPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoPearl players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoPearlPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyPearlPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cPPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoPearl players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cPPlayers.contains(player);
	}
}

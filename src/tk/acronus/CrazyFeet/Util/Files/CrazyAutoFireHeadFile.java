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

public class CrazyAutoFireHeadFile {
	
	private final File auCrazyFireHeadPlayers;
	public static ArrayList<String> cFHPlayers;
	
	public CrazyAutoFireHeadFile(File file){
		
		auCrazyFireHeadPlayers = file;
		cFHPlayers = new ArrayList<String>();
		
		if(auCrazyFireHeadPlayers.exists() == false){
			try {
				auCrazyFireHeadPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoFireHeadPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cFHPlayers.contains(player.getName()) == false){
			cFHPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cFHPlayers.contains(player.getName()) == true){
			cFHPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoFirePlayers() {
		return cFHPlayers;
	}
	
	public void loadAutoFireHeadPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyFireHeadPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cFHPlayers.contains(line)){
					cFHPlayers.add(line);
				} else {
					cFHPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoFireHead players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoFireHeadPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyFireHeadPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cFHPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoFireHead players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cFHPlayers.contains(player);
	}
}

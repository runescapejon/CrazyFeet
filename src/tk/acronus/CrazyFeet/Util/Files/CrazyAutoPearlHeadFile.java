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

public class CrazyAutoPearlHeadFile {
	
	private final File auCrazyPearlHeadPlayers;
	public static ArrayList<String> cPHPlayers;
	
	public CrazyAutoPearlHeadFile(File file){
		
		auCrazyPearlHeadPlayers = file;
		cPHPlayers = new ArrayList<String>();
		
		if(auCrazyPearlHeadPlayers.exists() == false){
			try {
				auCrazyPearlHeadPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoPearlHeadPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cPHPlayers.contains(player.getName()) == false){
			cPHPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cPHPlayers.contains(player.getName()) == true){
			cPHPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoPearlPlayers() {
		return cPHPlayers;
	}
	
	public void loadAutoPearlHeadPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyPearlHeadPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cPHPlayers.contains(line)){
					cPHPlayers.add(line);
				} else {
					cPHPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoPearlHead players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoPearlHeadPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyPearlHeadPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cPHPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoPearlHead players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cPHPlayers.contains(player);
	}
}
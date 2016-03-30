/**
 * 
 */
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

public class CrazyAutoWitchFile {
	private final File auCrazyWitchPlayers;
	public static ArrayList<String> cWPlayers;
	
	public CrazyAutoWitchFile(File file){
		auCrazyWitchPlayers = file;
		cWPlayers = new ArrayList<String>();
		
		if(auCrazyWitchPlayers.exists() == false){
			try {
				auCrazyWitchPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoWitchPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cWPlayers.contains(player.getName()) == false){
			cWPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cWPlayers.contains(player.getName()) == true){
			cWPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoWitchPlayers() {
		return cWPlayers;
	}
	
	public void loadAutoWitchPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyWitchPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cWPlayers.contains(line)){
					cWPlayers.add(line);
				} else {
					cWPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoWitch players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoWitchPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyWitchPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cWPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoWitch players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cWPlayers.contains(player);
	}
}
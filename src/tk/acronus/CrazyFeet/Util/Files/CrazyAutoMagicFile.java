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

/**
 * @author Pete Wicken
 *
 */
public class CrazyAutoMagicFile {
	
	private final File auCrazyMagicPlayers;
	public static ArrayList<String> cMPlayers;
	
	public CrazyAutoMagicFile(File file){
		auCrazyMagicPlayers = file;
		cMPlayers = new ArrayList<String>();
		
		if(auCrazyMagicPlayers.exists() == false){
			try {
				auCrazyMagicPlayers.createNewFile();
			} catch (IOException e){
				System.out.println("CrazyFeet failed to create the AutoMagicPlayers file!");
				e.printStackTrace();
			}
		}
	}
	public void add(Player player){
		if(cMPlayers.contains(player.getName()) == false){
			cMPlayers.add(player.getName());
		}
	}
	
	public void remove(Player player) {
		if(cMPlayers.contains(player.getName()) == true){
			cMPlayers.remove(player.getName());
		}
	}
	
	public ArrayList<String> getAutoMagicPlayers() {
		return cMPlayers;
	}
	
	public void loadAutoMagicPlayers(){
		try {
			DataInputStream input = new DataInputStream(new FileInputStream(auCrazyMagicPlayers));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		
			String line;
		
			while((line = reader.readLine()) != null){
				if(cMPlayers.contains(line)){
					cMPlayers.add(line);
				} else {
					cMPlayers.add(line);
				}
			}
			
			reader.close();
			input.close();
			
		} catch (Exception e) {
			System.out.println("CrazyFeet failed to load the AutoMagic players!");
			e.printStackTrace();
		}
	}
	
	public void saveAutoMagicPlayers(){
		try {
			FileWriter stream = new FileWriter(auCrazyMagicPlayers);
			BufferedWriter out = new BufferedWriter(stream);
		
		for(String value : cMPlayers){
			out.write(value);
			out.newLine();
		}
		
		out.close();
		stream.close();
		
		} catch (IOException e) {
			System.out.println("CrazyFeet failed to save AutoMagic players!");
			e.printStackTrace();
		}
		
	}
	
	public boolean contains(String player){
		return cMPlayers.contains(player);
	}
}

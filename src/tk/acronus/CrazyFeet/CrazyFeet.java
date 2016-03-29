package tk.acronus.CrazyFeet;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import tk.acronus.CrazyFeet.Commands.CrazyFireCommands;
import tk.acronus.CrazyFeet.Commands.CrazyMagicCommands;
import tk.acronus.CrazyFeet.Commands.CrazyPearlCommands;
import tk.acronus.CrazyFeet.Commands.CrazySmokeCommands;
import tk.acronus.CrazyFeet.Commands.CrazynoteCommands;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoFire;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoMagic;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoPearl;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoSmoke;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutonote;
import tk.acronus.CrazyFeet.Commands.Util.CrazyCheckCommands;
import tk.acronus.CrazyFeet.Commands.Util.CrazyDisableCommands;
import tk.acronus.CrazyFeet.Commands.Util.CrazyFeetCommands;
import tk.acronus.CrazyFeet.Commands.Util.Auto.CrazyAutoCheck;
import tk.acronus.CrazyFeet.Commands.Util.Auto.CrazyAutoDisable;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoMagicFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoPearlFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoSmokeFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutonoteFile;

public class CrazyFeet extends JavaPlugin {
	
	public final CrazyFeetListener playerListener = new CrazyFeetListener();
	public final CrazyFeetJoinListener playerJoinListener = new CrazyFeetJoinListener();
	
	public static ArrayList<Player> CrazyFire;
	public static ArrayList<Player> CrazySmoke;
	public static ArrayList<Player> CrazyMagic;
	public static ArrayList<Player> CrazyPearl;
	public static ArrayList<Player> Crazynote;
	
	public static ArrayList<String> cFPlayers;
	public static ArrayList<String> cSPlayers;
	public static ArrayList<String> cPPlayers;
	public static ArrayList<String> cMPlayers;
	public static ArrayList<String> cNPlayers;
	
	public final ChatColor red = ChatColor.RED;
	public final ChatColor yellow = ChatColor.YELLOW;
	public final ChatColor green = ChatColor.GREEN;
	public final ChatColor purple = ChatColor.DARK_PURPLE;
	
	private CrazyFeetCommands cFeetC;
	private CrazyCheckCommands cCheckC;
	private CrazyDisableCommands cDisableC;
	
	private CrazyFireCommands cFireC;
	private CrazySmokeCommands cSmokeC;
	private CrazyMagicCommands cMagicC;
	private CrazyPearlCommands cPearlC;
	private CrazynoteCommands cnote;
	
	private CrazyAutoFire cAutoFire;
	private CrazyAutoSmoke cAutoSmoke;
	private CrazyAutoPearl cAutoPearl;
	private CrazyAutoMagic cAutoMagic;
	private CrazyAutonote cAutonote;
	
	private CrazyAutoCheck cAutoCheck;
	private CrazyAutoDisable cAutoDisable;
	
	public static CrazyAutoFireFile aFireP;
	public static CrazyAutoSmokeFile aSmokeP;
	public static CrazyAutoPearlFile aPearlP;
	public static CrazyAutoMagicFile aMagicP;
	public static CrazyAutonoteFile anoteP;

	private File autoFirePlayers;
	private File autoSmokePlayers;
	private File autoPearlPlayers;
	private File autoMagicPlayers;
	private File autonotePlayers;

	@Override
	public void onEnable() {
		
		getLogger().info("Enabling the CrazyFeet plugin...");
		
		CrazyFire = new ArrayList<Player>();
		CrazySmoke = new ArrayList<Player>();
		CrazyMagic = new ArrayList<Player>();
		CrazyPearl = new ArrayList<Player>();
		Crazynote = new ArrayList<Player>();
		
		cNPlayers = CrazyAutonoteFile.cNPlayers;
		cFPlayers = CrazyAutoFireFile.cFPlayers;
		cSPlayers = CrazyAutoSmokeFile.cSPlayers;
		cPPlayers = CrazyAutoPearlFile.cPPlayers;
		cMPlayers = CrazyAutoMagicFile.cMPlayers;
		
		cFireC = new CrazyFireCommands();
		cSmokeC = new CrazySmokeCommands();
		cMagicC = new CrazyMagicCommands();
		cPearlC = new CrazyPearlCommands();
		cnote = new CrazynoteCommands();
		
		cFeetC = new CrazyFeetCommands();
		cCheckC = new CrazyCheckCommands();
		cDisableC = new CrazyDisableCommands();
		
		cAutoFire = new CrazyAutoFire(this);
		cAutoSmoke = new CrazyAutoSmoke(this);
		cAutoPearl = new CrazyAutoPearl(this);
		cAutoMagic = new CrazyAutoMagic(this);
		cAutonote = new CrazyAutonote(this);
		
		cAutoCheck = new CrazyAutoCheck();
		cAutoDisable = new CrazyAutoDisable(this);
		
		getCommand("CrazyFeet").setExecutor(cFeetC);
		getCommand("CrazyCheck").setExecutor(cCheckC);
		getCommand("CrazyDisable").setExecutor(cDisableC);
		
		getCommand("CrazyFire").setExecutor(cFireC);
		getCommand("CrazySmoke").setExecutor(cSmokeC);
		getCommand("CrazyMagic").setExecutor(cMagicC);
		getCommand("CrazyPearl").setExecutor(cPearlC);
		getCommand("Crazynote").setExecutor(cnote);
		
		getCommand("CrazyAutoFire").setExecutor(cAutoFire);
		getCommand("CrazyAutoSmoke").setExecutor(cAutoSmoke);
		getCommand("CrazyAutoPearl").setExecutor(cAutoPearl);
		getCommand("CrazyAutoMagic").setExecutor(cAutoMagic);
		getCommand("CrazyAutonote").setExecutor(cAutonote);

		getCommand("CrazyAutoCheck").setExecutor(cAutoCheck);
		getCommand("CrazyAutoDisable").setExecutor(cAutoDisable);
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this.playerListener, this);
		pm.registerEvents(this.playerJoinListener, this);
		
		String folder = this.getDataFolder().getAbsolutePath();
		(new File(folder)).mkdir();
		
		autoFirePlayers = new File(folder+File.separator+"AutoFirePlayers.txt");
		autoSmokePlayers = new File(folder+File.separator+"AutoSmokePlayers.txt");
		autoPearlPlayers = new File(folder+File.separator+"AutoPearlPlayers.txt");
		autoMagicPlayers = new File(folder+File.separator+"AutoMagicPlayers.txt");
		autonotePlayers = new File(folder+File.separator+"AutonotePlayers.txt");
		
		aFireP = new CrazyAutoFireFile(autoFirePlayers);
		aSmokeP = new CrazyAutoSmokeFile(autoSmokePlayers);
		aPearlP = new CrazyAutoPearlFile(autoPearlPlayers);
		aMagicP = new CrazyAutoMagicFile(autoMagicPlayers);
		anoteP = new CrazyAutonoteFile(autonotePlayers);
		
		aFireP.loadAutoFirePlayers();
		aSmokeP.loadAutoSmokePlayers();
		aPearlP.loadAutoPearlPlayers();
		aMagicP.loadAutoMagicPlayers();
		anoteP.loadAutonotePlayers();
	}

	@Override
	public void onDisable() {
		
		getLogger().info("Disabling the CrazyFeet plugin...");
		
	}


	public CrazyAutoFireFile getAFirePlayers() {
		return aFireP;
	}
	
	public CrazyAutoSmokeFile getASmokePlayers() {
		return aSmokeP;
	}

	public CrazyAutonoteFile getAnotePlayers() {
		return anoteP;
	}

	public CrazyAutoPearlFile getAPearlPlayers() {
		return aPearlP;
	}
	
	public CrazyAutoMagicFile getAMagicPlayers() {
		return aMagicP;
	}
}

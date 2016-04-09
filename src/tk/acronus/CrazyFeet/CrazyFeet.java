package tk.acronus.CrazyFeet;

import java.io.File;
import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import tk.acronus.CrazyFeet.Commands.CrazyFireCommands;
import tk.acronus.CrazyFeet.Commands.CrazyFireHeadCommands;
import tk.acronus.CrazyFeet.Commands.CrazyHeartHeadCommands;
import tk.acronus.CrazyFeet.Commands.CrazyMagicHeadCommands;
import tk.acronus.CrazyFeet.Commands.CrazyNoteHeadCommands;
import tk.acronus.CrazyFeet.Commands.CrazyWitchHeadCommands;
import tk.acronus.CrazyFeet.Commands.CrazySmokeHeadCommands;
import tk.acronus.CrazyFeet.Commands.CrazyPearlHeadCommands;
import tk.acronus.CrazyFeet.Commands.CrazyMagicCommands;
import tk.acronus.CrazyFeet.Commands.CrazyPearlCommands;
import tk.acronus.CrazyFeet.Commands.CrazySmokeCommands;
import tk.acronus.CrazyFeet.Commands.CrazynoteCommands;
import tk.acronus.CrazyFeet.Commands.CrazyWitchCommands;
import tk.acronus.CrazyFeet.Commands.CrazyHeartCommands;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoFire;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoFireHead;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoHeartHead;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoMagicHead;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoNoteHead;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoWitchHead;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoSmokeHead;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoPearlHead;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoWitch;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoMagic;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoPearl;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoSmoke;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutonote;
import tk.acronus.CrazyFeet.Commands.Auto.CrazyAutoHeart;
import tk.acronus.CrazyFeet.Commands.Util.CrazyAutoFeetCommands;
import tk.acronus.CrazyFeet.Commands.Util.CrazyAutoHeadCommands;
import tk.acronus.CrazyFeet.Commands.Util.CrazyCheckCommands;
import tk.acronus.CrazyFeet.Commands.Util.CrazyDisableCommands;
import tk.acronus.CrazyFeet.Commands.Util.CrazyFeetCommands;
import tk.acronus.CrazyFeet.Commands.Util.CrazyHeadCommands;
import tk.acronus.CrazyFeet.Commands.Util.Auto.CrazyAutoCheck;
import tk.acronus.CrazyFeet.Commands.Util.Auto.CrazyAutoDisable;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoFireHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoHeartHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoMagicHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoNoteHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoWitchHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoSmokeHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoPearlHeadFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoMagicFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoPearlFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoSmokeFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutonoteFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoWitchFile;
import tk.acronus.CrazyFeet.Util.Files.CrazyAutoHeartFile;

public class CrazyFeet 
  extends JavaPlugin 
  {
	
	public final CrazyFeetListener playerListener = new CrazyFeetListener();
	public final CrazyFeetJoinListener playerJoinListener = new CrazyFeetJoinListener();
	
	public static ArrayList<Player> CrazyFire;
	public static ArrayList<Player> CrazyFireHead;
	public static ArrayList<Player> CrazyHeartHead;
	public static ArrayList<Player> CrazyMagicHead;
	public static ArrayList<Player> CrazyNoteHead;
	public static ArrayList<Player> CrazyWitchHead;
	public static ArrayList<Player> CrazySmokeHead;
	public static ArrayList<Player> CrazyPearlHead;
	public static ArrayList<Player> CrazySmoke;
	public static ArrayList<Player> CrazyMagic;
	public static ArrayList<Player> CrazyPearl;
	public static ArrayList<Player> Crazynote;
	public static ArrayList<Player> CrazyWitch;
	public static ArrayList<Player> CrazyHeart;

	public static ArrayList<String> cHHPlayers;
	public static ArrayList<String> cMHPlayers;
	public static ArrayList<String> cNHPlayers;
	public static ArrayList<String> cWHPlayers;
	public static ArrayList<String> cSHPlayers;
	public static ArrayList<String> cPHPlayers;
	public static ArrayList<String> cFHPlayers;
	public static ArrayList<String> cFPlayers;
	public static ArrayList<String> cSPlayers;
	public static ArrayList<String> cPPlayers;
	public static ArrayList<String> cMPlayers;
	public static ArrayList<String> cNPlayers;
	public static ArrayList<String> cWPlayers;
	public static ArrayList<String> HPPlayers;
	
	public final ChatColor red = ChatColor.RED;
	public final ChatColor yellow = ChatColor.YELLOW;
	public final ChatColor green = ChatColor.GREEN;
	public final ChatColor purple = ChatColor.DARK_PURPLE;
	
	private CrazyFeetCommands cFeetC;
	private CrazyHeadCommands cHeadC;
	private CrazyAutoFeetCommands cautofeetC;
	private CrazyAutoHeadCommands cautoheadC;
	private CrazyCheckCommands cCheckC;
	private CrazyDisableCommands cDisableC;

	private CrazyFireHeadCommands chFireC;
	private CrazyHeartHeadCommands chHeartC;
	private CrazyMagicHeadCommands chMagicC;
	private CrazyNoteHeadCommands chNoteC;
	private CrazyWitchHeadCommands chWitchC;
	private CrazySmokeHeadCommands chSmokeC;
	private CrazyPearlHeadCommands chPearlC;
	private CrazyFireCommands cFireC;
	private CrazySmokeCommands cSmokeC;
	private CrazyMagicCommands cMagicC;
	private CrazyPearlCommands cPearlC;
	private CrazynoteCommands cnote;
	private CrazyWitchCommands cWitch;
	private CrazyHeartCommands cHeart;
	
	private CrazyAutoFire cAutoFire;
	private CrazyAutoFireHead cAutoFireHead;
	private CrazyAutoHeartHead cAutoHeartHead;
	private CrazyAutoMagicHead cAutoMagicHead;
	private CrazyAutoNoteHead cAutoNoteHead;
	private CrazyAutoWitchHead cAutoWitchHead;
	private CrazyAutoSmokeHead cAutoSmokeHead;
	private CrazyAutoPearlHead cAutoPearlHead;
	private CrazyAutoSmoke cAutoSmoke;
	private CrazyAutoPearl cAutoPearl;
	private CrazyAutoMagic cAutoMagic;
	private CrazyAutoWitch cAutoWitch;
	private CrazyAutonote cAutonote;
	private CrazyAutoHeart cAutoHeart;
	
	private CrazyAutoCheck cAutoCheck;
	private CrazyAutoDisable cAutoDisable;
	
	public static CrazyAutoFireHeadFile aFireHeadPlayer;
	public static CrazyAutoHeartHeadFile aHeartHeadPlayer;
	public static CrazyAutoMagicHeadFile aMagicHeadPlayer;
	public static CrazyAutoNoteHeadFile aNoteHeadPlayer;
	public static CrazyAutoWitchHeadFile aWitchHeadPlayer;
	public static CrazyAutoSmokeHeadFile aSmokeHeadPlayer;
	public static CrazyAutoPearlHeadFile aPearlHeadPlayer;
	public static CrazyAutoFireFile aFirePlayer;
	public static CrazyAutoSmokeFile aSmokeP;
	public static CrazyAutoPearlFile aPearlP;
	public static CrazyAutoMagicFile aMagicP;
	public static CrazyAutonoteFile anoteP;
	public static CrazyAutoWitchFile aWitchP;
	public static CrazyAutoHeartFile aHeartP;

	private File autoFireHeadPlayers;
	private File autoHeartHeadPlayers;
	private File autoMagicHeadPlayers;
	private File autoNoteHeadPlayers;
	private File autoWitchHeadPlayers;
	private File autoSmokeHeadPlayers;
	private File autoPearlHeadPlayers;
	private File autoFirePlayers;
	private File autoHeartPlayers;
	private File autoSmokePlayers;
	private File autoPearlPlayers;
	private File autoMagicPlayers;
	private File autonotePlayers;
	private File autoWitchPlayers;

	@Override
	public void onEnable() {
		
		getLogger().info("Enabling the CrazyFeet plugin...");

		CrazyFireHead = new ArrayList<Player>();
		CrazyHeartHead = new ArrayList<Player>();
		CrazyMagicHead = new ArrayList<Player>();
		CrazyNoteHead = new ArrayList<Player>();
		CrazyWitchHead = new ArrayList<Player>();
		CrazySmokeHead = new ArrayList<Player>();
		CrazyPearlHead = new ArrayList<Player>();
		CrazyFire = new ArrayList<Player>();
		CrazySmoke = new ArrayList<Player>();
		CrazyMagic = new ArrayList<Player>();
		CrazyPearl = new ArrayList<Player>();
		Crazynote = new ArrayList<Player>();
		CrazyWitch = new ArrayList<Player>();
		CrazyHeart = new ArrayList<Player>();
		
		cNPlayers = CrazyAutonoteFile.cNPlayers;
		cFPlayers = CrazyAutoFireFile.cFPlayers;
		cFHPlayers = CrazyAutoFireHeadFile.cFHPlayers;
		cHHPlayers = CrazyAutoHeartHeadFile.cHHPlayers;
		cMHPlayers = CrazyAutoMagicHeadFile.cMHPlayers;
		cNHPlayers = CrazyAutoNoteHeadFile.cNHPlayers;
		cWHPlayers = CrazyAutoWitchHeadFile.cWHPlayers;
		cSHPlayers = CrazyAutoSmokeHeadFile.cSHPlayers;
		cPHPlayers = CrazyAutoPearlHeadFile.cPHPlayers;
		cSPlayers = CrazyAutoSmokeFile.cSPlayers;
		cPPlayers = CrazyAutoPearlFile.cPPlayers;
		cMPlayers = CrazyAutoMagicFile.cMPlayers;
		cWPlayers = CrazyAutoWitchFile.cWPlayers;
		HPPlayers = CrazyAutoHeartFile.HPPPlayers;

		chFireC = new CrazyFireHeadCommands();
		chHeartC = new CrazyHeartHeadCommands();
		chMagicC = new CrazyMagicHeadCommands();
		chNoteC = new CrazyNoteHeadCommands();
		chWitchC = new CrazyWitchHeadCommands();
		chSmokeC = new CrazySmokeHeadCommands();
		chPearlC = new CrazyPearlHeadCommands();
		cFireC = new CrazyFireCommands();
		cHeart = new CrazyHeartCommands();
		cSmokeC = new CrazySmokeCommands();
		cMagicC = new CrazyMagicCommands();
		cPearlC = new CrazyPearlCommands();
		cnote = new CrazynoteCommands();
		cWitch = new CrazyWitchCommands();
		
		cFeetC = new CrazyFeetCommands();
		cHeadC = new CrazyHeadCommands();
		cautofeetC = new CrazyAutoFeetCommands();
		cautoheadC = new CrazyAutoHeadCommands();
		cCheckC = new CrazyCheckCommands();
		cDisableC = new CrazyDisableCommands();
		
		cAutoFireHead = new CrazyAutoFireHead(this);
		cAutoHeartHead = new CrazyAutoHeartHead(this);
		cAutoMagicHead = new CrazyAutoMagicHead(this);
		cAutoNoteHead = new CrazyAutoNoteHead(this);
		cAutoWitchHead = new CrazyAutoWitchHead(this);
		cAutoSmokeHead = new CrazyAutoSmokeHead(this);
		cAutoPearlHead = new CrazyAutoPearlHead(this);
		cAutoFire = new CrazyAutoFire(this);
		cAutoHeart = new CrazyAutoHeart(this);
		cAutoSmoke = new CrazyAutoSmoke(this);
		cAutoPearl = new CrazyAutoPearl(this);
		cAutoMagic = new CrazyAutoMagic(this);
		cAutonote = new CrazyAutonote(this);
		cAutoWitch = new CrazyAutoWitch(this);
		
		cAutoCheck = new CrazyAutoCheck();
		cAutoDisable = new CrazyAutoDisable(this);
		
		getCommand("CrazyFeet").setExecutor(cFeetC);
		getCommand("CrazyHead").setExecutor(cHeadC);
		getCommand("Crazyautofeet").setExecutor(cautofeetC);
		getCommand("Crazyautohead").setExecutor(cautoheadC);
		getCommand("CrazyCheck").setExecutor(cCheckC);
		getCommand("CrazyDisable").setExecutor(cDisableC);

		getCommand("CrazyFireHead").setExecutor(chFireC);
		getCommand("CrazyHeartHead").setExecutor(chHeartC);
		getCommand("CrazyMagicHead").setExecutor(chMagicC);
		getCommand("CrazyNoteHead").setExecutor(chNoteC);
		getCommand("CrazyWitchHead").setExecutor(chWitchC);
		getCommand("CrazySmokeHead").setExecutor(chSmokeC);
		getCommand("CrazyPearlHead").setExecutor(chPearlC);
		getCommand("CrazyFire").setExecutor(cFireC);
		getCommand("CrazySmoke").setExecutor(cSmokeC);
		getCommand("CrazyMagic").setExecutor(cMagicC);
		getCommand("CrazyPearl").setExecutor(cPearlC);
		getCommand("Crazynote").setExecutor(cnote);
		getCommand("CrazyWitch").setExecutor(cWitch);
		getCommand("CrazyHeart").setExecutor(cHeart);
		
		getCommand("CrazyAutoFireHead").setExecutor(cAutoFireHead);
		getCommand("CrazyAutoHeartHead").setExecutor(cAutoHeartHead);
		getCommand("CrazyAutoMagicHead").setExecutor(cAutoMagicHead);
		getCommand("CrazyAutoNoteHead").setExecutor(cAutoNoteHead);
		getCommand("CrazyAutoWitchHead").setExecutor(cAutoWitchHead);
		getCommand("CrazyAutoSmokeHead").setExecutor(cAutoSmokeHead);
		getCommand("CrazyAutoPearlHead").setExecutor(cAutoPearlHead);
		getCommand("CrazyAutoFire").setExecutor(cAutoFire);
		getCommand("CrazyAutoSmoke").setExecutor(cAutoSmoke);
		getCommand("CrazyAutoPearl").setExecutor(cAutoPearl);
		getCommand("CrazyAutoMagic").setExecutor(cAutoMagic);
		getCommand("CrazyAutonote").setExecutor(cAutonote);
		getCommand("CrazyAutoWitch").setExecutor(cAutoWitch);
		getCommand("CrazyAutoHeart").setExecutor(cAutoHeart);

		getCommand("CrazyAutoCheck").setExecutor(cAutoCheck);
		getCommand("CrazyAutoDisable").setExecutor(cAutoDisable);
		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(this.playerListener, this);
		pm.registerEvents(this.playerJoinListener, this);
		
		String folder = this.getDataFolder().getAbsolutePath();
		(new File(folder)).mkdir();

		autoFireHeadPlayers = new File(folder+File.separator+"AutoFireHeadPlayers.txt");
		autoHeartHeadPlayers = new File(folder+File.separator+"AutoHeartHeadPlayers.txt");
		autoMagicHeadPlayers = new File(folder+File.separator+"AutoMagicHeadPlayers.txt");
		autoNoteHeadPlayers = new File(folder+File.separator+"AutoNoteHeadPlayers.txt");
		autoWitchHeadPlayers = new File(folder+File.separator+"AutoWitchHeadPlayers.txt");
		autoSmokeHeadPlayers = new File(folder+File.separator+"AutoSmokeHeadPlayers.txt");
		autoPearlHeadPlayers = new File(folder+File.separator+"AutoPearlHeadPlayers.txt");
		autoFirePlayers = new File(folder+File.separator+"AutoFirePlayers.txt");
		autoSmokePlayers = new File(folder+File.separator+"AutoSmokePlayers.txt");
		autoPearlPlayers = new File(folder+File.separator+"AutoPearlPlayers.txt");
		autoMagicPlayers = new File(folder+File.separator+"AutoMagicPlayers.txt");
		autonotePlayers = new File(folder+File.separator+"AutonotePlayers.txt");
		autoWitchPlayers = new File(folder+File.separator+"AutoWitchPlayers.txt");
		autoHeartPlayers = new File(folder+File.separator+"AutoHeartPlayers.txt");

		aFireHeadPlayer = new CrazyAutoFireHeadFile(autoFireHeadPlayers);
		aHeartHeadPlayer = new CrazyAutoHeartHeadFile(autoHeartHeadPlayers);
		aMagicHeadPlayer = new CrazyAutoMagicHeadFile(autoMagicHeadPlayers);
		aNoteHeadPlayer = new CrazyAutoNoteHeadFile(autoNoteHeadPlayers);
		aWitchHeadPlayer = new CrazyAutoWitchHeadFile(autoWitchHeadPlayers);
		aSmokeHeadPlayer = new CrazyAutoSmokeHeadFile(autoSmokeHeadPlayers);
		aPearlHeadPlayer = new CrazyAutoPearlHeadFile(autoPearlHeadPlayers);
		aFirePlayer = new CrazyAutoFireFile(autoFirePlayers);
		aHeartP = new CrazyAutoHeartFile(autoHeartPlayers);
		aSmokeP = new CrazyAutoSmokeFile(autoSmokePlayers);
		aPearlP = new CrazyAutoPearlFile(autoPearlPlayers);
		aMagicP = new CrazyAutoMagicFile(autoMagicPlayers);
		anoteP = new CrazyAutonoteFile(autonotePlayers);
		aWitchP = new CrazyAutoWitchFile(autoWitchPlayers);
		
		aFireHeadPlayer.loadAutoFireHeadPlayers();
		aHeartHeadPlayer.loadAutoHeartHeadPlayers();
		aMagicHeadPlayer.loadAutoMagicHeadPlayers();
		aNoteHeadPlayer.loadAutoNoteHeadPlayers();
		aWitchHeadPlayer.loadAutoWitchHeadPlayers();
		aSmokeHeadPlayer.loadAutoSmokeHeadPlayers();
		aFirePlayer.loadAutoFirePlayers();
		aSmokeP.loadAutoSmokePlayers();
		aPearlP.loadAutoPearlPlayers();
		aMagicP.loadAutoMagicPlayers();
		anoteP.loadAutonotePlayers();
		aHeartP.loadAutoHeartPlayers();
		aWitchP.loadAutoWitchPlayers();
	}

	@Override
	public void onDisable() {
		
		getLogger().info("Disabling the CrazyFeet plugin...");
		
	}

    public CrazyAutoFireFile getAFirePlayers() {
		return aFirePlayer;
	}
   
    public CrazyAutoFireHeadFile getAFireheadPlayers() {
		return aFireHeadPlayer;
	}
    
    public CrazyAutoHeartHeadFile getAHeartheadPlayers() {
		return aHeartHeadPlayer;
	}
    
    public CrazyAutoMagicHeadFile getAMagicheadPlayers() {
		return aMagicHeadPlayer;
	}
	
    public CrazyAutoNoteHeadFile getANoteheadPlayers() {
		return aNoteHeadPlayer;
	}

    public CrazyAutoWitchHeadFile getAWitchheadPlayers() {
		return aWitchHeadPlayer;
	}
 
    public CrazyAutoSmokeHeadFile getASmokeheadPlayers() {
		return aSmokeHeadPlayer;
	}
  
    public CrazyAutoPearlHeadFile getAPearlheadPlayers() {
		return aPearlHeadPlayer;
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

	public CrazyAutoWitchFile getAWitchPlayers() {
		return aWitchP;
	}

	public CrazyAutoHeartFile getAHeartPlayers() {
		return aHeartP;
	}
	
	public CrazyAutoMagicFile getAMagicPlayers() {
		return aMagicP;
	}
}

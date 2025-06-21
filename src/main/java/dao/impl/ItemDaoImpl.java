package dao.impl;

import dao.ItemDao;
import model.Character;
import model.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemDaoImpl implements ItemDao {

    //private final CharacterDao characterDao;
    private final Character character;

    private List<Item> itemList = new ArrayList<>();
    private Map<String, List<Item>> itemMap = new HashMap<>();
    private Map<String, List<Item>> itemMapJuggernaut = new HashMap<>();
    private Map<String, List<Item>> itemMapZeus = new HashMap<>();
    private Map<String, List<Item>> itemMapInvoker = new HashMap<>();
    private Map<String, List<Item>> itemMapAxe = new HashMap<>();
    private Map<String, List<Item>> itemMapLegionCommander = new HashMap<>();
    private Map<String, List<Item>> itemMapJakiro = new HashMap<>();
    private Map<String, List<Item>> itemMapAncientApparition = new HashMap<>();
    private Map<String, List<Item>> itemMapCrystalMaiden = new HashMap<>();
    private Map<String, List<Item>> itemMapWitchDoctor = new HashMap<>();
    private Map<Integer, Map<String, List<Item>>> nazvanie1 = new HashMap<>();

    private int id = 0;

    public ItemDaoImpl(Character character) {
        this.character = character;
    }

    {
        Item tango = new Item("Tango", 90);
        Item ironBranch = new Item("Iron Branch", 50);
        Item quellingBlade = new Item("Quelling Blade", 100);
        Item powerTreads = new Item("Power Treads", 1400);
        Item wraithBand = new Item("Wraith Band", 505);
        Item battleFury = new Item("Battle Fury", 3900);
        Item desolator = new Item("Desolator", 3500);
        Item blackKingBar = new Item("Black King Bar", 4050);
        Item skullBasher = new Item("Skull Basher", 2875);
        Item moonShard = new Item("Moon Shard", 4000);
        Item scytheOfVyse = new Item("Scythe Of Vyse", 5200);
        Item monkeyKingBar = new Item("Monkey King Bar", 4700);
        Item phaseBoots = new Item("Phase Boots", 1500);
        Item parasma = new Item("Parasma", 5975);
        Item arcaneBoots = new Item("Arcane Boots", 1400);
        Item tranquilBoots = new Item("Tranquil Boots", 900);
        Item aghanimsScepter = new Item("Aghanim's Scepter", 4200);
        Item nullifier = new Item("Nullifier", 4375);
        Item aetherLens = new Item("Aether Lens", 2275);
        Item windWaker = new Item("Wind Waker", 6800);
        Item abyssalBlade = new Item("Abyssal Blade", 6250);
        Item mantaStyle = new Item("Manta Style", 4650);
        Item hurricanePike = new Item("Hurricane Pike", 4450);
        Item shivasGuard = new Item("Shiva's Guard", 5175);
        Item overwhelmingBlink = new Item("Overwhelming Blink", 6800);
        Item swiftBlink = new Item("Swift Blink", 6800);
        Item kayaAndSange = new Item("Kaya and Sange", 4200);

        List<Item> itemsForPhantomAssasinStart = new ArrayList<>();
        itemsForPhantomAssasinStart.add(tango);
        itemsForPhantomAssasinStart.add(ironBranch);
        itemsForPhantomAssasinStart.add(quellingBlade);
        List<Item> itemsForPhantomAssasinStartingGame = new ArrayList<>();
        itemsForPhantomAssasinStartingGame.add(powerTreads);
        itemsForPhantomAssasinStartingGame.add(wraithBand);
        itemsForPhantomAssasinStartingGame.add(battleFury);
        List<Item> itemsForPhantomAssasinMainStageGame = new ArrayList<>();
        itemsForPhantomAssasinMainStageGame.add(desolator);
        itemsForPhantomAssasinMainStageGame.add(blackKingBar);
        itemsForPhantomAssasinMainStageGame.add(skullBasher);
        List<Item> itemsForPhantomAssasinSituationGame = new ArrayList<>();
        itemsForPhantomAssasinSituationGame.add(moonShard);
        itemsForPhantomAssasinSituationGame.add(scytheOfVyse);
        itemsForPhantomAssasinSituationGame.add(monkeyKingBar);
        itemMap.put("startPhantomAssassin", itemsForPhantomAssasinStart);
        itemMap.put("startGamePhantomAssassin", itemsForPhantomAssasinStartingGame);
        itemMap.put("mainStageGamePhantomAssassin", itemsForPhantomAssasinMainStageGame);
        itemMap.put("situationGamePhantomAssassin", itemsForPhantomAssasinSituationGame);

        List<Item> itemsForJuggernautStart = new ArrayList<>();
        itemsForJuggernautStart.add(tango);
        itemsForJuggernautStart.add(ironBranch);
        itemsForJuggernautStart.add(quellingBlade);
        List<Item> itemsForJuggernautStartingGame = new ArrayList<>();
        itemsForJuggernautStartingGame.add(phaseBoots);
        itemsForJuggernautStartingGame.add(wraithBand);
        itemsForJuggernautStartingGame.add(mantaStyle);
        List<Item> itemsForJuggernautMainStageGame = new ArrayList<>();
        itemsForJuggernautMainStageGame.add(blackKingBar);
        itemsForJuggernautMainStageGame.add(skullBasher);
        itemsForJuggernautMainStageGame.add(aghanimsScepter);
        List<Item> itemsForJuggernautSituationGame = new ArrayList<>();
        itemsForJuggernautSituationGame.add(nullifier);
        itemsForJuggernautSituationGame.add(abyssalBlade);
        itemsForJuggernautSituationGame.add(swiftBlink);
        itemMap.put("startJuggernaut", itemsForJuggernautStart);
        itemMap.put("startGameJuggernaut", itemsForJuggernautStartingGame);
        itemMap.put("mainStageGameJuggernaut", itemsForJuggernautMainStageGame);
        itemMap.put("situationGameJuggernaut", itemsForJuggernautSituationGame);

        List<Item> itemsForZeusStart = new ArrayList<>();
        itemsForZeusStart.add(tango);
        itemsForZeusStart.add(ironBranch);
        List<Item> itemsForZeusStartingGame = new ArrayList<>();
        itemsForZeusStartingGame.add(arcaneBoots);
        itemsForZeusStartingGame.add(aetherLens);
        List<Item> itemsForZeusMainStageGame = new ArrayList<>();
        itemsForZeusMainStageGame.add(parasma);
        itemsForZeusMainStageGame.add(kayaAndSange);
        List<Item> itemsForZeusSituationGame = new ArrayList<>();
        itemsForZeusSituationGame.add(hurricanePike);
        itemsForZeusSituationGame.add(aghanimsScepter);
        itemsForZeusSituationGame.add(windWaker);
        itemMap.put("startZeus", itemsForZeusStart);
        itemMap.put("startGameZeus", itemsForZeusStartingGame);
        itemMap.put("mainStageGameZeus", itemsForZeusMainStageGame);
        itemMap.put("situationGameZeus", itemsForZeusSituationGame);

        List<Item> itemsForInvokerStart = new ArrayList<>();
        itemsForInvokerStart.add(tango);
        itemsForInvokerStart.add(ironBranch);
        List<Item> itemsForInvokerStartingGame = new ArrayList<>();
        itemsForInvokerStartingGame.add(arcaneBoots);
        itemsForInvokerStartingGame.add(aetherLens);
        List<Item> itemsForInvokerMainStageGame = new ArrayList<>();
        itemsForInvokerMainStageGame.add(parasma);
        itemsForInvokerMainStageGame.add(kayaAndSange);
        List<Item> itemsForInvokerSituationGame = new ArrayList<>();
        itemsForInvokerSituationGame.add(hurricanePike);
        itemsForInvokerSituationGame.add(aghanimsScepter);
        itemsForInvokerSituationGame.add(windWaker);
        itemMap.put("startInvoker", itemsForInvokerStart);
        itemMap.put("startGameInvoker", itemsForInvokerStartingGame);
        itemMap.put("mainStageGameInvoker", itemsForInvokerMainStageGame);
        itemMap.put("situationGameInvoker", itemsForInvokerSituationGame);

        List<Item> itemsForAxeStart = new ArrayList<>();
        itemsForAxeStart.add(tango);
        itemsForAxeStart.add(ironBranch);
        itemsForAxeStart.add(quellingBlade);
        List<Item> itemsForAxeStartingGame = new ArrayList<>();
        itemsForAxeStartingGame.add(phaseBoots);
        itemsForAxeStartingGame.add(aghanimsScepter);
        List<Item> itemsForAxeMainStageGame = new ArrayList<>();
        itemsForAxeMainStageGame.add(blackKingBar);
        itemsForAxeMainStageGame.add(shivasGuard);
        itemsForAxeMainStageGame.add(overwhelmingBlink);
        List<Item> itemsForAxeSituationGame = new ArrayList<>();
        itemsForAxeSituationGame.add(kayaAndSange);
        itemsForAxeSituationGame.add(windWaker);
        itemsForAxeSituationGame.add(swiftBlink);
        itemMap.put("startAxe", itemsForAxeStart);
        itemMap.put("startGameAxe", itemsForAxeStartingGame);
        itemMap.put("mainStageGameAxe", itemsForAxeMainStageGame);
        itemMap.put("situationGameAxe", itemsForAxeSituationGame);

        List<Item> itemsForLegionCommanderStart = new ArrayList<>();
        itemsForLegionCommanderStart.add(tango);
        itemsForLegionCommanderStart.add(ironBranch);
        itemsForLegionCommanderStart.add(quellingBlade);
        List<Item> itemsForLegionCommanderStartingGame = new ArrayList<>();
        itemsForLegionCommanderStartingGame.add(phaseBoots);
        itemsForLegionCommanderStartingGame.add(aghanimsScepter);
        itemsForLegionCommanderStartingGame.add(desolator);
        List<Item> itemsForLegionCommanderMainStageGame = new ArrayList<>();
        itemsForLegionCommanderMainStageGame.add(blackKingBar);
        itemsForLegionCommanderMainStageGame.add(monkeyKingBar);
        itemsForLegionCommanderMainStageGame.add(overwhelmingBlink);
        List<Item> itemsForLegionCommanderSituationGame = new ArrayList<>();
        itemsForLegionCommanderSituationGame.add(kayaAndSange);
        itemsForLegionCommanderSituationGame.add(skullBasher);
        itemsForLegionCommanderSituationGame.add(windWaker);
        itemMap.put("startLegionCommander", itemsForLegionCommanderStart);
        itemMap.put("startGameLegionCommander", itemsForLegionCommanderStartingGame);
        itemMap.put("mainStageGameLegionCommander", itemsForLegionCommanderMainStageGame);
        itemMap.put("situationGameLegionCommander", itemsForLegionCommanderSituationGame);

        List<Item> itemsForJakiroStart = new ArrayList<>();
        itemsForJakiroStart.add(tango);
        itemsForJakiroStart.add(ironBranch);
        List<Item> itemsForJakiroStartingGame = new ArrayList<>();
        itemsForJakiroStartingGame.add(arcaneBoots);
        itemsForJakiroStartingGame.add(aetherLens);
        List<Item> itemsForJakiroMainStageGame = new ArrayList<>();
        itemsForJakiroMainStageGame.add(hurricanePike);
        itemsForJakiroMainStageGame.add(aghanimsScepter);
        itemsForJakiroMainStageGame.add(parasma);
        List<Item> itemsForJakiroSituationGame = new ArrayList<>();
        itemsForJakiroSituationGame.add(kayaAndSange);
        itemsForJakiroSituationGame.add(shivasGuard);
        itemsForJakiroSituationGame.add(windWaker);
        itemMap.put("startJakiro", itemsForJakiroStart);
        itemMap.put("startGameJakiro", itemsForJakiroStartingGame);
        itemMap.put("mainStageGameJakiro", itemsForJakiroMainStageGame);
        itemMap.put("situationGameJakiro", itemsForJakiroSituationGame);

        List<Item> itemsForAncientApparitionStart = new ArrayList<>();
        itemsForAncientApparitionStart.add(tango);
        itemsForAncientApparitionStart.add(ironBranch);
        List<Item> itemsForAncientApparitionStartingGame = new ArrayList<>();
        itemsForAncientApparitionStartingGame.add(arcaneBoots);
        itemsForAncientApparitionStartingGame.add(aetherLens);
        List<Item> itemsForAncientApparitionMainStageGame = new ArrayList<>();
        itemsForAncientApparitionMainStageGame.add(hurricanePike);
        itemsForAncientApparitionMainStageGame.add(aghanimsScepter);
        itemsForAncientApparitionMainStageGame.add(parasma);
        List<Item> itemsForAncientApparitionSituationGame = new ArrayList<>();
        itemsForAncientApparitionSituationGame.add(moonShard);
        itemsForAncientApparitionSituationGame.add(shivasGuard);
        itemsForAncientApparitionSituationGame.add(windWaker);
        itemMap.put("startAncientApparition", itemsForAncientApparitionStart);
        itemMap.put("startGameAncientApparition", itemsForAncientApparitionStartingGame);
        itemMap.put("mainStageGameAncientApparition", itemsForAncientApparitionMainStageGame);
        itemMap.put("situationGameAncientApparition", itemsForAncientApparitionSituationGame);

        List<Item> itemsForCrystalMaidenStart = new ArrayList<>();
        itemsForCrystalMaidenStart.add(tango);
        itemsForCrystalMaidenStart.add(ironBranch);
        List<Item> itemsForCrystalMaidenStartingGame = new ArrayList<>();
        itemsForCrystalMaidenStartingGame.add(arcaneBoots);
        itemsForCrystalMaidenStartingGame.add(aetherLens);
        List<Item> itemsForCrystalMaidenMainStageGame = new ArrayList<>();
        itemsForCrystalMaidenMainStageGame.add(hurricanePike);
        itemsForCrystalMaidenMainStageGame.add(aghanimsScepter);
        itemsForCrystalMaidenMainStageGame.add(parasma);
        List<Item> itemsForCrystalMaidenSituationGame = new ArrayList<>();
        itemsForCrystalMaidenSituationGame.add(scytheOfVyse);
        itemsForCrystalMaidenSituationGame.add(shivasGuard);
        itemsForCrystalMaidenSituationGame.add(windWaker);
        itemMap.put("startCrystalMaiden", itemsForCrystalMaidenStart);
        itemMap.put("startGameCrystalMaiden", itemsForCrystalMaidenStartingGame);
        itemMap.put("mainStageGameCrystalMaiden", itemsForCrystalMaidenMainStageGame);
        itemMap.put("situationGameCrystalMaiden", itemsForCrystalMaidenSituationGame);

        List<Item> itemsForWitchDoctorStart = new ArrayList<>();
        itemsForWitchDoctorStart.add(tango);
        itemsForWitchDoctorStart.add(ironBranch);
        List<Item> itemsForWitchDoctorStartingGame = new ArrayList<>();
        itemsForWitchDoctorStartingGame.add(arcaneBoots);
        itemsForWitchDoctorStartingGame.add(aetherLens);
        List<Item> itemsForWitchDoctorMainStageGame = new ArrayList<>();
        itemsForWitchDoctorMainStageGame.add(blackKingBar);
        itemsForWitchDoctorMainStageGame.add(aghanimsScepter);
        itemsForWitchDoctorMainStageGame.add(shivasGuard);
        List<Item> itemsForWitchDoctorSituationGame = new ArrayList<>();
        itemsForWitchDoctorSituationGame.add(scytheOfVyse);
        itemsForWitchDoctorSituationGame.add(overwhelmingBlink);
        itemsForWitchDoctorSituationGame.add(windWaker);
        itemMap.put("startWitchDoctor", itemsForWitchDoctorStart);
        itemMap.put("startGameWitchDoctor", itemsForWitchDoctorStartingGame);
        itemMap.put("mainStageGameWitchDoctor", itemsForWitchDoctorMainStageGame);
        itemMap.put("situationGameWitchDoctor", itemsForWitchDoctorSituationGame);
    }

    @Override
    public List<Item> findItemCharacter(String name) {
        if (itemMap == null || itemMap.isEmpty()) {
            System.out.println("Список пуст!");
            return null;
        }
        String heroName = character.getName();
        if (name.equalsIgnoreCase(heroName)) {
            for (Map.Entry<String, List<Item>> entry : itemMap.entrySet()) {
                String key = entry.getKey();
                if (key.contains(name)) {
                    List<Item> items = entry.getValue();
                    for (Item item : items) {
                        System.out.println(item);
                    }
                }
            }
        }
        return null;
    }
}
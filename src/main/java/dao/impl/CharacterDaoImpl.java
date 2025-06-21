package dao.impl;

import dao.CharacterDao;
import model.*;
import model.Character;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.stream.Collector;

public class CharacterDaoImpl implements CharacterDao {

    private List<Character> characterList = new ArrayList<>();
    private List<Character> seveCharcterList = new ArrayList<>();

    private int id = 0;

    {
        Position core = new Position(1, "Core");
        Position mid = new Position(2, "Mid");
        Position hardLine = new Position(3, "Hard Line");
        Position support = new Position(4, "Support");
        Position lineSupport = new Position(5, "Line Support");

        Aspect aspectMetodical = new Aspect("Methodical", true);
        Aspect aspectSweetRelease = new Aspect("Sweet Release", false);
        List<Aspect> aspectsListPhantomAssassin = new ArrayList<>();
        aspectsListPhantomAssassin.add(aspectMetodical);
        aspectsListPhantomAssassin.add(aspectSweetRelease);
        Сharacteristic сharacteristicPhantomAssassin = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoPhantomAssassin = new InformationCharacter("Физический урон", aspectsListPhantomAssassin, сharacteristicPhantomAssassin);
        Skill stiflingDagger = new Skill("Stifling Dagger");
        Skill phantomStrike = new Skill("Phantom Strike");
        Skill blur = new Skill("Blur");
        Skill coupDeGrace = new Skill("Coup de Grace");
        CharacterPumping firstLevelPhantomAssassin = new CharacterPumping(1, stiflingDagger);
        CharacterPumping secondLevelPhantomAssassin = new CharacterPumping(2, phantomStrike);
        CharacterPumping fifthLevelPhantomAssassin = new CharacterPumping(5, blur);
        CharacterPumping sixthLevelPhantomAssassin = new CharacterPumping(6, coupDeGrace);
        List<CharacterPumping> pumpingListPhantomAssassin = new ArrayList<>();
        pumpingListPhantomAssassin.add(firstLevelPhantomAssassin);
        pumpingListPhantomAssassin.add(secondLevelPhantomAssassin);
        pumpingListPhantomAssassin.add(fifthLevelPhantomAssassin);
        pumpingListPhantomAssassin.add(sixthLevelPhantomAssassin);

        Aspect aspectBladestorm = new Aspect("Bladestorm", true);
        Aspect aspectBladeform = new Aspect("Bladeform", false);
        List<Aspect> aspectListJuggernaut = new ArrayList<>();
        aspectListJuggernaut.add(aspectBladestorm);
        aspectListJuggernaut.add(aspectBladeform);
        Сharacteristic сharacteristicJuggernaut = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoJuggernaut = new InformationCharacter("Физический урон", aspectListJuggernaut, сharacteristicJuggernaut);
        Skill bladeFury = new Skill("Blade Fury");
        Skill healingWard = new Skill("Healing Ward");
        Skill bladeDance = new Skill("Blade Dance");
        Skill omnislash = new Skill("Omnislash");
        CharacterPumping firstLevelJuggernaut = new CharacterPumping(1, bladeFury);
        CharacterPumping secondLevelJuggernaut = new CharacterPumping(2, bladeDance);
        CharacterPumping fifthLevelJuggernaut = new CharacterPumping(5, healingWard);
        CharacterPumping sixthLevelJuggernaut = new CharacterPumping(6, omnislash);
        List<CharacterPumping> pumpingListJuggernautn = new ArrayList<>();
        pumpingListJuggernautn.add(firstLevelJuggernaut);
        pumpingListJuggernautn.add(secondLevelJuggernaut);
        pumpingListJuggernautn.add(fifthLevelJuggernaut);
        pumpingListJuggernautn.add(sixthLevelJuggernaut);

        Aspect aspectLivewire = new Aspect("Livewire", true);
        Aspect aspectDivineRampage = new Aspect("Divine Rampage", false);
        List<Aspect> aspectListZeus = new ArrayList<>();
        aspectListZeus.add(aspectLivewire);
        aspectListZeus.add(aspectDivineRampage);
        Сharacteristic сharacteristicZeus = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoZeus = new InformationCharacter("Магический урон", aspectListZeus, сharacteristicZeus);
        Skill arcLightning = new Skill("Arc Lightning");
        Skill lightningBolt = new Skill("Lightning Bolt");
        Skill heavenlyJump = new Skill("Heavenly Jump");
        Skill thundergodsWrath = new Skill("Thundergod's Wrath");
        CharacterPumping firstLevelZeus = new CharacterPumping(1, arcLightning);
        CharacterPumping secondLevelZeus = new CharacterPumping(2, lightningBolt);
        CharacterPumping fifthLevelZeus = new CharacterPumping(5, heavenlyJump);
        CharacterPumping sixthLevelZeus = new CharacterPumping(6, thundergodsWrath);
        List<CharacterPumping> pumpingListZeus = new ArrayList<>();
        pumpingListZeus.add(firstLevelZeus);
        pumpingListZeus.add(secondLevelZeus);
        pumpingListZeus.add(fifthLevelZeus);
        pumpingListZeus.add(sixthLevelZeus);

        Aspect aspectScholarOfKoryx = new Aspect("Scholar of Koryx", true);
        Aspect aspectMindOfTornarus = new Aspect("Mind of Tornarus", false);
        Aspect aspectAgentOfGallaron = new Aspect("Agent of Gallaron", false);
        List<Aspect> aspectListInvoker = new ArrayList<>();
        aspectListInvoker.add(aspectScholarOfKoryx);
        aspectListInvoker.add(aspectMindOfTornarus);
        aspectListInvoker.add(aspectAgentOfGallaron);
        Сharacteristic сharacteristicInvoker = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoInvoker = new InformationCharacter("Магический урон", aspectListInvoker, сharacteristicInvoker);
        Skill quas = new Skill("Quas");
        Skill wex = new Skill("Wex");
        Skill exort = new Skill("Exort");
        Skill invoke = new Skill("Invoke");
        CharacterPumping firstLevelInvoker = new CharacterPumping(1, quas);
        CharacterPumping secondLevelInvoker = new CharacterPumping(2, wex);
        CharacterPumping fifthLevelInvoker = new CharacterPumping(5, exort);
        CharacterPumping sixthLevelInvoker = new CharacterPumping(6, invoke);
        List<CharacterPumping> pumpingListInvoker = new ArrayList<>();
        pumpingListInvoker.add(firstLevelInvoker);
        pumpingListInvoker.add(secondLevelInvoker);
        pumpingListInvoker.add(fifthLevelInvoker);
        pumpingListInvoker.add(sixthLevelInvoker);

        Aspect aspectOneManArmy = new Aspect("One Man Army", true);
        Aspect aspectCallOut = new Aspect("Call Out", false);
        List<Aspect> aspectListAxe = new ArrayList<>();
        aspectListAxe.add(aspectOneManArmy);
        aspectListAxe.add(aspectCallOut);
        Сharacteristic сharacteristicAxe = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoAxe = new InformationCharacter("Физический урон", aspectListAxe, сharacteristicAxe);
        Skill berserkersCall = new Skill("Berserker's Call");
        Skill battleHunger = new Skill("Battle Hunger");
        Skill counterHelix = new Skill("Counter Helix");
        Skill cullingBlade = new Skill("Culling Blade");
        CharacterPumping firstLevelAxe = new CharacterPumping(1, berserkersCall);
        CharacterPumping secondLevelAxe = new CharacterPumping(2, battleHunger);
        CharacterPumping fifthLevelAxe = new CharacterPumping(5, counterHelix);
        CharacterPumping sixthLevelAxe = new CharacterPumping(6, cullingBlade);
        List<CharacterPumping> pumpingListAxe = new ArrayList<>();
        pumpingListAxe.add(firstLevelAxe);
        pumpingListAxe.add(secondLevelAxe);
        pumpingListAxe.add(fifthLevelAxe);
        pumpingListAxe.add(sixthLevelAxe);

        Aspect aspectStonehallPlate = new Aspect("Stonehall Plate", true);
        Aspect aspectSpoilsOfWar = new Aspect("Spoils of War", false);
        List<Aspect> aspectListLegionCommander = new ArrayList<>();
        aspectListLegionCommander.add(aspectStonehallPlate);
        aspectListLegionCommander.add(aspectSpoilsOfWar);
        Сharacteristic сharacteristicLegionCommander = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoLegionCommander = new InformationCharacter("Физический урон", aspectListLegionCommander, сharacteristicLegionCommander);
        Skill overwhelmingOdds = new Skill("Overwhelming Odds");
        Skill pressTheAttack = new Skill("Press The Attack");
        Skill momentOfCourage = new Skill("Moment of Courage");
        Skill duel = new Skill("Duel");
        CharacterPumping firstLevelLegionCommander = new CharacterPumping(1, overwhelmingOdds);
        CharacterPumping secondLevelLegionCommander = new CharacterPumping(2, pressTheAttack);
        CharacterPumping fifthLevelLegionCommander = new CharacterPumping(5, momentOfCourage);
        CharacterPumping sixthLevelLegionCommander = new CharacterPumping(6, duel);
        List<CharacterPumping> pumpingListLegionCommander = new ArrayList<>();
        pumpingListLegionCommander.add(firstLevelLegionCommander);
        pumpingListLegionCommander.add(secondLevelLegionCommander);
        pumpingListLegionCommander.add(fifthLevelLegionCommander);
        pumpingListLegionCommander.add(sixthLevelLegionCommander);

        Aspect aspectTwinTerror = new Aspect("Twin Terror", true);
        Aspect aspectIceBreaker = new Aspect("Ice Breaker", false);
        List<Aspect> aspectListJakiro = new ArrayList<>();
        aspectListJakiro.add(aspectTwinTerror);
        aspectListJakiro.add(aspectIceBreaker);
        Сharacteristic сharacteristicJakiro = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoJakiro = new InformationCharacter("Магический урон", aspectListJakiro, сharacteristicJakiro);
        Skill dualBreath = new Skill("Dual Breath");
        Skill icePath = new Skill("Ice Path");
        Skill liquidFire = new Skill("Liquid Fire");
        Skill macropyre = new Skill("Macropyre");
        CharacterPumping firstLevelJakiro = new CharacterPumping(1, dualBreath);
        CharacterPumping secondLevelJakiro = new CharacterPumping(2, icePath);
        CharacterPumping fifthLevelJakiro = new CharacterPumping(5, liquidFire);
        CharacterPumping sixthLevelJakiro = new CharacterPumping(6, macropyre);
        List<CharacterPumping> pumpingListJakiro = new ArrayList<>();
        pumpingListJakiro.add(firstLevelJakiro);
        pumpingListJakiro.add(secondLevelJakiro);
        pumpingListJakiro.add(fifthLevelJakiro);
        pumpingListJakiro.add(sixthLevelJakiro);

        Aspect aspectBoneChill = new Aspect("Bone Chill", true);
        Aspect aspectExposure = new Aspect("Exposure", false);
        List<Aspect> aspectListAncientApparition = new ArrayList<>();
        aspectListAncientApparition.add(aspectBoneChill);
        aspectListAncientApparition.add(aspectExposure);
        Сharacteristic сharacteristicAncientApparition = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoAncientApparition = new InformationCharacter("Магический урон", aspectListAncientApparition, сharacteristicAncientApparition);
        Skill coldFeet = new Skill("Cold Feet");
        Skill iceVortex = new Skill("Ice Vortex");
        Skill chillingTouch = new Skill("Chilling Touch");
        Skill iceBlast = new Skill("Ice Blast");
        CharacterPumping firstLevelAncientApparition = new CharacterPumping(1, coldFeet);
        CharacterPumping secondLevelAncientApparition = new CharacterPumping(2, iceVortex);
        CharacterPumping fifthLevelAncientApparition = new CharacterPumping(5, chillingTouch);
        CharacterPumping sixthLevelAncientApparition = new CharacterPumping(6, iceBlast);
        List<CharacterPumping> pumpingListAncientApparition = new ArrayList<>();
        pumpingListAncientApparition.add(firstLevelAncientApparition);
        pumpingListAncientApparition.add(secondLevelAncientApparition);
        pumpingListAncientApparition.add(fifthLevelAncientApparition);
        pumpingListAncientApparition.add(sixthLevelAncientApparition);

        Aspect aspectGlacialGuard = new Aspect("Glacial Guard", true);
        Aspect aspectArcaneOverflow = new Aspect("Arcane Overflow", false);
        List<Aspect> aspectListCrystalMaiden = new ArrayList<>();
        aspectListCrystalMaiden.add(aspectGlacialGuard);
        aspectListCrystalMaiden.add(aspectArcaneOverflow);
        Сharacteristic сharacteristicCrystalMaiden = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoCrystalMaiden = new InformationCharacter("Магический урон", aspectListCrystalMaiden, сharacteristicCrystalMaiden);
        Skill crystalNova = new Skill("Crystal Nova");
        Skill frostbite = new Skill("Frostbite");
        Skill arcaneAura = new Skill("Arcane Aura");
        Skill freezingField = new Skill("Freezing Field");
        CharacterPumping firstLevelCrystalMaiden = new CharacterPumping(1, crystalNova);
        CharacterPumping secondLevelCrystalMaiden = new CharacterPumping(2, frostbite);
        CharacterPumping fifthLevelCrystalMaiden = new CharacterPumping(5, arcaneAura);
        CharacterPumping sixthLevelCrystalMaiden = new CharacterPumping(6, freezingField);
        List<CharacterPumping> pumpingListCrystalMaiden = new ArrayList<>();
        pumpingListCrystalMaiden.add(firstLevelCrystalMaiden);
        pumpingListCrystalMaiden.add(secondLevelCrystalMaiden);
        pumpingListCrystalMaiden.add(fifthLevelCrystalMaiden);
        pumpingListCrystalMaiden.add(sixthLevelCrystalMaiden);

        Aspect aspectHeadhunter = new Aspect("Headhunter", true);
        Aspect aspectCleftDeath = new Aspect("Cleft Death", false);
        List<Aspect> aspectListWitchDoctor = new ArrayList<>();
        aspectListWitchDoctor.add(aspectHeadhunter);
        aspectListWitchDoctor.add(aspectCleftDeath);
        Сharacteristic сharacteristicWitchDoctor = new Сharacteristic(1, 2, 3, 4, 5);
        InformationCharacter infoWitchDoctor = new InformationCharacter("Магический урон", aspectListWitchDoctor, сharacteristicWitchDoctor);
        Skill paralyzingCask = new Skill("Paralyzing Cask");
        Skill voodooRestoration = new Skill("Voodoo Restoration");
        Skill maledict = new Skill("Maledict");
        Skill deathWard = new Skill("Death Ward");
        CharacterPumping firstLevelWitchDoctor = new CharacterPumping(1, paralyzingCask);
        CharacterPumping secondLevelWitchDoctor = new CharacterPumping(2, voodooRestoration);
        CharacterPumping fifthLevelWitchDoctor = new CharacterPumping(5, maledict);
        CharacterPumping sixthLevelWitchDoctor = new CharacterPumping(6, deathWard);
        List<CharacterPumping> pumpingListWitchDoctor = new ArrayList<>();
        pumpingListWitchDoctor.add(firstLevelWitchDoctor);
        pumpingListWitchDoctor.add(secondLevelWitchDoctor);
        pumpingListWitchDoctor.add(fifthLevelWitchDoctor);
        pumpingListWitchDoctor.add(sixthLevelWitchDoctor);

        //Добавить сюда список прокачки персонажа создать Лист и давать название листа в лист персонажа
        //или map

        characterList.add(new Character(1, "Phantom Assassin", core, infoPhantomAssassin, pumpingListPhantomAssassin));
        characterList.add(new Character(2, "Juggernaut", core, infoJuggernaut, pumpingListJuggernautn));
        characterList.add(new Character(3, "Zeus", mid, infoZeus, pumpingListZeus));
        characterList.add(new Character(4, "Invoker", mid, infoInvoker, pumpingListInvoker));
        characterList.add(new Character(5, "Axe", hardLine, infoAxe, pumpingListAxe));
        characterList.add(new Character(6, "Legion Commander", hardLine, infoLegionCommander, pumpingListLegionCommander));
        characterList.add(new Character(7, "Jakiro", support, infoJakiro, pumpingListJakiro));
        characterList.add(new Character(8, "Ancient Apparition", support, infoAncientApparition, pumpingListAncientApparition));
        characterList.add(new Character(9, "Crystal Maiden", lineSupport, infoCrystalMaiden, pumpingListCrystalMaiden));
        characterList.add(new Character(10, "Witch Doctor", lineSupport, infoWitchDoctor, pumpingListWitchDoctor));
    }

    @Override
    public List<Character> findAllCharacter() {
        return characterList;
    }

    @Override
    public Character findCharacterByName(String name) { //работает сомнительно
        for (Character character : characterList) {
            if (name.equals(character.getName())) {
                System.out.println("Имя найденного персонажа: ");
                System.out.println(character.getId() + "   " + name);
                return character;
            } else {
                System.out.println("Персонажа с таким именем не существует. Выберите другое имя");
            }
        }
        return null;
    }

    @Override
    public Character findCharacterById(int characterId) { //не работает
        for (Character character : characterList) {
            if (id == character.getId()) {
                System.out.println(character.getId() + " " + character.getName());
                break;
            } else {
                System.out.println("Персонажа с таким идентификатором не существует. Выберите другой");
            }
        }
        return null;
    }

    //2. Найти персонажей по айди позиции.
    @Override
    public List<Character> findCharactersByPositionId(int positionId) {
        List<Character> actualCharacters = new ArrayList<>();
        for (Character character : characterList) {
            Position position = character.getPositionChar();
            int idPosition = position.getId();
            if (character != null && !characterList.isEmpty() && idPosition == positionId) {
                actualCharacters.add(character);
            }
        }
        return actualCharacters;
    }

    @Override
    public List<Character> findCharactersByPosition(String name) {
        List<Character> actualCharacter = new ArrayList<>();
        for (Character character : characterList) {
            Position position = character.getPositionChar(); // Получаем позицию персонажа
            if (position != null && position.getName().equalsIgnoreCase(name)) { // Сравниваем имена
                actualCharacter.add(character); // Добавляем персонажа в результат
            }
        }
        return actualCharacter; // Возвращаем список найденных персонажей
    }

    //4. Показать список персонажей в сформированном драфте.
    @Override
    public List<Character> findCharacterByDraft() {
        return seveCharcterList;
    }

    //3. Cохранить персонажа в драфт.
    @Override
    public boolean saveCharacterDraft(int idCharacter) {
          if (seveCharcterList.size() >= 5) {
             System.out.println("Персонажа добавить нельзя, драфт переполнен");
             return false;
      }
          if (characterList != null && !characterList.isEmpty()) {
              for (Character character : characterList) {
                  int characterId = character.getId();
                  if (characterId == idCharacter) {
                      Position position = character.getPositionChar();
                      boolean isClosePosition = position.isClose();
                      InformationCharacter aspect = character.getInformationCharacter();
                      List<Aspect> aspects = aspect.getAspects();
                      List<Aspect> defaultAspect = new ArrayList<>();
                      for (Aspect aspectDefault : aspects) {
                          boolean isDefaultAspect = aspectDefault.isDefaultAspect();
                          if (isDefaultAspect) {
                              defaultAspect.add(aspectDefault);
                          }
                          if (!isClosePosition) {
                              defaultAspect.remove(aspectDefault);
                          }
                      }
                      if (!isClosePosition && !seveCharcterList.contains(character)) {
                          seveCharcterList.add(character);
                          position.setClose(true);
                          System.out.println("Добавлен персонаж: " + character);
                          System.out.println("Сохраненные персонажи: " + seveCharcterList);
                          return true;
                      } else {
                          System.out.println("Позиция уже занята для персонажа: " + character.getName());
                          return false;
                      }
                  }
              }
          }
        System.out.println("Персонаж с ID" + idCharacter + " не найден.");
        return false;
    }

    @Override
    public Character findCharacterInfo(int idCharacter) {
        if (seveCharcterList != null && seveCharcterList.isEmpty()) {
            System.out.println("Драфт персонажей пуст");
            return null;
        }
        for (Character character : seveCharcterList) {
            if (character != null && character.getId() == idCharacter) {
                if (characterList != null && !characterList.isEmpty()) {
                    for (Character characterCharacteristic : characterList) {
                        if (characterCharacteristic != null && characterCharacteristic.getId() == idCharacter) {
                            InformationCharacter informationCharacter = character.getInformationCharacter();
                            Сharacteristic сharacteristicCharacter = informationCharacter.getСharacteristics();
                            System.out.println(сharacteristicCharacter);
                            return character;
                        }
                    }
                    System.out.println("Данного персонажа нет в драфте, получении информации не возможно!");
                    return null;
                }
            }
        }
        System.out.println("Персонаж с таким ID не найден");
        return null;
    }

    @Override
    public Character findCharacterAspectSwap(int idCharacter, String nameAspect) { //как проверить?
        if (seveCharcterList != null && seveCharcterList.isEmpty()) {
            System.out.println("Драфт пустой");
            return null;
        }
        if (characterList != null && characterList.isEmpty()) {
            System.out.println("Список пересонажей пуст");
            return null;
        }
        Character draftCharacter = null;
        for (Character character : seveCharcterList) {
            int characterId = character.getId();
            if (character != null && characterId == idCharacter) {
                draftCharacter = character;
                return draftCharacter;
            }
        }
        if (draftCharacter == null) {
            System.out.println("Персонаж с таким ID не найден");
            return null;
        }
        InformationCharacter infoCharacterDraft = draftCharacter.getInformationCharacter();
        List<Aspect> aspectsDraft = infoCharacterDraft.getAspects();
        Aspect aspectInDraft;
            for (Aspect aspectDraft : aspectsDraft) {
                aspectInDraft = aspectDraft;
                if (aspectDraft != null && aspectDraft.getName().equalsIgnoreCase(nameAspect)) {
                    System.out.println("Аспекты совпадают, замена не требуется");
                    break;
                }
                for (Character character : characterList) {
                    if (character != null && character.getId() == idCharacter) {
                        InformationCharacter informationCharacter = character.getInformationCharacter();
                        List<Aspect> aspectListCharacter = informationCharacter.getAspects();
                        Aspect aspectCharacter;
                        for (int i = 0; i < aspectListCharacter.size(); i++) {
                            aspectCharacter = aspectListCharacter.get(i);
                            if (aspectCharacter != null && aspectCharacter.getName().equalsIgnoreCase(nameAspect)) {
                               aspectInDraft.setName(nameAspect);
                                System.out.println("Аспект успешно заменен на: " + nameAspect);
                                return draftCharacter;
                        }
                            if (!nameAspect.contains(aspectCharacter.getName())) {
                                System.out.println("Подходящий аспект для замены найден");
                            }
                    }
                }
            }
        }
        return null;
    }
    //переделать метод замены аспекта, принимаем 2 аргумента, id персонажа и id аспекта, и если аспекты равны то игнорируем замену, но
//если разные то меняем на аспект который передали в аргумента (мб в 426 строку добавить если не содержит то нет аспектов для замены)

    @Override
    public List<CharacterPumping> findInfoCharacterSkills(String name) {
        if (characterList != null && characterList.isEmpty()) {
            System.out.println("Список персонажей пуст");
            return new ArrayList<>();
        }
        for (Character character : characterList) {
            String characterName = character.getName();
            if (characterName.equalsIgnoreCase(name)) {
               List<CharacterPumping> pumpingHero = character.getPumpingList();
                System.out.println(characterName);
               return pumpingHero;
            }
        }
        return new ArrayList<>();
    }
}

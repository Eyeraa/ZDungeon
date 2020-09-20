package MainGame.controller;

public class Level {
/** object of level class is to keep track of remaining loot, and remaining monsters
 * as well as adjust monster difficulty, as well is item rarity TODO
 */
	String levelName = "PlaceHolder";
	
	
	double lootValue;
	double  MonsterDifficulty;
	
	String[] monsterNameList = 		{"bob","mike","arnold","raymond","jake","anthony"};
	String[] monsterAttributeList = {"slime","snake","bull","tiger","demon","dragon"};
	
	String[] weapongNameList = 		{"Mace","knife","halberd","sickle","WarHammer","Cutlass"};
	String[] weaponAttributeList =  {"wooden","stone","copper","steel","gold","platinum"};
	
	int remainingLoot;
	int remainingMonsters;
	public Level()
	{
		lootValue = 0;
		MonsterDifficulty = 1;
		
		remainingLoot = 5;
		remainingMonsters = 8;
	}
	
	public void MonsterDeath()
	{
		remainingMonsters--;
		MonsterDifficulty++;
	}
	
	public void LootRetreived()
	{
		remainingLoot--;
		lootValue++;
	}
	
	public void SummonMonster()
	{
		
	}
	
	public void GrantLoot()
	{
		
	}
	
	
}

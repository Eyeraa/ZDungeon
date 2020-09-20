package MainGame.controller;

import MainGame.ui.Consoleui;
import MainGame.Game;
public class Player {
	private Game currentGame;
	private String name;
	private int level;
	private int health = 100;
	private Weapon weapon;
	
	public Player(Consoleui input, Game game) {
		this.currentGame = game;
		Consoleui ui = input;
		//player initialization run from console!
		this.name = ui.read();
		
		
	}
	
	public int Attack(Weapon weapon, Monster monster)
	{
		//attack monster
		//subtract life from monster
		return 0;
	}
	
	public void Heal()
	{
		//rest text
		health += 10;
	}
	
	public void Death()
	{
		//show score after death! / other stats
		currentGame.gameOver(); //game loop ended
	}
	
	
	
	
	

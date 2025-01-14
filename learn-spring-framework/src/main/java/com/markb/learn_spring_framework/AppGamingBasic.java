package com.markb.learn_spring_framework;

import com.markb.learn_spring_framework.game.GameRunner;
import com.markb.learn_spring_framework.game.MarioGame;
import com.markb.learn_spring_framework.game.PacmanGame;
import com.markb.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		var game = new PacmanGame(); // Object creation
		
		var gameRunner = new GameRunner(game);
			// Object Creation + wiring of dependencies
			// Game is dependency of gameRunner
		
		gameRunner.run();
	}

}

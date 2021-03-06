package trollface.calc.core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState {
	Image background, buttonCalcM, buttonInfoM, buttonSetM, buttonExitM,
			buttonExitMglow, buttonCalcMglow, buttonInfoMglow, buttonSetMglow,
			backgroundM;
	Font font;
	TextField textField;
	MouseListener listener;
	Color color;
	Base game;
	boolean glowactive = false, glowactive1 = false, glowactive2 = false,
			glowactive3 = false;

	public Menu(Base game) {
		this.game = game;
	}

	public void init(GameContainer c, StateBasedGame game)
			throws SlickException {

		background = new Image("src/trollface/calc/images/chemBackground.png");
		buttonCalcM = new Image("src/trollface/calc/images/buttonCalcM.png");
		buttonInfoM = new Image("src/trollface/calc/images/buttonInfoM.png");
		buttonSetM = new Image("src/trollface/calc/images/buttonCredM.png");
		buttonExitM = new Image("src/trollface/calc/images/buttonExitM.png");
		buttonExitMglow = new Image(
				"src/trollface/calc/images/buttonExitMglow.png");
		buttonCalcMglow = new Image(
				"src/trollface/calc/images/buttonCalcMglow.png");
		buttonInfoMglow = new Image(
				"src/trollface/calc/images/buttonInfoMglow.png");
		buttonSetMglow = new Image(
				"src/trollface/calc/images/buttonCredMglow.png");
		backgroundM = new Image("src/trollface/calc/images/chemBackgroundM.png");
		// font = new UnicodeFont(new java.awt.Font(java.awt.Font.SANS_SERIF,
		// java.awt.Font.ITALIC, 26));
		// textField = new TextField(c, c.getDefaultFont(), 200, 50, x, y,
		// new ComponentListener() {
		//
		// @Override
		// public void componentActivated(AbstractComponent source) {
		// TextField field = (TextField) source;
		// String text = field.getText();
		// }
	}// 201 153

	public void update(GameContainer c, StateBasedGame game, int delta)
			throws SlickException {
		c.getInput();

		int posX = Mouse.getX();
		int posY = Mouse.getY();

		if (Base.printRoutineDebug) {

			Base.log(posX + "   " + posY);
		}

		if (Base.renderingSmall) {
			if ((posX > 220 && posY > 90) && (posX < 400 && posY < 135)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
			if ((posX > 220 && posY < 331) && (posX < 400 && posY > 283)) {
				glowactive1 = true;
			} else {
				glowactive1 = false;
			}
			if ((posX > 220 && posY < 265) && (posX < 400 && posY > 220)) {
				glowactive2 = true;
			} else {
				glowactive2 = false;
			}
			if ((posX > 220 && posY < 201) && (posX < 400 && posY > 153)) {
				glowactive3 = true;
			} else {
				glowactive3 = false;
			}
			if (Base.printRoutineDebug) {
				Base.log(glowactive + "");
			}
		} else {
			if ((posX > 1000 && posY < 170) && (posX < 1060 && posY > 137)) {
				glowactive = true;

			} else {
				glowactive = false;
			}
			if ((posX > 211 && posY < 540) && (posX < 390 && posY > 350)) {
				glowactive1 = true;
			} else {
				glowactive1 = false;
			}
			if ((posX > 511 && posY < 540) && (posX < 690 && posY > 350)) {
				glowactive2 = true;
			} else {
				glowactive2 = false;
			}
			if ((posX > 811 && posY < 540) && (posX < 990 && posY > 350)) {
				glowactive3 = true;
			} else {
				glowactive3 = false;
			}
			if (Base.printRoutineDebug) {
				Base.log("" + glowactive);
			}
		}
	}

	// 331, 283 265 220
	public void render(GameContainer c, StateBasedGame game, Graphics g)
			throws SlickException {

		if (Base.renderingSmall) {
			background.draw();
			buttonCalcM.draw(220, 140);
			buttonInfoM.draw(220, 205);
			buttonSetM.draw(220, 270);
			buttonExitM.draw(220, 335);

			if (glowactive == true) {
				buttonExitMglow.draw(220, 335);
			}
			if (glowactive1 == true) {
				buttonCalcMglow.draw(220, 140);
			}
			if (glowactive2 == true) {
				buttonInfoMglow.draw(220, 205);
			}
			if (glowactive3 == true) {
				buttonSetMglow.draw(220, 270);
			}
		} else {

			backgroundM.draw();
			buttonCalcM.draw(211, 160);
			buttonInfoM.draw(511, 160);
			buttonSetM.draw(811, 160);
			buttonExitM.draw(940, 460);

			if (glowactive == true) {
				buttonExitMglow.draw(940, 460);
			}
			if (glowactive1 == true) {
				buttonCalcMglow.draw(211, 160);
			}
			if (glowactive2 == true) {
				buttonInfoMglow.draw(511, 160);
			}
			if (glowactive3 == true) {
				buttonSetMglow.draw(811, 160);
			}
		}

	}

	public int GetID() {
		return 0;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void mouseClicked(int button, int x, int y, int clickCount) {

		if (glowactive == true) {
			System.out.print("Exiting. Bye.");
			System.exit(0);
		}
		if (glowactive1 == true) {
			game.enterState(4);
		}
		if (glowactive2 == true) {
			game.enterState(2);
		}
		if (glowactive3 == true) {
			game.enterState(3);
		}

	}
}

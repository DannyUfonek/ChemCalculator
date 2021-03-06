package trollface.calc.equations;

import trollface.calc.core.Base;

public class Molarity extends Equation {

	public Molarity() {

		
		friendlyName = "Molarity";


		modes = new Properties[][] {
				{ Properties.con, Properties.mol, Properties.vol },
				{ Properties.mol, Properties.vol, Properties.con },
				{ Properties.vol, Properties.mol, Properties.con } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[0] + " mol dm^-3";
		case 1:
			return arguments[0] * arguments[1] + " mol";
		case 2:
			return arguments[0] * arguments[1] + " dm^-3";
		default:
			Base.log(String.format("ERROR: WRONG MODE SPECIFIED: %d\n", mode));
			return "ERROR. LOL";
		}

	}
}
package trollface.calc.equations;

public class Efficiency extends Equation {

	public Efficiency() {
		friendlyName = "Efficiency (ex.)";

		modes = new Properties[][] {
				{ Properties.Efficiency, Properties.Input, Properties.Output },
				{ Properties.Output, Properties.Input, Properties.Efficiency },
				{ Properties.Input, Properties.Output, Properties.Efficiency } };

	}

	@Override
	public String calculate(int mode, double... arguments) {
		switch (mode) {
		case 0:
			return arguments[1] / arguments[0] * 100 + "%";
		case 1:
			return arguments[0] * arguments[1] / 100f + " W";
		case 2:
			return arguments[0] * (1 / (arguments[1] / 100)) + " W";
		default:
			System.out.printf("ERROR: WRONG MODE SPECIFIED: %d\n", mode);
			return "ERROR. LOL";
		}

	}
}
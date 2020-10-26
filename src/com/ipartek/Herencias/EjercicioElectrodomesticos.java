package com.ipartek.Herencias;

import com.ipartek.pojo.Electrodomestico;
import com.ipartek.pojo.televisionPlana;

public class EjercicioElectrodomesticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico[] televisionesPlanas;
		televisionesPlanas = new Electrodomestico[5];

		televisionPlana tele1 = new televisionPlana("tele1", 200, 5);
		televisionPlana tele2 = new televisionPlana("tele2", 400, 7);
		televisionPlana tele3 = new televisionPlana("tele3", 500, 8);
		televisionPlana tele4 = new televisionPlana("tele4", 100, 3);
		televisionPlana tele5 = new televisionPlana("tele5", 300, 4);

		televisionesPlanas[0] = tele1;
		televisionesPlanas[1] = tele2;
		televisionesPlanas[2] = tele3;
		televisionesPlanas[3] = tele4;
		televisionesPlanas[4] = tele5;

		for (Electrodomestico electrodomestico : televisionesPlanas) {
			if (electrodomestico instanceof televisionPlana) {
				((televisionPlana) electrodomestico).getTipoPantalla();
			}
		}
	}

}

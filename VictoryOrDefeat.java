package com.original_game.janken;

public class VictoryOrDefeat {
	private static int point = 0;
	public static final void decisionVictoryOrDefeat(int computerHand,int playerHand) {
		int playerHandTemp = playerHand;
		playerHandTemp++;

		if (playerHand == computerHand) {
			Panel.headerLabel.setText("aiko！（" + point + "）");
		}
		else if ((playerHand == 3 && computerHand == 1)||(playerHandTemp == computerHand)) {
			point+=1;
			Panel.headerLabel.setText("お前の勝ち！（" + point + "）");
		}
		else {
			Panel.headerLabel.setText("お前の負け！（" + point + "）");
			point=0;
		}
		if (point==10) {
			Panel.headerLabel.setText("10連勝！！ リセット！");
			point=0;
		}
	}
}

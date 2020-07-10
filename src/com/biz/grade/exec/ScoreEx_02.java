package com.biz.grade.exec;

import com.biz.grade.service.ScoreServiceV2;

public class ScoreEx_02 {

	public static void main(String[] args) {

		ScoreServiceV2 sService = new ScoreServiceV2();
		while (true) {

			if (!sService.inputscore()) {
				break;
			}

		}
		sService.scorelist();
	}
}

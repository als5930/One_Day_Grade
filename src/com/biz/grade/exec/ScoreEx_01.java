package com.biz.grade.exec;

import com.biz.grade.service.ScoreServiceV1;

public class ScoreEx_01 {
	public static void main(String[] args) {
		ScoreServiceV1 sService = new ScoreServiceV1();

		while (true) {

			if (!sService.inputscore()) {
				break;
			}

		}

		sService.scorelist();

	}

}

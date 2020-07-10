package com.biz.grade.service;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class ScoreServiceV2 extends ScoreServiceV1 {
	protected String scoreFile;
	protected PrintStream output;

	public ScoreServiceV2() {

		String scoreFile = "src/com/biz/grade/exec/data/score.txt";
		System.out.println("콘솔에 데이터 출력하기");

		try {
			output = new PrintStream(scoreFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(scoreFile + "파일을 만들수 없음");
			return;
		}

	}

	@Override
	public void scorelist() {

		for (ScoreVO sVO : scoreList) {
			

			output.print(sVO.getNum() + ":");
			output.print(sVO.getKor() + ":");
			output.print(sVO.getEng() + ":");
			output.print(sVO.getMath() + ":");
			output.print(sVO.getMusic() + ":");
			output.print(sVO.getSum() + ":");
			output.print(sVO.getAvg() + "\n");
			
			
		}
		
		
	}

}

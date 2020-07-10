package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class ScoreServiceV1 implements ScoreService {
	List<ScoreVO> scoreList;
	Scanner scan = new Scanner(System.in);
	ScoreVO scoreVO = new ScoreVO();

	public ScoreServiceV1() {
		scoreList = new ArrayList<ScoreVO>();

	}

	@Override
	public boolean inputscore() {

		System.out.println("학번(END:입력중단)");
		String strnum = scan.nextLine();
		if (strnum.equals("END")) {

			return false;
		}
		scoreVO.setNum(strnum);

		System.out.println("국어");
		String strkor = scan.nextLine();
		int intKor = 0;
		try {
			intKor = Integer.valueOf(strkor);
		} catch (Exception e) {
			System.out.println("국어점수는 숫자만가능");
		}
		scoreVO.setKor(intKor);
		
		System.out.println("영어");
		String streng = scan.nextLine();
		int intEng = 0;
		try {
			intEng = Integer.valueOf(streng);
		} catch (Exception e) {
			System.out.println("영어점수는 숫자만가능");
		}
		scoreVO.setEng(intEng);

		System.out.println("수학");
		String strmath = scan.nextLine();

		int intMath = 0;
		try {

			intMath = Integer.valueOf(strmath);
		} catch (Exception e) {

			System.out.println("수학점수는 숫자만가능");

		}
		scoreVO.setMath(intMath);

		System.out.println("음악");
		String strmusic = scan.nextLine();

		int intMusic = 0;

		try {

			intMusic = Integer.valueOf(strmusic);
		} catch (Exception e) {

			System.out.println("음악점수는 숫자만가능");

		}
		scoreVO.setMath(intMusic);

		int sum = intKor + intEng + intMath+intMusic;
		float avg = (float) sum / 4;

		scoreList.add(scoreVO);
		return true;
	}
	

	@Override
	public void calcSum() {
		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			ScoreVO scoreVO = scoreList.get(i);
			int sum = scoreVO.getKor();
			sum += scoreVO.getEng();
			sum += scoreVO.getMath();
			sum += scoreVO.getMusic();
			scoreVO.setSum(sum);
		}

	}

	@Override
	public void calcAvg() {

		int size = scoreList.size();
		for (int i = 0; i < size; i++) {
			ScoreVO sVO = scoreList.get(i);
			int avg = sVO.getKor();
			avg /= sVO.getEng();
			avg /= sVO.getMath();
			avg /= sVO.getMusic();
			sVO.getAvg();
		}
	}

	@Override
	public void scorelist() {
		System.out.println("=====================================");
		System.out.println("학생 일람표");
		System.out.println("======================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균 ");
		System.out.println("=======================================");

		System.out.println(scoreVO.getKor() + "\t");
		System.out.println(scoreVO.getEng() + "\t");
		System.out.println(scoreVO.getMath() + "\t");
		System.out.println(scoreVO.getMusic()+ "\t");
		System.out.println(scoreVO.getSum() + "\t");
		System.out.println(scoreVO.getAvg() + "\t");

	}

}

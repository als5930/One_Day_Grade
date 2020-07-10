package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class GradeServiceV1 implements GradeService {
	protected List<StudentVO> studentList;
	protected Scanner scan = new Scanner(System.in);
	protected StudentVO studentVO = new StudentVO();

	public GradeServiceV1() {
		studentList = new ArrayList<StudentVO>();
	}

	@Override
	public boolean inputstudent() {
		// TODO Auto-generated method stub

		System.out.println("학번(END:입력중단)");
		String strnum = scan.nextLine();
		if (strnum.equals("END")) {

			return false;
		}
		studentVO.setNum(strnum);

		System.out.println("이름");
		String strname = scan.nextLine();
		studentVO.setName(strname);

		System.out.println("학과");
		String strdept = scan.nextLine();
		studentVO.setDapt(strdept);

		System.out.println("학년");
		String strgrade = scan.nextLine();
		int intGrade = 0;
		try {
			intGrade = Integer.valueOf(strgrade);
		} catch (Exception e) {
			System.out.println("학년은 숫자만 가능");
			System.out.println(studentVO.getGrade() + "학생정보를 다시입력해주세요");
		}
		studentVO.setGrade(intGrade);
		System.out.println("전화번호");
		String strtel = scan.nextLine();
		int intTel = 0;
		try {
			intTel = Integer.valueOf(strtel);
		} catch (Exception e) {

		}
		studentVO.setTel(strtel);
		System.out.println("V1값 : ");
		System.out.println(strtel);
		studentList.add(studentVO);
		return true;

	}

	public void studentlist() {
		System.out.println("=====================================");
		System.out.println("학생 일람표");
		System.out.println("======================================");
		System.out.println("학번\t이름\t학과\t학년\t전화번호 ");
		System.out.println("=======================================");

		System.out.print(studentVO.getNum() + "\t");
		System.out.print(studentVO.getName() + "\t");
		System.out.print(studentVO.getDapt() + "\t");
		System.out.print(studentVO.getGrade() + "\t");
		System.out.print(studentVO.getTel() + "\t");

	}

}

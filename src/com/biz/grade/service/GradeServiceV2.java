package com.biz.grade.service;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.biz.grade.vo.StudentVO;

public class GradeServiceV2 extends GradeServiceV1 {
	protected String studentFile;
	protected PrintStream output;

	public GradeServiceV2() {

		studentFile = "src/com/biz/grade/exec/data/student.txt";
		System.out.println("콘솔에 데이터 출력하기");
	
		try {
			output = new PrintStream(studentFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println(studentFile + "파일을 만들수 없음");
				return ;
		}
	}

	@Override
	public void studentlist() {
		//output.println("=====================================");
		//output.println("학생 일람표");
		//output.println("======================================");
		//output.println("학번\t이름\t학년\t전화번호 ");
		//output.println("----------------------------------------");
		System.out.println("파일 저장중");
		for (StudentVO gVO : studentList) {
			System.out.print(gVO.getNum() + ":");
			System.out.print(gVO.getName() + ":");
			System.out.print(gVO.getDapt() + ":");
			System.out.print(gVO.getGrade() + ":");
			System.out.print(gVO.getTel() + "\n");
			
			output.print(gVO.getNum() + ":");
			output.print(gVO.getName() + ":");
			output.print(gVO.getDapt() + ":");
			output.print(gVO.getGrade() + ":");
			output.print(gVO.getTel() + "\n");
		}
		
		output.close();
		System.out.println("파일 저장 완료");
	}

}

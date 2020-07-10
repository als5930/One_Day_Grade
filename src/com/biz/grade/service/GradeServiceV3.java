package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.grade.vo.StudentVO;

public class GradeServiceV3 extends GradeServiceV2{
	
	public GradeServiceV3() {
		output =System.out;
	}

	
	@Override
	public boolean inputstudent() {
		String studentFile = "bin/com/biz/student/exec/Student.txt";

		FileReader fileReader = null;

		BufferedReader buffer = null;
		try {

			fileReader = new FileReader(studentFile);

			buffer = new BufferedReader(fileReader);

			String reader = "";

			while (true) {

				reader = buffer.readLine();
				if (reader == null) {
					break;
				}
				//System.out.println(reader);
				String[] students = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setTel(students[3]);
				studentList.add(sVO);
			}
			buffer.close();
			fileReader.close();

		}

		catch (FileNotFoundException e) {

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}
	

}

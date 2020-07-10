package com.biz.grade.exec;

import com.biz.grade.service.GradeServiceV2;

public class GradeStudentEx_02 {
public static void main(String[] args) {
	
	GradeServiceV2 gStudent = new GradeServiceV2();
	
	while (true) {

		if (!gStudent.inputstudent()) {
			break;
		}

	}
	gStudent.studentlist();
	
	
}
	
	
}

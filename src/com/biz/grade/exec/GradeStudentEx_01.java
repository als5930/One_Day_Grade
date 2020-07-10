package com.biz.grade.exec;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceV1;

public class GradeStudentEx_01 {
	public static void main(String[] args) {

		GradeService Gservice = new GradeServiceV1();
		while (true) {

			if (!Gservice.inputstudent()) {
				break;
			}

		}
		Gservice.studentlist();
	}
}

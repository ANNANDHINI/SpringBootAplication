package com.jetblueapp6.services;

import java.util.List;

import com.jetblueapp6.entity.Students;

public interface StudentsService {
	public void savestud(Students stud);

	public List<Students> listallData(Students stud);

	public Students updateonestudent(long id);

	public void updateonedata(Students stud);

	public void deleteonepass(long id);

	
}

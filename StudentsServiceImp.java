package com.jetblueapp6.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jetblueapp6.entity.Students;
import com.jetblueapp6.repository.StudentsRepository;

@Service
public class StudentsServiceImp implements StudentsService {
	
	@Autowired
	private StudentsRepository stdrepo;

	@Override
	public void savestud(Students stud) {
		stdrepo.save(stud);
		
	}

	@Override
	public List<Students> listallData(Students stud) {
		List<Students> student = stdrepo.findAll();
		return student;
	}

	@Override
	public Students updateonestudent(long id) {
		Optional<Students> findById = stdrepo.findById(id);
		Students student=findById.get();
		return student;
		
		
	}

	@Override
	public void updateonedata(Students stud) {
		stdrepo.save(stud);
		
	}

	@Override
	public void deleteonepass(long id) {
		stdrepo.deleteById(id);
		
	}

	
	

}

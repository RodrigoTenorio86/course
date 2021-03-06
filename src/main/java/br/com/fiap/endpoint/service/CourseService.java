package br.com.fiap.endpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.fiap.model.Course;
import br.com.fiap.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
/**
 * 
 * @author rtenorio
 *
 */

@Service
@Slf4j
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CourseService {
	private final CourseRepository courseRepository;
	
	public Iterable<Course> list(Pageable pageable){
		log.info("Listing all course");
		
		return courseRepository.findAll(pageable);
	}

}

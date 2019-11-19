package br.com.fiap.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.Course;
@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course	, Long>{

}

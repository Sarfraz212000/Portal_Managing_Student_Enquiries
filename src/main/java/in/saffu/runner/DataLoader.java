package in.saffu.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.saffu.entity.CourseEntity;
import in.saffu.entity.EnqStatusEntity;
import in.saffu.repository.CourseRepo;
import in.saffu.repository.EnqStatusRepo;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CourseRepo courseRepo;

	@Autowired
	private EnqStatusRepo statusRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		courseRepo.deleteAll();

		CourseEntity c1 = new CourseEntity();
		c1.setCoursename("JAVA");

		CourseEntity c2 = new CourseEntity();
		c2.setCoursename("PYTHON");

		CourseEntity c3 = new CourseEntity();
		c3.setCoursename("C++");
		courseRepo.saveAll(Arrays.asList(c1,c2,c3));

		statusRepo.deleteAll();
		EnqStatusEntity e1 = new EnqStatusEntity();
		e1.setStatusName("NEW");

		EnqStatusEntity e2 = new EnqStatusEntity();
		e2.setStatusName("ENROLLED");

		EnqStatusEntity e3 = new EnqStatusEntity();
		e3.setStatusName("LOST");
		statusRepo.saveAll(Arrays.asList(e1, e2, e3));

	}

}

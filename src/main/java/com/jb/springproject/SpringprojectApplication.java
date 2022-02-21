package com.jb.springproject;


import com.jb.springproject.data.Student;
import com.jb.springproject.repository.StudentRepository;
import com.jb.springproject.util.Art;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication 	//componentScan("com.jb.*") , configurationScan
@EnableAspectJAutoProxy	//aop - Aspect Oriented Programming.....
public class SpringprojectApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringprojectApplication.class, args);
		//ApplicationContext ctx =
//		MySingleTon mySingleTon1 = ctx.getBean(MySingleTon.class);
//		MySingleTon mySingleTon2 = ctx.getBean(MySingleTon.class);
//
//		MyProtoType myProtoType1 = ctx.getBean(MyProtoType.class);
//		MyProtoType myProtoType2 = ctx.getBean(MyProtoType.class);
//
//		System.out.println();
//		System.out.println(mySingleTon1);
//		System.out.println(mySingleTon2);
//
//		System.out.println();
//		System.out.println(myProtoType1);
//		System.out.println(myProtoType2);


//		Student student1=ctx.getBean(Student.class);
//		Student student2=ctx.getBean(Student.class);
//		Student student3=ctx.getBean(Student.class);
//
//		student1.setName("Golan");
//		student1.setLName("Klien");
//		student1.setAdd("Ashkelon ilit");
//		student1.setId(1);
//		//student1.setGrade(80);
//
//		student2.setName("Tal");
//		student2.setLName("Lo mitaask");
//		student2.setAdd("Ramat Gan");
//		student2.setId(2);
//		//student2.setGrade(100);
//
//		System.out.println(student1);
//		System.out.println(student2);

		System.out.println();
//		Teachable teacher1 = ctx.getBean(Zeev.class);
//		teacher1.info();

//		Teachable teacher2 = ctx.getBean(Golan.class);
//		teacher2.info();

//		Teachable teacher3 = ctx.getBean(Teachable.class);
//		teacher3.info();
//
//		Teachable teacher4 = ctx.getBean("golan",Teachable.class);
//		teacher4.info();

//		Phone phone = ctx.getBean(Phone.class);
//		System.out.println(phone);


//		Cat cat = ctx.getBean(Cat.class);
//		System.out.println(cat);
//
//		cat.setChip(new Chip("This is a fake chip"));
//
//		System.out.println(cat);
//
//
//		Cat cat2 = ctx.getBean(Cat.class);
//		System.out.println(cat2);
//
//		Student student = Student.builder()
//				.id(5)
//				.grade(100)
//				.name("Oren")
//				.lName("Levi")
//				.add("TelAviv")
//				.build();
//
//		Student student2 = Student.builder()
//				.id(10)
//				.name("Tal")
//				.build();
//
//
//		System.out.println(student);
//		System.out.println(student2);



	}

}

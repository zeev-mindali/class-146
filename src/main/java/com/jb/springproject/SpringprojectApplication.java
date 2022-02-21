package com.jb.springproject;

import com.jb.springproject.beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication //componentScan("com.jb.*") , configurationScan
public class SpringprojectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringprojectApplication.class, args);
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

		Cat cat = ctx.getBean(Cat.class);
		System.out.println(cat);

		Phone phone = ctx.getBean(Phone.class);
		System.out.println(phone);
	}

}

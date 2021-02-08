package com.mansi.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mansi.test.entities.UserType;
import com.mansi.test.repository.UserTypeRepository;

@SpringBootApplication
public class TyProjectApplication {

	public static void main(String[] args) {
		//application cotext
		ApplicationContext context = SpringApplication.run(TyProjectApplication.class, args);
		//get bean of user repository (help to save and other functionality for database)
		UserTypeRepository userrepo= context.getBean(UserTypeRepository.class);
		
//		//below all for just my satisfaction we can do this manually by going into mysql table.
//		//create object of usertype()
//		//set admin in 1st object
//		UserType u1Type = new UserType();
//		u1Type.setUserType("Admin");
//
//		//set teacher in 2nd object
//		UserType u2Type = new UserType();
//		u2Type.setUserType("Teacher");
//		
//		//set parent in 3rd object
//		UserType u3Type = new UserType();
//		u3Type.setUserType("Parent");
//		
//		//save all above three objects
//		List<UserType> list = List.of(u1Type, u2Type, u3Type);
//		Iterable<UserType> saveAll = userrepo.saveAll(list);
//		
//		//print all above three objects.
//		saveAll.forEach(obj->
//		{System.out.println(obj);}
//		);
//		
	}

}

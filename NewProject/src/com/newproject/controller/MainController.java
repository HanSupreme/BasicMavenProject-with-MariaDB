package com.newproject.controller;

import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.newproject.connection.*;

/**
 * @author Seyhan A. Cileli
 * @Date December.12.2019
 * @version 1.0
 * 
 * @Description
 * 
 * This is the MAIN Controller for our Application.
 * It will include the handlers for the Main Navigation
 */

@Controller
public class MainController {
	
	static DbTest db = new DbTest();

	@SuppressWarnings("static-access")
	@RequestMapping("/") // "" ==> [means] Home Page of the Application 
	public String homePage() throws SQLException, ClassNotFoundException {
		db.mariahDbConnection();
		String pageName = "index";
		return pageName;
	}

	@RequestMapping("/about")
	public String aboutPage() {
		String aboutPage = "about";
		return aboutPage;
	}

}
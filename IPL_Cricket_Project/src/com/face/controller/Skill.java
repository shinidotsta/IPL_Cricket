package com.face.controller;

import java.sql.Connection;

import com.face.BO.SkillBO;
import com.face.DAO.SkillDAO;

import MySQLConnection.ConnectionManager;

public class Skill {

	public int SkillIDFinding(String skill_name) throws Exception 
	{
     ConnectionManager con=new ConnectionManager();
     
     SkillBO SkBo=new SkillBO();
     int IDskill= SkillDAO.find_By_Skillname(con.getConnection(),skill_name);
   //  System.out.println(IDskill);
   // System.out.println(SkBo.getSkillname());
     return IDskill;
	}

}

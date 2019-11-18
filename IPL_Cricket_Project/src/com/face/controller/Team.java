package com.face.controller;

import com.face.BO.SkillBO;
import com.face.BO.TeamBO;
import com.face.DAO.SkillDAO;
import com.face.DAO.TeamDAO;

import MySQLConnection.ConnectionManager;

public class Team {

	public int TeamIDFinding(String team_name) throws Exception
	{
		 ConnectionManager con=new ConnectionManager();
	     
	     TeamBO teamBO=new TeamBO();
	     int IDTeam= TeamDAO.findID_By_Teamname(con.getConnection(),team_name);
	   //  System.out.println(IDskill);
	   // System.out.println(SkBo.getSkillname());
	     return IDTeam;
	     
	
	}

}

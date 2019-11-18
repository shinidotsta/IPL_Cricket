package com.face.controller;

import com.face.BO.PlayerBO;
import com.face.DAO.PlayerDAO;

import MySQLConnection.ConnectionManager;

public class Player 
{
	public Player() throws Exception
	{
		ConnectionManager con=new ConnectionManager();
		PlayerDAO.Display_Player_List(con.getConnection());
		
	}

	public Player(String player_name, String country_name, int skillvalue, int teamValue) throws Exception 
	{
	ConnectionManager con=new ConnectionManager();
	PlayerBO playrBO=new PlayerBO();
	playrBO.setPlayer_name(player_name);playrBO.setCountry(country_name);playrBO.setPlayer_Skill_ID(skillvalue);playrBO.setPlayer_team_ID(teamValue);
	PlayerDAO.insert_To_player(con.getConnection(),playrBO);	
	}

	public Player(int skilvalue) throws Exception 
	{
		ConnectionManager con=new ConnectionManager();
		PlayerDAO.Search_Player_With_Skill(con.getConnection(),skilvalue);
		
	}



	
}

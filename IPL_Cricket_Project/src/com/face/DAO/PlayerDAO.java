package com.face.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.BO.PlayerBO;

public class PlayerDAO 
{

	public static void insert_To_player(Connection connection, PlayerBO playrBO) throws SQLException 
	{
		Statement st=connection.createStatement();
		String query="INSERT INTO Player(name,country,skill_id,team_id) values('"+playrBO.getPlayer_name()+"','"+playrBO.getCountry()+"','"+playrBO.getPlayer_Skill_ID()+"','"+playrBO.getPlayer_team_ID()+"')";
		
		int resultset=st.executeUpdate(query);
		if(resultset==1)
			System.out.println("Data inserted Suceesfully");
		else
			System.out.println("Please check");
		
	}

	public static void Display_Player_List(Connection connection) throws SQLException
	{
		Statement st=connection.createStatement();
		String query="SELECT P.id,P.name,P.country,S.skill_name,T.Team_name FROM player P INNER JOIN skill S  INNER JOIN team T ON S.skill_id=P.skill_id AND T.Team_id=P.team_id";
		ResultSet rs=st.executeQuery(query);
		
		System.out.println("srno \t name \t country \t skill \t\t  Team");
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t\t");System.out.print(rs.getString(4)+"\t\t");
			System.out.print(rs.getString(5)+"\t\t");
			System.out.println();
		}
		
	}

	public static void Search_Player_With_Skill(Connection connection, int skilvalue) throws SQLException 
	{
		
		Statement st=connection.createStatement();
		String query="SELECT P.name,P.country,S.skill_name,T.Team_name FROM player P INNER JOIN skill S  INNER JOIN team T ON S.skill_id=P.skill_id AND T.Team_id=P.team_id where P.skill_id='"+skilvalue+"'";
		ResultSet rs=st.executeQuery(query);
		System.out.println("srno \t name \t country \t skill \t\t  Team");
		while(rs.next())
		{
		    System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getString(2)+"\t\t");System.out.print(rs.getString(3)+"\t\t");
			System.out.print(rs.getString(4)+"\t\t");
			System.out.println();
		}
	}



}

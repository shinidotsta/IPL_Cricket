package com.face.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.BO.SkillBO;
import com.face.BO.TeamBO;

public class TeamDAO {

	public static int findID_By_Teamname(Connection connection, String team_name) throws SQLException
	{
		Statement st=connection.createStatement();
		String query="SELECT *FROM team WHERE Team_name='"+team_name +"'";
		//System.out.println(query);
		ResultSet rs=st.executeQuery(query);
		int IDteam = 0;
		TeamBO teamBO=new TeamBO();

		while(rs.next())
		{
		//System.out.println(rs.getString("skill_name"));
		//System.out.println(rs.getInt("skill_id"));
			teamBO.setTeamName(rs.getString("Team_name"));
			teamBO.setTeamid(rs.getInt("Team_id"));
	     	IDteam=rs.getInt("Team_id");
		}
		//System.out.println(IDteam);
		return IDteam;
	
	}

}

package com.face.controller;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) throws Exception
	{
		Skill SkObj=new Skill();
		Team teamObj=new Team();
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("********Enter Menu**********");
			System.out.println("1.List all Players   2.Add New Player     3.search Player");
			int  choice;
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				Player player1=new Player();
				break;
			case 2:
				System.out.println("Enter player name");
				String player_name=sc.next();
				System.out.println("Enter Country name");
				String country_name=sc.next();
				
				System.out.println("Enter skill");
				String skill_name=sc.next();
				int Skillvalue=SkObj.SkillIDFinding(skill_name);
				System.out.println(Skillvalue);
				
				
				System.out.println("Enter team");
				String Team_name=sc.next();
				int TeamValue=teamObj.TeamIDFinding(Team_name);
				System.out.println(TeamValue);
				
				Player player=new Player(player_name,country_name,Skillvalue,TeamValue);
				
				
				break;
			case 3:
				System.out.println("Enter Skill name");
				String Skill_name=sc.next();
				int Skilvalue=SkObj.SkillIDFinding(Skill_name);
			//	System.out.println(Skilvalue);
				Player player11=new Player(Skilvalue);			
				break;
			}
			
			
			
		}while(true);

	}

}

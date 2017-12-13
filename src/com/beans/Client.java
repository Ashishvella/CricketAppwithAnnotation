package com.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*ApplicationContext context = new ClassPathXmlApplicationContext("context.xml",
				PlayerConfiguration.class);*/
		ApplicationContext context = new AnnotationConfigApplicationContext(PlayerConfiguration.class);
		TeamBean bean = context.getBean(TeamBean.class);
		System.out.println(bean.getName());
		PlayerBean player = (PlayerBean)context.getBean("dhoni"); 
		System.out.println("Player Name is:"+player.getPlayerName());
		Map run = player.getRuns();
		 System.out.println("Runs Against Pak"+run.get("pak"));
		 System.out.println("Runs Agains Nz"+run.get("nz"));
		
	/*	List player = bean.getPlayers();
		Iterator< PlayerBean> players = player.iterator();
		while(players.hasNext()){
			PlayerBean bea = players.next();
			System.out.println(bea.getPlayerName()+" "+bea.getTeamName());
			}
			*/
		
		
		/*
		 * TeamBean team = (TeamBean) context.getBean("teamBean");
		 * System.out.println(team.getName()); PlayerBean player = (PlayerBean)
		 * context.getBean("dhoni"); Map run = player.getRuns();
		 * System.out.println(run.get("pak"));
		 * System.out.println(run.get("nz"));
		 */
		/*
		 * Iterator<PlayerBean> players = team.getPlayers().iterator();
		 * Map<String, Integer> temp; temp = context.getBean("dhoni",
		 * PlayerBean.class).getRuns(); System.out.println(temp.get("nz"));
		 * 
		 * 
		 * while (players.hasNext()) { PlayerBean playerBean = (PlayerBean)
		 * players.next();
		 * System.out.println(playerBean.getPlayerName()+""+playerBean.getRuns()
		 * );
		 * 
		 * 
		 * }
		 */
		/*
		 * PlayerBean player1=(PlayerBean)players.next(); PlayerBean
		 * player2=(PlayerBean)players.next();
		 * System.out.println("Player Name:"+player1.getPlayerName());
		 * System.out.println("Team Name:"+player1.getTeamName());
		 * System.out.println("Runs Against Teams:"+player1.getRuns());
		 * System.out.println("Player Name:"+player2.getPlayerName());
		 * System.out.println("Team Name:"+player2.getTeamName());
		 * System.out.println("Runs Against Teams:"+player2.getRuns());
		 */

	}

}

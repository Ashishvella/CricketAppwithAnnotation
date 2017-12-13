package com.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class PlayerConfiguration {
	@Autowired
	PlayerBean player;

	@Bean("dhoni")
	public PlayerBean getPlayer() {
		//if (player.getPlayerName().isEmpty()) {
			Map<String, Integer> run = new HashMap<String, Integer>();
			run.put("pak", 1255);
			run.put("nz", 5421);
			player = new PlayerBean();
			player.setPlayerName("dhoni");
			player.setTeamName("India");
			player.setRuns(run);
			return player;
	
	}

	@Bean("virat")
	public PlayerBean getVirat() {
		//if (!player.getPlayerName().isEmpty()) {
			Map<String, Integer> run = new HashMap<String, Integer>();
			run.put("pak", 5487);
			run.put("nz", 6585);
			player = new PlayerBean();
			player.setPlayerName("virat");
			player.setTeamName("India");
			player.setRuns(run);
			return player;
		
	}

}

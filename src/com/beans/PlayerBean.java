package com.beans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PlayerBean {
	String playerName;
	String TeamName;
	// @Value("#{{'pak':${pak},'nz':${nz}}}")
	Map<String, Integer> Runs;

	PlayerBean() {
		super();
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public Map<String, Integer> getRuns() {
		return Runs;
	}

	public void setRuns(Map<String, Integer> runs) {
		Runs = runs;
	}

}

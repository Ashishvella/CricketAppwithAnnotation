package com.beans;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "com/beans/values.properties" })
public class TeamBean {
	@Value("India")
	String name;
	@Autowired
	//@Qualifier(value = "dhoni, virat")
	List<PlayerBean> players;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PlayerBean> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerBean> players) {
		this.players = players;
	}

}

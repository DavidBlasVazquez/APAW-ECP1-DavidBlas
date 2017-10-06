package es.upm.miw.apaw.builder;

import es.upm.miw.apaw.entities.Sport;

public class SportBuilder {
	private Sport sport;
	public SportBuilder (long id ) {
		sport = new Sport();
		sport.setId(id);	
	}
	public SportBuilder id (long id) {
		sport.setId(id);
		return this;
	}
	public SportBuilder title(String title) {
		sport.setTitle(title);
		return this;	}
	public Sport build () {
		return sport;
	}
}

package es.upm.miw.apaw.builder;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.builder.SportBuilder;
import es.upm.miw.apaw.entities.Sport;

public class SportBuilderConstructorTest {
	private Sport Sport;
	private SportBuilder SportBuilder;
	@Before
	public void before() {
		Sport = new Sport();
	}
	@Test
	public void idWithConstructorTest() {
		long id = 123456;
		Sport.setId(id);
		SportBuilder = new SportBuilder(id);
		assertEquals(Sport.getId(), SportBuilder.build().getId());
	}

}

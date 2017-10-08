package es.upm.miw.apaw.composite;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.apaw.builder.UserBuilder;
import es.upm.miw.apaw.entities.User;

public class CompositeTest {
	private Group friends, family, people;
	private Individual individualOne, individualTwo, individualThree, individualFour;	
	
	private void createingObjects() {
		people = new Group("people");
		User user  = (new UserBuilder(1)).name("Jose").birthDate(new GregorianCalendar(1,1,1991)).build();
		individualOne = new Individual(user);		 
		
		friends = new Group("friends");
		user= (new UserBuilder(2)).name("Jesus").birthDate(new GregorianCalendar(2,2,1992)).build();
		individualTwo = new Individual(user);	
		user= (new UserBuilder(3)).name("Jaime").birthDate(new GregorianCalendar(3,3,1993)).build();
		individualThree = new Individual(user);	
		
		family = new Group("family"); 
		user= (new UserBuilder(4)).name("Jorge").birthDate(new GregorianCalendar(4,4,1994)).build();
		individualFour= new Individual(user);	
	}
	
	@Before
	public void before () {
		this.createingObjects();
	}
	
	@Test
	public void allTreeTest() {
		people.add(individualOne);
		people.add(friends);
		people.add(family);
		friends.add(individualTwo);
		friends.add(individualThree);
		family.add(individualFour);
		assertEquals("people 1 friends 2 3 family 4",people.view());
	}
	
	@Test
	public void onlyGroupTest () {
		people.add(friends);
		people.add(family);
		assertEquals("people friends family",people.view());
	}
	
	@Test
	public void onlyIndividualTest () {
		people.add(individualOne);
		people.add(individualTwo);
		people.add(individualThree);
		assertEquals("people 1 2 3",people.view());
	}
	
	
	@Test
	public void removeIndividualTest () {
		people.add(individualOne);
		people.add(family);
		people.add(individualThree);
     	assertEquals("people 1 family 3", people.view());
		people.remove(individualOne);
		assertEquals("people family 3", people.view());
	}
	
	@Test
	public void removeGroupTest () {
		people.add(individualOne);
		people.add(family);
		people.add(individualThree);
     	assertEquals("people 1 family 3", people.view());
		people.remove(family);
		assertEquals("people 1 3", people.view());
	}
}

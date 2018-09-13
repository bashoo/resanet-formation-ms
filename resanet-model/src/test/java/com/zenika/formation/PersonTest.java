package com.zenika.formation;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

	@Test
	public void test1() {
		Person p = new Person();
		p.setName("Zenika");
		p.setFirstName("Zenika first name");

		Assert.assertEquals("Zenika", p.getName());
		Assert.assertEquals("Zenika first name", p.getFirstName());
	}

	@Test
	public void test2() {
		Person p = new Person();
		p.setName("Zenika");
		p.setFirstName("Zenika first name");

		Assert.assertEquals("Zenika", p.getName());
		Assert.assertEquals("Zenika first name", p.getFirstName());
	}
}

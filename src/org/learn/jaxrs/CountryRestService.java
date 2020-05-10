package org.learn.jaxrs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/countries")
public class CountryRestService {
	@GET
	@Path("/books")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBook() {
		System.out.println("S");
		Book boo = new Book();
		boo.setAuthor("ababa");
		boo.setName("aa");
		return boo;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> getCountries() {
		List<Country> listOfCountries = new ArrayList<>();
		listOfCountries = createCountryList();
		return listOfCountries;
	}

	@GET
	@Path("{id: d+}")
	@Produces(MediaType.APPLICATION_JSON)
	public Country getCountryById(@PathParam("id") int id) {
		List<Country> listOfCountries = new ArrayList<>();
		listOfCountries = createCountryList();

		for (Country country : listOfCountries) {
			if (country.getId() == id)
				return country;
		}

		return null;
	}

// Utiliy method to create country list.
	public List<Country> createCountryList() {
		Country indiaCountry = new Country(1, "India");
		Country chinaCountry = new Country(4, "China");
		Country nepalCountry = new Country(3, "Nepal");
		Country bhutanCountry = new Country(2, "Bhutan");

		List<Country> listOfCountries = new ArrayList<>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		return listOfCountries;
	}
}
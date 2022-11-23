package example.model;

public class Pokemon {
	

	/*
	 * The model package holds all of our "models"/"containers". Remember, an object simply models
	 * real world objects...so we make a package called "model".
	 * 
	 * Models in programming are DUMB containers....they don't have any complex logic...they are
	 * LITERALLY just containers. So if you find yourself putting complex algorithms in a model
	 * you're doing it wrong.
	 * 
	 */

	//STATE
	private int pokemonId;
	private String pokemonName;
	private String pokemonType;
	private String pokemonSecondType;
	
	/*
	 * I need simple functionality to access and modify the fields in my model/container class
	 * 
	 * I generally make the following:
	 * 
	 * no args constructor
	 * all args constructor
	 * getters & setters
	 * toString
	 */
	
	public Pokemon() {
	}

	public Pokemon(int pokemonId, String pokemonName, String pokemonType, String pokemonSecondType) {
		super();
		this.pokemonId = pokemonId;
		this.pokemonName = pokemonName;
		this.pokemonType = pokemonType;
		this.pokemonSecondType = pokemonSecondType;
	}

	public int getPokemonId() {
		return pokemonId;
	}

	public void setPokemonId(int pokemonId) {
		this.pokemonId = pokemonId;
	}

	public String getPokemonName() {
		return pokemonName;
	}

	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}

	public String getPokemonType() {
		return pokemonType;
	}

	public void setPokemonType(String pokemonType) {
		this.pokemonType = pokemonType;
	}

	public String getPokemonSecondType() {
		return pokemonSecondType;
	}

	public void setPokemonSecondType(String pokemonSecondType) {
		this.pokemonSecondType = pokemonSecondType;
	}

	@Override
	public String toString() {
		return "\nPokemon [pokemonId=" + pokemonId + ", pokemonName=" + pokemonName + ", pokemonType=" + pokemonType
				+ ", pokemonSecondType=" + pokemonSecondType + "]";
	}
}

package paqueteitla_3;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//FAMILIA MARTINEZ
		
		
		//Niños
		Nino Angel_Martinez =  new Nino("Angel", "Martinez", "12");
		Angel_Martinez.quienSoy();
		Nina Angela_Martinez = new Nina("Angela", "Matinez", "10");
		Angel_Martinez.jugar();
		Angela_Martinez.jugar();
		
		//Adolescentes
		Adolescente_m Miguel_Martinez = new Adolescente_m("Miguel","Martinez","17");
		Adolescente_f Miguelina_Martinez = new Adolescente_f("Miguelina", "Martinez","15");
		Miguel_Martinez.estudiar();
		Miguelina_Martinez.estudiar();
		
		//Hombres (Padres)
		Hombre Francisco_Martinez = new Hombre("Francisco","Martinez","45");
		Mujer Francia_Martinez = new Mujer("Francia","Martinez","43");
		Francisco_Martinez.trabajar();
		Francia_Martinez.trabajar();
		
		
		//Adultos (Abuelos)
		Adulto Ramon_Martinez = new Adulto("Ramon","Martinez","71");
		Adulta Ramona_Martinez = new Adulta("Ramona","Martinez","68");
		Ramon_Martinez.cuidarnietos();
		Ramona_Martinez.pasear();
		
		
		//FAMILIA SANCHEZ
		
		//Niños
		Nino Marcos_Sanchez =  new Nino("Marcos", "Sanches", "9");
		Nina Marcia_Sanchez = new Nina("Marcia", "Sanchez", "11");
		Marcos_Sanchez.saltar();
		Marcia_Sanchez.saltar();
		
		//Adolescentes
		Adolescente_m Aaron_Sanchez = new Adolescente_m("Aaron","Sanchez","18");
		Adolescente_f Arianna_Sanchez = new Adolescente_f("Arianna", "Sanchez","16");
		Aaron_Sanchez.estudiar();
		Arianna_Sanchez.estudiar();
		
		//Hombres (Padres)
		Hombre Adrian_Sanchez = new Hombre("Adrian","Sanchez","40");
		Mujer Adrianna_Sanchez = new Mujer("Adrianna","Sanchez","39");
		Adrian_Sanchez.trabajar();
		Adrianna_Sanchez.trabajar();
		
		
		//Adultos (Abuelos)
		Adulto Juan_Sanchez = new Adulto("Juan","Sanchez","65");
		Adulta Juana_Sanchez = new Adulta("Juana","Sanchez","66");
		Juan_Sanchez.cuidarnietos();
		Juana_Sanchez.pasear();
		
		
		//Creando Relaciones entre las familias
		//Angel Martinez
		Angel_Martinez.setHermana(Angela_Martinez);
		Angel_Martinez.setPadre(Francisco_Martinez);
		Angel_Martinez.setMadre(Francia_Martinez);
		Angel_Martinez.setAbuelo(Ramon_Martinez);
		Angel_Martinez.setAbuela(Ramona_Martinez);
		Angel_Martinez.setTia(Adrianna_Sanchez);
		Angel_Martinez.setTio(Adrian_Sanchez);
		
		//Angela_Martines

		Angela_Martinez.setHermano(Angel_Martinez);
		Angela_Martinez.setPadre(Francisco_Martinez);
		Angela_Martinez.setMadre(Francia_Martinez);
		Angela_Martinez.setAbuelo(Ramon_Martinez);
		Angela_Martinez.setAbuela(Ramona_Martinez);
		Angela_Martinez.setTia(Adrianna_Sanchez);
		Angela_Martinez.setTio(Adrian_Sanchez);

		//Francisco_Martitez
		
		Francisco_Martinez.setHijo(Angel_Martinez);
		Francisco_Martinez.setHija(Angela_Martinez);
		Francisco_Martinez.setHermano(Adrian_Sanchez);
		Francisco_Martinez.setHermana(Adrianna_Sanchez);
		Francisco_Martinez.setPadre(Ramon_Martinez);
		Francisco_Martinez.setMadre(Ramona_Martinez);
		
		//Francia Martinez
		
		Francia_Martinez.setHija(Angela_Martinez);
		Francia_Martinez.setHijo(Angel_Martinez);
		Francia_Martinez.setHermano(Adrian_Sanchez);
		Francia_Martinez.setHermana(Adrianna_Sanchez);
		Francia_Martinez.setPadre(Ramon_Martinez);
		Francia_Martinez.setMadre(Ramona_Martinez);
		
		
		//Ramona_Martinez
		
		Ramona_Martinez.setNieto(Angel_Martinez);
		Ramona_Martinez.setNieta(Angela_Martinez);
		Ramona_Martinez.setHija(Francia_Martinez);
		Ramona_Martinez.setHijo(Francisco_Martinez);
		Ramona_Martinez.setHermano(Juan_Sanchez);
		Ramona_Martinez.setHermana(Juana_Sanchez);
		
		
		//Ramon_Martinez
		
		Ramon_Martinez.setNieto(Angel_Martinez);
		Ramon_Martinez.setNieta(Angela_Martinez);
		Ramon_Martinez.setHija(Francia_Martinez);
		Ramon_Martinez.setHijo(Francisco_Martinez);
		Ramon_Martinez.setHermano(Juan_Sanchez);
		Ramon_Martinez.setHermana(Juana_Sanchez);
		
	}

}

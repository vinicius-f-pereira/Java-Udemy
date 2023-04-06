package Classe;

public class DataTeste {
	public static void main(String[] args) {

//		codigo aula
		
		Data d1 = new Data();
		d1.ano = 2021;
			
		var d2 = new Data(31, 12, 2020);
		
		
//		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano );
//		System.out.printf("%d/%d/%d\n", d2.dia, d2.mes, d2.ano );
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		//Meu codigo
//		Data niver = new Data();
//		niver.tipo = "Sua data de aniversário é: ";
//		niver.dia = 17;
//		niver.mes = 12;
//		niver.ano = 2022;
//		
//		Data date = new Data();
//		date.tipo = "Sua data de namoro é: ";
//		date.dia = 29;
//		date.mes = 9;
//		date.ano = 2019;
//		
//		String niverData = niver.tipo + niver.dia + "/" + niver.mes + "/" + niver.ano;
//		String dateData = date.tipo + date.dia + "/" + date.mes + "/" + date.ano;
//		
//		System.out.println(niverData);
//		System.out.println(dateData);
//		
//		
		
	}
}

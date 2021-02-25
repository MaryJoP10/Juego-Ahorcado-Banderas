import java.util.Scanner;
import java.util.Arrays;

public class BanderasJuego{
	public static void main(String[] args) {
		String[] archivox = ConsoleFile.read("info_banderas.csv"); //leer el archivo de las banderas
        String [] capitales = {"Londres", "Bogota", "Lima", "Varsovia", "Yakarta", "Roma", "Abuya", "Oslo", "HangaRoa", "Bucarest", "Berlin", "Tokyo", "Mariehamn", "Seul", "Victoria", "Gibraltar", "Damasco", "Praga", "Beirut", "Edimburgo", "LaHabana", "Moscu", "SriJayawardenapuraKotte", "Banjul", "SantiagoDeChile", "Amsterdam", "Pionyang"};        
        int posAleatoria = (int) Math.floor(Math.random() * capitales.length); //crear una posicion aleatoria de las capitales mencionadas anteriormente
        String capital = capitales[posAleatoria]; //Darle nombre a la posicion

        char [] letras = capital.toCharArray(); //separar la palabra en caracteres independientes
        char [] guion = new char[letras.length]; //hacer de cada letra/caractere un char

        for (int i=0; i<letras.length; i++){
            guion[i]= '-'; //cambiar cada caractere/letra por un guion 
		}
		System.out.println("     #                                                 ");                     
		System.out.println("    # #    #    #   ####   #####    ####     ##    #####   #  #####   #### "); 
		System.out.println("   #   #   #    #  #    #  #    #  #    #   #  #   #    #  #    #    #    # ");
		System.out.println("  #     #  ######  #    #  #    #  #       #    #  #    #  #    #    #    #"); 
		System.out.println("  #######  #    #  #    #  #####   #       ######  #    #  #    #    #    # ");
		System.out.println("  #     #  #    #  #    #  #   #   #    #  #    #  #    #  #    #    #    # ");
		System.out.println("  #     #  #    #   ####   #    #   ####   #    #  #####   #    #     ####  ");

		Scanner op = new Scanner(System.in);
		boolean empezar = false;
		int emp;

		while(!empezar){
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>Presiona 1 para empezar<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			emp = op.nextInt();
			switch(emp){
				case 1:
					System.out.println("Suerte!");
					empezar = true;
					break;
				default:
					System.out.println("Error");
			}
		}
																				
        System.out.println("Cual es su capital?");
        System.out.println(guion);
		
        //Gran Bretaña
        if(capital == "Londres") {
		for(int n=1 ; n<21; n++){ //rango en el que se encuentra la bandera en el documento
			String[] archivo = archivox[n].split(";"); //quitar los ; del archiv de las banderas
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) { //para cada color se le hace un caso 
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
			System.out.println();
        }
        }
        //Colombia
        if(capital == "Bogota"){
        for(int n=21 ; n<41; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }
        //Peru
        if(capital == "Lima"){
		for(int n=41 ; n<61; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }
        //Polonia
        if(capital == "Varsovia") {
		for(int n=61 ; n<81; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Indonesia
        if(capital == "Yakarta"){
		for(int n=81 ; n<101; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Italia
        if(capital == "Roma"){
		for(int n=101 ; n<121; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }   
        //Nigeria
        if(capital == "Abuya"){
        for(int n=121 ; n<141; n++){
            String[] archivo = archivox[n].split(";");
            for(int i = 0; i<archivo.length; i++){
                switch (archivo[i]) {
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
                        break;
                    case "5":
                        System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
                        break;
                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);
            }
        System.out.println();
        }
        }
        //Noruega
        if(capital == "Oslo"){
		for(int n=141 ; n<161; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }
        //Isla De Pascua
        if(capital == "HangaRoa"){
		for(int n=161 ; n<181; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}  
        }
        //Rumania
        if(capital == "Bucarest"){
		for(int n=181 ; n<201; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }
        //Alemania
        if(capital == "Berlin"){
		for(int n=201 ; n<221; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
						break;
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }
        //Japon
        if(capital == "Tokyo"){
        for(int n=221 ; n<241; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
		}
        }
        //Aland
        if(capital == "Mariehamn"){
		for(int n=241 ; n<261; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Corea Del Sur
        if(capital == "Seul"){
		for(int n=261 ; n<281; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }	
        }
        //Seychelles
        if(capital == "Victoria"){
		for(int n=281 ; n<301; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }	
        }
        //Gibraltar
        if(capital == "Gibraltar"){
		for(int n=301 ; n<321; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Siria
        if(capital == "Damasco"){
		for(int n=321 ; n<341; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }	
        }
        //Republica Checa
        if(capital == "Praga"){
		for(int n=341 ; n<361; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }	
        }
        //Libano
        if(capital == "Beirut"){
		for(int n=361 ; n<381; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Escocia
        if(capital == "Edimburgo"){
		for(int n=381 ; n<401; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Cuba
        if(capital == "LaHabana"){
		for(int n=401 ; n<421; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }	
        }
        //Rusia
        if(capital == "Moscu"){
		for(int n=421 ; n<441; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }	
        }
        //Sri Lanka
        if(capital == "SriJayawardenapuraKotte") {
		for(int n=441 ; n<461; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"   ");
						break;
					case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
        System.out.println();
        }
		}	
        //Cambia
        if(capital == "Banjul"){
		for(int n=461 ; n<481; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Chile
        if(capital == "SantiagoDeChile"){
		for(int n=481 ; n<501; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Paises Bajos
        if(capital == "Amsterdam"){
		for(int n=501 ; n<521; n++){
			String[] archivo = archivox[n].split(";");
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }
        //Corea del Norte
        if(capital == "Pioyang"){
		for(int n=521 ; n<541; n++){
			String[] archivo = archivox[n].split(";"); 
			for(int i = 0; i<archivo.length; i++){
				switch (archivo[i]) {
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"   ");
						break;
					case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"   ");
						break;
					case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"   ");
						break;
					default:
						System.out.print("   ");
				}
				System.out.print(ConsoleColors.RESET);
			}
		System.out.println();
        }
        }

        boolean ganar = false;
        while(ganar == false) {
 
            Scanner lector = new Scanner(System.in);
            char letraIntro = lector.next().charAt(0);
            for (int i=0; i<letras.length; i++){
                if(letras[i]==letraIntro){
					guion[i]=letraIntro;
					System.out.println(guion);
                } 
                
                if (Arrays.equals (letras, guion)){
                    System.out.println("########::'######:::'#######:::'#######::'####:'####:::::'######::::::'###::::'##::: ##::::'###:::::'######::'########:'########::::'##::: ##::::'###::::'########:::::'###:::::::'##::::'##:'##:::::'##:'##::::'##::::::");
					System.out.println("##.....::'##... ##:'##.... ##:'##.... ##: ####: ####::::'##... ##::::'## ##::: ###:: ##:::'## ##:::'##... ##:... ##..:: ##.....::::: ###:: ##:::'## ##::: ##.... ##:::'## ##:::::: ##:::: ##: ##:'##: ##: ##:::: ##::::::");
					System.out.println("##::::::: ##:::..:: ##:::: ##: ##:::: ##: ####: ####:::: ##:::..::::'##:. ##:: ####: ##::'##:. ##:: ##:::..::::: ##:::: ##:::::::::: ####: ##::'##:. ##:: ##:::: ##::'##:. ##::::: ##:::: ##: ##: ##: ##: ##:::: ##::::::");
					System.out.println("######:::. ######:: ##:::: ##: ##:::: ##:: ##::: ##::::: ##::'####:'##:::. ##: ## ## ##:'##:::. ##:. ######::::: ##:::: ######:::::: ## ## ##:'##:::. ##: ##:::: ##:'##:::. ##:::: ##:::: ##: ##: ##: ##: ##:::: ##::::::");
					System.out.println("##...:::::..... ##: ##:::: ##: ##:::: ##::..::::..:::::: ##::: ##:: #########: ##. ####: #########::..... ##:::: ##:::: ##...::::::: ##. ####: #########: ##:::: ##: #########:::: ##:::: ##: ##: ##: ##: ##:::: ##::::::");
					System.out.println("##:::::::'##::: ##: ##:::: ##: ##:::: ##:'####:'####:::: ##::: ##:: ##.... ##: ##:. ###: ##.... ##:'##::: ##:::: ##:::: ##:::::::::: ##:. ###: ##.... ##: ##:::: ##: ##.... ##:::: ##:::: ##: ##: ##: ##: ##:::: ##:'###:");
					System.out.println("########:. ######::. #######::. #######:: ####: ####::::. ######::: ##:::: ##: ##::. ##: ##:::: ##:. ######::::: ##:::: ########:::: ##::. ##: ##:::: ##: ########:: ##:::: ##::::. #######::. ###. ###::. #######:: ###:");
					System.out.println("........:::......::::.......::::.......:::....::....::::::......::::..:::::..::..::::..::..:::::..:::......::::::..:::::........:::::..::::..::..:::::..::........:::..:::::..::::::.......::::...::...::::.......:::...::");
                    ganar = true;
                    if(ganar == true) {
                    break;
                }
                }
            }

        }
		










	}
}
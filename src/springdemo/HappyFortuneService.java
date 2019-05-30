package springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@PostConstruct
	public static ArrayList<String> getArrayOfFortunes() {
		ArrayList<String> listaDeFortunas = new ArrayList<String>();
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
        String linea = "";
		
	      try {
	          // Apertura del fichero y creacion de BufferedReader para poder
	          // hacer una lectura comoda (disponer del metodo readLine()).
	    	  archivo = new File ("C:\\Users\\enriquea.vallejo\\Documents\\pruebas.txt");
	          fr = new FileReader (archivo);
	          br = new BufferedReader(fr);

	          // Lectura del fichero
	          System.out.println("Estamos dentro del postConstruct");
	          while((linea=br.readLine())!=null) {
	             System.out.println(linea);
	          	 listaDeFortunas.add(linea);
	         }
	      }
	       catch(Exception e){
	          e.printStackTrace();
	       }finally{
	          // En el finally cerramos el fichero, para asegurarnos
	          // que se cierra tanto si todo va bien como si salta 
	          // una excepcion.
	          try{                    
	             if( null != fr ){   
	                fr.close();     
	             }                  
	          }catch (Exception e2){ 
	             e2.printStackTrace();
	          }
	       }
	    System.out.println("Salimos del metodo PostConstruct");
		return listaDeFortunas;
	}
	

	@Override
	public String getFortune() {
		ArrayList<String> listaDeFortunas = new ArrayList<String>();
		listaDeFortunas = getArrayOfFortunes();
		
		Random myRandom = new Random();
		int index = myRandom.nextInt(listaDeFortunas.size());
	
		
		return listaDeFortunas.get(index);
	}

	
	

}

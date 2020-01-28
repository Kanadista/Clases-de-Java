/*
 * Tipo: Fecha
 * 
 *   Propiedades basicas:
 *  
 *    -Dia: int, consultable, modificable
 *    -Mes: int, consultable, modificable
 *    -Año: int, consultable, modificable
 * 
 *   Propiedades derivadas:
 *     
 * 	  -No hay
 * 
 *   Propiedades compartidas:
 * 
 *    -No hay
 * 
 *   Getters y setters
 * 
 *   public int getDia();
 * 
 *   public void setDia(int dia);
 * 
 *   public int getMes();
 *  
 *   public void setMes(int mes);
 * 
 *   public int getAnho();
 * 
 *   public void setAnho(int anho);
 * 
 *   Restricciones
 * 
 * Los meses Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre tienen 31 dias.
 * Los meses Abril, Junio, Septiembre y Noviembre tienen 30 dias.
 * El mes de Febrero puede tener 28 o 29 días según si el año es bisiesto o no.
 */
 
 public class Fecha implements Comparable<Fecha> {
	 private int dia;
	 private int mes;
	 private int anho;
	 
	 //constructor sin parametros
	 
	 public Fecha(){
		 
		 dia = 1;
		 mes = 1;
		 anho = 2000;
		
	 }
	 
	 //constructor con parametros
	 
	 public Fecha(int dia, int mes, int anho){
		
		boolean bisiesto;
		 if(anho < 1){
			 this.anho = 2000;
		 }else{
			 this.anho = anho;
		 }
		
		 if((anho%400 == 0)||(anho%4 == 0 && anho%100 != 0)){
			bisiesto = true;
		 }else{
			bisiesto = false;  
		 }
		 
		 if(mes < 1 || mes > 12){
			 this.mes = 1;
		 }else{
			 this.mes = mes;
		 }
		 
		 switch(this.mes){
			 case 1:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 2:
			  if(bisiesto){
				 if(dia < 1 || dia > 29){
					 this.dia = 1; 
				 }else{
					 this.dia = dia;
				 }
			  }else{
				 if(dia < 1 || dia > 28){
					 this.dia = 1;
				 }else{
					 this.dia = dia;
				 }
			  }
			 break;
			 
			 case 3:
			  if(dia < 1 || dia > 31){
				 this.dia = 1;
			  }else{
				 this.dia = dia;
			  }
			 break;
			 
			 case 4:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 5:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 6:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 7:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 8:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 9:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 10:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 11:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 12:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
		 }
		 
		 
	 }
	 
	 //getters y setters
	 
	 public int getDia(){
		
		return dia;
	 }
	 
	 public void setDia(int dia){
		
		boolean bisiesto;
		
		if((anho%400 == 0)||(anho%4 == 0 && anho%100 != 0)){
			bisiesto = true;
		 }else{
			bisiesto = false;  
		 }
		 
		 if(mes < 1 || mes > 12){
			 this.mes = 1;
		 }else{
			 this.mes = mes;
		 }
		
		
		
		
		switch(mes){
			 case 1:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 2:
			  if(bisiesto){
				 if(dia < 1 || dia > 29){
					 this.dia = 1; 
				 }else{
					 this.dia = dia;
				 }
			  }else{
				 if(dia < 1 || dia > 28){
					 this.dia = 1;
				 }else{
					 this.dia = dia;
				 }
			  }
			 break;
			 
			 case 3:
			  if(dia < 1 || dia > 31){
				 this.dia = 1;
			  }else{
				 this.dia = dia;
			  }
			 break;
			 
			 case 4:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 5:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 6:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 7:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 8:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 9:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 10:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 11:
			  if(dia < 1 || dia > 30){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 
			 case 12:
			  if(dia < 1 || dia > 31){
				  this.dia = 1;
			  }else{
				  this.dia = dia;
			  }
			 break;
			 default:
			  this.dia = 1;
			 break;
		 }
		
	   }
	   
	   public int getMes(){
		
		return mes;
	   
	   }
	   
	   public void setMes(int mes){
		 
		 if(mes < 1 || mes > 12){
			 this.mes = 1;
		 }else{
			 this.mes = mes;
		 }
		   
	   }
		
	   public int getAnho(){
		   
		   return anho;
		   
	   }
		 
	   public void setAnho(int anho){
		  
		   if(anho < 1){
			 this.anho = 2000;
		 }else{
			 this.anho = anho;
		 }
	   
	   } 
		 
	   public String toString() {
		String s= +getDia()+"/"+ getMes()+"/"+ getAnho();
		return s; 
	}
		 
	   public void sumarDia(){
		   
		   boolean bisiesto;
		 if(anho < 1){
			 this.anho = 2000;
		 }else{
			 this.anho = anho;
		 }
		
		 if((anho%400 == 0)||(anho%4 == 0 && anho%100 != 0)){
			bisiesto = true;
		 }else{
			bisiesto = false;  
		 }
		 
		 if(mes < 1 || mes > 12){
			 this.mes = 1;
		 }else{
			 this.mes = mes;
		 }
		 
		 switch(mes){
			 case 1: 
			 this.dia++;
			 
			 if(this.dia > 31){
				 this.dia = 1;
				 this.mes = 2;
			 }
			 break;
			 
			 case 2:
			 this.dia++;
			 
			 if(bisiesto){
				 if(this.dia > 29){
					 this.dia = 1;
					 this.mes = 3;
				 }
			 }else{
				 if(this.dia > 28){
					 this.dia = 1;
					 this.mes = 3;
					 
				 }
			 }
			 break;
			 
			 case 3:
			 this.dia++;
			 
			 if(this.dia > 31){
				 this.dia = 1;
				 this.mes = 4;
			 }
			 break;
			 
			 case 4:
			 this.dia++;
			 
			 if(this.dia > 30){
				 this.dia = 1;
				 this.mes = 5;
			 }
			 break;	 
			 
			 case 5:
			 this.dia++;
			 
			 if(this.dia > 31){
				 this.dia = 1;
				 this.mes = 6;
			 }
			 break;
			 
			 case 6:
			 this.dia++;
			 
			 if(this.dia > 30){
				 this.dia = 1;
				 this.mes = 7;
			 }
			 break;
			 
			 case 7:
			 this.dia++;
			 
			 if(this.dia > 31){
				 this.dia = 1;
				 this.mes = 8;
			 }
			 break;
			 
			 case 8:
			 this.dia++;
			 
			 if(this.dia > 31){
				 this.dia = 1;
				 this.mes = 9;
			 }
			 break;
			 
			 case 9:
			 this.dia++;
			 
			 if(this.dia > 30){
				 this.dia = 1;
				 this.mes = 60;
			 }
			 break;
			 
			 case 10:
			 this.dia++;
			 
			 if(this.dia > 31){
				 this.dia = 1;
				 this.mes = 11;
			 }
			 break;
			 
			 case 11:
			 this.dia++;
			 
			 if(this.dia > 30){
				 this.dia = 1;
				 this.mes = 12;
			 }
			 break;
			 
			 case 12:
			 this.dia++;
			 
			 if(this.dia > 31){
				 this.dia = 1;
				 this.mes = 1;
				 this.anho++;
			 }
			 break;
			 
		  }
		 }
		   
		   
		   public int compareTo(Fecha fecha){
			   int resultado;
			   
			   if(this.anho < fecha.getAnho()){
				   resultado = -1;
			   }else{
				 if(this.anho > fecha.getAnho()){
				   resultado = 1;
				 }else{
				   resultado = 0;
				 }
			   }
				
			  if(resultado == 0){
				  if(this.mes < fecha.getMes()){
					 resultado = -1;
				  }else{
					if(this.mes > fecha.getMes()){
					 resultado = 1;
					}else{
					 resultado = 0;
					}
				  }
			  }	
			  
			  if(resultado == 0){
				  if(this.dia < fecha.getDia()){
					 resultado = -1;
				  }else{
					if(this.dia > fecha.getDia()){
					 resultado = 1;
					}else{
					 resultado = 0;
					}
				  }
			  }
				return resultado;
			 }   
			 
		  public int calcularBisiesto(){
			  
			  int bisiesto = 0;
			  
			  for(int i = anho; anho < 1000; anho++){
				
				if((anho%400 == 0)||(anho%4 == 0 && anho%100 != 0)){
					bisiesto++;
			    }
		      }	 	
			  return bisiesto;
	      }
		  
			  
		  	public int calcularDiasBase(Fecha fecha){
				
		  		  this.anho = 1000;
		  		  this.mes = 1;
		  		  this.dia = 1;
		  		  boolean anhoBisiesto;
				  int bisiesto = 0;
				  int normal = 0;
				  int meses = 0;
				  int dias = 0;
				  int diasTranscurridos = 0;
				  
				  for(int i = this.anho; anho < fecha.getAnho(); this.anho++){
					
					if((anho%400 == 0)||(anho%4 == 0 && anho%100 != 0)){
						bisiesto++;
					} 
				  }
				  
				  normal = anho - 1000;
				  
				  normal = normal - bisiesto;
				  
				  diasTranscurridos = ((normal * 365) + (bisiesto * 366));
				  
					
				 meses = fecha.getMes() - mes;
				 
				 if((fecha.getAnho()%400 == 0)||(fecha.getAnho()%4 == 0 && fecha.getAnho()%100 != 0)){
					 
					   anhoBisiesto = true;
			   	  
				   }else{
					
					   anhoBisiesto = false;  
				   }
				 
				 switch(meses) {
				 
				 case 1:
					 
				   if(anhoBisiesto) {
					   
					   diasTranscurridos += 31;
					   
				   }else{
				   
					   diasTranscurridos +=  31;
				   
				   }		
				   
				 break;
				
				 case 2:
					 
				 if(anhoBisiesto) {
						   
					 diasTranscurridos += 60;
						   
				 }else{
					   
				     diasTranscurridos +=  59;
					   
				 }
					 
				 break;
				 
				 case 3:
					 
				 if(anhoBisiesto) {
						   
				     diasTranscurridos += 91;
							   
				 }else{
						   
					 diasTranscurridos +=  90;
						   
				 }                                
				   
				 break;
				 
				 case 4: 
					 
				 if(anhoBisiesto) {
						   
					 diasTranscurridos += 121;
								   
				 }else{
							   
				     diasTranscurridos +=  120;
							   
				 }                                    
				 
				 break;
				 
				 case 5: 
					 
				 if(anhoBisiesto) {
						   
				     diasTranscurridos += 152;
								   
			     }else{
							   
			        diasTranscurridos +=  151;
							   
			     }                          
				  
				 break;
				 
				 case 6:
				  
			     if(anhoBisiesto) {
						   
					 diasTranscurridos += 182;
								   
			     }else{
							   
				     diasTranscurridos +=  181;
							   
				 }       
				  
				 break;
				 
				 case 7:
					 
				 if(anhoBisiesto) {
						   
					  diasTranscurridos += 213;
								   
			     }else{
							   
				      diasTranscurridos +=  212;
							   
			     }                  
				 
				 break;
				 
				 case 8:
					 
				 if(anhoBisiesto) {
						   
					 diasTranscurridos += 244;
								   
				 }else{
							   
					 diasTranscurridos +=  243;
							   
				 }
				  
				 break;        								
				 
				 case 9: 
					 
				 if(anhoBisiesto) {
						   
					 diasTranscurridos += 274;
								   
				 }else{
							   
					 diasTranscurridos +=  273;
							   
				 }
				  
				 break;
				 
				 case 10: 
					 											
				 if(anhoBisiesto) {
						   
					 diasTranscurridos += 304;
								   
				 }else{
							   
				     diasTranscurridos +=  303;
							   
			     }
				 
				 break;
				  
				 case 11:

				 if(anhoBisiesto) {
						   
					 diasTranscurridos += 335;
								   
				 }else{
							   
				     diasTranscurridos +=  334;
							   
				 }
				 
				 break;
				 }
				 
				 dias = fecha.getDia() - dia;
				 
				 diasTranscurridos += dias;
				 
				 
				 return diasTranscurridos;
			  }
		  	
		  	public int calcularDiasTranscurridos(Fecha fecha1, Fecha fecha2) {
		  		
		  		Fecha base = new Fecha(1, 1, 1000);
		  		
		  		
		  		int dias1 = 0;
		  		
		  		int dias2 = 0;
		  		
		  		int diasTotales = 0;
		  		
		  		dias1 = base.calcularDiasBase(fecha1);
		  		
		  		dias2 = base.calcularDiasBase(fecha2);
		  		
		  		diasTotales = dias1 - dias2;
		  		
		  		return diasTotales;
		  		
		  		
		  		
		  	}
}
		  

	 
	 


public class testFecha{
 public static void main (String [] args){
	 
	 Fecha f = new Fecha(23, 6, 2001);
	 
	 Fecha x = new Fecha(28, 1, 2020);
	 
	 String s;
	 
	 int y;
	 
	// s = f.toString();
	 
	// System.out.println(s);
	 
	//f.sumarDia();
	
	//s = f.toString();
	
	//System.out.println(s);
	
	/*System.out.println(f.getDia());
	System.out.println(f.getMes());
	System.out.println(f.getAnho());
	
	System.out.println(x.getDia());
	System.out.println(x.getMes());
	System.out.println(x.getAnho());
	*/
	//System.out.println(f.compareTo(x));
	
	//f.calcularAnhoBisiesto();
	
	//System.out.println(f.calcularDiasBase(x));
	
	y = x.calcularDiasTranscurridos(x, f);
	
	System.out.println(y);
 }





}

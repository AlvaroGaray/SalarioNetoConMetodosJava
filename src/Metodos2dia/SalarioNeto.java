package Metodos2dia;
import java.util.*;
public class SalarioNeto {

	static Scanner es=new Scanner(System.in);
	final static double MPAS=1.0, INSS=7, ir=15.6, INSSpatronal=22.5,TasaAntiguedad=15;
	public static void main(String[] args) {
	
		bienvenido();
		
		System.out.println("Ingrese  su Salario Bruto (Basico)");
		double salario=es.nextDouble();
		
		double antiguedad=IngresoAntiguedad(salario);
		double Montosindicato=MontoSindicato(salario);
		double Ingresototal=IngresoTotal(salario,antiguedad);
		double Montoinss=MontoInss(Ingresototal);
		double Montoir=MontoIR(Ingresototal);
		double Totaldeducciones=TotalDeducciones(Montoinss,Montosindicato,Montoir);
		double Montoinsspatronal=MontoINSSPatronal(Ingresototal);
		double Salarioneto=IngresoNeto(Ingresototal,Totaldeducciones);
		
	}//Fin del main
	
	private static void bienvenido() {
		
		System.out.println("BIENVENIDO A LA APP DE CALCULO DE SAlARIO NETO");
	}
	
	private static double IngresoAntiguedad(double salario) {
		double antiguedad=salario*(TasaAntiguedad/100);
		
		System.out.println("El Ingreso por antiguedad es: "+antiguedad);
		return antiguedad;
	}
	
	private static double MontoSindicato(double salario) {
		
		double Montosindicato=salario*(MPAS/100);
		System.out.println("El Monto de afiliacion del sindicato es:"+Montosindicato);
		return Montosindicato;
	}
	
	private static double IngresoTotal(double salario, double antiguedad) {
		
		double Ingresototal=salario+antiguedad;
		System.out.println("El Ingreso total es: "+Ingresototal);
		return Ingresototal;
	}
	
	private static double MontoInss(double Ingresototal) {
		
		double Montoinss=Ingresototal*(INSS/100);
		System.out.println("El Monto del Inss es:" +Montoinss);
		return Montoinss;
	}
	
	private static double MontoIR(double Ingresototal) {
		
		double Montoir=Ingresototal*(ir/100);
		System.out.println("El Monto del Ir es: "+Montoir);
		return Montoir;
	}
	
	private static double TotalDeducciones(double Montosindicato, double Montoinss, double MontoIR) {
		
		double Totaldeducciones=Montosindicato+Montoinss+MontoIR;
		System.out.println("El Total de las deducciones es: "+Totaldeducciones);
		return Totaldeducciones;
	}
	
	private static double MontoINSSPatronal(double Ingresototal) {
		
		double Montoinsspatronal=Ingresototal*(INSSpatronal/100);
		System.out.println("El Monto del Inss Patronal es de: "+Montoinsspatronal);
		return Montoinsspatronal;
	}
	
	private static double IngresoNeto(double Ingresototal,double Totaldeducciones) {
		
		double Ingresoneto=Ingresototal-Totaldeducciones;
		System.out.println("El ingreso neto es: "+Ingresoneto);
		return Ingresoneto;
	}
	
	

}//Fin de la clase

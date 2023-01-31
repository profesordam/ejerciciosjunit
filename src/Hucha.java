
public class Hucha {

	private String contraseña;
	private boolean abierta;
	
	public static final int CINCUENTA = 0;
	public static final int VEINTE = 1;
	public static final int DIEZ = 2;
	public static final int CINCO = 3;
	public static final int DOS = 4;
	public static final int UNO = 5;
	
	private int[][] efectivo = {
			{50, 0},
			{20, 0},
			{10, 0},
			{5, 0},
			{2, 0},
			{1, 0}
	};
	
	public Hucha(String contraseña) {
		this.contraseña = contraseña;
		abierta = true;
	}

	public Hucha(String contraseña, int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
		this(contraseña);
		añadir(uno, dos, cinco, diez, veinte, cincuenta);
	}
	
	public Hucha(String contraseña, int cantidad) {
		this(contraseña);
		añadir(cantidad);
	}
	
	public void cerrar() {
		abierta = false;
	}
	
	public void abrir(String contraseña) {
		abierta = this.contraseña.equals(contraseña);
	}
	
	public boolean añadir(int cantidad) {
		if (abierta)
			for (int i=0; i<efectivo.length; i++)
				desglosar(i, cantidad);
		return abierta;
	}
	
	public boolean añadir(int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
		if (abierta) {
			efectivo[0][1] = cincuenta;
			efectivo[1][1] = veinte;
			efectivo[2][1] = diez;
			efectivo[3][1] = cinco;
			efectivo[4][1] = dos;
			efectivo[5][1] = uno;
		}
		return abierta;
	}
	
	public int retirar(int tipo, int cantidad) {
		int retirado = 0;
		if (tipo >= 0 && tipo <= 5) {
			if (abierta) {
				if (efectivo[tipo][1] >= cantidad) {
					retirado = cantidad;
					efectivo[tipo][1] -= cantidad;
				}
				else {
					retirado = efectivo[tipo][1];
					efectivo[tipo][1] = 0;
				}
				retirado = efectivo[tipo][0] * retirado; 
			}
		}
		return retirado; 
	}
	
	private int desglosar(int i, int cantidad) {
		int valor = efectivo[i][0];
		if (cantidad >= valor) {
			efectivo[i][1] += cantidad / valor;
			cantidad %= valor;
		}
		return cantidad;
	}
	
	
	
}

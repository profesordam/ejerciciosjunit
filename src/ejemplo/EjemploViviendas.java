package ejemplo;

public class EjemploViviendas {

	public static String estaAdjudicada(String dni, String baremo) {
		if (dni.length() < 8 || dni.length() > 9)
			return "Dato no válido";
		else {
			int l = dni.length();
			char c;
			for (int i=0; i<l; i++) {
				c = dni.charAt(i);
				if ((i < l - 1 && !Character.isDigit(c)) || i == l -1 && !Character.isAlphabetic(c))
					return "Dato no válido";
			}
		}
		try {
			int n = Integer.parseInt(baremo);
			if (n < 0 || n > 10)
				return "Dato no válido";
			if (n < 5)
				return "No Adjudicada";
			else
				return "Adjudicada";
		} catch (NumberFormatException e) {
			return "Dato no válido";
		}
		
	}
	
}

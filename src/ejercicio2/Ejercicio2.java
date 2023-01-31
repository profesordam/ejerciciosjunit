package ejercicio2;

public class Ejercicio2 {

	public static String getSalario(String empleado, String departamento, String oficio){
		int n = Integer.parseInt(empleado);
		
		if (n < 100 || n > 999)
			return "err1";
		
		if (!departamento.equals("")) {
			n = Integer.parseInt(departamento);
			if (n <10 || n > 99)
				return "err2";
		}
		switch (oficio) {
		case "programador":
			return "2000";
		case "analista":
			return "2500";
		case "diseñador":
			return "1500";
		default:
			return "err3";
		}
	}

}

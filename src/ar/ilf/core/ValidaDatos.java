package ar.ilf.core;

public class ValidaDatos {
	
	private static final String USER = "admin";
	private static final String PASS = "123Prueba";
	
	public static String validaUserYPass(String user, String pass) {
		
		String mensaje;
		
		if (!user.equals(USER)) {
        	mensaje = "Usuario invalido";
        }else if (!pass.equals(PASS)){
        	mensaje = "Contraseña Incorrecta";
        }else {
        	mensaje = "Bienvenido " + user;
        }
		
		return mensaje;
		
	}
	
}

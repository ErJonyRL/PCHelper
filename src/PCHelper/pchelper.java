package PCHelper;

import Controlador.Controlador;
import Vista.vista;
import LooK.look;

public class pchelper {

	public static void main(String[] args) {
		vista miVistaPCHelper = new vista();
		
		
		Controlador miControlador = new Controlador(miVistaPCHelper);
		
		miControlador.mostrarVistaPCHelper();

	}

}
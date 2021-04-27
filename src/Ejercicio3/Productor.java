package Ejercicio3;

import java.util.Random;

public class Productor implements Runnable{
	Cola colaCompartida;
    public Productor(Cola cola){
            this.colaCompartida=cola;
    }
	@Override
	public void run() {
		while (true){
			Random generador= new Random();
            int num=generador.nextInt(10);
            while (colaCompartida.encolar(num)==false){
            	try {
                    Thread.sleep(3000);
            } catch (InterruptedException e) {
                    return ;
            }
            } /*Fin del while*/

            System.out.println("Productor encoló el numero:"+num);
    } /*Fin del while externo*/
	}

}

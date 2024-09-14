package peterson;

/*El algoritmo de Peterson es una solución clásica 
para garantizar la exclusión mutua en programación 
concurrente. Es utilizado para sincronizar dos hilos 
de ejecución que comparten recursos, evitando que 
ambos accedan al mismo recurso crítico simultáneamente.*/
public class Peterson implements Runnable {

    //Una referencia al objeto SharedData, compartido entre los hilos
    SharedData data;
    //El identificador del hilo que está ejecutando la instancia de Peterson
    int mine;
    //El identificador del otro hilo
    int other;

    Peterson(SharedData d1, int id) {
        /*En el constructor, se inicializan las variables data y mine. 
        data es el recurso compartido, mientras que mine es el 
        identificador del hilo actual (0 o 1)*/
        data = d1;
        mine = id;
    }

    @Override
    public void run() {
        //Si el hilo actual es el 0, el otro será el 1, y viceversa
        if (mine == 0) {
            other = 1;
        } else {
            other = 0;
        }
        /*Se repite infinitamente simulando un bucle continuo 
        que intenta acceder a la sección crítica:*/
        for (;;) {
            data.flag[mine] = true;// El hilo actual indica que quiere entrar a la sección crítica.
            data.turn = other;// Cede el turno al otro hilo.
            while (data.flag[other] == true && data.turn == other) {
                // Espera activa
                System.out.println("Este Hilo " + mine + " esta en espera");
            }
            //Sección Critica, sería el lugar donde se accede a recursos compartidos
            System.out.println("Este Hilo " + mine + " esta usando la seccion critica");
           // System.out.println("Este es el turno de: " + (data.turn));
            data.flag[mine] = false;
            System.out.println("---------------------------");
        }
    }
}

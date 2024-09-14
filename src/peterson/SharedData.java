package peterson;

public class SharedData {

    //Un arreglo de booleanos que indica si un hilo desea acceder a la sección crítica
    boolean[] flag = new boolean[2];
    //Una variable que se utiliza para otorgar el turno al otro hilo.
    int turn;

    SharedData() {
        flag[0] = false;
        flag[1] = false;
        turn = 0;
    }
}

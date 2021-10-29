import javax.swing.JOptionPane;

public class Dado {
    int valor = 6;

    public int tirarDadoUno(){
        int valor = (int) (Math.random() * 6 + 1);
        return valor;
    }
    public int tirarDadoDos(){
        int valor = (int) (Math.random() * 6 + 1);
        return valor;
    }
    public void mostrar(){
            String boton[]= {" TIRAR DADO "};
            int respuestaUno = JOptionPane.showOptionDialog(null, "Valor actual: " + valor, "Juego del dado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, null/*icono*/, boton, boton[0]);
            int respuestaDos = JOptionPane.showOptionDialog(null, "Nuevo valor:  " + tirarDadoUno(), "Juego del dado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, null/*icono*/, boton, boton[0]);
            int respuestaTres = JOptionPane.showOptionDialog(null, "Nuevo valor:  " + (tirarDadoUno()+1), "Juego del dado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, null/*icono*/, boton, boton[0]);
            int a=tirarDadoUno();
            int b=tirarDadoDos();
            JOptionPane.showMessageDialog(null, "Vamos a tirar 2 dados!");
            int respuestaCuatro = JOptionPane.showOptionDialog(null, "Valor dado 1:  " + a, "Juego del dado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, null/*icono*/, boton, boton[0]);
            int respuestaCinco = JOptionPane.showOptionDialog(null, "Valor dado 2:  " + b, "Juego del dado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, null/*icono*/, boton, boton[0]);
            JOptionPane.showMessageDialog(null, "El resulatado al tirar ambos dados es:  " + (a+b));

    }
}


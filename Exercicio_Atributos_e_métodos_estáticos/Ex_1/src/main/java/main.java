/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author glauc
 */
public class main {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea area = new ConversaoDeUnidadesDeArea();
        double a = area.metroParaPeQuadrado(8250);
        double b = area.metroParaAcres(8250);
        double c = area.metroParaCentimetros(8250);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

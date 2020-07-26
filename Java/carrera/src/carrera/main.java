package carrera;

public class main {

    public static void main(String[] args) {
        Equipos equi = new Equipos("colombia", "pepe", "antonio", "carlos", "alberto");
        Equipos equi2 = new Equipos("Argentina", "yepez", "marco", "federico", "forza");
        Equipos equi3 = new Equipos("Chile");
        Equipos equi4 = new Equipos("Peru");
        Equipos equi5 = new Equipos("bolvia");
        equi.start();
        equi2.start();
        equi3.start();
        equi4.start();
        equi5.start();
       
        while(equi.isTermina() && equi2.isTermina() && equi3.isTermina() && equi4.isTermina()){
           if (equi.isTermina() && equi2.isTermina() && equi3.isTermina() && equi4.isTermina()) {
            System.out.println("Tiempo de " + equi.getName() + " es :" + equi.getTimeSecons() + " s");
            System.out.println("Tiempo de " + equi2.getName() + " es :" + equi2.getTimeSecons() + " s");
            System.out.println("Tiempo de " + equi3.getName() + " es :" + equi3.getTimeSecons() + " s");
            System.out.println("Tiempo de " + equi4.getName() + " es :" + equi4.getTimeSecons() + " s");
        } 
        }
        

    }

}

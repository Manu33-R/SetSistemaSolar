import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainSistemaSolar {
    private static Map<String,CuerpoCeleste> sistemaSolar = new HashMap<>();
    private static Set<CuerpoCeleste> planetas = new HashSet<>();
    private static Set<CuerpoCeleste> lunas = new HashSet<>();
    private static Set<CuerpoCeleste> planetasena = new HashSet<>();
    public static void main(String[] args) {
        //Mercurio
        CuerpoCeleste mercurio = new Planeta("Mercurio",88);
        sistemaSolar.put("Mercurio",mercurio);
        planetas.add(mercurio);
        //Venus
        CuerpoCeleste venus = new Planeta("Venus",225);
        sistemaSolar.put("Venus",venus);
        planetas.add(venus);
        //La Tierra
        CuerpoCeleste tierra = new Planeta("La Tierra",365);
        sistemaSolar.put("La Tierra",tierra);
        planetas.add(tierra);
        //Marte
        CuerpoCeleste marte = new Planeta("Marte",687);
        sistemaSolar.put("Marte",marte);
        planetas.add(marte);
        //Jupiter
        CuerpoCeleste jupiter = new Planeta("Jupiter",4332);
        sistemaSolar.put("Jupiter",jupiter);
        planetas.add(jupiter);
        //Saturno
        CuerpoCeleste saturno = new Planeta("Saturno",10759);
        sistemaSolar.put("Saturno",saturno);
        planetas.add(saturno);
        //Urano
        CuerpoCeleste urano = new Planeta("Urano",30660);
        sistemaSolar.put("Urano",urano);
        planetas.add(urano);
        //Neptuno
        CuerpoCeleste neptuno = new Planeta("Neptuno",165);
        sistemaSolar.put("Neptuno",neptuno);
        planetas.add(neptuno);
        //Pluton
        CuerpoCeleste pluton = new Planeta("Pluton",248);
        sistemaSolar.put("Pluton",pluton);
        planetas.add(pluton);
        //Luna
        System.out.println("--Satelites de la Tierra--");
        CuerpoCeleste luna = new Luna("Luna",27);
        sistemaSolar.put("Luna",luna);
        System.out.println("Luna añadida a la Tierra: " + tierra.addSatelite(luna));
        //Deimos
        System.out.println("\n--Satelites de Marte--");
        CuerpoCeleste deimos = new Luna("Deimos",1.3);
        sistemaSolar.put("Deimos",deimos);
        System.out.println("Deimos añadida a Marte: " + marte.addSatelite(deimos));
        //Phobos
        CuerpoCeleste phobos = new Luna("Phobos",0.3);
        sistemaSolar.put("Phobos",phobos);
        System.out.println("Phobos añadida a Marte: " + marte.addSatelite(phobos));
        //Io
        System.out.println("\n--Satelites de Jupiter--");
        CuerpoCeleste io = new Luna("Io",1.8);
        sistemaSolar.put("Io",io);
        System.out.println("Luna añadida a Jupiter: " + jupiter.addSatelite(io));
        //Europa
        CuerpoCeleste europa = new Luna("Europa",3.5);
        sistemaSolar.put("Europa",europa);
        System.out.println("Luna añadida a Jupiter: " + jupiter.addSatelite(europa));
        //Ganymede
        CuerpoCeleste ganymede = new Luna("Ganymede",7.1);
        sistemaSolar.put("Ganymede",ganymede);
        System.out.println("Luna añadida a Jupiter: " + jupiter.addSatelite(ganymede));
        //Calisto
        CuerpoCeleste calisto = new Luna("Calisto",16.7);
        sistemaSolar.put("Calisto",calisto);
        System.out.println("Luna añadida a Jupiter: " + jupiter.addSatelite(calisto));

        System.out.println("\n--Planetas--");
        for (CuerpoCeleste cc: planetas) {
            System.out.println(cc);
        }

        System.out.println("\n--Marte--");
        System.out.println(sistemaSolar.get("Marte"));
        System.out.println("\n--Lunas de Marte--");

        for (CuerpoCeleste lunasm: marte.getSatelites()) {
            System.out.println(lunasm);
        }

        System.out.println("\n--Union de todas las lunas--");
        for (CuerpoCeleste cc: planetas) {
            lunas.addAll(cc.getSatelites());
        }

        for (CuerpoCeleste unilunas: lunas) {
            System.out.println(unilunas);
        }

        System.out.println("\n--Nuevo Planeta Pluton 884--");
        CuerpoCeleste pluton884 = new Planeta("Pluton",884);
        sistemaSolar.put("Pluton",pluton884);
        planetas.add(pluton884);
        for (CuerpoCeleste cc: planetas) {
            System.out.println(cc);
        }
        System.out.println("No se ha agregado por el equals y el hashcode, ya que tienen el mismo nombre y son del mismo tipo.");
        System.out.println("\n--Pluton 884 como planeta enano--");
        pluton884 = new PlanetaEnano("Pluton",884);
        //planetas.add(pluton884);
        planetasena.add(pluton884);

        for (CuerpoCeleste cc: planetasena) {
            System.out.println(cc);
        }

        System.out.println("\n--Diferencia--");
        Set<CuerpoCeleste> dif = new HashSet<>(planetas);
        dif.removeAll(planetasena);
        for (CuerpoCeleste cc: dif) {
            System.out.println(cc);
        }
        System.out.println("Al hacer la diferencia entre el set planetas y el set de planetas enanos, se espera que se elimine de planetas, el cuerpo celeste Pluton 884, como no está, mostrará los planetas que habían sin eliminar nada.");

        System.out.println("\n--Intersección--");
        Set<CuerpoCeleste> inter = new HashSet<>(planetas);
        inter.retainAll(planetasena);
        for (CuerpoCeleste cc: inter) {
            System.out.println(cc);
        }
        System.out.println("Al hacer la inersección entre el set planetas y el set de planetas enanos, se espera que no salga ningún cuerpo celeste, porque no hay ningún cuerpo celeste igual.");
    }
}

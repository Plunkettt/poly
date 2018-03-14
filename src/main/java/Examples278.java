/**
 * @author Ja on 13/03/2018.
 * @project poly,
 */


enum Note {
    MIDDLE_C, C_SHARP, B_FLAT
}

class Instrument{
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() "+n);
    }
}

class Stringed extends Instrument{
    public void play(Note n) {
        System.out.println("Stringed.play() "+n);
    }
}

class Brass extends Instrument{
    public void play (Note n){
        System.out.println("Brass.play() "+n);
    }

}

class Music {
    public static void tune (Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
        Stringed violin = new Stringed();
        tune(violin);
    }
}


//Ex.1 pg.281


class Cycle{
    public void ride(){
        System.out.println("riding");
    }
}

class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("AAAA");
    }
}

class Bicycle extends Cycle{}

class Tricycle extends Cycle{}

class TheRide{
    public static void ride2(Cycle c){}

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        unicycle.ride();

        ride2(new Unicycle());
    }
}


public class Examples278 {
}

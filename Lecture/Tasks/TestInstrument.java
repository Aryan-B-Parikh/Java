abstract class Instrument {
    abstract void play();
    abstract String what();
    abstract void adjust();
}


class Wind extends Instrument {
    public void play() {
        System.out.println("Wind instrument played");
    }
    public String what() {
        return "Wind";
    }
    public void adjust() {
        System.out.println("Wind instrument tuned properly");
    }
}


class Percussion extends Instrument {
    public void play() {
        System.out.println("Percussion instrument played");
    }
    public String what() {
        return "Percussion";
    }
    public void adjust() {
        System.out.println("Percussion instrument tuned properly");
    }
}


class Stringed extends Instrument {
    public void play() {
        System.out.println("Stringed instrument played");
    }
    public String what() {
        return "Stringed";
    }
    public void adjust() {
        System.out.println("Stringed instrument tuned properly");
    }
}


class Woodwind extends Wind {
    public void play() {
        System.out.println("Woodwind instrument played");
    }
    public String what() {
        return "Woodwind";
    }
}


class Brass extends Wind {
    public void play() {
        System.out.println("Brass instrument played");
    }
    public String what() {
        return "Brass";
    }
}


public class TestInstrument {
    public static void main(String[] args) {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Woodwind(),
            new Brass()
        };

        for (Instrument i : orchestra) {
            i.play();
            System.out.println("Instrument name: " + i.what());
            i.adjust();
            System.out.println();
        }
    }
}

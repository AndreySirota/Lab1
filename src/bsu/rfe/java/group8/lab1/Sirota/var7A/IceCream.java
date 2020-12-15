package bsu.rfe.java.group8.lab1.Sirota.var7A;

public class IceCream extends Food {
    private String sirup;

    public IceCream (String sirup){ //конструктор
        super("IceCream");
        this.sirup = sirup;
    }
    @Override
    public void consume(){
        System.out.println(this + "с сиропом" + sirup + " съедено");
    }
    public String getSirup() {
        return sirup;
    }
    public void setSirup(String sirup) {
        this.sirup = sirup;
    }
    public boolean equals(Object arg0)
    {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return sirup.equals(((Apple)arg0).name); // Шаг 3
        } else
            return false;
    }
}

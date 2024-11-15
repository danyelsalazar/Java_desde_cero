package gestion;
public class Empleado {
    private int sector;
    private int legajo;
    private String apeNomb;
    private int antiguedad;
    
    public Empleado(int sector, int legajo, String apeNomb, int antiguedad) {
        this.sector = sector;
        this.legajo = legajo;
        this.apeNomb = apeNomb;
        this.antiguedad = antiguedad;
    }

    //geters:

    public int getSector() {
        return sector;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApeNomb() {
        return apeNomb;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    //hacemos su toString para mostrar la informacion
    @Override
    public String toString() {
        return "- Legajo: " + legajo + " Apellido y Nombre: " + apeNomb + " Antiguedad: "
                + antiguedad;
    }

    
    
}

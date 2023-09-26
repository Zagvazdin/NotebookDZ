import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {
    private String name;
    private int amountRAM;
    private String operatingSystem;
    private int hdd;
    public Notebook(String name, int amountRAM, String operatingSystem, int hdd) {
        this.name = name;
        this.amountRAM = amountRAM;
        this.operatingSystem = operatingSystem;
        this.hdd = hdd;
    }
    public boolean validateObject(){
        return true;
    }
    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRAM");
        list.add("operatingSystem");
        list.add("hdd");

        return list;

    }
    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "Опретивной памяти:" + amountRAM +
                ", Операционная система: " + operatingSystem + '\'' +
                ", Жесткий диск: " + hdd;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAmountRAM() {
        return amountRAM;
    }
    public void setAmountRAM(int amountRAM) {
        this.amountRAM = amountRAM;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public int getHdd() {
        return hdd;
    }
    public void setPrice(int hdd) {
        this.hdd = hdd;
    }
}

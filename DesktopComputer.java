public class DesktopComputer {
    
    // Nombre del procesador
    private String processorName;
    // Cantidad de RAM
    private int ramMemoryCapacity;
    // Tiene grafica dedicada?
    private boolean haveGraphicCard;
    
    /**
     * Crea la torre con los valores introducidos al crear el ordenador
     */
    public DesktopComputer(String cpuName, int amountOfRamMemory) {
        processorName = cpuName;
        ramMemoryCapacity = amountOfRamMemory;
        haveGraphicCard = true;
    }
    
    /**
     * Cambiar procesador
     */
    public void changeCpu(String newCpu) {
        processorName = newCpu;
    }
    
    /**
     * Cambiar RAM
     */
    public void addRam(int addRamAmount) {
        ramMemoryCapacity += addRamAmount;
    }
    
    /**
     * Quitar o poner grafica
     */
    public void quitOrPutGpu() {
        if (haveGraphicCard == true) {
            haveGraphicCard = false;
        }
        else {
            haveGraphicCard = true;
        }
    }
    
    /**
     * Que procesador tengo
     */
    public String getCpuName() {
        return processorName;
    }
    
    /**
     * Cuanta RAM tengo
     */
    public int getRamAmount() {
        return ramMemoryCapacity;
    }
    
    /**
     * Tengo grafica?
     */
    public boolean getGraphicCard() {
        return haveGraphicCard;
    }
    
    /**
     * Imprime los valores del pc
     */
    public void imprimirDetalles() {
       String graphicData;
       if (haveGraphicCard == true) {
            graphicData = "Sí";
       }
       else {
            graphicData = "No";
       }
       System.out.println("Modelo CPU: " + processorName + " | Cantidad de RAM: " + ramMemoryCapacity + "GB | Tiene gráfica?: " + graphicData);
    } 
    
    /**
     * Estado del objeto
     */
    public String computerStatus() {
        String graphicData;
        if (haveGraphicCard == true) {
            graphicData = "Sí";
        }
        else {
            graphicData = "No";
        }
        return "Modelo CPU: " + processorName + " | Cantidad de RAM: " + ramMemoryCapacity + "GB | Tiene gráfica?: " + graphicData;
    }
}
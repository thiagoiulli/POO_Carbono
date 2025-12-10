package model;

public abstract class ObjConstruidos implements GetPCarb{
    private double fatorEmissaoMateriais;

    public ObjConstruidos(double fatorEmissaoMateriais){
        this.fatorEmissaoMateriais = fatorEmissaoMateriais;
    }

    public double getPegadaDeCarbono(double quantidadeMateriais, double quantidadeEnergia, double distanciaTransporte){
        double total = (quantidadeMateriais * getFatorEmissaoMateriais()) + (quantidadeEnergia * fatorEmissaoEnergia) + (distanciaTransporte * fatorEmissaoTransporte);
        return total;
    }

    public double getFatorEmissaoMateriais(){
        return fatorEmissaoMateriais;
    }
}

package model;

public interface GetPCarb{
    double fatorEmissaoEnergia = 0.1;
    double fatorEmissaoTransporte = 0.25;
    double getPegadaDeCarbono(double quantidadeMateriais, double quantidadeEnergia, double distanciaTransporte);
}

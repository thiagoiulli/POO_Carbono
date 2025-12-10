package model;

import excepction.ImpossivelCalcularPegada;

public class Casa extends ObjConstruidos{
    private double fatorEmissaoResiduos;

    public Casa(){
        super(400);
        this.fatorEmissaoResiduos = 150;
    }

    public double getPegadaDeCarbono(double quantidadeMateriais, double quantidadeEnergia, double distanciaTransporte, double quantidadeResiduos) throws ImpossivelCalcularPegada {
        if (quantidadeMateriais == 0 || quantidadeEnergia == 0 || distanciaTransporte == 0 || quantidadeResiduos == 0){
            throw new ImpossivelCalcularPegada("valor não pode ser 0!");
        }
        double total = super.getPegadaDeCarbono(quantidadeMateriais*1000, quantidadeEnergia, distanciaTransporte) + (quantidadeResiduos * 1000 * this.fatorEmissaoResiduos);
        return total;
    }
}

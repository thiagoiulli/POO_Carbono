package model;

import excepction.ImpossivelCalcularPegada;

public class Carro extends ObjConstruidos{
    public Carro(){
        super(6);
    }

    @Override
    public double getPegadaDeCarbono(double quantidadeMateriais, double quantidadeEnergia, double distanciaTransporte) throws ImpossivelCalcularPegada {
        if (quantidadeMateriais == 0 || quantidadeEnergia == 0 || distanciaTransporte == 0){
            throw new ImpossivelCalcularPegada("valor não pode ser 0!");
        }
        double total = super.getPegadaDeCarbono(quantidadeMateriais, quantidadeEnergia, distanciaTransporte);
        return total;
    }
}

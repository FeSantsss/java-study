package com.felipysantsss.javastudy.introducao.POO.entities;

public class ProcesadorPedidoPix extends ProcessadorPedido{
    @Override
    public void notificar(){
        System.out.println("chegou o momento do pagamento da sua fatura!");
    }
    @Override
    public void cobrar(){
        System.out.println("vamos pagar ou não?");
    }
    @Override
    public void validar(){
        System.out.println("VOCÊ NÃO PAGOU!!! AGORA IREMOS TE TAXAR EM 1000% faz o L");
    }

}

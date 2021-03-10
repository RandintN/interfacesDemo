public class InterfaceDemostration {
  //Interfaces - O que é e quando utilizar

  /*
  Interfaces são conhecidas como contratos

  Uma empresa criou um contrato 'com regras' para definir a criação de um produto/servico

  O joão, decidiu implementar um produto/servico baseado nesse contrato.
  A Maria, também decidiu implementar um produto/servico baseado ne mesmo contrato

  Contrato para a confecção de um bolo
    - O bolo precisa ser de chocolate
    - O bolo deve ter cobertura
    - O bolo deve ser recheado
   */
  public static void main(String[] args) {
    final Ventilador ventilador = new Ventilador();
    ventilador.desligar();
    System.out.println("A marca do ventilador é " + ventilador.MARCA);
    ventilador.ligar();
  }
}

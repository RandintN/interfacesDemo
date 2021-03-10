/*
Uma interface pode ter constantes, ou metodos abstratos

  Interface para servir de contrato para produtos eletronicos.
  Todos produto eletronico que implementar esta interface OBRIGATORIAMENTE
  deverão implementar os métodos abstratos.
 */

public interface IEletronico {
  String MARCA = "Geek";

  void ligar();

  void desligar();
}

package Exercicio7;
public class Pessoa {

    private String nome;

    public Pessoa(String nome) { //*Quem é a pessoa */
        this.nome = nome;
    }

    public void acordar() { //* Mostra que a pessoa acordou */
        System.out.println(nome + " acordou!");
    }

    public void andar() { //* Mostra que a pessoa está andando */
        System.out.println(nome + " está andando.");
    }

    public void comer() { //* Mostra que a pessoa está comendo */
        System.out.println(nome + " está comendo.");
    }
    
    public void dormir() { //* Mostra que a pessoa está dormindo */
        System.out.println(nome + " está dormindo.");
    }
}

package br.ulbra.entity;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Numero {

    public ArrayList<Integer> numeros;

    public Numero() {
        numeros = new ArrayList();
    }

    public void salvar(int num) {
        numeros.add(num);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }

    public String listar() {
        String res = "";
        if (!numeros.isEmpty()) {
            for (int i = 0; i < numeros.size(); i++) {
                res += (i + 1) + "- " + numeros.get(i) + "\n";
            }
        } else {
            res = "Lista vazia.";
        }
        return res;
    }

    public void excluir(int indice) {
        if (!numeros.isEmpty()) {
            if (indice > 0 && indice <= numeros.size()) {
                numeros.remove(indice - 1);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Código não existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível excluir lista vazia.");
        }
    }

    public void alterar(int indice, int novoNum) {
        if (!numeros.isEmpty()) {
            if (indice > 0 && indice <= numeros.size()) {
                numeros.set(indice - 1, novoNum);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Código não existe.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível excluir lista vazia.");
        }
    }

    public void verificar(int indice) {
        if (!numeros.isEmpty()) {
            if (numeros.contains(indice))  {
                JOptionPane.showMessageDialog(null, "Este número está listado!");
            } else {
                JOptionPane.showMessageDialog(null, "Este número não está listado!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não há nada a ser verificado.");
        }
    }

    public void calculaMedia() {
        if (!numeros.isEmpty()) {
            double soma = 0;
            double media = 0;
            for (int i = 0; i < numeros.size(); i++) {
                soma += numeros.get(i);
            }
            media = soma / numeros.size();
            JOptionPane.showMessageDialog(null, "Média dos números listados: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Lista está vazia");
        }
    }

    public void maiorMenor() {

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        if (!numeros.isEmpty()) {
            for (int numero : numeros) {
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            JOptionPane.showMessageDialog(null, "Maior/Menor número listado: " + "\n- Maior: " + maior + "\n- Menor: " + menor);
        }
    }

    public String ordenar() {
        String res = "";
        if (!numeros.isEmpty()) {
            Collections.sort(numeros);
            for (int i = 0; i < numeros.size(); i++) {
                res += (i + 1) + "- " + numeros.get(i) + "\n";
            }
        } else {
            res = "Lista vazia!";
        }
        return res;
    }

}

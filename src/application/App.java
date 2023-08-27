package application;

import java.util.ArrayList;
import java.util.Collections;
import entities.Box;
import entities.BoxComparators.*;

public class App {
    public static void main(String[] args) throws Exception {
        var box = new ArrayList<Box>();

        box.add(new Box(004, "Andre", (short) 22));
        box.add(new Box(002, "Paulo", (short) 27));
        box.add(new Box(003, "Erick", (short) 20));
        box.add(new Box(005, "Clara", (short) 20));

        System.out.println("\nSem ordenação: ");
        for (Box element : box) {
            System.out.printf("Nome: %s | Idade: %d | Id: %d \n", element.getName(),element.getIdade(),element.getId());

        }

        System.out.println("\nOrdenação por nome: ");
        Collections.sort(box, new BoxComparatorName());

        for (Box element : box) {
            System.out.printf("Nome: %s | Idade: %d | Id: %d \n", element.getName(),element.getIdade(),element.getId());

        }

        System.out.println("\nOrdenação por Idade: ");
        Collections.sort(box, new BoxComparatorIdade());

        for (Box element : box) {
            System.out.printf("Nome: %s | Idade: %d | Id: %d\n", element.getName(),element.getIdade(),element.getId());

        }

        System.out.println("\nOrdenação por ID: ");
        Collections.sort(box, new BoxComparatorID());

        for (Box element : box) {
            System.out.printf("Nome: %s | Idade: %d | Id: %d \n", element.getName(),element.getIdade(),element.getId());
        }
    }
}

package views.category;

import views.MenuPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryPrincipal {

    private List<String> categories = new ArrayList<>();
    private final Scanner scan = new Scanner(System.in);

    public CategoryPrincipal() {
    }

    public void listAll() {
        System.out.println("----------------------------");
        System.out.println("Liste des catégories");
        System.out.println("0 - pour la création d'une catégorie");
        System.out.println("----------------------------");
        System.out.println("-----------------------------");

        for (int i = 0; i < getCategories().size(); i++) {
            System.out.println(i+1 + " - " + getCategories().get(i));
        }
        System.out.println("-----------------------------");


        System.out.println("Veillez choisir une catégorie");
        int choice = scan.nextInt();
        displayChoice(choice);

    }

    private void newCategory() {
        System.out.println("Veillez entrer le nom de la catégorie");
        String name = this.scan.next();
        categories.add(name);

        listAll();
    }

    public void displayChoice(int choice) {

        if (choice == 0) {
            newCategory();
            return;
        }

        int index = choice - 1;

        System.out.println("-----------------------------");
        System.out.println("Nom : " + getCategories().get(index));

        System.out.println("Navigation : ");
        System.out.println(" 1 - Pour le ménu principal ");
        System.out.println(" 2 - Pour le ménu des catégories ");
        System.out.println("-----------------------------");
        int menu = this.scan.nextInt();
        menu(menu);

    }

    public void menu(int option) {
        if (option == 1) {
            MenuPrincipal principal = new MenuPrincipal();
            principal.displayMenu();
        } else {
            listAll();
        }
    }

    public List<String> getCategories() {
        return categories;
    }
}

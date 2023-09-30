package views;

import views.category.CategoryPrincipal;

import java.util.Scanner;

public class MenuPrincipal {

    public MenuPrincipal() {
    }

    public void displayMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenu dans notre application");
        System.out.println("1 - pour la gestion des catégories");
        System.out.println("0 - pour quitter");
        System.out.println("-----------------------------");

        int choice = sc.nextInt();
        chooseMenu(choice);
        System.out.println("-----------------------------");
    }

    public void chooseMenu(int option) {
        if (option == 1) {
            CategoryPrincipal categoryPrincipal = new CategoryPrincipal();
            categoryPrincipal.listAll();
            return;
        }

        System.exit(0);
    }
}

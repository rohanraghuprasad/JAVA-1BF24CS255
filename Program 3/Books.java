import java.util.Scanner;

class Books {
    String name, author;
    int price, numPages;  

   
    Books(String n, String a, int p, int numPages) {
        this.name = n;
        this.author = a;
        this.price = p;
        this.numPages = numPages;
    }

    public String toString() {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }

    public static void main(String args[]) {
        int n;
        String name, author;
        int price, numPages;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter no of books: ");
        n = sc.nextInt();
        sc.nextLine();  
        Books b[] = new Books[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of book: ");
            name = sc.nextLine();

            System.out.println("Enter name of author: ");
            author = sc.nextLine();

            System.out.println("Enter price: ");
            price = sc.nextInt();

            System.out.println("Enter number of pages: ");
            numPages = sc.nextInt();

            sc.nextLine();  

            b[i] = new Books(name, author, price, numPages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Details for book " + (i + 1) + ": ");
            System.out.println(b[i]);
        }

    
    }
}

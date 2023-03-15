public class Reader {
    private String fullName;
    private int readerId;
    private String faculty;
    private String born;
    private String phone;

    public Reader(String fullName, int readerId, String faculty, String born, String phone) {
        this.fullName = fullName;
        this.readerId = readerId;
        this.faculty = faculty;
        this.born = born;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }
}

class main {

    public static void main(String[] args) {
        Author migelServantes = new Author( "Migel", "Servantes");
        Author sergeiLukianenko = new Author("Sergei", "Lukianenko");
        Book donQuixote = new Book("Дон Кихот",migelServantes,1957);
        Book metronomikone = new Book("Метрономикон", sergeiLukianenko, 2021);

        System.out.println("Книга:" + metronomikone.getTitle() + " Автор:" + metronomikone.getAuthor().getFullName() + " Год выхода: " + metronomikone.getPublicationYear());
        System.out.println("Книга:" + donQuixote.getTitle() + " Автор:" + donQuixote.getAuthor().getFullName() + " Год выхода: " + donQuixote.getPublicationYear());


    }


}
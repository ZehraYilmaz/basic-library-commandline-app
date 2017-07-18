
    public class Book {
        private String bookName;
        private String authorName;
        private String ISBN;
        private int numPages;
        private int pubYear;
        private String[] keyWords=new String[5];

        public Book(String bookName, String authorName, String ISBN, int numPages, int pubYear, String[]  keyWords){
            setbookName(bookName);
            setauthorName(authorName);
            setISBN(ISBN);
            setnumPages(numPages);
            setpubYear(pubYear);
            setkeyWords(keyWords);
        }

        public void setbookName(String bookName ){
            if(bookName.length()<3){
                System.out.println("error");
                System.exit(0);
            }
            this.bookName=bookName;
        }


        public void setauthorName(String authorName ){
            if(authorName.length()<3){
                System.out.println("error");
                System.exit(0);
            }
            this.authorName=authorName;
        }


        public void setISBN(String ISBN ){
            if(ISBN.length() != 13){
                System.out.println("error");
                System.exit(0);
            }
            this.ISBN=ISBN;
        }


        public void setnumPages(int numPages ){
            if(numPages<1){
                System.out.println("error");
                System.exit(0);
            }
            this.numPages=numPages;
        }

        public void setpubYear(int pubYear ){
            if(pubYear<=1923 || pubYear>=2016){
                System.out.println("error : wrong publishing yearüdş,");
                System.exit(0);
            }
            this.pubYear=pubYear;
        }


        public void setkeyWords(String[] keyWords ){

            if(keyWords.length < 3 || keyWords.length > 5){
                System.out.println("error : many or less keywords");
                System.exit(0);

            }
            this.keyWords=keyWords;
        }

        public String getbookName(){
            return bookName;
        }
        public String getauthorName(){
            return authorName;
        }
        public String getISBN(){
            return ISBN;
        }
        public int getnumPages(){
            return numPages;
        }
        public int getpubYear(){
            return pubYear;
        }



        public boolean searchkeyWord(String aWord){
            for(int i=0; i<keyWords.length;i++){
                if(keyWords[i].equalsIgnoreCase(aWord));
                return true;

            }
            return false;

        }

        public void displayBook( ){

            System.out.println(bookName + ", " + authorName + "," +
                    ISBN + ","+numPages + "," + pubYear + ","+ keyWords + ".");
        }

    }


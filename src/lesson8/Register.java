package lesson8;

public class Register {
    Document[] documents = new Document[5];

    protected void save(Document document){
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null){
                documents[i] = document;
                break;
            }
        }
    }
    void info(int i){
        documents[i].docInfo();
    }

}

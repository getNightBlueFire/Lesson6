package lesson8;

public class Invoice extends Document {
    private int result;
    private int code;

    public int getCode(){
        return code;
    }

    public void setResult(int result){
        this.result = result;
    }


    public Invoice(String numDoc, int result, int code) {
        super(numDoc);
        this.result = result;
        this.code = code;
    }

    @Override
    protected void docInfo() {
        System.out.println("This number of document " + this.numDoc);
        System.out.println("This date " + this.date);
        System.out.println("This result " + this.result);
        System.out.println("This department code " + this.code);
    }
}

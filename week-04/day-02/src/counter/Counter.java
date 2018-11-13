package counter;

public class Counter {
    int field;
    private int startField;

    public Counter(){
        this(0);
        this.startField = 0;
    }

    public Counter(int field){
        this.field = field;
        this.startField = field;
    }

    public int add(int number){
        return this.field += number;
    }
    public int add(){
        return ++this.field;
    }
    public int  get(){
        return this.field;
    }
    public int reset(){
        return this.field = startField;
    }
}

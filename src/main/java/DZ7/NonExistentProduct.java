package DZ7;

public class NonExistentProduct extends Exception{

    static int count = 0;
    String name;

    public NonExistentProduct(String name){
        count++;
        this.name = name;
    }

    @Override
    public String toString(){
        String text="Возникла ошибка!\n";
        text+="Описание: "+name+"\n";
        text+="Номер ошибки: "+count;
        return text;}
}
